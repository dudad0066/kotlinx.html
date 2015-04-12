package html4k.consumers

import html4k.Entities
import html4k.Tag
import html4k.TagConsumer
import java.util.HashSet

object PredicateResults {
    val PASS = PredicateResult.PASS
    val SKIP = PredicateResult.SKIP
    val DROP = PredicateResult.DROP
}

enum class PredicateResult {
    PASS
    SKIP
    DROP
}

private class FilterTagConsumer<T>(val downstream : TagConsumer<T>, val predicate : (Tag) -> PredicateResult) : TagConsumer<T> {
    private var currentLevel = 0
    private var skippedLevels = HashSet<Int>()
    private var dropLevel : Int? = null

    override fun onTagStart(tag: Tag) {
        currentLevel++

        if (dropLevel == null) {
            when (predicate(tag)) {
                PredicateResult.PASS -> downstream.onTagStart(tag)
                PredicateResult.SKIP -> skippedLevels.add(currentLevel)
                PredicateResult.DROP -> dropLevel = currentLevel
            }
        }
    }

    override fun onTagAttributeChange(tag: Tag, attribute: String, value: String) {
        throw UnsupportedOperationException("this filter doesn't support attribute change")
    }

    override fun onTagEnd(tag: Tag) {
        if (canPassCurrentLevel()) {
            downstream.onTagEnd(tag)
        }

        skippedLevels.remove(currentLevel)
        if (dropLevel == currentLevel) {
            dropLevel = null
        }

        currentLevel--
    }

    override fun onTagContent(content: CharSequence) {
        if (canPassCurrentLevel()) {
            downstream.onTagContent(content)
        }
    }

    override fun onTagContentEntity(entity: Entities) {
        if (canPassCurrentLevel()) {
            downstream.onTagContentEntity(entity)
        }
    }

    private fun canPassCurrentLevel() = dropLevel == null && currentLevel !in skippedLevels

    override fun finalize(): T = downstream.finalize()
}

fun <T> TagConsumer<T>.filter(predicate : PredicateResults.(Tag) -> PredicateResult) : TagConsumer<T> = FilterTagConsumer(this) { PredicateResults.predicate(it) }.delayed()