@file:JsModule("firebase/auth")
@file:JsNonModule
@file:Suppress("unused")

import kotlin.js.Promise

external interface Error {
    var name: String
    var message: String
    var stack: String?
}

external interface Observer<T> {
    var next: NextFn<T>
    var error: ErrorFn
    var complete: CompleteFn
}

external interface Persistence {
    var type: PersistenceType
}

external val browserLocalPersistence: Persistence
external val browserSessionPersistence: Persistence
external val inMemoryPersistence: Persistence

external interface Auth {
    var app: FirebaseApp
    var currentUser: User?

    fun onAuthStateChanged(
        nextOrObserver: NextFn<User?>,
        error: ErrorFn? = definedExternally,
        completed: CompleteFn? = definedExternally,
    ): Unsubscribe

    fun onAuthStateChanged(
        nextOrObserver: Observer<User?>,
        error: ErrorFn? = definedExternally,
        completed: CompleteFn? = definedExternally,
    ): Unsubscribe

    fun setPersistence(persistence: Persistence): Promise<Unit>
    fun signOut(): Promise<Unit>
}

external fun getAuth(app: FirebaseApp): Auth

external interface UserCredential {
    var providerId: String?
    var user: User
}

external interface UserInfo {
    var displayName: String?
    var email: String?
    var phoneNumber: String?
    var photoURL: String?
    var providerId: String
    var uid: String
}

external interface IdTokenResult {
    var claims: dynamic
}

external interface User : UserInfo {
    val emailVerified: Boolean
    var isAnonymous: Boolean
    var metadata: dynamic
    var providerData: dynamic
    var refreshToken: String
    var tenantId: String?

    fun delete(): Promise<Unit>
    fun getIdToken(forceRefresh: Boolean): Promise<String>
    fun getIdTokenResult(forceRefresh: Boolean): Promise<IdTokenResult>
    fun reload(): Promise<Unit>
}

external interface UpdateUserInfo {
    var displayName: String
    var photoURL: String
}

external interface ActionCodeSettings {
    var handleCodeInApp: Boolean?
    var url: String?
}

external fun createUserWithEmailAndPassword(auth: Auth, email: String, password: String): Promise<UserCredential>

external fun signInWithEmailAndPassword(auth: Auth, email: String, password: String): Promise<UserCredential>

external fun updateProfile(user: User, updateUserInfo: UpdateUserInfo): Promise<Unit>

external fun sendEmailVerification(user: User): Promise<Unit>
