package com.unity3d.ads.core.domain;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.BannerSize;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.p299v1.AdRequestOuterClass;
import gatewayprotocol.p299v1.BannerSizeKt;
import gatewayprotocol.p299v1.ClientInfoOuterClass;
import gatewayprotocol.p299v1.HeaderBiddingTokenKt;
import gatewayprotocol.p299v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.p299v1.InitializationDataOuterClass;
import gatewayprotocol.p299v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.p299v1.TestDataOuterClass;
import gatewayprotocol.p299v1.TokenCountersKt;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidBuildHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ+\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010#R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidBuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "generateId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "getInitializationData", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "tcfRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "testDataInfo", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "mediationInfoConverter", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/domain/GetInitializationData;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/repository/TcfRepository;Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/MediationInfoConverter;)V", "invoke", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "scarSignalsCollected", "", "(ILcom/unity3d/ads/TokenConfiguration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final MediationInfoConverter mediationInfoConverter;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1 */
    /* JADX INFO: compiled from: AndroidBuildHeaderBiddingToken.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", m43504f = "AndroidBuildHeaderBiddingToken.kt", m43505i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, m43506l = {45, 67, TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m43507m = "invoke", m43508n = {"this", "tokenConfiguration", "currentTokenCounters", "sToken", "$this$invoke_u24lambda_u249", "scarSignalsCollected", "this", "currentTokenCounters", "sToken", "$this$invoke_u24lambda_u249", "this", "currentTokenCounters", "$this$invoke_u24lambda_u249", "this", "currentTokenCounters", "$this$invoke_u24lambda_u249", "this", "currentTokenCounters", "$this$invoke_u24lambda_u249"}, m43509s = {"L$0", "L$1", "L$2", "L$3", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    static final class C144801 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C144801(Continuation<? super C144801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidBuildHeaderBiddingToken.this.invoke(0, null, false, this);
        }
    }

    public AndroidBuildHeaderBiddingToken(GetByteStringId generateId, GetClientInfo getClientInfo, GetSharedDataTimestamps getTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo testDataInfo, OfferwallManager offerwallManager, MediationInfoConverter mediationInfoConverter) {
        Intrinsics.checkNotNullParameter(generateId, "generateId");
        Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        Intrinsics.checkNotNullParameter(getTimestamps, "getTimestamps");
        Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        Intrinsics.checkNotNullParameter(getInitializationData, "getInitializationData");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        Intrinsics.checkNotNullParameter(testDataInfo, "testDataInfo");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(mediationInfoConverter, "mediationInfoConverter");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = testDataInfo;
        this.offerwallManager = offerwallManager;
        this.mediationInfoConverter = mediationInfoConverter;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x022b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0243  */
    /* JADX WARN: Code duplicated, block: B:67:0x0263  */
    /* JADX WARN: Code duplicated, block: B:69:0x0271  */
    /* JADX WARN: Code duplicated, block: B:72:0x028b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    public Object invoke(int i, TokenConfiguration tokenConfiguration, boolean z, Continuation<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> continuation) throws Throwable {
        C144801 c144801;
        TokenCounters tokenCounters;
        HeaderBiddingTokenKt.Dsl dsl_create;
        boolean z2;
        ByteString byteString;
        HeaderBiddingTokenKt.Dsl dsl;
        HeaderBiddingTokenKt.Dsl dsl2;
        TokenConfiguration tokenConfiguration2;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken;
        HeaderBiddingTokenKt.Dsl dsl3;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken2;
        ByteString byteString2;
        String gameId;
        HeaderBiddingTokenKt.Dsl dsl4;
        HeaderBiddingTokenKt.Dsl dsl5;
        HeaderBiddingTokenKt.Dsl dsl6;
        TokenCounters tokenCounters2;
        HeaderBiddingTokenKt.Dsl dsl7;
        HeaderBiddingTokenKt.Dsl dsl8;
        HeaderBiddingTokenKt.Dsl dsl9;
        HeaderBiddingTokenKt.Dsl dsl10;
        TokenCounters tokenCounters3;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken3;
        TestDataOuterClass.TestData testDataInvoke;
        if (continuation instanceof C144801) {
            c144801 = (C144801) continuation;
            if ((c144801.label & Integer.MIN_VALUE) != 0) {
                c144801.label -= Integer.MIN_VALUE;
            } else {
                c144801 = new C144801(continuation);
            }
        } else {
            c144801 = new C144801(continuation);
        }
        Object objIsConnected = c144801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c144801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsConnected);
            tokenCounters = this.sessionRepository.getTokenCounters();
            ByteString sessionToken = this.sessionRepository.getSessionToken();
            this.sessionRepository.incrementTokenSequenceNumber();
            HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
            HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            dsl_create.setTokenId(this.generateId.invoke());
            dsl_create.setTokenNumber(i);
            GetClientInfo getClientInfo = this.getClientInfo;
            c144801.L$0 = this;
            c144801.L$1 = tokenConfiguration;
            c144801.L$2 = tokenCounters;
            c144801.L$3 = sessionToken;
            c144801.L$4 = dsl_create;
            c144801.L$5 = dsl_create;
            c144801.L$6 = dsl_create;
            z2 = z;
            c144801.Z$0 = z2;
            c144801.label = 1;
            Object objInvoke = getClientInfo.invoke(c144801);
            if (objInvoke != coroutine_suspended) {
                byteString = sessionToken;
                dsl = dsl_create;
                dsl2 = dsl;
                objIsConnected = objInvoke;
                tokenConfiguration2 = tokenConfiguration;
                androidBuildHeaderBiddingToken = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            boolean z3 = c144801.Z$0;
            dsl = (HeaderBiddingTokenKt.Dsl) c144801.L$6;
            HeaderBiddingTokenKt.Dsl dsl11 = (HeaderBiddingTokenKt.Dsl) c144801.L$5;
            dsl2 = (HeaderBiddingTokenKt.Dsl) c144801.L$4;
            byteString = (ByteString) c144801.L$3;
            tokenCounters = (TokenCounters) c144801.L$2;
            tokenConfiguration2 = (TokenConfiguration) c144801.L$1;
            androidBuildHeaderBiddingToken = (AndroidBuildHeaderBiddingToken) c144801.L$0;
            ResultKt.throwOnFailure(objIsConnected);
            z2 = z3;
            dsl_create = dsl11;
        } else {
            if (i2 == 2) {
                dsl_create = (HeaderBiddingTokenKt.Dsl) c144801.L$5;
                dsl3 = (HeaderBiddingTokenKt.Dsl) c144801.L$4;
                HeaderBiddingTokenKt.Dsl dsl12 = (HeaderBiddingTokenKt.Dsl) c144801.L$3;
                byteString2 = (ByteString) c144801.L$2;
                TokenCounters tokenCounters4 = (TokenCounters) c144801.L$1;
                AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken4 = (AndroidBuildHeaderBiddingToken) c144801.L$0;
                ResultKt.throwOnFailure(objIsConnected);
                tokenCounters = tokenCounters4;
                dsl2 = dsl12;
                androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken4;
                dsl_create.setOfferwallEnabled(((Boolean) objIsConnected).booleanValue());
                if (byteString2.isEmpty()) {
                    gameId = androidBuildHeaderBiddingToken2.sessionRepository.getGameId();
                    if (gameId != null || gameId.length() <= 0) {
                        GetLimitedSessionToken getLimitedSessionToken = androidBuildHeaderBiddingToken2.getLimitedSessionToken;
                        c144801.L$0 = androidBuildHeaderBiddingToken2;
                        c144801.L$1 = tokenCounters;
                        c144801.L$2 = dsl2;
                        c144801.L$3 = dsl3;
                        c144801.L$4 = dsl3;
                        c144801.L$5 = null;
                        c144801.label = 4;
                        objIsConnected = getLimitedSessionToken.invoke(c144801);
                        if (objIsConnected != coroutine_suspended) {
                            dsl4 = dsl3;
                            dsl5 = dsl4;
                            dsl6 = dsl2;
                            tokenCounters2 = tokenCounters;
                            dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                            dsl8 = dsl6;
                            DeviceInfoRepository deviceInfoRepository = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                            c144801.L$0 = androidBuildHeaderBiddingToken2;
                            c144801.L$1 = tokenCounters2;
                            c144801.L$2 = dsl8;
                            c144801.L$3 = dsl5;
                            c144801.L$4 = dsl5;
                            c144801.label = 5;
                            objIsConnected = deviceInfoRepository.staticDeviceInfo(c144801);
                            if (objIsConnected != coroutine_suspended) {
                                dsl9 = dsl5;
                                dsl10 = dsl9;
                                tokenCounters3 = tokenCounters2;
                                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                            }
                        }
                    } else {
                        GetInitializationData getInitializationData = androidBuildHeaderBiddingToken2.getInitializationData;
                        c144801.L$0 = androidBuildHeaderBiddingToken2;
                        c144801.L$1 = tokenCounters;
                        c144801.L$2 = dsl2;
                        c144801.L$3 = dsl3;
                        c144801.L$4 = dsl3;
                        c144801.L$5 = null;
                        c144801.label = 3;
                        objIsConnected = getInitializationData.invoke(c144801);
                        if (objIsConnected != coroutine_suspended) {
                            dsl7 = dsl3;
                            dsl5 = dsl7;
                            dsl6 = dsl2;
                            tokenCounters2 = tokenCounters;
                            dsl7.setInitializationData((InitializationDataOuterClass.InitializationData) objIsConnected);
                            dsl8 = dsl6;
                            DeviceInfoRepository deviceInfoRepository2 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                            c144801.L$0 = androidBuildHeaderBiddingToken2;
                            c144801.L$1 = tokenCounters2;
                            c144801.L$2 = dsl8;
                            c144801.L$3 = dsl5;
                            c144801.L$4 = dsl5;
                            c144801.label = 5;
                            objIsConnected = deviceInfoRepository2.staticDeviceInfo(c144801);
                            if (objIsConnected != coroutine_suspended) {
                                dsl9 = dsl5;
                                dsl10 = dsl9;
                                tokenCounters3 = tokenCounters2;
                                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                dsl3.setSessionToken(androidBuildHeaderBiddingToken2.sessionRepository.getSessionToken());
                dsl3.setStaticDeviceInfo(androidBuildHeaderBiddingToken2.deviceInfoRepository.cachedStaticDeviceInfo());
                testDataInvoke = androidBuildHeaderBiddingToken2.testDataInfo.invoke();
                if (testDataInvoke != null) {
                    dsl3.setTestData(testDataInvoke);
                }
                TokenCountersKt.Dsl.Companion companion2 = TokenCountersKt.Dsl.INSTANCE;
                HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder2 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
                TokenCountersKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
                dsl_create2.setSeq(tokenCounters.getSeq());
                dsl_create2.setWins(tokenCounters.getWins());
                dsl_create2.setStarts(tokenCounters.getStarts());
                dsl3.setTokenCounters(dsl_create2._build());
                return dsl2._build();
            }
            if (i2 == 3) {
                dsl7 = (HeaderBiddingTokenKt.Dsl) c144801.L$4;
                dsl5 = (HeaderBiddingTokenKt.Dsl) c144801.L$3;
                dsl6 = (HeaderBiddingTokenKt.Dsl) c144801.L$2;
                tokenCounters2 = (TokenCounters) c144801.L$1;
                androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken) c144801.L$0;
                ResultKt.throwOnFailure(objIsConnected);
                dsl7.setInitializationData((InitializationDataOuterClass.InitializationData) objIsConnected);
                dsl8 = dsl6;
                DeviceInfoRepository deviceInfoRepository3 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                c144801.L$0 = androidBuildHeaderBiddingToken2;
                c144801.L$1 = tokenCounters2;
                c144801.L$2 = dsl8;
                c144801.L$3 = dsl5;
                c144801.L$4 = dsl5;
                c144801.label = 5;
                objIsConnected = deviceInfoRepository3.staticDeviceInfo(c144801);
                if (objIsConnected != coroutine_suspended) {
                    dsl9 = dsl5;
                    dsl10 = dsl9;
                    tokenCounters3 = tokenCounters2;
                    androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                }
                return coroutine_suspended;
            }
            if (i2 == 4) {
                dsl4 = (HeaderBiddingTokenKt.Dsl) c144801.L$4;
                dsl5 = (HeaderBiddingTokenKt.Dsl) c144801.L$3;
                dsl6 = (HeaderBiddingTokenKt.Dsl) c144801.L$2;
                tokenCounters2 = (TokenCounters) c144801.L$1;
                androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken) c144801.L$0;
                ResultKt.throwOnFailure(objIsConnected);
                dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                dsl8 = dsl6;
                DeviceInfoRepository deviceInfoRepository4 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                c144801.L$0 = androidBuildHeaderBiddingToken2;
                c144801.L$1 = tokenCounters2;
                c144801.L$2 = dsl8;
                c144801.L$3 = dsl5;
                c144801.L$4 = dsl5;
                c144801.label = 5;
                objIsConnected = deviceInfoRepository4.staticDeviceInfo(c144801);
                if (objIsConnected != coroutine_suspended) {
                    dsl9 = dsl5;
                    dsl10 = dsl9;
                    tokenCounters3 = tokenCounters2;
                    androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                }
                return coroutine_suspended;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl9 = (HeaderBiddingTokenKt.Dsl) c144801.L$4;
            dsl10 = (HeaderBiddingTokenKt.Dsl) c144801.L$3;
            dsl8 = (HeaderBiddingTokenKt.Dsl) c144801.L$2;
            tokenCounters3 = (TokenCounters) c144801.L$1;
            androidBuildHeaderBiddingToken3 = (AndroidBuildHeaderBiddingToken) c144801.L$0;
            ResultKt.throwOnFailure(objIsConnected);
        }
        dsl9.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
        androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken3;
        dsl3 = dsl10;
        dsl2 = dsl8;
        tokenCounters = tokenCounters3;
        testDataInvoke = androidBuildHeaderBiddingToken2.testDataInfo.invoke();
        if (testDataInvoke != null) {
            dsl3.setTestData(testDataInvoke);
        }
        TokenCountersKt.Dsl.Companion companion3 = TokenCountersKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder3 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
        TokenCountersKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setSeq(tokenCounters.getSeq());
        dsl_create3.setWins(tokenCounters.getWins());
        dsl_create3.setStarts(tokenCounters.getStarts());
        dsl3.setTokenCounters(dsl_create3._build());
        return dsl2._build();
        dsl.setClientInfo((ClientInfoOuterClass.ClientInfo) objIsConnected);
        dsl_create.setTimestamps(androidBuildHeaderBiddingToken.getTimestamps.invoke());
        if (tokenConfiguration2 != null) {
            dsl_create.setAdFormat(AdFormatExtensions.toProtoAdFormat(tokenConfiguration2.getAdFormat()));
            dsl_create.putAllExtras(dsl_create.getExtrasMap(), tokenConfiguration2.getExtras());
            MediationInfo mediationInfo = tokenConfiguration2.get_mediationInfo();
            if (mediationInfo != null) {
                dsl_create.setMediationInfo(androidBuildHeaderBiddingToken.mediationInfoConverter.invoke(mediationInfo));
            }
            String str = tokenConfiguration2.get_placementId();
            if (str != null) {
                dsl_create.setPlacementId(str);
            }
            String str2 = tokenConfiguration2.get_mediationAdUnitId();
            if (str2 != null) {
                dsl_create.setMediationAdUnitId(str2);
            }
            BannerSize bannerSize = tokenConfiguration2.get_bannerSize();
            if (bannerSize != null) {
                BannerSizeKt.Dsl.Companion companion4 = BannerSizeKt.Dsl.INSTANCE;
                AdRequestOuterClass.BannerSize.Builder builderNewBuilder4 = AdRequestOuterClass.BannerSize.newBuilder();
                Intrinsics.checkNotNullExpressionValue(builderNewBuilder4, "newBuilder()");
                BannerSizeKt.Dsl dsl_create4 = companion4._create(builderNewBuilder4);
                dsl_create4.setWidth(bannerSize.getWidth());
                dsl_create4.setHeight(bannerSize.getHeight());
                dsl_create.setBannerSize(dsl_create4._build());
            }
        }
        dsl_create.setSessionCounters(androidBuildHeaderBiddingToken.sessionRepository.getSessionCounters());
        dsl_create.setDynamicDeviceInfo(androidBuildHeaderBiddingToken.deviceInfoRepository.getDynamicDeviceInfo());
        dsl_create.setPii(androidBuildHeaderBiddingToken.deviceInfoRepository.getPiiData());
        dsl_create.setCampaignState(androidBuildHeaderBiddingToken.campaignRepository.getCampaignState());
        String tcfString = androidBuildHeaderBiddingToken.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl_create.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        dsl_create.setScarSignalsCollected(z2);
        OfferwallManager offerwallManager = androidBuildHeaderBiddingToken.offerwallManager;
        c144801.L$0 = androidBuildHeaderBiddingToken;
        c144801.L$1 = tokenCounters;
        c144801.L$2 = byteString;
        c144801.L$3 = dsl2;
        c144801.L$4 = dsl_create;
        c144801.L$5 = dsl_create;
        c144801.L$6 = null;
        c144801.label = 2;
        objIsConnected = offerwallManager.isConnected(c144801);
        if (objIsConnected != coroutine_suspended) {
            dsl3 = dsl_create;
            androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
            byteString2 = byteString;
            dsl_create.setOfferwallEnabled(((Boolean) objIsConnected).booleanValue());
            if (byteString2.isEmpty()) {
                gameId = androidBuildHeaderBiddingToken2.sessionRepository.getGameId();
                if (gameId != null) {
                    GetLimitedSessionToken getLimitedSessionToken2 = androidBuildHeaderBiddingToken2.getLimitedSessionToken;
                    c144801.L$0 = androidBuildHeaderBiddingToken2;
                    c144801.L$1 = tokenCounters;
                    c144801.L$2 = dsl2;
                    c144801.L$3 = dsl3;
                    c144801.L$4 = dsl3;
                    c144801.L$5 = null;
                    c144801.label = 4;
                    objIsConnected = getLimitedSessionToken2.invoke(c144801);
                    if (objIsConnected != coroutine_suspended) {
                        dsl4 = dsl3;
                        dsl5 = dsl4;
                        dsl6 = dsl2;
                        tokenCounters2 = tokenCounters;
                        dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                        dsl8 = dsl6;
                        DeviceInfoRepository deviceInfoRepository5 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                        c144801.L$0 = androidBuildHeaderBiddingToken2;
                        c144801.L$1 = tokenCounters2;
                        c144801.L$2 = dsl8;
                        c144801.L$3 = dsl5;
                        c144801.L$4 = dsl5;
                        c144801.label = 5;
                        objIsConnected = deviceInfoRepository5.staticDeviceInfo(c144801);
                        if (objIsConnected != coroutine_suspended) {
                            dsl9 = dsl5;
                            dsl10 = dsl9;
                            tokenCounters3 = tokenCounters2;
                            androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                            dsl9.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
                            androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken3;
                            dsl3 = dsl10;
                            dsl2 = dsl8;
                            tokenCounters = tokenCounters3;
                        }
                    }
                } else {
                    GetLimitedSessionToken getLimitedSessionToken3 = androidBuildHeaderBiddingToken2.getLimitedSessionToken;
                    c144801.L$0 = androidBuildHeaderBiddingToken2;
                    c144801.L$1 = tokenCounters;
                    c144801.L$2 = dsl2;
                    c144801.L$3 = dsl3;
                    c144801.L$4 = dsl3;
                    c144801.L$5 = null;
                    c144801.label = 4;
                    objIsConnected = getLimitedSessionToken3.invoke(c144801);
                    if (objIsConnected != coroutine_suspended) {
                        dsl4 = dsl3;
                        dsl5 = dsl4;
                        dsl6 = dsl2;
                        tokenCounters2 = tokenCounters;
                        dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                        dsl8 = dsl6;
                        DeviceInfoRepository deviceInfoRepository6 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                        c144801.L$0 = androidBuildHeaderBiddingToken2;
                        c144801.L$1 = tokenCounters2;
                        c144801.L$2 = dsl8;
                        c144801.L$3 = dsl5;
                        c144801.L$4 = dsl5;
                        c144801.label = 5;
                        objIsConnected = deviceInfoRepository6.staticDeviceInfo(c144801);
                        if (objIsConnected != coroutine_suspended) {
                            dsl9 = dsl5;
                            dsl10 = dsl9;
                            tokenCounters3 = tokenCounters2;
                            androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                            dsl9.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
                            androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken3;
                            dsl3 = dsl10;
                            dsl2 = dsl8;
                            tokenCounters = tokenCounters3;
                        }
                    }
                }
            } else {
                dsl3.setSessionToken(androidBuildHeaderBiddingToken2.sessionRepository.getSessionToken());
                dsl3.setStaticDeviceInfo(androidBuildHeaderBiddingToken2.deviceInfoRepository.cachedStaticDeviceInfo());
            }
            testDataInvoke = androidBuildHeaderBiddingToken2.testDataInfo.invoke();
            if (testDataInvoke != null) {
                dsl3.setTestData(testDataInvoke);
            }
            TokenCountersKt.Dsl.Companion companion5 = TokenCountersKt.Dsl.INSTANCE;
            HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder5 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder5, "newBuilder()");
            TokenCountersKt.Dsl dsl_create5 = companion5._create(builderNewBuilder5);
            dsl_create5.setSeq(tokenCounters.getSeq());
            dsl_create5.setWins(tokenCounters.getWins());
            dsl_create5.setStarts(tokenCounters.getStarts());
            dsl3.setTokenCounters(dsl_create5._build());
            return dsl2._build();
        }
        return coroutine_suspended;
    }
}
