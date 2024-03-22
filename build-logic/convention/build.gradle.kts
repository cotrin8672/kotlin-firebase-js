plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("kotlin-multiplatform-convention") {
            id = "kotlin-multiplatform-convention"
            implementationClass = "KotlinMultiplatformConvention"
        }
        register("publish-convention") {
            id = "publish-convention"
            implementationClass = "PublishConvention"
        }
        register("kotlin-libs-convention") {
            id = "kotlin-libs-convention"
            implementationClass = "KotlinLibsConvention"
        }
    }
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.gradle.maven.publish.plugin)
}
