plugins {
    kotlin("jvm") version "1.9.23"
    id("me.champeau.jmh") version "0.7.2"
    id("org.jetbrains.dokka") version "1.9.20"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.reflections:reflections:0.10.2")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.10")
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

jmh {
    threads = 1
    fork = 1
    warmupIterations = 1
    iterations = 1
}