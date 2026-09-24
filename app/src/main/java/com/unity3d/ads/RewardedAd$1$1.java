package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: RewardedAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.ads.RewardedAd$1$1", m43504f = "RewardedAd.kt", m43505i = {}, m43506l = {45}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
final class RewardedAd$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RewardedAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardedAd$1$1(RewardedAd rewardedAd, Continuation<? super RewardedAd$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rewardedAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardedAd$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RewardedAd$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final MutableStateFlow<AdObjectState> state = this.this$0.adObject.getState();
            final AdObjectState adObjectState = AdObjectState.EXPIRED;
            Flow flowTake = FlowKt.take(new Flow<AdObjectState>() { // from class: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m43475d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
                public static final class C143302<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ AdObjectState receiver$inlined;

                    /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
                    @DebugMetadata(m43503c = "com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2", m43504f = "RewardedAd.kt", m43505i = {}, m43506l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m43507m = "emit", m43508n = {}, m43509s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C143302.this.emit(null, this);
                        }
                    }

                    public C143302(FlowCollector flowCollector, AdObjectState adObjectState) {
                        this.$this_unsafeFlow = flowCollector;
                        this.receiver$inlined = adObjectState;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = anonymousClass1.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (this.receiver$inlined.equals(obj)) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super AdObjectState> flowCollector, Continuation continuation) {
                    Object objCollect = state.collect(new C143302(flowCollector, adObjectState), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, 1);
            final RewardedAd rewardedAd = this.this$0;
            this.label = 1;
            if (flowTake.collect(new FlowCollector() { // from class: com.unity3d.ads.RewardedAd$1$1.2
                public final Object emit(AdObjectState adObjectState2, Continuation<? super Unit> continuation) {
                    SafeCallbackInvoke safeCallbackInvoke = rewardedAd.safeCallbackInvoke;
                    final RewardedAd rewardedAd2 = rewardedAd;
                    safeCallbackInvoke.invoke(new Function0<Unit>() { // from class: com.unity3d.ads.RewardedAd.1.1.2.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AdExpiredListener<RewardedAd> onAdExpired = rewardedAd2.getOnAdExpired();
                            if (onAdExpired != null) {
                                onAdExpired.onAdExpired(rewardedAd2);
                            }
                        }
                    });
                    return Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((AdObjectState) obj2, (Continuation<? super Unit>) continuation);
                }
            }, this) == coroutine_suspended) {
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
