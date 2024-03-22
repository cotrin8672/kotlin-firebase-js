import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinLibsConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.kotlinMultiplatformConventionPluginId)
                apply(libs.publishConventionPluginId)
            }
        }
    }
}
