package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.NativeAdViewTypeApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.S5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6003S5 implements NativeAdViewTypeApi {
    public final EnumC6222Ve A00;

    public C6003S5(int i) {
        this.A00 = EnumC6222Ve.A00(i);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getHeight() {
        return this.A00.A04();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getValue() {
        return this.A00.A05();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getWidth() {
        return this.A00.A06();
    }
}
