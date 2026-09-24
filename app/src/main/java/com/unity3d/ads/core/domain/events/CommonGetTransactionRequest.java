package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.p299v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.p299v1.TransactionEventRequestKt;
import gatewayprotocol.p299v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/events/CommonGetTransactionRequest;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionDataList", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "googlePlayBillingLibraryVersion", "", "transactionOrigin", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "(Ljava/util/List;Ljava/lang/String;Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 */
    /* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", m43504f = "CommonGetTransactionRequest.kt", m43505i = {0, 0, 0, 0, 0}, m43506l = {21}, m43507m = "invoke", m43508n = {"this", "transactionDataList", "googlePlayBillingLibraryVersion", "transactionOrigin", "$this$invoke_u24lambda_u240"}, m43509s = {"L$0", "L$1", "L$2", "L$3", "L$5"})
    static final class C145541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C145541(Continuation<? super C145541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetTransactionRequest.this.invoke(null, null, null, this);
        }
    }

    public CommonGetTransactionRequest(DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    public Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, Continuation<? super TransactionEventRequestOuterClass.TransactionEventRequest> continuation) throws Throwable {
        C145541 c145541;
        TransactionEventRequestKt.Dsl dsl_create;
        Object objStaticDeviceInfo;
        CommonGetTransactionRequest commonGetTransactionRequest;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        String str2;
        TransactionEventRequestKt.Dsl dsl;
        TransactionEventRequestKt.Dsl dsl2;
        if (continuation instanceof C145541) {
            c145541 = (C145541) continuation;
            if ((c145541.label & Integer.MIN_VALUE) != 0) {
                c145541.label -= Integer.MIN_VALUE;
            } else {
                c145541 = new C145541(continuation);
            }
        } else {
            c145541 = new C145541(continuation);
        }
        Object obj = c145541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145541.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.INSTANCE;
            TransactionEventRequestOuterClass.TransactionEventRequest.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            c145541.L$0 = this;
            c145541.L$1 = list;
            c145541.L$2 = str;
            c145541.L$3 = transactionOrigin;
            c145541.L$4 = dsl_create;
            c145541.L$5 = dsl_create;
            c145541.L$6 = dsl_create;
            c145541.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(c145541);
            if (objStaticDeviceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            commonGetTransactionRequest = this;
            list2 = list;
            str2 = str;
            dsl = dsl_create;
            dsl2 = dsl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl = (TransactionEventRequestKt.Dsl) c145541.L$6;
            dsl2 = (TransactionEventRequestKt.Dsl) c145541.L$5;
            TransactionEventRequestKt.Dsl dsl3 = (TransactionEventRequestKt.Dsl) c145541.L$4;
            TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin2 = (TransactionEventRequestOuterClass.TransactionOrigin) c145541.L$3;
            str2 = (String) c145541.L$2;
            list2 = (List) c145541.L$1;
            CommonGetTransactionRequest commonGetTransactionRequest2 = (CommonGetTransactionRequest) c145541.L$0;
            ResultKt.throwOnFailure(obj);
            dsl_create = dsl3;
            transactionOrigin = transactionOrigin2;
            commonGetTransactionRequest = commonGetTransactionRequest2;
            objStaticDeviceInfo = obj;
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl2.setDynamicDeviceInfo(commonGetTransactionRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl2.setGooglePlayBillingLibraryVersion(str2);
        dsl2.setOrigin(transactionOrigin);
        dsl2.addAllTransactionData(dsl2.getTransactionData(), list2);
        return dsl_create._build();
    }
}
