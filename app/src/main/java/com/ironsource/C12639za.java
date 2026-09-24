package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.za */
/* JADX INFO: loaded from: classes6.dex */
public final class C12639za implements InterfaceC12567va {

    /* JADX INFO: renamed from: a */
    private final C12414p0 f33264a;

    /* JADX INFO: renamed from: b */
    private final C11726W2 f33265b;

    /* JADX INFO: renamed from: c */
    private final long f33266c;

    /* JADX INFO: renamed from: d */
    private final long f33267d;

    /* JADX INFO: renamed from: e */
    private final C11500J2 f33268e;

    /* JADX INFO: renamed from: f */
    private InterfaceC12585wa f33269f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC11572N2 f33270g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC12465rf f33271h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC12400o4 f33272i;

    /* JADX INFO: renamed from: j */
    private final boolean f33273j;

    /* JADX INFO: renamed from: k */
    private InterfaceC11552M0 f33274k;

    /* JADX INFO: renamed from: l */
    private InterfaceC12629z0 f33275l;

    /* JADX INFO: renamed from: m */
    private InterfaceC11590O2 f33276m;

    /* JADX INFO: renamed from: n */
    private InterfaceC11508Ja f33277n;

    /* JADX INFO: renamed from: com.ironsource.za$a */
    public static final class a implements InterfaceC11590O2 {
        a() {
        }

        /* JADX INFO: renamed from: a */
        public void m34306a() {
            C12639za.this.m34301n().onAdLeftApplication();
        }

        /* JADX INFO: renamed from: b */
        public void m34307b() {
            C12639za.this.m34301n().mo33907k();
        }

        /* JADX INFO: renamed from: c */
        public void m34308c() {
            C12639za.this.m34301n().mo33906i();
        }

        @Override // com.ironsource.InterfaceC11516K0
        /* JADX INFO: renamed from: e */
        public void mo26245e() {
            C12639za.this.m34301n().onAdClicked();
        }

