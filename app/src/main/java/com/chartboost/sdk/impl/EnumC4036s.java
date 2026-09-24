package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4036s {
    BANNER,
    INTERSTITIAL,
    REWARDED;


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f16211f = EnumEntriesKt.enumEntries(m19366a());

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.s$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16212a;

        static {
            int[] iArr = new int[EnumC4036s.values().length];
            try {
                iArr[EnumC4036s.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16212a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19367b() {
        return a.f16212a[ordinal()] == 1;
    }
}
