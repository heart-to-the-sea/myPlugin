package com.github.polemices.myplugin.services

import com.intellij.openapi.project.Project
import com.github.polemices.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
