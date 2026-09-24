package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C12139d implements InterfaceC11712V5 {

    /* JADX INFO: renamed from: a */
    private final C11770Yc f30190a;

    public C12139d(C11770Yc folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.f30190a = folderRootUrl;
    }

    @Override // com.ironsource.InterfaceC11712V5
    public String value() {
        return this.f30190a.m28053a() + "/abTestMap.json";
    }
}
