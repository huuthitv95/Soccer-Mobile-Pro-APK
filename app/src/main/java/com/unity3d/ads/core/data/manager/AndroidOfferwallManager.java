package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: AndroidOfferwallManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m43475d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOfferwallManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallBridge", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "(Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;)V", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAdReady", "", "placementName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "loadAd", "", "showAd", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidOfferwallManager implements OfferwallManager {
    private final OfferwallAdapterBridge offerwallBridge;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", m43504f = "AndroidOfferwallManager.kt", m43505i = {}, m43506l = {28}, m43507m = "loadAd", m43508n = {}, m43509s = {})
    static final class C144381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C144381(Continuation<? super C144381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", m43504f = "AndroidOfferwallManager.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144392 extends SuspendLambda implements Function2<FlowCollector<? super OfferwallEventData>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144392(String str, Continuation<? super C144392> continuation) {
            super(2, continuation);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidOfferwallManager.this.new C144392(this.$placementName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super OfferwallEventData> flowCollector, Continuation<? super Unit> continuation) {
            return ((C144392) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", m43504f = "AndroidOfferwallManager.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144403 extends SuspendLambda implements Function2<OfferwallEventData, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $placementName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144403(String str, Continuation<? super C144403> continuation) {
            super(2, continuation);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144403 c144403 = new C144403(this.$placementName, continuation);
            c144403.L$0 = obj;
            return c144403;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OfferwallEventData offerwallEventData, Continuation<? super Boolean> continuation) {
            return ((C144403) create(offerwallEventData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            boolean z = false;
            if (CollectionsKt.listOf((Object[]) new OfferwallEvent[]{OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED}).contains(offerwallEventData.getOfferwallEvent()) && Intrinsics.areEqual(offerwallEventData.getPlacementName(), this.$placementName)) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1 */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", m43504f = "AndroidOfferwallManager.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144411 extends SuspendLambda implements Function2<FlowCollector<? super OfferwallEventData>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144411(String str, Continuation<? super C144411> continuation) {
            super(2, continuation);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidOfferwallManager.this.new C144411(this.$placementName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super OfferwallEventData> flowCollector, Continuation<? super Unit> continuation) {
            return ((C144411) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2 */
    /* JADX INFO: compiled from: AndroidOfferwallManager.kt */
    @Metadata(m43474d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "it"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", m43504f = "AndroidOfferwallManager.kt", m43505i = {0}, m43506l = {44}, m43507m = "invokeSuspend", m43508n = {"it"}, m43509s = {"L$0"})
    static final class C144422 extends SuspendLambda implements Function3<FlowCollector<? super OfferwallEventData>, OfferwallEventData, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C144422(Continuation<? super C144422> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super OfferwallEventData> flowCollector, OfferwallEventData offerwallEventData, Continuation<? super Boolean> continuation) {
            C144422 c144422 = new C144422(continuation);
            c144422.L$0 = flowCollector;
            c144422.L$1 = offerwallEventData;
            return c144422.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            OfferwallEventData offerwallEventData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (flowCollector.emit(offerwallEventData2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(!ArraysKt.contains(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }
    }

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallBridge) {
        Intrinsics.checkNotNullParameter(offerwallBridge, "offerwallBridge");
        this.offerwallBridge = offerwallBridge;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(Continuation<? super String> continuation) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object loadAd(String str, Continuation<? super Unit> continuation) throws Throwable {
        C144381 c144381;
        if (continuation instanceof C144381) {
            c144381 = (C144381) continuation;
            if ((c144381.label & Integer.MIN_VALUE) != 0) {
                c144381.label -= Integer.MIN_VALUE;
            } else {
                c144381 = new C144381(continuation);
            }
        } else {
            c144381 = new C144381(continuation);
        }
        Object objFirst = c144381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c144381.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            DeviceLog.debug("Offerwall Manager - loadAd: " + str);
            SharedFlow sharedFlowOnSubscription = FlowKt.onSubscription(this.offerwallBridge.getOfferwallEventFlow(), new C144392(str, null));
            C144403 c144403 = new C144403(str, null);
            c144381.label = 1;
            objFirst = FlowKt.first(sharedFlowOnSubscription, c144403, c144381);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        OfferwallEventData offerwallEventData = (OfferwallEventData) (((OfferwallEventData) objFirst).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? objFirst : null);
        if (offerwallEventData == null) {
            return Unit.INSTANCE;
        }
        Integer errorCode = offerwallEventData.getErrorCode();
        int iIntValue = errorCode != null ? errorCode.intValue() : 0;
        StringBuilder sb = new StringBuilder("Error loading offerwall ad: ");
        Object errorMessage = offerwallEventData.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = offerwallEventData.getOfferwallEvent();
        }
        sb.append(errorMessage);
        throw new LoadException(iIntValue, sb.toString());
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Flow<OfferwallEventData> showAd(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        DeviceLog.debug("Offerwall Manager - showAd: " + placementName);
        return FlowKt.transformWhile(FlowKt.onSubscription(this.offerwallBridge.getOfferwallEventFlow(), new C144411(placementName, null)), new C144422(null));
    }
}
