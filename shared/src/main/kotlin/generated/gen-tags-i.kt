package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class I(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("i", consumer, initialAttributes), CoreAttributeGroupFacade, CommonEventsGroupFacade, CoreServerAttributeGroupFacade {

}

public class IFRAME(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("iframe", consumer, initialAttributes), CoreAttributeGroupFacade, CommonEventsGroupFacade, CoreServerAttributeGroupFacade {
    var name : String
        get()  = attributeString_b06e5555.get(this, "name")
        set(newValue) {attributeString_b06e5555.set(this, "name", newValue)}

    var src : String
        get()  = attributeString_4c4f42e4.get(this, "src")
        set(newValue) {attributeString_4c4f42e4.set(this, "src", newValue)}

    var height : String
        get()  = attributeString_4c4f42e4.get(this, "height")
        set(newValue) {attributeString_4c4f42e4.set(this, "height", newValue)}

    var width : String
        get()  = attributeString_4c4f42e4.get(this, "width")
        set(newValue) {attributeString_4c4f42e4.set(this, "width", newValue)}

    var sandbox : IframeSandbox
        get()  = attributeIframeSandboxIframeSandboxValues_3f1a0d5f.get(this, "sandbox")
        set(newValue) {attributeIframeSandboxIframeSandboxValues_3f1a0d5f.set(this, "sandbox", newValue)}

    var seamless : Boolean
        get()  = attributeBoolean_13527a93.get(this, "seamless")
        set(newValue) {attributeBoolean_13527a93.set(this, "seamless", newValue)}


}

public class IMG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("img", consumer, initialAttributes), CoreAttributeGroupFacade, CommonEventsGroupFacade, CoreServerAttributeGroupFacade {
    var alt : String
        get()  = attributeString_4c4f42e4.get(this, "alt")
        set(newValue) {attributeString_4c4f42e4.set(this, "alt", newValue)}

    var src : String
        get()  = attributeString_4c4f42e4.get(this, "src")
        set(newValue) {attributeString_4c4f42e4.set(this, "src", newValue)}

    var height : String
        get()  = attributeString_4c4f42e4.get(this, "height")
        set(newValue) {attributeString_4c4f42e4.set(this, "height", newValue)}

    var width : String
        get()  = attributeString_4c4f42e4.get(this, "width")
        set(newValue) {attributeString_4c4f42e4.set(this, "width", newValue)}

    var usemap : String
        get()  = attributeString_4c4f42e4.get(this, "usemap")
        set(newValue) {attributeString_4c4f42e4.set(this, "usemap", newValue)}

    var ismap : Boolean
        get()  = attributeBoolean_13527a93.get(this, "ismap")
        set(newValue) {attributeBoolean_13527a93.set(this, "ismap", newValue)}


}

public class INPUT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("input", consumer, initialAttributes), CoreAttributeGroupFacade, CommonEventsGroupFacade, CoreServerAttributeGroupFacade {
    var type : InputType
        get()  = attributeInputTypeInputTypeValues_dfbd34bf.get(this, "type")
        set(newValue) {attributeInputTypeInputTypeValues_dfbd34bf.set(this, "type", newValue)}

    var accept : String
        get()  = attributeString_4c4f42e4.get(this, "accept")
        set(newValue) {attributeString_4c4f42e4.set(this, "accept", newValue)}

    var alt : String
        get()  = attributeString_4c4f42e4.get(this, "alt")
        set(newValue) {attributeString_4c4f42e4.set(this, "alt", newValue)}

    var autoComplete : Boolean
        get()  = attributeBooleanOnOff_af2785a9.get(this, "autocomplete")
        set(newValue) {attributeBooleanOnOff_af2785a9.set(this, "autocomplete", newValue)}

    var checked : Boolean
        get()  = attributeBoolean_13527a93.get(this, "checked")
        set(newValue) {attributeBoolean_13527a93.set(this, "checked", newValue)}

    var disabled : Boolean
        get()  = attributeBoolean_13527a93.get(this, "disabled")
        set(newValue) {attributeBoolean_13527a93.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeString_4c4f42e4.get(this, "form")
        set(newValue) {attributeString_4c4f42e4.set(this, "form", newValue)}

    var formAction : String
        get()  = attributeString_4c4f42e4.get(this, "formaction")
        set(newValue) {attributeString_4c4f42e4.set(this, "formaction", newValue)}

    var formEncType : InputFormEncType
        get()  = attributeInputFormEncTypeInputFormEncTypeValues_96879f3f.get(this, "formenctype")
        set(newValue) {attributeInputFormEncTypeInputFormEncTypeValues_96879f3f.set(this, "formenctype", newValue)}

    var formMethod : InputFormMethod
        get()  = attributeInputFormMethodInputFormMethodValues_912c29df.get(this, "formmethod")
        set(newValue) {attributeInputFormMethodInputFormMethodValues_912c29df.set(this, "formmethod", newValue)}

    var formNovalidate : Boolean
        get()  = attributeBoolean_13527a93.get(this, "formnovalidate")
        set(newValue) {attributeBoolean_13527a93.set(this, "formnovalidate", newValue)}

    var formTarget : String
        get()  = attributeString_75db1c05.get(this, "formtarget")
        set(newValue) {attributeString_75db1c05.set(this, "formtarget", newValue)}

    var height : String
        get()  = attributeString_4c4f42e4.get(this, "height")
        set(newValue) {attributeString_4c4f42e4.set(this, "height", newValue)}

    var list : String
        get()  = attributeString_4c4f42e4.get(this, "list")
        set(newValue) {attributeString_4c4f42e4.set(this, "list", newValue)}

    var max : String
        get()  = attributeString_4c4f42e4.get(this, "max")
        set(newValue) {attributeString_4c4f42e4.set(this, "max", newValue)}

    var maxLength : String
        get()  = attributeString_4c4f42e4.get(this, "maxlength")
        set(newValue) {attributeString_4c4f42e4.set(this, "maxlength", newValue)}

    var min : String
        get()  = attributeString_4c4f42e4.get(this, "min")
        set(newValue) {attributeString_4c4f42e4.set(this, "min", newValue)}

    var multiple : Boolean
        get()  = attributeBoolean_13527a93.get(this, "multiple")
        set(newValue) {attributeBoolean_13527a93.set(this, "multiple", newValue)}

    var pattern : String
        get()  = attributeString_4c4f42e4.get(this, "pattern")
        set(newValue) {attributeString_4c4f42e4.set(this, "pattern", newValue)}

    var placeholder : String
        get()  = attributeString_4c4f42e4.get(this, "placeholder")
        set(newValue) {attributeString_4c4f42e4.set(this, "placeholder", newValue)}

    var readonly : Boolean
        get()  = attributeBoolean_13527a93.get(this, "readonly")
        set(newValue) {attributeBoolean_13527a93.set(this, "readonly", newValue)}

    var required : Boolean
        get()  = attributeBoolean_13527a93.get(this, "required")
        set(newValue) {attributeBoolean_13527a93.set(this, "required", newValue)}

    var size : String
        get()  = attributeString_4c4f42e4.get(this, "size")
        set(newValue) {attributeString_4c4f42e4.set(this, "size", newValue)}

    var src : String
        get()  = attributeString_4c4f42e4.get(this, "src")
        set(newValue) {attributeString_4c4f42e4.set(this, "src", newValue)}

    var step : String
        get()  = attributeString_4c4f42e4.get(this, "step")
        set(newValue) {attributeString_4c4f42e4.set(this, "step", newValue)}

    var width : String
        get()  = attributeString_4c4f42e4.get(this, "width")
        set(newValue) {attributeString_4c4f42e4.set(this, "width", newValue)}

    var files : String
        get()  = attributeString_4c4f42e4.get(this, "files")
        set(newValue) {attributeString_4c4f42e4.set(this, "files", newValue)}

    var value : String
        get()  = attributeString_4c4f42e4.get(this, "value")
        set(newValue) {attributeString_4c4f42e4.set(this, "value", newValue)}

    var name : String
        get()  = attributeString_4c4f42e4.get(this, "name")
        set(newValue) {attributeString_4c4f42e4.set(this, "name", newValue)}


}

public class INS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ins", consumer, initialAttributes), CoreAttributeGroupFacade, CommonEventsGroupFacade, CoreServerAttributeGroupFacade {
    var cite : String
        get()  = attributeString_4c4f42e4.get(this, "cite")
        set(newValue) {attributeString_4c4f42e4.set(this, "cite", newValue)}

    var dateTime : String
        get()  = attributeString_4c4f42e4.get(this, "datetime")
        set(newValue) {attributeString_4c4f42e4.set(this, "datetime", newValue)}


}

