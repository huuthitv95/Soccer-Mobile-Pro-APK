package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.WT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6270WT {
    public static void A00(AbstractRunnableC6266WP abstractRunnableC6266WP) {
        new Handler(Looper.getMainLooper()).post(abstractRunnableC6266WP);
    }
}
