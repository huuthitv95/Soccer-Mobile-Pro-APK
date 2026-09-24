package com.ironsource;

import com.ironsource.mediationsdk.C12355h;
import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.S2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11658S2 extends C12468s0 {

    /* JADX INFO: renamed from: b */
    private final ISBannerSize f25621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11658S2(C12220h0 adProperties, ISBannerSize iSBannerSize) {
        super(adProperties);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f25621b = iSBannerSize;
    }

    @Override // com.ironsource.C12468s0, com.ironsource.InterfaceC12276k2
    /* JADX INFO: renamed from: a */
    public void mo27435a(C12355h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.mo27435a(auctionRequestParams);
        auctionRequestParams.m32489a(this.f25621b);
    }
}
