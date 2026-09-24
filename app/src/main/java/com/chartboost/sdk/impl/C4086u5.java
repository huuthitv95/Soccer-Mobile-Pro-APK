package com.chartboost.sdk.impl;

import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4086u5 implements InterfaceC4040s3 {

    /* JADX INFO: renamed from: a */
    public final CoroutineScope f16461a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f16462b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u5$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.u5$a$a, reason: collision with other inner class name */
        public static final class C15484a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b */
            public int f16464b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f16465c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ MutableSharedFlow f16466d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C4086u5 f16467e;

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.u5$a$a$a, reason: collision with other inner class name */
            public static final class C15485a extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b */
                public int f16468b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f16469c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C15485a(String str, Continuation continuation) {
                    super(2, continuation);
                    this.f16469c = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
                    return ((C15485a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C15485a(this.f16469c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f16468b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    C4048sb.m19415d("Subscription count flow active for " + this.f16469c, null, 2, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.u5$a$a$b */
            public static final class b extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b */
                public int f16470b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ int f16471c;

                public b(Continuation continuation) {
                    super(2, continuation);
                }

                /* JADX INFO: renamed from: a */
                public final Object m19566a(int i, Continuation continuation) {
                    return ((b) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    b bVar = new b(continuation);
                    bVar.f16471c = ((Number) obj).intValue();
                    return bVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m19566a(((Number) obj).intValue(), (Continuation) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f16470b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.f16471c == 0);
                }
            }

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.u5$a$a$c */
            public static final class c extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b */
                public int f16472b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ int f16473c;

                public c(Continuation continuation) {
                    super(2, continuation);
                }

                /* JADX INFO: renamed from: a */
                public final Object m19567a(int i, Continuation continuation) {
                    return ((c) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    c cVar = new c(continuation);
                    cVar.f16473c = ((Number) obj).intValue();
                    return cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m19567a(((Number) obj).intValue(), (Continuation) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f16472b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.f16473c == 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15484a(String str, MutableSharedFlow mutableSharedFlow, C4086u5 c4086u5, Continuation continuation) {
                super(2, continuation);
                this.f16465c = str;
                this.f16466d = mutableSharedFlow;
                this.f16467e = c4086u5;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C15484a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C15484a(this.f16465c, this.f16466d, this.f16467e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f16464b;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C4048sb.m19415d("Starting subscription count monitor for " + this.f16465c, null, 2, null);
                        Flow flowDropWhile = FlowKt.dropWhile(FlowKt.onSubscription(this.f16466d.getSubscriptionCount(), new C15485a(this.f16465c, null)), new b(null));
                        c cVar = new c(null);
                        this.f16464b = 1;
                        if (FlowKt.first(flowDropWhile, cVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    C4048sb.m19415d("Subscription count for " + this.f16465c + " reached zero. Attempting cleanup.", null, 2, null);
                    if (((MutableSharedFlow) this.f16467e.f16462b.get(this.f16465c)) != this.f16466d) {
                        C4048sb.m19415d("Flow for " + this.f16465c + " was already removed or replaced before cleanup could execute.", null, 2, null);
                    } else if (this.f16467e.f16462b.remove(this.f16465c, this.f16466d)) {
                        C4048sb.m19415d("Successfully removed inactive SharedFlow for " + this.f16465c + ".", null, 2, null);
                    } else {
                        C4048sb.m19417e("Failed to remove flow for " + this.f16465c + " during cleanup, likely already removed concurrently.", null, 2, null);
                    }
                    C4048sb.m19415d("Subscription count monitor finished for " + this.f16465c, null, 2, null);
                } catch (CancellationException unused) {
                    C4048sb.m19415d("Cleanup job for " + this.f16465c + " was cancelled.", null, 2, null);
                } catch (Exception e) {
                    C4048sb.m19410b("Error during cache notifier cleanup monitor for " + this.f16465c, e);
                } finally {
                    C4048sb.m19415d("Subscription count monitor finished for " + this.f16465c, null, 2, null);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableSharedFlow invoke(String flowKey) {
            Intrinsics.checkNotNullParameter(flowKey, "flowKey");
            C4048sb.m19415d("Creating new SharedFlow for cache events: " + flowKey, null, 2, null);
            MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
            BuildersKt__Builders_commonKt.launch$default(C4086u5.this.f16461a, null, null, new C15484a(flowKey, MutableSharedFlow, C4086u5.this, null), 3, null);
            return MutableSharedFlow;
        }
    }

    public C4086u5(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f16461a = scope;
        this.f16462b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static final MutableSharedFlow m19561a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MutableSharedFlow) tmp0.invoke(obj);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4040s3
    /* JADX INFO: renamed from: a */
    public Object mo19379a(URL url, EnumC3820i8 enumC3820i8, Continuation continuation) {
        Unit unit;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.f16462b.get(string);
        if (mutableSharedFlow != null) {
            if (mutableSharedFlow.tryEmit(new AbstractC3996q3.a(enumC3820i8, url))) {
                C4048sb.m19415d("Notified eviction for " + string + ".", null, 2, null);
            } else {
                C4048sb.m19417e("Failed to emit eviction event for " + string + " (buffer full). Current subs: " + mutableSharedFlow.getSubscriptionCount().getValue(), null, 2, null);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19415d("Attempted to notify eviction for " + string + ", but no active observers found.", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4040s3
    /* JADX INFO: renamed from: a */
    public Flow mo19380a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ConcurrentHashMap concurrentHashMap = this.f16462b;
        final a aVar = new a();
        Object objComputeIfAbsent = concurrentHashMap.computeIfAbsent(string, new Function() { // from class: com.chartboost.sdk.impl.u5$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C4086u5.m19561a(aVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objComputeIfAbsent, "computeIfAbsent(...)");
        return FlowKt.asSharedFlow((MutableSharedFlow) objComputeIfAbsent);
    }
}
