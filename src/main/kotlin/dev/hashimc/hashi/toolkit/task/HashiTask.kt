package dev.hashimc.hashi.toolkit.task

import org.gradle.api.DefaultTask

abstract class HashiTask : DefaultTask() {

    override fun getGroup(): String {
        return "hashi"
    }

    override fun setGroup(group: String?) {
        throw IllegalAccessException("You cannot modify the group of a hashi task")
    }

}