[![Release](https://jitpack.io/v/Ericgacoki/SearchBarCompose.svg)](https://jitpack.io/#Ericgacoki/SearchBarCompose)

## Usage
---

### 1. Add `jitpack` repository in the project's settings.gradle file

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
    implementation 'com.github.Ericgacoki:SearchBarCompose:1.0.1'
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

- Night Mode
<img src ="https://user-images.githubusercontent.com/54077752/210166940-994d42c9-3e60-41b1-8959-b6a5b86be878.png" height="320" />

- Light Mode
<img src ="https://user-images.githubusercontent.com/54077752/210166942-1759dacf-3e5c-483b-9ada-be66039b4a8a.png" height="320" />

- Focused
<img src ="https://user-images.githubusercontent.com/54077752/210166946-fb70928d-f3aa-4fe5-adf7-cdbc87893835.png"  height="320"/>


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

### hint
An optional placeholder. This defaults to "Search".
