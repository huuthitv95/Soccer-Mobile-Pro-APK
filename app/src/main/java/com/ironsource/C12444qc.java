package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.qc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12444qc implements InterfaceC12426pc {
    @Override // com.ironsource.InterfaceC12426pc
    /* JADX INFO: renamed from: a */
    public void mo33071a(C11471H9 adInstance, C12462rc loadParams) throws Exception {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.m33247a());
    }

    @Override // com.ironsource.InterfaceC12426pc
    /* JADX INFO: renamed from: a */
    public String mo33070a() {
        String version = IronSourceNetwork.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }
}
