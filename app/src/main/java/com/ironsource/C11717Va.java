package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.C14640a;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.Va */
/* JADX INFO: loaded from: classes6.dex */
public final class C11717Va implements InterfaceC12146d6 {

    /* JADX INFO: renamed from: o */
    public static final a f26021o = new a(null);

    /* JADX INFO: renamed from: p */
    public static final String f26022p = "Fullscreen Ad Internal";

    /* JADX INFO: renamed from: a */
    private final LevelPlay.AdFormat f26023a;

    /* JADX INFO: renamed from: b */
    private final String f26024b;

    /* JADX INFO: renamed from: c */
    private final b f26025c;

    /* JADX INFO: renamed from: d */
    private final C12414p0 f26026d;

    /* JADX INFO: renamed from: e */
    private final C12128c6 f26027e;

    /* JADX INFO: renamed from: f */
    private final C11775Z0 f26028f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC12611y0 f26029g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC11451G7 f26030h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC12400o4 f26031i;

    /* JADX INFO: renamed from: j */
    private final Lazy f26032j;

    /* JADX INFO: renamed from: k */
    private InterfaceC11734Wa f26033k;

    /* JADX INFO: renamed from: l */
    private final UUID f26034l;

    /* JADX INFO: renamed from: m */
    private InterfaceC12384n6 f26035m;

    /* JADX INFO: renamed from: n */
    private C12189f5 f26036n;

    /* JADX INFO: renamed from: com.ironsource.Va$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m27727a(String placementName, LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C12414p0 c12414p0M33050a = C12414p0.a.m33050a(C14640a.m43197a(adFormat), C11426F0.b.MEDIATION);
            if (!c12414p0M33050a.m33049g()) {
                c12414p0M33050a.m33047e().m34211a().m26693a(placementName, C11758Y0.f26563b, false);
                return false;
            }
            C11447G3 c11447g3Mo26074a = C11455Gb.f24351s.m25905d().mo25849p().mo26074a(placementName, adFormat);
            boolean zM25834d = c11447g3Mo26074a.m25834d();
            c12414p0M33050a.m33047e().m34211a().m26693a(placementName, c11447g3Mo26074a.m25835e(), zM25834d);
            return zM25834d;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Va$b */
    public interface b {
        Double getBidFloor();
    }

    /* JADX INFO: renamed from: com.ironsource.Va$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final C12414p0 f26037a;

        /* JADX INFO: renamed from: b */
        private final C12128c6 f26038b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC11451G7 f26039c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC12400o4 f26040d;

        /* JADX INFO: renamed from: e */
        private final C12546u7 f26041e;

        /* JADX INFO: renamed from: f */
        private final b f26042f;

        /* JADX INFO: renamed from: g */
        private final C11775Z0 f26043g;

