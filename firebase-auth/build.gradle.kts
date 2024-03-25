plugins {
    alias(libs.plugins.kotlin.libs.convention)
}

version = "0.0.2"

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(projects.firebaseUtil)
            implementation(projects.firebaseApp)
            implementation(npm("@firebase/auth", "1.6.2"))
        }
    }
}
