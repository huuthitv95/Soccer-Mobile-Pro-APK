package com.bytedance.sdk.openadsdk.p236ka;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3427mj {

    /* JADX INFO: renamed from: fi */
    private static boolean f12382fi;

    /* JADX INFO: renamed from: ik */
    private static Method f12383ik;

    /* JADX INFO: renamed from: ka */
    private static Method f12384ka;

    /* JADX INFO: renamed from: lr */
    private static Class<?> f12385lr;

    /* JADX INFO: renamed from: ri */
    private static Method f12386ri;

    static {
        m15614lr();
    }

    /* JADX INFO: renamed from: ik */
    private static boolean m15613ik() {
        return C3606fi.m16703ri("s_i_e", 0) == 1;
    }

    /* JADX INFO: renamed from: lr */
    private static void m15614lr() {
        if (f12382fi || Build.VERSION.SDK_INT < 35) {
            return;
        }
        try {
            if (m15613ik()) {
                f12386ri = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                f12385lr = cls;
                f12384ka = cls.getMethod("getReason", null);
                if (Build.VERSION.SDK_INT >= 36) {
                    f12383ik = f12385lr.getMethod("getStartComponent", null);
                }
                f12382fi = true;
            }
        } catch (Throwable th) {
            C2707ac.m10197ik(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m15615ri() {
        Throwable th;
        JSONObject jSONObject;
        Method method;
        List list;
        Method method2;
        Method method3;
        if (Build.VERSION.SDK_INT < 35 || !m15613ik()) {
            return null;
        }
        m15614lr();
        try {
            jSONObject = new JSONObject();
            try {
                ActivityManager activityManager = (ActivityManager) C3299nr.m14642ri().getSystemService(ActivityManager.class);
                if (activityManager != null && (method = f12386ri) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                    Object obj = list.get(0);
                    if (Build.VERSION.SDK_INT >= 36 && obj != null && (method3 = f12383ik) != null) {
                        jSONObject.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                    }
                    if (obj != null && (method2 = f12384ka) != null) {
                        jSONObject.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                    }
                }
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                C2707ac.m10197ik(th.getMessage(), new Object[0]);
                return jSONObject;
            }
        } catch (Throwable th3) {
            th = th3;
            jSONObject = null;
        }
    }
}
