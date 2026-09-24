package com.bytedance.adsdk.ugeno.p090di;

import java.util.Collection;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2250ka {
    /* JADX INFO: renamed from: ri */
    public static int m7474ri(boolean z, int i, int i2) {
        if (i2 == 0 || !z) {
            return i;
        }
        int i3 = i - 512;
        int iAbs = Math.abs(i3) % i2;
        return (i3 >= 0 || iAbs == 0) ? iAbs : i2 - iAbs;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m7475ri(int i, Collection<?> collection) {
        return i >= 0 && i < collection.size();
    }
}
