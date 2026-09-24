package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12262j6 implements InterfaceC12384n6 {

    /* JADX INFO: renamed from: a */
    private final C11717Va f30665a;

    /* JADX INFO: renamed from: b */
    private LevelPlayAdInfo f30666b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12400o4 f30667c;

    /* JADX INFO: renamed from: d */
    private final long f30668d;

    public C12262j6(C11717Va adInternal, LevelPlayAdInfo adInfo, InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f30665a = adInternal;
        this.f30666b = adInfo;
        this.f30667c = currentTimeProvider;
        this.f30668d = currentTimeProvider.mo32926a();
    }

    /* JADX INFO: renamed from: d */
    private final long m31858d() {
        return this.f30667c.mo32926a() - this.f30668d;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31355a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C12135cd c12135cdM33034a = this.f30665a.m27717f().m33034a(this.f30665a.m27715d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f30666b, str);
        this.f30666b = levelPlayAdInfo;
        C11717Va c11717Va = this.f30665a;
        c11717Va.m27707a(new C12298l6(c11717Va, levelPlayAdInfo));
        this.f30665a.m27714c().m31138a(activity, c12135cdM33034a);
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: b */
    public LevelPlayAdInfo mo31357b() {
        return this.f30666b;
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: c */
    public InterfaceC12274k0 mo31358c() {
        C11447G3 c11447g3Mo25656a = this.f30665a.m27723l().mo25845g().mo25656a(this.f30665a.m27719h());
        return c11447g3Mo25656a.m25834d() ? InterfaceC12274k0.a.f30714c.m31921a(c11447g3Mo25656a.m25835e()) : InterfaceC12274k0.b.f30717a;
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void loadAd() {
        this.f30665a.m27717f().m33047e().m34220h().m27972a(Long.valueOf(m31858d()));
        this.f30665a.m27711a(this.f30666b);
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClicked() {
        this.f30665a.m27713b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdClosed() {
        this.f30665a.m27713b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30665a.m27713b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C12414p0 c12414p0M27717f = this.f30665a.m27717f();
        IronLog.INTERNAL.verbose(C12414p0.m33033a(c12414p0M27717f, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        c12414p0M27717f.m33047e().m34220h().m27971a(this.f30666b, adInfo);
        this.f30666b = adInfo;
        c12414p0M27717f.m33246e(new Runnable() { // from class: com.ironsource.j6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12262j6.m31857a(this.f$0, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30665a.m27713b("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC12384n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30665a.m27713b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31354a() {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f30665a.m27717f(), "onAdExpired", (String) null, 2, (Object) null));
        this.f30665a.m27706a(C12164e6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31857a(C12262j6 this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC11734Wa interfaceC11734WaM27722k = this$0.f30665a.m27722k();
        if (interfaceC11734WaM27722k != null) {
            interfaceC11734WaM27722k.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC12384n6
    /* JADX INFO: renamed from: a */
    public void mo31356a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30665a.m27713b("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
