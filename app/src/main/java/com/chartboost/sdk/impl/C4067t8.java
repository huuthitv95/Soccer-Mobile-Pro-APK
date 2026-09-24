package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.t8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4067t8 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f16328a;

    public C4067t8(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f16328a = defaultSharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final String m19462a() {
        return this.f16328a.getString("IABGPP_GppSID", null);
    }

    /* JADX INFO: renamed from: b */
    public final String m19463b() {
        return this.f16328a.getString("IABGPP_HDR_GppString", null);
    }
}
