<div align="center">
    <img alt="logo" src="https://i.imgur.com/gX2LSsH.jpg"/>
</div>

An **SIMPLE** unofficial SDK for Imgur written in Kotlin.


## ❔ How to use?

Choose above what dependency manager you'd like to use and follow the steps.

### Maven

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
  <groupId>com.github.ianguuima</groupId>
  <artifactId>Imgur-Kotlin-SDK</artifactId>
  <version>e313fae670</version>
</dependency>
```

### Gradle

```gradle
repositories {
  ...
  maven { url 'https://jitpack.io' }
}
```

```gradle
dependencies {
  implementation 'com.github.ianguuima:Imgur-Kotlin-SDK:e313fae670'
}
```

## 🤔 Using the SDK

(Get your clientId[https://api.imgur.com/oauth2/addclient]. It's important to proceed and use the methods.

```kotlin
val imgur = Imgur(
  clientId = clientId
)
```

### 🌆 Uploading a new image

More easy than this? Impossible!

```kotlin
val uploadResponse = imgur.upload(
  file = file
)
```

The response will return what you need, such link and image hash.

### ✖ Deleting a image

```kotlin
val isDeleted = imgur.delete(
  deleteHash = deleteHash
)
```

You can get the deleteHash from the uploadResponse and isDeleted will return whether the image is deleted or not.

## 🌟 That's all

I made this SDK to be simple. Pull requests are welcome. Consider leaving a star if this repo helped you.
