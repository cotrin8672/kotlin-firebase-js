plugins {
    alias(libs.plugins.kotlin.libs.convention)
}

version = "0.0.1"

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(npm("@firebase/app", "0.9.29"))
        }
    }
}
