package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.p299v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.p299v1.UniversalRequestKt;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import gatewayprotocol.p299v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HandleAndroidGetTokenRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/scar/HandleAndroidGetTokenRequest;", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getHbTokenEventRequest", "Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "tokenId", "Lcom/google/protobuf/ByteString;", "biddingSignals", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class HandleAndroidGetTokenRequest implements HandleGetTokenRequest {
    private final GatewayClient gatewayClient;
    private final GetHbTokenEventRequest getHbTokenEventRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 */
    /* JADX INFO: compiled from: HandleAndroidGetTokenRequest.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest", m43504f = "HandleAndroidGetTokenRequest.kt", m43505i = {0, 1}, m43506l = {20, 24, 26}, m43507m = "invoke", m43508n = {"this", "this"}, m43509s = {"L$0", "L$0"})
    static final class C146201 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C146201(Continuation<? super C146201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HandleAndroidGetTokenRequest.this.invoke(null, null, this);
        }
    }

    public HandleAndroidGetTokenRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetHbTokenEventRequest getHbTokenEventRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(getHbTokenEventRequest, "getHbTokenEventRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getHbTokenEventRequest = getHbTokenEventRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, Continuation<? super UniversalResponseOuterClass.UniversalResponse> continuation) throws Throwable {
        C146201 c146201;
        HandleAndroidGetTokenRequest handleAndroidGetTokenRequest;
        Object objRequest$default;
        if (continuation instanceof C146201) {
            c146201 = (C146201) continuation;
            if ((c146201.label & Integer.MIN_VALUE) != 0) {
                c146201.label -= Integer.MIN_VALUE;
            } else {
                c146201 = new C146201(continuation);
            }
        } else {
            c146201 = new C146201(continuation);
        }
        C146201 c146202 = c146201;
        Object objInvoke = c146202.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c146202.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            GetHbTokenEventRequest getHbTokenEventRequest = this.getHbTokenEventRequest;
            c146202.L$0 = this;
            c146202.label = 1;
            objInvoke = getHbTokenEventRequest.invoke(byteString, biddingSignals, c146202);
            if (objInvoke != coroutine_suspended) {
                handleAndroidGetTokenRequest = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            handleAndroidGetTokenRequest = (HandleAndroidGetTokenRequest) c146202.L$0;
            ResultKt.throwOnFailure(objInvoke);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
                return objInvoke;
            }
            handleAndroidGetTokenRequest = (HandleAndroidGetTokenRequest) c146202.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        RequestPolicy requestPolicyInvoke = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
        GatewayClient gatewayClient = handleAndroidGetTokenRequest.gatewayClient;
        OperationType operationType = OperationType.GET_TOKEN;
        c146202.L$0 = null;
        c146202.label = 3;
        objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke, operationType, c146202, 1, null);
        if (objRequest$default != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objRequest$default;
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setGetTokenEventRequest((GetTokenEventRequestOuterClass.GetTokenEventRequest) objInvoke);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = handleAndroidGetTokenRequest.getUniversalRequestForPayLoad;
        c146202.L$0 = handleAndroidGetTokenRequest;
        c146202.label = 2;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, c146202);
        if (objInvoke != coroutine_suspended) {
            RequestPolicy requestPolicyInvoke2 = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
            GatewayClient gatewayClient2 = handleAndroidGetTokenRequest.gatewayClient;
            OperationType operationType2 = OperationType.GET_TOKEN;
            c146202.L$0 = null;
            c146202.label = 3;
            objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke2, operationType2, c146202, 1, null);
            if (objRequest$default != coroutine_suspended) {
                return objRequest$default;
            }
        }
        return coroutine_suspended;
    }
}
