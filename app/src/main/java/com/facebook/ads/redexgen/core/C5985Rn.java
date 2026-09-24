package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5985Rn implements BidderTokenProviderApi {
    public final C6047So A00 = new C6047So();

    public final C6047So A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C5987Rp.A09(context));
    }
}
