package html4k.js

import html4k.*
import kotlin.js.dom.html.*
import kotlin.js.dom.html5.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public fun TagConsumer<HTMLElement>.a(href : String? = null, target : String? = null, block : A.() -> Unit) : HTMLAnchorElement = build(listOf("href" to href,"target" to target).toAttributesMap(), ::buildA, block).finalize() as HTMLAnchorElement

public fun TagConsumer<HTMLElement>.abbr(block : ABBR.() -> Unit) : HTMLElement = build(emptyMap(), ::buildABBR, block).finalize()

public fun TagConsumer<HTMLElement>.address(block : ADDRESS.() -> Unit) : HTMLElement = build(emptyMap(), ::buildADDRESS, block).finalize()

public fun TagConsumer<HTMLElement>.area(alt : String? = null, content : String = "") : HTMLAreaElement = build(listOf("alt" to alt).toAttributesMap(), ::buildAREA, {+content}).finalize() as HTMLAreaElement
public fun TagConsumer<HTMLElement>.area(alt : String? = null, block : AREA.() -> Unit) : HTMLAreaElement = build(listOf("alt" to alt).toAttributesMap(), ::buildAREA, block).finalize() as HTMLAreaElement

public fun TagConsumer<HTMLElement>.article(block : ARTICLE.() -> Unit) : HTMLElement = build(emptyMap(), ::buildARTICLE, block).finalize()

public fun TagConsumer<HTMLElement>.aside(block : ASIDE.() -> Unit) : HTMLElement = build(emptyMap(), ::buildASIDE, block).finalize()

public fun TagConsumer<HTMLElement>.audio(block : AUDIO.() -> Unit) : HTMLElement = build(emptyMap(), ::buildAUDIO, block).finalize()

public fun TagConsumer<HTMLElement>.b(block : B.() -> Unit) : HTMLElement = build(emptyMap(), ::buildB, block).finalize()

public fun TagConsumer<HTMLElement>.base(content : String = "") : HTMLBaseElement = build(emptyMap(), ::buildBASE, {+content}).finalize() as HTMLBaseElement
public fun TagConsumer<HTMLElement>.base(block : BASE.() -> Unit) : HTMLBaseElement = build(emptyMap(), ::buildBASE, block).finalize() as HTMLBaseElement

public fun TagConsumer<HTMLElement>.bdi(block : BDI.() -> Unit) : HTMLElement = build(emptyMap(), ::buildBDI, block).finalize()

public fun TagConsumer<HTMLElement>.bdo(block : BDO.() -> Unit) : HTMLElement = build(emptyMap(), ::buildBDO, block).finalize()

public fun TagConsumer<HTMLElement>.blockQuote(block : BLOCKQUOTE.() -> Unit) : HTMLElement = build(emptyMap(), ::buildBLOCKQUOTE, block).finalize()

public fun TagConsumer<HTMLElement>.body(block : BODY.() -> Unit) : HTMLBodyElement = build(emptyMap(), ::buildBODY, block).finalize() as HTMLBodyElement

public fun TagConsumer<HTMLElement>.br(content : String = "") : HTMLBRElement = build(emptyMap(), ::buildBR, {+content}).finalize() as HTMLBRElement
public fun TagConsumer<HTMLElement>.br(block : BR.() -> Unit) : HTMLBRElement = build(emptyMap(), ::buildBR, block).finalize() as HTMLBRElement

public fun TagConsumer<HTMLElement>.button(block : BUTTON.() -> Unit) : HTMLButtonElement = build(emptyMap(), ::buildBUTTON, block).finalize() as HTMLButtonElement

public fun TagConsumer<HTMLElement>.canvas(content : String = "") : HTMLCanvasElement = build(emptyMap(), ::buildCANVAS, {+content}).finalize() as HTMLCanvasElement
public fun TagConsumer<HTMLElement>.canvas(block : CANVAS.() -> Unit) : HTMLCanvasElement = build(emptyMap(), ::buildCANVAS, block).finalize() as HTMLCanvasElement

