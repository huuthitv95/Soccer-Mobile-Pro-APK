package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ug */
/* JADX INFO: loaded from: classes3.dex */
public final class C4097ug {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f16498a;

    public C4097ug(SharedPreferences sharedPrefs) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.f16498a = sharedPrefs;
    }

    /* JADX INFO: renamed from: a */
    public final String m19600a(String sharedPrefsKey) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            return this.f16498a.getString(sharedPrefsKey, null);
        } catch (Exception e) {
            C4048sb.m19410b("Load from shared prefs exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19601a(String sharedPrefsKey, String str) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            this.f16498a.edit().putString(sharedPrefsKey, str).apply();
        } catch (Exception e) {
            C4048sb.m19410b("Save to shared prefs exception", e);
        }
    }
}
