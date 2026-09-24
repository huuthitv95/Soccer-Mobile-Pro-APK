package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6120Tz implements AdSizeApi {
    public final /* synthetic */ DynamicLoaderImpl A00;
    public final /* synthetic */ EnumC6231Vp A01;

    public C6120Tz(DynamicLoaderImpl dynamicLoaderImpl, EnumC6231Vp enumC6231Vp) {
        this.A00 = dynamicLoaderImpl;
        this.A01 = enumC6231Vp;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A01.A03();
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01.A04();
    }
}
