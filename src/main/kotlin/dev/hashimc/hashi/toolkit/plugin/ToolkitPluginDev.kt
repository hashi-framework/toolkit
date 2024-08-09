package dev.hashimc.hashi.toolkit.plugin

import dev.hashimc.hashi.toolkit.BuildConfig
import dev.hashimc.hashi.toolkit.ToolkitShared
import dev.hashimc.hashi.toolkit.plugin.extension.HashiPluginExtension
import dev.hashimc.hashi.toolkit.plugin.extension.PlatformExtension
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class ToolkitPluginDev : ToolkitShared() {

    override fun apply(target: Project) {
        super.apply(target)
        val hashi = target.extensions.create("hashi", HashiPluginExtension::class.java)
        with(hashi as ExtensionAware) {
            val platform = extensions.create("platform", PlatformExtension::class.java)
        }
    }

    override fun applyToCompilation(kotlinCompilation: KotlinCompilation<*>): Provider<List<SubpluginOption>> {
        val project = kotlinCompilation.target.project
        return project.provider {
            listOf(

            )
        }
    }

    override fun getCompilerPluginId(): String {
        return "dev.hashimc.hashi.toolkit.plugin"
    }

    override fun getPluginArtifact(): SubpluginArtifact {
        return SubpluginArtifact("dev.hashimc.hashi.toolkit", "plugin", BuildConfig.PLUGIN_VERSION)
    }

}