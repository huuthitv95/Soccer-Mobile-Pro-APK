package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12298l6 implements InterfaceC12384n6 {

    /* JADX INFO: renamed from: a */
    private final C11717Va f30851a;

    /* JADX INFO: renamed from: b */
    private final LevelPlayAdInfo f30852b;

    public C12298l6(C11717Va adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30851a = adInternal;
        this.f30852b = adInfo;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31355a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.f30851a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f30851a.m27710a(new LevelPlayAdError(string, this.f30851a.m27719h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f30852b);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: b */
    public LevelPlayAdInfo mo31357b() {
        return this.f30852b;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: c */
    public InterfaceC12274k0 mo31358c() {
        return new InterfaceC12274k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void loadAd() {
        String string = this.f30851a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        C11717Va.m27685a(this.f30851a, new LevelPlayAdError(string, this.f30851a.m27719h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClicked() {
        this.f30851a.m27713b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClosed() {
        this.f30851a.m27713b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C12414p0 c12414p0M27717f = this.f30851a.m27717f();
        final LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.f30852b.getPlacementName());
        IronLog.INTERNAL.verbose(C12414p0.m33033a(c12414p0M27717f, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c12414p0M27717f.m33047e().m34220h().m27983e();
        C11717Va c11717Va = this.f30851a;
        c11717Va.m27707a(new C12319m6(c11717Va, levelPlayAdInfo));
        c12414p0M27717f.m33246e(new Runnable() { // from class: com.ironsource.l6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12298l6.m32057a(this.f$0, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30851a.m27713b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30851a.m27713b("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30851a.m27713b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31356a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30851a.m27707a(m32056a(error, this.f30852b));
        this.f30851a.m27710a(error, this.f30852b);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC12384n6 m32056a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C11779Z4.f26690a.m28059a(C11549Lf.f25085a.m26440a(levelPlayAdError))) {
            C11717Va c11717Va = this.f30851a;
            return new C12262j6(c11717Va, levelPlayAdInfo, c11717Va.m27721j());
        }
        return new C12164e6(this.f30851a, C12164e6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31354a() {
        this.f30851a.m27713b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m32057a(C12298l6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        InterfaceC11734Wa interfaceC11734WaM27722k = this$0.f30851a.m27722k();
        if (interfaceC11734WaM27722k != null) {
            interfaceC11734WaM27722k.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
