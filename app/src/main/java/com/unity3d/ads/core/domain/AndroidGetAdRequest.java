package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gatewayprotocol.p299v1.AdRequestKt;
import gatewayprotocol.p299v1.AdRequestOuterClass;
import gatewayprotocol.p299v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.p299v1.UniversalRequestKt;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: compiled from: AndroidGetAdRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "webViewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "tcfRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;Lcom/unity3d/ads/core/data/repository/TcfRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "impressionOpportunity", "Lcom/google/protobuf/ByteString;", "size", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "loadConfiguration", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1 */
    /* JADX INFO: compiled from: AndroidGetAdRequest.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", m43504f = "AndroidGetAdRequest.kt", m43505i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, m43506l = {35, 42, 65}, m43507m = "invoke", m43508n = {"this", "placement", "impressionOpportunity", "size", "loadConfiguration", "$this$invoke_u24lambda_u242", "this", "size", "loadConfiguration", "$this$invoke_u24lambda_u242"}, m43509s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$4"})
    static final class C144851 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C144851(Continuation<? super C144851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdRequest.this.invoke(null, null, null, null, this);
        }
    }

    public AndroidGetAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository, WebviewConfigurationDataSource webViewConfigurationDataSource, TcfRepository tcfRepository) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(webViewConfigurationDataSource, "webViewConfigurationDataSource");
        Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webViewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0118  */
    /* JADX WARN: Code duplicated, block: B:30:0x011e  */
    /* JADX WARN: Code duplicated, block: B:33:0x012e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    /* JADX WARN: Code duplicated, block: B:37:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    public Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation) throws Throwable {
        C144851 c144851;
        AdRequestKt.Dsl dsl_create;
        ByteString byteString2;
        AdRequestOuterClass.BannerSize bannerSize2;
        LoadConfigurationInternal loadConfigurationInternal2;
        AndroidGetAdRequest androidGetAdRequest;
        AdRequestKt.Dsl dsl;
        String str2;
        AdRequestKt.Dsl dsl2;
        AdRequestKt.Dsl dsl3;
        final AdRequestKt.Dsl dsl4;
        LoadConfigurationInternal loadConfigurationInternal3;
        AdRequestKt.Dsl dsl5;
        AndroidGetAdRequest androidGetAdRequest2;
        String tcfString;
        Object objInvoke;
        String mediationAdUnitId;
        if (continuation instanceof C144851) {
            c144851 = (C144851) continuation;
            if ((c144851.label & Integer.MIN_VALUE) != 0) {
                c144851.label -= Integer.MIN_VALUE;
            } else {
                c144851 = new C144851(continuation);
            }
        } else {
            c144851 = new C144851(continuation);
        }
        Object objStaticDeviceInfo = c144851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c144851.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objStaticDeviceInfo);
            AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
            AdRequestOuterClass.AdRequest.Builder builderNewBuilder = AdRequestOuterClass.AdRequest.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            c144851.L$0 = this;
            c144851.L$1 = str;
            byteString2 = byteString;
            c144851.L$2 = byteString2;
            bannerSize2 = bannerSize;
            c144851.L$3 = bannerSize2;
            loadConfigurationInternal2 = loadConfigurationInternal;
            c144851.L$4 = loadConfigurationInternal2;
            c144851.L$5 = dsl_create;
            c144851.L$6 = dsl_create;
            c144851.L$7 = dsl_create;
            c144851.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(c144851);
            if (objStaticDeviceInfo != coroutine_suspended) {
                androidGetAdRequest = this;
                dsl = dsl_create;
                str2 = str;
                dsl2 = dsl;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            dsl_create = (AdRequestKt.Dsl) c144851.L$7;
            AdRequestKt.Dsl dsl6 = (AdRequestKt.Dsl) c144851.L$6;
            AdRequestKt.Dsl dsl7 = (AdRequestKt.Dsl) c144851.L$5;
            loadConfigurationInternal2 = (LoadConfigurationInternal) c144851.L$4;
            AdRequestOuterClass.BannerSize bannerSize3 = (AdRequestOuterClass.BannerSize) c144851.L$3;
            ByteString byteString3 = (ByteString) c144851.L$2;
            str2 = (String) c144851.L$1;
            AndroidGetAdRequest androidGetAdRequest3 = (AndroidGetAdRequest) c144851.L$0;
            ResultKt.throwOnFailure(objStaticDeviceInfo);
            androidGetAdRequest = androidGetAdRequest3;
            dsl2 = dsl6;
            byteString2 = byteString3;
            dsl = dsl7;
            bannerSize2 = bannerSize3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStaticDeviceInfo);
                return objStaticDeviceInfo;
            }
            dsl3 = (AdRequestKt.Dsl) c144851.L$5;
            dsl4 = (AdRequestKt.Dsl) c144851.L$4;
            dsl5 = (AdRequestKt.Dsl) c144851.L$3;
            loadConfigurationInternal3 = (LoadConfigurationInternal) c144851.L$2;
            bannerSize2 = (AdRequestOuterClass.BannerSize) c144851.L$1;
            androidGetAdRequest2 = (AndroidGetAdRequest) c144851.L$0;
            ResultKt.throwOnFailure(objStaticDeviceInfo);
        }
        dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
        dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
        if (bannerSize2 == null) {
            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
        } else {
            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
            dsl4.setBannerSize(bannerSize2);
        }
        tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl4.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        if (loadConfigurationInternal3 != null) {
            mediationAdUnitId = loadConfigurationInternal3.getMediationAdUnitId();
            if (mediationAdUnitId != null) {
                new MutablePropertyReference0Impl(dsl4) { // from class: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$request$1$2$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((AdRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                    public void set(Object obj) {
                        ((AdRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj);
                    }
                }.set(mediationAdUnitId);
            }
            dsl4.putAllExtras(dsl4.getExtrasMap(), loadConfigurationInternal3.getExtras());
        }
        AdRequestOuterClass.AdRequest adRequest_build = dsl5._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setAdRequest(adRequest_build);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdRequest2.getUniversalRequestForPayLoad;
        c144851.L$0 = null;
        c144851.L$1 = null;
        c144851.L$2 = null;
        c144851.L$3 = null;
        c144851.L$4 = null;
        c144851.L$5 = null;
        c144851.label = 3;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, c144851);
        if (objInvoke != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objInvoke;
        dsl_create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl2.setDynamicDeviceInfo(androidGetAdRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString2);
        dsl2.setPlacementId(str2);
        dsl2.setRequestImpressionConfiguration(true);
        WebviewConfigurationDataSource webviewConfigurationDataSource = androidGetAdRequest.webViewConfigurationDataSource;
        c144851.L$0 = androidGetAdRequest;
        c144851.L$1 = bannerSize2;
        c144851.L$2 = loadConfigurationInternal2;
        c144851.L$3 = dsl;
        c144851.L$4 = dsl2;
        c144851.L$5 = dsl2;
        c144851.L$6 = null;
        c144851.L$7 = null;
        c144851.label = 2;
        objStaticDeviceInfo = webviewConfigurationDataSource.get(c144851);
        if (objStaticDeviceInfo != coroutine_suspended) {
            dsl3 = dsl2;
            dsl4 = dsl3;
            loadConfigurationInternal3 = loadConfigurationInternal2;
            dsl5 = dsl;
            androidGetAdRequest2 = androidGetAdRequest;
            dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
            dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
            if (bannerSize2 == null) {
                dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
            } else {
                dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                dsl4.setBannerSize(bannerSize2);
            }
            tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
            if (tcfString != null) {
                dsl4.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
            }
            if (loadConfigurationInternal3 != null) {
                mediationAdUnitId = loadConfigurationInternal3.getMediationAdUnitId();
                if (mediationAdUnitId != null) {
                    new MutablePropertyReference0Impl(dsl4) { // from class: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$request$1$2$2
                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                        public Object get() {
                            return ((AdRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                        public void set(Object obj) {
                            ((AdRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj);
                        }
                    }.set(mediationAdUnitId);
                }
                dsl4.putAllExtras(dsl4.getExtrasMap(), loadConfigurationInternal3.getExtras());
            }
            AdRequestOuterClass.AdRequest adRequest_build2 = dsl5._build();
            UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
            UniversalRequestKt.PayloadKt.Dsl.Companion companion3 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder3 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
            UniversalRequestKt.PayloadKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
            dsl_create3.setAdRequest(adRequest_build2);
            UniversalRequestOuterClass.UniversalRequest.Payload payload_build2 = dsl_create3._build();
            GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetAdRequest2.getUniversalRequestForPayLoad;
            c144851.L$0 = null;
            c144851.L$1 = null;
            c144851.L$2 = null;
            c144851.L$3 = null;
            c144851.L$4 = null;
            c144851.L$5 = null;
            c144851.label = 3;
            objInvoke = getUniversalRequestForPayLoad2.invoke(payload_build2, c144851);
            if (objInvoke != coroutine_suspended) {
                return objInvoke;
            }
        }
        return coroutine_suspended;
    }
}
