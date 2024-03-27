@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@JsVirtual
sealed external interface QueryType {
    companion object {
        @JsValue("query")
        val query: QueryType

        @JsValue("collection")
        val collection: QueryType
    }
}
