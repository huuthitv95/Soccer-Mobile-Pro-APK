package com.ironsource;

import com.ironsource.mediationsdk.C12355h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s0 */
/* JADX INFO: loaded from: classes6.dex */
public class C12468s0 implements InterfaceC12276k2 {

    /* JADX INFO: renamed from: a */
    private final C12220h0 f31863a;

    public C12468s0(C12220h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f31863a = adProperties;
    }

    @Override // com.ironsource.InterfaceC12276k2
    /* JADX INFO: renamed from: a */
    public void mo27435a(C12355h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.m32497b(this.f31863a.m31570c());
        auctionRequestParams.m32492a(this.f31863a.m31567a().toString());
        auctionRequestParams.m32490a(Boolean.TRUE);
    }
}
