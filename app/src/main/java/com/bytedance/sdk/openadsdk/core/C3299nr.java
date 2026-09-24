package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3435lr;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3525ka;
import com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3524ik;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C3299nr {

    /* JADX INFO: renamed from: ik */
    private static int f11505ik = -1;

    /* JADX INFO: renamed from: lr */
    private static volatile wjv<C3430ri> f11506lr;

    /* JADX INFO: renamed from: ri */
    private static volatile Context f11507ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.nr$ri */
    private static class ri {

        /* JADX INFO: renamed from: ri */
        private static volatile Application f11508ri;

        static {
            try {
                Object objM14644lr = m14644lr();
                f11508ri = (Application) objM14644lr.getClass().getMethod("getApplication", null).invoke(objM14644lr, null);
            } catch (Throwable th) {
                C2707ac.m10206ri("MyApplication", "application get failed", th);
            }
        }

        /* JADX INFO: renamed from: lr */
        private static Object m14644lr() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                C2707ac.m10206ri("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        /* JADX INFO: renamed from: ri */
        public static Application m14645ri() {
            return f11508ri;
        }
    }

    /* JADX INFO: renamed from: fi */
    public static InterfaceC3524ik m14637fi() {
        return !com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri() ? C3525ka.m15961ri() : C3435lr.m15666ri();
    }

    /* JADX INFO: renamed from: ik */
    public static wjv<C3430ri> m14638ik() {
        if (f11506lr == null) {
            synchronized (C3299nr.class) {
                if (f11506lr == null) {
                    f11506lr = new C3112ay(f11507ri);
                }
            }
        }
        return f11506lr;
    }

    /* JADX INFO: renamed from: ka */
    public static C3322sf m14639ka() {
        return C3322sf.m14819lr();
    }

    /* JADX INFO: renamed from: lr */
    public static int m14640lr() {
        Context contextM14642ri;
        if (f11505ik < 0 && (contextM14642ri = m14642ri()) != null) {
            f11505ik = ViewConfiguration.get(contextM14642ri).getScaledTouchSlop();
        }
        return f11505ik;
    }

    /* JADX INFO: renamed from: lr */
    public static void m14641lr(Context context) {
        if (f11507ri == null) {
            synchronized (C3299nr.class) {
                if (f11507ri == null) {
                    if (context != null) {
                        f11507ri = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            f11507ri = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application applicationM14645ri = ri.m14645ri();
                        if (applicationM14645ri != null) {
                            f11507ri = applicationM14645ri;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Context m14642ri() {
        if (f11507ri == null) {
            m14641lr(null);
        }
        return f11507ri;
    }

    /* JADX INFO: renamed from: ri */
    public static Context m14643ri(Context context) {
        if (context == null) {
            context = m14642ri();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }
}
