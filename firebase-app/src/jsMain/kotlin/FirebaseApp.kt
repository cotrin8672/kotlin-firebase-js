@file:JsModule("firebase/app")
@file:JsNonModule
@file:Suppress("unused")

external interface FirebaseOptions {
    var apiKey: String?
    var appId: String?
    var authDomain: String?
    var databaseURL: String?
    var measurementId: String?
    var messagingSenderId: String?
    var projectId: String?
    var storageBucket: String?
}

external interface FirebaseApp {
    var automaticDataCollectionEnabled: Boolean
    val name: String
    val options: FirebaseOptions
}

external fun initializeApp(
    options: FirebaseOptions? = definedExternally,
    name: String? = definedExternally,
): FirebaseApp
