package dev.hashimc.hashi.toolkit.module

import dev.hashimc.hashi.toolkit.BuildConfig
import dev.hashimc.hashi.toolkit.ToolkitShared
import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class ToolkitModuleDev : ToolkitShared() {

    override fun applyToCompilation(kotlinCompilation: KotlinCompilation<*>): Provider<List<SubpluginOption>> {
        val project = kotlinCompilation.target.project
        return project.provider {
            listOf(

            )
        }
    }

    override fun getCompilerPluginId(): String {
        return "dev.hashimc.hashi.toolkit.module"
    }

    override fun getPluginArtifact(): SubpluginArtifact {
        return SubpluginArtifact("dev.hashimc.hashi.toolkit", "module", BuildConfig.PLUGIN_VERSION)
    }

}