@file:JsModule("firebase/storage")
@file:JsNonModule
@file:Suppress("unused")

package wrapper.firebase.storage

import seskar.js.JsValue
import seskar.js.JsVirtual

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

        @JsValue("invalid-checksum")
        val INVALID_CHECKSUM: StorageErrorCode

        @JsValue("invalid-default-bucket")
        val INVALID_DEFAULT_BUCKET: StorageErrorCode

        @JsValue("invalid-event-name")
        val INVALID_EVENT_NAME: StorageErrorCode

        @JsValue("invalid-format")
        val INVALID_FORMAT: StorageErrorCode

        @JsValue("invalid-root-operation")
        val INVALID_ROOT_OPERATION: StorageErrorCode

        @JsValue("invalid-url")
        val INVALID_URL: StorageErrorCode

        @JsValue("no-default-bucket")
        val NO_DEFAULT_BUCKET: StorageErrorCode

        @JsValue("no-download-url")
        val NO_DOWNLOAD_URL: StorageErrorCode

        @JsValue("object-not-found")
        val OBJECT_NOT_FOUND:StorageErrorCode

        @JsValue("project-not-found")
        val PROJECT_NOT_FOUND: StorageErrorCode

        @JsValue("quota-exceeded")
        val QUOTA_EXCEEDED: StorageErrorCode

        @JsValue("retry-limit-exceeded")
        val RETRY_LIMIT_EXCEEDED: StorageErrorCode

        @JsValue("server-file-wrong-size")
        val SERVER_FILE_WRONG_SIZE: StorageErrorCode

        @JsValue("unauthenticated")
        val UNAUTHENTICATED: StorageErrorCode

        @JsValue("unauthorized")
        val UNAUTHORIZED: StorageErrorCode

        @JsValue("unauthorized-app")
        val UNAUTHORIZED_APP: StorageErrorCode

        @JsValue("unknown")
        val UNKNOWN: StorageErrorCode

        @JsValue("unsupported-environment")
        val UNSUPPORTED_ENVIRONMENT: StorageErrorCode
    }
}
