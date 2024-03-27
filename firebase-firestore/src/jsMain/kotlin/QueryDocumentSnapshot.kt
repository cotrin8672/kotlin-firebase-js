@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

external class QueryDocumentSnapshot : DocumentSnapshot {
    fun data(options: SnapshotOptions): DocumentData
}
