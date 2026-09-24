package com.fyber.inneractive.sdk.cache.session.enums;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.enums.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC7918b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f17599a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f17599a = iArr;
        try {
            iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17599a[UnitDisplayType.MRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17599a[UnitDisplayType.BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17599a[UnitDisplayType.INTERSTITIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
