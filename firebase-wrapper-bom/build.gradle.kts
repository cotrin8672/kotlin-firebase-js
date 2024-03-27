plugins {
    `java-platform`
    alias(libs.plugins.publish.convention)
}

version = "0.0.2"

javaPlatform {
    allowDependencies()
}

dependencies {
    constraints {
        api(projects.firebaseApp)
        api(projects.firebaseAuth)
        api(projects.firebaseStorage)
        api(projects.firebaseFirestore)
    }
}
