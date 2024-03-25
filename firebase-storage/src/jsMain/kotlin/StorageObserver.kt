@file:Suppress("unused")

package wrapper.firebase.storage

import CompleteFn
import ErrorFn
import NextFn

interface StorageObserver<T> {
    val complete: CompleteFn?
    val error: ErrorFn?
    val next: NextFn<T>?
}
