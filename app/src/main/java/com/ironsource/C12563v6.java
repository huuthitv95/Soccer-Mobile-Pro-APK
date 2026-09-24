package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12563v6 implements InterfaceC12635z6 {

    /* JADX INFO: renamed from: a */
    private final C12545u6 f32593a;

    public C12563v6(C12545u6 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f32593a = strategy;
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33926a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f32593a.m33887a("show called before load success");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33931b(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32593a.m33887a("load success before load called");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: c */
    public void mo33932c(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32593a.m33887a("load success with better ad before load called");
    }

    @Override // com.ironsource.InterfaceC12635z6
    public void loadAd() {
        C12402o6 c12402o6Mo27736a = this.f32593a.m33888b().mo27736a(true, this.f32593a.m33889c());
        this.f32593a.m33886a(new C12599x6(this.f32593a, c12402o6Mo27736a, true));
        c12402o6Mo27736a.m32947a(this.f32593a);
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33927a(C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f32593a.m33887a("ad expired before load called");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33930b(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f32593a.m33887a("load failed before load called");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33929a(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32593a.m33887a("ad display success before load called");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33928a(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f32593a.m33887a("ad display failed before load called");
    }
}
