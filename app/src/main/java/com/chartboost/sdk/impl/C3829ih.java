package com.chartboost.sdk.impl;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ih */
/* JADX INFO: loaded from: classes3.dex */
public final class C3829ih implements C4028rd.a {

    /* JADX INFO: renamed from: a */
    public final C3852jh f14670a;

    /* JADX INFO: renamed from: b */
    public final C4028rd f14671b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f14672c;

    /* JADX INFO: renamed from: d */
    public final long f14673d;

    /* JADX INFO: renamed from: e */
    public final int f14674e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4186yh f14675f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentLinkedQueue f14676g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap.KeySetView f14677h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap.KeySetView f14678i;

    /* JADX INFO: renamed from: j */
    public final Mutex f14679j;

    /* JADX INFO: renamed from: k */
    public Job f14680k;

    /* JADX INFO: renamed from: l */
    public final CoroutineScope f14681l;

    /* JADX INFO: renamed from: m */
    public final Object f14682m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ih$a */
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14683b;

        /* JADX INFO: renamed from: c */
        public Object f14684c;

        /* JADX INFO: renamed from: d */
        public Object f14685d;

        /* JADX INFO: renamed from: e */
        public int f14686e;

        /* JADX INFO: renamed from: f */
        public int f14687f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f14688g;

