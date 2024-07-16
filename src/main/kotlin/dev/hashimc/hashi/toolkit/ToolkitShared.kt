package dev.hashimc.hashi.toolkit

import dev.hashimc.hashi.toolkit.task.HashiTask
import org.gradle.api.Plugin
import org.gradle.api.Project

open class ToolkitShared : Plugin<Project> {

    override fun apply(target: Project) {
        target.tasks.register("info", HashiTask::class.java) { task ->
            task.doLast {
                println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
                println("You are using snapshot version of Hashi Toolkit.")
                println("It has risks to use a snapshot version.")
                println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
            }
        }
    }

}