package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.hb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12231hb extends AbstractC12478sa implements InterfaceC11634Qb {

    /* JADX INFO: renamed from: d */
    private final UUID f30489d;

    /* JADX INFO: renamed from: e */
    private final C12195fb f30490e;

    /* JADX INFO: renamed from: f */
    private C11581Nb f30491f;

    /* JADX INFO: renamed from: g */
    private String f30492g;

    /* JADX INFO: renamed from: h */
    private C12135cd f30493h;

    /* JADX INFO: renamed from: i */
    private InterfaceC12267jb f30494i;

    /* JADX INFO: renamed from: j */
    private AdapterNativeAdData f30495j;

    /* JADX INFO: renamed from: k */
    private AdapterNativeAdViewBinder f30496k;

    public /* synthetic */ C12231hb(UUID uuid, C12195fb c12195fb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12546u7.f32555a.m33891a() : uuid, c12195fb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31624a(C12231hb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            C11581Nb c11581Nb = this$0.f30491f;
            if (c11581Nb == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                c11581Nb = null;
            }
            c11581Nb.m26673n();
            this$0.f30494i = null;
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m31629b(C12231hb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C11581Nb c11581Nb = null;
        if (this$0.m33313c()) {
            IronLog.INTERNAL.warning(C12414p0.m33033a(this$0.m33306a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.m33310a(true);
        if (this$0.mo31634d()) {
            C11581Nb c11581Nb2 = this$0.f30491f;
            if (c11581Nb2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                c11581Nb = c11581Nb2;
            }
            c11581Nb.m26674o();
        }
    }

    /* JADX INFO: renamed from: e */
    private final C11581Nb m31631e() {
        this.f30493h = m33306a().m33043c(this.f30492g);
        UUID uuid = this.f30489d;
        String strM33311b = m33311b();
        C12135cd c12135cd = this.f30493h;
        if (c12135cd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placement");
            c12135cd = null;
        }
        C11752Xb c11752Xb = new C11752Xb(uuid, strM33311b, c12135cd);
        m33307a(c11752Xb);
        return new C11581Nb(this, m33306a(), c11752Xb);
    }

    @Override // com.ironsource.AbstractC12478sa
    /* JADX INFO: renamed from: d */
    public boolean mo31634d() {
        this.f30491f = m31631e();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m31635f() {
        m33308a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C12231hb.m31624a(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final UUID m31636g() {
        return this.f30489d;
    }

    /* JADX INFO: renamed from: h */
    public final String m31637h() {
        AdapterNativeAdData adapterNativeAdData = this.f30495j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m31638i() {
        AdapterNativeAdData adapterNativeAdData = this.f30495j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final String m31639j() {
        AdapterNativeAdData adapterNativeAdData = this.f30495j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC12213gb.a m31640k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f30495j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC12213gb.a(icon.getDrawable(), icon.getUri());
    }

    /* JADX INFO: renamed from: l */
    public final AdapterNativeAdViewBinder m31641l() {
        return this.f30496k;
    }

    /* JADX INFO: renamed from: m */
    public final String m31642m() {
        AdapterNativeAdData adapterNativeAdData = this.f30495j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m31643n() {
        m33308a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12231hb.m31629b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11634Qb
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String string = this.f30489d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, string, m33311b());
        m33312b(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C12231hb.m31626a(this.f$0, levelPlayAdError);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12231hb(UUID adId, C12195fb nativeAd) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.NATIVE_AD;
        super(new C12414p0(enumC12328a, C11426F0.b.MEDIATION));
        this.f30489d = adId;
        this.f30490e = nativeAd;
        this.f30492g = "";
        m33306a().m33047e().m34212a(new C12377n(enumC12328a, adId, m33311b()));
    }

    /* JADX INFO: renamed from: a */
    public final void m31632a(final InterfaceC12267jb interfaceC12267jb) {
        m33308a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C12231hb.m31625a(this.f$0, interfaceC12267jb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31625a(C12231hb this$0, InterfaceC12267jb interfaceC12267jb) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f30494i = interfaceC12267jb;
    }

    @Override // com.ironsource.InterfaceC11634Qb
    /* JADX INFO: renamed from: a */
    public void mo27300a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        C11527Kb c11527Kb = new C11527Kb();
        C11581Nb c11581Nb = this.f30491f;
        if (c11581Nb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            c11581Nb = null;
        }
        c11581Nb.m26672a(c11527Kb);
        this.f30495j = c11527Kb.m26283a();
        this.f30496k = c11527Kb.m26286b();
        m33312b(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12231hb.m31630b(this.f$0, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m31630b(C12231hb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC12267jb interfaceC12267jb = this$0.f30494i;
        if (interfaceC12267jb != null) {
            interfaceC12267jb.m31881b(this$0.f30490e, adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC11634Qb
    /* JADX INFO: renamed from: b */
    public void mo27301b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        m33312b(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C12231hb.m31627a(this.f$0, adInfo);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m31633b(final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        m33308a(new Runnable() { // from class: com.ironsource.hb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12231hb.m31628a(this.f$0, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31626a(C12231hb this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC12267jb interfaceC12267jb = this$0.f30494i;
        if (interfaceC12267jb != null) {
            interfaceC12267jb.m31879a(this$0.f30490e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31627a(C12231hb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC12267jb interfaceC12267jb = this$0.f30494i;
        if (interfaceC12267jb != null) {
            interfaceC12267jb.m31882c(this$0.f30490e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31628a(C12231hb this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.f30492g = placementName;
    }
}
