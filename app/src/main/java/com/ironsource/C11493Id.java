package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Id */
/* JADX INFO: loaded from: classes6.dex */
public final class C11493Id implements InterfaceC12283k9 {

    /* JADX INFO: renamed from: a */
    private final C12159e1 f24506a;

    /* JADX INFO: renamed from: b */
    private final C11652Rd f24507b;

    public C11493Id(C12159e1 adapterConfig, C11652Rd adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f24506a = adapterConfig;
        this.f24507b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC12185f1
    /* JADX INFO: renamed from: a */
    public boolean mo25700a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC12556v
    /* JADX INFO: renamed from: b */
    public long mo25701b() {
        return this.f24507b.m27388i();
    }

    @Override // com.ironsource.InterfaceC12185f1
    /* JADX INFO: renamed from: c */
    public String mo25702c() {
        String strM31340f = this.f24506a.m31340f();
        Intrinsics.checkNotNullExpressionValue(strM31340f, "adapterConfig.providerName");
        return strM31340f;
    }

    @Override // com.ironsource.InterfaceC12185f1
    /* JADX INFO: renamed from: d */
    public boolean mo25703d() {
        return !this.f24506a.m31344j();
    }

    @Override // com.ironsource.InterfaceC12185f1
    /* JADX INFO: renamed from: e */
    public String mo25704e() {
        String strM31335a = this.f24506a.m31335a();
        Intrinsics.checkNotNullExpressionValue(strM31335a, "adapterConfig.adSourceNameForEvents");
        return strM31335a;
    }

    @Override // com.ironsource.InterfaceC12185f1
    /* JADX INFO: renamed from: f */
    public EnumC12322m9 mo25705f() {
        return EnumC12322m9.f30962b.m32220a(this.f24506a.m31338d());
    }
}
