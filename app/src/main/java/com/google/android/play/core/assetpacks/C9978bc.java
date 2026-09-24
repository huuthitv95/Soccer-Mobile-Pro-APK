package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10101au;
import com.google.android.play.core.assetpacks.internal.InterfaceC10099as;
import com.google.android.play.core.assetpacks.internal.InterfaceC10102av;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bc */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9978bc implements InterfaceC10099as {

    /* JADX INFO: renamed from: a */
    private final InterfaceC10102av f22054a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC10102av f22055b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC10102av f22056c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC10102av f22057d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC10102av f22058e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC10102av f22059f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC10102av f22060g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC10102av f22061h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC10102av f22062i;

    public C9978bc(InterfaceC10102av interfaceC10102av, InterfaceC10102av interfaceC10102av2, InterfaceC10102av interfaceC10102av3, InterfaceC10102av interfaceC10102av4, InterfaceC10102av interfaceC10102av5, InterfaceC10102av interfaceC10102av6, InterfaceC10102av interfaceC10102av7, InterfaceC10102av interfaceC10102av8, InterfaceC10102av interfaceC10102av9) {
        this.f22054a = interfaceC10102av;
        this.f22055b = interfaceC10102av2;
        this.f22056c = interfaceC10102av3;
        this.f22057d = interfaceC10102av4;
        this.f22058e = interfaceC10102av5;
        this.f22059f = interfaceC10102av6;
        this.f22060g = interfaceC10102av7;
        this.f22061h = interfaceC10102av8;
        this.f22062i = interfaceC10102av9;
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10102av
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo22526a() {
        Context contextM22795b = ((C10141u) this.f22054a).m22795b();
        Object objMo22526a = this.f22055b.mo22526a();
        Object objMo22526a2 = this.f22056c.mo22526a();
        C10097aq c10097aqM22720c = C10097aq.m22720c(C10101au.m22722a(this.f22057d));
        Object objMo22526a3 = this.f22058e.mo22526a();
        return new C9977bb(contextM22795b, (C10034de) objMo22526a, (C10014cl) objMo22526a2, c10097aqM22720c, (C10017co) objMo22526a3, (C9999bx) this.f22059f.mo22526a(), C10097aq.m22720c(C10101au.m22722a(this.f22060g)), C10097aq.m22720c(C10101au.m22722a(this.f22061h)), (C10057ea) this.f22062i.mo22526a());
    }
}
