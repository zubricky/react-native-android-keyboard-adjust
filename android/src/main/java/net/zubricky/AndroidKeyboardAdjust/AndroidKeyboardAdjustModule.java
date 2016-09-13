package net.zubricky.AndroidKeyboardAdjust;

import android.app.Activity;
import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * A module to change how the android keyboard is displayed
 */
public class AndroidKeyboardAdjustModule extends ReactContextBaseJavaModule {

    private Activity activity;

    public AndroidKeyboardAdjustModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.activity = getCurrentActivity();
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

    @ReactMethod
    public void setAlwaysHidden() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
            }
        });
    }

    @ReactMethod
    public void setAlwaysVisible() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
            }
        });
    }

    @ReactMethod
    public void setVisible() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
            }
        });
    }

    @ReactMethod
    public void setHidden() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
            }
        });
    }

    @ReactMethod
    public void setUnchanged() {
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AndroidKeyboardAdjustModule.this.activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_UNCHANGED);
            }
        });
    }
}
