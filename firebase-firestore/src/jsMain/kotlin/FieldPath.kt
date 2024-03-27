@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

external class FieldPath(vararg fieldNames: String) {
    fun isEqual(other: FieldPath): Boolean
}