public fun TagConsumer<HTMLElement>.caption(block : CAPTION.() -> Unit) : HTMLElement = build(emptyMap(), ::buildCAPTION, block).finalize()

public fun TagConsumer<HTMLElement>.cite(block : CITE.() -> Unit) : HTMLElement = build(emptyMap(), ::buildCITE, block).finalize()

public fun TagConsumer<HTMLElement>.code(block : CODE.() -> Unit) : HTMLElement = build(emptyMap(), ::buildCODE, block).finalize()

public fun TagConsumer<HTMLElement>.col(content : String = "") : HTMLElement = build(emptyMap(), ::buildCOL, {+content}).finalize()
public fun TagConsumer<HTMLElement>.col(block : COL.() -> Unit) : HTMLElement = build(emptyMap(), ::buildCOL, block).finalize()

public fun TagConsumer<HTMLElement>.colGroup(block : COLGROUP.() -> Unit) : HTMLElement = build(emptyMap(), ::buildCOLGROUP, block).finalize()

public fun TagConsumer<HTMLElement>.command(content : String = "") : HTMLElement = build(emptyMap(), ::buildCOMMAND, {+content}).finalize()
public fun TagConsumer<HTMLElement>.command(block : COMMAND.() -> Unit) : HTMLElement = build(emptyMap(), ::buildCOMMAND, block).finalize()

public fun TagConsumer<HTMLElement>.dataList(block : DATALIST.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDATALIST, block).finalize()

public fun TagConsumer<HTMLElement>.dd(block : DD.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDD, block).finalize()

public fun TagConsumer<HTMLElement>.del(block : DEL.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDEL, block).finalize()

public fun TagConsumer<HTMLElement>.details(block : DETAILS.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDETAILS, block).finalize()

public fun TagConsumer<HTMLElement>.dfn(block : DFN.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDFN, block).finalize()

public fun TagConsumer<HTMLElement>.dialog(block : DIALOG.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDIALOG, block).finalize()

public fun TagConsumer<HTMLElement>.div(classes : Set<String>? = null, block : DIV.() -> Unit) : HTMLDivElement = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDIV, block).finalize() as HTMLDivElement

public fun TagConsumer<HTMLElement>.dl(block : DL.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDL, block).finalize()

public fun TagConsumer<HTMLElement>.dt(block : DT.() -> Unit) : HTMLElement = build(emptyMap(), ::buildDT, block).finalize()

public fun TagConsumer<HTMLElement>.em(block : EM.() -> Unit) : HTMLElement = build(emptyMap(), ::buildEM, block).finalize()

public fun TagConsumer<HTMLElement>.embed(content : String = "") : HTMLElement = build(emptyMap(), ::buildEMBED, {+content}).finalize()
public fun TagConsumer<HTMLElement>.embed(block : EMBED.() -> Unit) : HTMLElement = build(emptyMap(), ::buildEMBED, block).finalize()

public fun TagConsumer<HTMLElement>.fieldSet(block : FIELDSET.() -> Unit) : HTMLFieldSetElement = build(emptyMap(), ::buildFIELDSET, block).finalize() as HTMLFieldSetElement

public fun TagConsumer<HTMLElement>.figure(block : FIGURE.() -> Unit) : HTMLElement = build(emptyMap(), ::buildFIGURE, block).finalize()

public fun TagConsumer<HTMLElement>.footer(block : FOOTER.() -> Unit) : HTMLElement = build(emptyMap(), ::buildFOOTER, block).finalize()

public fun TagConsumer<HTMLElement>.form(action : String? = null, block : FORM.() -> Unit) : HTMLFormElement = build(listOf("action" to action).toAttributesMap(), ::buildFORM, block).finalize() as HTMLFormElement

public fun TagConsumer<HTMLElement>.h1(block : H1.() -> Unit) : HTMLHeadingElement = build(emptyMap(), ::buildH1, block).finalize() as HTMLHeadingElement

