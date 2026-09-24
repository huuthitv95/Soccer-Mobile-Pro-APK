package com.chartboost.sdk.impl;

import com.unity3d.ads.BuildConfig;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.tc */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4071tc {
    DEFAULT(BuildConfig.FLAVOR),
    EXPANDED("expanded"),
    HIDDEN("hidden"),
    LOADING("loading"),
    RESIZED("resized");


    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumEntries f16338i = EnumEntriesKt.enumEntries(m19481a());

    /* JADX INFO: renamed from: b */
    public final String f16339b;

    EnumC4071tc(String str) {
        this.f16339b = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m19482b() {
        return this.f16339b;
    }
}
