plugins {
    alias(libs.plugins.kotlin.libs.convention)
}

version = "0.0.1"

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(projects.firebaseApp)
            implementation(npm("@firebase/auth", "1.6.2"))
        }
    }
}