public fun TagConsumer<HTMLElement>.h2(block : H2.() -> Unit) : HTMLHeadingElement = build(emptyMap(), ::buildH2, block).finalize() as HTMLHeadingElement

public fun TagConsumer<HTMLElement>.h3(block : H3.() -> Unit) : HTMLHeadingElement = build(emptyMap(), ::buildH3, block).finalize() as HTMLHeadingElement

public fun TagConsumer<HTMLElement>.h4(block : H4.() -> Unit) : HTMLHeadingElement = build(emptyMap(), ::buildH4, block).finalize() as HTMLHeadingElement

public fun TagConsumer<HTMLElement>.h5(block : H5.() -> Unit) : HTMLHeadingElement = build(emptyMap(), ::buildH5, block).finalize() as HTMLHeadingElement

public fun TagConsumer<HTMLElement>.h6(block : H6.() -> Unit) : HTMLHeadingElement = build(emptyMap(), ::buildH6, block).finalize() as HTMLHeadingElement

public fun TagConsumer<HTMLElement>.head(block : HEAD.() -> Unit) : HTMLHeadElement = build(emptyMap(), ::buildHEAD, block).finalize() as HTMLHeadElement

public fun TagConsumer<HTMLElement>.header(block : HEADER.() -> Unit) : HTMLElement = build(emptyMap(), ::buildHEADER, block).finalize()

public fun TagConsumer<HTMLElement>.hGroup(block : HGROUP.() -> Unit) : HTMLElement = build(emptyMap(), ::buildHGROUP, block).finalize()

public fun TagConsumer<HTMLElement>.hr(content : String = "") : HTMLHRElement = build(emptyMap(), ::buildHR, {+content}).finalize() as HTMLHRElement
public fun TagConsumer<HTMLElement>.hr(block : HR.() -> Unit) : HTMLHRElement = build(emptyMap(), ::buildHR, block).finalize() as HTMLHRElement

public fun TagConsumer<HTMLElement>.html(block : HTML.() -> Unit) : HTMLHtmlElement = build(emptyMap(), ::buildHTML, block).finalize() as HTMLHtmlElement

public fun TagConsumer<HTMLElement>.i(block : I.() -> Unit) : HTMLElement = build(emptyMap(), ::buildI, block).finalize()

public fun TagConsumer<HTMLElement>.iframe(content : String = "") : HTMLElement = build(emptyMap(), ::buildIFRAME, {+content}).finalize()
public fun TagConsumer<HTMLElement>.iframe(block : IFRAME.() -> Unit) : HTMLElement = build(emptyMap(), ::buildIFRAME, block).finalize()

public fun TagConsumer<HTMLElement>.img(alt : String? = null, src : String? = null, content : String = "") : HTMLImageElement = build(listOf("alt" to alt,"src" to src).toAttributesMap(), ::buildIMG, {+content}).finalize() as HTMLImageElement
public fun TagConsumer<HTMLElement>.img(alt : String? = null, src : String? = null, block : IMG.() -> Unit) : HTMLImageElement = build(listOf("alt" to alt,"src" to src).toAttributesMap(), ::buildIMG, block).finalize() as HTMLImageElement

public fun TagConsumer<HTMLElement>.input(type : InputType? = null, name : String? = null, content : String = "") : HTMLInputElement = build(listOf("type" to type?.enumEncode(),"name" to name).toAttributesMap(), ::buildINPUT, {+content}).finalize() as HTMLInputElement
public fun TagConsumer<HTMLElement>.input(type : InputType? = null, name : String? = null, block : INPUT.() -> Unit) : HTMLInputElement = build(listOf("type" to type?.enumEncode(),"name" to name).toAttributesMap(), ::buildINPUT, block).finalize() as HTMLInputElement

public fun TagConsumer<HTMLElement>.ins(block : INS.() -> Unit) : HTMLElement = build(emptyMap(), ::buildINS, block).finalize()

