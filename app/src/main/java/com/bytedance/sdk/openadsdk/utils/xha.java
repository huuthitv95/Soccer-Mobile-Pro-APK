package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.sdk.openadsdk.core.C3299nr;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: ik */
    private static long f13346ik = 0;

    /* JADX INFO: renamed from: lr */
    static float f13347lr = 0.0f;

    /* JADX INFO: renamed from: ri */
    static int f13348ri = -1;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.xha$ri */
    public static class C3598ri {

        /* JADX INFO: renamed from: lr */
        public final float f13349lr;

        /* JADX INFO: renamed from: ri */
        public final int f13350ri;

        public C3598ri(int i, float f) {
            this.f13350ri = i;
            this.f13349lr = f;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3598ri m16681ri() {
        if (f13346ik == 0 || SystemClock.elapsedRealtime() - f13346ik > 60000) {
            Intent intentRegisterReceiver = C3299nr.m14642ri().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                m16682ri(intentRegisterReceiver);
                f13346ik = SystemClock.elapsedRealtime();
            }
        }
        C3598ri c3598ri = new C3598ri(f13348ri, f13347lr);
        int i = c3598ri.f13350ri;
        float f = c3598ri.f13349lr;
        return c3598ri;
    }

    /* JADX INFO: renamed from: ri */
    private static void m16682ri(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            f13348ri = 1;
        } else {
            f13348ri = 0;
        }
        f13347lr = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }
}
