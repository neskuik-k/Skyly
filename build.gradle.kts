plugins {
    id("java")
}

group = "fr.neskuik.skyly"
version = "1.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}


repositories {
    mavenCentral()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }

}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")


}