public fun TagConsumer<HTMLElement>.kbd(block : KBD.() -> Unit) : HTMLElement = build(emptyMap(), ::buildKBD, block).finalize()

public fun TagConsumer<HTMLElement>.keyGen(content : String = "") : HTMLElement = build(emptyMap(), ::buildKEYGEN, {+content}).finalize()
public fun TagConsumer<HTMLElement>.keyGen(block : KEYGEN.() -> Unit) : HTMLElement = build(emptyMap(), ::buildKEYGEN, block).finalize()

public fun TagConsumer<HTMLElement>.label(block : LABEL.() -> Unit) : HTMLLabelElement = build(emptyMap(), ::buildLABEL, block).finalize() as HTMLLabelElement

public fun TagConsumer<HTMLElement>.legEnd(block : LEGEND.() -> Unit) : HTMLElement = build(emptyMap(), ::buildLEGEND, block).finalize()

public fun TagConsumer<HTMLElement>.li(block : LI.() -> Unit) : HTMLLIElement = build(emptyMap(), ::buildLI, block).finalize() as HTMLLIElement

public fun TagConsumer<HTMLElement>.link(content : String = "") : HTMLLinkElement = build(emptyMap(), ::buildLINK, {+content}).finalize() as HTMLLinkElement
public fun TagConsumer<HTMLElement>.link(block : LINK.() -> Unit) : HTMLLinkElement = build(emptyMap(), ::buildLINK, block).finalize() as HTMLLinkElement

public fun TagConsumer<HTMLElement>.map(name : String? = null, block : MAP.() -> Unit) : HTMLMapElement = build(listOf("name" to name).toAttributesMap(), ::buildMAP, block).finalize() as HTMLMapElement

public fun TagConsumer<HTMLElement>.mark(block : MARK.() -> Unit) : HTMLElement = build(emptyMap(), ::buildMARK, block).finalize()

public fun TagConsumer<HTMLElement>.math(block : MATH.() -> Unit) : HTMLElement = build(emptyMap(), ::buildMATH, block).finalize()

public fun TagConsumer<HTMLElement>.mathml(content : String = "") : HTMLElement = build(emptyMap(), ::buildMATHML, {+content}).finalize()
public fun TagConsumer<HTMLElement>.mathml(block : MATHML.() -> Unit) : HTMLElement = build(emptyMap(), ::buildMATHML, block).finalize()

public fun TagConsumer<HTMLElement>.menu(block : MENU.() -> Unit) : HTMLMenuElement = build(emptyMap(), ::buildMENU, block).finalize() as HTMLMenuElement

public fun TagConsumer<HTMLElement>.meta(content : String = "") : HTMLMetaElement = build(emptyMap(), ::buildMETA, {+content}).finalize() as HTMLMetaElement
public fun TagConsumer<HTMLElement>.meta(block : META.() -> Unit) : HTMLMetaElement = build(emptyMap(), ::buildMETA, block).finalize() as HTMLMetaElement

public fun TagConsumer<HTMLElement>.meter(block : METER.() -> Unit) : HTMLElement = build(emptyMap(), ::buildMETER, block).finalize()

public fun TagConsumer<HTMLElement>.nav(block : NAV.() -> Unit) : HTMLElement = build(emptyMap(), ::buildNAV, block).finalize()

public fun TagConsumer<HTMLElement>.noScript(block : NOSCRIPT.() -> Unit) : HTMLElement = build(emptyMap(), ::buildNOSCRIPT, block).finalize()

public fun TagConsumer<HTMLElement>.object_(block : OBJECT_.() -> Unit) : HTMLElement = build(emptyMap(), ::buildOBJECT_, block).finalize()

public fun TagConsumer<HTMLElement>.ol(block : OL.() -> Unit) : HTMLElement = build(emptyMap(), ::buildOL, block).finalize()

