package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ik */
/* JADX INFO: loaded from: classes3.dex */
public final class C3832ik extends AbstractC3860k2 implements InterfaceC4079tk, InterfaceC3694ck {

    /* JADX INFO: renamed from: D */
    public static final a f14709D = new a(null);

    /* JADX INFO: renamed from: A */
    public final CoroutineScope f14710A;

    /* JADX INFO: renamed from: B */
    public C3689cf f14711B;

    /* JADX INFO: renamed from: C */
    public CancellableContinuation f14712C;

    /* JADX INFO: renamed from: o */
    public final Context f14713o;

    /* JADX INFO: renamed from: p */
    public final URL f14714p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC4153x6 f14715q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC3671bk f14716r;

    /* JADX INFO: renamed from: s */
    public final Set f14717s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC3991pk f14718t;

    /* JADX INFO: renamed from: u */
    public final Set f14719u;

    /* JADX INFO: renamed from: v */
    public final EnumC3895le f14720v;

    /* JADX INFO: renamed from: w */
    public InterfaceC4101uk f14721w;

    /* JADX INFO: renamed from: x */
    public final Lazy f14722x;

    /* JADX INFO: renamed from: y */
    public final Lazy f14723y;

    /* JADX INFO: renamed from: z */
    public final CoroutineExceptionHandler f14724z;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3761fi f14725b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3832ik f14726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3761fi c3761fi, C3832ik c3832ik) {
            super(0);
            this.f14725b = c3761fi;
            this.f14726c = c3832ik;
        }

        /* JADX INFO: renamed from: a */
        public final void m18062a() {
            C3693cj.f13754a.m17206a(AbstractC3968oj.g.f15755b, this.f14725b, this.f14726c.m18050A(), this.f14726c.m18051B(), this.f14726c.m18061z());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18062a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3761fi f14727b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3832ik f14728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3761fi c3761fi, C3832ik c3832ik) {
            super(0);
            this.f14727b = c3761fi;
            this.f14728c = c3832ik;
        }

        /* JADX INFO: renamed from: a */
        public final void m18063a() {
            C3693cj.f13754a.m17206a(AbstractC3968oj.j.f15758b, this.f14727b, this.f14728c.m18050A(), this.f14728c.m18051B(), this.f14728c.m18061z());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18063a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3761fi f14729b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3832ik f14730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3761fi c3761fi, C3832ik c3832ik) {
            super(0);
            this.f14729b = c3761fi;
            this.f14730c = c3832ik;
        }

        /* JADX INFO: renamed from: a */
        public final void m18064a() {
            C3693cj.f13754a.m17206a(AbstractC3968oj.p.f15764b, this.f14729b, this.f14730c.m18050A(), this.f14730c.m18051B(), this.f14730c.m18061z());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18064a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$e */
    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC3712df f14731b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3761fi f14732c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3832ik f14733d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC3712df abstractC3712df, C3761fi c3761fi, C3832ik c3832ik) {
            super(0);
            this.f14731b = abstractC3712df;
            this.f14732c = c3761fi;
            this.f14733d = c3832ik;
        }

        /* JADX INFO: renamed from: a */
        public final void m18065a() {
            AbstractC3712df abstractC3712df = this.f14731b;
            if (abstractC3712df instanceof AbstractC3712df.b) {
                C3693cj.f13754a.m17206a(new AbstractC3968oj.l((int) (((AbstractC3712df.b) abstractC3712df).m17302a() / ((long) 1000))), this.f14732c, this.f14733d.m18050A(), this.f14733d.m18051B(), this.f14733d.m18061z());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18065a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$f */
    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final f f14734b = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4105v2 invoke() {
            return C3678c4.f13658b.mo17019a().mo19002p();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$g */
    public static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f14735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.f14735b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3761fi it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.m17740a(), this.f14735b));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$h */
    public static final class h extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f14736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Map map) {
            super(1);
            this.f14736b = map;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3761fi invoke(C3761fi it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C3761fi.m17738a(it, null, null, 0, null, this.f14736b, null, 47, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$i */
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14737b;

        /* JADX INFO: renamed from: c */
        public Object f14738c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f14739d;

        /* JADX INFO: renamed from: f */
        public int f14741f;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14739d = obj;
            this.f14741f |= Integer.MIN_VALUE;
            Object objMo17313a = C3832ik.this.mo17313a((Context) null, this);
            return objMo17313a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17313a : Result.m44945boximpl(objMo17313a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$j */
    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14742b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f14744d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context, Continuation continuation) {
            super(2, continuation);
            this.f14744d = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new j(this.f14744d, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo16959a;
            String lowerCase;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14742b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC3671bk interfaceC3671bk = C3832ik.this.f14716r;
                Context contextM18050A = C3832ik.this.m18050A();
                URL urlM18052C = C3832ik.this.m18052C();
                InterfaceC4153x6 interfaceC4153x6 = C3832ik.this.f14715q;
                this.f14742b = 1;
                objMo16959a = interfaceC3671bk.mo16959a(contextM18050A, urlM18052C, interfaceC4153x6, this);
                if (objMo16959a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo16959a = ((Result) obj).getValue();
            }
            if (Result.m44952isFailureimpl(objMo16959a)) {
                Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objMo16959a);
                if (thM44949exceptionOrNullimpl == null) {
                    thM44949exceptionOrNullimpl = new IOException("Unknown player load initiation error.");
                }
                if (thM44949exceptionOrNullimpl instanceof IOException) {
                    String message = thM44949exceptionOrNullimpl.getMessage();
                    if (message != null) {
                        lowerCase = message.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (lowerCase == null) {
                            lowerCase = "";
                        }
                    } else {
                        lowerCase = "";
                    }
                    thM44949exceptionOrNullimpl = (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "disk full", false, 2, (Object) null)) ? ChartboostError.Load.NoStorage.INSTANCE : (Exception) thM44949exceptionOrNullimpl;
                }
                C4048sb.m19410b("VideoRenderable: videoPlayer.load() returned immediate failure for " + C3832ik.this.m18052C() + ".", thM44949exceptionOrNullimpl);
                C3832ik.this.mo17210a(thM44949exceptionOrNullimpl);
            } else {
                Set set = C3832ik.this.f14717s;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (Intrinsics.areEqual(((C3761fi) obj2).m17740a(), C11744X3.i.f26388r)) {
                        arrayList.add(obj2);
                    }
                }
                Context context = this.f14744d;
                C3832ik c3832ik = C3832ik.this;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3693cj.f13754a.m17206a(AbstractC3968oj.i.f15757b, (C3761fi) it.next(), context, c3832ik.m18051B(), c3832ik.m18061z());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$k */
    public static final class k extends Lambda implements Function1 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$k$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f14746b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C3832ik f14747c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3832ik c3832ik, Continuation continuation) {
                super(2, continuation);
                this.f14747c = c3832ik;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f14747c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14746b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f14747c.f14716r.mo16961a(EnumC3737eh.FAILURE);
                return Unit.INSTANCE;
            }
        }

        public k() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18070a(Throwable th) {
            C4048sb.m19417e("VideoRenderable: Load operation cancelled for " + C3832ik.this.m18052C() + ".", null, 2, null);
            BuildersKt__Builders_commonKt.launch$default(C3832ik.this.f14710A, NonCancellable.INSTANCE, null, new a(C3832ik.this, null), 2, null);
            C3832ik.this.f14712C = null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18070a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$l */
    public static final class l extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14748b;

        public l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14748b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C3832ik.this.f14716r.setVolume(0.0f);
            InterfaceC4101uk interfaceC4101ukMo17380b = C3832ik.this.mo17380b();
            if (interfaceC4101ukMo17380b != null) {
                interfaceC4101ukMo17380b.mo18911a(0.0f);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$m */
    public static final class m extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14750b;

        public m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14750b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C3832ik.this.f14716r.release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$n */
    public static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final n f14752b = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3665be invoke() {
            return C3678c4.f13658b.m17030j().mo17169a();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$o */
    public static final class o extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14753b;

        public o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14753b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C3832ik.this.f14716r.pause();
            Set set = C3832ik.this.f14717s;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (Intrinsics.areEqual(((C3761fi) obj2).m17740a(), CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                    arrayList.add(obj2);
                }
            }
            C3832ik c3832ik = C3832ik.this;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.k.f15759b, (C3761fi) it.next(), c3832ik.m18050A(), c3832ik.m18051B(), c3832ik.m18061z());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$p */
    public static final class p extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14755b;

        public p(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new p(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14755b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C3832ik.this.f14716r.play();
            Set set = C3832ik.this.f14717s;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (Intrinsics.areEqual(((C3761fi) obj2).m17740a(), CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                    arrayList.add(obj2);
                }
            }
            C3832ik c3832ik = C3832ik.this;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.m.f15761b, (C3761fi) it.next(), c3832ik.m18050A(), c3832ik.m18051B(), c3832ik.m18061z());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$q */
    public static final class q extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3832ik f14757b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(CoroutineExceptionHandler.Companion companion, C3832ik c3832ik) {
            super(companion);
            this.f14757b = c3832ik;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            C4048sb.m19410b("Failed to perform video operation", th);
            ChartboostError.Load unknown = th instanceof ChartboostError.Load ? (ChartboostError.Load) th : new ChartboostError.Load.Unknown(th.getMessage(), th);
            CancellableContinuation cancellableContinuation = this.f14757b.f14712C;
            if (cancellableContinuation != null) {
                if (!cancellableContinuation.isActive()) {
                    cancellableContinuation = null;
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(unknown)));
                }
            }
            this.f14757b.f14712C = null;
            InterfaceC4074tf interfaceC4074tfM19067i = this.f14757b.m19067i();
            if (interfaceC4074tfM19067i != null) {
                interfaceC4074tfM19067i.mo17322b(unknown);
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$r */
    public static final class r extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14758b;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$r$a */
        public static final class a implements InterfaceC3985pe {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3832ik f14760a;

            public a(C3832ik c3832ik) {
                this.f14760a = c3832ik;
            }

            @Override // com.chartboost.sdk.impl.InterfaceC3985pe
            /* JADX INFO: renamed from: a */
            public long mo18078a() {
                return this.f14760a.f14716r.mo16957a();
            }

            @Override // com.chartboost.sdk.impl.InterfaceC3985pe
            /* JADX INFO: renamed from: b */
            public long mo18079b() {
                return this.f14760a.f14716r.mo16962b();
            }
        }

        public r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new r(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14758b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC4101uk interfaceC4101ukMo17380b = C3832ik.this.mo17380b();
            if (interfaceC4101ukMo17380b != null) {
                interfaceC4101ukMo17380b.mo18915b();
            }
            C3832ik.this.f14716r.play();
            List listM18055a = C3832ik.this.m18055a("start", MapsKt.mapOf(TuplesKt.m43482to("duration", Boxing.boxFloat(C3832ik.this.f14716r.mo16957a() / 1000.0f)), TuplesKt.m43482to("volume", Boxing.boxFloat(C3832ik.this.f14716r.getVolume()))));
            C3832ik c3832ik = C3832ik.this;
            Iterator it = listM18055a.iterator();
            while (it.hasNext()) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.o.f15763b, (C3761fi) it.next(), c3832ik.m18050A(), c3832ik.m18051B(), c3832ik.m18061z());
            }
            Set set = C3832ik.this.f14717s;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (Intrinsics.areEqual(((C3761fi) obj2).m17740a(), "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            C3832ik c3832ik2 = C3832ik.this;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.e.f15753b, (C3761fi) it2.next(), c3832ik2.m18050A(), c3832ik2.m18051B(), c3832ik2.m18061z());
            }
            Set set2 = C3832ik.this.f14717s;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : set2) {
                if (Intrinsics.areEqual(((C3761fi) obj3).m17740a(), "impression")) {
                    arrayList2.add(obj3);
                }
            }
            C3832ik c3832ik3 = C3832ik.this;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.h.f15756b, (C3761fi) it3.next(), c3832ik3.m18050A(), c3832ik3.m18051B(), c3832ik3.m18061z());
            }
            List listM18060y = C3832ik.this.m18060y();
            C3832ik c3832ik4 = C3832ik.this;
            C3689cf c3689cf = new C3689cf(new a(c3832ik4), listM18060y, 50L, C3832ik.this.f14710A);
            c3689cf.m17179a();
            c3832ik4.f14711B = c3689cf;
            C3832ik.super.mo17335x();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$s */
    public static final class s extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14761b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ EnumC3737eh f14763d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(EnumC3737eh enumC3737eh, Continuation continuation) {
            super(2, continuation);
            this.f14763d = enumC3737eh;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new s(this.f14763d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14761b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC4101uk interfaceC4101ukMo17380b = C3832ik.this.mo17380b();
            if (interfaceC4101ukMo17380b != null) {
                interfaceC4101ukMo17380b.mo18910a();
            }
            C3689cf c3689cf = C3832ik.this.f14711B;
            if (c3689cf != null) {
                c3689cf.m17180b();
            }
            C3832ik.this.f14711B = null;
            C3832ik.this.f14716r.mo16961a(this.f14763d);
            if (this.f14763d == EnumC3737eh.SKIP) {
                Set set = C3832ik.this.f14717s;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (Intrinsics.areEqual(((C3761fi) obj2).m17740a(), "skip")) {
                        arrayList.add(obj2);
                    }
                }
                C3832ik c3832ik = C3832ik.this;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3693cj.f13754a.m17206a(AbstractC3968oj.n.f15762b, (C3761fi) it.next(), c3832ik.m18050A(), c3832ik.m18051B(), c3832ik.m18061z());
                }
            }
            Set set2 = C3832ik.this.f14717s;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : set2) {
                if (Intrinsics.areEqual(((C3761fi) obj3).m17740a(), "closeLinear")) {
                    arrayList2.add(obj3);
                }
            }
            C3832ik c3832ik2 = C3832ik.this;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.c.f15751b, (C3761fi) it2.next(), c3832ik2.m18050A(), c3832ik2.m18051B(), c3832ik2.m18061z());
            }
            Set set3 = C3832ik.this.f14717s;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : set3) {
                if (Intrinsics.areEqual(((C3761fi) obj4).m17740a(), "close")) {
                    arrayList3.add(obj4);
                }
            }
            C3832ik c3832ik3 = C3832ik.this;
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C3693cj.f13754a.m17206a(AbstractC3968oj.b.f15750b, (C3761fi) it3.next(), c3832ik3.m18050A(), c3832ik3.m18051B(), c3832ik3.m18061z());
            }
            InterfaceC4074tf interfaceC4074tfM19067i = C3832ik.this.m19067i();
            if (interfaceC4074tfM19067i != null) {
                interfaceC4074tfM19067i.mo17320a(EnumC3895le.ENABLE_ORIENTATION_CHANGE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ik$t */
    public static final class t extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14764b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f14766d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(float f, Continuation continuation) {
            super(2, continuation);
            this.f14766d = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3832ik.this.new t(this.f14766d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14764b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C3832ik.this.f14716r.setVolume(this.f14766d);
            InterfaceC4101uk interfaceC4101ukMo17380b = C3832ik.this.mo17380b();
            if (interfaceC4101ukMo17380b != null) {
                interfaceC4101ukMo17380b.mo18911a(1.0f);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3832ik(Context context, URL videoUrl, C4008qf renderableConfig, C4168y adMarkupConfig, InterfaceC4153x6 downloaderCache, InterfaceC3671bk videoPlayer, Set trackingEvents, InterfaceC4098uh trackerComponent, C3829ih telemetryManager, InterfaceC3991pk viewabilityComponent, Set set, EnumC4036s adFormat, Mediation mediation, EnumC3895le videoOrientation) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(downloaderCache, "downloaderCache");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(videoOrientation, "videoOrientation");
        this.f14713o = context;
        this.f14714p = videoUrl;
        this.f14715q = downloaderCache;
        this.f14716r = videoPlayer;
        this.f14717s = trackingEvents;
        this.f14718t = viewabilityComponent;
        this.f14719u = set;
        this.f14720v = videoOrientation;
        this.f14722x = LazyKt.lazy(n.f14752b);
        this.f14723y = LazyKt.lazy(f.f14734b);
        q qVar = new q(CoroutineExceptionHandler.INSTANCE, this);
        this.f14724z = qVar;
        this.f14710A = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()).plus(qVar));
        videoPlayer.mo16960a(this);
    }

    /* JADX INFO: renamed from: A */
    public final Context m18050A() {
        return this.f14713o;
    }

    /* JADX INFO: renamed from: B */
    public final C3665be m18051B() {
        return (C3665be) this.f14722x.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final URL m18052C() {
        return this.f14714p;
    }

    /* JADX INFO: renamed from: a */
    public final ChartboostError.Load m18053a(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (error.errorCode) {
            case 4001:
            case 4002:
            case 4003:
            case 4004:
            case 4005:
                return new ChartboostError.Load.UnsupportedCodec("Playback error: " + error.getErrorCodeName(), error);
            default:
                return new ChartboostError.Load.AssetUnavailable(this.f14714p.toString(), "Playback error: " + error.getErrorCodeName(), error);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public Object mo17313a(Context context, Continuation continuation) throws Throwable {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f14741f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f14741f = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object result = iVar.f14739d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f14741f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(result);
            iVar.f14737b = this;
            iVar.f14738c = context;
            iVar.f14741f = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(iVar), 1);
            cancellableContinuationImpl.initCancellability();
            this.f14712C = cancellableContinuationImpl;
            C4048sb.m19408a("VideoRenderable: Initiating load for " + m18052C(), (Throwable) null, 2, (Object) null);
            BuildersKt__Builders_commonKt.launch$default(this.f14710A, null, null, new j(context, null), 3, null);
            cancellableContinuationImpl.invokeOnCancellation(new k());
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(iVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(result);
        }
        return ((Result) result).getValue();
    }

    /* JADX INFO: renamed from: a */
    public final List m18054a(String str) {
        Set set = this.f14717s;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((C3761fi) obj).m17740a(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m18055a(String str, Map map) {
        List list = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.f14717s), new g(str)), new h(map)));
        return !list.isEmpty() ? list : CollectionsKt.listOf(new C3761fi(str, null, 0, null, map, null, 40, null));
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17316a(float f2) {
        super.mo17316a(f2);
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f14710A, null, null, new t(f2, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18056a(View view) throws C3831ij {
        Set set;
        C3693cj c3693cj = C3693cj.f13754a;
        c3693cj.m17207a((InterfaceC4167xk) null);
        try {
            InterfaceC4013qk interfaceC4013qkMo19080b = this.f14718t.mo19080b();
            if (interfaceC4013qkMo19080b.mo18641b() && (set = this.f14719u) != null && !set.isEmpty()) {
                InterfaceC4167xk interfaceC4167xkMo19061a = this.f14718t.mo19079a().mo19061a(interfaceC4013qkMo19080b, view, set);
                c3693cj.m17207a(interfaceC4167xkMo19061a);
                this.f14721w = interfaceC4167xkMo19061a;
            }
        } catch (Exception e2) {
            throw new C3831ij("Failed to execute/initialize AdVerification unit: " + e2.getMessage(), 410);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17319a(EnumC3737eh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        C4048sb.m19408a("Stopping video (" + this.f14714p + ") with reason: " + reason, (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.f14710A, NonCancellable.INSTANCE, null, new s(reason, null), 2, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3694ck
    /* JADX INFO: renamed from: a */
    public void mo17210a(Throwable error) {
        Throwable unknown;
        Intrinsics.checkNotNullParameter(error, "error");
        C4048sb.m19410b("onVideoError() fired for " + this.f14714p, error);
        C3689cf c3689cf = this.f14711B;
        if (c3689cf != null) {
            c3689cf.m17180b();
        }
        this.f14711B = null;
        Throwable cause = error.getCause();
        ChartboostError chartboostError = cause instanceof ChartboostError ? (ChartboostError) cause : null;
        if (chartboostError == null) {
            chartboostError = error instanceof ChartboostError ? (ChartboostError) error : null;
        }
        CancellableContinuation cancellableContinuation = this.f14712C;
        if (cancellableContinuation == null || !cancellableContinuation.isActive()) {
            unknown = chartboostError instanceof ChartboostError.Render ? (ChartboostError.Render) chartboostError : null;
            if (unknown == null) {
                if (error instanceof PlaybackException) {
                    unknown = m18057b((PlaybackException) error);
                } else if (error instanceof IOException) {
                    unknown = new ChartboostError.Render.AssetUnavailable(this.f14714p.toString(), "Asset unavailable: " + error.getMessage(), error);
                } else {
                    unknown = new ChartboostError.Render.Unknown("An unknown video error occurred: " + error.getMessage(), error);
                }
            }
        } else {
            unknown = chartboostError instanceof ChartboostError.Load ? (ChartboostError.Load) chartboostError : null;
            if (unknown == null) {
                if (error instanceof PlaybackException) {
                    unknown = m18053a((PlaybackException) error);
                } else if (error instanceof IOException) {
                    unknown = new ChartboostError.Load.AssetUnavailable(this.f14714p.toString(), "Asset unavailable: " + error.getMessage(), error);
                } else {
                    unknown = new ChartboostError.Load.Unknown("An unknown video error occurred: " + error.getMessage(), error);
                }
            }
        }
        if (unknown instanceof ChartboostError.Load) {
            CancellableContinuation cancellableContinuation2 = this.f14712C;
            if (cancellableContinuation2 != null) {
                if (!cancellableContinuation2.isActive()) {
                    cancellableContinuation2 = null;
                }
                if (cancellableContinuation2 != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(unknown)));
                }
            }
            this.f14712C = null;
        } else if (unknown instanceof ChartboostError.Render) {
            m18330a((ChartboostError.Render) unknown);
        }
        int iM18059c = error instanceof PlaybackException ? m18059c((PlaybackException) error) : 900;
        Iterator it = m18055a("error", MapsKt.mapOf(TuplesKt.m43482to("VAST_ERROR_CODE", Integer.valueOf(iM18059c)))).iterator();
        while (it.hasNext()) {
            C3693cj.f13754a.m17206a(AbstractC3968oj.f.f15754b, C3761fi.m17738a((C3761fi) it.next(), null, null, 0, null, MapsKt.mapOf(TuplesKt.m43482to("VAST_ERROR_CODE", Integer.valueOf(iM18059c))), null, 47, null), this.f14713o, m18051B(), m18061z());
        }
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17322b(error);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17321a(boolean z) {
        Set set = this.f14717s;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((C3761fi) obj).m17740a(), "click")) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3693cj.f13754a.m17206a(AbstractC3968oj.a.f15749b, (C3761fi) it.next(), this.f14713o, m18051B(), m18061z());
        }
    }

    /* JADX INFO: renamed from: b */
    public final ChartboostError.Render m18057b(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (error.errorCode) {
            case 2000:
            case 2001:
            case 2002:
            case 2004:
            case 2005:
            case 2007:
            case 2008:
                return new ChartboostError.Render.AssetUnavailable(this.f14714p.toString(), "Playback error: " + error.getErrorCodeName(), error);
            case 2003:
            case 2006:
            default:
                return new ChartboostError.Render.VideoPlaybackError("Playback error: " + error.getErrorCodeName(), error);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3712df m18058b(String offset) {
        String str;
        Intrinsics.checkNotNullParameter(offset, "offset");
        try {
            if (StringsKt.endsWith$default(offset, "%", false, 2, (Object) null)) {
                Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.removeSuffix(offset, (CharSequence) "%"));
                if (doubleOrNull != null) {
                    return new AbstractC3712df.a(doubleOrNull.doubleValue() / 100.0d);
                }
            } else if (new Regex("\\d+s").matches(offset)) {
                Long longOrNull = StringsKt.toLongOrNull(StringsKt.removeSuffix(offset, (CharSequence) CmcdData.Factory.STREAMING_FORMAT_SS));
                if (longOrNull != null) {
                    return new AbstractC3712df.b(longOrNull.longValue() * ((long) 1000));
                }
            } else {
                str = "\\d{1,2}:\\d{1,2}:\\d{1,2}(\\.\\d+)?";
                try {
                    if (new Regex("\\d{1,2}:\\d{1,2}:\\d{1,2}(\\.\\d+)?").matches(offset)) {
                        List listSplit$default = StringsKt.split$default((CharSequence) offset, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
                        Long longOrNull2 = StringsKt.toLongOrNull((String) listSplit$default.get(0));
                        long jLongValue = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                        Long longOrNull3 = StringsKt.toLongOrNull((String) listSplit$default.get(1));
                        long jLongValue2 = longOrNull3 != null ? longOrNull3.longValue() : 0L;
                        Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) listSplit$default.get(2));
                        if (doubleOrNull2 != null) {
                            return new AbstractC3712df.b((long) (((jLongValue * ((long) 3600)) + (jLongValue2 * ((long) 60)) + doubleOrNull2.doubleValue()) * ((double) 1000)));
                        }
                        C4048sb.m19417e(C11744X3.j.f26438d + new ChartboostError.Load.InvalidAdm("Invalid time format in VAST offset: " + offset + ". Seconds part could not be parsed.", null).getCode() + "] Failed to parse time offset seconds: " + listSplit$default.get(2) + " in offset: " + offset, null, 2, null);
                        return null;
                    }
                    C4048sb.m19415d("Unrecognized offset format: " + offset, null, 2, null);
                } catch (Exception e2) {
                    e = e2;
                    ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Failed to parse VAST offset string: " + str + ". " + e.getMessage(), e);
                    C4048sb.m19416e(C11744X3.j.f26438d + invalidAdm.getCode() + "] Exception parsing offset string: " + str, invalidAdm);
                    return null;
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
            str = offset;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4079tk
    /* JADX INFO: renamed from: b */
    public InterfaceC4101uk mo17380b() {
        return this.f14721w;
    }

    /* JADX INFO: renamed from: c */
    public final int m18059c(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int i2 = error.errorCode;
        switch (i2) {
            case 1000:
            case 1001:
            case 1004:
                return 900;
            case 1002:
                return 400;
            case 1003:
                return 402;
            default:
                switch (i2) {
                    case 2000:
                    case 2007:
                    case 2008:
                        return 400;
                    case 2001:
                    case 2002:
                        return 402;
                    case 2003:
                        return 405;
                    case 2004:
                    case 2005:
                    case 2006:
                        return 401;
                    default:
                        switch (i2) {
                            case 3001:
                            case 3002:
                            case 3003:
                            case 3004:
                                return 405;
                            default:
                                switch (i2) {
                                    case 4001:
                                    case 4002:
                                    case 4003:
                                    case 4004:
                                    case 4005:
                                        return 405;
                                    default:
                                        return 900;
                                }
                        }
                }
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3694ck
    /* JADX INFO: renamed from: c */
    public void mo17211c() {
        C4048sb.m19408a("VideoRenderable: Received onVideoCompleted for " + this.f14714p, (Throwable) null, 2, (Object) null);
        Set set = this.f14717s;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((C3761fi) obj).m17740a(), CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3693cj.f13754a.m17206a(AbstractC3968oj.d.f15752b, (C3761fi) it.next(), this.f14713o, m18051B(), m18061z());
        }
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17315a();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3694ck
    /* JADX INFO: renamed from: d */
    public void mo17212d() {
        String str = "VideoRenderable: Video asset for " + this.f14714p + " was invalidated (e.g., evicted).";
        C4048sb.m19411b(str, (Throwable) null, 2, (Object) null);
        ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(this.f14714p.toString(), str, new IOException(str));
        CancellableContinuation cancellableContinuation = this.f14712C;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(assetUnavailable)));
            }
        }
        this.f14712C = null;
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17322b(assetUnavailable);
        }
        BuildersKt__Builders_commonKt.launch$default(this.f14710A, NonCancellable.INSTANCE, null, new m(null), 2, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3694ck
    /* JADX INFO: renamed from: e */
    public void mo17213e() {
        C4048sb.m19408a("VideoRenderable: Received onVideoReady for " + this.f14714p, (Throwable) null, 2, (Object) null);
        CancellableContinuation cancellableContinuation = this.f14712C;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m44946constructorimpl(Result.m44945boximpl(Result.m44946constructorimpl(Unit.INSTANCE))));
            }
        }
        this.f14712C = null;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: g */
    public long mo17324g() {
        return this.f14716r.mo16957a() / ((long) 1000);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: j */
    public float mo17326j() {
        float volume = this.f14716r.getVolume();
        super.mo17326j();
        BuildersKt__Builders_commonKt.launch$default(this.f14710A, null, null, new l(null), 3, null);
        return volume;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: k */
    public View mo17327k() throws C3831ij {
        View viewMo16958a = this.f14716r.mo16958a(this.f14713o);
        if (viewMo16958a != null) {
            if (mo17380b() == null) {
                m18056a(viewMo16958a);
            }
            return viewMo16958a;
        }
        C4048sb.m19417e("VideoRenderable.nextAd(): getPlayerView returned null for " + this.f14714p, null, 2, null);
        return viewMo16958a;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: l */
    public void mo17328l() {
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17320a(this.f14720v);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: m */
    public void mo17329m() {
        BuildersKt__Builders_commonKt.launch$default(this.f14710A, null, null, new o(null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: n */
    public void mo17330n() {
        BuildersKt__Builders_commonKt.launch$default(this.f14710A, null, null, new p(null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3860k2
    /* JADX INFO: renamed from: x */
    public void mo17335x() {
        if (this.f14716r.mo16958a(this.f14713o) != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f14710A, null, null, new r(null), 3, null);
            return;
        }
        ChartboostError.Show.Unknown unknown = new ChartboostError.Show.Unknown("Player view not available for " + this.f14714p, null);
        C4048sb.m19411b("VideoRenderable: Cannot start, player view is null for " + this.f14714p + ".", (Throwable) null, 2, (Object) null);
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17322b(unknown);
        }
    }

    /* JADX INFO: renamed from: y */
    public final List m18060y() {
        AbstractC3712df abstractC3712dfM18058b;
        ArrayList arrayList = new ArrayList();
        List listM18054a = m18054a("firstQuartile");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM18054a, 10));
        Iterator it = listM18054a.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3666bf(new AbstractC3712df.a(0.25d), new b((C3761fi) it.next(), this)));
        }
        CollectionsKt.addAll(arrayList, arrayList2);
        List listM18054a2 = m18054a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM18054a2, 10));
        Iterator it2 = listM18054a2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C3666bf(new AbstractC3712df.a(0.5d), new c((C3761fi) it2.next(), this)));
        }
        CollectionsKt.addAll(arrayList, arrayList3);
        List listM18054a3 = m18054a("thirdQuartile");
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM18054a3, 10));
        Iterator it3 = listM18054a3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new C3666bf(new AbstractC3712df.a(0.75d), new d((C3761fi) it3.next(), this)));
        }
        CollectionsKt.addAll(arrayList, arrayList4);
        Set set = this.f14717s;
        ArrayList<C3761fi> arrayList5 = new ArrayList();
        for (Object obj : set) {
            C3761fi c3761fi = (C3761fi) obj;
            if (Intrinsics.areEqual(c3761fi.m17740a(), "progress") && c3761fi.m17743d() != null) {
                arrayList5.add(obj);
            }
        }
        for (C3761fi c3761fi2 : arrayList5) {
            String strM17743d = c3761fi2.m17743d();
            if (strM17743d != null && (abstractC3712dfM18058b = m18058b(strM17743d)) != null) {
                arrayList.add(new C3666bf(abstractC3712dfM18058b, new e(abstractC3712dfM18058b, c3761fi2, this)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final C4105v2 m18061z() {
        return (C4105v2) this.f14723y.getValue();
    }
}
