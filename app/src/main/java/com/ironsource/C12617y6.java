package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12617y6 implements InterfaceC12635z6, InterfaceC12456r6 {

    /* JADX INFO: renamed from: a */
    private final C12545u6 f33216a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f33217b;

    /* JADX INFO: renamed from: c */
    private C12402o6 f33218c;

    public C12617y6(C12545u6 strategy, C12402o6 currentAdUnit, C12402o6 c12402o6) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f33216a = strategy;
        this.f33217b = currentAdUnit;
        this.f33218c = c12402o6;
        currentAdUnit.m32948a(this);
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33926a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f33216a.m33887a("show called while showing");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33931b(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.f33217b) {
            this.f33216a.m33887a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: c */
    public void mo33932c(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.f33217b) {
            this.f33216a.m33887a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC11516K0
    /* JADX INFO: renamed from: e */
    public void mo26245e() {
        this.f33216a.m33889c().mo26245e();
    }

    @Override // com.ironsource.InterfaceC12635z6
    public void loadAd() {
        this.f33216a.m33887a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC12456r6
    public void onClosed() {
        this.f33216a.m33886a(m34222a(this, null, 1, null));
        this.f33216a.m33889c().onClosed();
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33929a(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.f33217b)) {
            this.f33216a.m33890d().mo31140a(adInfo);
        } else {
            this.f33216a.m33887a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33930b(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.f33218c) {
            this.f33218c = null;
        } else {
            this.f33216a.m33887a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33928a(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (!Intrinsics.areEqual(adUnit, this.f33217b)) {
            this.f33216a.m33887a("progressive show failed while showing current ad");
            return;
        }
        this.f33216a.m33886a(m34221a(ironSourceError));
        this.f33216a.m33890d().mo31143c(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33927a(C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.f33218c) {
            this.f33218c = null;
        } else {
            this.f33216a.m33887a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC12456r6
    /* JADX INFO: renamed from: a */
    public void mo31141a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f33216a.m33889c().mo31141a(reward);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC12635z6 m34222a(C12617y6 c12617y6, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return c12617y6.m34221a(ironSourceError);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC12635z6 m34221a(IronSourceError ironSourceError) {
        if (C11779Z4.f26690a.m28059a(ironSourceError)) {
            return new C12581w6(this.f33216a, this.f33217b, this.f33218c, true);
        }
        C12402o6 c12402o6 = this.f33218c;
        if (c12402o6 == null) {
            return new C12563v6(this.f33216a);
        }
        if (c12402o6.m32950e() != null) {
            return new C12581w6(this.f33216a, c12402o6, null, false, 8, null);
        }
        return new C12599x6(this.f33216a, c12402o6, false);
    }
}
