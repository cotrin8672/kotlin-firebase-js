plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.gradle.maven.publish) apply false
    alias(libs.plugins.seskar) apply false
    alias(libs.plugins.kotlin.libs.convention) apply false
    alias(libs.plugins.publish.convention) apply false
    alias(libs.plugins.kotlin.multiplatform.convention) apply false
}

group = "io.github.cotrin8672"
