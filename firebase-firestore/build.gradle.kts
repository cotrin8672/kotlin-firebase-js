plugins {
    alias(libs.plugins.kotlin.libs.convention)
}

version = "0.0.2"

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(projects.firebaseUtil)
            implementation(projects.firebaseApp)
            implementation(projects.firebaseAuth)
            implementation(npm("@firebase/firestore", "4.5.0"))
        }
    }
}
