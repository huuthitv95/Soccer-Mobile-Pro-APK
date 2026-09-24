package com.unity3d.ads.core.domain;

import gatewayprotocol.p299v1.InitializationDataKt;
import gatewayprotocol.p299v1.InitializationDataOuterClass;
import gatewayprotocol.p299v1.InitializationRequestOuterClass;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidGetInitializationData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationData;", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "getInitializeRequestPayload", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getUniversalRequestSharedData", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "(Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;)V", "invoke", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetInitializationData implements GetInitializationData {
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1 */
    /* JADX INFO: compiled from: AndroidGetInitializationData.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidGetInitializationData", m43504f = "AndroidGetInitializationData.kt", m43505i = {0, 0}, m43506l = {10, 11}, m43507m = "invoke", m43508n = {"this", "$this$invoke_u24lambda_u240"}, m43509s = {"L$0", "L$2"})
    static final class C144881 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C144881(Continuation<? super C144881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationData.this.invoke(this);
        }
    }

    public AndroidGetInitializationData(GetInitializationRequestPayload getInitializeRequestPayload, GetUniversalRequestSharedData getUniversalRequestSharedData) {
        Intrinsics.checkNotNullParameter(getInitializeRequestPayload, "getInitializeRequestPayload");
        Intrinsics.checkNotNullParameter(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getInitializeRequestPayload = getInitializeRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    public Object invoke(Continuation<? super InitializationDataOuterClass.InitializationData> continuation) throws Throwable {
        C144881 c144881;
        InitializationDataKt.Dsl dsl_create;
        AndroidGetInitializationData androidGetInitializationData;
        InitializationDataKt.Dsl dsl;
        InitializationDataKt.Dsl dsl2;
        InitializationDataKt.Dsl dsl3;
        InitializationDataKt.Dsl dsl4;
        if (continuation instanceof C144881) {
            c144881 = (C144881) continuation;
            if ((c144881.label & Integer.MIN_VALUE) != 0) {
                c144881.label -= Integer.MIN_VALUE;
            } else {
                c144881 = new C144881(continuation);
            }
        } else {
            c144881 = new C144881(continuation);
        }
        Object objInvoke = c144881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c144881.label;
        if (i != 0) {
            if (i == 1) {
                InitializationDataKt.Dsl dsl5 = (InitializationDataKt.Dsl) c144881.L$3;
                dsl = (InitializationDataKt.Dsl) c144881.L$2;
                InitializationDataKt.Dsl dsl6 = (InitializationDataKt.Dsl) c144881.L$1;
                androidGetInitializationData = (AndroidGetInitializationData) c144881.L$0;
                ResultKt.throwOnFailure(objInvoke);
                dsl2 = dsl5;
                dsl_create = dsl6;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl4 = (InitializationDataKt.Dsl) c144881.L$1;
                dsl3 = (InitializationDataKt.Dsl) c144881.L$0;
                ResultKt.throwOnFailure(objInvoke);
            }
            dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
            return dsl3._build();
        }
        ResultKt.throwOnFailure(objInvoke);
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.INSTANCE;
        InitializationDataOuterClass.InitializationData.Builder builderNewBuilder = InitializationDataOuterClass.InitializationData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializeRequestPayload;
        c144881.L$0 = this;
        c144881.L$1 = dsl_create;
        c144881.L$2 = dsl_create;
        c144881.L$3 = dsl_create;
        c144881.label = 1;
        objInvoke = getInitializationRequestPayload.invoke(c144881);
        if (objInvoke != coroutine_suspended) {
            androidGetInitializationData = this;
            dsl = dsl_create;
            dsl2 = dsl;
        }
        return coroutine_suspended;
        dsl2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) objInvoke);
        GetUniversalRequestSharedData getUniversalRequestSharedData = androidGetInitializationData.getUniversalRequestSharedData;
        c144881.L$0 = dsl_create;
        c144881.L$1 = dsl;
        c144881.L$2 = null;
        c144881.L$3 = null;
        c144881.label = 2;
        objInvoke = getUniversalRequestSharedData.invoke(c144881);
        if (objInvoke != coroutine_suspended) {
            dsl3 = dsl_create;
            dsl4 = dsl;
            dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
            return dsl3._build();
        }
        return coroutine_suspended;
    }
}
