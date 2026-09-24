package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10101au;
import com.google.android.play.core.assetpacks.internal.InterfaceC10099as;
import com.google.android.play.core.assetpacks.internal.InterfaceC10102av;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.df */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10035df implements InterfaceC10099as {

    /* JADX INFO: renamed from: a */
    private final InterfaceC10102av f22251a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC10102av f22252b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC10102av f22253c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC10102av f22254d;

    public C10035df(InterfaceC10102av interfaceC10102av, InterfaceC10102av interfaceC10102av2, InterfaceC10102av interfaceC10102av3, InterfaceC10102av interfaceC10102av4) {
        this.f22251a = interfaceC10102av;
        this.f22252b = interfaceC10102av2;
        this.f22253c = interfaceC10102av3;
        this.f22254d = interfaceC10102av4;
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10102av
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22526a() {
        Object objMo22526a = this.f22251a.mo22526a();
        return new C10034de((C9983bh) objMo22526a, C10097aq.m22720c(C10101au.m22722a(this.f22252b)), (C10017co) this.f22253c.mo22526a(), C10097aq.m22720c(C10101au.m22722a(this.f22254d)));
    }
}
