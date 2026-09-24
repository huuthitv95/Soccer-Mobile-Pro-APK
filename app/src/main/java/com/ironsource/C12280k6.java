package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12280k6 implements InterfaceC12384n6 {

    /* JADX INFO: renamed from: a */
    private final C11717Va f30729a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12400o4 f30730b;

    /* JADX INFO: renamed from: c */
    private final long f30731c;

    /* JADX INFO: renamed from: d */
    private final LevelPlayAdInfo f30732d;

    public C12280k6(C11717Va adInternal, InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f30729a = adInternal;
        this.f30730b = currentTimeProvider;
        this.f30731c = currentTimeProvider.mo32926a();
        String string = adInternal.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f30732d = new LevelPlayAdInfo(string, adInternal.m27719h(), adInternal.m27715d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31355a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.f30729a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f30729a.m27710a(new LevelPlayAdError(string, this.f30729a.m27719h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f30732d);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: b */
    public LevelPlayAdInfo mo31357b() {
        return this.f30732d;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: c */
    public InterfaceC12274k0 mo31358c() {
        return new InterfaceC12274k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void loadAd() {
        String string = this.f30729a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f30729a.m27709a(new LevelPlayAdError(string, this.f30729a.m27719h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f30730b.mo32926a() - this.f30731c);
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClicked() {
        this.f30729a.m27713b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClosed() {
        this.f30729a.m27713b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30729a.m27713b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30729a.m27713b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30729a.m27709a(error, this.f30730b.mo32926a() - this.f30731c);
        this.f30729a.m27706a(C12164e6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C11717Va c11717Va = this.f30729a;
        c11717Va.m27707a(new C12262j6(c11717Va, adInfo, this.f30730b));
        this.f30729a.m27711a(adInfo);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31354a() {
        this.f30729a.m27713b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31356a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30729a.m27713b("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
