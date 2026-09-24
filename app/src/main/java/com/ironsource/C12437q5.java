package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12437q5 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12469s1 f31778a;

    public C12437q5(InterfaceC12469s1 analytics, String adRequestAdId, InterfaceC12463rd adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.f31778a = analytics;
        analytics.mo31926a(new C12397o1.s(adRequestProviderName.value()), new C12397o1.b(adRequestAdId));
    }

    /* JADX INFO: renamed from: a */
    public final void m33159a() {
        InterfaceC12293l1.c.f30773a.m31985a().mo31960a(this.f31778a);
    }

    /* JADX INFO: renamed from: a */
    public final void m33160a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC12293l1.c.f30773a.m31986a(new C12397o1.j(error.getErrorCode()), new C12397o1.k(error.getErrorMessage()), new C12397o1.f(0L)).mo31960a(this.f31778a);
    }
}
