@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

external class Firestore {
    val app: FirebaseApp
    val type: String = definedExternally

    fun toJson(): dynamic
}