public fun TagConsumer<HTMLElement>.optGroup(label : String? = null, block : OPTGROUP.() -> Unit) : HTMLOptGroupElement = build(listOf("label" to label).toAttributesMap(), ::buildOPTGROUP, block).finalize() as HTMLOptGroupElement

public fun TagConsumer<HTMLElement>.option(content : String = "") : HTMLOptionElement = build(emptyMap(), ::buildOPTION, {+content}).finalize() as HTMLOptionElement
public fun TagConsumer<HTMLElement>.option(block : OPTION.() -> Unit) : HTMLOptionElement = build(emptyMap(), ::buildOPTION, block).finalize() as HTMLOptionElement

public fun TagConsumer<HTMLElement>.output(block : OUTPUT.() -> Unit) : HTMLElement = build(emptyMap(), ::buildOUTPUT, block).finalize()

public fun TagConsumer<HTMLElement>.p(block : P.() -> Unit) : HTMLParagraphElement = build(emptyMap(), ::buildP, block).finalize() as HTMLParagraphElement

public fun TagConsumer<HTMLElement>.param(name : String? = null, value : String? = null, content : String = "") : HTMLParamElement = build(listOf("name" to name,"value" to value).toAttributesMap(), ::buildPARAM, {+content}).finalize() as HTMLParamElement
public fun TagConsumer<HTMLElement>.param(name : String? = null, value : String? = null, block : PARAM.() -> Unit) : HTMLParamElement = build(listOf("name" to name,"value" to value).toAttributesMap(), ::buildPARAM, block).finalize() as HTMLParamElement

public fun TagConsumer<HTMLElement>.pre(block : PRE.() -> Unit) : HTMLPreElement = build(emptyMap(), ::buildPRE, block).finalize() as HTMLPreElement

public fun TagConsumer<HTMLElement>.progress(block : PROGRESS.() -> Unit) : HTMLElement = build(emptyMap(), ::buildPROGRESS, block).finalize()

public fun TagConsumer<HTMLElement>.q(block : Q.() -> Unit) : HTMLElement = build(emptyMap(), ::buildQ, block).finalize()

public fun TagConsumer<HTMLElement>.rp(block : RP.() -> Unit) : HTMLElement = build(emptyMap(), ::buildRP, block).finalize()

public fun TagConsumer<HTMLElement>.rt(block : RT.() -> Unit) : HTMLElement = build(emptyMap(), ::buildRT, block).finalize()

public fun TagConsumer<HTMLElement>.ruby(block : RUBY.() -> Unit) : HTMLElement = build(emptyMap(), ::buildRUBY, block).finalize()

public fun TagConsumer<HTMLElement>.samp(block : SAMP.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSAMP, block).finalize()

public fun TagConsumer<HTMLElement>.script(type : ScriptType? = null, src : String? = null, content : String = "") : HTMLScriptElement = build(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), ::buildSCRIPT, {+content}).finalize() as HTMLScriptElement
public fun TagConsumer<HTMLElement>.script(type : ScriptType? = null, src : String? = null, block : SCRIPT.() -> Unit) : HTMLScriptElement = build(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), ::buildSCRIPT, block).finalize() as HTMLScriptElement

public fun TagConsumer<HTMLElement>.section(block : SECTION.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSECTION, block).finalize()

public fun TagConsumer<HTMLElement>.select(block : SELECT.() -> Unit) : HTMLSelectElement = build(emptyMap(), ::buildSELECT, block).finalize() as HTMLSelectElement

public fun TagConsumer<HTMLElement>.small(block : SMALL.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSMALL, block).finalize()

public fun TagConsumer<HTMLElement>.source(content : String = "") : HTMLElement = build(emptyMap(), ::buildSOURCE, {+content}).finalize()
public fun TagConsumer<HTMLElement>.source(block : SOURCE.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSOURCE, block).finalize()

public fun TagConsumer<HTMLElement>.span(block : SPAN.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSPAN, block).finalize()

public fun TagConsumer<HTMLElement>.strong(block : STRONG.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSTRONG, block).finalize()

