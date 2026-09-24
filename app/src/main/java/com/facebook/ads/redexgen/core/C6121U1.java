package com.facebook.ads.redexgen.core;

import com.facebook.ads.AudienceNetworkAds;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.U1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6121U1 implements AudienceNetworkAds.InitResult {
    public final String A00;
    public final boolean A01;

    public C6121U1(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        return this.A00;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return this.A01;
    }
}
