package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.be */
/* JADX INFO: loaded from: classes6.dex */
public final class C12118be implements InterfaceC11452G8, InterfaceC11452G8.a {

    /* JADX INFO: renamed from: a */
    private C12100ae f30137a;

    /* JADX INFO: renamed from: b */
    private boolean f30138b;

    @Override // com.ironsource.InterfaceC11452G8
    /* JADX INFO: renamed from: a */
    public C11666Sa mo25856a() {
        C12100ae c12100ae = this.f30137a;
        if (c12100ae != null) {
            return new C11666Sa(c12100ae);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC11452G8
    /* JADX INFO: renamed from: b */
    public C11507J9 mo25857b() {
        C12100ae c12100ae = this.f30137a;
        if (c12100ae != null) {
            return new C11507J9(c12100ae);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC11452G8
    /* JADX INFO: renamed from: c */
    public boolean mo25858c() {
        return this.f30138b;
    }

    @Override // com.ironsource.InterfaceC11452G8.a
    /* JADX INFO: renamed from: d */
    public void mo25860d() {
        this.f30138b = true;
    }

    @Override // com.ironsource.InterfaceC11452G8.a
    /* JADX INFO: renamed from: a */
    public void mo25859a(C12100ae sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f30137a = sdkConfig;
    }
}
