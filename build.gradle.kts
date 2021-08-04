plugins {
    kotlin("js") version "1.5.30-M1"
}

group = "com.uramnoil"
version = "0.1.0"

repositories {
    mavenCentral()
}

val kotlinVersion = "1.5.21"
val reactVersion = "17.0.2"

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.224-kotlin-1.5.21")
    implementation(peerNpm("react", reactVersion))
}

kotlin {
    js(IR) {
        binaries.library()
        browser()
    }
}

