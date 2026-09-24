package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.jg */
/* JADX INFO: loaded from: classes6.dex */
public final class C12272jg implements InterfaceC11712V5 {

    /* JADX INFO: renamed from: a */
    private final C11770Yc f30711a;

    /* JADX INFO: renamed from: b */
    private final String f30712b;

    public C12272jg(C11770Yc folderRootUrl, String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f30711a = folderRootUrl;
        this.f30712b = version;
    }

    /* JADX INFO: renamed from: a */
    public final String m31914a() {
        return this.f30712b;
    }

    @Override // com.ironsource.InterfaceC11712V5
    public String value() {
        return this.f30711a.m28053a() + "/versions/" + this.f30712b + "/mobileController.html";
    }
}
