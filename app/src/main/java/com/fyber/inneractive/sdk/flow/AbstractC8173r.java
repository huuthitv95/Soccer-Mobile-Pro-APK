package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.r */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8173r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18207a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f18207a = iArr;
        try {
            iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18207a[UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
