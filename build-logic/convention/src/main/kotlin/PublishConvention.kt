import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class PublishConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.gradleMavenPublishPluginId)
            }
        }
        target.afterEvaluate {
            extensions.configure<MavenPublishBaseExtension> {
                publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = false)
                signAllPublications()

                coordinates(
                    rootProject.group.toString(),
                    "kotlin-${project.name}",
                    project.version.toString()
                )

                pom {
                    name.set("Kotlin/JS ${project.name}")
                    url.set("https://github.com/cotrin8672/kotlin-firebase-js")
                    description.set("Firebase javascript sdk wrapper for Kotlin/JS")
                    licenses {
                        license {
                            name.set("MIT License")
                            url.set("https://github.com/cotrin8672/kotlin-firebase-js/LICENSE")
                            distribution.set("repo")
                        }
                    }
                    developers {
                        developer {
                            id.set("cotrin8672")
                            name.set("Cotrin")
                            email.set("gummy8672@gmail.com")
                        }
                    }
                    scm {
                        url.set("https://github.com/cotrin8672/kotlin-firebase-js")
                    }
                }
            }
        }
    }
}
