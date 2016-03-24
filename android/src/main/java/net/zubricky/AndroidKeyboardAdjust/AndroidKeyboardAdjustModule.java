package net.zubricky.AndroidKeyboardAdjust;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import android.view.WindowManager;

/**
 * A module to change how the android keyboard is displayed
 */
public class AndroidKeyboardAdjustModule extends ReactContextBaseJavaModule {

    private Activity activity;

    public AndroidKeyboardAdjustModule(ReactApplicationContext reactApplicationContext, Activity activity) {
        super(reactApplicationContext);
        this.activity = activity;
    }

    @Override
    public String getName() {
        return "AndroidKeyboardAdjust";
    }

    @ReactMethod
    public void setAdjustNothing() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
            }
        });
    }

    @ReactMethod
    public void setAdjustPan() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
            }
        });
    }

    @ReactMethod
    public void setAdjustResize() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
            }
        });
    }

    @ReactMethod
    public void setAdjustUnspecified() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED);
            }
        });
    }
}
