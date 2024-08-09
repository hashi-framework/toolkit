package dev.hashimc.hashi.toolkit.module

import com.google.auto.service.AutoService
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor
import org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi

@OptIn(ExperimentalCompilerApi::class)
@AutoService(CommandLineProcessor::class)
class ToolkitModuleCommandLineProcessor : CommandLineProcessor {

    override val pluginId: String = "dev.hashimc.hashi.toolkit.module"
    override val pluginOptions: Collection<AbstractCliOption> = listOf()

}