package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.D6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11396D6 implements InterfaceC11450G6 {

    /* JADX INFO: renamed from: a */
    private final C11342A6 f24202a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f24203b;

    /* JADX INFO: renamed from: c */
    private final C12402o6 f24204c;

    public C11396D6(C11342A6 strategy, C12402o6 currentAdUnit, C12402o6 progressiveAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.f24202a = strategy;
        this.f24203b = currentAdUnit;
        this.f24204c = progressiveAdUnit;
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25409a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f24202a.m25279d().mo31143c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: b */
    public void mo25412b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24202a.m25273a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25414c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C11342A6 c11342a6 = this.f24202a;
        c11342a6.m25269a(new C11378C6(c11342a6, this.f24203b, this.f24204c, adInfo));
    }

    @Override // com.ironsource.InterfaceC11450G6
    public void loadAd() {
        C11342A6 c11342a6 = this.f24202a;
        c11342a6.m25269a(new C11432F6(c11342a6, this.f24204c));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25410a(IronSourceError ironSourceError) {
        C11342A6 c11342a6 = this.f24202a;
        c11342a6.m25269a(new C11360B6(c11342a6, this.f24203b, false, 4, null));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25408a() {
        this.f24202a.m25273a("ad expired before progressive load success");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25411a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24202a.m25273a("show success before progressive load success");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25413c(IronSourceError ironSourceError) {
        this.f24202a.m25273a("show failed before progressive load success");
    }
}
