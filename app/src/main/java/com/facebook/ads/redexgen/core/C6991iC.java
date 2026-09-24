package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6991iC implements InterfaceC5801Ol {
    public final SharedPreferences.Editor A00;

    public C6991iC(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C6991iC A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C6991iC A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
