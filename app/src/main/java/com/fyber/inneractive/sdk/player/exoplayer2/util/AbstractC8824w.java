package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.w */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8824w {
    /* JADX INFO: renamed from: a */
    public static void m21373a() {
        if (AbstractC8827z.f20671a >= 18) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21374a(String str) {
        if (AbstractC8827z.f20671a >= 18) {
            Trace.beginSection(str);
        }
    }
}
