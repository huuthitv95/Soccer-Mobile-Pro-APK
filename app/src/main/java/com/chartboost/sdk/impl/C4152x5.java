package com.chartboost.sdk.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4152x5 implements InterfaceC4153x6 {

    /* JADX INFO: renamed from: a */
    public final CoroutineScope f16815a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4084u3 f16816b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4045s8 f16817c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4062t3 f16818d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4040s3 f16819e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f16820f;

    /* JADX INFO: renamed from: g */
    public final Function0 f16821g;

    /* JADX INFO: renamed from: h */
    public final long f16822h;

    /* JADX INFO: renamed from: i */
    public final Function0 f16823i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f16824j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f16825k;

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f16826l;

    /* JADX INFO: renamed from: m */
    public final Mutex f16827m;

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap f16828n;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16829b;

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
            return C4152x5.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16829b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4152x5 c4152x5 = C4152x5.this;
                this.f16829b = 1;
                if (c4152x5.m19899a(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final long f16831a;

        /* JADX INFO: renamed from: b */
        public final long f16832b;

        /* JADX INFO: renamed from: c */
        public final long f16833c;

        /* JADX INFO: renamed from: d */
        public final File f16834d;

        /* JADX INFO: renamed from: e */
        public final long f16835e;

        /* JADX INFO: renamed from: f */
        public final boolean f16836f;

        public b(long j, long j2, long j3, File file, long j4, boolean z) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.f16831a = j;
            this.f16832b = j2;
            this.f16833c = j3;
            this.f16834d = file;
            this.f16835e = j4;
            this.f16836f = z;
        }

        public /* synthetic */ b(long j, long j2, long j3, File file, long j4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, file, (i & 16) != 0 ? System.currentTimeMillis() : j4, (i & 32) != 0 ? false : z);
        }

        /* JADX INFO: renamed from: a */
        public final long m19907a() {
            return this.f16833c;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m19908a(long j) {
            if (j == -1) {
                return !this.f16836f;
            }
            return this.f16833c < j;
        }

        /* JADX INFO: renamed from: b */
        public final File m19909b() {
            return this.f16834d;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m19910b(long j) {
            if (j == -1) {
                return this.f16836f;
            }
            return this.f16833c >= j;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m19911c() {
            return this.f16836f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16831a == bVar.f16831a && this.f16832b == bVar.f16832b && this.f16833c == bVar.f16833c && Intrinsics.areEqual(this.f16834d, bVar.f16834d) && this.f16835e == bVar.f16835e && this.f16836f == bVar.f16836f;
        }

        public int hashCode() {
            return (((((((((UByte$$ExternalSyntheticBackport0.m43485m(this.f16831a) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f16832b)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f16833c)) * 31) + this.f16834d.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f16835e)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f16836f);
        }

        public String toString() {
            return "DownloadInfo(startByte=" + this.f16831a + ", endByte=" + this.f16832b + ", actualBytes=" + this.f16833c + ", file=" + this.f16834d + ", timestamp=" + this.f16835e + ", isComplete=" + this.f16836f + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$c */
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16837b;

        /* JADX INFO: renamed from: c */
        public Object f16838c;

        /* JADX INFO: renamed from: d */
        public Object f16839d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f16840e;

        /* JADX INFO: renamed from: g */
        public int f16842g;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16840e = obj;
            this.f16842g |= Integer.MIN_VALUE;
            Object objM19898a = C4152x5.this.m19898a((URL) null, (Deferred) null, this);
            return objM19898a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19898a : Result.m44945boximpl(objM19898a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$d */
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16843b;

        /* JADX INFO: renamed from: c */
        public Object f16844c;

        /* JADX INFO: renamed from: d */
        public Object f16845d;

        /* JADX INFO: renamed from: e */
        public long f16846e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f16847f;

        /* JADX INFO: renamed from: h */
        public int f16849h;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16847f = obj;
            this.f16849h |= Integer.MIN_VALUE;
            Object objM19894a = C4152x5.this.m19894a((URL) null, 0L, (Pair) null, this);
            return objM19894a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19894a : Result.m44945boximpl(objM19894a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$e */
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16850b;

        /* JADX INFO: renamed from: c */
        public Object f16851c;

        /* JADX INFO: renamed from: d */
        public Object f16852d;

        /* JADX INFO: renamed from: e */
        public Object f16853e;

        /* JADX INFO: renamed from: f */
        public Object f16854f;

        /* JADX INFO: renamed from: g */
        public Object f16855g;

        /* JADX INFO: renamed from: h */
        public Object f16856h;

        /* JADX INFO: renamed from: i */
        public Object f16857i;

        /* JADX INFO: renamed from: j */
        public Object f16858j;

        /* JADX INFO: renamed from: k */
        public long f16859k;

        /* JADX INFO: renamed from: l */
        public long f16860l;

        /* JADX INFO: renamed from: m */
        public long f16861m;

        /* JADX INFO: renamed from: n */
        public long f16862n;

        /* JADX INFO: renamed from: o */
        public int f16863o;

        /* JADX INFO: renamed from: p */
        public /* synthetic */ Object f16864p;

        /* JADX INFO: renamed from: r */
        public int f16866r;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16864p = obj;
            this.f16866r |= Integer.MIN_VALUE;
            Object objM19893a = C4152x5.this.m19893a((URL) null, 0L, (b) null, this);
            return objM19893a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19893a : Result.m44945boximpl(objM19893a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16867b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f16868c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(File file, Continuation continuation) {
            super(2, continuation);
            this.f16868c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f16868c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16867b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f16868c.delete());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$g */
    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16869b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f16870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(File file, Continuation continuation) {
            super(2, continuation);
            this.f16870c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f16870c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16869b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f16870c.delete());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$h */
    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16871b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f16872c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(File file, Continuation continuation) {
            super(2, continuation);
            this.f16872c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f16872c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16871b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f16872c.delete());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$i */
    public static final class i extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16873b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f16874c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file, Continuation continuation) {
            super(2, continuation);
            this.f16874c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f16874c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16873b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f16874c.delete());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$j */
    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16875b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f16876c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(File file, Continuation continuation) {
            super(2, continuation);
            this.f16876c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f16876c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16875b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f16876c.delete());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$k */
    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(C4152x5.this.f16825k.get());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$l */
    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16878b;

        /* JADX INFO: renamed from: c */
        public Object f16879c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f16880d;

        /* JADX INFO: renamed from: f */
        public int f16882f;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16880d = obj;
            this.f16882f |= Integer.MIN_VALUE;
            return C4152x5.this.m19899a(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$m */
    public static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16883b;

        /* JADX INFO: renamed from: c */
        public Object f16884c;

        /* JADX INFO: renamed from: d */
        public Object f16885d;

        /* JADX INFO: renamed from: e */
        public Object f16886e;

        /* JADX INFO: renamed from: f */
        public Object f16887f;

        /* JADX INFO: renamed from: g */
        public long f16888g;

        /* JADX INFO: renamed from: h */
        public /* synthetic */ Object f16889h;

        /* JADX INFO: renamed from: j */
        public int f16891j;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16889h = obj;
            this.f16891j |= Integer.MIN_VALUE;
            Object objMo19895a = C4152x5.this.mo19895a((URL) null, 0L, this);
            return objMo19895a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo19895a : Result.m44945boximpl(objMo19895a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$n */
    public static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16892b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URL f16894d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f16895e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ b f16896f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(URL url, long j, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f16894d = url;
            this.f16895e = j;
            this.f16896f = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4152x5.this.new n(this.f16894d, this.f16895e, this.f16896f, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r10 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f16892b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.ResultKt.throwOnFailure(r10)
                kotlin.Result r10 = (kotlin.Result) r10
                java.lang.Object r10 = r10.getValue()
                goto L44
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L32
            L24:
                kotlin.ResultKt.throwOnFailure(r10)
                com.chartboost.sdk.impl.x5 r10 = com.chartboost.sdk.impl.C4152x5.this
                r9.f16892b = r3
                java.lang.Object r10 = com.chartboost.sdk.impl.C4152x5.m19889a(r10, r9)
                if (r10 != r0) goto L32
                goto L43
            L32:
                com.chartboost.sdk.impl.x5 r3 = com.chartboost.sdk.impl.C4152x5.this
                java.net.URL r4 = r9.f16894d
                long r5 = r9.f16895e
                com.chartboost.sdk.impl.x5$b r7 = r9.f16896f
                r9.f16892b = r2
                r8 = r9
                java.lang.Object r10 = com.chartboost.sdk.impl.C4152x5.m19884a(r3, r4, r5, r7, r8)
                if (r10 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Result r10 = kotlin.Result.m44945boximpl(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C4152x5.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$o */
    public static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16897b;

        /* JADX INFO: renamed from: c */
        public Object f16898c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f16899d;

        /* JADX INFO: renamed from: f */
        public int f16901f;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16899d = obj;
            this.f16901f |= Integer.MIN_VALUE;
            Object objM19896a = C4152x5.this.m19896a(null, null, 0L, 0L, null, this);
            return objM19896a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19896a : Result.m44945boximpl(objM19896a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x5$p */
    public static final class p extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f16902b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f16903c;

        /* JADX INFO: renamed from: e */
        public int f16905e;

        public p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16903c = obj;
            this.f16905e |= Integer.MIN_VALUE;
            Object objM19904b = C4152x5.this.m19904b(null, 0L, this);
            return objM19904b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19904b : Result.m44945boximpl(objM19904b);
        }
    }

    public C4152x5(CoroutineScope cacheScope, InterfaceC4084u3 storage, InterfaceC4045s8 downloader, InterfaceC4062t3 policyManager, InterfaceC4040s3 notifier, CoroutineDispatcher ioDispatcher, Function0 cacheSizeBytesProvider, long j2, Function0 ttlMillisProvider) {
        Intrinsics.checkNotNullParameter(cacheScope, "cacheScope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(policyManager, "policyManager");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(cacheSizeBytesProvider, "cacheSizeBytesProvider");
        Intrinsics.checkNotNullParameter(ttlMillisProvider, "ttlMillisProvider");
        this.f16815a = cacheScope;
        this.f16816b = storage;
        this.f16817c = downloader;
        this.f16818d = policyManager;
        this.f16819e = notifier;
        this.f16820f = ioDispatcher;
        this.f16821g = cacheSizeBytesProvider;
        this.f16822h = j2;
        this.f16823i = ttlMillisProvider;
        this.f16824j = new ConcurrentHashMap();
        this.f16825k = new AtomicLong(0L);
        this.f16826l = new AtomicBoolean(false);
        this.f16827m = MutexKt.Mutex$default(false, 1, null);
        this.f16828n = new ConcurrentHashMap();
        BuildersKt__Builders_commonKt.launch$default(cacheScope, ioDispatcher, null, new a(null), 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final b m19891a(URL url, long j2) {
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        b bVar = (b) this.f16828n.get(string);
        if (bVar == null) {
            return null;
        }
        if (!bVar.m19909b().exists()) {
            this.f16828n.remove(string);
            return null;
        }
        if (j2 == -1) {
            C4048sb.m19408a("Found cached download to resume complete file for " + string + ": " + bVar.m19907a() + " bytes (complete=" + bVar.m19911c() + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.m19910b(j2)) {
            C4048sb.m19408a("Found suitable cached download for " + string + ": " + bVar.m19907a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.m19908a(j2)) {
            C4048sb.m19408a("Found cached download to resume from for " + string + ": " + bVar.m19907a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        C4048sb.m19408a("Cached download exists but can't be used for " + string + ": " + bVar.m19907a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Long m19892a(String str) {
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null)) {
            return StringsKt.toLongOrNull(StringsKt.substringAfterLast$default(str, "_", (String) null, 2, (Object) null));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0483  */
    /* JADX WARN: Code duplicated, block: B:103:0x0494 A[Catch: all -> 0x0e4d, TryCatch #17 {all -> 0x0e4d, blocks: (B:101:0x048e, B:103:0x0494, B:105:0x049a, B:108:0x04a4, B:120:0x0529, B:122:0x052f, B:126:0x053b, B:131:0x054c, B:129:0x0544, B:139:0x0589, B:141:0x0591, B:119:0x04f1, B:110:0x04ae), top: B:419:0x048e }] */
    /* JADX WARN: Code duplicated, block: B:116:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:118:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x04f1 A[Catch: all -> 0x0e4d, TRY_ENTER, TryCatch #17 {all -> 0x0e4d, blocks: (B:101:0x048e, B:103:0x0494, B:105:0x049a, B:108:0x04a4, B:120:0x0529, B:122:0x052f, B:126:0x053b, B:131:0x054c, B:129:0x0544, B:139:0x0589, B:141:0x0591, B:119:0x04f1, B:110:0x04ae), top: B:419:0x048e }] */
    /* JADX WARN: Code duplicated, block: B:11:0x008c  */
    /* JADX WARN: Code duplicated, block: B:122:0x052f A[Catch: all -> 0x0e4d, TryCatch #17 {all -> 0x0e4d, blocks: (B:101:0x048e, B:103:0x0494, B:105:0x049a, B:108:0x04a4, B:120:0x0529, B:122:0x052f, B:126:0x053b, B:131:0x054c, B:129:0x0544, B:139:0x0589, B:141:0x0591, B:119:0x04f1, B:110:0x04ae), top: B:419:0x048e }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:13:0x0094  */
    /* JADX WARN: Code duplicated, block: B:147:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:149:0x05e9 A[Catch: all -> 0x064b, TryCatch #15 {all -> 0x064b, blocks: (B:145:0x05dd, B:149:0x05e9, B:150:0x05ef), top: B:415:0x05dd }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0610  */
    /* JADX WARN: Code duplicated, block: B:155:0x063f  */
    /* JADX WARN: Code duplicated, block: B:161:0x066d A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x06b1 A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x06b9 A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:222:0x0881  */
    /* JADX WARN: Code duplicated, block: B:229:0x08b6 A[Catch: all -> 0x098d, TRY_LEAVE, TryCatch #18 {all -> 0x098d, blocks: (B:223:0x0890, B:227:0x089e, B:229:0x08b6, B:233:0x08d8), top: B:420:0x0890 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0108  */
    /* JADX WARN: Code duplicated, block: B:26:0x0119  */
    /* JADX WARN: Code duplicated, block: B:276:0x09cb A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:282:0x0a12 A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:284:0x0a2d A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:289:0x0a38 A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:296:0x0a51 A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x0a5b A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:305:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:308:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:310:0x0ace A[Catch: all -> 0x0371, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:314:0x0b0a A[Catch: all -> 0x0371, TRY_LEAVE, TryCatch #4 {all -> 0x0371, blocks: (B:14:0x00b0, B:18:0x00c4, B:346:0x0ca9, B:24:0x0111, B:329:0x0bf0, B:335:0x0c2c, B:32:0x0167, B:302:0x0a98, B:35:0x0177, B:368:0x0ded, B:38:0x0189, B:280:0x0a0e, B:282:0x0a12, B:283:0x0a23, B:274:0x09c5, B:276:0x09cb, B:284:0x0a2d, B:287:0x0a34, B:289:0x0a38, B:293:0x0a44, B:299:0x0a5b, B:310:0x0ace, B:312:0x0afd, B:314:0x0b0a, B:296:0x0a51, B:365:0x0db6, B:154:0x0614, B:159:0x0661, B:161:0x066d, B:162:0x06b1, B:164:0x06b9, B:167:0x06c1, B:169:0x06ef, B:171:0x06f5, B:172:0x0714, B:174:0x0722, B:176:0x0727, B:186:0x076f, B:184:0x0744, B:185:0x0762, B:374:0x0e12, B:59:0x02fa, B:135:0x057d, B:62:0x0308, B:114:0x04dc, B:70:0x036c, B:91:0x044c), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:31:0x015e  */
    /* JADX WARN: Code duplicated, block: B:321:0x0b7e A[Catch: all -> 0x0c22, TryCatch #0 {all -> 0x0c22, blocks: (B:360:0x0d6d, B:319:0x0b72, B:321:0x0b7e, B:323:0x0baa, B:325:0x0bb6), top: B:388:0x0b72 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:325:0x0bb6 A[Catch: all -> 0x0c22, TRY_LEAVE, TryCatch #0 {all -> 0x0c22, blocks: (B:360:0x0d6d, B:319:0x0b72, B:321:0x0b7e, B:323:0x0baa, B:325:0x0bb6), top: B:388:0x0b72 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:330:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:334:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:339:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:342:0x0c73 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #27 {all -> 0x015b, blocks: (B:21:0x00f3, B:340:0x0c6b, B:342:0x0c73, B:348:0x0cc8, B:352:0x0cd4, B:353:0x0cfb, B:27:0x0147), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:345:0x0ca7  */
    /* JADX WARN: Code duplicated, block: B:348:0x0cc8 A[Catch: all -> 0x015b, TRY_ENTER, TryCatch #27 {all -> 0x015b, blocks: (B:21:0x00f3, B:340:0x0c6b, B:342:0x0c73, B:348:0x0cc8, B:352:0x0cd4, B:353:0x0cfb, B:27:0x0147), top: B:393:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x016e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0cd1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:357:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:364:0x0db5  */
    /* JADX WARN: Code duplicated, block: B:37:0x017c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0190  */
    /* JADX WARN: Code duplicated, block: B:420:0x0890 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0416 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x0252  */
    /* JADX WARN: Code duplicated, block: B:53:0x029d  */
    /* JADX WARN: Code duplicated, block: B:58:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x030d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0363  */
    /* JADX WARN: Code duplicated, block: B:74:0x0374  */
    /* JADX WARN: Code duplicated, block: B:76:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0400 A[Catch: all -> 0x0e52, TRY_LEAVE, TryCatch #22 {all -> 0x0e52, blocks: (B:80:0x03f2, B:95:0x045c, B:83:0x0400), top: B:428:0x03f2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x041c A[Catch: all -> 0x0458, TRY_LEAVE, TryCatch #25 {all -> 0x0458, blocks: (B:85:0x0416, B:87:0x041c), top: B:434:0x0416 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x044a  */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0a94, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r0, r4, r9) == r3) goto L301;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x04f1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:161:0x066d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:276:0x09cb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:282:0x0a12, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:299:0x0a5b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:310:0x0ace, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:314:0x0b0a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:321:0x0b7e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:325:0x0bb6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:342:0x0c73, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0400, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x041c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v105, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r11v98 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v28 */
    /* JADX WARN: Type inference failed for: r30v29 */
    /* JADX WARN: Type inference failed for: r30v30 */
    /* JADX WARN: Type inference failed for: r30v31 */
    /* JADX WARN: Type inference failed for: r30v32 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v93, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v98, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m19893a(java.net.URL r57, long r58, com.chartboost.sdk.impl.C4152x5.b r60, kotlin.coroutines.Continuation r61) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C4152x5.m19893a(java.net.URL, long, com.chartboost.sdk.impl.x5$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:65:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x01be  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00e9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x011a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0153, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x01be, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX INFO: renamed from: a */
    public final Object m19894a(URL url, long j2, Pair pair, Continuation continuation) throws Throwable {
        d dVar;
        String str;
        URL url2;
        C4152x5 c4152x5;
        Object value;
        File file;
        Long lM19892a;
        Object objM19904b;
        Object objM19904b2;
        String str2;
        InterfaceC4084u3 interfaceC4084u3;
        File file2;
        Object objM19904b3;
        Object objM19904b4;
        long j3 = j2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.f16849h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f16849h = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objAwait = dVar.f16847f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String str3 = dVar.f16849h;
        try {
            switch (str3) {
                case 0:
                    ResultKt.throwOnFailure(objAwait);
                    String str4 = (String) pair.component1();
                    Deferred deferred = (Deferred) pair.component2();
                    if (j3 == -1) {
                        str = "complete file";
                    } else {
                        str = j3 + " bytes";
                    }
                    C4048sb.m19408a("Awaiting ongoing download: " + str4 + " for original request of " + str, (Throwable) null, 2, (Object) null);
                    dVar.f16843b = this;
                    dVar.f16844c = url;
                    dVar.f16845d = str4;
                    dVar.f16846e = j3;
                    dVar.f16849h = 1;
                    objAwait = deferred.await(dVar);
                    if (objAwait != coroutine_suspended) {
                        url2 = url;
                        c4152x5 = this;
                        str3 = str4;
                        value = ((Result) objAwait).getValue();
                        if (Result.m44952isFailureimpl(value)) {
                            C4048sb.m19417e("Ongoing download " + ((String) str3) + " failed, starting new download", null, 2, null);
                            dVar.f16843b = null;
                            dVar.f16844c = null;
                            dVar.f16845d = null;
                            dVar.f16849h = 2;
                            objM19904b4 = c4152x5.m19904b(url2, j3, dVar);
                            if (objM19904b4 == coroutine_suspended) {
                                return objM19904b4;
                            }
                        } else {
                            if (Result.m44952isFailureimpl(value)) {
                                value = null;
                            }
                            file = (File) value;
                            if (file == null) {
                                C4048sb.m19417e("Ongoing download " + ((String) str3) + " returned null file", null, 2, null);
                                dVar.f16843b = null;
                                dVar.f16844c = null;
                                dVar.f16845d = null;
                                dVar.f16849h = 3;
                                objM19904b3 = c4152x5.m19904b(url2, j3, dVar);
                                if (objM19904b3 == coroutine_suspended) {
                                    return objM19904b3;
                                }
                            } else {
                                lM19892a = c4152x5.m19892a((String) str3);
                                if (c4152x5.m19903a(j3, file)) {
                                    if (j3 == -1) {
                                        str2 = "complete file request";
                                    } else {
                                        str2 = "partial request (" + j3 + " bytes)";
                                    }
                                    C4048sb.m19408a("Ongoing download (" + file.length() + " bytes) satisfies " + str2, (Throwable) null, 2, (Object) null);
                                    interfaceC4084u3 = c4152x5.f16816b;
                                    dVar.f16843b = file;
                                    dVar.f16844c = null;
                                    dVar.f16845d = null;
                                    dVar.f16849h = 4;
                                    if (interfaceC4084u3.mo19103a(file, dVar) != coroutine_suspended) {
                                        file2 = file;
                                        Result.Companion companion = Result.INSTANCE;
                                        return Result.m44946constructorimpl(file2);
                                    }
                                } else if (j3 == -1) {
                                    C4048sb.m19408a("Ongoing partial download completed, but we need complete file - starting resume download", (Throwable) null, 2, (Object) null);
                                    c4152x5.m19902a(url2, file, file.length(), false);
                                    dVar.f16843b = null;
                                    dVar.f16844c = null;
                                    dVar.f16845d = null;
                                    dVar.f16849h = 5;
                                    objM19904b2 = c4152x5.m19904b(url2, j3, dVar);
                                    if (objM19904b2 == coroutine_suspended) {
                                        return objM19904b2;
                                    }
                                } else {
                                    C4048sb.m19408a("Ongoing download (" + file.length() + " bytes) insufficient for request (" + j3 + " bytes) - starting larger download", (Throwable) null, 2, (Object) null);
                                    c4152x5.m19902a(url2, file, file.length(), lM19892a == null);
                                    dVar.f16843b = null;
                                    dVar.f16844c = null;
                                    dVar.f16845d = null;
                                    dVar.f16849h = 6;
                                    objM19904b = c4152x5.m19904b(url2, j3, dVar);
                                    if (objM19904b == coroutine_suspended) {
                                        return objM19904b;
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    j3 = dVar.f16846e;
                    String str5 = (String) dVar.f16845d;
                    URL url3 = (URL) dVar.f16844c;
                    C4152x5 c4152x6 = (C4152x5) dVar.f16843b;
                    ResultKt.throwOnFailure(objAwait);
                    url2 = url3;
                    c4152x5 = c4152x6;
                    str3 = str5;
                    value = ((Result) objAwait).getValue();
                    if (Result.m44952isFailureimpl(value)) {
                        C4048sb.m19417e("Ongoing download " + ((String) str3) + " failed, starting new download", null, 2, null);
                        dVar.f16843b = null;
                        dVar.f16844c = null;
                        dVar.f16845d = null;
                        dVar.f16849h = 2;
                        objM19904b4 = c4152x5.m19904b(url2, j3, dVar);
                        if (objM19904b4 == coroutine_suspended) {
                            return objM19904b4;
                        }
                    } else {
                        if (Result.m44952isFailureimpl(value)) {
                            value = null;
                        }
                        file = (File) value;
                        if (file == null) {
                            C4048sb.m19417e("Ongoing download " + ((String) str3) + " returned null file", null, 2, null);
                            dVar.f16843b = null;
                            dVar.f16844c = null;
                            dVar.f16845d = null;
                            dVar.f16849h = 3;
                            objM19904b3 = c4152x5.m19904b(url2, j3, dVar);
                            if (objM19904b3 == coroutine_suspended) {
                                return objM19904b3;
                            }
                        } else {
                            lM19892a = c4152x5.m19892a((String) str3);
                            if (c4152x5.m19903a(j3, file)) {
                                if (j3 == -1) {
                                    str2 = "complete file request";
                                } else {
                                    str2 = "partial request (" + j3 + " bytes)";
                                }
                                C4048sb.m19408a("Ongoing download (" + file.length() + " bytes) satisfies " + str2, (Throwable) null, 2, (Object) null);
                                interfaceC4084u3 = c4152x5.f16816b;
                                dVar.f16843b = file;
                                dVar.f16844c = null;
                                dVar.f16845d = null;
                                dVar.f16849h = 4;
                                if (interfaceC4084u3.mo19103a(file, dVar) != coroutine_suspended) {
                                    file2 = file;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    return Result.m44946constructorimpl(file2);
                                }
                            } else if (j3 == -1) {
                                C4048sb.m19408a("Ongoing partial download completed, but we need complete file - starting resume download", (Throwable) null, 2, (Object) null);
                                c4152x5.m19902a(url2, file, file.length(), false);
                                dVar.f16843b = null;
                                dVar.f16844c = null;
                                dVar.f16845d = null;
                                dVar.f16849h = 5;
                                objM19904b2 = c4152x5.m19904b(url2, j3, dVar);
                                if (objM19904b2 == coroutine_suspended) {
                                    return objM19904b2;
                                }
                            } else {
                                C4048sb.m19408a("Ongoing download (" + file.length() + " bytes) insufficient for request (" + j3 + " bytes) - starting larger download", (Throwable) null, 2, (Object) null);
                                if (lM19892a == null) {
                                }
                                c4152x5.m19902a(url2, file, file.length(), lM19892a == null);
                                dVar.f16843b = null;
                                dVar.f16844c = null;
                                dVar.f16845d = null;
                                dVar.f16849h = 6;
                                objM19904b = c4152x5.m19904b(url2, j3, dVar);
                                if (objM19904b == coroutine_suspended) {
                                    return objM19904b;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    ResultKt.throwOnFailure(objAwait);
                    return ((Result) objAwait).getValue();
                case 3:
                    ResultKt.throwOnFailure(objAwait);
                    return ((Result) objAwait).getValue();
                case 4:
                    file2 = (File) dVar.f16843b;
                    ResultKt.throwOnFailure(objAwait);
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m44946constructorimpl(file2);
                case 5:
                    ResultKt.throwOnFailure(objAwait);
                    return ((Result) objAwait).getValue();
                case 6:
                    ResultKt.throwOnFailure(objAwait);
                    return ((Result) objAwait).getValue();
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e2) {
            C4048sb.m19416e("Ongoing download " + str3 + " was cancelled.", e2);
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(e2));
        } catch (Exception e3) {
            C4048sb.m19410b("Ongoing download " + str3 + " failed.", e3);
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(e3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0314  */
    /* JADX WARN: Code duplicated, block: B:104:0x0351 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x0352  */
    /* JADX WARN: Code duplicated, block: B:109:0x037f  */
    /* JADX WARN: Code duplicated, block: B:112:0x038d A[Catch: all -> 0x03c3, Exception -> 0x03c7, CancellationException -> 0x03ca, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x03ca, Exception -> 0x03c7, all -> 0x03c3, blocks: (B:110:0x0381, B:112:0x038d), top: B:144:0x0381 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x019a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0206  */
    /* JADX WARN: Code duplicated, block: B:77:0x020b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0271  */
    /* JADX WARN: Code duplicated, block: B:88:0x0275  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d1  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03a4, code lost:
    
        if (r2.mo19103a((java.io.File) r0, r10) == r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025c, code lost:
    
        if (r0.mo19103a(r3, r10) == r4) goto L114;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x0314, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x0352, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0118, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0137, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0163, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x01a7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:98:0x02d1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.chartboost.sdk.impl.u3] */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.chartboost.sdk.impl.u3] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.chartboost.sdk.impl.x5$m, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [com.chartboost.sdk.impl.x5] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.chartboost.sdk.impl.x5] */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.chartboost.sdk.impl.x5] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v16, types: [com.chartboost.sdk.impl.x5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.chartboost.sdk.impl.x5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlinx.coroutines.Deferred, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.chartboost.sdk.impl.u3] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.chartboost.sdk.impl.x5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.chartboost.sdk.impl.u3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.chartboost.sdk.impl.x5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.chartboost.sdk.impl.x5] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.chartboost.sdk.impl.x5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.chartboost.sdk.impl.InterfaceC4153x6
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo19895a(java.net.URL r30, long r31, kotlin.coroutines.Continuation r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C4152x5.mo19895a(java.net.URL, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        if (r2 == r10) goto L57;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m19896a(java.net.URL r18, java.io.File r19, long r20, long r22, java.io.File r24, kotlin.coroutines.Continuation r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C4152x5.m19896a(java.net.URL, java.io.File, long, long, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4153x6
    /* JADX INFO: renamed from: a */
    public Object mo19897a(URL url, Continuation continuation) {
        return InterfaceC4153x6.a.m19919a(this, url, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19898a(URL url, Deferred deferred, Continuation continuation) throws Throwable {
        c cVar;
        URL url2;
        Exception e2;
        CancellationException e3;
        C4152x5 c4152x5;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f16842g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f16842g = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objAwait = cVar.f16840e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cVar.f16842g;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objAwait);
                cVar.f16837b = this;
                cVar.f16838c = url;
                cVar.f16842g = 1;
                objAwait = deferred.await(cVar);
                if (objAwait != coroutine_suspended) {
                    c4152x5 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = cVar.f16838c;
                url2 = (URL) cVar.f16837b;
                try {
                    ResultKt.throwOnFailure(objAwait);
                    return obj;
                } catch (CancellationException e4) {
                    e3 = e4;
                    C4048sb.m19416e("Awaited download for " + url2 + " was cancelled.", e3);
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(e3));
                } catch (Exception e5) {
                    e2 = e5;
                    C4048sb.m19416e("Awaited download for " + url2 + " failed.", e2);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(e2));
                }
            }
            url = (URL) cVar.f16838c;
            c4152x5 = (C4152x5) cVar.f16837b;
            ResultKt.throwOnFailure(objAwait);
            Object value = ((Result) objAwait).getValue();
            if (Result.m44953isSuccessimpl(value)) {
                InterfaceC4084u3 interfaceC4084u3 = c4152x5.f16816b;
                cVar.f16837b = url;
                cVar.f16838c = value;
                cVar.f16839d = value;
                cVar.f16842g = 2;
                if (interfaceC4084u3.mo19103a((File) value, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return value;
        } catch (CancellationException e6) {
            url2 = url;
            e3 = e6;
        } catch (Exception e7) {
            url2 = url;
            e2 = e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m19899a(Continuation continuation) throws Throwable {
        l lVar;
        Mutex mutex;
        C4152x5 c4152x5;
        Mutex mutex2;
        Throwable th;
        Exception e2;
        C4152x5 c4152x6;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.f16882f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.f16882f = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object obj = lVar.f16880d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar.f16882f;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f16826l.get()) {
                    return Unit.INSTANCE;
                }
                mutex = this.f16827m;
                lVar.f16878b = this;
                lVar.f16879c = mutex;
                lVar.f16882f = 1;
                if (mutex.lock(null, lVar) != coroutine_suspended) {
                    c4152x5 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) lVar.f16879c;
                c4152x6 = (C4152x5) lVar.f16878b;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                        long jLongValue = ((Number) obj).longValue();
                        c4152x6.f16825k.set(jLongValue);
                        C4048sb.m19408a("Cache initialized. Current size: " + jLongValue + " bytes.", (Throwable) null, 2, (Object) null);
                        c4152x6.f16826l.set(true);
                    } catch (Exception e3) {
                        e2 = e3;
                        c4152x5 = c4152x6;
                        C4048sb.m19410b("Failed to initialize cache state. Will retry on next operation.", e2);
                        c4152x5.f16826l.set(false);
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) lVar.f16879c;
            c4152x5 = (C4152x5) lVar.f16878b;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            if (c4152x5.f16826l.get()) {
                Unit unit2 = Unit.INSTANCE;
                mutex.unlock(null);
                return unit2;
            }
            C4048sb.m19408a("Initializing DefaultDownloaderCache state...", (Throwable) null, 2, (Object) null);
            try {
                InterfaceC4084u3 interfaceC4084u3 = c4152x5.f16816b;
                lVar.f16878b = c4152x5;
                lVar.f16879c = mutex;
                lVar.f16882f = 2;
                Object objMo19106a = interfaceC4084u3.mo19106a(lVar);
                if (objMo19106a != coroutine_suspended) {
                    mutex2 = mutex;
                    obj = objMo19106a;
                    c4152x6 = c4152x5;
                    long jLongValue2 = ((Number) obj).longValue();
                    c4152x6.f16825k.set(jLongValue2);
                    C4048sb.m19408a("Cache initialized. Current size: " + jLongValue2 + " bytes.", (Throwable) null, 2, (Object) null);
                    c4152x6.f16826l.set(true);
                    Unit unit3 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit3;
                }
                return coroutine_suspended;
            } catch (Exception e4) {
                mutex2 = mutex;
                e2 = e4;
                C4048sb.m19410b("Failed to initialize cache state. Will retry on next operation.", e2);
                c4152x5.f16826l.set(false);
            }
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4153x6
    /* JADX INFO: renamed from: a */
    public Flow mo19900a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.f16819e.mo19380a(url);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01db  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m19901a(String str, b bVar, b bVar2) {
        b bVar3;
        File fileM19909b;
        File fileM19909b2;
        b bVar4 = (b) this.f16828n.get(str);
        if (bVar.m19911c()) {
            C4048sb.m19408a("Storing complete download for " + str + " (" + bVar.m19907a() + " bytes)", (Throwable) null, 2, (Object) null);
            if (bVar4 != null && !Intrinsics.areEqual(bVar4.m19909b(), bVar.m19909b()) && bVar4.m19909b().exists()) {
                long length = bVar4.m19909b().length();
                if (bVar4.m19909b().delete()) {
                    this.f16825k.addAndGet(-length);
                    C4048sb.m19408a("Cleaned up old partial file. Freed " + length + " bytes.", (Throwable) null, 2, (Object) null);
                }
            }
            this.f16828n.put(str, bVar);
            return;
        }
        if (bVar4 != null) {
            if (bVar4.m19911c()) {
                C4048sb.m19408a("Keeping existing complete download for " + str + " instead of partial (" + bVar.m19907a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else if (bVar.m19907a() > bVar4.m19907a()) {
                C4048sb.m19408a("Replacing smaller partial download for " + str + " (" + bVar4.m19907a() + " -> " + bVar.m19907a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else {
                C4048sb.m19408a("Keeping existing larger partial download for " + str + " (" + bVar4.m19907a() + " vs " + bVar.m19907a() + " bytes)", (Throwable) null, 2, (Object) null);
            }
            if (!Intrinsics.areEqual(bVar4 != null ? bVar4.m19909b() : null, bVar.m19909b()) && bVar.m19909b().exists()) {
                long length2 = bVar.m19909b().length();
                if (bVar.m19909b().delete()) {
                    this.f16825k.addAndGet(-length2);
                    C4048sb.m19408a("Cleaned up inferior new partial file. Freed " + length2 + " bytes.", (Throwable) null, 2, (Object) null);
                }
            }
            if (bVar2 != null) {
                bVar3 = (b) this.f16828n.get(str);
                if (Intrinsics.areEqual(bVar2.m19909b(), bVar.m19909b())) {
                }
                fileM19909b = bVar2.m19909b();
                if (bVar3 != null) {
                    fileM19909b2 = bVar3.m19909b();
                } else {
                    fileM19909b2 = null;
                }
                if (Intrinsics.areEqual(fileM19909b, fileM19909b2) && bVar2.m19909b().exists()) {
                    long length3 = bVar2.m19909b().length();
                    if (bVar2.m19909b().delete()) {
                        this.f16825k.addAndGet(-length3);
                        C4048sb.m19408a("Cleaned up resumed partial file. Freed " + length3 + " bytes.", (Throwable) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
            }
        }
        C4048sb.m19408a("Storing first partial download for " + str + " (" + bVar.m19907a() + " bytes)", (Throwable) null, 2, (Object) null);
        if (bVar4 != null && !Intrinsics.areEqual(bVar4.m19909b(), bVar.m19909b()) && bVar4.m19909b().exists()) {
            long length4 = bVar4.m19909b().length();
            if (bVar4.m19909b().delete()) {
                this.f16825k.addAndGet(-length4);
                C4048sb.m19408a("Cleaned up replaced partial file. Freed " + length4 + " bytes.", (Throwable) null, 2, (Object) null);
            }
        }
        this.f16828n.put(str, bVar);
        if (bVar2 != null) {
            bVar3 = (b) this.f16828n.get(str);
            if (Intrinsics.areEqual(bVar2.m19909b(), bVar.m19909b())) {
                fileM19909b = bVar2.m19909b();
                if (bVar3 != null) {
                    fileM19909b2 = bVar3.m19909b();
                } else {
                    fileM19909b2 = null;
                }
                if (Intrinsics.areEqual(fileM19909b, fileM19909b2)) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19902a(URL url, File file, long j2, boolean z) {
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C4048sb.m19408a("Updating download info for " + string + ": " + j2 + " bytes, complete=" + z, (Throwable) null, 2, (Object) null);
        b bVar = new b(0L, j2 - 1, j2, file, System.currentTimeMillis(), z);
        b bVar2 = (b) this.f16828n.get(string);
        if (bVar2 == null) {
            C4048sb.m19408a("Storing new download info for " + string, (Throwable) null, 2, (Object) null);
            this.f16828n.put(string, bVar);
            this.f16825k.addAndGet(j2);
            return;
        }
        if (bVar.m19911c() && !bVar2.m19911c()) {
            C4048sb.m19408a("Replacing partial download with complete download for " + string, (Throwable) null, 2, (Object) null);
            if (!Intrinsics.areEqual(bVar2.m19909b(), bVar.m19909b()) && bVar2.m19909b().exists()) {
                long length = bVar2.m19909b().length();
                if (bVar2.m19909b().delete()) {
                    this.f16825k.addAndGet(-length);
                    C4048sb.m19408a("Cleaned up old partial file: " + bVar2.m19909b().getName(), (Throwable) null, 2, (Object) null);
                }
            }
            this.f16828n.put(string, bVar);
            this.f16825k.addAndGet(j2);
            return;
        }
        if (bVar.m19907a() <= bVar2.m19907a()) {
            C4048sb.m19408a("Keeping existing download for " + string + " (existing: " + bVar2.m19907a() + ", new: " + bVar.m19907a() + ")", (Throwable) null, 2, (Object) null);
            return;
        }
        C4048sb.m19408a("Replacing smaller download (" + bVar2.m19907a() + ") with larger (" + bVar.m19907a() + ") for " + string, (Throwable) null, 2, (Object) null);
        if (!Intrinsics.areEqual(bVar2.m19909b(), bVar.m19909b()) && bVar2.m19909b().exists()) {
            long length2 = bVar2.m19909b().length();
            if (bVar2.m19909b().delete()) {
                this.f16825k.addAndGet(-length2);
                C4048sb.m19408a("Cleaned up old smaller file: " + bVar2.m19909b().getName(), (Throwable) null, 2, (Object) null);
            }
        }
        this.f16828n.put(string, bVar);
        this.f16825k.addAndGet(j2 - bVar2.m19907a());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19903a(long j2, File file) {
        if (j2 == -1) {
            return file.exists() && file.length() > 0;
        }
        return file.exists() && file.length() >= j2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m19904b(URL url, long j2, Continuation continuation) throws Throwable {
        p pVar;
        String str;
        Exception exc;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.f16905e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.f16905e = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        p pVar2 = pVar;
        Object obj = pVar2.f16903c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pVar2.f16905e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (j2 == -1) {
                str = "complete file";
            } else {
                str = j2 + " bytes";
            }
            C4048sb.m19408a("Starting new download for " + str, (Throwable) null, 2, (Object) null);
            b bVarM19891a = m19891a(url, j2);
            try {
                pVar2.f16902b = url;
                pVar2.f16905e = 1;
                try {
                    Object objM19893a = m19893a(url, j2, bVarM19891a, pVar2);
                    return objM19893a == coroutine_suspended ? coroutine_suspended : objM19893a;
                } catch (Exception e2) {
                    exc = e2;
                    url = url;
                }
            } catch (Exception e3) {
                e = e3;
                exc = e;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (URL) pVar2.f16902b;
            try {
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            } catch (Exception e4) {
                e = e4;
            }
        }
        exc = e;
        C4048sb.m19410b("New download failed for " + url, exc);
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(exc));
    }

    /* JADX INFO: renamed from: b */
    public final Pair m19905b(URL url, long j2) {
        Object next;
        Pair pair;
        Object next2;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ConcurrentHashMap concurrentHashMap = this.f16824j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (!Intrinsics.areEqual(str, string)) {
                if (StringsKt.startsWith$default(str, string + "_", false, 2, (Object) null)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        C4048sb.m19408a("Found " + linkedHashMap.size() + " related ongoing downloads for " + string, (Throwable) null, 2, (Object) null);
        if (j2 == -1) {
            Deferred deferred = (Deferred) linkedHashMap.get(string);
            if (deferred != null) {
                C4048sb.m19408a("Found ongoing complete download for complete file request", (Throwable) null, 2, (Object) null);
                Pair pairM43482to = TuplesKt.m43482to(string, deferred);
                if (pairM43482to != null) {
                    return pairM43482to;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!Intrinsics.areEqual((String) entry2.getKey(), string)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    Long lM19892a = m19892a((String) ((Map.Entry) next2).getKey());
                    long jLongValue = lM19892a != null ? lM19892a.longValue() : 0L;
                    do {
                        Object next3 = it.next();
                        Long lM19892a2 = m19892a((String) ((Map.Entry) next3).getKey());
                        long jLongValue2 = lM19892a2 != null ? lM19892a2.longValue() : 0L;
                        if (jLongValue < jLongValue2) {
                            next2 = next3;
                            jLongValue = jLongValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            Map.Entry entry3 = (Map.Entry) next2;
            if (entry3 == null) {
                return null;
            }
            Long lM19892a3 = m19892a((String) entry3.getKey());
            C4048sb.m19408a("Found ongoing partial download of " + (lM19892a3 != null ? lM19892a3.longValue() : 0L) + " bytes for complete file request", (Throwable) null, 2, (Object) null);
            return new Pair(entry3.getKey(), entry3.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
            String str2 = (String) entry4.getKey();
            if (!Intrinsics.areEqual(str2, string)) {
                Long lM19892a4 = m19892a(str2);
                if ((lM19892a4 != null ? lM19892a4.longValue() : 0L) >= j2) {
                }
            }
            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
        }
        Deferred deferred2 = (Deferred) linkedHashMap3.get(string);
        if (deferred2 == null || (pair = TuplesKt.m43482to(string, deferred2)) == null) {
            Iterator it2 = linkedHashMap3.entrySet().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    Long lM19892a5 = m19892a((String) ((Map.Entry) next).getKey());
                    long jLongValue3 = lM19892a5 != null ? lM19892a5.longValue() : Long.MAX_VALUE;
                    do {
                        Object next4 = it2.next();
                        Long lM19892a6 = m19892a((String) ((Map.Entry) next4).getKey());
                        long jLongValue4 = lM19892a6 != null ? lM19892a6.longValue() : Long.MAX_VALUE;
                        if (jLongValue3 > jLongValue4) {
                            next = next4;
                            jLongValue3 = jLongValue4;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry5 = (Map.Entry) next;
            pair = entry5 != null ? new Pair(entry5.getKey(), entry5.getValue()) : null;
        }
        if (pair == null) {
            return null;
        }
        Long lM19892a7 = m19892a((String) pair.component1());
        C4048sb.m19408a("Found ongoing " + (lM19892a7 == null ? CampaignEx.JSON_NATIVE_VIDEO_COMPLETE : lM19892a7 + " bytes") + " download that can satisfy " + j2 + " byte request", (Throwable) null, 2, (Object) null);
        return pair;
    }
}
