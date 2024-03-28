plugins {
    alias(libs.plugins.kotlin.libs.convention)
}

version = "0.0.3"

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(projects.firebaseUtil)
            implementation(npm("@firebase/app", "0.9.29"))
        }
    }
}
