plugins {
    kotlin("jvm")
    id("java-library")
}

dependencies {
    val sdkVersion: String by project.parent!!.extra
    implementation("com.inductiveautomation.ignitionsdk", "ignition-common", sdkVersion)
    implementation("com.inductiveautomation.ignitionsdk", "ignition-common" , sdkVersion)
    implementation("com.inductiveautomation.ignitionsdk", "perspective-common", sdkVersion)
    compileOnly("com.google.guava", "guava", "23.3-jre")
    compileOnly("com.inductiveautomation.ignition", "ia-gson", "2.8.5")
    modlApi("org.dhatim:fastexcel-reader:0.10.20")
}
