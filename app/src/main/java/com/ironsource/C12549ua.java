package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ua */
/* JADX INFO: loaded from: classes6.dex */
public final class C12549ua extends AbstractC12312m implements InterfaceC11590O2, InterfaceC12585wa {

    /* JADX INFO: renamed from: b */
    private final C12414p0 f32558b;

    /* JADX INFO: renamed from: c */
    private final C11500J2 f32559c;

    /* JADX INFO: renamed from: d */
    private final WeakReference<InterfaceC12631z2> f32560d;

    /* JADX INFO: renamed from: e */
    private LevelPlayAdInfo f32561e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC12567va f32562f;

    public C12549ua(InterfaceC12631z2 listener, C12414p0 adTools, C11500J2 bannerAdProperties, C11726W2 bannerViewContainer) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.f32558b = adTools;
        this.f32559c = bannerAdProperties;
        this.f32560d = new WeakReference<>(listener);
        this.f32561e = m33899n();
        this.f32562f = C11649Ra.f25574a.m27364a(adTools, bannerViewContainer, adTools.m33045d(bannerAdProperties.m31570c()), bannerAdProperties, this, m33898m(), (64 & 64) != 0 ? new InterfaceC12400o4.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final C11536L2 m33897a(C12549ua this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.m33896a(this$0.f32558b, this$0.f32559c, z);
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC11572N2 m33898m() {
        return new InterfaceC11572N2() { // from class: com.ironsource.ua$$ExternalSyntheticLambda0
            @Override // com.ironsource.InterfaceC11572N2
            /* JADX INFO: renamed from: a */
            public final C11536L2 mo26600a(boolean z) {
                return C12549ua.m33897a(this.f$0, z);
            }
        };
    }

    /* JADX INFO: renamed from: n */
    private final LevelPlayAdInfo m33899n() {
        String string = this.f32559c.m31569b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
        String strM31570c = this.f32559c.m31570c();
        String string2 = this.f32559c.m31567a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strM31570c, string2, null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m33900b() {
        this.f32562f.mo26382b();
    }

    /* JADX INFO: renamed from: c */
    public final void m33902c() {
        this.f32562f.mo26384c();
    }

    /* JADX INFO: renamed from: d */
    public final void m33903d() {
        this.f32562f.mo26385d();
    }

    @Override // com.ironsource.InterfaceC11516K0
    /* JADX INFO: renamed from: e */
    public void mo26245e() {
        onAdClicked();
    }

    /* JADX INFO: renamed from: f */
    public final void m33905f() {
        this.f32562f.mo26387f();
    }

    @Override // com.ironsource.InterfaceC11590O2
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Unit mo26398g() {
        m33908o();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC11590O2
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ Unit mo26399h() {
        m33910q();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC12585wa
    /* JADX INFO: renamed from: i */
    public void mo33906i() {
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            interfaceC12631z2.mo34159a(this.f32561e);
        }
    }

    @Override // com.ironsource.InterfaceC11590O2
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ Unit mo26400j() {
        m33909p();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC12585wa
    /* JADX INFO: renamed from: k */
    public void mo33907k() {
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            interfaceC12631z2.mo34166c(this.f32561e);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m33908o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC12585wa
    public void onAdClicked() {
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            interfaceC12631z2.mo34168d(this.f32561e);
        }
    }

    @Override // com.ironsource.InterfaceC12585wa
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32561e = adInfo;
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            interfaceC12631z2.mo34164b(this.f32561e);
        }
    }

    @Override // com.ironsource.InterfaceC12585wa
    public void onAdLeftApplication() {
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            interfaceC12631z2.mo34170e(this.f32561e);
        }
    }

    @Override // com.ironsource.InterfaceC12585wa
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32561e = adInfo;
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            interfaceC12631z2.mo34161a(adInfo, false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m33909p() {
        mo33907k();
    }

    /* JADX INFO: renamed from: q */
    public void m33910q() {
        mo33906i();
    }

    /* JADX INFO: renamed from: a */
    private final C11536L2 m33896a(C12414p0 c12414p0, C11500J2 c11500j2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new C11536L2(c12414p0, C11554M2.f25108z.m26476a(c11500j2, m32114l().mo25856a(), z), this);
    }

    @Override // com.ironsource.InterfaceC12585wa
    /* JADX INFO: renamed from: b */
    public void mo33901b(IronSourceError ironSourceError) {
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            String string = this.f32559c.m31569b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC12631z2.mo34158a(new LevelPlayAdError(ironSourceError, string, this.f32559c.m31570c()));
        }
    }

    @Override // com.ironsource.InterfaceC12585wa
    /* JADX INFO: renamed from: d */
    public void mo33904d(IronSourceError ironSourceError) {
        InterfaceC12631z2 interfaceC12631z2 = this.f32560d.get();
        if (interfaceC12631z2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f32561e;
            String string = this.f32559c.m31569b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC12631z2.mo34160a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f32559c.m31570c()));
        }
    }
}
