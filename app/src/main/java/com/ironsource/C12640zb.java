package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.zb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12640zb implements InterfaceC11611P5<C12622yb> {

    /* JADX INFO: renamed from: a */
    private final String f33297a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12463rd f33298b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12203g1 f33299c;

    /* JADX INFO: renamed from: d */
    private final boolean f33300d;

    public C12640zb(String adm, InterfaceC12463rd providerName, InterfaceC12203g1 adapterConfigs, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.f33297a = adm;
        this.f33298b = providerName;
        this.f33299c = adapterConfigs;
        this.f33300d = z;
    }

    @Override // com.ironsource.InterfaceC11611P5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12622yb mo27200a() throws Exception {
        InterfaceC12283k9 interfaceC12283k9Mo31515a = this.f33299c.mo31515a(this.f33298b);
        new C11689U(this.f33297a, interfaceC12283k9Mo31515a, this.f33300d).mo26555a();
        if (interfaceC12283k9Mo31515a != null) {
            return new C12622yb(interfaceC12283k9Mo31515a.mo25705f(), interfaceC12283k9Mo31515a.mo25704e(), interfaceC12283k9Mo31515a.mo25701b(), interfaceC12283k9Mo31515a.mo25703d(), false, 16, null);
        }
        return null;
    }
}
