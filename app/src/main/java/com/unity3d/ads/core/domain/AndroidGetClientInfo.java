package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import gatewayprotocol.p299v1.ClientInfoKt;
import gatewayprotocol.p299v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AndroidGetClientInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetClientInfo;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "fIdExistenceDataSource", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;Lcom/unity3d/ads/core/data/manager/OmidManager;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;)V", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetClientInfo implements GetClientInfo {
    private final FIdExistenceDataSource fIdExistenceDataSource;
    private final MediationRepository mediationRepository;
    private final OfferwallManager offerwallManager;
    private final OmidManager omidManager;
    private final ScarManager scarManager;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1 */
    /* JADX INFO: compiled from: AndroidGetClientInfo.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidGetClientInfo", m43504f = "AndroidGetClientInfo.kt", m43505i = {0, 0, 1, 1}, m43506l = {42, 45}, m43507m = "invoke", m43508n = {"this", "$this$invoke_u24lambda_u245", "this", "$this$invoke_u24lambda_u245"}, m43509s = {"L$0", "L$2", "L$0", "L$2"})
    static final class C144861 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C144861(Continuation<? super C144861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetClientInfo.this.invoke(this);
        }
    }

    public AndroidGetClientInfo(SessionRepository sessionRepository, MediationRepository mediationRepository, OmidManager omidManager, ScarManager scarManager, OfferwallManager offerwallManager, FIdExistenceDataSource fIdExistenceDataSource) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(fIdExistenceDataSource, "fIdExistenceDataSource");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    public Object invoke(Continuation<? super ClientInfoOuterClass.ClientInfo> continuation) throws Throwable {
        C144861 c144861;
        AndroidGetClientInfo androidGetClientInfo;
        ClientInfoKt.Dsl dsl;
        ClientInfoKt.Dsl dsl2;
        ClientInfoKt.Dsl dsl3;
        ClientInfoKt.Dsl dsl4;
        AndroidGetClientInfo androidGetClientInfo2;
        String str;
        String str2;
        if (continuation instanceof C144861) {
            c144861 = (C144861) continuation;
            if ((c144861.label & Integer.MIN_VALUE) != 0) {
                c144861.label -= Integer.MIN_VALUE;
            } else {
                c144861 = new C144861(continuation);
            }
        } else {
            c144861 = new C144861(continuation);
        }
        Object version = c144861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c144861.label;
        if (i != 0) {
            if (i == 1) {
                dsl2 = (ClientInfoKt.Dsl) c144861.L$2;
                dsl = (ClientInfoKt.Dsl) c144861.L$1;
                androidGetClientInfo = (AndroidGetClientInfo) c144861.L$0;
                ResultKt.throwOnFailure(version);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl3 = (ClientInfoKt.Dsl) c144861.L$2;
                dsl4 = (ClientInfoKt.Dsl) c144861.L$1;
                androidGetClientInfo2 = (AndroidGetClientInfo) c144861.L$0;
                ResultKt.throwOnFailure(version);
            }
            str = (String) version;
            if (str != null) {
                dsl3.setOfferwallVersion(str);
            }
            dsl3.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
            dsl3.setOmidPartnerVersion("1");
            if (MadeWithUnityDetector.isMadeWithUnity()) {
                str2 = "Unity";
            } else {
                str2 = "";
            }
            dsl3.setSdkDevelopmentPlatform(str2);
            dsl3.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
            return dsl4._build();
        }
        ResultKt.throwOnFailure(version);
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.INSTANCE;
        ClientInfoOuterClass.ClientInfo.Builder builderNewBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ClientInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSdkVersion(41700);
        dsl_create.setSdkVersionName("4.17.0");
        String gameId = this.sessionRepository.getGameId();
        if (gameId != null) {
            dsl_create.setGameId(gameId);
        }
        dsl_create.setTest(this.sessionRepository.isTestModeEnabled());
        dsl_create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl_create.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
        String name = this.mediationRepository.getName();
        if (name != null && dsl_create.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM && !StringsKt.isBlank(name)) {
            dsl_create.setCustomMediationName(name);
        }
        String version2 = this.mediationRepository.getVersion();
        if (version2 != null) {
            dsl_create.setMediationVersion(version2);
        }
        ScarManager scarManager = this.scarManager;
        c144861.L$0 = this;
        c144861.L$1 = dsl_create;
        c144861.L$2 = dsl_create;
        c144861.label = 1;
        Object version3 = scarManager.getVersion(c144861);
        if (version3 != coroutine_suspended) {
            androidGetClientInfo = this;
            dsl = dsl_create;
            version = version3;
            dsl2 = dsl;
        }
        return coroutine_suspended;
        String str3 = (String) version;
        if (str3 != null) {
            dsl2.setScarVersionName(str3);
        }
        OfferwallManager offerwallManager = androidGetClientInfo.offerwallManager;
        c144861.L$0 = androidGetClientInfo;
        c144861.L$1 = dsl;
        c144861.L$2 = dsl2;
        c144861.label = 2;
        version = offerwallManager.getVersion(c144861);
        if (version != coroutine_suspended) {
            dsl3 = dsl2;
            dsl4 = dsl;
            androidGetClientInfo2 = androidGetClientInfo;
            str = (String) version;
            if (str != null) {
                dsl3.setOfferwallVersion(str);
            }
            dsl3.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
            dsl3.setOmidPartnerVersion("1");
            if (MadeWithUnityDetector.isMadeWithUnity()) {
                str2 = "Unity";
            } else {
                str2 = "";
            }
            dsl3.setSdkDevelopmentPlatform(str2);
            dsl3.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
            return dsl4._build();
        }
        return coroutine_suspended;
    }
}
