package com.vungle.ads.internal;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C12305ld;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidEndpointError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: ConfigManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\u0006\u0010%\u001a\u00020\u0007J8\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020#0*H\u0000¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\u001eJ\u0006\u00100\u001a\u00020\fJ\u0006\u00101\u001a\u00020\fJ\u0018\u00102\u001a\u0004\u0018\u00010\u000f2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\fJ\u0006\u00106\u001a\u00020\u0004J\u0006\u00107\u001a\u00020\u0007J\u0006\u00108\u001a\u00020\fJ\u0006\u00109\u001a\u00020\fJ\b\u0010:\u001a\u0004\u0018\u00010\fJ\b\u0010;\u001a\u0004\u0018\u00010\fJ\b\u0010<\u001a\u0004\u0018\u00010\fJ\u0006\u0010=\u001a\u00020\fJ\b\u0010>\u001a\u0004\u0018\u00010\fJ\u0006\u0010?\u001a\u00020\u001eJ\u0006\u0010@\u001a\u00020\u0004J\u0006\u0010A\u001a\u00020\u001eJ\u0006\u0010B\u001a\u00020\fJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001b2\b\u0010D\u001a\u0004\u0018\u00010\fJ\b\u0010E\u001a\u0004\u0018\u00010\fJ\u0006\u0010F\u001a\u00020\u0007J\u0006\u0010G\u001a\u00020\u0007J\b\u0010H\u001a\u0004\u0018\u00010IJ3\u0010J\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010K\u001a\u00020\u001e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0000¢\u0006\u0002\bNJ\u0006\u0010O\u001a\u00020\u001eJ\u0006\u0010P\u001a\u00020\u001eJ\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ\u0006\u0010Q\u001a\u00020\u001eJ\u0015\u0010R\u001a\u00020#2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0002\bSJ\u0006\u0010T\u001a\u00020\u001eJ\u0006\u0010U\u001a\u00020\u001eJ\u0016\u0010V\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00103\u001a\u000204J\u001d\u0010W\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010X\u001a\u00020\fH\u0001¢\u0006\u0002\bYJ\u0017\u0010Z\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b[J\u0019\u0010\\\u001a\u00020\u001e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\b]R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^²\u0006\n\u0010_\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u0010_\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u0010a\u001a\u00020bX\u008a\u0084\u0002"}, m43475d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "()V", "CONFIG_ALL_DATA", "", "CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY", "CONFIG_LAST_VALIDATE_TS_DEFAULT", "", "CONFIG_NOT_AVAILABLE", "DEFAULT_SESSION_TIMEOUT_SECONDS", "DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS", "TAG", "", "applicationId", "config", "Lcom/vungle/ads/internal/model/ConfigPayload;", "configExt", "endpoints", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json$delegate", "Lkotlin/Lazy;", C12305ld.f30863c, "", "Lcom/vungle/ads/internal/model/Placement;", "afterClickDuration", "allowAutoRedirects", "", "checkConfigPayload", "configPayload", "checkConfigPayload$vungle_ads_release", "clearConfig", "", "clearConfig$vungle_ads_release", "configLastValidatedTimestamp", "fetchConfigAsync", "context", "Landroid/content/Context;", com.hbisoft.hbrecorder.Constants.ON_COMPLETE_KEY, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "fetchConfigAsync$vungle_ads_release", "fpdEnabled", "getAdsEndpoint", "getCSBEndpoint", "getCachedConfig", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", RemoteConfigConstants.RequestFieldKey.APP_ID, "getCleverCacheDiskPercentage", "getCleverCacheDiskSize", "getConfigExtension", "getErrorLoggingEndpoint", "getGDPRButtonAccept", "getGDPRButtonDeny", "getGDPRConsentMessage", "getGDPRConsentMessageVersion", "getGDPRConsentTitle", "getGDPRIsCountryDataProtected", "getLogLevel", "getMetricsEnabled", "getMetricsEndpoint", "getPlacement", "id", "getRiEndpoint", "getSessionTimeout", "getSignalsSessionTimeout", "getTcfStatus", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "initWithConfig", "fromCachedConfig", "metric", "Lcom/vungle/ads/SingleValueMetric;", "initWithConfig$vungle_ads_release", "isReportIncentivizedEnabled", "otEnabled", "rtaDebuggingEnabled", "setAppId", "setAppId$vungle_ads_release", "shouldDisableAdId", "signalsDisabled", "updateCachedConfig", "updateConfigExtension", "ext", "updateConfigExtension$vungle_ads_release", "validateConfig", "validateConfig$vungle_ads_release", "validateEndpoints", "validateEndpoints$vungle_ads_release", "vungle-ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class ConfigManager {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    private static ConfigPayload config;
    private static String configExt;
    private static ConfigPayload.Endpoints endpoints;
    private static List<Placement> placements;
    public static final ConfigManager INSTANCE = new ConfigManager();

    /* JADX INFO: renamed from: json$delegate, reason: from kotlin metadata */
    private static final Lazy json = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Json>() { // from class: com.vungle.ads.internal.ConfigManager$json$2
        @Override // kotlin.jvm.functions.Function0
        public final Json invoke() {
            return JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.ConfigManager$json$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                    invoke2(jsonBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(JsonBuilder Json) {
                    Intrinsics.checkNotNullParameter(Json, "$this$Json");
                    Json.setIgnoreUnknownKeys(true);
                    Json.setEncodeDefaults(true);
                    Json.setExplicitNulls(false);
                }
            }, 1, null);
        }
    });

    private ConfigManager() {
    }

    /* JADX INFO: renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final VungleApiClient m44759fetchConfigAsync$lambda0(Lazy<VungleApiClient> lazy) {
        return lazy.getValue();
    }

    private final Json getJson() {
        return (Json) json.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final FilePreferences m44760initWithConfig$lambda2(Lazy<FilePreferences> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final VungleApiClient m44761initWithConfig$lambda4(Lazy<VungleApiClient> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final Executors m44762initWithConfig$lambda5(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(ConfigManager configManager, Context context, ConfigPayload configPayload, boolean z, SingleValueMetric singleValueMetric, int i, Object obj) {
        if ((i & 8) != 0) {
            singleValueMetric = null;
        }
        configManager.initWithConfig$vungle_ads_release(context, configPayload, z, singleValueMetric);
    }

    /* JADX INFO: renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final FilePreferences m44763updateConfigExtension$lambda1(Lazy<FilePreferences> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(ConfigManager configManager, ConfigPayload.Endpoints endpoints2, int i, Object obj) {
        if ((i & 1) != 0) {
            endpoints2 = endpoints;
        }
        return configManager.validateEndpoints$vungle_ads_release(endpoints2);
    }

    public final long afterClickDuration() {
        ConfigPayload.AutoRedirect autoRedirect;
        Long afterClickDuration;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        ConfigPayload.AutoRedirect autoRedirect;
        Boolean allowAutoRedirect;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    public final int checkConfigPayload$vungle_ads_release(ConfigPayload configPayload) {
        Long configLastValidatedTimestamp;
        if (configPayload == null || configPayload.getConfigLastValidatedTimestamp() == null || ((configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) != null && configLastValidatedTimestamp.longValue() == -1)) {
            return 0;
        }
        return configPayload.getEndpoints() == null ? 1 : 2;
    }

    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        ConfigPayload configPayload = config;
        if (configPayload == null || (configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(final Context context, final Function1<? super Boolean, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        try {
            Call<ConfigPayload> callConfig = m44759fetchConfigAsync$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            })).config();
            if (callConfig != null) {
                callConfig.enqueue(new Callback<ConfigPayload>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$1
                    @Override // com.vungle.ads.internal.network.Callback
                    public void onFailure(Call<ConfigPayload> call, Throwable t) {
                        StringBuilder sb = new StringBuilder("Error while fetching config: ");
                        sb.append(t != null ? t.getMessage() : null);
                        new NetworkUnreachable(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(false);
                    }

                    @Override // com.vungle.ads.internal.network.Callback
                    public void onResponse(Call<ConfigPayload> call, Response<ConfigPayload> response) {
                        if (response != null && response.isSuccessful() && response.body() != null) {
                            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(context, response.body(), false, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
                            onComplete.invoke(true);
                        } else {
                            StringBuilder sb = new StringBuilder("config API: ");
                            sb.append(response != null ? Integer.valueOf(response.code()) : null);
                            new APIFailedStatusCodeError(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
                            onComplete.invoke(false);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new NetworkUnreachable("Config unknown: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable("Config: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(false);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (fpdEnabled = configPayload.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        String str2 = adsEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    public final String getCSBEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String csbEndpoint = endpoints2 != null ? endpoints2.getCsbEndpoint() : null;
        String str2 = csbEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = csbEndpoint;
        }
        return str == null ? Constants.DEFAULT_CSB_ENDPOINT : str;
    }

    public final ConfigPayload getCachedConfig(FilePreferences filePreferences, String appId) {
        Long refreshTime;
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        Intrinsics.checkNotNullParameter(appId, "appId");
        try {
            String string = filePreferences.getString(Cookie.CONFIG_APP_ID);
            String str = string;
            if (str != null && str.length() != 0 && StringsKt.equals(string, appId, true)) {
                String string2 = filePreferences.getString(Cookie.CONFIG_RESPONSE);
                if (string2 == null) {
                    return null;
                }
                long j = filePreferences.getLong(Cookie.CONFIG_UPDATE_TIME, 0L);
                Json json2 = INSTANCE.getJson();
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(ConfigPayload.class));
                Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                ConfigPayload configPayload = (ConfigPayload) json2.decodeFromString(kSerializerSerializer, string2);
                ConfigPayload.ConfigSettings configSettings = configPayload.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j < System.currentTimeMillis()) {
                    Logger.INSTANCE.m43471w(TAG, "cache config expired. re-config");
                    return null;
                }
                Logger.INSTANCE.m43471w(TAG, "use cache config.");
                return configPayload;
            }
            Logger.INSTANCE.m43471w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e) {
            Logger.INSTANCE.m43468e(TAG, "Error while parsing cached config: " + e.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        ConfigPayload.CleverCache cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        ConfigPayload.CleverCache cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j = 1024;
        return diskSize.longValue() * j * j;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        String str2 = errorLogsEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? Constants.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final String getGDPRButtonAccept() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        return (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        Boolean boolIsCountryDataProtected;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Integer errorLogLevel;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Boolean metricsEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str = null;
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        String str2 = metricsEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? Constants.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final Placement getPlacement(String id) {
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((Placement) obj2).getReferenceId(), id)) {
                obj = obj2;
                break;
            }
        }
        return (Placement) obj;
    }

    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (sessionTimeout = configPayload.getSessionTimeout()) == null) ? 900 : sessionTimeout.intValue())) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue())) * 1000;
    }

    public final ConfigPayload.IABSettings.TcfStatus getTcfStatus() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.IABSettings iab;
        ConfigPayload.IABSettings.TcfStatus.Companion companion = ConfigPayload.IABSettings.TcfStatus.INSTANCE;
        ConfigPayload configPayload = config;
        return companion.fromRawValue((configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(final Context context, ConfigPayload config2, boolean fromCachedConfig, SingleValueMetric metric) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final FilePreferences invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
                }
            });
            int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(config2);
            if (iCheckConfigPayload$vungle_ads_release == 0) {
                Logger.INSTANCE.m43468e(TAG, "Config is not available.");
                return;
            }
            if (iCheckConfigPayload$vungle_ads_release == 1) {
                if (!fromCachedConfig && config2 != null) {
                    Long configLastValidatedTimestamp = config2.getConfigLastValidatedTimestamp();
                    long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                    ConfigPayload configPayload = config;
                    if (configPayload != null) {
                        configPayload.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                    }
                    ConfigPayload configPayload2 = config;
                    if (configPayload2 != null) {
                        INSTANCE.updateCachedConfig(configPayload2, m44760initWithConfig$lambda2(lazy));
                    }
                }
                return;
            }
            config = config2;
            endpoints = config2 != null ? config2.getEndpoints() : null;
            placements = config2 != null ? config2.getPlacements() : null;
            int logLevel = getLogLevel();
            boolean metricsEnabled = getMetricsEnabled();
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            });
            ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
            AnalyticsClient.INSTANCE.initOrUpdate$vungle_ads_release(m44761initWithConfig$lambda4(lazy2), m44762initWithConfig$lambda5(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            })).getLOGGER_EXECUTOR(), logLevel, metricsEnabled);
            if (!fromCachedConfig && config2 != null) {
                updateCachedConfig(config2, m44760initWithConfig$lambda2(lazy));
                String configExtension = config2.getConfigExtension();
                if (configExtension != null) {
                    INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                }
            }
            if (metric != null) {
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, metric, (LogEntry) null, (String) null, 6, (Object) null);
            }
            PrivacyManager.INSTANCE.updateDisableAdId(shouldDisableAdId());
        } catch (Exception e) {
            Logger.INSTANCE.m43468e(TAG, "Error while validating config: " + e.getMessage());
        }
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (boolIsReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean otEnabled() {
        Boolean enableOT;
        ConfigPayload configPayload = config;
        if (configPayload == null || (enableOT = configPayload.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(String applicationId2) {
        Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(ConfigPayload config2, FilePreferences filePreferences) {
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationId");
                str = null;
            }
            filePreferences.put(Cookie.CONFIG_APP_ID, str);
            filePreferences.put(Cookie.CONFIG_UPDATE_TIME, System.currentTimeMillis());
            Json json2 = getJson();
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(ConfigPayload.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(Cookie.CONFIG_RESPONSE, json2.encodeToString(kSerializerSerializer, config2));
            filePreferences.apply();
        } catch (Exception e) {
            Logger.INSTANCE.m43468e(TAG, "Exception: " + e.getMessage() + " for updating cached config");
        }
    }

    public final void updateConfigExtension$vungle_ads_release(final Context context, String ext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        m44763updateConfigExtension$lambda1(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$updateConfigExtension$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final FilePreferences invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
            }
        })).put(Cookie.CONFIG_EXTENSION, ext).apply();
    }

    public final boolean validateConfig$vungle_ads_release(ConfigPayload configPayload) {
        return ((configPayload != null ? configPayload.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(configPayload.getEndpoints()) || configPayload.getPlacements() == null) ? false : true;
    }

    public final boolean validateEndpoints$vungle_ads_release(ConfigPayload.Endpoints endpoints2) {
        boolean z;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z = false;
        } else {
            z = true;
        }
        String riEndpoint = endpoints2 != null ? endpoints2.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            return z;
        }
        Logger.INSTANCE.m43468e(TAG, "The error logging endpoint was not provided in the config.");
        return z;
    }
}