public fun TagConsumer<HTMLElement>.style(content : String = "") : HTMLStyleElement = build(emptyMap(), ::buildSTYLE, {+content}).finalize() as HTMLStyleElement
public fun TagConsumer<HTMLElement>.style(block : STYLE.() -> Unit) : HTMLStyleElement = build(emptyMap(), ::buildSTYLE, block).finalize() as HTMLStyleElement

public fun TagConsumer<HTMLElement>.sub(block : SUB.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSUB, block).finalize()

public fun TagConsumer<HTMLElement>.sup(block : SUP.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSUP, block).finalize()

public fun TagConsumer<HTMLElement>.svg(content : String = "") : HTMLElement = build(emptyMap(), ::buildSVG, {+content}).finalize()
public fun TagConsumer<HTMLElement>.svg(block : SVG.() -> Unit) : HTMLElement = build(emptyMap(), ::buildSVG, block).finalize()

public fun TagConsumer<HTMLElement>.table(block : TABLE.() -> Unit) : HTMLTableElement = build(emptyMap(), ::buildTABLE, block).finalize() as HTMLTableElement

public fun TagConsumer<HTMLElement>.tbody(block : TBODY.() -> Unit) : HTMLElement = build(emptyMap(), ::buildTBODY, block).finalize()

public fun TagConsumer<HTMLElement>.td(block : TD.() -> Unit) : HTMLTableCellElement = build(emptyMap(), ::buildTD, block).finalize() as HTMLTableCellElement

public fun TagConsumer<HTMLElement>.textArea(rows : String? = null, cols : String? = null, content : String = "") : HTMLTextAreaElement = build(listOf("rows" to rows,"cols" to cols).toAttributesMap(), ::buildTEXTAREA, {+content}).finalize() as HTMLTextAreaElement
public fun TagConsumer<HTMLElement>.textArea(rows : String? = null, cols : String? = null, block : TEXTAREA.() -> Unit) : HTMLTextAreaElement = build(listOf("rows" to rows,"cols" to cols).toAttributesMap(), ::buildTEXTAREA, block).finalize() as HTMLTextAreaElement

public fun TagConsumer<HTMLElement>.tfoot(block : TFOOT.() -> Unit) : HTMLElement = build(emptyMap(), ::buildTFOOT, block).finalize()

public fun TagConsumer<HTMLElement>.th(block : TH.() -> Unit) : HTMLTableColElement = build(emptyMap(), ::buildTH, block).finalize() as HTMLTableColElement

public fun TagConsumer<HTMLElement>.thead(block : THEAD.() -> Unit) : HTMLElement = build(emptyMap(), ::buildTHEAD, block).finalize()

public fun TagConsumer<HTMLElement>.time(block : TIME.() -> Unit) : HTMLElement = build(emptyMap(), ::buildTIME, block).finalize()

public fun TagConsumer<HTMLElement>.title(content : String = "") : HTMLTitleElement = build(emptyMap(), ::buildTITLE, {+content}).finalize() as HTMLTitleElement
public fun TagConsumer<HTMLElement>.title(block : TITLE.() -> Unit) : HTMLTitleElement = build(emptyMap(), ::buildTITLE, block).finalize() as HTMLTitleElement

public fun TagConsumer<HTMLElement>.tr(block : TR.() -> Unit) : HTMLTableRowElement = build(emptyMap(), ::buildTR, block).finalize() as HTMLTableRowElement

public fun TagConsumer<HTMLElement>.ul(block : UL.() -> Unit) : HTMLElement = build(emptyMap(), ::buildUL, block).finalize()

public fun TagConsumer<HTMLElement>.var_(block : VAR_.() -> Unit) : HTMLElement = build(emptyMap(), ::buildVAR_, block).finalize()

public fun TagConsumer<HTMLElement>.video(block : VIDEO.() -> Unit) : HTMLElement = build(emptyMap(), ::buildVIDEO, block).finalize()

