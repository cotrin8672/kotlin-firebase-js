plugins {
    alias(libs.plugins.kotlin.libs.convention)
}

version = "0.0.1"

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(projects.firebaseApp)
            implementation(projects.firebaseAuth)
            implementation(npm("@firebase/storage", "0.12.2"))
        }
    }
}
