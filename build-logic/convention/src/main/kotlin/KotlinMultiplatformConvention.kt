import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class KotlinMultiplatformConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.kotlinMultiplatformPluginId)
            }
            extensions.configure<KotlinMultiplatformExtension> {
                js {
                    nodejs()
                    browser()
                    withSourcesJar()
                }
                sourceSets.jsMain {
                    dependencies {
                        implementation(libs.seskarCore)
                    }
                }
            }
        }
    }
}
