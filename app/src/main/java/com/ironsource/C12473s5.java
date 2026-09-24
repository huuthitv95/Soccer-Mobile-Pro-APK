package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12473s5 implements InterfaceC12604xb {

    /* JADX INFO: renamed from: a */
    private final IronSourceError f31884a;

    /* JADX INFO: renamed from: b */
    private final C12125c3 f31885b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12469s1 f31886c;

    public C12473s5(IronSourceError error, C12125c3 adLoadTaskListener, InterfaceC12469s1 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f31884a = error;
        this.f31885b = adLoadTaskListener;
        this.f31886c = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m33293a() {
        return this.f31884a;
    }

    @Override // com.ironsource.InterfaceC12604xb
    public void start() {
        InterfaceC12293l1.c.a aVar = InterfaceC12293l1.c.f30773a;
        aVar.m31985a().mo31960a(this.f31886c);
        aVar.m31986a(new C12397o1.j(this.f31884a.getErrorCode()), new C12397o1.k(this.f31884a.getErrorMessage()), new C12397o1.f(0L)).mo31960a(this.f31886c);
        this.f31885b.mo26684b(this.f31884a);
    }
}
