package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.C3278di;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3569fi {

    /* JADX INFO: renamed from: ik */
    private static boolean f13143ik;

    /* JADX INFO: renamed from: lr */
    private static long f13144lr;

    /* JADX INFO: renamed from: ri */
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.wjv> f13145ri;

    /* JADX INFO: renamed from: ik */
    public static boolean m16415ik() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.wjv> weakReference = f13145ri;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        f13143ik = true;
        return true;
    }

    /* JADX INFO: renamed from: lr */
    public static void m16416lr() {
        if (f13145ri == null || f13143ik) {
            return;
        }
        f13144lr = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: lr */
    private static void m16417lr(final long j) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.wjv> weakReference = f13145ri;
        if (weakReference == null || j <= 0 || (wjvVar = weakReference.get()) == null) {
            return;
        }
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, wjvVar.m14394fi(), "store_duration", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.utils.fi.1
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        f13145ri = null;
        f13143ik = false;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16418ri() {
        if (f13145ri == null || f13143ik) {
            return;
        }
        if (f13144lr > 0) {
            m16417lr(SystemClock.elapsedRealtime() - f13144lr);
        }
        f13145ri = null;
        f13144lr = 0L;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16419ri(long j) {
        m16417lr(j);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16420ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        C3278di c3278diTyz = wjvVar.tyz();
        if (c3278diTyz == null || TextUtils.isEmpty(c3278diTyz.m14077ri())) {
            return;
        }
        f13145ri = new WeakReference<>(wjvVar);
    }
}
