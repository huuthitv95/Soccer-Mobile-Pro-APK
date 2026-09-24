package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.id */
/* JADX INFO: loaded from: classes3.dex */
public final class C3825id extends AbstractC3986pf implements InterfaceC4074tf {

    /* JADX INFO: renamed from: d */
    public final List f14581d;

    /* JADX INFO: renamed from: e */
    public final C4168y f14582e;

    /* JADX INFO: renamed from: f */
    public final CoroutineScope f14583f;

    /* JADX INFO: renamed from: g */
    public final CoroutineScope f14584g;

    /* JADX INFO: renamed from: h */
    public Job f14585h;

    /* JADX INFO: renamed from: i */
    public final String f14586i;

    /* JADX INFO: renamed from: j */
    public final List f14587j;

    /* JADX INFO: renamed from: k */
    public final Set f14588k;

    /* JADX INFO: renamed from: l */
    public int f14589l;

    /* JADX INFO: renamed from: m */
    public AbstractC3860k2 f14590m;

    /* JADX INFO: renamed from: n */
    public float f14591n;

    /* JADX INFO: renamed from: o */
    public boolean f14592o;

    /* JADX INFO: renamed from: p */
    public boolean f14593p;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC3860k2 f14594a;

        /* JADX INFO: renamed from: b */
        public final Deferred f14595b;

        /* JADX INFO: renamed from: c */
        public final boolean f14596c;

        public a(AbstractC3860k2 renderable, Deferred job, boolean z) {
            Intrinsics.checkNotNullParameter(renderable, "renderable");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f14594a = renderable;
            this.f14595b = job;
            this.f14596c = z;
        }

