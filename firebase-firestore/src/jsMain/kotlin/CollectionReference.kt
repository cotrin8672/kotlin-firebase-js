@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

external interface CollectionReference : Query {
    var id: String
    var parent: DocumentReference?
    var path: String
}
