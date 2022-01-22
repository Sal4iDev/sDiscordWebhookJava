plugins {
    java
    `maven-publish`
}

group = "ru.sal4i"
version = "1.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.Sal4iDev"
            artifactId = "sDiscordWebhookJava"
            version = "1.0"

            from(components["java"])
        }
    }
}