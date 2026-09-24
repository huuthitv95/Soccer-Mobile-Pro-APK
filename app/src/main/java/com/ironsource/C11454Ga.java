package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.ironsource.Ga */
/* JADX INFO: loaded from: classes6.dex */
public final class C11454Ga implements InterfaceC11508Ja {

    /* JADX INFO: renamed from: a */
    private final C12639za f24343a;

    /* JADX INFO: renamed from: b */
    private final C11536L2 f24344b;

    /* JADX INFO: renamed from: c */
    private final C11536L2 f24345c;

    /* JADX INFO: renamed from: d */
    private final long f24346d;

    /* JADX INFO: renamed from: e */
    private final boolean f24347e;

    /* JADX INFO: renamed from: f */
    private InterfaceC12285kb<LevelPlayAdInfo> f24348f;

    /* JADX INFO: renamed from: g */
    private InterfaceC12465rf.a f24349g;

    /* JADX INFO: renamed from: com.ironsource.Ga$a */
    static final class a extends Lambda implements Function1<C11454Ga, Unit> {

        /* JADX INFO: renamed from: a */
        public static final a f24350a = new a();

        a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m25877a(C11454Ga weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            weak.m25875e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C11454Ga c11454Ga) {
            m25877a(c11454Ga);
            return Unit.INSTANCE;
        }
    }

    public C11454Ga(C12639za strategy, C11536L2 currentAdUnit, C11536L2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f24343a = strategy;
        this.f24344b = currentAdUnit;
        this.f24345c = reloadingAdUnit;
        this.f24346d = j;
        this.f24347e = z;
        m25876g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m25875e() {
        InterfaceC12285kb<LevelPlayAdInfo> interfaceC12285kb = this.f24348f;
        if (interfaceC12285kb == null) {
            C12639za c12639za = this.f24343a;
            c12639za.m34283a((InterfaceC11508Ja) new C11490Ia(c12639za, this.f24344b, this.f24345c, this.f24346d, this.f24347e));
        } else if (interfaceC12285kb instanceof InterfaceC12285kb.b) {
            m25873a((LevelPlayAdInfo) ((InterfaceC12285kb.b) interfaceC12285kb).m31948b());
        } else if (interfaceC12285kb instanceof InterfaceC12285kb.a) {
            m25874b(((InterfaceC12285kb.a) interfaceC12285kb).m31944b());
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m25876g() {
        InterfaceC12465rf interfaceC12465rfM34302o = this.f24343a.m34302o();
        InterfaceC12465rf.b bVarM27452a = C11662S6.m27452a(this, a.f24350a);
        Duration.Companion companion = Duration.INSTANCE;
        this.f24349g = interfaceC12465rfM34302o.mo27335a(bVarM27452a, DurationKt.toDuration(this.f24343a.m34299l(), DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25477a() {
        InterfaceC11552M0.CC.$default$a(this);
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: b */
    public void mo25480b() {
        this.f24343a.m34291a("Loading an ad while reloading");
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
        Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: c */
    public void mo25482c() {
        InterfaceC12465rf.a aVar = this.f24349g;
        if (aVar != null) {
            aVar.m33252a();
        }
        this.f24344b.m33127a(true);
        this.f24345c.m33127a(true);
        C12639za c12639za = this.f24343a;
        c12639za.m34283a((InterfaceC11508Ja) new C11382Ca(c12639za));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: d */
    public void mo25483d() {
        InterfaceC12465rf.a aVar = this.f24349g;
        if (aVar != null) {
            aVar.m33252a();
        }
        C12639za c12639za = this.f24343a;
        c12639za.m34283a((InterfaceC11508Ja) new C11436Fa(c12639za, this.f24344b));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: f */
    public void mo25484f() {
        C12639za c12639za = this.f24343a;
        c12639za.m34283a((InterfaceC11508Ja) new C11454Ga(c12639za, this.f24344b, this.f24345c, c12639za.m34303p().mo32926a(), false, 16, null));
    }

    /* JADX INFO: renamed from: b */
    private final void m25874b(IronSourceError ironSourceError) {
        this.f24343a.m34288a(ironSourceError, this.f24344b, (AbstractC12187f3) new AbstractC12187f3.c(this.f24343a.m34303p().mo32926a() - this.f24346d, AbstractC12187f3.d.g.f30379a), this.f24347e, false, Long.valueOf(this.f24346d));
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25479a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoM33844c = adUnitCallback.m33844c();
        if (levelPlayAdInfoM33844c != null) {
            m25872a(new InterfaceC12285kb.b(levelPlayAdInfoM33844c));
        } else {
            m25872a(new InterfaceC12285kb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25478a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        m25872a(new InterfaceC12285kb.a(ironSourceError));
    }

    /* JADX INFO: renamed from: a */
    private final void m25873a(LevelPlayAdInfo levelPlayAdInfo) {
        long jMo32926a = this.f24343a.m34303p().mo32926a() - this.f24346d;
        this.f24343a.m34289a(new C12539u0(this.f24345c, levelPlayAdInfo), this.f24345c, this.f24344b, (AbstractC12187f3) new AbstractC12187f3.c(jMo32926a, AbstractC12187f3.d.h.f30380a), false, Long.valueOf(this.f24346d));
    }

    public /* synthetic */ C11454Ga(C12639za c12639za, C11536L2 c11536l2, C11536L2 c11536l3, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12639za, c11536l2, c11536l3, j, (i & 16) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: a */
    private final void m25872a(InterfaceC12285kb<LevelPlayAdInfo> interfaceC12285kb) {
        if (this.f24348f != null) {
            this.f24343a.m34291a("Received excessive load " + C11472Ha.m26006b(interfaceC12285kb) + " while reloading");
            return;
        }
        this.f24348f = interfaceC12285kb;
    }
}