        public c(C12414p0 adTools, C12128c6 adControllerFactory, InterfaceC11451G7 provider, InterfaceC12400o4 currentTimeProvider, C12546u7 idFactory, b config, C11775Z0 adUnitValidator) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
            this.f26037a = adTools;
            this.f26038b = adControllerFactory;
            this.f26039c = provider;
            this.f26040d = currentTimeProvider;
            this.f26041e = idFactory;
            this.f26042f = config;
            this.f26043g = adUnitValidator;
        }

        /* JADX INFO: renamed from: a */
        public final C12128c6 m27728a() {
            return this.f26038b;
        }

        /* JADX INFO: renamed from: b */
        public final C12414p0 m27729b() {
            return this.f26037a;
        }

        /* JADX INFO: renamed from: c */
        public final C11775Z0 m27730c() {
            return this.f26043g;
        }

        /* JADX INFO: renamed from: d */
        public final b m27731d() {
            return this.f26042f;
        }

        /* JADX INFO: renamed from: e */
        public final InterfaceC12400o4 m27732e() {
            return this.f26040d;
        }

        /* JADX INFO: renamed from: f */
        public final C12546u7 m27733f() {
            return this.f26041e;
        }

        /* JADX INFO: renamed from: g */
        public final InterfaceC11451G7 m27734g() {
            return this.f26039c;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Va$d */
    static final class d extends Lambda implements Function0<C12110b6> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C12110b6 invoke() {
            return C11717Va.this.m27691b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Va$e */
    public static final class e implements InterfaceC12420p6 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12220h0 f26046b;

        e(C12220h0 c12220h0) {
            this.f26046b = c12220h0;
        }

        @Override // com.ironsource.InterfaceC12420p6
        /* JADX INFO: renamed from: a */
        public C12402o6 mo27736a(boolean z, InterfaceC12456r6 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC12593x0 abstractC12593x0Mo28169a = C11717Va.this.m27718g().mo28169a(z, this.f26046b);
            return new C12402o6(C11455Gb.f24351s.m25904c(), new C11707V0(C11717Va.this.m27717f(), abstractC12593x0Mo28169a, C11426F0.b.MEDIATION), abstractC12593x0Mo28169a, listener, null, null, null, null, 240, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11717Va(LevelPlay.AdFormat adFormat, String adUnitId, b config, C12414p0 adTools, C12128c6 fullscreenAdControllerFactory, C11775Z0 adUnitValidator, InterfaceC12611y0 adUnitDataFactory, InterfaceC11451G7 mediationServicesProvider, InterfaceC12400o4 currentTimeProvider, C12546u7 idFactory) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f26023a = adFormat;
        this.f26024b = adUnitId;
        this.f26025c = config;
        this.f26026d = adTools;
        this.f26027e = fullscreenAdControllerFactory;
        this.f26028f = adUnitValidator;
        this.f26029g = adUnitDataFactory;
        this.f26030h = mediationServicesProvider;
        this.f26031i = currentTimeProvider;
        this.f26032j = LazyKt.lazy(new d());
        UUID uuidM33891a = idFactory.m33891a();
        this.f26034l = uuidM33891a;
        this.f26035m = new C12164e6(this, null, 2, 0 == true ? 1 : 0);
        adTools.m33047e().m34212a(new C12377n(C14640a.m43197a(adFormat), uuidM33891a, adUnitId));
        m27701p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m27692b(C11717Va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26026d.m33047e().m34218f().m26768a();
        this$0.f26035m.loadAd();
    }

    /* JADX INFO: renamed from: p */
    private final void m27701p() {
        Double bidFloor = this.f26025c.getBidFloor();
        if (bidFloor != null) {
            this.f26026d.m33047e().m34218f().m26769a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final C12110b6 m27714c() {
        return (C12110b6) this.f26032j.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final LevelPlay.AdFormat m27715d() {
        return this.f26023a;
    }

    /* JADX INFO: renamed from: e */
    public final UUID m27716e() {
        return this.f26034l;
    }

    /* JADX INFO: renamed from: f */
    public final C12414p0 m27717f() {
        return this.f26026d;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC12611y0 m27718g() {
        return this.f26029g;
    }

    /* JADX INFO: renamed from: h */
    public final String m27719h() {
        return this.f26024b;
    }

    /* JADX INFO: renamed from: i */
    public final b m27720i() {
        return this.f26025c;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC12400o4 m27721j() {
        return this.f26031i;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC11734Wa m27722k() {
        return this.f26033k;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC11451G7 m27723l() {
        return this.f26030h;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m27724m() {
        InterfaceC12274k0 interfaceC12274k0Mo31358c = this.f26035m.mo31358c();
        this.f26026d.m33047e().m34217e().m33952a(Boolean.valueOf(interfaceC12274k0Mo31358c.mo31916a()), interfaceC12274k0Mo31358c instanceof InterfaceC12274k0.a ? ((InterfaceC12274k0.a) interfaceC12274k0Mo31358c).m31920c() : null);
        return interfaceC12274k0Mo31358c.mo31916a();
    }

    /* JADX INFO: renamed from: n */
    public final void m27725n() {
        this.f26036n = new C12189f5();
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27692b(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m27726o() {
        m27707a(new C12280k6(this, this.f26031i));
        m27714c().m31144m();
    }

    @Override // com.ironsource.InterfaceC12146d6
    public void onAdClicked() {
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27695c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12146d6
    public void onAdClosed() {
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27698d(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12146d6
    public void onAdDisplayed(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27694b(this.f$0, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12146d6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27697c(this.f$0, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12146d6
    public void onAdLoadFailed(final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27696c(this.f$0, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12146d6
    public void onAdLoaded(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27699d(this.f$0, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m27696c(C11717Va this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f26035m.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m27699d(C11717Va this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f26035m.onAdLoaded(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m27700e(C11717Va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26035m.mo31354a();
    }

    /* JADX INFO: renamed from: a */
    public final void m27705a(InterfaceC11734Wa interfaceC11734Wa) {
        this.f26033k = interfaceC11734Wa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m27694b(C11717Va this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f26035m.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m27695c(C11717Va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26035m.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m27698d(C11717Va this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26035m.onAdClosed();
    }

    /* JADX INFO: renamed from: a */
    public final void m27707a(InterfaceC12384n6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f26035m = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m27693b(C11717Va this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f26035m.mo31356a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m27697c(C11717Va this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f26035m.onAdInfoChanged(adInfo);
    }

    /* JADX INFO: renamed from: a */
    public final void m27704a(final Activity activity, final String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27681a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27681a(Activity activity, C11717Va this$0, String str) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.f26026d.m33047e().m34220h().m27981d();
        this$0.f26035m.mo31355a(activity, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m27713b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f26026d.m33047e().m34220h().m27985f("Fullscreen Ad Internal - " + message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final C12110b6 m27691b() {
        C12220h0 c12220h0 = new C12220h0(C14640a.m43197a(this.f26023a), this.f26034l, this.f26024b, null, this.f26030h.mo25838A().mo25736a(), this.f26025c.getBidFloor(), 8, null);
        e eVar = new e(c12220h0);
        C12616y5 c12616y5M33047e = this.f26026d.m33047e();
        C12414p0 c12414p0 = this.f26026d;
        c12616y5M33047e.m34212a(new C11390D0(c12414p0, c12220h0, c12414p0.m33041b(this.f26023a, this.f26024b).m33771b().m33774b()));
        return this.f26027e.m31261a(this, this.f26026d, c12220h0, eVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m27706a(C12164e6.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f26035m = new C12164e6(this, status);
    }

    @Override // com.ironsource.InterfaceC12146d6
    /* JADX INFO: renamed from: a */
    public void mo27708a(final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27693b(this.f$0, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12146d6
    /* JADX INFO: renamed from: a */
    public void mo27703a() {
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27700e(this.f$0);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12146d6
    /* JADX INFO: renamed from: a */
    public void mo27712a(final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f26026d, "onAdRewarded state.getAdInfo: " + this.f26035m.mo31357b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27688a(this.f$0, reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27688a(final C11717Va this$0, final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        final LevelPlayAdInfo levelPlayAdInfoMo31357b = this$0.f26035m.mo31357b();
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this$0.f26026d, "onAdRewarded adInfo: " + levelPlayAdInfoMo31357b + " reward: " + reward, (String) null, 2, (Object) null));
        this$0.f26026d.m33246e(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27689a(this.f$0, reward, levelPlayAdInfoMo31357b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27689a(C11717Va this$0, LevelPlayReward reward, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC11734Wa interfaceC11734Wa = this$0.f26033k;
        if (interfaceC11734Wa != null) {
            interfaceC11734Wa.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27711a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f26026d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long jM31432a = C12189f5.m31432a(this.f26036n);
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27682a(this.f$0, jM31432a);
            }
        });
        this.f26026d.m33246e(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27687a(this.f$0, adInfo);
            }
        });
    }

    public /* synthetic */ C11717Va(LevelPlay.AdFormat adFormat, String str, b bVar, C12414p0 c12414p0, C12128c6 c12128c6, C11775Z0 c11775z0, InterfaceC12611y0 interfaceC12611y0, InterfaceC11451G7 interfaceC11451G7, InterfaceC12400o4 interfaceC12400o4, C12546u7 c12546u7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c12414p0, c12128c6, c11775z0, interfaceC12611y0, (i & 128) != 0 ? C11455Gb.f24351s.m25905d() : interfaceC11451G7, interfaceC12400o4, c12546u7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27682a(C11717Va this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26026d.m33047e().m34218f().m26770a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27687a(C11717Va this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC11734Wa interfaceC11734Wa = this$0.f26033k;
        if (interfaceC11734Wa != null) {
            interfaceC11734Wa.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27685a(C11717Va c11717Va, LevelPlayAdError levelPlayAdError, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c11717Va.m27709a(levelPlayAdError, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m27709a(final LevelPlayAdError levelPlayAdError, final long j) {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f26026d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27683a(this.f$0, j, levelPlayAdError);
            }
        });
        this.f26026d.m33246e(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27690a(levelPlayAdError, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27683a(C11717Va this$0, long j, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C11600Oc c11600OcM34218f = this$0.f26026d.m33047e().m34218f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        c11600OcM34218f.m26771a(j, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27690a(LevelPlayAdError levelPlayAdError, C11717Va this$0) {
        InterfaceC11734Wa interfaceC11734Wa;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (interfaceC11734Wa = this$0.f26033k) == null) {
            return;
        }
        interfaceC11734Wa.onAdLoadFailed(levelPlayAdError);
    }

    /* JADX INFO: renamed from: a */
    public final void m27710a(final LevelPlayAdError error, final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f26026d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f26026d.m33245d(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27684a(this.f$0, error);
            }
        });
        this.f26026d.m33246e(new Runnable() { // from class: com.ironsource.Va$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                C11717Va.m27686a(this.f$0, error, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27684a(C11717Va this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f26026d.m33047e().m34220h().m27970a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m27686a(C11717Va this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC11734Wa interfaceC11734Wa = this$0.f26033k;
        if (interfaceC11734Wa != null) {
            interfaceC11734Wa.onAdDisplayFailed(error, adInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    public final LevelPlayReward m27702a(String str) {
        InterfaceC11559M7 interfaceC11559M7Mo25839B = this.f26030h.mo25839B();
        InterfaceC11452G8 interfaceC11452G8Mo25844f = this.f26030h.mo25844f();
        C11600Oc c11600OcM34218f = this.f26026d.m33047e().m34218f();
        InterfaceC11741X0 interfaceC11741X0M28058a = this.f26028f.m28058a(this.f26024b, this.f26023a, interfaceC11452G8Mo25844f);
        if (interfaceC11741X0M28058a instanceof InterfaceC11741X0.a) {
            InterfaceC11741X0.a aVar = (InterfaceC11741X0.a) interfaceC11741X0M28058a;
            IronLog.INTERNAL.warning(C12414p0.m33033a(this.f26026d, "getReward() returned a default reward. Reason: " + aVar.m27854b(), (String) null, 2, (Object) null));
            LevelPlayReward levelPlayReward = new LevelPlayReward("", 0);
            c11600OcM34218f.m26772a(levelPlayReward, str, aVar.m27854b());
            return levelPlayReward;
        }
        LevelPlayReward levelPlayRewardMo25732a = interfaceC11559M7Mo25839B.mo25732a(str, this.f26024b);
        C11600Oc.m26767a(c11600OcM34218f, levelPlayRewardMo25732a, str, null, 4, null);
        return levelPlayRewardMo25732a;
    }
}
