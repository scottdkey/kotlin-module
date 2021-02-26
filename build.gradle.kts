import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    kotlin("jvm") version "1.4.10"
    id("io.ia.sdk.modl") version ("0.0.1-SNAPSHOT")
}

version = "0.0.1-SNAPSHOT"

extra["sdkVersion"] = "8.1.0-SNAPSHOT"

ignitionModule {
    name.set("skmCore")
    fileName.set("skmCore.modl")
    id.set("com.skm.kotlin.skmCore")
    moduleVersion.set("$version")
    moduleDescription.set("SKM Core Modules in Kotlin")
    requiredIgnitionVersion.set("8.1.0")
    projectScopes.set(mapOf(
        ":common" to "GD",
        ":designer" to "D",
        ":gateway" to "G"
    ))
    moduleDependencies.set(mapOf())
    hooks.set(mapOf(
        "com.skm.kotlin.gateway.skmGatewayHook" to "G",
        "com.skm.kotlin.designer.skmDesignerHook" to "D"
    ))
}

tasks.getByName("signModule").enabled = true

allprojects {
    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
}
