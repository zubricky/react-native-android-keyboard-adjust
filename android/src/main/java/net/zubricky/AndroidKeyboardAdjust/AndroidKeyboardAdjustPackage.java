package net.zubricky.AndroidKeyboardAdjust;

import android.app.Activity;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AndroidKeyboardAdjustPackage implements ReactPackage {

    private final AndroidKeyboardAdjustModuleBuilder builder;

    public AndroidKeyboardAdjustPackage() {
        this (new AndroidKeyboardAdjustModuleBuilder());
    }

    public AndroidKeyboardAdjustPackage(AndroidKeyboardAdjustModuleBuilder builder) {
        this.builder = builder;
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.<NativeModule>singletonList(new AndroidKeyboardAdjustModule(reactApplicationContext));
    }

    @NonNull
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull final ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }
}
