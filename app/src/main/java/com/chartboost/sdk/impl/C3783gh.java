package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.gh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3783gh {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f14333a;

    public C3783gh(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f14333a = defaultSharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final String m17811a() {
        return this.f14333a.getString("IABTCF_TCString", null);
    }
}
