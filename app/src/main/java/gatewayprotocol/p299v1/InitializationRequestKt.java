package gatewayprotocol.p299v1;

import com.facebook.share.internal.ShareConstants;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InitializationRequestKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m43475d2 = {"Lgatewayprotocol/v1/InitializationRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    /* JADX INFO: compiled from: InitializationRequestKt.kt */
    @Metadata(m43474d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u0000 \u0082\u00012\u00020\u0001:\u0004\u0082\u0001\u0083\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010S\u001a\u00020TH\u0001J\u0006\u0010U\u001a\u00020VJ\u0006\u0010W\u001a\u00020VJ\u0006\u0010X\u001a\u00020VJ\u0006\u0010Y\u001a\u00020VJ\u0006\u0010Z\u001a\u00020VJ\u0006\u0010[\u001a\u00020VJ\u0006\u0010\\\u001a\u00020VJ\u0006\u0010]\u001a\u00020VJ\u0006\u0010^\u001a\u00020VJ\u0006\u0010_\u001a\u00020VJ\u0006\u0010`\u001a\u00020VJ\u0006\u0010a\u001a\u00020VJ\u0006\u0010b\u001a\u00020VJ\u0006\u0010c\u001a\u00020VJ\u0006\u0010d\u001a\u00020VJ\u0006\u0010e\u001a\u00020VJ\u0006\u0010f\u001a\u00020VJ\u0006\u0010g\u001a\u000205J\u0006\u0010h\u001a\u000205J\u0006\u0010i\u001a\u000205J\u0006\u0010j\u001a\u000205J\u0006\u0010k\u001a\u000205J\u0006\u0010l\u001a\u000205J\u0006\u0010m\u001a\u000205J\u0006\u0010n\u001a\u000205J\u0006\u0010o\u001a\u000205J\u0006\u0010p\u001a\u000205J\u0006\u0010q\u001a\u000205J\u0006\u0010r\u001a\u000205J\u0006\u0010s\u001a\u000205J\u0006\u0010t\u001a\u000205J#\u0010u\u001a\u00020V*\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0(H\u0007¢\u0006\u0002\bvJ3\u0010w\u001a\u00020V*\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0(2\u0006\u0010x\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\byJ7\u0010z\u001a\u00020V*\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0(2\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060|H\u0007¢\u0006\u0002\b}J+\u0010~\u001a\u00020V*\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0(2\u0006\u0010x\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u007fJ6\u0010\u0080\u0001\u001a\u00020V*\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0(2\u0006\u0010x\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\n¢\u0006\u0003\b\u0081\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR#\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0(8G¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR$\u00100\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00106\u001a\u0002052\u0006\u0010\u0005\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000bR$\u0010>\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R$\u0010A\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R$\u0010D\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u000f\"\u0004\bF\u0010\u0011R$\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010\t\"\u0004\bI\u0010\u000bR$\u0010J\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u000f\"\u0004\bL\u0010\u0011R$\u0010M\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u000f\"\u0004\bO\u0010\u0011R\u0017\u0010P\u001a\u0004\u0018\u00010/*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006\u0084\u0001"}, m43475d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;)V", "value", "", "analyticsUserId", "getAnalyticsUserId", "()Ljava/lang/String;", "setAnalyticsUserId", "(Ljava/lang/String;)V", "Lcom/google/protobuf/ByteString;", "auid", "getAuid", "()Lcom/google/protobuf/ByteString;", "setAuid", "(Lcom/google/protobuf/ByteString;)V", "auidString", "getAuidString", "setAuidString", "cache", "getCache", "setCache", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfo", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "deviceInfo", "getDeviceInfo", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "setDeviceInfo", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;)V", "externalUserIdentifier", "getExternalUserIdentifier", "setExternalUserIdentifier", "extras", "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "idfi", "getIdfi", "setIdfi", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "installReferrer", "getInstallReferrer", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "setInstallReferrer", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;)V", "", "isFirstInit", "getIsFirstInit", "()Z", "setIsFirstInit", "(Z)V", "legacyFlowUserConsent", "getLegacyFlowUserConsent", "setLegacyFlowUserConsent", ShareConstants.WEB_DIALOG_PARAM_PRIVACY, "getPrivacy", "setPrivacy", JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "setSessionId", "uadsInitBlob", "getUadsInitBlob", "setUadsInitBlob", "unityBuildGuid", "getUnityBuildGuid", "setUnityBuildGuid", "unityInstallationId", "getUnityInstallationId", "setUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "setUnityMegaSessionId", "installReferrerOrNull", "getInstallReferrerOrNull", "(Lgatewayprotocol/v1/InitializationRequestKt$Dsl;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "_build", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "clearAnalyticsUserId", "", "clearAuid", "clearAuidString", "clearCache", "clearClientInfo", "clearDeviceInfo", "clearExternalUserIdentifier", "clearIdfi", "clearInstallReferrer", "clearIsFirstInit", "clearLegacyFlowUserConsent", "clearPrivacy", "clearSessionId", "clearUadsInitBlob", "clearUnityBuildGuid", "clearUnityInstallationId", "clearUnityMegaSessionId", "hasAnalyticsUserId", "hasAuid", "hasAuidString", "hasCache", "hasClientInfo", "hasDeviceInfo", "hasExternalUserIdentifier", "hasInstallReferrer", "hasLegacyFlowUserConsent", "hasPrivacy", "hasUadsInitBlob", "hasUnityBuildGuid", "hasUnityInstallationId", "hasUnityMegaSessionId", "clear", "clearExtras", "put", "key", "putExtras", "putAll", "map", "", "putAllExtras", "remove", "removeExtras", "set", "setExtras", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        /* JADX INFO: compiled from: InitializationRequestKt.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m43475d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: InitializationRequestKt.kt */
        @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest initializationRequestBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(initializationRequestBuild, "_builder.build()");
            return initializationRequestBuild;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearInstallReferrer() {
            this._builder.clearInstallReferrer();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            Intrinsics.checkNotNullExpressionValue(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            Intrinsics.checkNotNullExpressionValue(auid, "_builder.getAuid()");
            return auid;
        }

        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            Intrinsics.checkNotNullExpressionValue(auidString, "_builder.getAuidString()");
            return auidString;
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            Intrinsics.checkNotNullExpressionValue(cache, "_builder.getCache()");
            return cache;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            Intrinsics.checkNotNullExpressionValue(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            Intrinsics.checkNotNullExpressionValue(externalUserIdentifier, "_builder.getExternalUserIdentifier()");
            return externalUserIdentifier;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            Intrinsics.checkNotNullExpressionValue(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            Intrinsics.checkNotNullExpressionValue(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrer() {
            InitializationRequestOuterClass.InstallReferrer installReferrer = this._builder.getInstallReferrer();
            Intrinsics.checkNotNullExpressionValue(installReferrer, "_builder.getInstallReferrer()");
            return installReferrer;
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return InitializationRequestKtKt.getInstallReferrerOrNull(dsl._builder);
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            Intrinsics.checkNotNullExpressionValue(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            Intrinsics.checkNotNullExpressionValue(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            Intrinsics.checkNotNullExpressionValue(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            Intrinsics.checkNotNullExpressionValue(uadsInitBlob, "_builder.getUadsInitBlob()");
            return uadsInitBlob;
        }

        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            Intrinsics.checkNotNullExpressionValue(unityBuildGuid, "_builder.getUnityBuildGuid()");
            return unityBuildGuid;
        }

        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            Intrinsics.checkNotNullExpressionValue(unityInstallationId, "_builder.getUnityInstallationId()");
            return unityInstallationId;
        }

        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            Intrinsics.checkNotNullExpressionValue(unityMegaSessionId, "_builder.getUnityMegaSessionId()");
            return unityMegaSessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasInstallReferrer() {
            return this._builder.hasInstallReferrer();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllExtras(map);
        }

        public final void putExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeExtras(key);
        }

        public final void setAnalyticsUserId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        public final void setAuid(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAuid(value);
        }

        public final void setAuidString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAuidString(value);
        }

        public final void setCache(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCache(value);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceInfo(value);
        }

        public final void setExternalUserIdentifier(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setExternalUserIdentifier(value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setIdfi(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setInstallReferrer(InitializationRequestOuterClass.InstallReferrer value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInstallReferrer(value);
        }

        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        public final void setLegacyFlowUserConsent(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        public final void setPrivacy(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setSessionId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionId(value);
        }

        public final void setUadsInitBlob(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUadsInitBlob(value);
        }

        public final void setUnityBuildGuid(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUnityBuildGuid(value);
        }

        public final void setUnityInstallationId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUnityInstallationId(value);
        }

        public final void setUnityMegaSessionId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUnityMegaSessionId(value);
        }
    }

    private InitializationRequestKt() {
    }
}
