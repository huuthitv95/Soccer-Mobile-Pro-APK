package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Fg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11442Fg implements InterfaceC11496Ig {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11370Bg f24324a;

    public C11442Fg(InterfaceC11370Bg waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.f24324a = waterfallOperations;
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: a */
    public void mo25803a() {
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: a */
    public void mo25804a(AbstractC11353B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f24324a.mo25514a(it);
        this.f24324a.mo25513a();
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: b */
    public EnumC11349Ad mo25805b() {
        return EnumC11349Ad.FEATURE_DISABLED;
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: c */
    public AbstractC11353B mo25806c() {
        return this.f24324a.mo25512a(0);
    }
}
