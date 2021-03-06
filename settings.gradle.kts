/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/6.8.1/userguide/multi_project_builds.html
 */

pluginManagement {
    repositories {
        maven {
            url = java.net.URI("https://packages.confluent.io/maven/")
        }
        gradlePluginPortal()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven {
            url = uri("https://packages.confluent.io/maven/")
        }
        maven {
            url = uri("https://jitpack.io")
        }
        maven {
            url = uri("https://packages.confluent.io/maven/")
        }
    }
}

rootProject.name = "kotlin-sample-listener"
include("app")
