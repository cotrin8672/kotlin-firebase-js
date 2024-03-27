@file:JsModule("firebase/firestore")
@file:JsNonModule
@file:Suppress("unused")

import kotlin.js.Promise

external fun getFirestore(app: FirebaseApp): Firestore

external fun collection(
    firestore: Firestore,
    path: String,
    vararg pathSegments: String
): CollectionReference

external fun addDoc(reference: CollectionReference, data: DocumentData): Promise<DocumentReference>

external fun getDoc(reference: CollectionReference): Promise<DocumentReference>

external fun updateDoc(reference: CollectionReference, data: DocumentData): Promise<Unit>

external fun deleteDoc(reference: CollectionReference): Promise<Unit>
