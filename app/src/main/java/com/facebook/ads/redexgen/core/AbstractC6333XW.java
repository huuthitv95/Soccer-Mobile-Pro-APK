package com.facebook.ads.redexgen.core;

import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6333XW {
    public static final AtomicReference<DisplayMetrics> A00 = new AtomicReference<>();

    public static DisplayMetrics A00() {
        if (A00.get() != null) {
            return A00.get();
        }
        return AbstractC6334XX.A04;
    }
}
