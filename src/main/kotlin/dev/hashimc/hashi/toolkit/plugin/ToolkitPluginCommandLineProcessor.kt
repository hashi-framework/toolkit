package dev.hashimc.hashi.toolkit.plugin

import com.google.auto.service.AutoService
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor
import org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi

@OptIn(ExperimentalCompilerApi::class)
@AutoService(CommandLineProcessor::class)
class ToolkitPluginCommandLineProcessor : CommandLineProcessor {

    override val pluginId: String = "dev.hashimc.hashi.toolkit.plugin"
    override val pluginOptions: Collection<AbstractCliOption> = listOf()

}