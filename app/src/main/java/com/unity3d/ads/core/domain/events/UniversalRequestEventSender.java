package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UniversalRequestEventSender.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "handleGatewayEventResponse", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "universalRequestTtlValidator", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;Lcom/unity3d/ads/core/data/model/OperationType;)V", "invoke", "", "universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final OperationType operationType;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 */
    /* JADX INFO: compiled from: UniversalRequestEventSender.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", m43504f = "UniversalRequestEventSender.kt", m43505i = {0}, m43506l = {23, 37}, m43507m = "invoke", m43508n = {"this"}, m43509s = {"L$0"})
    static final class C145631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C145631(Continuation<? super C145631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType) {
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(handleGatewayEventResponse, "handleGatewayEventResponse");
        Intrinsics.checkNotNullParameter(universalRequestTtlValidator, "universalRequestTtlValidator");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
        this.operationType = operationType;
    }

    public /* synthetic */ UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gatewayClient, handleGatewayEventResponse, universalRequestTtlValidator, (i & 8) != 0 ? OperationType.UNIVERSAL_EVENT : operationType);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r12.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13, r6) == r9) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r12, com.unity3d.ads.gatewayclient.RequestPolicy r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender.C145631
            if (r0 == 0) goto L14
            r0 = r14
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender.C145631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            r0.<init>(r14)
        L19:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r10 = 2
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 == r1) goto L37
            if (r0 != r10) goto L2f
            kotlin.ResultKt.throwOnFailure(r14)
            goto L9d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            java.lang.Object r12 = r6.L$0
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r12 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) r12
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Throwable -> L3f
            goto L6b
        L3f:
            r0 = move-exception
            r13 = r0
            goto L75
        L42:
            kotlin.ResultKt.throwOnFailure(r14)
            com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator r14 = r11.universalRequestTtlValidator
            boolean r14 = r14.invoke(r12, r13)
            if (r14 != 0) goto L50
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L50:
            kotlin.Result$Companion r14 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L72
            r14 = r11
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r14 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) r14     // Catch: java.lang.Throwable -> L72
            r14 = r1
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r11.gatewayClient     // Catch: java.lang.Throwable -> L72
            com.unity3d.ads.core.data.model.OperationType r5 = r11.operationType     // Catch: java.lang.Throwable -> L72
            r6.L$0 = r11     // Catch: java.lang.Throwable -> L72
            r6.label = r14     // Catch: java.lang.Throwable -> L72
            r2 = 0
            r7 = 1
            r8 = 0
            r3 = r12
            r4 = r13
            java.lang.Object r14 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L72
            if (r14 != r9) goto L6a
            goto L9c
        L6a:
            r12 = r11
        L6b:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r14 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r14     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r13 = kotlin.Result.m44946constructorimpl(r14)     // Catch: java.lang.Throwable -> L3f
            goto L7f
        L72:
            r0 = move-exception
            r13 = r0
            r12 = r11
        L75:
            kotlin.Result$Companion r14 = kotlin.Result.INSTANCE
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r13 = kotlin.Result.m44946constructorimpl(r13)
        L7f:
            java.lang.Throwable r14 = kotlin.Result.m44949exceptionOrNullimpl(r13)
            boolean r14 = r14 instanceof com.unity3d.ads.core.data.model.exception.GatewayException
            if (r14 == 0) goto L8a
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L8a:
            com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r12 = r12.handleGatewayEventResponse
            kotlin.ResultKt.throwOnFailure(r13)
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
            r14 = 0
            r6.L$0 = r14
            r6.label = r10
            java.lang.Object r12 = r12.invoke(r13, r6)
            if (r12 != r9) goto L9d
        L9c:
            return r9
        L9d:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
