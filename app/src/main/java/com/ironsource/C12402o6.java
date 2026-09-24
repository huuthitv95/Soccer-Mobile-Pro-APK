package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.C14640a;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.ironsource.o6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12402o6 implements InterfaceC12226h6 {

    /* JADX INFO: renamed from: a */
    private final C11455Gb f31606a;

    /* JADX INFO: renamed from: b */
    private final C11707V0 f31607b;

    /* JADX INFO: renamed from: c */
    private final AbstractC12593x0 f31608c;

    /* JADX INFO: renamed from: d */
    private InterfaceC12456r6 f31609d;

    /* JADX INFO: renamed from: e */
    private final Function3<C11371C, C11479I, InterfaceC12226h6, C12208g6> f31610e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC12465rf f31611f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC12400o4 f31612g;

    /* JADX INFO: renamed from: h */
    private C12244i6 f31613h;

    /* JADX INFO: renamed from: i */
    private b f31614i;

    /* JADX INFO: renamed from: j */
    private a f31615j;

    /* JADX INFO: renamed from: k */
    private final C12466rg f31616k;

    /* JADX INFO: renamed from: l */
    private InterfaceC12465rf.a f31617l;

    /* JADX INFO: renamed from: m */
    private Long f31618m;

    /* JADX INFO: renamed from: com.ironsource.o6$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo25271a(C12402o6 c12402o6, IronSourceError ironSourceError);

        /* JADX INFO: renamed from: a */
        void mo25272a(C12402o6 c12402o6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.o6$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo25270a(C12402o6 c12402o6);

        /* JADX INFO: renamed from: b */
        void mo25275b(C12402o6 c12402o6, IronSourceError ironSourceError);

        /* JADX INFO: renamed from: b */
        void mo25276b(C12402o6 c12402o6, LevelPlayAdInfo levelPlayAdInfo);

        /* JADX INFO: renamed from: c */
        void mo25278c(C12402o6 c12402o6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.o6$d */
    /* synthetic */ class d extends FunctionReferenceImpl implements Function3<C11371C, C11479I, InterfaceC12226h6, C12208g6> {
        d(Object obj) {
            super(3, obj, C12402o6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C12208g6 invoke(C11371C p0, C11479I p1, InterfaceC12226h6 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return ((C12402o6) this.receiver).m32928a(p0, p1, p2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o6$e */
    static final class e extends Lambda implements Function1<C12402o6, Unit> {

        /* JADX INFO: renamed from: a */
        public static final e f31620a = new e();

        e() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m32955a(C12402o6 weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            b bVar = weak.f31614i;
            if (bVar != null) {
                bVar.mo25270a(weak);
            }
            weak.f31616k.mo25513a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C12402o6 c12402o6) {
            m32955a(c12402o6);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12402o6(C11455Gb mediationServices, C11707V0 adUnitTools, AbstractC12593x0 adUnitData, InterfaceC12456r6 fullscreenListener, InterfaceC12537tg interfaceC12537tg, Function3<? super C11371C, ? super C11479I, ? super InterfaceC12226h6, C12208g6> function3, InterfaceC12465rf taskScheduler, InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f31606a = mediationServices;
        this.f31607b = adUnitTools;
        this.f31608c = adUnitData;
        this.f31609d = fullscreenListener;
        this.f31610e = function3;
        this.f31611f = taskScheduler;
        this.f31612g = currentTimeProvider;
        this.f31616k = m32930a(interfaceC12537tg);
    }

    protected final void finalize() {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31607b, "finalizing ad unit", (String) null, 2, (Object) null));
        InterfaceC12465rf.a aVar = this.f31617l;
        if (aVar != null) {
            aVar.m33252a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final String m32936c() {
        return this.f31608c.m34082l();
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC12285kb<Unit> m32940f() {
        if (!this.f31616k.m33270h()) {
            return new InterfaceC12285kb.a(new IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.f31606a.mo25849p().mo26074a(m32936c(), m32935b()).m25834d()) {
            return new InterfaceC12285kb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + m32936c() + " is capped"));
        }
        if (!this.f31606a.mo25845g().mo25656a(this.f31608c.mo26467b().m31570c()).m25834d()) {
            return new InterfaceC12285kb.b(Unit.INSTANCE);
        }
        return new InterfaceC12285kb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.f31608c.mo26467b().m31570c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m32943g() {
        InterfaceC12465rf.a aVar = this.f31617l;
        if (aVar != null) {
            aVar.m33252a();
        }
        long jM33039b = this.f31607b.m33039b(m32935b());
        InterfaceC12465rf interfaceC12465rf = this.f31611f;
        InterfaceC12465rf.b bVarM27452a = C11662S6.m27452a(this, e.f31620a);
        Duration.Companion companion = Duration.INSTANCE;
        this.f31617l = interfaceC12465rf.mo27335a(bVarM27452a, DurationKt.toDuration(jM33039b, DurationUnit.MILLISECONDS));
    }

    /* JADX INFO: renamed from: h */
    private final void m32944h() {
        String strM32936c = m32936c();
        if (strM32936c.length() > 0) {
            this.f31606a.mo25772b().mo26076b(strM32936c, m32935b());
            C11447G3 c11447g3Mo26074a = this.f31606a.mo25849p().mo26074a(strM32936c, m32935b());
            if (c11447g3Mo26074a.m25834d()) {
                this.f31607b.m33047e().m34211a().m26696b(strM32936c, c11447g3Mo26074a.m25835e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC11425F
    /* JADX INFO: renamed from: b */
    public void mo25743b(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f31616k.m33266c(instance);
        this.f31607b.m33047e().m34211a().m26701g(m32936c());
        this.f31606a.mo25775i().mo26267b(C14640a.m43197a(m32935b()));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC12456r6 m32949d() {
        return this.f31609d;
    }

    /* JADX INFO: renamed from: e */
    public final LevelPlayAdInfo m32950e() {
        AbstractC11353B abstractC11353BM33268e = this.f31616k.m33268e();
        if (abstractC11353BM33268e != null) {
            return abstractC11353BM33268e.mo25345e();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m32948a(InterfaceC12456r6 interfaceC12456r6) {
        Intrinsics.checkNotNullParameter(interfaceC12456r6, "<set-?>");
        this.f31609d = interfaceC12456r6;
    }

    /* JADX INFO: renamed from: a */
    public final void m32947a(b loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31607b, (String) null, (String) null, 3, (Object) null));
        this.f31614i = loadListener;
        this.f31618m = Long.valueOf(this.f31612g.mo32926a());
        this.f31607b.m27635a(new C12468s0(this.f31608c.mo26467b()));
        InterfaceC11407E interfaceC11407E = new InterfaceC11407E() { // from class: com.ironsource.o6$$ExternalSyntheticLambda0
            @Override // com.ironsource.InterfaceC11407E
            /* JADX INFO: renamed from: a */
            public final AbstractC11353B mo25641a(C11371C c11371c, C11479I c11479i) {
                return C12402o6.m32927a(this.f$0, c11371c, c11479i);
            }
        };
        this.f31607b.m33047e().m34217e().m33953a(this.f31608c.mo26471u());
        this.f31616k.m33263a(interfaceC11407E);
    }

    /* JADX INFO: renamed from: com.ironsource.o6$c */
    public static final class c implements InterfaceC12645zg {
        c() {
        }

        @Override // com.ironsource.InterfaceC12645zg
        /* JADX INFO: renamed from: a */
        public void mo32951a(int i, String errorReason) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l = C12402o6.this.f31618m;
            if (l != null) {
                lValueOf = Long.valueOf(C12402o6.this.f31612g.mo32926a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C12402o6.this.f31607b.m33047e().m34217e().m33949a(lValueOf != null ? lValueOf.longValue() : 0L, i, errorReason, C12402o6.this.f31608c.mo26471u());
            b bVar = C12402o6.this.f31614i;
            if (bVar != null) {
                bVar.mo25275b(C12402o6.this, new IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.InterfaceC12645zg
        /* JADX INFO: renamed from: b */
        public void mo32953b(AbstractC11353B instance) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l = C12402o6.this.f31618m;
            if (l != null) {
                lValueOf = Long.valueOf(C12402o6.this.f31612g.mo32926a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C12402o6.this.f31607b.m33047e().m34217e().m33951a(lValueOf != null ? lValueOf.longValue() : 0L, C12402o6.this.f31608c.mo26471u());
            C12402o6.this.m32943g();
            b bVar = C12402o6.this.f31614i;
            if (bVar != null) {
                bVar.mo25276b(C12402o6.this, instance.mo25345e());
            }
        }

        @Override // com.ironsource.InterfaceC12645zg
        /* JADX INFO: renamed from: a */
        public void mo32952a(AbstractC11353B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            C12402o6.this.f31607b.m33047e().m34211a().m26699e(C12402o6.this.m32936c());
            C12402o6.this.m32943g();
            b bVar = C12402o6.this.f31614i;
            if (bVar != null) {
                bVar.mo25278c(C12402o6.this, instance.mo25345e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC12226h6
    /* JADX INFO: renamed from: b */
    public void mo31589b(C12208g6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.f31607b.m33047e().m34211a().m26695b(m32936c());
        this.f31616k.m33265c();
        this.f31613h = null;
        this.f31609d.onClosed();
    }

    /* JADX INFO: renamed from: b */
    private final LevelPlay.AdFormat m32935b() {
        return this.f31608c.mo26467b().m31572e();
    }

    public /* synthetic */ C12402o6(C11455Gb c11455Gb, C11707V0 c11707v0, AbstractC12593x0 abstractC12593x0, InterfaceC12456r6 interfaceC12456r6, InterfaceC12537tg interfaceC12537tg, Function3 function3, InterfaceC12465rf interfaceC12465rf, InterfaceC12400o4 interfaceC12400o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11455Gb, c11707v0, abstractC12593x0, interfaceC12456r6, (i & 16) != 0 ? null : interfaceC12537tg, (i & 32) != 0 ? null : function3, (i & 64) != 0 ? new C11645R6(C11662S6.m27451a(c11707v0.m33225a())) : interfaceC12465rf, (i & 128) != 0 ? new InterfaceC12400o4.a() : interfaceC12400o4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final AbstractC11353B m32927a(C12402o6 this$0, C11371C instanceData, C11479I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Function3 dVar = this$0.f31610e;
        if (dVar == null) {
            dVar = new d(this$0);
        }
        return (AbstractC11353B) dVar.invoke(instanceData, adInstancePayload, this$0);
    }

    /* JADX INFO: renamed from: a */
    public final void m32946a(Activity activity, a displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C12414p0.m33033a(this.f31607b, (String) null, (String) null, 3, (Object) null));
        this.f31615j = displayListener;
        this.f31607b.m33047e().m34211a().m26688a(activity, m32936c());
        InterfaceC12285kb<Unit> interfaceC12285kbM32940f = m32940f();
        if (interfaceC12285kbM32940f instanceof InterfaceC12285kb.a) {
            IronSourceError ironSourceErrorM31944b = ((InterfaceC12285kb.a) interfaceC12285kbM32940f).m31944b();
            ironLog.verbose(C12414p0.m33033a(this.f31607b, ironSourceErrorM31944b.getErrorMessage(), (String) null, 2, (Object) null));
            this.f31607b.m33047e().m34211a().m26690a(m32936c(), ironSourceErrorM31944b.getErrorCode(), ironSourceErrorM31944b.getErrorMessage(), this.f31616k.m33269g());
            displayListener.mo25271a(this, ironSourceErrorM31944b);
            return;
        }
        InterfaceC12465rf.a aVar = this.f31617l;
        if (aVar != null) {
            aVar.m33252a();
        }
        C12244i6 c12244i6 = new C12244i6(activity);
        this.f31613h = c12244i6;
        this.f31616k.m33264a((InterfaceC11515K) c12244i6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final C12208g6 m32928a(C11371C c11371c, C11479I c11479i, InterfaceC12226h6 interfaceC12226h6) {
        return new C12208g6(new C11707V0(this.f31607b, C11426F0.b.PROVIDER), c11371c, c11479i, interfaceC12226h6);
    }

    /* JADX INFO: renamed from: a */
    private final C12466rg m32930a(InterfaceC12537tg interfaceC12537tg) {
        InterfaceC12645zg interfaceC12645zgM32932a = m32932a();
        if (interfaceC12537tg != null) {
            return interfaceC12537tg.m33827a(interfaceC12645zgM32932a);
        }
        return new C12466rg(this.f31607b, this.f31608c, C11455Gb.f24351s.m25904c().mo25846h().mo32192s(), interfaceC12645zgM32932a);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC12645zg m32932a() {
        return new c();
    }

    @Override // com.ironsource.InterfaceC12226h6
    /* JADX INFO: renamed from: a */
    public void mo31587a(C12208g6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.f31616k.m33265c();
        this.f31613h = null;
        a aVar = this.f31615j;
        if (aVar != null) {
            aVar.mo25272a(this, fullscreenInstance.mo25345e());
        }
        m32944h();
        this.f31606a.mo25777l().mo25658b(this.f31608c.mo26467b().m31570c());
    }

    @Override // com.ironsource.InterfaceC11425F
    /* JADX INFO: renamed from: a */
    public void mo25742a(AbstractC11353B instance, IronSourceError error) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31607b, error.toString(), (String) null, 2, (Object) null));
        C12244i6 c12244i6 = this.f31613h;
        EnumC11349Ad enumC11349AdM33269g = this.f31616k.m33269g();
        m32933a(enumC11349AdM33269g);
        if (enumC11349AdM33269g == EnumC11349Ad.CAN_RECOVER && c12244i6 != null) {
            this.f31616k.m33264a((InterfaceC11515K) c12244i6, true);
            return;
        }
        this.f31616k.m33265c();
        this.f31613h = null;
        this.f31607b.m33047e().m34211a().m26690a(m32936c(), error.getErrorCode(), error.getErrorMessage(), enumC11349AdM33269g);
        a aVar = this.f31615j;
        if (aVar != null) {
            aVar.mo25271a(this, error);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m32933a(EnumC11349Ad enumC11349Ad) {
        if (enumC11349Ad == EnumC11349Ad.CAN_RECOVER || enumC11349Ad == EnumC11349Ad.NO_LOADED_ADS) {
            this.f31607b.m33047e().m34220h().m27968a(enumC11349Ad);
        }
    }

    @Override // com.ironsource.InterfaceC12226h6
    /* JADX INFO: renamed from: a */
    public void mo31588a(C12208g6 fullscreenInstance, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31607b, fullscreenInstance.m25356q(), (String) null, 2, (Object) null));
        this.f31609d.mo31141a(reward);
    }

    @Override // com.ironsource.InterfaceC11425F
    /* JADX INFO: renamed from: a */
    public void mo25741a(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f31607b.m33047e().m34211a().m26689a(m32936c());
        this.f31609d.mo26245e();
    }
}
