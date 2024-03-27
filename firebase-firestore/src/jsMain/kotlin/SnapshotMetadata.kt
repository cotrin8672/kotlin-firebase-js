@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

external class SnapshotMetadata {
    val fromCache: Boolean
    val hasPendingWrites: Boolean
    fun isEqual(other: SnapshotMetadata): Boolean
}
