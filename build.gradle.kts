plugins {
    java
    `maven-publish`
}

group = "com.github.Sal4iDev"
version = "0.4"

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
            artifactId = "sDiscordWebhook"
            version = "0.4"

            from(components["java"])
        }
    }
}