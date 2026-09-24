package com.chartboost.sdk.impl;

import com.facebook.internal.AnalyticsEvents;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.sd */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4050sd {
    UNKNOWN(0, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN),
    ETHERNET(1, "Ethernet"),
    WIFI(2, "WIFI"),
    CELLULAR_UNKNOWN(3, "Cellular_Unknown"),
    CELLULAR_2G(4, "Cellular_2G"),
    CELLULAR_3G(5, "Cellular_3G"),
    CELLULAR_4G(6, "Cellular_4G"),
    CELLULAR_5G(7, "Cellular_5G");


    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumEntries f16276m = EnumEntriesKt.enumEntries(m19426a());

    /* JADX INFO: renamed from: b */
    public final int f16277b;

    /* JADX INFO: renamed from: c */
    public final String f16278c;

    EnumC4050sd(int i, String str) {
        this.f16277b = i;
        this.f16278c = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m19427b() {
        return this.f16278c;
    }

    /* JADX INFO: renamed from: c */
    public final int m19428c() {
        return this.f16277b;
    }
}