        /* JADX INFO: renamed from: a */
        public final Deferred m17990a() {
            return this.f14595b;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC3860k2 m17991b() {
            return this.f14594a;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m17992c() {
            return this.f14596c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f14594a, aVar.f14594a) && Intrinsics.areEqual(this.f14595b, aVar.f14595b) && this.f14596c == aVar.f14596c;
        }

        public int hashCode() {
            return (((this.f14594a.hashCode() * 31) + this.f14595b.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14596c);
        }

        public String toString() {
            return "RenderableJob(renderable=" + this.f14594a + ", job=" + this.f14595b + ", isOptional=" + this.f14596c + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$b */
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14597b;

        /* JADX INFO: renamed from: c */
        public Object f14598c;

        /* JADX INFO: renamed from: d */
        public Object f14599d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f14600e;

        /* JADX INFO: renamed from: g */
        public int f14602g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14600e = obj;
            this.f14602g |= Integer.MIN_VALUE;
            Object objMo17313a = C3825id.this.mo17313a((Context) null, this);
            return objMo17313a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo17313a : Result.m44945boximpl(objMo17313a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final c f14603b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC3860k2 renderable) {
            Intrinsics.checkNotNullParameter(renderable, "renderable");
            return renderable.getClass().getSimpleName() + "(optional=" + renderable.m18336v().m19188m() + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$d */
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14604b;

        /* JADX INFO: renamed from: c */
        public Object f14605c;

        /* JADX INFO: renamed from: d */
        public Object f14606d;

        /* JADX INFO: renamed from: e */
        public Object f14607e;

        /* JADX INFO: renamed from: f */
        public Object f14608f;

        /* JADX INFO: renamed from: g */
        public Object f14609g;

        /* JADX INFO: renamed from: h */
        public Object f14610h;

        /* JADX INFO: renamed from: i */
        public /* synthetic */ Object f14611i;

        /* JADX INFO: renamed from: k */
        public int f14613k;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14611i = obj;
            this.f14613k |= Integer.MIN_VALUE;
            Object objM17973a = C3825id.this.m17973a(null, null, this);
            return objM17973a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM17973a : Result.m44945boximpl(objM17973a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$e */
    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14614b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC3860k2 f14615c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3825id f14616d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Context f14617e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC3860k2 abstractC3860k2, C3825id c3825id, Context context, Continuation continuation) {
            super(2, continuation);
            this.f14615c = abstractC3860k2;
            this.f14616d = c3825id;
            this.f14617e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f14615c, this.f14616d, this.f14617e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo17313a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14614b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f14615c.m19066a(this.f14616d);
                AbstractC3860k2 abstractC3860k2 = this.f14615c;
                Context context = this.f14617e;
                this.f14614b = 1;
                objMo17313a = abstractC3860k2.mo17313a(context, this);
                if (objMo17313a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo17313a = ((Result) obj).getValue();
            }
            return Result.m44945boximpl(objMo17313a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14618b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f14619c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f14620d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3825id f14621e;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$f$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f14622b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f14623c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ List f14624d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Context f14625e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C3825id f14626f;

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$f$a$a, reason: collision with other inner class name */
            public static final class C15478a extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b */
                public int f14627b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AbstractC3860k2 f14628c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Context f14629d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C3825id f14630e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C15478a(AbstractC3860k2 abstractC3860k2, Context context, C3825id c3825id, Continuation continuation) {
                    super(2, continuation);
                    this.f14628c = abstractC3860k2;
                    this.f14629d = context;
                    this.f14630e = c3825id;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C15478a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C15478a(this.f14628c, this.f14629d, this.f14630e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objMo17313a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f14627b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            AbstractC3860k2 abstractC3860k2 = this.f14628c;
                            Context context = this.f14629d;
                            this.f14627b = 1;
                            objMo17313a = abstractC3860k2.mo17313a(context, this);
                            if (objMo17313a == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            objMo17313a = ((Result) obj).getValue();
                        }
                        if (Result.m44952isFailureimpl(objMo17313a)) {
                            C4048sb.m19416e(C11744X3.j.f26438d + this.f14630e.f14586i + "] An optional renderable failed to load in the background.", Result.m44949exceptionOrNullimpl(objMo17313a));
                        } else {
                            this.f14630e.m17986v().add(this.f14628c);
                            C4048sb.m19408a(C11744X3.j.f26438d + this.f14630e.f14586i + "] An optional renderable loaded successfully in the background.", (Throwable) null, 2, (Object) null);
                            this.f14628c.mo17318a(this.f14629d);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        C4048sb.m19410b(C11744X3.j.f26438d + this.f14630e.f14586i + "] Exception while loading an optional renderable.", e2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, Context context, C3825id c3825id, Continuation continuation) {
                super(2, continuation);
                this.f14624d = list;
                this.f14625e = context;
                this.f14626f = c3825id;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f14624d, this.f14625e, this.f14626f, continuation);
                aVar.f14623c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14622b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f14623c;
                List list = this.f14624d;
                Context context = this.f14625e;
                C3825id c3825id = this.f14626f;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15478a((AbstractC3860k2) it.next(), context, c3825id, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, Context context, C3825id c3825id, Continuation continuation) {
            super(2, continuation);
            this.f14619c = list;
            this.f14620d = context;
            this.f14621e = c3825id;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f14619c, this.f14620d, this.f14621e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14618b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.f14619c, this.f14620d, this.f14621e, null);
                this.f14618b = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$g */
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14631b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f14632c;

        /* JADX INFO: renamed from: e */
        public int f14634e;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14632c = obj;
            this.f14634e |= Integer.MIN_VALUE;
            Object objM17976b = C3825id.this.m17976b(null, null, this);
            return objM17976b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM17976b : Result.m44945boximpl(objM17976b);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$h */
    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public Object f14635b;

        /* JADX INFO: renamed from: c */
        public int f14636c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC3860k2 f14637d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Context f14638e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC3860k2 abstractC3860k2, Context context, Continuation continuation) {
            super(2, continuation);
            this.f14637d = abstractC3860k2;
            this.f14638e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f14637d, this.f14638e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC3860k2 abstractC3860k2;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14636c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC3860k2 abstractC3860k3 = this.f14637d;
                Context context = this.f14638e;
                this.f14635b = abstractC3860k3;
                this.f14636c = 1;
                Object objMo17313a = abstractC3860k3.mo17313a(context, this);
                if (objMo17313a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                abstractC3860k2 = abstractC3860k3;
                value = objMo17313a;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC3860k2 = (AbstractC3860k2) this.f14635b;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            return TuplesKt.m43482to(abstractC3860k2, Result.m44945boximpl(value));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$i */
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14639b;

        /* JADX INFO: renamed from: c */
        public Object f14640c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f14641d;

        /* JADX INFO: renamed from: f */
        public int f14643f;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14641d = obj;
            this.f14643f |= Integer.MIN_VALUE;
            Object objM17972a = C3825id.this.m17972a((Context) null, (List) null, (List) null, this);
            return objM17972a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM17972a : Result.m44945boximpl(objM17972a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$j */
    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public Object f14644b;

        /* JADX INFO: renamed from: c */
        public int f14645c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC3860k2 f14646d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3825id f14647e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f14648f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC3860k2 abstractC3860k2, C3825id c3825id, Context context, Continuation continuation) {
            super(2, continuation);
            this.f14646d = abstractC3860k2;
            this.f14647e = c3825id;
            this.f14648f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f14646d, this.f14647e, this.f14648f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC3860k2 abstractC3860k2;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14645c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f14646d.m19066a(this.f14647e);
                AbstractC3860k2 abstractC3860k3 = this.f14646d;
                Context context = this.f14648f;
                this.f14644b = abstractC3860k3;
                this.f14645c = 1;
                Object objMo17313a = abstractC3860k3.mo17313a(context, this);
                if (objMo17313a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                abstractC3860k2 = abstractC3860k3;
                value = objMo17313a;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC3860k2 = (AbstractC3860k2) this.f14644b;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            return TuplesKt.m43482to(abstractC3860k2, Result.m44945boximpl(value));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$k */
    public static final class k extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14649b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f14650c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3825id f14651d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Context f14652e;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$k$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f14653b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f14654c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ List f14655d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C3825id f14656e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Context f14657f;

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.id$k$a$a, reason: collision with other inner class name */
            public static final class C15479a extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b */
                public int f14658b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Deferred f14659c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C3825id f14660d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ AbstractC3860k2 f14661e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Context f14662f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C15479a(Deferred deferred, C3825id c3825id, AbstractC3860k2 abstractC3860k2, Context context, Continuation continuation) {
                    super(2, continuation);
                    this.f14659c = deferred;
                    this.f14660d = c3825id;
                    this.f14661e = abstractC3860k2;
                    this.f14662f = context;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C15479a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C15479a(this.f14659c, this.f14660d, this.f14661e, this.f14662f, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f14658b;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Deferred deferred = this.f14659c;
                            this.f14658b = 1;
                            obj = deferred.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Object value = ((Result) obj).getValue();
                        if (Result.m44952isFailureimpl(value)) {
                            C4048sb.m19416e(C11744X3.j.f26438d + this.f14660d.f14586i + "] An optional renderable failed to load in the background.", Result.m44949exceptionOrNullimpl(value));
                        } else {
                            this.f14660d.m17986v().add(this.f14661e);
                            C4048sb.m19408a(C11744X3.j.f26438d + this.f14660d.f14586i + "] An optional renderable loaded successfully in the background.", (Throwable) null, 2, (Object) null);
                            this.f14661e.mo17318a(this.f14662f);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        C4048sb.m19410b(C11744X3.j.f26438d + this.f14660d.f14586i + "] Exception while awaiting an optional renderable.", e2);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, C3825id c3825id, Context context, Continuation continuation) {
                super(2, continuation);
                this.f14655d = list;
                this.f14656e = c3825id;
                this.f14657f = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f14655d, this.f14656e, this.f14657f, continuation);
                aVar.f14654c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14653b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f14654c;
                List<Pair> list = this.f14655d;
                C3825id c3825id = this.f14656e;
                Context context = this.f14657f;
                for (Pair pair : list) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15479a((Deferred) pair.component2(), c3825id, (AbstractC3860k2) pair.component1(), context, null), 3, null);
                    c3825id = c3825id;
                    context = context;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List list, C3825id c3825id, Context context, Continuation continuation) {
            super(2, continuation);
            this.f14650c = list;
            this.f14651d = c3825id;
            this.f14652e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f14650c, this.f14651d, this.f14652e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14649b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.f14650c, this.f14651d, this.f14652e, null);
                this.f14649b = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

    public C3825id(List renderables, C4168y adMarkupConfig, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(renderables, "renderables");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f14581d = renderables;
        this.f14582e = adMarkupConfig;
        this.f14583f = coroutineScope;
        this.f14584g = coroutineScope;
        this.f14586i = Integer.toHexString(System.identityHashCode(this));
        this.f14587j = Collections.synchronizedList(new ArrayList());
        this.f14588k = Collections.synchronizedSet(new LinkedHashSet());
        this.f14589l = -1;
        this.f14591n = 1.0f;
    }

    public /* synthetic */ C3825id(List list, C4168y c4168y, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, c4168y, (i2 & 4) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))) : coroutineScope);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public final Object m17972a(Context context, List list, List list2, Continuation continuation) throws Throwable {
        i iVar;
        List list3;
        C3825id c3825id;
        Object next;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f14643f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f14643f = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objAwaitAll = iVar.f14641d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f14643f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwaitAll);
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(this.f14584g, null, null, new j((AbstractC3860k2) it.next(), this, context, null), 3, null));
                }
                iVar.f14639b = this;
                iVar.f14640c = list2;
                iVar.f14643f = 1;
                objAwaitAll = AwaitKt.awaitAll(arrayList, iVar);
                if (objAwaitAll != coroutine_suspended) {
                    list3 = list2;
                    c3825id = this;
                }
            } else {
                if (list2.isEmpty()) {
                    C4048sb.m19408a("No renderables to load.", (Throwable) null, 2, (Object) null);
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m44946constructorimpl(Unit.INSTANCE);
                }
                iVar.f14643f = 2;
                Object objM17976b = m17976b(context, list2, iVar);
                if (objM17976b != coroutine_suspended) {
                    return objM17976b;
                }
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitAll);
            return ((Result) objAwaitAll).getValue();
        }
        list3 = (List) iVar.f14640c;
        c3825id = (C3825id) iVar.f14639b;
        ResultKt.throwOnFailure(objAwaitAll);
        List list4 = (List) objAwaitAll;
        Iterator it2 = list4.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Result.m44952isFailureimpl(((Result) ((Pair) next).component2()).getValue()));
        Pair pair = (Pair) next;
        if (pair != null) {
            Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(((Result) pair.component2()).getValue());
            if (thM44949exceptionOrNullimpl == null) {
                thM44949exceptionOrNullimpl = new IllegalStateException("Unknown critical load failure");
            }
            C4048sb.m19410b("A critical renderable failed to load, failing the entire ad.", thM44949exceptionOrNullimpl);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list4) {
            if (Result.m44953isSuccessimpl(((Result) ((Pair) obj).component2()).getValue())) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            c3825id.f14588k.add((AbstractC3860k2) ((Pair) it3.next()).component1());
        }
        C4048sb.m19408a(C11744X3.j.f26438d + c3825id.f14586i + "] All critical renderables loaded successfully.", (Throwable) null, 2, (Object) null);
        if (!list3.isEmpty()) {
            c3825id.f14587j.addAll(list3);
        }
        C4048sb.m19408a(C11744X3.j.f26438d + c3825id.f14586i + "] Reporting load success after critical renderables ready.", (Throwable) null, 2, (Object) null);
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m44946constructorimpl(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0125 -> B:42:0x0129). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m17973a(android.content.Context r18, java.util.List r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3825id.m17973a(android.content.Context, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.chartboost.sdk.impl.id, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.chartboost.sdk.impl.id$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.chartboost.sdk.impl.id] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public Object mo17313a(Context context, Continuation continuation) throws Throwable {
        ?? bVar;
        Result result;
        if (continuation instanceof b) {
            b bVar2 = (b) continuation;
            int i2 = bVar2.f14602g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar2.f14602g = i2 - Integer.MIN_VALUE;
                bVar = bVar2;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f14600e;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = bVar.f14602g;
        try {
            if (r5 != 0) {
                try {
                    if (r5 == 1) {
                        List list = (List) bVar.f14599d;
                        List list2 = (List) bVar.f14598c;
                        C3825id c3825id = (C3825id) bVar.f14597b;
                        ResultKt.throwOnFailure(obj);
                        result = (Result) obj;
                        bVar = c3825id;
                        coroutine_suspended = list;
                        r5 = list2;
                    } else {
                        if (r5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        List list3 = (List) bVar.f14599d;
                        List list4 = (List) bVar.f14598c;
                        C3825id c3825id2 = (C3825id) bVar.f14597b;
                        ResultKt.throwOnFailure(obj);
                        result = (Result) obj;
                        bVar = c3825id2;
                        coroutine_suspended = list3;
                        r5 = list4;
                    }
                    return result.getValue();
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f14588k.clear();
                if (this.f14581d.isEmpty()) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Internal("Ad markup contains no renderable units.", new IllegalStateException())));
                }
                List list5 = this.f14581d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list5) {
                    if (((AbstractC3860k2) obj2).m18336v().m19188m()) {
                        arrayList2.add(obj2);
                    } else {
                        arrayList.add(obj2);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                r5 = (List) pair.component1();
                List list6 = (List) pair.component2();
                try {
                    if (this.f14582e.m20005g() == EnumC3960ob.SEQUENTIAL) {
                        bVar.f14597b = this;
                        bVar.f14598c = r5;
                        bVar.f14599d = list6;
                        bVar.f14602g = 1;
                        Object objM17972a = m17972a(context, r5, list6, bVar);
                        if (objM17972a != coroutine_suspended) {
                            return objM17972a;
                        }
                    } else {
                        bVar.f14597b = this;
                        bVar.f14598c = r5;
                        bVar.f14599d = list6;
                        bVar.f14602g = 2;
                        Object objM17973a = m17973a(context, list6, bVar);
                        if (objM17973a != coroutine_suspended) {
                            return objM17973a;
                        }
                    }
                    return coroutine_suspended;
                } catch (Exception e3) {
                    e = e3;
                    bVar = this;
                    coroutine_suspended = list6;
                }
            }
            C4048sb.m19410b("Unexpected exception during load job synchronization.", e);
            String strM19391a = AbstractC4044s7.m19391a(e, 5);
            String simpleName = e.getClass().getSimpleName();
            String message = e.getMessage();
            if (message == null) {
                message = "<no_message>";
            }
            String str = bVar.f14582e.m20005g() == EnumC3960ob.SEQUENTIAL ? "sequential" : "concurrent";
            int size = r5.size();
            int size2 = coroutine_suspended.size();
            String strJoinToString$default = CollectionsKt.joinToString$default(bVar.f14581d, ",", null, null, 0, null, c.f14603b, 30, null);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Unexpected exception during renderable loading: " + message + " ExceptionType=" + simpleName + " LoadingStrategy=" + str + " CriticalCount=" + size + " OptionalCount=" + size2 + " Renderables=[" + strJoinToString$default + "] Thread=" + Thread.currentThread().getName() + " StackTrace=[" + strM19391a + C11744X3.j.f26440e, e)));
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: a */
    public void mo17315a() {
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17315a();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17316a(float f2) {
        this.f14593p = false;
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17316a(m17980p());
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17318a(Context context) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator it = this.f14581d.iterator();
        while (it.hasNext()) {
            ((AbstractC3860k2) it.next()).mo17318a(context);
        }
        List deferredOptionalRenderables = this.f14587j;
        Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables, "deferredOptionalRenderables");
        synchronized (deferredOptionalRenderables) {
            List deferredOptionalRenderables2 = this.f14587j;
            Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables2, "deferredOptionalRenderables");
            if (deferredOptionalRenderables2.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                List deferredOptionalRenderables3 = this.f14587j;
                Intrinsics.checkNotNullExpressionValue(deferredOptionalRenderables3, "deferredOptionalRenderables");
                listEmptyList = CollectionsKt.toList(deferredOptionalRenderables3);
                this.f14587j.clear();
            }
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        m17974a(context, listEmptyList);
        C4048sb.m19408a(C11744X3.j.f26438d + this.f14586i + "] Started deferred optional renderables (" + listEmptyList.size() + " renderables)", (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17974a(Context context, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC3860k2) it.next()).m19066a(this);
        }
        Job job = this.f14585h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f14585h = BuildersKt__Builders_commonKt.launch$default(this.f14584g, null, null, new f(list, context, this, null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17975a(EnumC3704d7 type, EnumC4020r5 enumC4020r5) {
        Intrinsics.checkNotNullParameter(type, "type");
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17975a(type, enumC4020r5);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17319a(EnumC3737eh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Job job = this.f14585h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f14587j.clear();
        this.f14588k.clear();
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17319a(reason);
        }
        AbstractC3860k2 abstractC3860k3 = this.f14590m;
        if (abstractC3860k3 != null) {
            abstractC3860k3.m19066a((InterfaceC4074tf) null);
        }
        this.f14590m = null;
        Iterator it = this.f14581d.iterator();
        while (it.hasNext()) {
            ((AbstractC3860k2) it.next()).m19066a((InterfaceC4074tf) null);
        }
        this.f14589l = -1;
        CoroutineScopeKt.cancel$default(this.f14584g, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: a */
    public void mo17320a(EnumC3895le request) {
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17320a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: a */
    public void mo17321a(boolean z) {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17321a(z);
            return;
        }
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17323f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m17976b(Context context, List list, Continuation continuation) throws Throwable {
        g gVar;
        C3825id c3825id;
        Throwable illegalStateException;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.f14634e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.f14634e = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objAwaitAll = gVar.f14632c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = gVar.f14634e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwaitAll);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractC3860k2) it.next()).m19066a(this);
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(this.f14584g, null, null, new h((AbstractC3860k2) it2.next(), context, null), 3, null));
            }
            gVar.f14631b = this;
            gVar.f14634e = 1;
            objAwaitAll = AwaitKt.awaitAll(arrayList, gVar);
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3825id = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3825id = (C3825id) gVar.f14631b;
            ResultKt.throwOnFailure(objAwaitAll);
        }
        List list2 = (List) objAwaitAll;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (Result.m44953isSuccessimpl(((Result) ((Pair) obj).component2()).getValue())) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            c3825id.f14588k.add((AbstractC3860k2) ((Pair) it3.next()).component1());
        }
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                if (Result.m44953isSuccessimpl(((Result) ((Pair) it4.next()).component2()).getValue())) {
                    C4048sb.m19408a(C11744X3.j.f26438d + c3825id.f14586i + "] At least one optional renderable loaded successfully.", (Throwable) null, 2, (Object) null);
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m44946constructorimpl(Unit.INSTANCE);
                }
            }
        }
        C4048sb.m19411b(C11744X3.j.f26438d + c3825id.f14586i + "] All optional renderables failed to load.", (Throwable) null, 2, (Object) null);
        Result.Companion companion2 = Result.INSTANCE;
        Pair pair = (Pair) CollectionsKt.firstOrNull(list2);
        if (pair == null || (illegalStateException = Result.m44949exceptionOrNullimpl(((Result) pair.component2()).getValue())) == null) {
            illegalStateException = new IllegalStateException("All optional renderables failed.");
        }
        return Result.m44946constructorimpl(ResultKt.createFailure(illegalStateException));
    }

    /* JADX INFO: renamed from: b */
    public final void m17977b(Context context, List list) {
        Job job = this.f14585h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f14585h = BuildersKt__Builders_commonKt.launch$default(this.f14584g, null, null, new k(list, this, context, null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: b */
    public void mo17322b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17322b(error);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17978b(boolean z) {
        AbstractC3860k2 abstractC3860k2;
        this.f14592o = z;
        if (!z) {
            if (this.f14593p || (abstractC3860k2 = this.f14590m) == null) {
                return;
            }
            abstractC3860k2.mo17316a(this.f14591n);
            return;
        }
        if (this.f14593p) {
            AbstractC3860k2 abstractC3860k3 = this.f14590m;
            if (abstractC3860k3 != null) {
                abstractC3860k3.mo17326j();
                return;
            }
            return;
        }
        this.f14591n = 1.0f;
        AbstractC3860k2 abstractC3860k4 = this.f14590m;
        if (abstractC3860k4 != null) {
            abstractC3860k4.mo17316a(0.2f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m17979c(boolean z) {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.m18332b(z);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4074tf
    /* JADX INFO: renamed from: f */
    public void mo17323f() {
        InterfaceC4074tf interfaceC4074tfM19067i = m19067i();
        if (interfaceC4074tfM19067i != null) {
            interfaceC4074tfM19067i.mo17323f();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: g */
    public long mo17324g() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            return abstractC3860k2.mo17324g();
        }
        return 0L;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: h */
    public boolean mo17325h() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 == null || !abstractC3860k2.mo17325h()) {
            Iterable indices = CollectionsKt.getIndices(this.f14581d);
            if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
                return false;
            }
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                if (iNextInt <= this.f14589l || !this.f14588k.contains(this.f14581d.get(iNextInt))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: j */
    public float mo17326j() {
        this.f14593p = true;
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            this.f14591n = this.f14592o ? 0.2f : this.f14591n;
            abstractC3860k2.mo17326j();
        }
        return this.f14591n;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: k */
    public View mo17327k() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 == null || !abstractC3860k2.mo17325h()) {
            int i2 = 0;
            for (int i3 = this.f14589l + 1; i3 < this.f14581d.size(); i3++) {
                AbstractC3860k2 abstractC3860k3 = (AbstractC3860k2) this.f14581d.get(i3);
                if (this.f14588k.contains(abstractC3860k3)) {
                    if (i2 > 0) {
                        C4048sb.m19408a(C11744X3.j.f26438d + this.f14586i + "] Skipped " + i2 + " unloaded renderable(s) before showing next ad", (Throwable) null, 2, (Object) null);
                    }
                    this.f14589l = i3;
                    abstractC3860k3.m19066a(this);
                    this.f14590m = abstractC3860k3;
                    return abstractC3860k3.mo17327k();
                }
                C4048sb.m19408a(C11744X3.j.f26438d + this.f14586i + "] Skipping renderable at index " + i3 + " (not yet loaded)", (Throwable) null, 2, (Object) null);
                i2++;
            }
            if (i2 > 0) {
                C4048sb.m19408a(C11744X3.j.f26438d + this.f14586i + "] Reached end of sequence: " + i2 + " renderable(s) still loading in background. No more loaded renderables available at this time.", (Throwable) null, 2, (Object) null);
            } else {
                C4048sb.m19408a(C11744X3.j.f26438d + this.f14586i + "] No more renderables to show", (Throwable) null, 2, (Object) null);
            }
        } else {
            AbstractC3860k2 abstractC3860k4 = this.f14590m;
            if (abstractC3860k4 != null) {
                return abstractC3860k4.mo17327k();
            }
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: l */
    public void mo17328l() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17328l();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: m */
    public void mo17329m() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17329m();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: n */
    public void mo17330n() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17330n();
            if (this.f14593p) {
                abstractC3860k2.mo17326j();
            } else {
                abstractC3860k2.mo17316a(m17980p());
            }
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3986pf
    /* JADX INFO: renamed from: o */
    public void mo17331o() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17331o();
        }
    }

    /* JADX INFO: renamed from: p */
    public final float m17980p() {
        if (this.f14592o) {
            return 0.2f;
        }
        float f2 = this.f14591n;
        if (f2 > 0.0f) {
            return f2;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: q */
    public final C4168y m17981q() {
        return this.f14582e;
    }

    /* JADX INFO: renamed from: r */
    public final long m17982r() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            return abstractC3860k2.mo17332s();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: s */
    public final long m17983s() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            return abstractC3860k2.mo17333t();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC3860k2 m17984t() {
        return this.f14590m;
    }

    /* JADX INFO: renamed from: u */
    public final int m17985u() {
        return this.f14589l;
    }

    /* JADX INFO: renamed from: v */
    public final Set m17986v() {
        return this.f14588k;
    }

    /* JADX INFO: renamed from: w */
    public final List m17987w() {
        return this.f14581d;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m17988x() {
        return this.f14593p;
    }

    /* JADX INFO: renamed from: y */
    public void m17989y() {
        AbstractC3860k2 abstractC3860k2 = this.f14590m;
        if (abstractC3860k2 != null) {
            abstractC3860k2.mo17335x();
        }
    }
}
