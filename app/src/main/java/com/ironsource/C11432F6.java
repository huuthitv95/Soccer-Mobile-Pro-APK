package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.F6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11432F6 implements InterfaceC11450G6 {

    /* JADX INFO: renamed from: a */
    private final C11342A6 f24312a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f24313b;

    public C11432F6(C11342A6 strategy, C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f24312a = strategy;
        this.f24313b = adUnit;
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25409a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24312a.m25279d().mo31143c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: b */
    public void mo25412b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24312a.m25273a("load success with better ad while loading");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25414c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C11342A6 c11342a6 = this.f24312a;
        c11342a6.m25269a(new C11414E6(c11342a6, this.f24313b));
        this.f24312a.m25279d().mo31142b(adInfo);
    }

    @Override // com.ironsource.InterfaceC11450G6
    public void loadAd() {
        this.f24312a.m25279d().mo31139a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25413c(IronSourceError ironSourceError) {
        this.f24312a.m25273a("show failed while loading");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25410a(IronSourceError ironSourceError) {
        C11342A6 c11342a6 = this.f24312a;
        c11342a6.m25269a(new C11360B6(c11342a6, this.f24313b, false, 4, null));
        this.f24312a.m25279d().mo31139a(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25408a() {
        this.f24312a.m25273a("ad expired while loading");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25411a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24312a.m25273a("show success while loading");
    }
}
