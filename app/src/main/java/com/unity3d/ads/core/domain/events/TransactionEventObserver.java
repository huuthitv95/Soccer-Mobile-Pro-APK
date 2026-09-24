package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.p299v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: TransactionEventObserver.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0013H\u0086\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "iapTransactionStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class TransactionEventObserver {
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final MutableStateFlow<Boolean> isRunning;
    private final CoroutineScope scope;
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2 */
    /* JADX INFO: compiled from: TransactionEventObserver.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", m43504f = "TransactionEventObserver.kt", m43505i = {1}, m43506l = {35, 36, 44}, m43507m = "invokeSuspend", m43508n = {"fullRequest"}, m43509s = {"L$0"})
    static final class C145622 extends SuspendLambda implements Function2<TransactionEventRequestOuterClass.TransactionEventRequest, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C145622(Continuation<? super C145622> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145622 c145622 = TransactionEventObserver.this.new C145622(continuation);
            c145622.L$0 = obj;
            return c145622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, Continuation<? super Unit> continuation) {
            return ((C145622) create(transactionEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x008a A[Catch: UnityAdsNetworkException -> 0x00b4, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x00b4, blocks: (B:7:0x0011, B:12:0x0022, B:23:0x0082, B:25:0x008a, B:13:0x0026, B:19:0x005b, B:16:0x0031), top: B:31:0x0009 }] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
        
            if (r13.set(r1, r12) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                goto Lb4
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.L$0
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r1 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r1
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                goto L82
            L26:
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                goto L5b
            L2a:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r13 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r13
                gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.p299v1.UniversalRequestKt.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                java.lang.String r6 = "newBuilder()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r5)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r1.setTransactionEventRequest(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r1._build()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.core.domain.events.TransactionEventObserver r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r5 = r12
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r12.label = r4     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                java.lang.Object r13 = r1.invoke(r13, r5)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                if (r13 != r0) goto L5b
                goto Lb3
            L5b:
                r6 = r13
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r9 = r12
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r12.L$0 = r6     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r12.label = r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r5 = 0
                r10 = 1
                r11 = 0
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                if (r13 != r0) goto L81
                goto Lb3
            L81:
                r1 = r6
            L82:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                gatewayprotocol.v1.ErrorOuterClass$Error r13 = r13.getError()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                if (r13 == 0) goto Lb4
                com.unity3d.ads.core.domain.events.TransactionEventObserver r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.this     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.unity3d.ads.core.data.datasource.ByteStringDataSource r13 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r1 = r1.getSharedData()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.getTimestamps()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.google.protobuf.Timestamp r1 = r1.getTimestamp()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                com.google.protobuf.ByteString r1 = r1.toByteString()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                java.lang.String r3 = "fullRequest.sharedData.t….timestamp.toByteString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r3 = r12
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r4 = 0
                r12.L$0 = r4     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                r12.label = r2     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                java.lang.Object r13 = r13.set(r1, r3)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lb4
                if (r13 != r0) goto Lb4
            Lb3:
                return r0
            Lb4:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver.C145622.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, CoroutineScope scope, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource iapTransactionStore) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(transactionEventRepository, "transactionEventRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = StateFlowKt.MutableStateFlow(false);
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        MutableStateFlow<Boolean> mutableStateFlow = this.isRunning;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, true));
        if (bool.booleanValue()) {
            return;
        }
        FlowKt.launchIn(FlowKt.onEach(this.transactionEventRepository.getTransactionEvents(), new C145622(null)), this.scope);
    }
}
