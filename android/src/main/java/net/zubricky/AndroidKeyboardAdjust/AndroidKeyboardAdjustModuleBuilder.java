package net.zubricky.AndroidKeyboardAdjust;

import com.facebook.react.bridge.ReactApplicationContext;

public class AndroidKeyboardAdjustModuleBuilder {

  private ReactApplicationContext reactContext;

  public AndroidKeyboardAdjustModuleBuilder withReactContext(ReactApplicationContext reactContext) {
    this.reactContext = reactContext;
    return this;
  }


  public AndroidKeyboardAdjustModule build() {
    validate();
    return new AndroidKeyboardAdjustModule(reactContext);
  }

  private void validate() {
    if (reactContext == null) {
      throw new Error("React Context was not provided");
    }
  }

}