        @Override // com.ironsource.InterfaceC11590O2
        /* JADX INFO: renamed from: g */
        public /* bridge */ /* synthetic */ Unit mo26398g() {
            m34306a();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.InterfaceC11590O2
        /* JADX INFO: renamed from: h */
        public /* bridge */ /* synthetic */ Unit mo26399h() {
            m34308c();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.InterfaceC11590O2
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Unit mo26400j() {
            m34307b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$b */
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
            C12639za.this.m34300m().mo25479a(adUnitCallback);
        }

        @Override // com.ironsource.InterfaceC11552M0
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
            Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
        }

        @Override // com.ironsource.InterfaceC11552M0
        /* JADX INFO: renamed from: a */
        public void mo25478a(IronSourceError ironSourceError) {
            C12639za.this.m34300m().mo25478a(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$c */
    public static final class c implements InterfaceC12629z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC12629z0
        /* JADX INFO: renamed from: a */
        public void mo26401a(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            C12639za.this.m34301n().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC12629z0
        /* JADX INFO: renamed from: c */
        public void mo26402c(IronSourceError ironSourceError) {
            C12639za.this.m34301n().mo33904d(ironSourceError);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$d */
    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11536L2 f33282b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC12187f3 f33283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C11536L2 c11536l2, AbstractC12187f3 abstractC12187f3) {
            super(0);
            this.f33282b = c11536l2;
            this.f33283c = abstractC12187f3;
        }

        /* JADX INFO: renamed from: a */
        public final void m34309a() {
            C12639za.m34281a(C12639za.this, this.f33282b, this.f33283c, false, 4, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m34309a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$e */
    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11536L2 f33285b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Long f33286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C11536L2 c11536l2, Long l) {
            super(0);
            this.f33285b = c11536l2;
            this.f33286c = l;
        }

        /* JADX INFO: renamed from: a */
        public final void m34310a() {
            C12639za c12639za = C12639za.this;
            c12639za.m34283a((InterfaceC11508Ja) new C11400Da(c12639za, this.f33285b, this.f33286c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m34310a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.za$f */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11536L2 f33288b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC12187f3 f33289c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Long f33290d;

        /* JADX INFO: renamed from: com.ironsource.za$f$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C12639za f33291a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C11536L2 f33292b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ AbstractC12187f3 f33293c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12639za c12639za, C11536L2 c11536l2, AbstractC12187f3 abstractC12187f3) {
                super(0);
                this.f33291a = c12639za;
                this.f33292b = c11536l2;
                this.f33293c = abstractC12187f3;
            }

            /* JADX INFO: renamed from: a */
            public final void m34311a() {
                C12639za.m34281a(this.f33291a, this.f33292b, this.f33293c, false, 4, (Object) null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m34311a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.za$f$b */
        static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C12639za f33294a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C11536L2 f33295b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Long f33296c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C12639za c12639za, C11536L2 c11536l2, Long l) {
                super(0);
                this.f33294a = c12639za;
                this.f33295b = c11536l2;
                this.f33296c = l;
            }

            /* JADX INFO: renamed from: a */
            public final void m34312a() {
                C12639za c12639za = this.f33294a;
                c12639za.m34283a((InterfaceC11508Ja) new C11400Da(c12639za, this.f33295b, this.f33296c));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m34312a();
                return Unit.INSTANCE;
            }
        }

        f(C11536L2 c11536l2, AbstractC12187f3 abstractC12187f3, Long l) {
            this.f33288b = c11536l2;
            this.f33289c = abstractC12187f3;
            this.f33290d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C12639za.this.m34298k().getViewTreeObserver().isAlive()) {
                C12639za.this.m34298k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (C12430pg.m33116a(C12639za.this.m34298k(), new Rect())) {
                C12461rb.m33218a((C12461rb) C12639za.this.m34282a(), AbstractRunnableC11754Xd.f26559a.m27962a(new a(C12639za.this, this.f33288b, this.f33289c)), 0L, 2, (Object) null);
            } else {
                C12461rb.m33218a((C12461rb) C12639za.this.m34282a(), AbstractRunnableC11754Xd.f26559a.m27962a(new b(C12639za.this, this.f33288b, this.f33290d)), 0L, 2, (Object) null);
            }
        }
    }

    public C12639za(C12414p0 adTools, C11726W2 bannerContainer, long j, long j2, C11500J2 bannerAdProperties, InterfaceC12585wa strategyListener, InterfaceC11572N2 bannerAdUnitFactory, InterfaceC12465rf taskScheduler, InterfaceC12400o4 timeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f33264a = adTools;
        this.f33265b = bannerContainer;
        this.f33266c = j;
        this.f33267d = j2;
        this.f33268e = bannerAdProperties;
        this.f33269f = strategyListener;
        this.f33270g = bannerAdUnitFactory;
        this.f33271h = taskScheduler;
        this.f33272i = timeProvider;
        this.f33273j = z;
        this.f33274k = new b();
        this.f33275l = new c();
        this.f33276m = new a();
        this.f33277n = new C11364Ba(this, false, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final C12414p0 m34282a() {
        return this.f33264a;
    }

    /* JADX INFO: renamed from: b */
    public final void m34292b(InterfaceC12585wa interfaceC12585wa) {
        Intrinsics.checkNotNullParameter(interfaceC12585wa, "<set-?>");
        this.f33269f = interfaceC12585wa;
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: c */
    public void mo26384c() {
        this.f33277n.mo25482c();
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: d */
    public void mo26385d() {
        this.f33277n.mo25483d();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC11590O2 m34293e() {
        return this.f33276m;
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: f */
    public void mo26387f() {
        this.f33277n.mo25484f();
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC11552M0 m34294g() {
        return this.f33274k;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC12629z0 m34295h() {
        return this.f33275l;
    }

    /* JADX INFO: renamed from: i */
    public final C11500J2 m34296i() {
        return this.f33268e;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC11572N2 m34297j() {
        return this.f33270g;
    }

    /* JADX INFO: renamed from: k */
    public final C11726W2 m34298k() {
        return this.f33265b;
    }

    /* JADX INFO: renamed from: l */
    public final long m34299l() {
        return this.f33266c;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC11508Ja m34300m() {
        return this.f33277n;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC12585wa m34301n() {
        return this.f33269f;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC12465rf m34302o() {
        return this.f33271h;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC12400o4 m34303p() {
        return this.f33272i;
    }

    /* JADX INFO: renamed from: q */
    public final long m34304q() {
        return this.f33267d;
    }

    /* JADX INFO: renamed from: r */
    public final void m34305r() {
        this.f33264a.m33047e().m34220h().m27987h("Banner view is not visible");
    }

    /* JADX INFO: renamed from: a */
    public final void m34286a(InterfaceC11552M0 interfaceC11552M0) {
        Intrinsics.checkNotNullParameter(interfaceC11552M0, "<set-?>");
        this.f33274k = interfaceC11552M0;
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: b */
    public void mo26382b() {
        this.f33277n.mo25480b();
    }

    /* JADX INFO: renamed from: a */
    public final void m34290a(InterfaceC12629z0 interfaceC12629z0) {
        Intrinsics.checkNotNullParameter(interfaceC12629z0, "<set-?>");
        this.f33275l = interfaceC12629z0;
    }

    /* JADX INFO: renamed from: a */
    public final void m34287a(InterfaceC11590O2 interfaceC11590O2) {
        Intrinsics.checkNotNullParameter(interfaceC11590O2, "<set-?>");
        this.f33276m = interfaceC11590O2;
    }

    /* JADX INFO: renamed from: a */
    public final void m34283a(InterfaceC11508Ja interfaceC11508Ja) {
        Intrinsics.checkNotNullParameter(interfaceC11508Ja, "<set-?>");
        this.f33277n = interfaceC11508Ja;
    }

    /* JADX INFO: renamed from: a */
    public final void m34291a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f33264a.m33047e().m34220h().m27985f("Banner Reload Strategy - " + message);
    }

    /* JADX INFO: renamed from: a */
    public final void m34289a(C12539u0 adUnitCallback, C11536L2 currentAdUnit, C11536L2 c11536l2, AbstractC12187f3 reloadReason, boolean z, Long l) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.m26342a(this.f33265b.getViewBinder(), this.f33275l);
        LevelPlayAdInfo levelPlayAdInfoM33844c = adUnitCallback.m33844c();
        if (levelPlayAdInfoM33844c != null) {
            this.f33269f.onAdLoaded(levelPlayAdInfoM33844c);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C12414p0.m33033a(this.f33264a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (c11536l2 != null) {
            c11536l2.m33127a(false);
        }
        if (z) {
            this.f33277n = new C11436Fa(this, currentAdUnit);
        } else {
            m34284a(currentAdUnit, reloadReason, l);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m34288a(IronSourceError ironSourceError, C11536L2 currentAdUnit, AbstractC12187f3 reloadReason, boolean z, boolean z2, Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f33269f.mo33901b(ironSourceError);
        if (z2) {
            this.f33277n = new C11436Fa(this, currentAdUnit);
        } else if (z) {
            m34284a(currentAdUnit, reloadReason, l);
        } else {
            m34285a(currentAdUnit, reloadReason, this.f33273j);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m34284a(final C11536L2 currentAdUnit, final AbstractC12187f3 reloadReason, final Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        C12461rb.m33222a(this.f33264a, new Runnable() { // from class: com.ironsource.za$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12639za.m34280a(this.f$0, currentAdUnit, reloadReason, l);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34280a(C12639za this$0, C11536L2 currentAdUnit, AbstractC12187f3 reloadReason, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (C12430pg.m33116a(this$0.f33265b, new Rect())) {
            C12461rb.m33218a((C12461rb) this$0.f33264a, AbstractRunnableC11754Xd.f26559a.m27962a(this$0.new d(currentAdUnit, reloadReason)), 0L, 2, (Object) null);
        } else if (!this$0.f33265b.getViewTreeObserver().isAlive()) {
            C12461rb.m33218a((C12461rb) this$0.f33264a, AbstractRunnableC11754Xd.f26559a.m27962a(this$0.new e(currentAdUnit, l)), 0L, 2, (Object) null);
        } else {
            this$0.f33265b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l));
        }
    }

    public /* synthetic */ C12639za(C12414p0 c12414p0, C11726W2 c11726w2, long j, long j2, C11500J2 c11500j2, InterfaceC12585wa interfaceC12585wa, InterfaceC11572N2 interfaceC11572N2, InterfaceC12465rf interfaceC12465rf, InterfaceC12400o4 interfaceC12400o4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12414p0, c11726w2, j, j2, c11500j2, interfaceC12585wa, interfaceC11572N2, (i & 128) != 0 ? new C11645R6(C11662S6.m27451a(c12414p0.m33225a())) : interfaceC12465rf, interfaceC12400o4, z);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m34281a(C12639za c12639za, C11536L2 c11536l2, AbstractC12187f3 abstractC12187f3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c12639za.m34285a(c11536l2, abstractC12187f3, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m34285a(C11536L2 currentAdUnit, AbstractC12187f3 reloadReason, boolean z) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        C11536L2 c11536l2Mo26600a = this.f33270g.mo26600a(false);
        C11454Ga c11454Ga = new C11454Ga(this, currentAdUnit, c11536l2Mo26600a, this.f33272i.mo32926a(), z);
        m34279a(reloadReason);
        this.f33277n = c11454Ga;
        c11536l2Mo26600a.m33125a(this.f33274k);
    }

    /* JADX INFO: renamed from: a */
    private final void m34279a(AbstractC12187f3 abstractC12187f3) {
        this.f33264a.m33047e().m34220h().m27967a(abstractC12187f3.m31408c(), abstractC12187f3.m31407b(), abstractC12187f3.mo31406a());
    }

    @Override // com.ironsource.InterfaceC12567va
    /* JADX INFO: renamed from: a */
    public void mo26380a(InterfaceC12585wa listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33269f = listener;
    }
}
