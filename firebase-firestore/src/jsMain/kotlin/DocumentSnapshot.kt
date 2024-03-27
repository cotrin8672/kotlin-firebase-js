@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

open external class DocumentSnapshot {
    var id: String
    val metadata: SnapshotMetadata
    var ref: DocumentReference
    fun data(options: SnapshotOptions?): DocumentData?
    fun exists(): Boolean
    fun get(fieldPath: String, options: SnapshotOptions?): dynamic
    fun get(fieldPath: FieldPath, options: SnapshotOptions?): dynamic
}
