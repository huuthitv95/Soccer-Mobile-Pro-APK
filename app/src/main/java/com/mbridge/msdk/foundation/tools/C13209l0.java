package com.mbridge.msdk.foundation.tools;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.l0 */
/* JADX INFO: compiled from: SameDeviceTimeTool.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C13209l0 {
    /* JADX INFO: renamed from: a */
    public static final long m37714a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis > 0) {
                return (jCurrentTimeMillis / 10) * 10;
            }
        } catch (Exception unused) {
        }
        return 0L;
    }
}
