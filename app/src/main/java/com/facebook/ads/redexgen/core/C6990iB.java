package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6990iB implements InterfaceC5802Om {
    public final SharedPreferences A00;

    public C6990iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5802Om
    public final C6991iC A6I() {
        return new C6991iC(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5802Om
    public final long A8Q(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5802Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