        /* JADX INFO: renamed from: i */
        public int f14690i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14688g = obj;
            this.f14690i |= Integer.MIN_VALUE;
            return C3829ih.this.m18028a((C3819i7) null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ih$b */
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14691b;

        /* JADX INFO: renamed from: c */
        public Object f14692c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f14693d;

        /* JADX INFO: renamed from: f */
        public int f14695f;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14693d = obj;
            this.f14695f |= Integer.MIN_VALUE;
            return C3829ih.this.m18030a(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ih$c */
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14696b;

        /* JADX INFO: renamed from: c */
        public Object f14697c;

        /* JADX INFO: renamed from: d */
        public Object f14698d;

        /* JADX INFO: renamed from: e */
        public Object f14699e;

        /* JADX INFO: renamed from: f */
        public Object f14700f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f14701g;

        /* JADX INFO: renamed from: i */
        public int f14703i;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14701g = obj;
            this.f14703i |= Integer.MIN_VALUE;
            return C3829ih.this.m18029a((List) null, (InterfaceC3806hh) null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ih$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14704b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f14705c;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.ih$d$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f14707b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3829ih f14708c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3829ih c3829ih, Continuation continuation) {
                super(2, continuation);
                this.f14708c = c3829ih;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f14708c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f14707b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C3829ih c3829ih = this.f14708c;
                    this.f14707b = 1;
                    if (c3829ih.m18030a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = C3829ih.this.new d(continuation);
            dVar.f14705c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14704b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f14705c;
                    if (!Mutex.DefaultImpls.tryLock$default(C3829ih.this.f14679j, null, 1, null)) {
                        C4048sb.m19408a("Already running, skipping new trigger.", (Throwable) null, 2, (Object) null);
                    } else {
                        if (!C3829ih.this.f14671b.m19340a()) {
                            C4048sb.m19408a("Offline, skipping.", (Throwable) null, 2, (Object) null);
                            Unit unit = Unit.INSTANCE;
                            C4048sb.m19408a("Releasing lock.", (Throwable) null, 2, (Object) null);
                            Mutex.DefaultImpls.unlock$default(C3829ih.this.f14679j, null, 1, null);
                            return unit;
                        }
                        C4048sb.m19408a("Acquired lock, starting job.", (Throwable) null, 2, (Object) null);
                        Job job = C3829ih.this.f14680k;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        C3829ih c3829ih = C3829ih.this;
                        c3829ih.f14680k = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(c3829ih, null), 3, null);
                        Job job2 = C3829ih.this.f14680k;
                        if (job2 != null) {
                            this.f14704b = 1;
                            if (job2.join(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C4048sb.m19408a("Job finished.", (Throwable) null, 2, (Object) null);
                C4048sb.m19408a("Releasing lock.", (Throwable) null, 2, (Object) null);
                Mutex.DefaultImpls.unlock$default(C3829ih.this.f14679j, null, 1, null);
            } catch (Exception e) {
                C4048sb.m19411b("Error during queue processing: " + e.getMessage(), (Throwable) null, 2, (Object) null);
            } finally {
                C4048sb.m19408a("Releasing lock.", (Throwable) null, 2, (Object) null);
                Mutex.DefaultImpls.unlock$default(C3829ih.this.f14679j, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    public C3829ih(C3852jh networkClient, C4028rd networkStateChecker, CoroutineDispatcher dispatcher, long j, int i, InterfaceC4186yh trackerRepository) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(networkStateChecker, "networkStateChecker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(trackerRepository, "trackerRepository");
        this.f14670a = networkClient;
        this.f14671b = networkStateChecker;
        this.f14672c = dispatcher;
        this.f14673d = j;
        this.f14674e = i;
        this.f14675f = trackerRepository;
        this.f14676g = new ConcurrentLinkedQueue();
        this.f14677h = ConcurrentHashMap.newKeySet();
        this.f14678i = ConcurrentHashMap.newKeySet();
        this.f14679j = MutexKt.Mutex$default(false, 1, null);
        this.f14681l = CoroutineScopeKt.CoroutineScope(dispatcher.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));
        this.f14682m = new Object();
        networkStateChecker.m19339a(this);
    }

    public /* synthetic */ C3829ih(C3852jh c3852jh, C4028rd c4028rd, CoroutineDispatcher coroutineDispatcher, long j, int i, InterfaceC4186yh interfaceC4186yh, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3852jh, c4028rd, (i2 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i2 & 8) != 0 ? 500L : j, (i2 & 16) != 0 ? 3 : i, interfaceC4186yh);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18024a(C3829ih c3829ih, InterfaceC3806hh interfaceC3806hh, List list, C3865k7.b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        c3829ih.m18032a(interfaceC3806hh, list, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x0107  */
    /* JADX WARN: Code duplicated, block: B:33:0x013c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0140  */
    /* JADX WARN: Code duplicated, block: B:40:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x013e -> B:38:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x018f -> B:38:0x0192). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m18028a(com.chartboost.sdk.impl.C3819i7 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3829ih.m18028a(com.chartboost.sdk.impl.i7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0089 -> B:21:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m18029a(java.util.List r12, com.chartboost.sdk.impl.InterfaceC3806hh r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.chartboost.sdk.impl.C3829ih.c
            if (r0 == 0) goto L13
            r0 = r14
            com.chartboost.sdk.impl.ih$c r0 = (com.chartboost.sdk.impl.C3829ih.c) r0
            int r1 = r0.f14703i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14703i = r1
            goto L18
        L13:
            com.chartboost.sdk.impl.ih$c r0 = new com.chartboost.sdk.impl.ih$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f14701g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f14703i
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r12 = r0.f14700f
            com.chartboost.sdk.impl.vh r12 = (com.chartboost.sdk.impl.C4120vh) r12
            java.lang.Object r13 = r0.f14699e
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r2 = r0.f14698d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f14697c
            com.chartboost.sdk.impl.hh r4 = (com.chartboost.sdk.impl.InterfaceC3806hh) r4
            java.lang.Object r5 = r0.f14696b
            com.chartboost.sdk.impl.ih r5 = (com.chartboost.sdk.impl.C3829ih) r5
            kotlin.ResultKt.throwOnFailure(r14)
            r10 = r0
            r8 = r4
            goto L8c
        L3f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L47:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
            r8 = r13
            r2 = r14
            r10 = r0
            r13 = r12
            r12 = r11
        L58:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L99
            java.lang.Object r14 = r13.next()
            com.chartboost.sdk.impl.vh r14 = (com.chartboost.sdk.impl.C4120vh) r14
            com.chartboost.sdk.impl.jh r4 = r12.f14670a
            java.lang.String r5 = r14.m19711d()
            java.lang.String r6 = r14.m19710c()
            java.lang.String r7 = r14.m19708a()
            java.lang.String r9 = r14.m19709b()
            r10.f14696b = r12
            r10.f14697c = r8
            r10.f14698d = r2
            r10.f14699e = r13
            r10.f14700f = r14
            r10.f14703i = r3
            java.lang.Object r0 = r4.m18287a(r5, r6, r7, r8, r9, r10)
            if (r0 != r1) goto L89
            return r1
        L89:
            r5 = r12
            r12 = r14
            r14 = r0
        L8c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L97
            r2.add(r12)
        L97:
            r12 = r5
            goto L58
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3829ih.m18029a(java.util.List, com.chartboost.sdk.impl.hh, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008b -> B:24:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m18030a(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3829ih.m18030a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.chartboost.sdk.impl.C4028rd.a
    /* JADX INFO: renamed from: a */
    public void mo18031a() {
        C4048sb.m19408a("Network is available. Attempting to process queue.", (Throwable) null, 2, (Object) null);
        m18034c();
    }

    /* JADX INFO: renamed from: a */
    public final void m18032a(InterfaceC3806hh eventData, List trackers, C3865k7.b bVar) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        C4048sb.m19408a("Received eventId=" + eventData.mo17828a() + " (type=" + eventData.getClass().getSimpleName() + ") with " + trackers.size() + " explicit trackers.", (Throwable) null, 2, (Object) null);
        if (!trackers.isEmpty()) {
            C4048sb.m19408a("Using " + trackers.size() + " explicitly provided trackers.", (Throwable) null, 2, (Object) null);
        } else if (bVar != null) {
            trackers = this.f14675f.mo20064a(bVar);
            C4048sb.m19408a("Using " + trackers.size() + " trackers from repository for event type " + bVar.m18362b() + ".", (Throwable) null, 2, (Object) null);
        } else {
            trackers = CollectionsKt.emptyList();
        }
        if (trackers.isEmpty()) {
            C4048sb.m19408a("No trackers configured for eventId=" + eventData.mo17828a() + "; skipping.", (Throwable) null, 2, (Object) null);
            return;
        }
        synchronized (this.f14682m) {
            if (this.f14678i.contains(eventData.mo17828a())) {
                C4048sb.m19408a("EventId=" + eventData.mo17828a() + " has already been processed; skipping duplicate.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (this.f14677h.contains(eventData.mo17828a())) {
                C4048sb.m19408a("EventId=" + eventData.mo17828a() + " is already in-flight; skipping duplicate.", (Throwable) null, 2, (Object) null);
                return;
            }
            this.f14677h.add(eventData.mo17828a());
            this.f14676g.offer(new C3819i7(eventData, trackers));
            C4048sb.m19408a("Enqueued eventId=" + eventData.mo17828a() + ", queue size=" + this.f14676g.size(), (Throwable) null, 2, (Object) null);
            m18034c();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.chartboost.sdk.impl.C4028rd.a
    /* JADX INFO: renamed from: b */
    public void mo18033b() {
        C4048sb.m19408a("Network is lost. Will wait for onNetworkAvailable().", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public final void m18034c() {
        BuildersKt__Builders_commonKt.launch$default(this.f14681l, null, null, new d(null), 3, null);
    }
}
