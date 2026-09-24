package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* JADX INFO: renamed from: com.pgl.ssdk.aa */
/* JADX INFO: loaded from: classes7.dex */
public class C14243aa {

    /* JADX INFO: renamed from: a */
    private static volatile DisplayManager.DisplayListener f41212a;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f41213b;

    /* JADX INFO: renamed from: c */
    private static String f41214c;

    /* JADX INFO: renamed from: d */
    private static String f41215d;

    /* JADX INFO: renamed from: e */
    private static String f41216e;

    /* JADX INFO: renamed from: f */
    private static volatile boolean f41217f;

    /* JADX INFO: renamed from: g */
    private static volatile boolean f41218g;

    /* JADX INFO: renamed from: h */
    private static DisplayManager f41219h;

    /* JADX INFO: renamed from: com.pgl.ssdk.aa$a */
    static class a implements DisplayManager.DisplayListener {
        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            C14243aa.m42804b(i, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            C14243aa.m42804b(i, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            C14243aa.m42804b(i, 2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m42800a(int i) {
        Display display = f41219h.getDisplay(i);
        return display != null ? m42801a(display) : "pd";
    }

    /* JADX INFO: renamed from: a */
    private static String m42801a(Display display) {
        String name = display.getName();
        Object objM43010a = C14264av.m43010a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objM43010a2 = C14264av.m43010a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objM43009a = C14264av.m43009a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objM43010a2, name, Boolean.valueOf((objM43010a == null || objM43009a == null || ((Integer) objM43010a).intValue() != ((Integer) objM43009a).intValue()) ? false : true));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m42803a(Context context) {
        Display[] displays;
        if (f41213b && (f41214c != null || f41215d != null || f41216e != null)) {
            return true;
        }
        if (f41213b && f41217f) {
            return f41218g;
        }
        if (context == null) {
            return false;
        }
        if (f41219h == null) {
            f41219h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f41219h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            for (Display display : displays) {
                if (display != null && display.getDisplayId() != 0) {
                    f41218g = true;
                    break;
                }
            }
        }
        f41217f = true;
        return f41218g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m42804b(int i, int i2) {
        if (i == 0) {
            return;
        }
        try {
            String strM42800a = m42800a(i);
            if (i2 == 1) {
                if (strM42800a.equals(f41214c)) {
                    return;
                }
                f41214c = strM42800a;
            } else if (i2 == 2) {
                if (strM42800a.equals(f41215d)) {
                    return;
                }
                f41215d = strM42800a;
            } else {
                if (i2 != 3 || strM42800a.equals(f41216e)) {
                    return;
                }
                f41216e = strM42800a;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m42805b(Context context) {
        Handler handlerM42994b;
        if (f41213b) {
            return;
        }
        if (f41212a == null) {
            f41212a = new a();
        }
        if (f41219h == null) {
            f41219h = (DisplayManager) context.getSystemService("display");
        }
        if (f41219h == null || (handlerM42994b = C14260ar.m42994b()) == null) {
            return;
        }
        try {
            f41219h.registerDisplayListener(f41212a, handlerM42994b);
            f41213b = true;
        } catch (Exception unused) {
        }
    }
}
