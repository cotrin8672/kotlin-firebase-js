@file:JsModule("firebase/storage")
@file:JsNonModule
@file:Suppress("unused")

package wrapper.firebase.storage

external class StorageError(
    code: StorageErrorCode,
    message: String,
    status: Number?,
) {
    val customData: StorageErrorCustomData
    val serverResponse: String?
    val status: Number
}

external interface StorageErrorCustomData {
    val serverResponse: String?
}
