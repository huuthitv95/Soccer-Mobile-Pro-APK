package com.chartboost.sdk.impl;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.oh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3966oh {

    /* JADX INFO: renamed from: l */
    public static final a f15721l = new a(null);

    /* JADX INFO: renamed from: a */
    public final long f15722a;

    /* JADX INFO: renamed from: b */
    public long f15723b;

    /* JADX INFO: renamed from: c */
    public long f15724c;

    /* JADX INFO: renamed from: d */
    public long f15725d;

    /* JADX INFO: renamed from: e */
    public long f15726e;

    /* JADX INFO: renamed from: g */
    public C4010qh f15728g;

    /* JADX INFO: renamed from: h */
    public Function0 f15729h;

    /* JADX INFO: renamed from: f */
    public b f15727f = b.NOT_STARTED;

    /* JADX INFO: renamed from: i */
    public EnumC4032rh f15730i = EnumC4032rh.ARC;

    /* JADX INFO: renamed from: j */
    public String f15731j = "Reward in %d seconds";

    /* JADX INFO: renamed from: k */
    public final CompletableJob f15732k = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oh$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oh$b */
    public enum b {
        STARTED,
        PAUSED,
        STOPPED,
        COMPLETED,
        NOT_STARTED;


        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ EnumEntries f15739h = EnumEntriesKt.enumEntries(m18976a());
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oh$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15740a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15740a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oh$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15741b;

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
            return C3966oh.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15741b;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            while (C3966oh.this.m18972d() == b.STARTED) {
                long jUptimeMillis = (SystemClock.uptimeMillis() - C3966oh.this.f15724c) - C3966oh.this.f15725d;
                C3966oh c3966oh = C3966oh.this;
                c3966oh.f15723b = RangesKt.coerceAtLeast(c3966oh.f15722a - jUptimeMillis, 0L);
                C4010qh c4010qhM18971c = C3966oh.this.m18971c();
                if (c4010qhM18971c != null) {
                    c4010qhM18971c.m19213a(C3966oh.this.f15723b, C3966oh.this.f15722a);
                }
                if (C3966oh.this.f15723b == 0) {
                    C3966oh.this.f15727f = b.COMPLETED;
                    Function0 function0M18970b = C3966oh.this.m18970b();
                    if (function0M18970b == null) {
                        break;
                    }
                    function0M18970b.invoke();
                    break;
                }
                this.f15741b = 1;
                if (DelayKt.delay(16L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public C3966oh(long j, Function0 function0) {
        this.f15722a = j;
        this.f15723b = j;
        m18969a(function0);
    }

    /* JADX INFO: renamed from: a */
    public final void m18966a() {
        m18967a((C4010qh) null);
        JobKt__JobKt.cancelChildren$default((Job) this.f15732k, (CancellationException) null, 1, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18967a(C4010qh c4010qh) {
        this.f15728g = c4010qh;
        if (c4010qh != null) {
            c4010qh.m19213a(this.f15723b, this.f15722a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18968a(EnumC4032rh mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f15730i = mode;
        if (str != null) {
            this.f15731j = str;
        }
        C4010qh c4010qh = this.f15728g;
        if (c4010qh != null) {
            c4010qh.m19214a(mode, str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18969a(Function0 function0) {
        this.f15729h = function0;
    }

    /* JADX INFO: renamed from: b */
    public final Function0 m18970b() {
        return this.f15729h;
    }

    /* JADX INFO: renamed from: c */
    public final C4010qh m18971c() {
        return this.f15728g;
    }

    /* JADX INFO: renamed from: d */
    public final b m18972d() {
        return this.f15727f;
    }

    /* JADX INFO: renamed from: e */
    public final void m18973e() {
        if (this.f15727f == b.STARTED) {
            this.f15727f = b.PAUSED;
            this.f15726e = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18974f() {
        this.f15727f = b.NOT_STARTED;
        long j = this.f15722a;
        this.f15723b = j;
        this.f15724c = 0L;
        this.f15725d = 0L;
        this.f15726e = 0L;
        C4010qh c4010qh = this.f15728g;
        if (c4010qh != null) {
            c4010qh.m19213a(j, j);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18975g() {
        b bVar = this.f15727f;
        b bVar2 = b.STARTED;
        if (bVar == bVar2 || bVar == b.COMPLETED) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = c.f15740a[this.f15727f.ordinal()];
        if (i == 1) {
            this.f15724c = jUptimeMillis;
            this.f15725d = 0L;
        } else if (i == 2) {
            this.f15725d += jUptimeMillis - this.f15726e;
        } else {
            if (i != 3) {
                return;
            }
            this.f15724c = jUptimeMillis;
            this.f15725d = 0L;
        }
        this.f15727f = bVar2;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(this.f15732k)), null, null, new d(null), 3, null);
    }
}
