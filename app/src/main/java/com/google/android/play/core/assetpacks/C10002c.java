package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.InterfaceC10099as;
import com.google.android.play.core.assetpacks.internal.InterfaceC10102av;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.c */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10002c implements InterfaceC10099as {

    /* JADX INFO: renamed from: a */
    private final InterfaceC10102av f22116a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC10102av f22117b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC10102av f22118c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC10102av f22119d;

    public C10002c(InterfaceC10102av interfaceC10102av, InterfaceC10102av interfaceC10102av2, InterfaceC10102av interfaceC10102av3, InterfaceC10102av interfaceC10102av4) {
        this.f22116a = interfaceC10102av;
        this.f22117b = interfaceC10102av2;
        this.f22118c = interfaceC10102av3;
        this.f22119d = interfaceC10102av4;
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10102av
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22526a() {
        return new BinderC9975b(((C10141u) this.f22116a).m22795b(), (C9983bh) this.f22117b.mo22526a(), (C10130l) this.f22118c.mo22526a(), (ServiceConnectionC10011ci) this.f22119d.mo22526a());
    }
}
