package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import gatewayprotocol.p299v1.AdFormatOuterClass;
import gatewayprotocol.p299v1.OperativeEventRequestKt;
import gatewayprotocol.p299v1.OperativeEventRequestOuterClass;
import gatewayprotocol.p299v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GetOperativeEventRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJE\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "", "generateByteStringId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "invoke", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventType", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "loadTrackingToken", "Lcom/google/protobuf/ByteString;", "opportunityId", "additionalEventData", "playerServerId", "", "adFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 */
    /* JADX INFO: compiled from: GetOperativeEventRequest.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.events.GetOperativeEventRequest", m43504f = "GetOperativeEventRequest.kt", m43505i = {0, 0, 0}, m43506l = {37}, m43507m = "invoke", m43508n = {"this", "adFormat", "$this$invoke_u24lambda_u242"}, m43509s = {"L$0", "L$1", "L$3"})
    static final class C145591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C145591(Continuation<? super C145591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetOperativeEventRequest.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public GetOperativeEventRequest(GetByteStringId generateByteStringId, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository) {
        Intrinsics.checkNotNullParameter(generateByteStringId, "generateByteStringId");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.generateByteStringId = generateByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, Continuation<? super OperativeEventRequestOuterClass.OperativeEventRequest> continuation) {
        C145591 c145591;
        GetOperativeEventRequest getOperativeEventRequest;
        OperativeEventRequestKt.Dsl dsl;
        OperativeEventRequestKt.Dsl dsl2;
        OperativeEventRequestKt.Dsl dsl3;
        if (continuation instanceof C145591) {
            c145591 = (C145591) continuation;
            if ((c145591.label & Integer.MIN_VALUE) != 0) {
                c145591.label -= Integer.MIN_VALUE;
            } else {
                c145591 = new C145591(continuation);
            }
        } else {
            c145591 = new C145591(continuation);
        }
        Object obj = c145591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145591.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.INSTANCE;
            OperativeEventRequestOuterClass.OperativeEventRequest.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            OperativeEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            dsl_create.setEventId(this.generateByteStringId.invoke());
            dsl_create.setEventType(operativeEventType);
            dsl_create.setImpressionOpportunityId(byteString2);
            dsl_create.setTrackingToken(byteString);
            dsl_create.setAdditionalData(byteString3);
            if (str != null) {
                dsl_create.setSid(str);
            }
            dsl_create.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            c145591.L$0 = this;
            c145591.L$1 = adFormat;
            c145591.L$2 = dsl_create;
            c145591.L$3 = dsl_create;
            c145591.L$4 = dsl_create;
            c145591.label = 1;
            Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(c145591);
            if (objStaticDeviceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            getOperativeEventRequest = this;
            dsl = dsl_create;
            dsl2 = dsl;
            obj = objStaticDeviceInfo;
            dsl3 = dsl2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl3 = (OperativeEventRequestKt.Dsl) c145591.L$4;
            dsl = (OperativeEventRequestKt.Dsl) c145591.L$3;
            dsl2 = (OperativeEventRequestKt.Dsl) c145591.L$2;
            adFormat = (AdFormatOuterClass.AdFormat) c145591.L$1;
            getOperativeEventRequest = (GetOperativeEventRequest) c145591.L$0;
            ResultKt.throwOnFailure(obj);
        }
        dsl3.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl.setSessionCounters(getOperativeEventRequest.sessionRepository.getSessionCounters());
        dsl.setCampaignState(getOperativeEventRequest.campaignRepository.getCampaignState());
        if (adFormat != null) {
            dsl.setAdFormat(adFormat);
        }
        return dsl2._build();
    }
}
