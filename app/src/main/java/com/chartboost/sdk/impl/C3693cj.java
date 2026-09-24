package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.cj */
/* JADX INFO: loaded from: classes3.dex */
public final class C3693cj {

    /* JADX INFO: renamed from: b */
    public static C3746f3 f13755b;

    /* JADX INFO: renamed from: c */
    public static InterfaceC4167xk f13756c;

    /* JADX INFO: renamed from: a */
    public static final C3693cj f13754a = new C3693cj();

    /* JADX INFO: renamed from: d */
    public static final CoroutineScope f13757d = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.cj$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13758b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC3968oj f13759c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3761fi f13760d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Context f13761e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C3665be f13762f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C4105v2 f13763g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3968oj abstractC3968oj, C3761fi c3761fi, Context context, C3665be c3665be, C4105v2 c4105v2, Continuation continuation) {
            super(2, continuation);
            this.f13759c = abstractC3968oj;
            this.f13760d = c3761fi;
            this.f13761e = context;
            this.f13762f = c3665be;
            this.f13763g = c4105v2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f13759c, this.f13760d, this.f13761e, this.f13762f, this.f13763g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f13758b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                AbstractC3968oj abstractC3968oj = this.f13759c;
                InterfaceC4167xk interfaceC4167xk = C3693cj.f13756c;
                C3761fi c3761fi = this.f13760d;
                Context applicationContext = this.f13761e.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                abstractC3968oj.mo18984a(interfaceC4167xk, c3761fi, applicationContext, this.f13762f, this.f13763g);
            } catch (Exception e) {
                C4048sb.m19410b("Error tracking VAST event " + this.f13759c.m18982a() + ": " + e.getMessage(), e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17205a(C3746f3 service) {
        Intrinsics.checkNotNullParameter(service, "service");
        f13755b = service;
    }

    /* JADX INFO: renamed from: a */
    public final void m17206a(AbstractC3968oj eventType, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(omManager, "omManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        BuildersKt__Builders_commonKt.launch$default(f13757d, null, null, new a(eventType, c3761fi, androidContext, omManager, identity, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17207a(InterfaceC4167xk interfaceC4167xk) {
        f13756c = interfaceC4167xk;
    }

    /* JADX INFO: renamed from: b */
    public final C3746f3 m17208b() {
        return f13755b;
    }
}
