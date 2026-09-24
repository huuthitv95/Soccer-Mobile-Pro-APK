package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.C6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11378C6 implements InterfaceC11450G6 {

    /* JADX INFO: renamed from: a */
    private final C11342A6 f24140a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f24141b;

    /* JADX INFO: renamed from: c */
    private final C12402o6 f24142c;

    /* JADX INFO: renamed from: d */
    private LevelPlayAdInfo f24143d;

    public C11378C6(C11342A6 strategy, C12402o6 currentAdUnit, C12402o6 progressiveAdUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24140a = strategy;
        this.f24141b = currentAdUnit;
        this.f24142c = progressiveAdUnit;
        this.f24143d = adInfo;
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25409a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24140a.m25279d().mo31143c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: b */
    public void mo25412b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24143d = adInfo;
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25414c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24140a.m25273a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC11450G6
    public void loadAd() {
        this.f24140a.m25279d().mo31142b(this.f24143d);
        C11342A6 c11342a6 = this.f24140a;
        c11342a6.m25269a(new C11414E6(c11342a6, this.f24142c));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25413c(IronSourceError ironSourceError) {
        this.f24140a.m25273a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25410a(IronSourceError ironSourceError) {
        this.f24140a.m25273a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25408a() {
        C11342A6 c11342a6 = this.f24140a;
        c11342a6.m25269a(new C11360B6(c11342a6, this.f24141b, true));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25411a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24140a.m25273a("show success on progressive ad unit that already loaded");
    }
}
