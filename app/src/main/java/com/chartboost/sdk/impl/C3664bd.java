package com.chartboost.sdk.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bd */
/* JADX INFO: loaded from: classes3.dex */
public final class C3664bd implements InterfaceC3641ad {

    /* JADX INFO: renamed from: f */
    public static final a f13557f = new a(null);

    /* JADX INFO: renamed from: a */
    public final Handler f13558a;

    /* JADX INFO: renamed from: b */
    public final long f13559b;

    /* JADX INFO: renamed from: c */
    public final CoroutineScope f13560c;

    /* JADX INFO: renamed from: d */
    public Runnable f13561d;

    /* JADX INFO: renamed from: e */
    public Job f13562e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bd$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bd$b */
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            C4048sb.m19407a("Unexpected error when scheduling mraid recurring task.", th);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bd$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f13563b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f13564c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = C3664bd.this.new c(continuation);
            cVar.f13564c = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x0039 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:14:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0039
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f13563b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r5.f13564c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r6)
                goto L3a
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.f13564c
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                r1 = r6
            L23:
                boolean r6 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r6 == 0) goto L46
                com.chartboost.sdk.impl.bd r6 = com.chartboost.sdk.impl.C3664bd.this
                long r3 = com.chartboost.sdk.impl.C3664bd.m16918a(r6)
                r5.f13564c = r1
                r5.f13563b = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L3a
                return r0
            L3a:
                com.chartboost.sdk.impl.bd r6 = com.chartboost.sdk.impl.C3664bd.this
                java.lang.Runnable r6 = r6.m16920c()
                if (r6 == 0) goto L23
                r6.run()
                goto L23
            L46:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3664bd.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3664bd(Handler handler, long j, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f13558a = handler;
        this.f13559b = j;
        this.f13560c = scope;
    }

    public /* synthetic */ C3664bd(Handler handler, long j, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i & 2) != 0 ? 200L : j, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))) : coroutineScope);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3641ad
    /* JADX INFO: renamed from: a */
    public void mo16818a() {
        m16921d();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3641ad
    /* JADX INFO: renamed from: a */
    public void mo16819a(Runnable runnable) {
        this.f13561d = runnable;
    }

    /* JADX INFO: renamed from: b */
    public final void m16919b() {
        Job job = this.f13562e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: c */
    public Runnable m16920c() {
        return this.f13561d;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3641ad
    public void cancel() {
        m16919b();
    }

    /* JADX INFO: renamed from: d */
    public final void m16921d() {
        Job job = this.f13562e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f13562e = BuildersKt__Builders_commonKt.launch$default(this.f13560c, new b(CoroutineExceptionHandler.INSTANCE), null, new c(null), 2, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3641ad
    public void pause() {
        m16919b();
        Runnable runnableM16920c = m16920c();
        if (runnableM16920c != null) {
            this.f13558a.post(runnableM16920c);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3641ad
    public void start() {
        mo16818a();
    }
}
