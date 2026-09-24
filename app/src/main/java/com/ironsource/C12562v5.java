package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12562v5 implements InterfaceC12604xb {

    /* JADX INFO: renamed from: a */
    private final RewardedAdRequest f32589a;

    /* JADX INFO: renamed from: b */
    private final C11583Nd f32590b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12469s1 f32591c;

    /* JADX INFO: renamed from: d */
    private final IronSourceError f32592d;

    public C12562v5(RewardedAdRequest adRequest, C11583Nd adLoadTaskListener, InterfaceC12469s1 analytics, IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f32589a = adRequest;
        this.f32590b = adLoadTaskListener;
        this.f32591c = analytics;
        this.f32592d = error;
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m33925a() {
        return this.f32592d;
    }

    @Override // com.ironsource.InterfaceC12604xb
    public void start() {
        C12437q5 c12437q5 = new C12437q5(this.f32591c, this.f32589a.getAdId$mediationsdk_release(), this.f32589a.getProviderName$mediationsdk_release());
        c12437q5.m33159a();
        c12437q5.m33160a(this.f32592d);
        this.f32590b.mo26684b(this.f32592d);
    }
}
