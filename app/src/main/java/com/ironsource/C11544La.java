package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.La */
/* JADX INFO: loaded from: classes6.dex */
public final class C11544La implements InterfaceC12567va {

    /* JADX INFO: renamed from: a */
    private final C12414p0 f25044a;

    /* JADX INFO: renamed from: b */
    private final C11726W2 f25045b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11572N2 f25046c;

    /* JADX INFO: renamed from: d */
    private InterfaceC12585wa f25047d;

    /* JADX INFO: renamed from: e */
    private InterfaceC11633Qa f25048e;

    /* JADX INFO: renamed from: f */
    private C11536L2 f25049f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC11552M0 f25050g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC12629z0 f25051h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC11590O2 f25052i;

    /* JADX INFO: renamed from: com.ironsource.La$a */
    public static final class a implements InterfaceC11590O2 {
        a() {
        }

        /* JADX INFO: renamed from: a */
        public void m26395a() {
            InterfaceC12585wa interfaceC12585waM26394m = C11544La.this.m26394m();
            if (interfaceC12585waM26394m != null) {
                interfaceC12585waM26394m.onAdLeftApplication();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m26396b() {
            InterfaceC12585wa interfaceC12585waM26394m = C11544La.this.m26394m();
            if (interfaceC12585waM26394m != null) {
                interfaceC12585waM26394m.mo33907k();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m26397c() {
            InterfaceC12585wa interfaceC12585waM26394m = C11544La.this.m26394m();
            if (interfaceC12585waM26394m != null) {
                interfaceC12585waM26394m.mo33906i();
            }
        }

        @Override // com.ironsource.InterfaceC11516K0
        /* JADX INFO: renamed from: e */
        public void mo26245e() {
            InterfaceC12585wa interfaceC12585waM26394m = C11544La.this.m26394m();
            if (interfaceC12585waM26394m != null) {
                interfaceC12585waM26394m.onAdClicked();
            }
        }

        @Override // com.ironsource.InterfaceC11590O2
        /* JADX INFO: renamed from: g */
        public /* bridge */ /* synthetic */ Unit mo26398g() {
            m26395a();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.InterfaceC11590O2
        /* JADX INFO: renamed from: h */
        public /* bridge */ /* synthetic */ Unit mo26399h() {
            m26397c();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.InterfaceC11590O2
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Unit mo26400j() {
            m26396b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.La$b */
    public static final class b implements InterfaceC11552M0 {
        b() {
        }

        @Override // com.ironsource.InterfaceC11552M0
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void mo25477a() {
            InterfaceC11552M0.CC.$default$a(this);
        }

        @Override // com.ironsource.InterfaceC11552M0
        /* JADX INFO: renamed from: a */
        public void mo25479a(C12539u0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            C11544La.this.m26393l().mo26546a(adUnitCallback);
        }

        @Override // com.ironsource.InterfaceC11552M0
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
            Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
        }

        @Override // com.ironsource.InterfaceC11552M0
        /* JADX INFO: renamed from: a */
        public void mo25478a(IronSourceError ironSourceError) {
            C11544La.this.m26393l().mo26545a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.La$c */
    public static final class c implements InterfaceC12629z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC12629z0
        /* JADX INFO: renamed from: a */
        public void mo26401a(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            InterfaceC12585wa interfaceC12585waM26394m = C11544La.this.m26394m();
            if (interfaceC12585waM26394m != null) {
                interfaceC12585waM26394m.onAdDisplayed(adInfo);
            }
        }

        @Override // com.ironsource.InterfaceC12629z0
        /* JADX INFO: renamed from: c */
        public void mo26402c(IronSourceError ironSourceError) {
            InterfaceC12585wa interfaceC12585waM26394m = C11544La.this.m26394m();
            if (interfaceC12585waM26394m != null) {
                interfaceC12585waM26394m.mo33904d(ironSourceError);
            }
        }
    }

    public C11544La(C12414p0 adTools, C11726W2 bannerContainer, InterfaceC11572N2 bannerAdUnitFactory) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f25044a = adTools;
        this.f25045b = bannerContainer;
        this.f25046c = bannerAdUnitFactory;
        this.f25048e = new C11562Ma(this);
        this.f25050g = new b();
        this.f25051h = new c();
        this.f25052i = new a();
    }

    /* JADX INFO: renamed from: a */
    public final C12414p0 m26375a() {
        return this.f25044a;
    }

    /* JADX INFO: renamed from: b */
    public final void m26383b(InterfaceC12585wa interfaceC12585wa) {
        this.f25047d = interfaceC12585wa;
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: c */
    public void mo26384c() {
        this.f25048e.mo26548c();
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: d */
    public void mo26385d() {
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC11590O2 m26386e() {
        return this.f25052i;
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: f */
    public void mo26387f() {
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC11552M0 m26388g() {
        return this.f25050g;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC12629z0 m26389h() {
        return this.f25051h;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC11572N2 m26390i() {
        return this.f25046c;
    }

    /* JADX INFO: renamed from: j */
    public final C11726W2 m26391j() {
        return this.f25045b;
    }

    /* JADX INFO: renamed from: k */
    public final C11536L2 m26392k() {
        return this.f25049f;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC11633Qa m26393l() {
        return this.f25048e;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC12585wa m26394m() {
        return this.f25047d;
    }

    /* JADX INFO: renamed from: a */
    public final void m26377a(InterfaceC11633Qa interfaceC11633Qa) {
        Intrinsics.checkNotNullParameter(interfaceC11633Qa, "<set-?>");
        this.f25048e = interfaceC11633Qa;
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: b */
    public void mo26382b() {
        this.f25048e.mo26547b();
    }

    /* JADX INFO: renamed from: a */
    public final void m26376a(C11536L2 c11536l2) {
        this.f25049f = c11536l2;
    }

    /* JADX INFO: renamed from: a */
    public final void m26381a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f25044a.m33047e().m34220h().m27985f("Banner Single Ad Unit Strategy - " + message);
    }

    /* JADX INFO: renamed from: a */
    public final void m26379a(C12539u0 adUnitCallback, C11536L2 adUnit) {
        InterfaceC12585wa interfaceC12585wa;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        adUnit.m26342a(this.f25045b.getViewBinder(), this.f25051h);
        LevelPlayAdInfo levelPlayAdInfoM33844c = adUnitCallback.m33844c();
        if (levelPlayAdInfoM33844c == null || (interfaceC12585wa = this.f25047d) == null) {
            return;
        }
        interfaceC12585wa.onAdLoaded(levelPlayAdInfoM33844c);
    }

    /* JADX INFO: renamed from: a */
    public final void m26378a(IronSourceError ironSourceError) {
        InterfaceC12585wa interfaceC12585wa = this.f25047d;
        if (interfaceC12585wa != null) {
            interfaceC12585wa.mo33901b(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: a */
    public void mo26380a(InterfaceC12585wa listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f25047d = listener;
    }
}
