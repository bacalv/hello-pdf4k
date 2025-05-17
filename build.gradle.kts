plugins {
    id("org.jetbrains.kotlin.jvm") version "2.0.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.pdf4k:dsl:0.0.1")
    implementation("io.pdf4k:renderer:0.0.1")
    testImplementation(testFixtures("io.pdf4k:renderer:0.0.1"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}