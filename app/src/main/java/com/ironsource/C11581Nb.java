package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Nb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11581Nb extends AbstractC12312m implements InterfaceC12116bc, InterfaceC11552M0, InterfaceC12629z0 {

    /* JADX INFO: renamed from: b */
    private final InterfaceC11634Qb f25237b;

    /* JADX INFO: renamed from: c */
    private final C12414p0 f25238c;

    /* JADX INFO: renamed from: d */
    private final C11752Xb f25239d;

    /* JADX INFO: renamed from: e */
    private C11786Zb f25240e;

    /* JADX INFO: renamed from: f */
    private LevelPlayAdInfo f25241f;

    public C11581Nb(InterfaceC11634Qb listener, C12414p0 adTools, C11752Xb nativeAdProperties) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.f25237b = listener;
        this.f25238c = adTools;
        this.f25239d = nativeAdProperties;
        this.f25241f = m26671m();
    }

    /* JADX INFO: renamed from: m */
    private final LevelPlayAdInfo m26671m() {
        String string = this.f25239d.m31569b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "nativeAdProperties.adId.toString()");
        String strM31570c = this.f25239d.m31570c();
        String string2 = this.f25239d.m31567a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strM31570c, string2, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25477a() {
        InterfaceC11552M0.CC.$default$a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m26672a(C11527Kb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        C11786Zb c11786Zb = this.f25240e;
        if (c11786Zb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c11786Zb = null;
        }
        c11786Zb.m33124a(new C11667Sb(nativeAdBinder), this);
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
        Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC12629z0
    /* JADX INFO: renamed from: c */
    public void mo26402c(IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC11516K0
    /* JADX INFO: renamed from: e */
    public void mo26245e() {
        this.f25237b.mo27301b(this.f25241f);
    }

    /* JADX INFO: renamed from: n */
    public final void m26673n() {
        this.f25241f = m26671m();
        C11786Zb c11786Zb = this.f25240e;
        if (c11786Zb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c11786Zb = null;
        }
        c11786Zb.m33127a(true);
    }

    /* JADX INFO: renamed from: o */
    public final void m26674o() {
        C11786Zb c11786ZbM26670a = m26670a(this.f25238c, this.f25239d);
        this.f25240e = c11786ZbM26670a;
        if (c11786ZbM26670a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c11786ZbM26670a = null;
        }
        c11786ZbM26670a.m33125a((InterfaceC11552M0) this);
    }

    /* JADX INFO: renamed from: a */
    private final C11786Zb m26670a(C12414p0 c12414p0, C11752Xb c11752Xb) {
        IronLog.INTERNAL.verbose();
        return new C11786Zb(c12414p0, C11804ac.f26785y.m28177a(c11752Xb, m32114l().mo25856a()), this);
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25479a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoM33844c = adUnitCallback.m33844c();
        if (levelPlayAdInfoM33844c != null) {
            this.f25241f = levelPlayAdInfoM33844c;
            this.f25237b.mo27300a(levelPlayAdInfoM33844c);
        }
    }

    @Override // com.ironsource.InterfaceC12629z0
    /* JADX INFO: renamed from: a */
    public void mo26401a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25478a(IronSourceError ironSourceError) {
        this.f25237b.onNativeAdLoadFailed(ironSourceError);
    }
}
