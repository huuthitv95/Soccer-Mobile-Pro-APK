package com.chartboost.sdk.impl;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.vj */
/* JADX INFO: loaded from: classes3.dex */
public final class C4122vj {

    /* JADX INFO: renamed from: a */
    public final b f16638a;

    /* JADX INFO: renamed from: b */
    public float f16639b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f16640c;

    /* JADX INFO: renamed from: d */
    public final Lazy f16641d;

    /* JADX INFO: renamed from: e */
    public long f16642e;

    /* JADX INFO: renamed from: f */
    public long f16643f;

    /* JADX INFO: renamed from: g */
    public Job f16644g;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.vj$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: b */
        public static final a f16645b = new a();

        public a() {
            super(3, AbstractC4144wj.class, "createRandomAccessFile", "createRandomAccessFile(Lcom/chartboost/sdk/internal/video/VideoAsset;Lcom/chartboost/sdk/internal/video/TempFileDownloadHelper;Lcom/chartboost/sdk/internal/Libraries/FileCache;)Lcom/chartboost/sdk/internal/utils/RandomAccessFileWrapper;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3827if invoke(C4078tj p0, C3875kh p1, C4001q8 c4001q8) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return AbstractC4144wj.m19825b(p0, p1, c4001q8);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.vj$b */
    public interface b {
        /* JADX INFO: renamed from: d */
        void mo17005d();
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.vj$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f16646b;

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
            return C4122vj.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16646b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f16646b = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C4122vj.this.m19723b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.vj$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function3 f16648b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4078tj f16649c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3875kh f16650d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C4001q8 f16651e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function3 function3, C4078tj c4078tj, C3875kh c3875kh, C4001q8 c4001q8) {
            super(0);
            this.f16648b = function3;
            this.f16649c = c4078tj;
            this.f16650d = c3875kh;
            this.f16651e = c4001q8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3827if invoke() {
            return (C3827if) this.f16648b.invoke(this.f16649c, this.f16650d, this.f16651e);
        }
    }

    public C4122vj(C4078tj videoAsset, b listener, float f, C3875kh tempHelper, C4001q8 c4001q8, CoroutineDispatcher coroutineDispatcher, Function3 randomAccessFileFactory) {
        Intrinsics.checkNotNullParameter(videoAsset, "videoAsset");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(randomAccessFileFactory, "randomAccessFileFactory");
        this.f16638a = listener;
        this.f16639b = f;
        this.f16640c = coroutineDispatcher;
        this.f16641d = LazyKt.lazy(new d(randomAccessFileFactory, videoAsset, tempHelper, c4001q8));
        this.f16642e = videoAsset.m19508c();
    }

    public /* synthetic */ C4122vj(C4078tj c4078tj, b bVar, float f, C3875kh c3875kh, C4001q8 c4001q8, CoroutineDispatcher coroutineDispatcher, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4078tj, bVar, (i & 4) != 0 ? 0.01f : f, (i & 8) != 0 ? new C3875kh() : c3875kh, c4001q8, (i & 32) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 64) != 0 ? a.f16645b : function3);
    }

    /* JADX INFO: renamed from: a */
    public final void m19721a() {
        if (this.f16643f == 0) {
            C3827if c3827ifM19725d = m19725d();
            this.f16643f = c3827ifM19725d != null ? c3827ifM19725d.m18018c() : 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19722a(int i) {
        long j = this.f16642e;
        if (j <= 0 || i <= 0) {
            return;
        }
        float f = j / 1000000.0f;
        this.f16639b = ((f / 1000.0f) / ((i / 60000.0f) * 0.0075f)) / (f * 8);
    }

    /* JADX INFO: renamed from: b */
    public final void m19723b() {
        C3827if c3827ifM19725d = m19725d();
        long jM18018c = c3827ifM19725d != null ? c3827ifM19725d.m18018c() : 0L;
        long j = this.f16642e;
        if (jM18018c == j) {
            m19727f();
        } else if ((jM18018c - this.f16643f) / j > this.f16639b) {
            m19727f();
        } else {
            m19724c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19724c() {
        this.f16644g = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f16640c), null, null, new c(null), 3, null);
    }

    /* JADX INFO: renamed from: d */
    public final C3827if m19725d() {
        return (C3827if) this.f16641d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m19726e() {
        Job job = this.f16644g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f16644g = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m19727f() {
        this.f16643f = 0L;
        m19726e();
        this.f16638a.mo17005d();
    }
}
