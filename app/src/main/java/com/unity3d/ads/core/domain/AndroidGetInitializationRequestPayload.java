package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import gatewayprotocol.p299v1.ClientInfoOuterClass;
import gatewayprotocol.p299v1.InitializationDeviceInfoKt;
import gatewayprotocol.p299v1.InitializationRequestKt;
import gatewayprotocol.p299v1.InitializationRequestOuterClass;
import gatewayprotocol.p299v1.StaticDeviceInfoOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: compiled from: AndroidGetInitializationRequestPayload.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "mediationInitBlobMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "installReferrerDataSource", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final InstallReferrerDataSource installReferrerDataSource;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1 */
    /* JADX INFO: compiled from: AndroidGetInitializationRequestPayload.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", m43504f = "AndroidGetInitializationRequestPayload.kt", m43505i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9}, m43506l = {30, 31, 39, 40, 51, 56, 61, 66, 81, 105}, m43507m = "invoke", m43508n = {"this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "$this$invoke_u24lambda_u2412_u24lambda_u242", "this", "$this$invoke_u24lambda_u2412", "$this$invoke_u24lambda_u2412_u24lambda_u242", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "this", "$this$invoke_u24lambda_u2412", "$this$invoke_u24lambda_u2412"}, m43509s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$5", "L$0", "L$2", "L$5", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$1"})
    static final class C144901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C144901(Continuation<? super C144901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader, InstallReferrerDataSource installReferrerDataSource) {
        Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(legacyUserConsentRepository, "legacyUserConsentRepository");
        Intrinsics.checkNotNullParameter(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        Intrinsics.checkNotNullParameter(installReferrerDataSource, "installReferrerDataSource");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x036e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0373  */
    /* JADX WARN: Code duplicated, block: B:107:0x037e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0394  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:124:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:129:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:134:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:140:0x0404  */
    /* JADX WARN: Code duplicated, block: B:144:0x040f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0141  */
    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:45:0x0187  */
    /* JADX WARN: Code duplicated, block: B:49:0x01df  */
    /* JADX WARN: Code duplicated, block: B:53:0x0207  */
    /* JADX WARN: Code duplicated, block: B:57:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x02d2 A[PHI: r1 r4 r5 r9
  0x02d2: PHI (r1v72 java.lang.Object) = (r1v71 java.lang.Object), (r1v1 java.lang.Object) binds: [B:62:0x02ce, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x02d2: PHI (r4v29 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v26 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v31 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:62:0x02ce, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x02d2: PHI (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v10 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v15 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:62:0x02ce, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x02d2: PHI (r9v21 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v18 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v23 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:62:0x02ce, B:16:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f6 A[PHI: r1 r4 r5 r9
  0x02f6: PHI (r1v76 java.lang.Object) = (r1v75 java.lang.Object), (r1v1 java.lang.Object) binds: [B:71:0x02f2, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x02f6: PHI (r4v32 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v29 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v34 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:71:0x02f2, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x02f6: PHI (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v18 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:71:0x02f2, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x02f6: PHI (r9v24 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v21 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v26 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:71:0x02f2, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0315 A[PHI: r1 r4 r5 r9
  0x0315: PHI (r1v80 java.lang.Object) = (r1v79 java.lang.Object), (r1v1 java.lang.Object) binds: [B:77:0x0311, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x0315: PHI (r4v35 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v32 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v37 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:77:0x0311, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x0315: PHI (r5v19 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v21 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:77:0x0311, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x0315: PHI (r9v27 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v24 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v29 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:77:0x0311, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:81:0x031d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0328  */
    /* JADX WARN: Code duplicated, block: B:87:0x0333  */
    /* JADX WARN: Code duplicated, block: B:90:0x0342  */
    /* JADX WARN: Code duplicated, block: B:94:0x035d A[PHI: r1 r4 r5 r9
  0x035d: PHI (r1v92 java.lang.Object) = (r1v89 java.lang.Object), (r1v1 java.lang.Object) binds: [B:92:0x0359, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x035d: PHI (r4v38 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v35 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v40 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:92:0x0359, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x035d: PHI (r5v22 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v19 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v24 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:92:0x0359, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x035d: PHI (r9v30 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v27 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v32 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:92:0x0359, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0364  */
    /* JADX WARN: Code duplicated, block: B:98:0x036a  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    public Object invoke(Continuation<? super InitializationRequestOuterClass.InitializationRequest> continuation) throws Throwable {
        C144901 c144901;
        InitializationRequestKt.Dsl dsl_create;
        boolean z;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload;
        InitializationRequestKt.Dsl dsl;
        InitializationRequestKt.Dsl dsl2;
        InitializationRequestKt.Dsl dsl3;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        String analyticsUserId;
        InitializationDeviceInfoKt.Dsl dsl_create2;
        InitializationDeviceInfoKt.Dsl dsl4;
        InitializationRequestKt.Dsl dsl5;
        InitializationRequestKt.Dsl dsl6;
        InitializationDeviceInfoKt.Dsl dsl7;
        InitializationRequestKt.Dsl dsl8;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3;
        InitializationRequestKt.Dsl dsl9;
        InitializationRequestKt.Dsl dsl10;
        InitializationDeviceInfoKt.Dsl dsl11;
        InitializationDeviceInfoKt.Dsl dsl12;
        final InitializationRequestKt.Dsl dsl13;
        InitializationRequestKt.Dsl dsl14;
        ByteString byteString;
        String str;
        String str2;
        ByteString byteString2;
        ByteString byteString3;
        String legacyFlowUserConsent;
        String unityInstallationId;
        String unityMegaSessionId;
        String str3;
        String str4;
        InitializationConfigurationInternal initializationConfiguration;
        InitializationRequestKt.Dsl dsl15;
        InitializationRequestKt.Dsl dsl16;
        Object obj;
        String str5;
        ByteString byteStringUtf8;
        Map<String, String> extras;
        Map mutableMap;
        String str6;
        ByteString byteStringUtf9;
        String userIdentifier;
        InitializationRequestOuterClass.InstallReferrer installReferrer;
        if (continuation instanceof C144901) {
            c144901 = (C144901) continuation;
            if ((c144901.label & Integer.MIN_VALUE) != 0) {
                c144901.label -= Integer.MIN_VALUE;
            } else {
                c144901 = new C144901(continuation);
            }
        } else {
            c144901 = new C144901(continuation);
        }
        Object objInvoke = c144901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c144901.label) {
            case 0:
                ResultKt.throwOnFailure(objInvoke);
                InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.INSTANCE;
                InitializationRequestOuterClass.InitializationRequest.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
                Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                dsl_create = companion._create(builderNewBuilder);
                Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                if (storage.readStorage()) {
                    Object obj2 = storage.get("configuration.hasInitialized");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                dsl_create.setIsFirstInit(!z);
                GetClientInfo getClientInfo = this.getClientInfo;
                c144901.L$0 = this;
                c144901.L$1 = dsl_create;
                c144901.L$2 = dsl_create;
                c144901.L$3 = dsl_create;
                c144901.label = 1;
                objInvoke = getClientInfo.invoke(c144901);
                if (objInvoke != coroutine_suspended) {
                    androidGetInitializationRequestPayload = this;
                    dsl = dsl_create;
                    dsl2 = dsl;
                    dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) objInvoke);
                    DeviceInfoRepository deviceInfoRepository = androidGetInitializationRequestPayload.deviceInfoRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload;
                    c144901.L$1 = dsl2;
                    c144901.L$2 = dsl;
                    c144901.L$3 = dsl;
                    c144901.label = 2;
                    objInvoke = deviceInfoRepository.getIdfi(c144901);
                    if (objInvoke != coroutine_suspended) {
                        dsl3 = dsl;
                        androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                        dsl3.setIdfi((String) objInvoke);
                        analyticsUserId = androidGetInitializationRequestPayload2.deviceInfoRepository.getAnalyticsUserId();
                        if (analyticsUserId != null) {
                            dsl.setAnalyticsUserId(analyticsUserId);
                        }
                        dsl.setSessionId(androidGetInitializationRequestPayload2.sessionRepository.getSessionId());
                        InitializationDeviceInfoKt.Dsl.Companion companion2 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder2 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
                        dsl_create2 = companion2._create(builderNewBuilder2);
                        dsl_create2.setBundleId(androidGetInitializationRequestPayload2.deviceInfoRepository.getAppName());
                        dsl_create2.setDeviceModel(androidGetInitializationRequestPayload2.deviceInfoRepository.getModel());
                        dsl_create2.setDeviceMake(androidGetInitializationRequestPayload2.deviceInfoRepository.getManufacturer());
                        dsl_create2.setOsVersion(androidGetInitializationRequestPayload2.deviceInfoRepository.getOsVersion());
                        DeviceInfoRepository deviceInfoRepository2 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        c144901.L$0 = androidGetInitializationRequestPayload2;
                        c144901.L$1 = dsl2;
                        c144901.L$2 = dsl;
                        c144901.L$3 = dsl_create2;
                        c144901.L$4 = dsl;
                        c144901.L$5 = dsl_create2;
                        c144901.L$6 = dsl_create2;
                        c144901.label = 3;
                        objInvoke = deviceInfoRepository2.staticDeviceInfo(c144901);
                        if (objInvoke != coroutine_suspended) {
                            dsl4 = dsl_create2;
                            dsl5 = dsl;
                            dsl6 = dsl2;
                            dsl7 = dsl4;
                            dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                            DeviceInfoRepository deviceInfoRepository3 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                            c144901.L$0 = androidGetInitializationRequestPayload2;
                            c144901.L$1 = dsl6;
                            c144901.L$2 = dsl5;
                            c144901.L$3 = dsl7;
                            c144901.L$4 = dsl;
                            c144901.L$5 = dsl4;
                            c144901.L$6 = dsl4;
                            c144901.label = 4;
                            objInvoke = deviceInfoRepository3.staticDeviceInfo(c144901);
                            if (objInvoke != coroutine_suspended) {
                                InitializationDeviceInfoKt.Dsl dsl17 = dsl7;
                                dsl8 = dsl;
                                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                                dsl9 = dsl6;
                                dsl10 = dsl5;
                                dsl11 = dsl17;
                                dsl12 = dsl4;
                                dsl12.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload3.deviceInfoRepository.getCurrentUiTheme());
                                String networkOperator = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                                Intrinsics.checkNotNullExpressionValue(networkOperator, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                                dsl4.setNetworkOperator(networkOperator);
                                dsl4.setBatteryLevel(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                                dsl4.setBatteryStatus(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                                dsl4.setSystemBootTime(androidGetInitializationRequestPayload3.deviceInfoRepository.getSystemBootTime());
                                String language = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                                Intrinsics.checkNotNullExpressionValue(language, "deviceInfoRepository.dynamicDeviceInfo.language");
                                dsl4.setLanguage(language);
                                dsl4.setLocalList(CollectionsKt.joinToString$default(androidGetInitializationRequestPayload3.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                                dsl4.setConnectionType(androidGetInitializationRequestPayload3.deviceInfoRepository.getConnectionTypeStr());
                                dsl8.setDeviceInfo(dsl11._build());
                                DeviceInfoRepository deviceInfoRepository4 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                c144901.L$0 = androidGetInitializationRequestPayload3;
                                c144901.L$1 = dsl9;
                                c144901.L$2 = dsl10;
                                c144901.L$3 = null;
                                c144901.L$4 = null;
                                c144901.L$5 = null;
                                c144901.L$6 = null;
                                c144901.label = 5;
                                objInvoke = deviceInfoRepository4.getAuidByteString(c144901);
                                if (objInvoke != coroutine_suspended) {
                                    dsl13 = dsl10;
                                    dsl14 = dsl9;
                                    byteString = (ByteString) objInvoke;
                                    if (byteString != null) {
                                        dsl13.setAuid(byteString);
                                    }
                                    DeviceInfoRepository deviceInfoRepository5 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                    c144901.L$0 = androidGetInitializationRequestPayload3;
                                    c144901.L$1 = dsl14;
                                    c144901.L$2 = dsl13;
                                    c144901.label = 6;
                                    objInvoke = deviceInfoRepository5.getAuidString(c144901);
                                    if (objInvoke != coroutine_suspended) {
                                        str = (String) objInvoke;
                                        str2 = str;
                                        if (str2 != null && str2.length() != 0) {
                                            dsl13.setAuidString(str);
                                        }
                                        SessionRepository sessionRepository = androidGetInitializationRequestPayload3.sessionRepository;
                                        c144901.L$0 = androidGetInitializationRequestPayload3;
                                        c144901.L$1 = dsl14;
                                        c144901.L$2 = dsl13;
                                        c144901.label = 7;
                                        objInvoke = sessionRepository.getPrivacy(c144901);
                                        if (objInvoke != coroutine_suspended) {
                                            byteString2 = (ByteString) objInvoke;
                                            if (!byteString2.isEmpty()) {
                                                dsl13.setPrivacy(byteString2);
                                            }
                                            SessionRepository sessionRepository2 = androidGetInitializationRequestPayload3.sessionRepository;
                                            c144901.L$0 = androidGetInitializationRequestPayload3;
                                            c144901.L$1 = dsl14;
                                            c144901.L$2 = dsl13;
                                            c144901.label = 8;
                                            objInvoke = sessionRepository2.getGatewayCache(c144901);
                                            if (objInvoke != coroutine_suspended) {
                                                byteString3 = (ByteString) objInvoke;
                                                if (!byteString3.isEmpty()) {
                                                    dsl13.setCache(byteString3);
                                                }
                                                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                                if (legacyFlowUserConsent != null) {
                                                    dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                                }
                                                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                                                if (unityInstallationId != null) {
                                                    dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                                }
                                                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                                                if (unityMegaSessionId != null) {
                                                    dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                                }
                                                DeviceInfoRepository deviceInfoRepository6 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                                c144901.L$0 = androidGetInitializationRequestPayload3;
                                                c144901.L$1 = dsl14;
                                                c144901.L$2 = dsl13;
                                                c144901.label = 9;
                                                objInvoke = deviceInfoRepository6.getUnityBuildGuid(c144901);
                                                if (objInvoke != coroutine_suspended) {
                                                    str3 = (String) objInvoke;
                                                    if (str3 != null || str3.length() == 0) {
                                                        objInvoke = null;
                                                    }
                                                    str4 = (String) objInvoke;
                                                    if (str4 != null) {
                                                        dsl13.setUnityBuildGuid(str4);
                                                    }
                                                    initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                                                    if (initializationConfiguration != null && (extras = initializationConfiguration.getExtras()) != null && (mutableMap = MapsKt.toMutableMap(extras)) != null) {
                                                        str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                                        if (str6 != null && (byteStringUtf9 = ByteStringsKt.toByteStringUtf8(str6)) != null) {
                                                            new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                                public Object get() {
                                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                                }

                                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                                public void set(Object obj3) {
                                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                                }
                                                            }.set(byteStringUtf9);
                                                        }
                                                        dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                                                    }
                                                    if (!dsl13.hasUadsInitBlob()) {
                                                        MediationInitBlobMetadataReader mediationInitBlobMetadataReader = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                                        obj = mediationInitBlobMetadataReader.getJsonStorage().get(mediationInitBlobMetadataReader.getKey());
                                                        if (obj != null) {
                                                            Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                                            if (!(obj instanceof String)) {
                                                                obj = null;
                                                            }
                                                            if (obj == null) {
                                                                obj = null;
                                                            }
                                                        } else {
                                                            obj = null;
                                                        }
                                                        str5 = (String) obj;
                                                        if (str5 != null && (byteStringUtf8 = ByteStringsKt.toByteStringUtf8(str5)) != null) {
                                                            new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                                public Object get() {
                                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                                }

                                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                                public void set(Object obj3) {
                                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                                }
                                                            }.set(byteStringUtf8);
                                                        }
                                                    }
                                                    if (dsl13.getIsFirstInit()) {
                                                        InstallReferrerDataSource installReferrerDataSource = androidGetInitializationRequestPayload3.installReferrerDataSource;
                                                        c144901.L$0 = dsl14;
                                                        c144901.L$1 = dsl13;
                                                        c144901.L$2 = null;
                                                        c144901.label = 10;
                                                        objInvoke = installReferrerDataSource.invoke(c144901);
                                                        if (objInvoke != coroutine_suspended) {
                                                            dsl15 = dsl13;
                                                            dsl16 = dsl14;
                                                            installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                                            if (installReferrer != null) {
                                                                dsl15.setInstallReferrer(installReferrer);
                                                            }
                                                            dsl14 = dsl16;
                                                            dsl13 = dsl15;
                                                        }
                                                    }
                                                    userIdentifier = UnityAds.getUserIdentifier();
                                                    if (userIdentifier != null) {
                                                        dsl13.setExternalUserIdentifier(userIdentifier);
                                                    }
                                                    return dsl14._build();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                dsl_create = (InitializationRequestKt.Dsl) c144901.L$3;
                dsl = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl2 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) objInvoke);
                DeviceInfoRepository deviceInfoRepository7 = androidGetInitializationRequestPayload.deviceInfoRepository;
                c144901.L$0 = androidGetInitializationRequestPayload;
                c144901.L$1 = dsl2;
                c144901.L$2 = dsl;
                c144901.L$3 = dsl;
                c144901.label = 2;
                objInvoke = deviceInfoRepository7.getIdfi(c144901);
                if (objInvoke != coroutine_suspended) {
                    dsl3 = dsl;
                    androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                    dsl3.setIdfi((String) objInvoke);
                    analyticsUserId = androidGetInitializationRequestPayload2.deviceInfoRepository.getAnalyticsUserId();
                    if (analyticsUserId != null) {
                        dsl.setAnalyticsUserId(analyticsUserId);
                    }
                    dsl.setSessionId(androidGetInitializationRequestPayload2.sessionRepository.getSessionId());
                    InitializationDeviceInfoKt.Dsl.Companion companion3 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                    InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder3 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
                    dsl_create2 = companion3._create(builderNewBuilder3);
                    dsl_create2.setBundleId(androidGetInitializationRequestPayload2.deviceInfoRepository.getAppName());
                    dsl_create2.setDeviceModel(androidGetInitializationRequestPayload2.deviceInfoRepository.getModel());
                    dsl_create2.setDeviceMake(androidGetInitializationRequestPayload2.deviceInfoRepository.getManufacturer());
                    dsl_create2.setOsVersion(androidGetInitializationRequestPayload2.deviceInfoRepository.getOsVersion());
                    DeviceInfoRepository deviceInfoRepository8 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload2;
                    c144901.L$1 = dsl2;
                    c144901.L$2 = dsl;
                    c144901.L$3 = dsl_create2;
                    c144901.L$4 = dsl;
                    c144901.L$5 = dsl_create2;
                    c144901.L$6 = dsl_create2;
                    c144901.label = 3;
                    objInvoke = deviceInfoRepository8.staticDeviceInfo(c144901);
                    if (objInvoke != coroutine_suspended) {
                        dsl4 = dsl_create2;
                        dsl5 = dsl;
                        dsl6 = dsl2;
                        dsl7 = dsl4;
                        dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                        DeviceInfoRepository deviceInfoRepository9 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        c144901.L$0 = androidGetInitializationRequestPayload2;
                        c144901.L$1 = dsl6;
                        c144901.L$2 = dsl5;
                        c144901.L$3 = dsl7;
                        c144901.L$4 = dsl;
                        c144901.L$5 = dsl4;
                        c144901.L$6 = dsl4;
                        c144901.label = 4;
                        objInvoke = deviceInfoRepository9.staticDeviceInfo(c144901);
                        if (objInvoke != coroutine_suspended) {
                            InitializationDeviceInfoKt.Dsl dsl18 = dsl7;
                            dsl8 = dsl;
                            androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                            dsl9 = dsl6;
                            dsl10 = dsl5;
                            dsl11 = dsl18;
                            dsl12 = dsl4;
                            dsl12.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                            dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload3.deviceInfoRepository.getCurrentUiTheme());
                            String networkOperator2 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                            Intrinsics.checkNotNullExpressionValue(networkOperator2, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                            dsl4.setNetworkOperator(networkOperator2);
                            dsl4.setBatteryLevel(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                            dsl4.setBatteryStatus(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                            dsl4.setSystemBootTime(androidGetInitializationRequestPayload3.deviceInfoRepository.getSystemBootTime());
                            String language2 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                            Intrinsics.checkNotNullExpressionValue(language2, "deviceInfoRepository.dynamicDeviceInfo.language");
                            dsl4.setLanguage(language2);
                            dsl4.setLocalList(CollectionsKt.joinToString$default(androidGetInitializationRequestPayload3.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                            dsl4.setConnectionType(androidGetInitializationRequestPayload3.deviceInfoRepository.getConnectionTypeStr());
                            dsl8.setDeviceInfo(dsl11._build());
                            DeviceInfoRepository deviceInfoRepository10 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                            c144901.L$0 = androidGetInitializationRequestPayload3;
                            c144901.L$1 = dsl9;
                            c144901.L$2 = dsl10;
                            c144901.L$3 = null;
                            c144901.L$4 = null;
                            c144901.L$5 = null;
                            c144901.L$6 = null;
                            c144901.label = 5;
                            objInvoke = deviceInfoRepository10.getAuidByteString(c144901);
                            if (objInvoke != coroutine_suspended) {
                                dsl13 = dsl10;
                                dsl14 = dsl9;
                                byteString = (ByteString) objInvoke;
                                if (byteString != null) {
                                    dsl13.setAuid(byteString);
                                }
                                DeviceInfoRepository deviceInfoRepository11 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                c144901.L$0 = androidGetInitializationRequestPayload3;
                                c144901.L$1 = dsl14;
                                c144901.L$2 = dsl13;
                                c144901.label = 6;
                                objInvoke = deviceInfoRepository11.getAuidString(c144901);
                                if (objInvoke != coroutine_suspended) {
                                    str = (String) objInvoke;
                                    str2 = str;
                                    if (str2 != null) {
                                        dsl13.setAuidString(str);
                                    }
                                    SessionRepository sessionRepository3 = androidGetInitializationRequestPayload3.sessionRepository;
                                    c144901.L$0 = androidGetInitializationRequestPayload3;
                                    c144901.L$1 = dsl14;
                                    c144901.L$2 = dsl13;
                                    c144901.label = 7;
                                    objInvoke = sessionRepository3.getPrivacy(c144901);
                                    if (objInvoke != coroutine_suspended) {
                                        byteString2 = (ByteString) objInvoke;
                                        if (!byteString2.isEmpty()) {
                                            dsl13.setPrivacy(byteString2);
                                        }
                                        SessionRepository sessionRepository4 = androidGetInitializationRequestPayload3.sessionRepository;
                                        c144901.L$0 = androidGetInitializationRequestPayload3;
                                        c144901.L$1 = dsl14;
                                        c144901.L$2 = dsl13;
                                        c144901.label = 8;
                                        objInvoke = sessionRepository4.getGatewayCache(c144901);
                                        if (objInvoke != coroutine_suspended) {
                                            byteString3 = (ByteString) objInvoke;
                                            if (!byteString3.isEmpty()) {
                                                dsl13.setCache(byteString3);
                                            }
                                            legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                            if (legacyFlowUserConsent != null) {
                                                dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                            }
                                            unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                                            if (unityInstallationId != null) {
                                                dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                            }
                                            unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                                            if (unityMegaSessionId != null) {
                                                dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                            }
                                            DeviceInfoRepository deviceInfoRepository12 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                            c144901.L$0 = androidGetInitializationRequestPayload3;
                                            c144901.L$1 = dsl14;
                                            c144901.L$2 = dsl13;
                                            c144901.label = 9;
                                            objInvoke = deviceInfoRepository12.getUnityBuildGuid(c144901);
                                            if (objInvoke != coroutine_suspended) {
                                                str3 = (String) objInvoke;
                                                if (str3 != null || str3.length() == 0) {
                                                    objInvoke = null;
                                                }
                                                str4 = (String) objInvoke;
                                                if (str4 != null) {
                                                    dsl13.setUnityBuildGuid(str4);
                                                }
                                                initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                                                if (initializationConfiguration != null) {
                                                    str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                                    if (str6 != null) {
                                                        new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                            public Object get() {
                                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                            }

                                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                            public void set(Object obj3) {
                                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                            }
                                                        }.set(byteStringUtf9);
                                                    }
                                                    dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                                                }
                                                if (!dsl13.hasUadsInitBlob()) {
                                                    MediationInitBlobMetadataReader mediationInitBlobMetadataReader2 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                                    obj = mediationInitBlobMetadataReader2.getJsonStorage().get(mediationInitBlobMetadataReader2.getKey());
                                                    if (obj != null) {
                                                        Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                                        if (!(obj instanceof String)) {
                                                            obj = null;
                                                        }
                                                        if (obj == null) {
                                                            obj = null;
                                                        }
                                                    } else {
                                                        obj = null;
                                                    }
                                                    str5 = (String) obj;
                                                    if (str5 != null) {
                                                        new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                            public Object get() {
                                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                            }

                                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                            public void set(Object obj3) {
                                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                            }
                                                        }.set(byteStringUtf8);
                                                    }
                                                }
                                                if (dsl13.getIsFirstInit()) {
                                                    InstallReferrerDataSource installReferrerDataSource2 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                                                    c144901.L$0 = dsl14;
                                                    c144901.L$1 = dsl13;
                                                    c144901.L$2 = null;
                                                    c144901.label = 10;
                                                    objInvoke = installReferrerDataSource2.invoke(c144901);
                                                    if (objInvoke != coroutine_suspended) {
                                                        dsl15 = dsl13;
                                                        dsl16 = dsl14;
                                                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                                        if (installReferrer != null) {
                                                            dsl15.setInstallReferrer(installReferrer);
                                                        }
                                                        dsl14 = dsl16;
                                                        dsl13 = dsl15;
                                                    }
                                                }
                                                userIdentifier = UnityAds.getUserIdentifier();
                                                if (userIdentifier != null) {
                                                    dsl13.setExternalUserIdentifier(userIdentifier);
                                                }
                                                return dsl14._build();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 2:
                dsl3 = (InitializationRequestKt.Dsl) c144901.L$3;
                dsl = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl2 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl3.setIdfi((String) objInvoke);
                analyticsUserId = androidGetInitializationRequestPayload2.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload2.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion4 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder4 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                Intrinsics.checkNotNullExpressionValue(builderNewBuilder4, "newBuilder()");
                dsl_create2 = companion4._create(builderNewBuilder4);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload2.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload2.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload2.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload2.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository13 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                c144901.L$0 = androidGetInitializationRequestPayload2;
                c144901.L$1 = dsl2;
                c144901.L$2 = dsl;
                c144901.L$3 = dsl_create2;
                c144901.L$4 = dsl;
                c144901.L$5 = dsl_create2;
                c144901.L$6 = dsl_create2;
                c144901.label = 3;
                objInvoke = deviceInfoRepository13.staticDeviceInfo(c144901);
                if (objInvoke != coroutine_suspended) {
                    dsl4 = dsl_create2;
                    dsl5 = dsl;
                    dsl6 = dsl2;
                    dsl7 = dsl4;
                    dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                    DeviceInfoRepository deviceInfoRepository14 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload2;
                    c144901.L$1 = dsl6;
                    c144901.L$2 = dsl5;
                    c144901.L$3 = dsl7;
                    c144901.L$4 = dsl;
                    c144901.L$5 = dsl4;
                    c144901.L$6 = dsl4;
                    c144901.label = 4;
                    objInvoke = deviceInfoRepository14.staticDeviceInfo(c144901);
                    if (objInvoke != coroutine_suspended) {
                        InitializationDeviceInfoKt.Dsl dsl19 = dsl7;
                        dsl8 = dsl;
                        androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                        dsl9 = dsl6;
                        dsl10 = dsl5;
                        dsl11 = dsl19;
                        dsl12 = dsl4;
                        dsl12.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                        dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload3.deviceInfoRepository.getCurrentUiTheme());
                        String networkOperator3 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                        Intrinsics.checkNotNullExpressionValue(networkOperator3, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                        dsl4.setNetworkOperator(networkOperator3);
                        dsl4.setBatteryLevel(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                        dsl4.setBatteryStatus(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                        dsl4.setSystemBootTime(androidGetInitializationRequestPayload3.deviceInfoRepository.getSystemBootTime());
                        String language3 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                        Intrinsics.checkNotNullExpressionValue(language3, "deviceInfoRepository.dynamicDeviceInfo.language");
                        dsl4.setLanguage(language3);
                        dsl4.setLocalList(CollectionsKt.joinToString$default(androidGetInitializationRequestPayload3.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                        dsl4.setConnectionType(androidGetInitializationRequestPayload3.deviceInfoRepository.getConnectionTypeStr());
                        dsl8.setDeviceInfo(dsl11._build());
                        DeviceInfoRepository deviceInfoRepository15 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        c144901.L$0 = androidGetInitializationRequestPayload3;
                        c144901.L$1 = dsl9;
                        c144901.L$2 = dsl10;
                        c144901.L$3 = null;
                        c144901.L$4 = null;
                        c144901.L$5 = null;
                        c144901.L$6 = null;
                        c144901.label = 5;
                        objInvoke = deviceInfoRepository15.getAuidByteString(c144901);
                        if (objInvoke != coroutine_suspended) {
                            dsl13 = dsl10;
                            dsl14 = dsl9;
                            byteString = (ByteString) objInvoke;
                            if (byteString != null) {
                                dsl13.setAuid(byteString);
                            }
                            DeviceInfoRepository deviceInfoRepository16 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                            c144901.L$0 = androidGetInitializationRequestPayload3;
                            c144901.L$1 = dsl14;
                            c144901.L$2 = dsl13;
                            c144901.label = 6;
                            objInvoke = deviceInfoRepository16.getAuidString(c144901);
                            if (objInvoke != coroutine_suspended) {
                                str = (String) objInvoke;
                                str2 = str;
                                if (str2 != null) {
                                    dsl13.setAuidString(str);
                                }
                                SessionRepository sessionRepository5 = androidGetInitializationRequestPayload3.sessionRepository;
                                c144901.L$0 = androidGetInitializationRequestPayload3;
                                c144901.L$1 = dsl14;
                                c144901.L$2 = dsl13;
                                c144901.label = 7;
                                objInvoke = sessionRepository5.getPrivacy(c144901);
                                if (objInvoke != coroutine_suspended) {
                                    byteString2 = (ByteString) objInvoke;
                                    if (!byteString2.isEmpty()) {
                                        dsl13.setPrivacy(byteString2);
                                    }
                                    SessionRepository sessionRepository6 = androidGetInitializationRequestPayload3.sessionRepository;
                                    c144901.L$0 = androidGetInitializationRequestPayload3;
                                    c144901.L$1 = dsl14;
                                    c144901.L$2 = dsl13;
                                    c144901.label = 8;
                                    objInvoke = sessionRepository6.getGatewayCache(c144901);
                                    if (objInvoke != coroutine_suspended) {
                                        byteString3 = (ByteString) objInvoke;
                                        if (!byteString3.isEmpty()) {
                                            dsl13.setCache(byteString3);
                                        }
                                        legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                        if (legacyFlowUserConsent != null) {
                                            dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                        }
                                        unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                                        if (unityInstallationId != null) {
                                            dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                        }
                                        unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                                        if (unityMegaSessionId != null) {
                                            dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                        }
                                        DeviceInfoRepository deviceInfoRepository17 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                        c144901.L$0 = androidGetInitializationRequestPayload3;
                                        c144901.L$1 = dsl14;
                                        c144901.L$2 = dsl13;
                                        c144901.label = 9;
                                        objInvoke = deviceInfoRepository17.getUnityBuildGuid(c144901);
                                        if (objInvoke != coroutine_suspended) {
                                            str3 = (String) objInvoke;
                                            if (str3 != null || str3.length() == 0) {
                                                objInvoke = null;
                                            }
                                            str4 = (String) objInvoke;
                                            if (str4 != null) {
                                                dsl13.setUnityBuildGuid(str4);
                                            }
                                            initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                                            if (initializationConfiguration != null) {
                                                str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                                if (str6 != null) {
                                                    new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                        public Object get() {
                                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                        }

                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                        public void set(Object obj3) {
                                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                        }
                                                    }.set(byteStringUtf9);
                                                }
                                                dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                                            }
                                            if (!dsl13.hasUadsInitBlob()) {
                                                MediationInitBlobMetadataReader mediationInitBlobMetadataReader3 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                                obj = mediationInitBlobMetadataReader3.getJsonStorage().get(mediationInitBlobMetadataReader3.getKey());
                                                if (obj != null) {
                                                    Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                                    if (!(obj instanceof String)) {
                                                        obj = null;
                                                    }
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                } else {
                                                    obj = null;
                                                }
                                                str5 = (String) obj;
                                                if (str5 != null) {
                                                    new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                        public Object get() {
                                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                        }

                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                        public void set(Object obj3) {
                                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                        }
                                                    }.set(byteStringUtf8);
                                                }
                                            }
                                            if (dsl13.getIsFirstInit()) {
                                                InstallReferrerDataSource installReferrerDataSource3 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                                                c144901.L$0 = dsl14;
                                                c144901.L$1 = dsl13;
                                                c144901.L$2 = null;
                                                c144901.label = 10;
                                                objInvoke = installReferrerDataSource3.invoke(c144901);
                                                if (objInvoke != coroutine_suspended) {
                                                    dsl15 = dsl13;
                                                    dsl16 = dsl14;
                                                    installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                                    if (installReferrer != null) {
                                                        dsl15.setInstallReferrer(installReferrer);
                                                    }
                                                    dsl14 = dsl16;
                                                    dsl13 = dsl15;
                                                }
                                            }
                                            userIdentifier = UnityAds.getUserIdentifier();
                                            if (userIdentifier != null) {
                                                dsl13.setExternalUserIdentifier(userIdentifier);
                                            }
                                            return dsl14._build();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 3:
                dsl_create2 = (InitializationDeviceInfoKt.Dsl) c144901.L$6;
                dsl4 = (InitializationDeviceInfoKt.Dsl) c144901.L$5;
                dsl = (InitializationRequestKt.Dsl) c144901.L$4;
                dsl7 = (InitializationDeviceInfoKt.Dsl) c144901.L$3;
                dsl5 = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl6 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository18 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                c144901.L$0 = androidGetInitializationRequestPayload2;
                c144901.L$1 = dsl6;
                c144901.L$2 = dsl5;
                c144901.L$3 = dsl7;
                c144901.L$4 = dsl;
                c144901.L$5 = dsl4;
                c144901.L$6 = dsl4;
                c144901.label = 4;
                objInvoke = deviceInfoRepository18.staticDeviceInfo(c144901);
                if (objInvoke != coroutine_suspended) {
                    InitializationDeviceInfoKt.Dsl dsl110 = dsl7;
                    dsl8 = dsl;
                    androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                    dsl9 = dsl6;
                    dsl10 = dsl5;
                    dsl11 = dsl110;
                    dsl12 = dsl4;
                    dsl12.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                    dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload3.deviceInfoRepository.getCurrentUiTheme());
                    String networkOperator4 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                    Intrinsics.checkNotNullExpressionValue(networkOperator4, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                    dsl4.setNetworkOperator(networkOperator4);
                    dsl4.setBatteryLevel(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                    dsl4.setBatteryStatus(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                    dsl4.setSystemBootTime(androidGetInitializationRequestPayload3.deviceInfoRepository.getSystemBootTime());
                    String language4 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                    Intrinsics.checkNotNullExpressionValue(language4, "deviceInfoRepository.dynamicDeviceInfo.language");
                    dsl4.setLanguage(language4);
                    dsl4.setLocalList(CollectionsKt.joinToString$default(androidGetInitializationRequestPayload3.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                    dsl4.setConnectionType(androidGetInitializationRequestPayload3.deviceInfoRepository.getConnectionTypeStr());
                    dsl8.setDeviceInfo(dsl11._build());
                    DeviceInfoRepository deviceInfoRepository19 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload3;
                    c144901.L$1 = dsl9;
                    c144901.L$2 = dsl10;
                    c144901.L$3 = null;
                    c144901.L$4 = null;
                    c144901.L$5 = null;
                    c144901.L$6 = null;
                    c144901.label = 5;
                    objInvoke = deviceInfoRepository19.getAuidByteString(c144901);
                    if (objInvoke != coroutine_suspended) {
                        dsl13 = dsl10;
                        dsl14 = dsl9;
                        byteString = (ByteString) objInvoke;
                        if (byteString != null) {
                            dsl13.setAuid(byteString);
                        }
                        DeviceInfoRepository deviceInfoRepository110 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        c144901.L$0 = androidGetInitializationRequestPayload3;
                        c144901.L$1 = dsl14;
                        c144901.L$2 = dsl13;
                        c144901.label = 6;
                        objInvoke = deviceInfoRepository110.getAuidString(c144901);
                        if (objInvoke != coroutine_suspended) {
                            str = (String) objInvoke;
                            str2 = str;
                            if (str2 != null) {
                                dsl13.setAuidString(str);
                            }
                            SessionRepository sessionRepository7 = androidGetInitializationRequestPayload3.sessionRepository;
                            c144901.L$0 = androidGetInitializationRequestPayload3;
                            c144901.L$1 = dsl14;
                            c144901.L$2 = dsl13;
                            c144901.label = 7;
                            objInvoke = sessionRepository7.getPrivacy(c144901);
                            if (objInvoke != coroutine_suspended) {
                                byteString2 = (ByteString) objInvoke;
                                if (!byteString2.isEmpty()) {
                                    dsl13.setPrivacy(byteString2);
                                }
                                SessionRepository sessionRepository8 = androidGetInitializationRequestPayload3.sessionRepository;
                                c144901.L$0 = androidGetInitializationRequestPayload3;
                                c144901.L$1 = dsl14;
                                c144901.L$2 = dsl13;
                                c144901.label = 8;
                                objInvoke = sessionRepository8.getGatewayCache(c144901);
                                if (objInvoke != coroutine_suspended) {
                                    byteString3 = (ByteString) objInvoke;
                                    if (!byteString3.isEmpty()) {
                                        dsl13.setCache(byteString3);
                                    }
                                    legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                    if (legacyFlowUserConsent != null) {
                                        dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                    }
                                    unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                                    if (unityInstallationId != null) {
                                        dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                    }
                                    unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                                    if (unityMegaSessionId != null) {
                                        dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                    }
                                    DeviceInfoRepository deviceInfoRepository111 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                    c144901.L$0 = androidGetInitializationRequestPayload3;
                                    c144901.L$1 = dsl14;
                                    c144901.L$2 = dsl13;
                                    c144901.label = 9;
                                    objInvoke = deviceInfoRepository111.getUnityBuildGuid(c144901);
                                    if (objInvoke != coroutine_suspended) {
                                        str3 = (String) objInvoke;
                                        if (str3 != null || str3.length() == 0) {
                                            objInvoke = null;
                                        }
                                        str4 = (String) objInvoke;
                                        if (str4 != null) {
                                            dsl13.setUnityBuildGuid(str4);
                                        }
                                        initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                                        if (initializationConfiguration != null) {
                                            str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                            if (str6 != null) {
                                                new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                    public Object get() {
                                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                    }

                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                    public void set(Object obj3) {
                                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                    }
                                                }.set(byteStringUtf9);
                                            }
                                            dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                                        }
                                        if (!dsl13.hasUadsInitBlob()) {
                                            MediationInitBlobMetadataReader mediationInitBlobMetadataReader4 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                            obj = mediationInitBlobMetadataReader4.getJsonStorage().get(mediationInitBlobMetadataReader4.getKey());
                                            if (obj != null) {
                                                Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                                if (!(obj instanceof String)) {
                                                    obj = null;
                                                }
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                            } else {
                                                obj = null;
                                            }
                                            str5 = (String) obj;
                                            if (str5 != null) {
                                                new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                    public Object get() {
                                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                    }

                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                    public void set(Object obj3) {
                                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                    }
                                                }.set(byteStringUtf8);
                                            }
                                        }
                                        if (dsl13.getIsFirstInit()) {
                                            InstallReferrerDataSource installReferrerDataSource4 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                                            c144901.L$0 = dsl14;
                                            c144901.L$1 = dsl13;
                                            c144901.L$2 = null;
                                            c144901.label = 10;
                                            objInvoke = installReferrerDataSource4.invoke(c144901);
                                            if (objInvoke != coroutine_suspended) {
                                                dsl15 = dsl13;
                                                dsl16 = dsl14;
                                                installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                                if (installReferrer != null) {
                                                    dsl15.setInstallReferrer(installReferrer);
                                                }
                                                dsl14 = dsl16;
                                                dsl13 = dsl15;
                                            }
                                        }
                                        userIdentifier = UnityAds.getUserIdentifier();
                                        if (userIdentifier != null) {
                                            dsl13.setExternalUserIdentifier(userIdentifier);
                                        }
                                        return dsl14._build();
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 4:
                dsl12 = (InitializationDeviceInfoKt.Dsl) c144901.L$6;
                dsl4 = (InitializationDeviceInfoKt.Dsl) c144901.L$5;
                InitializationRequestKt.Dsl dsl20 = (InitializationRequestKt.Dsl) c144901.L$4;
                InitializationDeviceInfoKt.Dsl dsl21 = (InitializationDeviceInfoKt.Dsl) c144901.L$3;
                InitializationRequestKt.Dsl dsl22 = (InitializationRequestKt.Dsl) c144901.L$2;
                InitializationRequestKt.Dsl dsl23 = (InitializationRequestKt.Dsl) c144901.L$1;
                AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload4 = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                dsl8 = dsl20;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload4;
                dsl9 = dsl23;
                dsl10 = dsl22;
                dsl11 = dsl21;
                dsl12.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload3.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator5 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                Intrinsics.checkNotNullExpressionValue(networkOperator5, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl4.setNetworkOperator(networkOperator5);
                dsl4.setBatteryLevel(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl4.setBatteryStatus(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl4.setSystemBootTime(androidGetInitializationRequestPayload3.deviceInfoRepository.getSystemBootTime());
                String language5 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                Intrinsics.checkNotNullExpressionValue(language5, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl4.setLanguage(language5);
                dsl4.setLocalList(CollectionsKt.joinToString$default(androidGetInitializationRequestPayload3.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                dsl4.setConnectionType(androidGetInitializationRequestPayload3.deviceInfoRepository.getConnectionTypeStr());
                dsl8.setDeviceInfo(dsl11._build());
                DeviceInfoRepository deviceInfoRepository112 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                c144901.L$0 = androidGetInitializationRequestPayload3;
                c144901.L$1 = dsl9;
                c144901.L$2 = dsl10;
                c144901.L$3 = null;
                c144901.L$4 = null;
                c144901.L$5 = null;
                c144901.L$6 = null;
                c144901.label = 5;
                objInvoke = deviceInfoRepository112.getAuidByteString(c144901);
                if (objInvoke != coroutine_suspended) {
                    dsl13 = dsl10;
                    dsl14 = dsl9;
                    byteString = (ByteString) objInvoke;
                    if (byteString != null) {
                        dsl13.setAuid(byteString);
                    }
                    DeviceInfoRepository deviceInfoRepository113 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload3;
                    c144901.L$1 = dsl14;
                    c144901.L$2 = dsl13;
                    c144901.label = 6;
                    objInvoke = deviceInfoRepository113.getAuidString(c144901);
                    if (objInvoke != coroutine_suspended) {
                        str = (String) objInvoke;
                        str2 = str;
                        if (str2 != null) {
                            dsl13.setAuidString(str);
                        }
                        SessionRepository sessionRepository9 = androidGetInitializationRequestPayload3.sessionRepository;
                        c144901.L$0 = androidGetInitializationRequestPayload3;
                        c144901.L$1 = dsl14;
                        c144901.L$2 = dsl13;
                        c144901.label = 7;
                        objInvoke = sessionRepository9.getPrivacy(c144901);
                        if (objInvoke != coroutine_suspended) {
                            byteString2 = (ByteString) objInvoke;
                            if (!byteString2.isEmpty()) {
                                dsl13.setPrivacy(byteString2);
                            }
                            SessionRepository sessionRepository10 = androidGetInitializationRequestPayload3.sessionRepository;
                            c144901.L$0 = androidGetInitializationRequestPayload3;
                            c144901.L$1 = dsl14;
                            c144901.L$2 = dsl13;
                            c144901.label = 8;
                            objInvoke = sessionRepository10.getGatewayCache(c144901);
                            if (objInvoke != coroutine_suspended) {
                                byteString3 = (ByteString) objInvoke;
                                if (!byteString3.isEmpty()) {
                                    dsl13.setCache(byteString3);
                                }
                                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                if (legacyFlowUserConsent != null) {
                                    dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                }
                                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                                if (unityInstallationId != null) {
                                    dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                }
                                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                                if (unityMegaSessionId != null) {
                                    dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                }
                                DeviceInfoRepository deviceInfoRepository114 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                c144901.L$0 = androidGetInitializationRequestPayload3;
                                c144901.L$1 = dsl14;
                                c144901.L$2 = dsl13;
                                c144901.label = 9;
                                objInvoke = deviceInfoRepository114.getUnityBuildGuid(c144901);
                                if (objInvoke != coroutine_suspended) {
                                    str3 = (String) objInvoke;
                                    if (str3 != null || str3.length() == 0) {
                                        objInvoke = null;
                                    }
                                    str4 = (String) objInvoke;
                                    if (str4 != null) {
                                        dsl13.setUnityBuildGuid(str4);
                                    }
                                    initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                                    if (initializationConfiguration != null) {
                                        str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                        if (str6 != null) {
                                            new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                public Object get() {
                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                }

                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                public void set(Object obj3) {
                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                }
                                            }.set(byteStringUtf9);
                                        }
                                        dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                                    }
                                    if (!dsl13.hasUadsInitBlob()) {
                                        MediationInitBlobMetadataReader mediationInitBlobMetadataReader5 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                        obj = mediationInitBlobMetadataReader5.getJsonStorage().get(mediationInitBlobMetadataReader5.getKey());
                                        if (obj != null) {
                                            Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                            if (!(obj instanceof String)) {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                obj = null;
                                            }
                                        } else {
                                            obj = null;
                                        }
                                        str5 = (String) obj;
                                        if (str5 != null) {
                                            new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                public Object get() {
                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                }

                                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                public void set(Object obj3) {
                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                                }
                                            }.set(byteStringUtf8);
                                        }
                                    }
                                    if (dsl13.getIsFirstInit()) {
                                        InstallReferrerDataSource installReferrerDataSource5 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                                        c144901.L$0 = dsl14;
                                        c144901.L$1 = dsl13;
                                        c144901.L$2 = null;
                                        c144901.label = 10;
                                        objInvoke = installReferrerDataSource5.invoke(c144901);
                                        if (objInvoke != coroutine_suspended) {
                                            dsl15 = dsl13;
                                            dsl16 = dsl14;
                                            installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                            if (installReferrer != null) {
                                                dsl15.setInstallReferrer(installReferrer);
                                            }
                                            dsl14 = dsl16;
                                            dsl13 = dsl15;
                                        }
                                    }
                                    userIdentifier = UnityAds.getUserIdentifier();
                                    if (userIdentifier != null) {
                                        dsl13.setExternalUserIdentifier(userIdentifier);
                                    }
                                    return dsl14._build();
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 5:
                dsl13 = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl14 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl13.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository115 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                c144901.L$0 = androidGetInitializationRequestPayload3;
                c144901.L$1 = dsl14;
                c144901.L$2 = dsl13;
                c144901.label = 6;
                objInvoke = deviceInfoRepository115.getAuidString(c144901);
                if (objInvoke != coroutine_suspended) {
                    str = (String) objInvoke;
                    str2 = str;
                    if (str2 != null) {
                        dsl13.setAuidString(str);
                    }
                    SessionRepository sessionRepository11 = androidGetInitializationRequestPayload3.sessionRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload3;
                    c144901.L$1 = dsl14;
                    c144901.L$2 = dsl13;
                    c144901.label = 7;
                    objInvoke = sessionRepository11.getPrivacy(c144901);
                    if (objInvoke != coroutine_suspended) {
                        byteString2 = (ByteString) objInvoke;
                        if (!byteString2.isEmpty()) {
                            dsl13.setPrivacy(byteString2);
                        }
                        SessionRepository sessionRepository12 = androidGetInitializationRequestPayload3.sessionRepository;
                        c144901.L$0 = androidGetInitializationRequestPayload3;
                        c144901.L$1 = dsl14;
                        c144901.L$2 = dsl13;
                        c144901.label = 8;
                        objInvoke = sessionRepository12.getGatewayCache(c144901);
                        if (objInvoke != coroutine_suspended) {
                            byteString3 = (ByteString) objInvoke;
                            if (!byteString3.isEmpty()) {
                                dsl13.setCache(byteString3);
                            }
                            legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                            if (legacyFlowUserConsent != null) {
                                dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                            }
                            unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                            if (unityInstallationId != null) {
                                dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                            }
                            unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                            if (unityMegaSessionId != null) {
                                dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                            }
                            DeviceInfoRepository deviceInfoRepository116 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                            c144901.L$0 = androidGetInitializationRequestPayload3;
                            c144901.L$1 = dsl14;
                            c144901.L$2 = dsl13;
                            c144901.label = 9;
                            objInvoke = deviceInfoRepository116.getUnityBuildGuid(c144901);
                            if (objInvoke != coroutine_suspended) {
                                str3 = (String) objInvoke;
                                if (str3 != null || str3.length() == 0) {
                                    objInvoke = null;
                                }
                                str4 = (String) objInvoke;
                                if (str4 != null) {
                                    dsl13.setUnityBuildGuid(str4);
                                }
                                initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                                if (initializationConfiguration != null) {
                                    str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                    if (str6 != null) {
                                        new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                            public Object get() {
                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                            }

                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                            public void set(Object obj3) {
                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                            }
                                        }.set(byteStringUtf9);
                                    }
                                    dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                                }
                                if (!dsl13.hasUadsInitBlob()) {
                                    MediationInitBlobMetadataReader mediationInitBlobMetadataReader6 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                    obj = mediationInitBlobMetadataReader6.getJsonStorage().get(mediationInitBlobMetadataReader6.getKey());
                                    if (obj != null) {
                                        Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                        if (!(obj instanceof String)) {
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            obj = null;
                                        }
                                    } else {
                                        obj = null;
                                    }
                                    str5 = (String) obj;
                                    if (str5 != null) {
                                        new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                            public Object get() {
                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                            }

                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                            public void set(Object obj3) {
                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                            }
                                        }.set(byteStringUtf8);
                                    }
                                }
                                if (dsl13.getIsFirstInit()) {
                                    InstallReferrerDataSource installReferrerDataSource6 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                                    c144901.L$0 = dsl14;
                                    c144901.L$1 = dsl13;
                                    c144901.L$2 = null;
                                    c144901.label = 10;
                                    objInvoke = installReferrerDataSource6.invoke(c144901);
                                    if (objInvoke != coroutine_suspended) {
                                        dsl15 = dsl13;
                                        dsl16 = dsl14;
                                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                        if (installReferrer != null) {
                                            dsl15.setInstallReferrer(installReferrer);
                                        }
                                        dsl14 = dsl16;
                                        dsl13 = dsl15;
                                    }
                                }
                                userIdentifier = UnityAds.getUserIdentifier();
                                if (userIdentifier != null) {
                                    dsl13.setExternalUserIdentifier(userIdentifier);
                                }
                                return dsl14._build();
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 6:
                dsl13 = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl14 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                str = (String) objInvoke;
                str2 = str;
                if (str2 != null) {
                    dsl13.setAuidString(str);
                }
                SessionRepository sessionRepository13 = androidGetInitializationRequestPayload3.sessionRepository;
                c144901.L$0 = androidGetInitializationRequestPayload3;
                c144901.L$1 = dsl14;
                c144901.L$2 = dsl13;
                c144901.label = 7;
                objInvoke = sessionRepository13.getPrivacy(c144901);
                if (objInvoke != coroutine_suspended) {
                    byteString2 = (ByteString) objInvoke;
                    if (!byteString2.isEmpty()) {
                        dsl13.setPrivacy(byteString2);
                    }
                    SessionRepository sessionRepository14 = androidGetInitializationRequestPayload3.sessionRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload3;
                    c144901.L$1 = dsl14;
                    c144901.L$2 = dsl13;
                    c144901.label = 8;
                    objInvoke = sessionRepository14.getGatewayCache(c144901);
                    if (objInvoke != coroutine_suspended) {
                        byteString3 = (ByteString) objInvoke;
                        if (!byteString3.isEmpty()) {
                            dsl13.setCache(byteString3);
                        }
                        legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                            dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                        }
                        unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                            dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                        }
                        unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                            dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                        }
                        DeviceInfoRepository deviceInfoRepository117 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        c144901.L$0 = androidGetInitializationRequestPayload3;
                        c144901.L$1 = dsl14;
                        c144901.L$2 = dsl13;
                        c144901.label = 9;
                        objInvoke = deviceInfoRepository117.getUnityBuildGuid(c144901);
                        if (objInvoke != coroutine_suspended) {
                            str3 = (String) objInvoke;
                            if (str3 != null || str3.length() == 0) {
                                objInvoke = null;
                            }
                            str4 = (String) objInvoke;
                            if (str4 != null) {
                                dsl13.setUnityBuildGuid(str4);
                            }
                            initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                            if (initializationConfiguration != null) {
                                str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                if (str6 != null) {
                                    new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                        public Object get() {
                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                        }

                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                        public void set(Object obj3) {
                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                        }
                                    }.set(byteStringUtf9);
                                }
                                dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                            }
                            if (!dsl13.hasUadsInitBlob()) {
                                MediationInitBlobMetadataReader mediationInitBlobMetadataReader7 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                obj = mediationInitBlobMetadataReader7.getJsonStorage().get(mediationInitBlobMetadataReader7.getKey());
                                if (obj != null) {
                                    Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                    if (!(obj instanceof String)) {
                                        obj = null;
                                    }
                                    if (obj == null) {
                                        obj = null;
                                    }
                                } else {
                                    obj = null;
                                }
                                str5 = (String) obj;
                                if (str5 != null) {
                                    new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                        public Object get() {
                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                        }

                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                        public void set(Object obj3) {
                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                        }
                                    }.set(byteStringUtf8);
                                }
                            }
                            if (dsl13.getIsFirstInit()) {
                                InstallReferrerDataSource installReferrerDataSource7 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                                c144901.L$0 = dsl14;
                                c144901.L$1 = dsl13;
                                c144901.L$2 = null;
                                c144901.label = 10;
                                objInvoke = installReferrerDataSource7.invoke(c144901);
                                if (objInvoke != coroutine_suspended) {
                                    dsl15 = dsl13;
                                    dsl16 = dsl14;
                                    installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                    if (installReferrer != null) {
                                        dsl15.setInstallReferrer(installReferrer);
                                    }
                                    dsl14 = dsl16;
                                    dsl13 = dsl15;
                                }
                            }
                            userIdentifier = UnityAds.getUserIdentifier();
                            if (userIdentifier != null) {
                                dsl13.setExternalUserIdentifier(userIdentifier);
                            }
                            return dsl14._build();
                        }
                    }
                }
                return coroutine_suspended;
            case 7:
                dsl13 = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl14 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl13.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository15 = androidGetInitializationRequestPayload3.sessionRepository;
                c144901.L$0 = androidGetInitializationRequestPayload3;
                c144901.L$1 = dsl14;
                c144901.L$2 = dsl13;
                c144901.label = 8;
                objInvoke = sessionRepository15.getGatewayCache(c144901);
                if (objInvoke != coroutine_suspended) {
                    byteString3 = (ByteString) objInvoke;
                    if (!byteString3.isEmpty()) {
                        dsl13.setCache(byteString3);
                    }
                    legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                    if (legacyFlowUserConsent != null) {
                        dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                    }
                    unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                    if (unityInstallationId != null) {
                        dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                    }
                    unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                    if (unityMegaSessionId != null) {
                        dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                    }
                    DeviceInfoRepository deviceInfoRepository118 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                    c144901.L$0 = androidGetInitializationRequestPayload3;
                    c144901.L$1 = dsl14;
                    c144901.L$2 = dsl13;
                    c144901.label = 9;
                    objInvoke = deviceInfoRepository118.getUnityBuildGuid(c144901);
                    if (objInvoke != coroutine_suspended) {
                        str3 = (String) objInvoke;
                        if (str3 != null || str3.length() == 0) {
                            objInvoke = null;
                        }
                        str4 = (String) objInvoke;
                        if (str4 != null) {
                            dsl13.setUnityBuildGuid(str4);
                        }
                        initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null) {
                            str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                            if (str6 != null) {
                                new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                    public void set(Object obj3) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                    }
                                }.set(byteStringUtf9);
                            }
                            dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                        }
                        if (!dsl13.hasUadsInitBlob()) {
                            MediationInitBlobMetadataReader mediationInitBlobMetadataReader8 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                            obj = mediationInitBlobMetadataReader8.getJsonStorage().get(mediationInitBlobMetadataReader8.getKey());
                            if (obj != null) {
                                Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                if (!(obj instanceof String)) {
                                    obj = null;
                                }
                                if (obj == null) {
                                    obj = null;
                                }
                            } else {
                                obj = null;
                            }
                            str5 = (String) obj;
                            if (str5 != null) {
                                new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                    public void set(Object obj3) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                    }
                                }.set(byteStringUtf8);
                            }
                        }
                        if (dsl13.getIsFirstInit()) {
                            InstallReferrerDataSource installReferrerDataSource8 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                            c144901.L$0 = dsl14;
                            c144901.L$1 = dsl13;
                            c144901.L$2 = null;
                            c144901.label = 10;
                            objInvoke = installReferrerDataSource8.invoke(c144901);
                            if (objInvoke != coroutine_suspended) {
                                dsl15 = dsl13;
                                dsl16 = dsl14;
                                installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                                if (installReferrer != null) {
                                    dsl15.setInstallReferrer(installReferrer);
                                }
                                dsl14 = dsl16;
                                dsl13 = dsl15;
                            }
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                            dsl13.setExternalUserIdentifier(userIdentifier);
                        }
                        return dsl14._build();
                    }
                }
                return coroutine_suspended;
            case 8:
                dsl13 = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl14 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl13.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository119 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                c144901.L$0 = androidGetInitializationRequestPayload3;
                c144901.L$1 = dsl14;
                c144901.L$2 = dsl13;
                c144901.label = 9;
                objInvoke = deviceInfoRepository119.getUnityBuildGuid(c144901);
                if (objInvoke != coroutine_suspended) {
                    str3 = (String) objInvoke;
                    if (str3 != null || str3.length() == 0) {
                        objInvoke = null;
                    }
                    str4 = (String) objInvoke;
                    if (str4 != null) {
                        dsl13.setUnityBuildGuid(str4);
                    }
                    initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                    if (initializationConfiguration != null) {
                        str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                        if (str6 != null) {
                            new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                public Object get() {
                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                public void set(Object obj3) {
                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                }
                            }.set(byteStringUtf9);
                        }
                        dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                    }
                    if (!dsl13.hasUadsInitBlob()) {
                        MediationInitBlobMetadataReader mediationInitBlobMetadataReader9 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                        obj = mediationInitBlobMetadataReader9.getJsonStorage().get(mediationInitBlobMetadataReader9.getKey());
                        if (obj != null) {
                            Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                            if (!(obj instanceof String)) {
                                obj = null;
                            }
                            if (obj == null) {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                        str5 = (String) obj;
                        if (str5 != null) {
                            new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                public Object get() {
                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                public void set(Object obj3) {
                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                }
                            }.set(byteStringUtf8);
                        }
                    }
                    if (dsl13.getIsFirstInit()) {
                        InstallReferrerDataSource installReferrerDataSource9 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                        c144901.L$0 = dsl14;
                        c144901.L$1 = dsl13;
                        c144901.L$2 = null;
                        c144901.label = 10;
                        objInvoke = installReferrerDataSource9.invoke(c144901);
                        if (objInvoke != coroutine_suspended) {
                            dsl15 = dsl13;
                            dsl16 = dsl14;
                            installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                            if (installReferrer != null) {
                                dsl15.setInstallReferrer(installReferrer);
                            }
                            dsl14 = dsl16;
                            dsl13 = dsl15;
                        }
                    }
                    userIdentifier = UnityAds.getUserIdentifier();
                    if (userIdentifier != null) {
                        dsl13.setExternalUserIdentifier(userIdentifier);
                    }
                    return dsl14._build();
                }
                return coroutine_suspended;
            case 9:
                dsl13 = (InitializationRequestKt.Dsl) c144901.L$2;
                dsl14 = (InitializationRequestKt.Dsl) c144901.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                str3 = (String) objInvoke;
                if (str3 != null || str3.length() == 0) {
                    objInvoke = null;
                }
                str4 = (String) objInvoke;
                if (str4 != null) {
                    dsl13.setUnityBuildGuid(str4);
                }
                initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                if (initializationConfiguration != null) {
                    str6 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                    if (str6 != null) {
                        new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public Object get() {
                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(Object obj3) {
                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                            }
                        }.set(byteStringUtf9);
                    }
                    dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                }
                if (!dsl13.hasUadsInitBlob()) {
                    MediationInitBlobMetadataReader mediationInitBlobMetadataReader10 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                    obj = mediationInitBlobMetadataReader10.getJsonStorage().get(mediationInitBlobMetadataReader10.getKey());
                    if (obj != null) {
                        Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        if (obj == null) {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    str5 = (String) obj;
                    if (str5 != null) {
                        new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public Object get() {
                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(Object obj3) {
                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                            }
                        }.set(byteStringUtf8);
                    }
                }
                if (dsl13.getIsFirstInit()) {
                    InstallReferrerDataSource installReferrerDataSource10 = androidGetInitializationRequestPayload3.installReferrerDataSource;
                    c144901.L$0 = dsl14;
                    c144901.L$1 = dsl13;
                    c144901.L$2 = null;
                    c144901.label = 10;
                    objInvoke = installReferrerDataSource10.invoke(c144901);
                    if (objInvoke != coroutine_suspended) {
                        dsl15 = dsl13;
                        dsl16 = dsl14;
                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                        if (installReferrer != null) {
                            dsl15.setInstallReferrer(installReferrer);
                        }
                        dsl14 = dsl16;
                        dsl13 = dsl15;
                    }
                    return coroutine_suspended;
                }
                userIdentifier = UnityAds.getUserIdentifier();
                if (userIdentifier != null) {
                    dsl13.setExternalUserIdentifier(userIdentifier);
                }
                return dsl14._build();
            case 10:
                dsl15 = (InitializationRequestKt.Dsl) c144901.L$1;
                dsl16 = (InitializationRequestKt.Dsl) c144901.L$0;
                ResultKt.throwOnFailure(objInvoke);
                installReferrer = (InitializationRequestOuterClass.InstallReferrer) objInvoke;
                if (installReferrer != null) {
                    dsl15.setInstallReferrer(installReferrer);
                }
                dsl14 = dsl16;
                dsl13 = dsl15;
                userIdentifier = UnityAds.getUserIdentifier();
                if (userIdentifier != null) {
                    dsl13.setExternalUserIdentifier(userIdentifier);
                }
                return dsl14._build();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
