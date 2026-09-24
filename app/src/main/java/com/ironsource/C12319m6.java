package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12319m6 implements InterfaceC12384n6 {

    /* JADX INFO: renamed from: a */
    private final C11717Va f30957a;

    /* JADX INFO: renamed from: b */
    private final LevelPlayAdInfo f30958b;

    public C12319m6(C11717Va adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30957a = adInternal;
        this.f30958b = adInfo;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31355a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.f30957a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f30957a.m27710a(new LevelPlayAdError(string, this.f30957a.m27719h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f30958b);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: b */
    public LevelPlayAdInfo mo31357b() {
        return this.f30958b;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: c */
    public InterfaceC12274k0 mo31358c() {
        return new InterfaceC12274k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void loadAd() {
        String string = this.f30957a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        C11717Va.m27685a(this.f30957a, new LevelPlayAdError(string, this.f30957a.m27719h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f30957a.m27717f(), "onAdClicked adInfo: " + this.f30958b, (String) null, 2, (Object) null));
        this.f30957a.m27717f().m33246e(new Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12319m6.m32209a(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f30957a.m27717f(), "onAdClosed adInfo: " + this.f30958b, (String) null, 2, (Object) null));
        this.f30957a.m27717f().m33245d(new Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12319m6.m32210b(this.f$0);
            }
        });
        this.f30957a.m27717f().m33246e(new Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12319m6.m32211c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30957a.m27713b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30957a.m27713b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30957a.m27713b("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30957a.m27713b("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m32210b(C12319m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f30957a.m27706a(C12164e6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m32211c(C12319m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11734Wa interfaceC11734WaM27722k = this$0.f30957a.m27722k();
        if (interfaceC11734WaM27722k != null) {
            interfaceC11734WaM27722k.onAdClosed(this$0.f30958b);
        }
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31354a() {
        this.f30957a.m27713b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31356a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30957a.m27713b("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m32209a(C12319m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC11734Wa interfaceC11734WaM27722k = this$0.f30957a.m27722k();
        if (interfaceC11734WaM27722k != null) {
            interfaceC11734WaM27722k.onAdClicked(this$0.f30958b);
        }
    }
}
