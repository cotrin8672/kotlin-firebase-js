@file:JsModule("firebase/util")
@file:JsNonModule
@file:Suppress("unused")

external interface Observer<T> {
    val next: NextFn<T>
    val error: ErrorFn
    val complete: CompleteFn
}

external interface PartialObserver<T> {
    val next: NextFn<T>?
    val error: ErrorFn?
    val complete: CompleteFn?
}
