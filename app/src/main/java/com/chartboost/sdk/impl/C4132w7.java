package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import com.chartboost.sdk.events.ChartboostError;
import java.net.URL;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4132w7 {

    /* JADX INFO: renamed from: a */
    public final C4110v7 f16695a;

    /* JADX INFO: renamed from: b */
    public final CoroutineScope f16696b;

    /* JADX INFO: renamed from: c */
    public AbstractC4007qe f16697c;

    /* JADX INFO: renamed from: d */
    public Job f16698d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.w7$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16699b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16700c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC4153x6 f16701d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ URL f16702e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C4132w7 f16703f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ExoPlayer f16704g;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.w7$a$a, reason: collision with other inner class name */
        public static final class C15488a implements FlowCollector {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ URL f16705a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4132w7 f16706b;

            public C15488a(URL url, C4132w7 c4132w7) {
                this.f16705a = url;
                this.f16706b = c4132w7;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3996q3 abstractC3996q3, Continuation continuation) {
                if (abstractC3996q3 instanceof AbstractC3996q3.a) {
                    AbstractC3996q3.a aVar = (AbstractC3996q3.a) abstractC3996q3;
                    if (Intrinsics.areEqual(this.f16705a, aVar.m19091b())) {
                        C4048sb.m19417e("Cache eviction detected for " + this.f16705a + ". Reason: " + aVar.m19090a(), null, 2, null);
                        this.f16706b.m19761a(AbstractC3963oe.c.f15685a);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4153x6 interfaceC4153x6, URL url, C4132w7 c4132w7, ExoPlayer exoPlayer, Continuation continuation) {
            super(2, continuation);
            this.f16701d = interfaceC4153x6;
            this.f16702e = url;
            this.f16703f = c4132w7;
            this.f16704g = exoPlayer;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f16701d, this.f16702e, this.f16703f, this.f16704g, continuation);
            aVar.f16700c = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
        
            if (r9.collect(r1, r8) == r0) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C4132w7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4132w7(C4110v7 actionConsumer, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(actionConsumer, "actionConsumer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f16695a = actionConsumer;
        this.f16696b = coroutineScope;
        this.f16697c = AbstractC4007qe.b.f15933a;
    }

    /* JADX INFO: renamed from: a */
    public final long m19759a() {
        ExoPlayer exoPlayerMo19170a = this.f16697c.mo19170a();
        if (exoPlayerMo19170a != null) {
            return RangesKt.coerceAtLeast(exoPlayerMo19170a.getCurrentPosition(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC4007qe m19760a(AbstractC4007qe abstractC4007qe, AbstractC3963oe abstractC3963oe) {
        if (abstractC4007qe instanceof AbstractC4007qe.b) {
            if (!(abstractC3963oe instanceof AbstractC3963oe.a)) {
                return abstractC3963oe instanceof AbstractC3963oe.i ? AbstractC4007qe.g.f15942a : abstractC4007qe;
            }
            AbstractC3963oe.a aVar = (AbstractC3963oe.a) abstractC3963oe;
            ExoPlayer exoPlayerM19663b = this.f16695a.m19663b(aVar.m18925b());
            m19762a(aVar.m18926c(), aVar.m18924a(), exoPlayerM19663b);
            return new AbstractC4007qe.c(aVar.m18926c(), exoPlayerM19663b);
        }
        if (abstractC4007qe instanceof AbstractC4007qe.c) {
            if (abstractC3963oe instanceof AbstractC3963oe.b) {
                AbstractC3963oe.b bVar = (AbstractC3963oe.b) abstractC3963oe;
                this.f16695a.m19661a(bVar.m18928b(), bVar.m18927a());
                return abstractC4007qe;
            }
            if (abstractC3963oe instanceof AbstractC3963oe.f) {
                this.f16695a.m19669e();
                return new AbstractC4007qe.f(((AbstractC4007qe.c) abstractC4007qe).m19171b(), ((AbstractC3963oe.f) abstractC3963oe).m18930a());
            }
            if (abstractC3963oe instanceof AbstractC3963oe.e) {
                AbstractC3963oe.e eVar = (AbstractC3963oe.e) abstractC3963oe;
                this.f16695a.m19662a(eVar.m18929a());
                return new AbstractC4007qe.a(eVar.m18929a());
            }
            if (!(abstractC3963oe instanceof AbstractC3963oe.c)) {
                if (!(abstractC3963oe instanceof AbstractC3963oe.i)) {
                    return abstractC4007qe;
                }
                this.f16695a.m19670f();
                m19765d();
                return AbstractC4007qe.g.f15942a;
            }
            AbstractC4007qe.c cVar = (AbstractC4007qe.c) abstractC4007qe;
            ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(cVar.m19171b().toString(), "Video asset for " + cVar.m19171b() + " was evicted during load.", null);
            this.f16695a.m19662a(assetUnavailable);
            return new AbstractC4007qe.a(assetUnavailable);
        }
        if (abstractC4007qe instanceof AbstractC4007qe.f) {
            if (abstractC3963oe instanceof AbstractC3963oe.h) {
                AbstractC4007qe.f fVar = (AbstractC4007qe.f) abstractC4007qe;
                this.f16695a.m19664b(fVar.mo19170a());
                return new AbstractC4007qe.e(fVar.m19174b(), fVar.mo19170a());
            }
            if (abstractC3963oe instanceof AbstractC3963oe.j) {
                this.f16695a.m19660a(((AbstractC4007qe.f) abstractC4007qe).mo19170a(), ((AbstractC3963oe.j) abstractC3963oe).m18931a());
                return abstractC4007qe;
            }
            if (abstractC3963oe instanceof AbstractC3963oe.k) {
                AbstractC4007qe.f fVar2 = (AbstractC4007qe.f) abstractC4007qe;
                this.f16695a.m19668d(fVar2.mo19170a());
                return new AbstractC4007qe.h(fVar2.m19174b(), fVar2.mo19170a());
            }
            if (abstractC3963oe instanceof AbstractC3963oe.i) {
                this.f16695a.m19670f();
                m19765d();
                return AbstractC4007qe.g.f15942a;
            }
            if (abstractC3963oe instanceof AbstractC3963oe.e) {
                AbstractC3963oe.e eVar2 = (AbstractC3963oe.e) abstractC3963oe;
                this.f16695a.m19662a(eVar2.m18929a());
                return new AbstractC4007qe.a(eVar2.m18929a());
            }
            if (!(abstractC3963oe instanceof AbstractC3963oe.c)) {
                return abstractC4007qe;
            }
            ChartboostError.Show.AdInvalidated adInvalidated = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f16695a.m19662a(adInvalidated);
            return new AbstractC4007qe.a(adInvalidated);
        }
        if (abstractC4007qe instanceof AbstractC4007qe.e) {
            if (abstractC3963oe instanceof AbstractC3963oe.g) {
                AbstractC4007qe.e eVar3 = (AbstractC4007qe.e) abstractC4007qe;
                this.f16695a.m19659a(eVar3.mo19170a());
                return new AbstractC4007qe.d(eVar3.m19173b(), eVar3.mo19170a());
            }
            if (abstractC3963oe instanceof AbstractC3963oe.d) {
                this.f16695a.m19667d();
                AbstractC4007qe.e eVar4 = (AbstractC4007qe.e) abstractC4007qe;
                return new AbstractC4007qe.f(eVar4.m19173b(), eVar4.mo19170a());
            }
            if (abstractC3963oe instanceof AbstractC3963oe.k) {
                AbstractC4007qe.e eVar5 = (AbstractC4007qe.e) abstractC4007qe;
                this.f16695a.m19668d(eVar5.mo19170a());
                return new AbstractC4007qe.h(eVar5.m19173b(), eVar5.mo19170a());
            }
            if (abstractC3963oe instanceof AbstractC3963oe.j) {
                this.f16695a.m19660a(((AbstractC4007qe.e) abstractC4007qe).mo19170a(), ((AbstractC3963oe.j) abstractC3963oe).m18931a());
                return abstractC4007qe;
            }
            if (abstractC3963oe instanceof AbstractC3963oe.i) {
                this.f16695a.m19670f();
                m19765d();
                return AbstractC4007qe.g.f15942a;
            }
            if (abstractC3963oe instanceof AbstractC3963oe.e) {
                AbstractC3963oe.e eVar6 = (AbstractC3963oe.e) abstractC3963oe;
                this.f16695a.m19662a(eVar6.m18929a());
                return new AbstractC4007qe.a(eVar6.m18929a());
            }
            if (!(abstractC3963oe instanceof AbstractC3963oe.c)) {
                return abstractC4007qe;
            }
            ChartboostError.Show.AdInvalidated adInvalidated2 = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f16695a.m19662a(adInvalidated2);
            return new AbstractC4007qe.a(adInvalidated2);
        }
        if (!(abstractC4007qe instanceof AbstractC4007qe.d)) {
            if (!(abstractC4007qe instanceof AbstractC4007qe.h)) {
                if (!(abstractC4007qe instanceof AbstractC4007qe.a) && !(abstractC4007qe instanceof AbstractC4007qe.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(abstractC3963oe instanceof AbstractC3963oe.i)) {
                    return abstractC4007qe;
                }
                this.f16695a.m19670f();
                m19765d();
                return AbstractC4007qe.g.f15942a;
            }
            if (abstractC3963oe instanceof AbstractC3963oe.h) {
                AbstractC4007qe.h hVar = (AbstractC4007qe.h) abstractC4007qe;
                this.f16695a.m19666c(hVar.mo19170a());
                this.f16695a.m19664b(hVar.mo19170a());
                return new AbstractC4007qe.e(hVar.m19175b(), hVar.mo19170a());
            }
            if (!(abstractC3963oe instanceof AbstractC3963oe.i)) {
                return abstractC4007qe;
            }
            this.f16695a.m19670f();
            m19765d();
            return AbstractC4007qe.g.f15942a;
        }
        if (abstractC3963oe instanceof AbstractC3963oe.h) {
            AbstractC4007qe.d dVar = (AbstractC4007qe.d) abstractC4007qe;
            this.f16695a.m19664b(dVar.mo19170a());
            return new AbstractC4007qe.e(dVar.m19172b(), dVar.mo19170a());
        }
        if (abstractC3963oe instanceof AbstractC3963oe.k) {
            AbstractC4007qe.d dVar2 = (AbstractC4007qe.d) abstractC4007qe;
            this.f16695a.m19668d(dVar2.mo19170a());
            return new AbstractC4007qe.h(dVar2.m19172b(), dVar2.mo19170a());
        }
        if (abstractC3963oe instanceof AbstractC3963oe.j) {
            this.f16695a.m19660a(((AbstractC4007qe.d) abstractC4007qe).mo19170a(), ((AbstractC3963oe.j) abstractC3963oe).m18931a());
            return abstractC4007qe;
        }
        if (abstractC3963oe instanceof AbstractC3963oe.i) {
            this.f16695a.m19670f();
            m19765d();
            return AbstractC4007qe.g.f15942a;
        }
        if (abstractC3963oe instanceof AbstractC3963oe.e) {
            AbstractC3963oe.e eVar7 = (AbstractC3963oe.e) abstractC3963oe;
            this.f16695a.m19662a(eVar7.m18929a());
            return new AbstractC4007qe.a(eVar7.m18929a());
        }
        if (!(abstractC3963oe instanceof AbstractC3963oe.c)) {
            return abstractC4007qe;
        }
        ChartboostError.Show.AdInvalidated adInvalidated3 = ChartboostError.Show.AdInvalidated.INSTANCE;
        this.f16695a.m19662a(adInvalidated3);
        return new AbstractC4007qe.a(adInvalidated3);
    }

    /* JADX INFO: renamed from: a */
    public final void m19761a(AbstractC3963oe event) {
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC4007qe abstractC4007qe = this.f16697c;
        AbstractC4007qe abstractC4007qeM19760a = m19760a(abstractC4007qe, event);
        this.f16697c = abstractC4007qeM19760a;
        C4048sb.m19408a("State Transition: " + Reflection.getOrCreateKotlinClass(abstractC4007qe.getClass()).getSimpleName() + " -> " + Reflection.getOrCreateKotlinClass(abstractC4007qeM19760a.getClass()).getSimpleName() + " on Event " + Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m19762a(URL url, InterfaceC4153x6 interfaceC4153x6, ExoPlayer exoPlayer) {
        m19765d();
        this.f16698d = BuildersKt__Builders_commonKt.launch$default(this.f16696b, null, null, new a(interfaceC4153x6, url, this, exoPlayer, null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC4007qe m19763b() {
        return this.f16697c;
    }

    /* JADX INFO: renamed from: c */
    public final long m19764c() {
        ExoPlayer exoPlayerMo19170a = this.f16697c.mo19170a();
        if (exoPlayerMo19170a != null) {
            return RangesKt.coerceAtLeast(exoPlayerMo19170a.getDuration(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public final void m19765d() {
        Job job = this.f16698d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f16698d = null;
    }
}
