package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.C14271a;
import java.util.Arrays;

/* JADX INFO: renamed from: com.pgl.ssdk.y */
/* JADX INFO: loaded from: classes7.dex */
public class C14295y {

    /* JADX INFO: renamed from: a */
    private static int f41356a;

    /* JADX INFO: renamed from: b */
    private static int f41357b;

    /* JADX INFO: renamed from: c */
    private static int f41358c;

    /* JADX INFO: renamed from: d */
    private static int f41359d;

    /* JADX INFO: renamed from: e */
    private static int f41360e;

    /* JADX INFO: renamed from: f */
    private static int f41361f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f41362g;

    /* JADX INFO: renamed from: h */
    private static boolean f41363h;

    /* JADX INFO: renamed from: i */
    private static InputManager f41364i;

    /* JADX INFO: renamed from: com.pgl.ssdk.y$a */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f41365a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f41366b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f41367c;

        a(String str, Context context, int i) {
            this.f41365a = str;
            this.f41366b = context;
            this.f41367c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C14295y.f41362g) {
                C14271a.meta(171, null, this.f41365a);
            }
            InputManager inputManagerM43145b = C14295y.m43145b(this.f41366b);
            if (inputManagerM43145b == null) {
                return;
            }
            InputDevice inputDevice = inputManagerM43145b.getInputDevice(this.f41367c);
            C14295y.m43152h();
            if (inputDevice == null) {
                C14295y.m43143b();
                C14295y.m43146c();
                C14295y.m43147c("nihc");
            } else if (inputDevice.isVirtual()) {
                C14295y.m43148d();
                C14295y.m43149e();
                C14295y.m43147c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                C14295y.m43150f();
                C14295y.m43151g();
                C14295y.m43147c("eihc");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX INFO: renamed from: a */
    public static void m43141a(MotionEvent motionEvent, Context context) {
        String string;
        if (motionEvent == null || context == null) {
            return;
        }
        if (f41362g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    string = Arrays.toString(new Exception().getStackTrace());
                    if (string.contains("android.view.InputEventReceiver") || string.contains("android.view.ViewRootImpl$WindowInputEventReceiver") || string.contains("android.view.ViewRootImpl$InputStage")) {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        C14260ar.m42995b(new a(string, context, motionEvent.getDeviceId()));
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ int m43143b() {
        int i = f41358c;
        f41358c = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m43144b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        m43152h();
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "eic":
                return f41357b;
            case "nic":
                return f41358c;
            case "vic":
                return f41356a;
            case "eihc":
                return f41360e;
            case "nihc":
                return f41361f;
            case "vihc":
                return f41359d;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static InputManager m43145b(Context context) {
        if (f41364i == null) {
            f41364i = (InputManager) context.getSystemService("input");
        }
        return f41364i;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ int m43146c() {
        int i = f41361f;
        f41361f = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m43147c(String str) {
        try {
            SharedPreferences sharedPreferencesM43024a = C14266ax.m43024a(C14296z.m43153a());
            if (sharedPreferencesM43024a != null) {
                sharedPreferencesM43024a.edit().putInt(str, sharedPreferencesM43024a.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ int m43148d() {
        int i = f41356a;
        f41356a = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ int m43149e() {
        int i = f41359d;
        f41359d = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ int m43150f() {
        int i = f41357b;
        f41357b = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ int m43151g() {
        int i = f41360e;
        f41360e = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static void m43152h() {
        if (f41363h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesM43024a = C14266ax.m43024a(C14296z.m43153a());
            if (sharedPreferencesM43024a != null) {
                f41361f = sharedPreferencesM43024a.getInt("nihc", 0);
                f41360e = sharedPreferencesM43024a.getInt("eihc", 0);
                f41359d = sharedPreferencesM43024a.getInt("vihc", 0);
                f41363h = true;
            }
        } catch (Throwable unused) {
        }
    }
}
