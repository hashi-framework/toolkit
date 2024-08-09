plugins {
    kotlin("jvm") version "2.0.0"
    kotlin("kapt") version "2.0.0"
    id("java-gradle-plugin")
    id("com.github.gmazzo.buildconfig") version "5.4.0"
}

group = "dev.hashimc.hashi"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("com.google.auto.service:auto-service:1.1.1")

    implementation("org.jetbrains.kotlin:kotlin-compiler:2.0.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:2.0.0")

    kapt("com.google.auto.service:auto-service:1.1.1")
}

gradlePlugin {
    plugins {
        create("toolkit-plugin") {
            id = "dev.hashimc.hashi.toolkit.plugin"
            implementationClass = "dev.hashimc.hashi.toolkit.plugin.ToolkitPluginDev"
        }
        create("toolkit-module") {
            id = "dev.hashimc.hashi.toolkit.module"
            implementationClass = "dev.hashimc.hashi.toolkit.module.ToolkitModuleDev"
        }
    }
}

buildConfig {
    packageName("dev.hashimc.hashi.toolkit")
    buildConfigField("String", "PLUGIN_VERSION", "\"${rootProject.version}\"")
}