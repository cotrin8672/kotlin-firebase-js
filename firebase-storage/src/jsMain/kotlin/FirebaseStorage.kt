@file:JsModule("firebase/storage")
@file:JsNonModule
@file:Suppress("unused")

package wrapper.firebase.storage

import FirebaseApp
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Uint8Array
import org.w3c.files.Blob
import org.w3c.files.File
import kotlin.js.Promise

external interface FirebaseStorage {
    val app: FirebaseApp
    var maxOperationRetryTime: Number
    var maxUploadRetryTime: Number
}

external fun getStorage(app: FirebaseApp, bucketUrl: String?): FirebaseStorage

external fun connectStorageEmulator(
    storage: FirebaseStorage,
    host: String,
    port: String,
    options: dynamic = definedExternally,
)

external interface StorageReference {
    val bucket: String
    val fullPath: String
    val name: String
    val parent: StorageReference?
    val root: StorageReference
    val storage: FirebaseStorage
}

external fun ref(storage: FirebaseStorage, url: String?): StorageReference

external fun deleteObject(ref: StorageReference): Promise<Unit>

external fun getDownloadURL(ref: StorageReference): Promise<String>

external interface SettableMetadata {
    var cacheControl: String?
    var contentDisposition: String?
    var contentEncoding: String?
    var contentLanguage: String?
    var contentType: String?
    var customMetadata: dynamic
}

external interface UploadMetadata : SettableMetadata {
    var md5Hash: String?
}

external interface FullMetadata : UploadMetadata {
    val bucket: String
    val downloadTokens: Array<String>
    val fullPath: String
    val generation: String
    val metageneration: String
    val name: String
    val ref: StorageReference?
    val size: Number
    val timeCreated: String
    val updated: String
}

external fun updateMetadata(ref: StorageReference, metadata: SettableMetadata): Promise<FullMetadata>

external fun uploadBytes(
    ref: StorageReference,
    data: Blob,
    metadata: UploadMetadata? = definedExternally,
)

external fun uploadBytes(
    ref: StorageReference,
    data: Uint8Array,
    metadata: UploadMetadata? = definedExternally,
)

external fun uploadBytes(
    ref: StorageReference,
    data: ArrayBuffer,
    metadata: UploadMetadata? = definedExternally,
)

external interface UploadTask {
    val snapshot: dynamic

    fun cancel(): Boolean
    fun catch(onRejected: (StorageError) -> Any): Promise<Any>
}

external fun uploadBytes(ref: StorageReference, data: File)
