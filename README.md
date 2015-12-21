# Picasa & Google Photos API Client

[![Release](https://img.shields.io/github/release/plusCubed/android-picasa-client.svg?label=JitPack)](https://jitpack.io/#com.pluscubed/android-picasa-client) [![License](https://img.shields.io/github/license/pluscubed/android-picasa-client.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

Not ready for use yet. Watch the repo for updates.

### Dependency

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Add this to your module's `build.gradle` file:

```Gradle
dependencies {
	...
	compile 'com.pluscubed:android-picasa-client:{latest-version}'
}
```

The library is versioned according to [Semantic Versioning](http://semver.org/).

### Basic Usage
1. `PicasaClient` needs to be attached to the Activity using it, and can be detached when not used anymore. For example:
    ```java
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
    	//...
        PicasaClient.get().attachActivity(this);
    }
    
    @Override
    protected void onDestroy() {
        //...
        PicasaClient.get().detachActivity();
    }
    ```
    
2. In `onActivityResult()`, you need to add the following to let the client resolve any error code or process the chosen user account:
   ```java
   @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //...
        PicasaClient.get().onActivityResult(requestCode, resultCode, data);
    }
   ```
    
3. The client must be initialized. You can do this in one of two ways depending on whether you know the Google account email or not at this point in your app:

	2a. Call `pickUserAccount()` and use `onActivityResult()` to observe when initialization is done:
	```java
	TODO: sample code
	```
	2b. Call `setAccount()` and observe when initialization is done:
	```java
	TODO: sample code
	```

See the sample project for a full demo.

### License

```
Copyright 2015 Daniel Ciao

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
