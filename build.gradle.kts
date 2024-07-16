plugins {
    kotlin("jvm") version "2.0.0"
    id("java-gradle-plugin")
}

group = "dev.hashimc.hashi"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

gradlePlugin {
    plugins {
        create("hashi-toolkit") {
            id = "dev.hashimc.hashi.toolkit"
            implementationClass = "dev.hashimc.hashi.toolkit.ToolkitPlugin"
        }
    }
}