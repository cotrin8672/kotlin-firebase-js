@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

/**
 * A DocumentReference refers to a document location in a Firestore database
 * and can be used to write, read, or listen to the location.
 * The document at the referenced location may or may not exist.
 */
external class DocumentReference {
    /**
     * The Firestore instance the document is in.
     * This is useful for performing transactions, for example.
     */
    val firestore: Firestore

    /**
     * The document's identifier within its collection.
     */
    var id: String

    /**
     * The collection this DocumentReference belongs to.
     */
    var parent: CollectionReference

    /**
     * A string representing the path of the referenced document (relative to the root of the database).
     */
    var path: String

    /**
     * The type of this Firestore reference.
     */
    val type: String = definedExternally
}
