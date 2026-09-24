package com.tiktok.appevents;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.JSON;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTUtil;
import com.tiktok.util.TimeUtil;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class TTRequestBuilder {
    private static final String TAG = "TTRequestBuilder";
    private static JSONObject basePayloadCache;
    private static boolean containTestCode;
    private static JSONObject contextForApiCache;
    private static JSONObject healthBasePayloadCache;

    TTRequestBuilder() {
    }

    private static void addDeviceInfo(JSONObject device) {
        try {
            JSON.putObject(device, "locale", SystemInfoUtil.getBcp47Language());
            JSON.putInt(device, "screen_width", SystemInfoUtil.getsScreenWidth());
            JSON.putInt(device, "screen_height", SystemInfoUtil.getsScreenHeight());
            JSON.putDouble(device, "scale", SystemInfoUtil.getsDensity());
            JSON.putObject(device, C11540L6.f24899B, Build.MODEL);
            JSON.putObject(device, "version", Build.VERSION.RELEASE);
            JSON.putObject(device, "installer_package", SystemInfoUtil.getInstallSource());
        } catch (Throwable unused) {
        }
    }

    private static JSONObject contextBuilder(TTIdentifierFactory.AdIdInfo adIdInfo, boolean isDDL) {
        JSONObject jSONObjectBuild = JSON.build();
        try {
            if (TikTokBusinessSdk.bothIdsProvided()) {
                JSON.putObject(jSONObjectBuild, "id", TikTokBusinessSdk.getAppId());
            }
            JSON.putObject(jSONObjectBuild, "name", SystemInfoUtil.getAppName());
            JSON.putObject(jSONObjectBuild, "namespace", SystemInfoUtil.getPackageName());
            JSON.putObject(jSONObjectBuild, "version", SystemInfoUtil.getAppVersionName());
            JSON.putObject(jSONObjectBuild, "build", SystemInfoUtil.getAppVersionCode() + "");
            JSON.putObject(jSONObjectBuild, "tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            JSON.putObject(jSONObjectBuild, "app_session_id", SystemInfoUtil.getAppSessionId());
            JSON.putObject(jSONObjectBuild, "anonymous_id", TTUserInfo.sharedInstance.anonymousId);
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectBuild2 = JSON.build();
        try {
            JSON.putObject(jSONObjectBuild2, C11540L6.f24917H, C11744X3.f26142d);
            JSON.putObject(jSONObjectBuild2, "os_version", SystemInfoUtil.getAndroidVersion());
            if (adIdInfo != null) {
                JSON.putObject(jSONObjectBuild2, C11540L6.f24947V0, adIdInfo.getAdId());
            }
            addDeviceInfo(jSONObjectBuild2);
        } catch (Throwable unused2) {
        }
        JSONObject jSONObjectBuild3 = JSON.build();
        JSON.putObject(jSONObjectBuild3, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObjectBuild);
        JSON.putObject(jSONObjectBuild3, C11744X3.i.f26328G, jSONObjectBuild2);
        try {
            if (SystemInfoUtil.getInstallReferrer() != null) {
                JSONObject jSONObjectBuild4 = JSON.build();
                JSON.putObject(jSONObjectBuild4, "gp_referrer", SystemInfoUtil.getInstallReferrer().getGoogleInstallReferrer());
                JSON.putObject(jSONObjectBuild3, "ad", jSONObjectBuild4);
            }
        } catch (Throwable unused3) {
        }
        if (!isDDL) {
            try {
                JSON.putObject(jSONObjectBuild3, "ip", SystemInfoUtil.getLocalIpAddress());
                String userAgent = SystemInfoUtil.getUserAgent();
                if (userAgent != null) {
                    JSON.putObject(jSONObjectBuild3, "user_agent", userAgent);
                }
            } catch (Throwable unused4) {
            }
        }
        return jSONObjectBuild3;
    }

    private static JSONObject contextBuilderWithLocalAndLibrary(TTIdentifierFactory.AdIdInfo adIdInfo) {
        JSONObject jSONObjectContextBuilder = contextBuilder(adIdInfo, false);
        JSON.putObject(jSONObjectContextBuilder, "locale", SystemInfoUtil.getLocale());
        JSONObject jSONObjectBuild = JSON.build();
        JSON.putObject(jSONObjectBuild, "name", "tiktok/" + SystemInfoUtil.getLibraryName());
        JSON.putObject(jSONObjectBuild, "version", SystemInfoUtil.getSDKVersion());
        JSON.putObject(jSONObjectContextBuilder, "library", jSONObjectBuild);
        return jSONObjectContextBuilder;
    }

    public static JSONObject ddlJson() {
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSONObject jSONObjectContextBuilder = contextBuilder(TikTokBusinessSdk.isGaidCollectionEnabled() ? TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()) : null, true);
            JSON.putObject(jSONObjectContextBuilder, "user", TTUserInfo.sharedInstance.toJsonObject());
            JSON.putObject(jSONObjectBuild, "tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            JSON.putObject(jSONObjectBuild, "context", jSONObjectContextBuilder);
            JSON.putObject(jSONObjectBuild, "timestamp", TimeUtil.getISO8601Timestamp(new Date(System.currentTimeMillis())));
            JSON.putObject(jSONObjectBuild, "ip", SystemInfoUtil.getLocalIpAddress());
            String userAgent = SystemInfoUtil.getUserAgent();
            if (userAgent != null) {
                JSON.putObject(jSONObjectBuild, "user_agent", userAgent);
            }
            return jSONObjectBuild;
        } catch (Throwable unused) {
            return JSON.build();
        }
    }

    private static JSONObject enrichDeviceBase(JSONObject d) {
        if (d == null) {
            d = JSON.build();
        }
        try {
            JSON.putObject(d, "id", TTUtil.getOrGenAnoId(TikTokBusinessSdk.getApplicationContext(), false));
            JSON.putObject(d, "user_agent", SystemInfoUtil.getUserAgent());
            JSON.putObject(d, "ip", SystemInfoUtil.getLocalIpAddress());
            JSON.putObject(d, "network", SystemInfoUtil.getNetworkClass(TikTokBusinessSdk.getApplicationContext()));
            JSON.putObject(d, "session", TikTokBusinessSdk.getSessionID());
            JSON.putObject(d, "locale", SystemInfoUtil.getBcp47Language());
            JSON.putLong(d, "ts", System.currentTimeMillis() - SystemClock.elapsedRealtime());
            addDeviceInfo(d);
        } catch (Throwable unused) {
        }
        return d;
    }

    private static void freshOsVersion(JSONObject contextForApiCache2, TTAppEvent event) {
        try {
            JSONObject jsonObject = JSON.getJsonObject(contextForApiCache2, C11744X3.i.f26328G);
            if (event == null || jsonObject == null) {
                JSON.putObject(jsonObject, "version", SystemInfoUtil.getAndroidVersion());
                JSON.putObject(jsonObject, "os_version", null);
            } else {
                JSON.putObject(jsonObject, "os_version", SystemInfoUtil.getAndroidVersion());
                JSON.putObject(jsonObject, "version", null);
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject getBasePayload() {
        TTUtil.checkThread(TAG);
        boolean z = TikTokBusinessSdk.isInSdkDebugMode().booleanValue() || TikTokBusinessSdk.isEnableDebugMode().booleanValue();
        try {
            JSONObject jSONObject = basePayloadCache;
            if (jSONObject != null) {
                if (z != containTestCode) {
                    if (z) {
                        JSON.putObject(jSONObject, "test_event_code", String.valueOf(TikTokBusinessSdk.getTTAppId()));
                        containTestCode = true;
                    } else {
                        jSONObject.remove("test_event_code");
                        containTestCode = false;
                    }
                }
                return basePayloadCache;
            }
            JSONObject jSONObjectBuild = JSON.build();
            if (TikTokBusinessSdk.onlyAppIdProvided()) {
                JSON.putObject(jSONObjectBuild, "app_id", TikTokBusinessSdk.getAppId());
            } else {
                JSON.putObject(jSONObjectBuild, "tiktok_app_id", TikTokBusinessSdk.getFirstTTAppIds());
            }
            if (z) {
                JSON.putObject(jSONObjectBuild, "test_event_code", String.valueOf(TikTokBusinessSdk.getTTAppId()));
                containTestCode = true;
            }
            JSON.putObject(jSONObjectBuild, "event_source", "APP_EVENTS_SDK");
            basePayloadCache = jSONObjectBuild;
            if (basePayloadCache == null) {
                basePayloadCache = JSON.build();
            }
            return basePayloadCache;
        } catch (Throwable unused) {
        }
    }

    public static JSONObject getBasePayloadWithTs() {
        JSONObject basePayload = getBasePayload();
        JSON.putObject(basePayload, "timestamp", TimeUtil.getISO8601Timestamp(new Date()));
        return basePayload;
    }

    public static JSONObject getContextForApi(TTAppEvent event) {
        try {
            JSONObject jSONObjectBuild = JSON.build(getImmutableContextForApi(event).toString());
            JSON.putObject(jSONObjectBuild, "user", event.getUserInfo().toJsonObject());
            return jSONObjectBuild;
        } catch (Throwable unused) {
            return JSON.build();
        }
    }

    public static JSONObject getHealthMonitorBase() {
        JSONObject jSONObject = healthBasePayloadCache;
        if (jSONObject != null) {
            JSON.putObject(jSONObject, C11744X3.i.f26328G, enrichDeviceBase(JSON.getJsonObject(jSONObject, C11744X3.i.f26328G)));
            JSON.putObject(healthBasePayloadCache, "timestamp", TimeUtil.getISO8601Timestamp(new Date()));
            return healthBasePayloadCache;
        }
        JSONObject jSONObjectBuild = JSON.build();
        try {
            JSONObject jSONObjectBuild2 = JSON.build(getImmutableContextForApi(null).toString());
            JSONObject jsonObject = JSON.getJsonObject(jSONObjectBuild2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            if (jsonObject == null) {
                jsonObject = JSON.build();
            }
            JSON.putObject(jsonObject, "app_namespace", SystemInfoUtil.getPackageName());
            JSON.putObject(jSONObjectBuild, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jsonObject);
            JSON.putObject(jSONObjectBuild, "library", JSON.getJsonObject(jSONObjectBuild2, "library"));
            JSON.putObject(jSONObjectBuild, C11744X3.i.f26328G, enrichDeviceBase(JSON.getJsonObject(jSONObjectBuild2, C11744X3.i.f26328G)));
            JSON.putObject(jSONObjectBuild, "log_extra", null);
            healthBasePayloadCache = jSONObjectBuild;
            JSON.putObject(jSONObjectBuild, "timestamp", TimeUtil.getISO8601Timestamp(new Date()));
        } catch (Throwable unused) {
        }
        return healthBasePayloadCache;
    }

    private static JSONObject getImmutableContextForApi(TTAppEvent event) {
        TTIdentifierFactory.AdIdInfo googleAdIdInfo;
        JSONObject jSONObject = contextForApiCache;
        if (jSONObject != null) {
            freshOsVersion(jSONObject, event);
            return contextForApiCache;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TTIdentifierFactory.AdIdInfo adIdInfo = null;
        try {
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("did_start", TTUtil.getMetaWithTS(Long.valueOf(jCurrentTimeMillis)), null);
            googleAdIdInfo = TikTokBusinessSdk.isGaidCollectionEnabled() ? TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()) : null;
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject metaWithTS = TTUtil.getMetaWithTS(Long.valueOf(jCurrentTimeMillis2));
                JSON.putLong(metaWithTS, "latency", jCurrentTimeMillis2 - jCurrentTimeMillis);
                JSON.putBoolean(metaWithTS, "success", (googleAdIdInfo == null || TextUtils.isEmpty(googleAdIdInfo.getAdId())) ? false : true);
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("did_end", metaWithTS, null);
            } catch (Throwable unused) {
                adIdInfo = googleAdIdInfo;
                googleAdIdInfo = adIdInfo;
            }
        } catch (Throwable unused2) {
        }
        JSONObject jSONObjectContextBuilderWithLocalAndLibrary = contextBuilderWithLocalAndLibrary(googleAdIdInfo);
        contextForApiCache = jSONObjectContextBuilderWithLocalAndLibrary;
        freshOsVersion(jSONObjectContextBuilderWithLocalAndLibrary, event);
        return contextForApiCache;
    }
}
