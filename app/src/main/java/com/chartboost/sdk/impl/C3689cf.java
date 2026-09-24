package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.cf */
/* JADX INFO: loaded from: classes3.dex */
public final class C3689cf {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3985pe f13711a;

    /* JADX INFO: renamed from: b */
    public final List f13712b;

    /* JADX INFO: renamed from: c */
    public final long f13713c;

    /* JADX INFO: renamed from: d */
    public final CoroutineScope f13714d;

    /* JADX INFO: renamed from: e */
    public Job f13715e;

    /* JADX INFO: renamed from: f */
    public final Set f13716f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.cf$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13717b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f13718c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = C3689cf.this.new a(continuation);
            aVar.f13718c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13717b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f13718c;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f13718c;
                ResultKt.throwOnFailure(obj);
            }
            while (CoroutineScopeKt.isActive(coroutineScope)) {
                long jMo18079b = C3689cf.this.f13711a.mo18079b();
                double dCoerceAtLeast = jMo18079b / RangesKt.coerceAtLeast(C3689cf.this.f13711a.mo18078a(), 1L);
                List list = C3689cf.this.f13712b;
                C3689cf c3689cf = C3689cf.this;
                ArrayList<C3666bf> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!c3689cf.f13716f.contains((C3666bf) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                C3689cf c3689cf2 = C3689cf.this;
                for (C3666bf c3666bf : arrayList) {
                    AbstractC3712df abstractC3712dfM16938b = c3666bf.m16938b();
                    if (!(abstractC3712dfM16938b instanceof AbstractC3712df.a)) {
                        if (!(abstractC3712dfM16938b instanceof AbstractC3712df.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (jMo18079b >= ((AbstractC3712df.b) abstractC3712dfM16938b).m17302a()) {
                            c3689cf2.f13716f.add(c3666bf);
                            c3666bf.m16937a().invoke();
                        }
                    } else if (dCoerceAtLeast >= ((AbstractC3712df.a) abstractC3712dfM16938b).m17301a()) {
                        c3689cf2.f13716f.add(c3666bf);
                        c3666bf.m16937a().invoke();
                    }
                }
                long j = C3689cf.this.f13713c;
                this.f13718c = coroutineScope;
                this.f13717b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public C3689cf(InterfaceC3985pe provider, List events, long j, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f13711a = provider;
        this.f13712b = events;
        this.f13713c = j;
        this.f13714d = coroutineScope == null ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain())) : coroutineScope;
        this.f13716f = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m17179a() {
        Job job = this.f13715e;
        if (job == null || !job.isActive()) {
            this.f13715e = BuildersKt__Builders_commonKt.launch$default(this.f13714d, null, null, new a(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17180b() {
        Job job = this.f13715e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f13715e = null;
        this.f13716f.clear();
    }
}
