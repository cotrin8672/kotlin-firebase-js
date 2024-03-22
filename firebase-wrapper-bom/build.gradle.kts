plugins {
    `java-platform`
    alias(libs.plugins.publish.convention)
}

version = rootProject

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
