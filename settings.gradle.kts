pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
        maven("https://nexus.inductiveautomation.com/repository/public")
        maven ("https://nexus.inductiveautomation.com/repository/inductiveautomation-thirdparty/" )
        maven ("https://nexus.inductiveautomation.com/repository/inductiveautomation-releases/" )
        maven ( "https://nexus.inductiveautomation.com/repository/inductiveautomation-snapshots/" )
    }
}

rootProject.name = "skmCore"

include(
    ":",
    ":common",
    ":gateway",
    ":designer"
)
