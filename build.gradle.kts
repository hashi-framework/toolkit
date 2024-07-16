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
        create("toolkit-plugin") {
            id = "dev.hashimc.hashi.toolkit.plugin"
            implementationClass = "dev.hashimc.hashi.toolkit.ToolkitPluginDev"
        }
        create("toolkit-module") {
            id = "dev.hashimc.hashi.toolkit.module"
            implementationClass = "dev.hashimc.hashi.toolkit.ToolkitPlugin"
        }
    }
}