package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.f1 */
/* JADX INFO: compiled from: ViewUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13197f1 {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f36290a = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public static void m37674a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37676b(Window window) {
        if (window != null) {
            try {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } catch (Throwable th) {
                C13219q0.m37816b("ViewUtil", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m37677c(Window window) {
        if (window != null) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (i >= 30) {
                        attributes.layoutInDisplayCutoutMode = 3;
                    } else {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                    window.setAttributes(attributes);
                }
            } catch (Throwable th) {
                C13219q0.m37816b("ViewUtil", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m37678d(Window window) {
        if (window != null) {
            try {
                window.requestFeature(1);
                window.setFlags(1024, 1024);
                window.addFlags(512);
            } catch (Throwable th) {
                C13219q0.m37816b("ViewUtil", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37675a(Window window) {
        if (window != null) {
            try {
                window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } catch (Throwable th) {
                C13219q0.m37816b("ViewUtil", th.getMessage());
            }
        }
    }
}
