# sDiscordWebhook Java
[Example](https://github.com/Sal4iDev/sDiscordWebhookJava/blob/main/src/main/resources/Example.java)
#### _Replace [Tag] with the last release tag_

### Gradle:

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

```groovy
dependencies {
    implementation 'com.github.Sal4iDev:sDiscordWebhookJava:[Tag]'
}
```

### Gradle DSL:

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}
```

```kotlin
dependencies {
    implementation("com.github.Sal4iDev:sDiscordWebhookJava:[Tag]")
}
```

### Maven:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependency>
    <groupId>com.github.Sal4iDev</groupId>
    <artifactId>sDiscordWebhookJava</artifactId>
    <version>[Tag]</version>
</dependency>
```