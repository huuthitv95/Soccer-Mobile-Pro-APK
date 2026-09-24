package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Gg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11460Gg implements InterfaceC11496Ig {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11370Bg f24393a;

    /* JADX INFO: renamed from: b */
    private int f24394b;

    public C11460Gg(InterfaceC11370Bg waterfallOperations) {
        Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.f24393a = waterfallOperations;
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: a */
    public void mo25804a(AbstractC11353B it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f24394b++;
        this.f24393a.mo25514a(it);
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: b */
    public EnumC11349Ad mo25805b() {
        if (this.f24394b >= 2) {
            return EnumC11349Ad.MAX_ATTEMPTS_REACHED;
        }
        return !this.f24393a.mo25515b() ? EnumC11349Ad.NO_LOADED_ADS : EnumC11349Ad.CAN_RECOVER;
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: c */
    public AbstractC11353B mo25806c() {
        return this.f24393a.mo25512a(this.f24394b);
    }

    @Override // com.ironsource.InterfaceC11496Ig
    /* JADX INFO: renamed from: a */
    public void mo25803a() {
        this.f24393a.mo25513a();
    }
}
