package com.github.plmich.intellijumichtheme.services

import com.github.plmich.intellijumichtheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
