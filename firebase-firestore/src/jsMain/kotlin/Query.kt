@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

external interface Query {
    val firestore: Firestore
    val type: QueryType
}
