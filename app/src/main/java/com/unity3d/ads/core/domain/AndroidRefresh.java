package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.p299v1.AdDataRefreshResponseOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AndroidRefresh.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidRefresh;", "Lcom/unity3d/ads/core/domain/Refresh;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getAdDataRefreshRequest", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "opportunityId", "Lcom/google/protobuf/ByteString;", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidRefresh implements Refresh {
    private final CoroutineDispatcher defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 */
    /* JADX INFO: compiled from: AndroidRefresh.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidRefresh", m43504f = "AndroidRefresh.kt", m43505i = {}, m43506l = {25}, m43507m = "invoke", m43508n = {}, m43509s = {})
    static final class C145151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C145151(Continuation<? super C145151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRefresh.this.invoke(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$2 */
    /* JADX INFO: compiled from: AndroidRefresh.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", m43504f = "AndroidRefresh.kt", m43505i = {}, m43506l = {26, 28}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C145162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse>, Object> {
        final /* synthetic */ ByteString $adDataRefreshToken;
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145162(ByteString byteString, ByteString byteString2, Continuation<? super C145162> continuation) {
            super(2, continuation);
            this.$adDataRefreshToken = byteString;
            this.$opportunityId = byteString2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidRefresh.this.new C145162(this.$adDataRefreshToken, this.$opportunityId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> continuation) {
            return ((C145162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r12 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r12)
                goto L5b
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L37
            L1e:
                kotlin.ResultKt.throwOnFailure(r12)
                com.unity3d.ads.core.domain.AndroidRefresh r12 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.core.domain.GetAdDataRefreshRequest r12 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetAdDataRefreshRequest$p(r12)
                com.google.protobuf.ByteString r1 = r11.$adDataRefreshToken
                com.google.protobuf.ByteString r4 = r11.$opportunityId
                r5 = r11
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r11.label = r3
                java.lang.Object r12 = r12.invoke(r1, r4, r5)
                if (r12 != r0) goto L37
                goto L5a
            L37:
                r5 = r12
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r5 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r5
                com.unity3d.ads.core.domain.AndroidRefresh r12 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.core.domain.GetRequestPolicy r12 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetRequestPolicy$p(r12)
                com.unity3d.ads.gatewayclient.RequestPolicy r6 = r12.invoke()
                com.unity3d.ads.core.domain.AndroidRefresh r12 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.gatewayclient.GatewayClient r3 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGatewayClient$p(r12)
                com.unity3d.ads.core.data.model.OperationType r7 = com.unity3d.ads.core.data.model.OperationType.REFRESH
                r8 = r11
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r11.label = r2
                r4 = 0
                r9 = 1
                r10 = 0
                java.lang.Object r12 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L5b
            L5a:
                return r0
            L5b:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r12 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r12
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload r12 = r12.getPayload()
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r12 = r12.getAdDataRefreshResponse()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.C145162.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidRefresh(CoroutineDispatcher defaultDispatcher, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.Refresh
    public Object invoke(ByteString byteString, ByteString byteString2, Continuation<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> continuation) throws Throwable {
        C145151 c145151;
        if (continuation instanceof C145151) {
            c145151 = (C145151) continuation;
            if ((c145151.label & Integer.MIN_VALUE) != 0) {
                c145151.label -= Integer.MIN_VALUE;
            } else {
                c145151 = new C145151(continuation);
            }
        } else {
            c145151 = new C145151(continuation);
        }
        Object objWithContext = c145151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145151.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
            C145162 c145162 = new C145162(byteString2, byteString, null);
            c145151.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, c145162, c145151);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "override suspend fun inv…RefreshResponse\n        }");
        return objWithContext;
    }
}
