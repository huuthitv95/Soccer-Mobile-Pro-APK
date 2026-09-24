package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.e6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12164e6 implements InterfaceC12384n6 {

    /* JADX INFO: renamed from: a */
    private final C11717Va f30287a;

    /* JADX INFO: renamed from: b */
    private final a f30288b;

    /* JADX INFO: renamed from: c */
    private final LevelPlayAdInfo f30289c;

    /* JADX INFO: renamed from: com.ironsource.e6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C12164e6(C11717Va adInternal, a status) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f30287a = adInternal;
        this.f30288b = status;
        String string = adInternal.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f30289c = new LevelPlayAdInfo(string, adInternal.m27719h(), adInternal.m27715d().toString(), null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: d */
    private final boolean m31353d() {
        if (this.f30287a.m27719h().length() == 0) {
            C11717Va c11717Va = this.f30287a;
            String string = this.f30287a.m27716e().toString();
            Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
            C11717Va.m27685a(c11717Va, new LevelPlayAdError(string, this.f30287a.m27719h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f30287a.m27717f().m33049g()) {
            C11717Va c11717Va2 = this.f30287a;
            String string2 = this.f30287a.m27716e().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adInternal.adId.toString()");
            C11717Va.m27685a(c11717Va2, new LevelPlayAdError(string2, this.f30287a.m27719h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        C11666Sa c11666SaMo25856a = this.f30287a.m27723l().mo25844f().mo25856a();
        if (c11666SaMo25856a != null && c11666SaMo25856a.m27464a(this.f30287a.m27719h(), this.f30287a.m27715d())) {
            return true;
        }
        C11717Va c11717Va3 = this.f30287a;
        String string3 = this.f30287a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "adInternal.adId.toString()");
        C11717Va.m27685a(c11717Va3, new LevelPlayAdError(string3, this.f30287a.m27719h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31355a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str2 = this.f30288b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.f30287a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f30287a.m27710a(new LevelPlayAdError(string, this.f30287a.m27719h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f30289c);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: b */
    public LevelPlayAdInfo mo31357b() {
        return this.f30289c;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: c */
    public InterfaceC12274k0 mo31358c() {
        return new InterfaceC12274k0.a(this.f30288b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void loadAd() {
        if (m31353d()) {
            this.f30287a.m27726o();
        }
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClicked() {
        this.f30287a.m27713b("onAdClicked on " + this.f30288b + " state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClosed() {
        this.f30287a.m27713b("onAdClosed on " + this.f30288b + " state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30287a.m27713b("onAdDisplayed on " + this.f30288b + " state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30287a.m27713b("onAdInfoChanged on " + this.f30288b + " state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30287a.m27713b("onAdLoadFailed on " + this.f30288b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30287a.m27713b("onAdLoaded on " + this.f30288b + " state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31356a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30287a.m27713b("onAdDisplayFailed on " + this.f30288b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31354a() {
        this.f30287a.m27713b("onAdExpired on " + this.f30288b + " state");
    }

    public /* synthetic */ C12164e6(C11717Va c11717Va, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11717Va, (i & 2) != 0 ? a.Created : aVar);
    }
}
