package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.p299v1.ClientInfoOuterClass;
import gatewayprotocol.p299v1.LimitedSessionTokenKt;
import gatewayprotocol.p299v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidGetLimitedSessionToken.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1 */
    /* JADX INFO: compiled from: AndroidGetLimitedSessionToken.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken", m43504f = "AndroidGetLimitedSessionToken.kt", m43505i = {0, 0, 1, 1, 2, 2, 3, 3}, m43506l = {19, 20, 21, 22}, m43507m = "invoke", m43508n = {"this", "$this$invoke_u24lambda_u243", "this", "$this$invoke_u24lambda_u243", "this", "$this$invoke_u24lambda_u243", "this", "$this$invoke_u24lambda_u243"}, m43509s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    static final class C144941 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C144941(Continuation<? super C144941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetLimitedSessionToken.this.invoke(this);
        }
    }

    public AndroidGetLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:35:0x0127  */
    /* JADX WARN: Code duplicated, block: B:38:0x0143  */
    /* JADX WARN: Code duplicated, block: B:46:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    public Object invoke(Continuation<? super UniversalRequestOuterClass.LimitedSessionToken> continuation) throws Throwable {
        C144941 c144941;
        LimitedSessionTokenKt.Dsl dsl_create;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken;
        LimitedSessionTokenKt.Dsl dsl;
        LimitedSessionTokenKt.Dsl dsl2;
        LimitedSessionTokenKt.Dsl dsl3;
        LimitedSessionTokenKt.Dsl dsl4;
        LimitedSessionTokenKt.Dsl dsl5;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken2;
        LimitedSessionTokenKt.Dsl dsl6;
        LimitedSessionTokenKt.Dsl dsl7;
        LimitedSessionTokenKt.Dsl dsl8;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken3;
        LimitedSessionTokenKt.Dsl dsl9;
        LimitedSessionTokenKt.Dsl dsl10;
        LimitedSessionTokenKt.Dsl dsl11;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken4;
        String gameId;
        String name;
        String version;
        if (continuation instanceof C144941) {
            c144941 = (C144941) continuation;
            if ((c144941.label & Integer.MIN_VALUE) != 0) {
                c144941.label -= Integer.MIN_VALUE;
            } else {
                c144941 = new C144941(continuation);
            }
        } else {
            c144941 = new C144941(continuation);
        }
        Object objStaticDeviceInfo = c144941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c144941.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objStaticDeviceInfo);
            LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            dsl_create.setSessionId(this.sessionRepository.getSessionId());
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            c144941.L$0 = this;
            c144941.L$1 = dsl_create;
            c144941.L$2 = dsl_create;
            c144941.L$3 = dsl_create;
            c144941.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(c144941);
            if (objStaticDeviceInfo != coroutine_suspended) {
                androidGetLimitedSessionToken = this;
                dsl = dsl_create;
                dsl2 = dsl;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            dsl_create = (LimitedSessionTokenKt.Dsl) c144941.L$3;
            dsl = (LimitedSessionTokenKt.Dsl) c144941.L$2;
            dsl2 = (LimitedSessionTokenKt.Dsl) c144941.L$1;
            androidGetLimitedSessionToken = (AndroidGetLimitedSessionToken) c144941.L$0;
            ResultKt.throwOnFailure(objStaticDeviceInfo);
        } else {
            if (i == 2) {
                dsl3 = (LimitedSessionTokenKt.Dsl) c144941.L$3;
                dsl4 = (LimitedSessionTokenKt.Dsl) c144941.L$2;
                dsl5 = (LimitedSessionTokenKt.Dsl) c144941.L$1;
                androidGetLimitedSessionToken2 = (AndroidGetLimitedSessionToken) c144941.L$0;
                ResultKt.throwOnFailure(objStaticDeviceInfo);
                String deviceModel = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
                Intrinsics.checkNotNullExpressionValue(deviceModel, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
                dsl3.setDeviceModel(deviceModel);
                DeviceInfoRepository deviceInfoRepository2 = androidGetLimitedSessionToken2.deviceInfoRepository;
                c144941.L$0 = androidGetLimitedSessionToken2;
                c144941.L$1 = dsl5;
                c144941.L$2 = dsl4;
                c144941.L$3 = dsl4;
                c144941.label = 3;
                objStaticDeviceInfo = deviceInfoRepository2.staticDeviceInfo(c144941);
                if (objStaticDeviceInfo != coroutine_suspended) {
                    dsl6 = dsl4;
                    dsl7 = dsl6;
                    dsl8 = dsl5;
                    androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                    String osVersion = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                    Intrinsics.checkNotNullExpressionValue(osVersion, "deviceInfoRepository.staticDeviceInfo().osVersion");
                    dsl6.setOsVersion(osVersion);
                    DeviceInfoRepository deviceInfoRepository3 = androidGetLimitedSessionToken3.deviceInfoRepository;
                    c144941.L$0 = androidGetLimitedSessionToken3;
                    c144941.L$1 = dsl8;
                    c144941.L$2 = dsl7;
                    c144941.L$3 = dsl7;
                    c144941.label = 4;
                    objStaticDeviceInfo = deviceInfoRepository3.getIdfi(c144941);
                    if (objStaticDeviceInfo != coroutine_suspended) {
                        dsl9 = dsl7;
                        dsl10 = dsl9;
                        dsl11 = dsl8;
                        androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
                    }
                }
                return coroutine_suspended;
            }
            if (i == 3) {
                dsl6 = (LimitedSessionTokenKt.Dsl) c144941.L$3;
                dsl7 = (LimitedSessionTokenKt.Dsl) c144941.L$2;
                dsl8 = (LimitedSessionTokenKt.Dsl) c144941.L$1;
                androidGetLimitedSessionToken3 = (AndroidGetLimitedSessionToken) c144941.L$0;
                ResultKt.throwOnFailure(objStaticDeviceInfo);
                String osVersion2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                Intrinsics.checkNotNullExpressionValue(osVersion2, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion2);
                DeviceInfoRepository deviceInfoRepository4 = androidGetLimitedSessionToken3.deviceInfoRepository;
                c144941.L$0 = androidGetLimitedSessionToken3;
                c144941.L$1 = dsl8;
                c144941.L$2 = dsl7;
                c144941.L$3 = dsl7;
                c144941.label = 4;
                objStaticDeviceInfo = deviceInfoRepository4.getIdfi(c144941);
                if (objStaticDeviceInfo != coroutine_suspended) {
                    dsl9 = dsl7;
                    dsl10 = dsl9;
                    dsl11 = dsl8;
                    androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
                }
                return coroutine_suspended;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl9 = (LimitedSessionTokenKt.Dsl) c144941.L$3;
            dsl10 = (LimitedSessionTokenKt.Dsl) c144941.L$2;
            dsl11 = (LimitedSessionTokenKt.Dsl) c144941.L$1;
            androidGetLimitedSessionToken4 = (AndroidGetLimitedSessionToken) c144941.L$0;
            ResultKt.throwOnFailure(objStaticDeviceInfo);
        }
        dsl9.setIdfi((String) objStaticDeviceInfo);
        dsl10.setSdkVersion(41700);
        dsl10.setSdkVersionName("4.17.0");
        gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
        if (gameId != null) {
            dsl10.setGameId(gameId);
        }
        dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
        name = androidGetLimitedSessionToken4.mediationRepository.getName();
        if (name != null && dsl10.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            dsl10.setCustomMediationName(name);
        }
        version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
        if (version != null) {
            dsl10.setMediationVersion(version);
        }
        return dsl11._build();
        String deviceMake = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceMake();
        Intrinsics.checkNotNullExpressionValue(deviceMake, "deviceInfoRepository.staticDeviceInfo().deviceMake");
        dsl_create.setDeviceMake(deviceMake);
        DeviceInfoRepository deviceInfoRepository5 = androidGetLimitedSessionToken.deviceInfoRepository;
        c144941.L$0 = androidGetLimitedSessionToken;
        c144941.L$1 = dsl2;
        c144941.L$2 = dsl;
        c144941.L$3 = dsl;
        c144941.label = 2;
        objStaticDeviceInfo = deviceInfoRepository5.staticDeviceInfo(c144941);
        if (objStaticDeviceInfo != coroutine_suspended) {
            dsl3 = dsl;
            dsl4 = dsl3;
            dsl5 = dsl2;
            androidGetLimitedSessionToken2 = androidGetLimitedSessionToken;
            String deviceModel2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
            Intrinsics.checkNotNullExpressionValue(deviceModel2, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
            dsl3.setDeviceModel(deviceModel2);
            DeviceInfoRepository deviceInfoRepository6 = androidGetLimitedSessionToken2.deviceInfoRepository;
            c144941.L$0 = androidGetLimitedSessionToken2;
            c144941.L$1 = dsl5;
            c144941.L$2 = dsl4;
            c144941.L$3 = dsl4;
            c144941.label = 3;
            objStaticDeviceInfo = deviceInfoRepository6.staticDeviceInfo(c144941);
            if (objStaticDeviceInfo != coroutine_suspended) {
                dsl6 = dsl4;
                dsl7 = dsl6;
                dsl8 = dsl5;
                androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                String osVersion3 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                Intrinsics.checkNotNullExpressionValue(osVersion3, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion3);
                DeviceInfoRepository deviceInfoRepository7 = androidGetLimitedSessionToken3.deviceInfoRepository;
                c144941.L$0 = androidGetLimitedSessionToken3;
                c144941.L$1 = dsl8;
                c144941.L$2 = dsl7;
                c144941.L$3 = dsl7;
                c144941.label = 4;
                objStaticDeviceInfo = deviceInfoRepository7.getIdfi(c144941);
                if (objStaticDeviceInfo != coroutine_suspended) {
                    dsl9 = dsl7;
                    dsl10 = dsl9;
                    dsl11 = dsl8;
                    androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
                    dsl9.setIdfi((String) objStaticDeviceInfo);
                    dsl10.setSdkVersion(41700);
                    dsl10.setSdkVersionName("4.17.0");
                    gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
                    if (gameId != null) {
                        dsl10.setGameId(gameId);
                    }
                    dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                    dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
                    name = androidGetLimitedSessionToken4.mediationRepository.getName();
                    if (name != null) {
                        dsl10.setCustomMediationName(name);
                    }
                    version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
                    if (version != null) {
                        dsl10.setMediationVersion(version);
                    }
                    return dsl11._build();
                }
            }
        }
        return coroutine_suspended;
    }
}
