package gatewayprotocol.p299v1;

import com.ironsource.C11366Bc;
import com.ironsource.C11540L6;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClientInfoKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m43475d2 = {"Lgatewayprotocol/v1/ClientInfoKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class ClientInfoKt {
    public static final ClientInfoKt INSTANCE = new ClientInfoKt();

    /* JADX INFO: compiled from: ClientInfoKt.kt */
    @Metadata(m43474d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 h2\u00020\u0001:\u0001hB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010K\u001a\u00020LH\u0001J\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020NJ\u0006\u0010P\u001a\u00020NJ\u0006\u0010Q\u001a\u00020NJ\u0006\u0010R\u001a\u00020NJ\u0006\u0010S\u001a\u00020NJ\u0006\u0010T\u001a\u00020NJ\u0006\u0010U\u001a\u00020NJ\u0006\u0010V\u001a\u00020NJ\u0006\u0010W\u001a\u00020NJ\u0006\u0010X\u001a\u00020NJ\u0006\u0010Y\u001a\u00020NJ\u0006\u0010Z\u001a\u00020NJ\u0006\u0010[\u001a\u00020NJ\u0006\u0010\\\u001a\u00020NJ\u0006\u0010]\u001a\u00020NJ\u0006\u0010^\u001a\u00020\u0012J\u0006\u0010_\u001a\u00020\u0012J\u0006\u0010`\u001a\u00020\u0012J\u0006\u0010a\u001a\u00020\u0012J\u0006\u0010b\u001a\u00020\u0012J\u0006\u0010c\u001a\u00020\u0012J\u0006\u0010d\u001a\u00020\u0012J\u0006\u0010e\u001a\u00020\u0012J\u0006\u0010f\u001a\u00020\u0012J\u0006\u0010g\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R$\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR$\u0010?\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\t\"\u0004\bA\u0010\u000bR$\u0010B\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R$\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR$\u0010H\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0015\"\u0004\bJ\u0010\u0017¨\u0006i"}, m43475d2 = {"Lgatewayprotocol/v1/ClientInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;)V", "value", "", "adQualitySdkVersion", "getAdQualitySdkVersion", "()Ljava/lang/String;", "setAdQualitySdkVersion", "(Ljava/lang/String;)V", "customMediationName", "getCustomMediationName", "setCustomMediationName", AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "setGameId", "", "isFidAvailable", "getIsFidAvailable", "()Z", "setIsFidAvailable", "(Z)V", "mediationAdapterVersion", "getMediationAdapterVersion", "setMediationAdapterVersion", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "", "mediationProviderValue", "getMediationProviderValue", "()I", "setMediationProviderValue", "(I)V", "mediationVersion", "getMediationVersion", "setMediationVersion", "offerwallVersion", "getOfferwallVersion", "setOfferwallVersion", C11366Bc.f23956i, "getOmidPartnerVersion", "setOmidPartnerVersion", C11366Bc.f23954g, "getOmidVersion", "setOmidVersion", "Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", C11540L6.f24917H, "getPlatform", "()Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "setPlatform", "(Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;)V", "platformValue", "getPlatformValue", "setPlatformValue", "scarVersionName", "getScarVersionName", "setScarVersionName", "sdkDevelopmentPlatform", "getSdkDevelopmentPlatform", "setSdkDevelopmentPlatform", "sdkVersion", "getSdkVersion", "setSdkVersion", "sdkVersionName", "getSdkVersionName", "setSdkVersionName", "test", "getTest", "setTest", "_build", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clearAdQualitySdkVersion", "", "clearCustomMediationName", "clearGameId", "clearIsFidAvailable", "clearMediationAdapterVersion", "clearMediationProvider", "clearMediationVersion", "clearOfferwallVersion", "clearOmidPartnerVersion", "clearOmidVersion", "clearPlatform", "clearScarVersionName", "clearSdkDevelopmentPlatform", "clearSdkVersion", "clearSdkVersionName", "clearTest", "hasAdQualitySdkVersion", "hasCustomMediationName", "hasIsFidAvailable", "hasMediationAdapterVersion", "hasMediationVersion", "hasOfferwallVersion", "hasOmidPartnerVersion", "hasOmidVersion", "hasScarVersionName", "hasSdkDevelopmentPlatform", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientInfoOuterClass.ClientInfo.Builder _builder;

        /* JADX INFO: compiled from: ClientInfoKt.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m43475d2 = {"Lgatewayprotocol/v1/ClientInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/ClientInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(ClientInfoOuterClass.ClientInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ClientInfoOuterClass.ClientInfo.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ClientInfoOuterClass.ClientInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ ClientInfoOuterClass.ClientInfo _build() {
            ClientInfoOuterClass.ClientInfo clientInfoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(clientInfoBuild, "_builder.build()");
            return clientInfoBuild;
        }

        public final void clearAdQualitySdkVersion() {
            this._builder.clearAdQualitySdkVersion();
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIsFidAvailable() {
            this._builder.clearIsFidAvailable();
        }

        public final void clearMediationAdapterVersion() {
            this._builder.clearMediationAdapterVersion();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOfferwallVersion() {
            this._builder.clearOfferwallVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        public final String getAdQualitySdkVersion() {
            String adQualitySdkVersion = this._builder.getAdQualitySdkVersion();
            Intrinsics.checkNotNullExpressionValue(adQualitySdkVersion, "_builder.getAdQualitySdkVersion()");
            return adQualitySdkVersion;
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            Intrinsics.checkNotNullExpressionValue(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            Intrinsics.checkNotNullExpressionValue(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final boolean getIsFidAvailable() {
            return this._builder.getIsFidAvailable();
        }

        public final String getMediationAdapterVersion() {
            String mediationAdapterVersion = this._builder.getMediationAdapterVersion();
            Intrinsics.checkNotNullExpressionValue(mediationAdapterVersion, "_builder.getMediationAdapterVersion()");
            return mediationAdapterVersion;
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            Intrinsics.checkNotNullExpressionValue(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            Intrinsics.checkNotNullExpressionValue(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final String getOfferwallVersion() {
            String offerwallVersion = this._builder.getOfferwallVersion();
            Intrinsics.checkNotNullExpressionValue(offerwallVersion, "_builder.getOfferwallVersion()");
            return offerwallVersion;
        }

        public final String getOmidPartnerVersion() {
            String omidPartnerVersion = this._builder.getOmidPartnerVersion();
            Intrinsics.checkNotNullExpressionValue(omidPartnerVersion, "_builder.getOmidPartnerVersion()");
            return omidPartnerVersion;
        }

        public final String getOmidVersion() {
            String omidVersion = this._builder.getOmidVersion();
            Intrinsics.checkNotNullExpressionValue(omidVersion, "_builder.getOmidVersion()");
            return omidVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            Intrinsics.checkNotNullExpressionValue(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final String getScarVersionName() {
            String scarVersionName = this._builder.getScarVersionName();
            Intrinsics.checkNotNullExpressionValue(scarVersionName, "_builder.getScarVersionName()");
            return scarVersionName;
        }

        public final String getSdkDevelopmentPlatform() {
            String sdkDevelopmentPlatform = this._builder.getSdkDevelopmentPlatform();
            Intrinsics.checkNotNullExpressionValue(sdkDevelopmentPlatform, "_builder.getSdkDevelopmentPlatform()");
            return sdkDevelopmentPlatform;
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            Intrinsics.checkNotNullExpressionValue(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasAdQualitySdkVersion() {
            return this._builder.hasAdQualitySdkVersion();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasIsFidAvailable() {
            return this._builder.hasIsFidAvailable();
        }

        public final boolean hasMediationAdapterVersion() {
            return this._builder.hasMediationAdapterVersion();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOfferwallVersion() {
            return this._builder.hasOfferwallVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        public final void setAdQualitySdkVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdQualitySdkVersion(value);
        }

        public final void setCustomMediationName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomMediationName(value);
        }

        public final void setGameId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGameId(value);
        }

        public final void setIsFidAvailable(boolean z) {
            this._builder.setIsFidAvailable(z);
        }

        public final void setMediationAdapterVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationAdapterVersion(value);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationProvider(value);
        }

        public final void setMediationProviderValue(int i) {
            this._builder.setMediationProviderValue(i);
        }

        public final void setMediationVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationVersion(value);
        }

        public final void setOfferwallVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOfferwallVersion(value);
        }

        public final void setOmidPartnerVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOmidPartnerVersion(value);
        }

        public final void setOmidVersion(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOmidVersion(value);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlatform(value);
        }

        public final void setPlatformValue(int i) {
            this._builder.setPlatformValue(i);
        }

        public final void setScarVersionName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setScarVersionName(value);
        }

        public final void setSdkDevelopmentPlatform(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSdkDevelopmentPlatform(value);
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void setSdkVersionName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSdkVersionName(value);
        }

        public final void setTest(boolean z) {
            this._builder.setTest(z);
        }
    }

    private ClientInfoKt() {
    }
}
