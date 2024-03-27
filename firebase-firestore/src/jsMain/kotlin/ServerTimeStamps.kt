@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

import seskar.js.JsValue
import seskar.js.JsVirtual


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@JsVirtual
external interface ServerTimeStamps {
    companion object {
        @JsValue("estimate")
        val estimate: ServerTimeStamps

        @JsValue("previous")
        val previous: ServerTimeStamps

        @JsValue("none")
        val none: ServerTimeStamps
    }
}
