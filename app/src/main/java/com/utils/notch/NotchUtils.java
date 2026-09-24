package com.utils.notch;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes7.dex */
public class NotchUtils {
    public static final int VIVO_FILLET = 8;
    public static final int VIVO_NOTCH = 32;
    static Context _context;
    static boolean _hasNotch;
    static boolean _isInit;
    static int _notchHeight;

    protected static void getAndroidP() {
        Log.i("Notch", "getAndroidP");
        final View decorView = ((Activity) _context).getWindow().getDecorView();
        ((Activity) _context).runOnUiThread(new Runnable() { // from class: com.utils.notch.NotchUtils.1
            @Override // java.lang.Runnable
            public void run() {
                Log.i("Notch", "displayFullScreen");
                Window window = ((Activity) NotchUtils._context).getWindow();
                window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
                DisplayCutout displayCutout = decorView.getRootWindowInsets().getDisplayCutout();
                if (displayCutout != null) {
                    Log.i("Notch", "has displayCutout:");
                    NotchUtils._hasNotch = true;
                    NotchUtils._notchHeight = displayCutout.getSafeInsetTop();
                } else {
                    Log.i("Notch", "doesn't have displayCutout:");
                }
                NotchUtils._isInit = true;
            }
        });
    }

    protected static void getHuawei() {
        try {
            Class<?> clsLoadClass = _context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            boolean zBooleanValue = ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
            _hasNotch = zBooleanValue;
            if (zBooleanValue) {
                int[] iArr = (int[]) clsLoadClass.getMethod("getNotchSize", null).invoke(clsLoadClass, null);
                if (iArr == null || iArr.length != 2) {
                    Log.e("Notch", "getHuawei > getNotchSize fail");
                    _hasNotch = false;
                } else {
                    _notchHeight = iArr[1];
                }
            } else {
                Log.e("Notch", "getHuawei > _hasNotch: false");
            }
        } catch (Exception e) {
            Log.e("Notch", e.toString());
        }
        _isInit = true;
    }

    public static int getNotchHeight() {
        return _notchHeight;
    }

    protected static void getNotchInfo() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            Log.i("Notch", "OSVersion: " + i);
            getAndroidP();
            return;
        }
        String upperCase = Build.MANUFACTURER.toUpperCase();
        Log.i("Notch", "phoneUpperModel:" + upperCase);
        if (upperCase.contains("HUAWEI")) {
            getHuawei();
            return;
        }
        if (upperCase.contains("XIAOMI")) {
            getXiaomi();
            return;
        }
        if (upperCase.contains("OPPO")) {
            getOppo();
        } else if (upperCase.contains("VIVO")) {
            getVivo();
        } else {
            _isInit = true;
        }
    }

    protected static void getOppo() {
        boolean zHasSystemFeature = _context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        _hasNotch = zHasSystemFeature;
        if (zHasSystemFeature) {
            _notchHeight = 80;
        } else {
            Log.e("Notch", "getOppo > _hasNotch: false");
        }
        _isInit = true;
    }

    protected static void getVivo() {
        try {
            Class<?> clsLoadClass = _context.getClassLoader().loadClass("android.util.FtFeature");
            boolean zBooleanValue = ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
            _hasNotch = zBooleanValue;
            if (zBooleanValue) {
                _notchHeight = 32;
            } else {
                Log.e("Notch", "getVivo > _hasNotch: false");
            }
        } catch (Exception e) {
            Log.e("Notch", e.toString());
        }
        _isInit = true;
    }

    protected static void getXiaomi() {
        try {
            Class<?> clsLoadClass = _context.getClassLoader().loadClass("android.os.SystemProperties");
            String str = (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, "ro.miui.notch");
            Log.e("Notch", "getXiaomi > strNotch: " + str);
            boolean z = str.compareTo("1") == 0;
            _hasNotch = z;
            if (z) {
                String str2 = Build.MODEL;
                Log.e("Notch", "BUILD.Model: " + str2);
                if (str2.contains("MI8Lite")) {
                    _notchHeight = 82;
                } else if (str2.contains("MI 8 SE")) {
                    _notchHeight = 85;
                } else if (str2.contains("POCO F1")) {
                    _notchHeight = 86;
                } else if (str2.contains("MI 8") || str2.contains("MI 8 Explorer Edition") || str2.contains("MI 8 UD") || str2.contains("Redmi 6 Pro") || str2.contains("MI 9")) {
                    _notchHeight = 89;
                } else {
                    int identifier = _context.getResources().getIdentifier("notch_height", "dimen", "android");
                    Log.e("Notch", "getXiaomi > resourceId: " + identifier);
                    if (identifier > 0) {
                        _notchHeight = _context.getResources().getDimensionPixelSize(identifier);
                    } else {
                        _hasNotch = false;
                    }
                }
            } else {
                Log.e("Notch", "getXiaomi > _hasNotch: false");
            }
        } catch (Exception e) {
            Log.e("Notch", e.toString());
        }
        _isInit = true;
    }

    public static boolean hasNotch() {
        return _hasNotch;
    }

    public static void init(Context context) {
        _context = context;
        getNotchInfo();
    }

    public static boolean isInitDone() {
        return _isInit;
    }
}
