package com.bytedance.sdk.openadsdk.p246nr.p248ka;

import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nr.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3479ri {
    /* JADX INFO: renamed from: ri */
    public static long m15767ri() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15768ri(long j) {
        return j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS) == m15767ri();
    }
}
