package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12544u5 implements InterfaceC12604xb {

    /* JADX INFO: renamed from: a */
    private final InterstitialAdRequest f32544a;

    /* JADX INFO: renamed from: b */
    private final C12602x9 f32545b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12469s1 f32546c;

    /* JADX INFO: renamed from: d */
    private final IronSourceError f32547d;

    public C12544u5(InterstitialAdRequest adRequest, C12602x9 adLoadTaskListener, InterfaceC12469s1 analytics, IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f32544a = adRequest;
        this.f32545b = adLoadTaskListener;
        this.f32546c = analytics;
        this.f32547d = error;
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m33884a() {
        return this.f32547d;
    }

    @Override // com.ironsource.InterfaceC12604xb
    public void start() {
        C12437q5 c12437q5 = new C12437q5(this.f32546c, this.f32544a.getAdId$mediationsdk_release(), this.f32544a.getProviderName$mediationsdk_release());
        c12437q5.m33159a();
        c12437q5.m33160a(this.f32547d);
        this.f32545b.mo26684b(this.f32547d);
    }
}
