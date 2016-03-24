# react-native-android-keyboard-adjust

Change the input mode for the Android keyboard in a React Native app.

If you are having issues with the default keyboard screen adjust modes and need an easy way to instantly switch them in your app. Quickly go from `Pan` to `Resize` to `Nothing` to get the screen displayed perfectly with the keyboard.

## Installation instructions for Android

### Install the package

`npm install --save https://github.com/zubricky/react-native-android-keyboard-adjust`

### Update android/app/build.gradle

Add `compile project(":react-native-android-keyboard-adjust")` to dependencies:

```
dependencies {
    ...
    compile project(":react-native-android-keyboard-adjust")
    ...
 }
```
### Update android/settings.gradle

```
...
include ':react-native-android-keyboard-adjust'
project(':react-native-android-keyboard-adjust').projectDir = new File(settingsDir, '../node_modules/react-native-android-keyboard-adjust/android')
...
```

### Update MainActivity.java in your project

Import the package

```
import net.zubricky.AndroidKeyboardAdjust.AndroidKeyboardAdjustPackage;
```

Add the package to the `getPackages` method

```
@Override
protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
        ...
        new AndroidKeyboardAdjustPackage(this)
    );
}
```

## Example
```
var AndroidKeyboardAdjust = require('NativeModules').AndroidKeyboardAdjust;

AndroidKeyboardAdjust.setAdjustNothing();
AndroidKeyboardAdjust.setAdjustPan();
AndroidKeyboardAdjust.setAdjustResize();
AndroidKeyboardAdjust.setAdjustUnspecified();
```
