typealias NextFn<T> = (value: T) -> Unit
typealias ErrorFn = (error: Error) -> Unit
typealias CompleteFn = () -> Unit
typealias Unsubscribe = () -> Unit
