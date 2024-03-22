import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal val VersionCatalog.seskarCore
    get() = getLibrary("seskar")

internal val VersionCatalog.kotlinMultiplatformPluginId
    get() = getPluginId("kotlin-multiplatform")

internal val VersionCatalog.gradleMavenPublishPluginId
    get() = getPluginId("gradle-maven-publish")

internal val VersionCatalog.kotlinMultiplatformConventionPluginId
    get() = getPluginId("kotlin-multiplatform-convention")

internal val VersionCatalog.publishConventionPluginId
    get() = getPluginId("publish-convention")

private fun VersionCatalog.getLibrary(alias: String) = findLibrary(alias).get().get()

private fun VersionCatalog.getPluginId(alias: String) = findPlugin(alias).get().get().pluginId
