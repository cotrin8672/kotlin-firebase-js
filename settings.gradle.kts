rootProject.name = "kotlin-firebase-js"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")

    repositories {
        mavenCentral()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

include(":firebase-app")
include(":firebase-auth")
include(":firebase-storage")
include(":firebase-firestore")
include(":firebase-wrapper-bom")
