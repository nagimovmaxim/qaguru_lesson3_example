plugins {
    id("java-library")
}

group = "com.nagimovmaxim"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.14.2")
}

tasks.test {
    useJUnitPlatform()
}