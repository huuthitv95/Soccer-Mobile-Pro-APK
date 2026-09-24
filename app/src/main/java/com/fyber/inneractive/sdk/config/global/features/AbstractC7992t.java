package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.t */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC7992t {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f17760a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f17760a = iArr;
        try {
            iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17760a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
