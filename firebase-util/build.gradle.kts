plugins {
    alias(libs.plugins.kotlin.libs.convention)
}

version = "0.0.2"

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(npm("@firebase/util", "1.9.4"))
        }
    }
}
