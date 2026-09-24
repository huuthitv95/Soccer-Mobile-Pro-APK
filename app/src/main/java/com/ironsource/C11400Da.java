package com.ironsource;

import android.graphics.Rect;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.ironsource.Da */
/* JADX INFO: loaded from: classes6.dex */
public final class C11400Da implements InterfaceC11508Ja {

    /* JADX INFO: renamed from: a */
    private final C12639za f24208a;

    /* JADX INFO: renamed from: b */
    private final C11536L2 f24209b;

    /* JADX INFO: renamed from: c */
    private final Long f24210c;

    /* JADX INFO: renamed from: d */
    private InterfaceC12465rf.a f24211d;

    /* JADX INFO: renamed from: e */
    private final long f24212e;

    /* JADX INFO: renamed from: com.ironsource.Da$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC12187f3.c f24214b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f24215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC12187f3.c cVar, long j) {
            super(0);
            this.f24214b = cVar;
            this.f24215c = j;
        }

        /* JADX INFO: renamed from: a */
        public final void m25625a() {
            C11400Da.this.f24208a.m34284a(C11400Da.this.f24209b, this.f24214b, Long.valueOf(this.f24215c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m25625a();
            return Unit.INSTANCE;
        }
    }

    public C11400Da(C12639za strategy, C11536L2 currentAdUnit, Long l) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f24208a = strategy;
        this.f24209b = currentAdUnit;
        this.f24210c = l;
        this.f24212e = strategy.m34303p().mo32926a();
        strategy.m34305r();
        m25624e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m25622c(final C11400Da this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C12461rb.m33222a(this$0.f24208a.m34282a(), new Runnable() { // from class: com.ironsource.Da$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11400Da.m25623d(this.f$0);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m25623d(C11400Da this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C12430pg.m33116a(this$0.f24208a.m34298k(), new Rect())) {
            this$0.m25624e();
            return;
        }
        long jMo32926a = this$0.f24208a.m34303p().mo32926a();
        long j = jMo32926a - this$0.f24212e;
        Long l = this$0.f24210c;
        C12461rb.m33218a((C12461rb) this$0.f24208a.m34282a(), AbstractRunnableC11754Xd.f26559a.m27962a(this$0.new a(new AbstractC12187f3.c(l != null ? jMo32926a - l.longValue() : 0L, new AbstractC12187f3.d.f(j)), jMo32926a)), 0L, 2, (Object) null);
    }

    /* JADX INFO: renamed from: e */
    private final void m25624e() {
        long jM34304q = this.f24208a.m34304q();
        InterfaceC12465rf interfaceC12465rfM34302o = this.f24208a.m34302o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.Da$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11400Da.m25622c(this.f$0);
            }
        };
        Duration.Companion companion = Duration.INSTANCE;
        this.f24211d = interfaceC12465rfM34302o.mo27336a(runnable, DurationKt.toDuration(jM34304q, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25477a() {
        InterfaceC11552M0.CC.$default$a(this);
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
        Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: f */
    public void mo25484f() {
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25479a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f24208a.m34291a("Received load success while paused not visible");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: b */
    public void mo25480b() {
        this.f24208a.m34291a("Loading a loaded ad");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: c */
    public void mo25482c() {
        InterfaceC12465rf.a aVar = this.f24211d;
        if (aVar != null) {
            aVar.m33252a();
        }
        this.f24209b.m33127a(true);
        C12639za c12639za = this.f24208a;
        c12639za.m34283a((InterfaceC11508Ja) new C11382Ca(c12639za));
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25478a(IronSourceError ironSourceError) {
        this.f24208a.m34291a("Received load success while paused not visible");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: d */
    public void mo25483d() {
        InterfaceC12465rf.a aVar = this.f24211d;
        if (aVar != null) {
            aVar.m33252a();
        }
        C12639za c12639za = this.f24208a;
        c12639za.m34283a((InterfaceC11508Ja) new C11436Fa(c12639za, this.f24209b));
    }
}
