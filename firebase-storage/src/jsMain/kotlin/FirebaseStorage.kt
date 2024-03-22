@file:JsModule("firebase/storage")
@file:JsNonModule
@file:Suppress("unused")

package wrapper.firebase.storage

import FirebaseApp
import org.w3c.files.File
import seskar.js.JsValue
import seskar.js.JsVirtual
import kotlin.js.Promise

external interface FirebaseStorage {
    val app: FirebaseApp
    var maxOperationRetryTime: Number
    var maxUploadRetryTime: Number
}

external fun getStorage(app: FirebaseApp, bucketUrl: String?): FirebaseStorage

external interface StorageReference {
    val bucket: String
    val fullPath: String
    val name: String
    val parent: StorageReference?
    val root: StorageReference
    val storage: FirebaseStorage
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@JsVirtual
sealed external interface StorageErrorCode {
    companion object {
        @JsValue("app-deleted")
        val APP_DELETED: StorageErrorCode

        @JsValue("bucket-not-found")
        val BUCKET_NOT_FOUND: StorageErrorCode

        @JsValue("canceled")
        val CANCELED: StorageErrorCode

        @JsValue("cannot-slice-blob")
        val CANNOT_SLICE_BLOB: StorageErrorCode

        @JsValue("internal-error")
        val INTERNAL_ERROR: StorageErrorCode

        @JsValue("invalid-argument")
        val INVALID_ARGUMENT: StorageErrorCode

        @JsValue("invalid-argument-count")
        val INVALID_ARGUMENT_COUNT: StorageErrorCode

    }
}

external class StorageError(

) {
    val customData: dynamic
    val serverResponse: String?
    val status: Number
}

external fun ref(storage: FirebaseStorage, url: String?): StorageReference

external fun deleteObject(ref: StorageReference): Promise<Unit>

external fun getDownloadURL(ref: StorageReference): Promise<String>

external interface UploadTask {
    val snapshot: dynamic

    fun cancel(): Boolean
    fun catch(onRejected: (StorageError) -> dynamic): Promise<dynamic>
}

external fun uploadBytes(ref: StorageReference, data: File)
