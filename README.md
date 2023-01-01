[![Release](https://jitpack.io/v/Ericgacoki/SearchBarCompose.svg)](https://jitpack.io/#Ericgacoki/SearchBarCompose)

## Usage
---

### 1. Add `jitpack` repository in the app's build.gradle file

```gradle
allprojects {
    repositories {
        mavenCentral()
        maven { url "https://jitpack.io" }
    }
}
```

### 2. Add `SearchBarCompose` dependency

```gradle
dendencies {
    implementation("com.github.Ericgacoki:SearchBarCompose:1.0.0")
}
```

### 3. Using SearchBarCompose in your Composables

```kotlin
Scaffold(modifier = Modifier.fillMaxSize()) {
    SearchBarCompose(
        onSearchParamChange = {

        },
        onSearchClick = {

        }
    )
}
```



## Parameters
---

### onSearchParamChange{ }

The callback that is triggered when the input service updates the text. An updated text string comes
as a parameter of the callback.

### onSearchClick{ }

The callback that is triggered when the search icon either on the keyboard or on the search bar is
clicked. An updated text string comes as a parameter of the callback.

### modifier
An optional Modifier that is applied to the search bar. By default, this defines the color and shape of the search bar.
