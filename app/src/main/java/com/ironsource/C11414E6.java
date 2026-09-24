package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.E6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11414E6 implements InterfaceC11450G6 {

    /* JADX INFO: renamed from: a */
    private final C11342A6 f24241a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f24242b;

    public C11414E6(C11342A6 strategy, C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f24241a = strategy;
        this.f24242b = adUnit;
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25409a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24242b.m32946a(activity, this.f24241a);
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: b */
    public void mo25412b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24241a.m25279d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25414c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24241a.m25273a("Ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC11450G6
    public void loadAd() {
        C11342A6 c11342a6 = this.f24241a;
        c11342a6.m25269a(new C11360B6(c11342a6, null, false, 4, null));
        this.f24241a.loadAd();
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25410a(IronSourceError ironSourceError) {
        this.f24241a.m25273a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25413c(IronSourceError ironSourceError) {
        if (!C11779Z4.f26690a.m28059a(ironSourceError)) {
            C11342A6 c11342a6 = this.f24241a;
            c11342a6.m25269a(new C11360B6(c11342a6, null, false, 4, null));
        }
        this.f24241a.m25279d().mo31143c(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25408a() {
        C11342A6 c11342a6 = this.f24241a;
        c11342a6.m25269a(new C11360B6(c11342a6, null, true));
        this.f24241a.m25279d().mo31137a();
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25411a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24241a.m25279d().mo31140a(adInfo);
        C12402o6 c12402o6Mo27736a = this.f24241a.m25274b().mo27736a(false, this.f24241a.m25277c());
        C11342A6 c11342a6 = this.f24241a;
        c11342a6.m25269a(new C11396D6(c11342a6, this.f24242b, c12402o6Mo27736a));
        c12402o6Mo27736a.m32947a(this.f24241a);
    }
}
