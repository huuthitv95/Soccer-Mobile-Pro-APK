package com.tiktok.appevents;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.tiktok.BuildConfig;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import com.tiktok.util.HttpRequestUtil;
import com.tiktok.util.JSON;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTConst;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import com.tiktok.util.TimeUtil;
import com.tiktok.util.UrlConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class TTRequest {
    private static final int MAX_EVENT_SIZE = 50;
    private static final Map<String, String> getHeadParamMap;
    private static final Map<String, String> headParamMap;
    private static final String TAG = "TTRequest";
    private static final TTLogger logger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());
    private static int toBeSentRequests = 0;
    private static int failedRequests = 0;
    private static int successfulRequests = 0;
    private static final TreeSet<Long> allRequestIds = new TreeSet<>();
    private static final List<TTAppEvent> successfullySentRequests = new CopyOnWriteArrayList();

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        headParamMap = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        getHeadParamMap = concurrentHashMap2;
        concurrentHashMap.put("Content-Type", C11341A5.f23800M);
        concurrentHashMap.put(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        String str = String.format("tiktok-business-android-sdk/%s/%s", BuildConfig.VERSION_NAME, TikTokBusinessSdk.getApiAvailableVersion());
        concurrentHashMap.put("User-Agent", str);
        concurrentHashMap2.put(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        concurrentHashMap2.put("User-Agent", str);
        concurrentHashMap2.put("Content-Type", C11341A5.f23800M);
    }

    TTRequest() {
    }

    public static <T> List<List<T>> averageAssign(List<T> sourceList, int splitNum) {
        ArrayList arrayList = new ArrayList();
        if (sourceList != null && !sourceList.isEmpty()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int size = sourceList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        arrayList2.add(sourceList.get(i));
                        if (arrayList2.size() >= splitNum || i == size - 1) {
                            arrayList.add(arrayList2);
                            arrayList2 = new ArrayList();
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                arrayList.add(sourceList);
            }
        }
        return arrayList;
    }

    public static JSONObject buildConfigParams() {
        JSONObject jSONObjectBuild = JSON.build();
        try {
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, "id", TikTokBusinessSdk.getAppId());
            JSON.putObject(jSONObjectBuild2, "tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            JSON.putObject(jSONObjectBuild2, "version", SystemInfoUtil.getAppVersionName());
            JSON.putObject(jSONObjectBuild, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObjectBuild2);
            JSONObject jSONObjectBuild3 = JSON.build();
            JSON.putObject(jSONObjectBuild3, C11540L6.f24917H, C11744X3.f26142d);
            JSON.putObject(jSONObjectBuild3, "version", SystemInfoUtil.getAndroidVersion());
            if (TikTokBusinessSdk.isGaidCollectionEnabled()) {
                try {
                    JSON.putObject(jSONObjectBuild3, C11540L6.f24947V0, TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()).getAdId());
                } catch (Throwable unused) {
                }
            }
            JSON.putObject(jSONObjectBuild, C11744X3.i.f26328G, jSONObjectBuild3);
            if (TikTokBusinessSdk.isInSdkDebugMode().booleanValue()) {
                JSON.putObject(jSONObjectBuild, "debug", "true");
            }
            JSONObject jSONObjectBuild4 = JSON.build();
            JSON.putObject(jSONObjectBuild4, "name", "tiktok/" + SystemInfoUtil.getLibraryName());
            JSON.putObject(jSONObjectBuild4, "version", SystemInfoUtil.getSDKVersion());
            JSON.putBoolean(jSONObjectBuild4, "smart_sdk_client_flag", TikTokBusinessSdk.isEdpEnable());
            JSON.putInt(jSONObjectBuild4, "auto_iap_track_config", TTInAppPurchaseWrapper.devAutoTrack);
            JSON.putObject(jSONObjectBuild, "library", jSONObjectBuild4);
        } catch (Throwable unused2) {
        }
        return jSONObjectBuild;
    }

    public static HttpRequestUtil.HttpResponse fetchDeferredDeeplinkWithCompletion() {
        return HttpRequestUtil.doPost(UrlConst.getDDLUrl(), headParamMap, TTRequestBuilder.ddlJson().toString(), false);
    }

    public static JSONObject getBusinessSDKConfig() {
        if (TextUtils.isEmpty(TikTokBusinessSdk.getTTAppId()) || TextUtils.isEmpty(TikTokBusinessSdk.getAppId())) {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putBoolean(jSONObjectBuild, EDPConfig.ConfigConst.ENABLE_SDK, false);
            logger.debug("config request return by appid or ttAppId", new Object[0]);
            return jSONObjectBuild;
        }
        JSONObject jSONObjectBuildConfigParams = buildConfigParams();
        String configUrl = UrlConst.getConfigUrl();
        try {
            String tTAppId = TikTokBusinessSdk.getTTAppId();
            Uri.Builder builderBuildUpon = Uri.parse(configUrl).buildUpon();
            if (tTAppId == null) {
                tTAppId = "";
            }
            configUrl = builderBuildUpon.appendQueryParameter("tiktok_app_id", tTAppId).appendQueryParameter("sdk_version", SystemInfoUtil.getSDKVersion()).appendQueryParameter(C11540L6.f24917H, C11744X3.f26142d).appendQueryParameter(C11540L6.f24899B, Build.MODEL).appendQueryParameter("app_version", SystemInfoUtil.getAppVersionName()).appendQueryParameter("os_version", SystemInfoUtil.getAndroidVersion()).appendQueryParameter("locale", SystemInfoUtil.getBcp47Language()).appendQueryParameter("namespace", SystemInfoUtil.getPackageName()).build().toString();
        } catch (Throwable unused) {
        }
        HttpRequestUtil.HttpResponse httpResponseDoPost = HttpRequestUtil.doPost(configUrl, getHeadParamMap, jSONObjectBuildConfigParams.toString(), false);
        if (httpResponseDoPost != null) {
            TTLogger tTLogger = logger;
            tTLogger.debug(httpResponseDoPost.url, new Object[0]);
            tTLogger.debug("code=" + String.valueOf(httpResponseDoPost.code), new Object[0]);
            tTLogger.debug("rsp=" + String.valueOf(httpResponseDoPost.body), new Object[0]);
        }
        if (httpResponseDoPost == null || !httpResponseDoPost.isOK()) {
            return null;
        }
        return JSON.getJsonObject(httpResponseDoPost.body, "data");
    }

    public static JSONObject getDebugModeConfig() {
        try {
            HttpRequestUtil.HttpResponse httpResponseDoPost = HttpRequestUtil.doPost(UrlConst.getDebugModeUrl(), getHeadParamMap, buildConfigParams().toString(), false);
            if (httpResponseDoPost == null || !httpResponseDoPost.isOK()) {
                return null;
            }
            return JSON.getJsonObject(httpResponseDoPost.body, "data");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized List<TTAppEvent> getSuccessfullySentRequests() {
        return successfullySentRequests;
    }

    private static void notifyChange() {
        if (TikTokBusinessSdk.networkListener != null) {
            TikTokBusinessSdk.networkListener.onNetworkChange(toBeSentRequests, successfulRequests, failedRequests, TTAppEventsQueue.size() + allRequestIds.size(), successfullySentRequests.size());
        }
    }

    public static synchronized List<TTAppEvent> reportAppEvent(JSONObject basePayload, List<TTAppEvent> appEventList, boolean isEdp) {
        TTUtil.checkThread(TAG);
        if (appEventList != null && !appEventList.isEmpty()) {
            toBeSentRequests = appEventList.size();
            Iterator<TTAppEvent> it = appEventList.iterator();
            while (it.hasNext()) {
                allRequestIds.add(it.next().getUniqueId());
            }
            failedRequests = 0;
            successfulRequests = 0;
            notifyChange();
            String batchUrl = UrlConst.getBatchUrl();
            ArrayList arrayList = new ArrayList();
            int size = 0;
            for (List list : averageAssign(appEventList, 50)) {
                JSONArray jSONArrayBuildArr = JSON.buildArr();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    JSONObject jSONObjectTransferJson = transferJson((TTAppEvent) it2.next());
                    if (jSONObjectTransferJson != null) {
                        JSON.putArr(jSONArrayBuildArr, jSONObjectTransferJson);
                    }
                }
                if (jSONArrayBuildArr.length() != 0) {
                    JSON.putObject(basePayload, "batch", null);
                    try {
                        JSON.putObject(basePayload, "batch", jSONArrayBuildArr);
                        HttpRequestUtil.HttpResponse httpResponseDoPost = HttpRequestUtil.doPost(batchUrl, headParamMap, basePayload.toString());
                        if (isEdp) {
                            return null;
                        }
                        if (httpResponseDoPost == null || !httpResponseDoPost.isOK()) {
                            arrayList.addAll(list);
                            failedRequests += list.size();
                        } else {
                            try {
                                TTLogger tTLogger = logger;
                                tTLogger.debug("url=" + String.valueOf(batchUrl), new Object[0]);
                                tTLogger.debug("rsp=" + String.valueOf(httpResponseDoPost.body), new Object[0]);
                                int i = httpResponseDoPost.code;
                                if (TikTokBusinessSdk.isInSdkDebugMode().booleanValue() || i == TTConst.ApiErrorCodes.API_ERROR.code.intValue() || i == TTConst.ApiErrorCodes.PARTIAL_SUCCESS.code.intValue()) {
                                    size += list.size();
                                    failedRequests += list.size();
                                } else if (i != 0) {
                                    arrayList.addAll(list);
                                    failedRequests += list.size();
                                } else {
                                    successfulRequests += list.size();
                                    successfullySentRequests.addAll(list);
                                }
                            } catch (Throwable th) {
                                failedRequests += list.size();
                                arrayList.addAll(list);
                                TTCrashHandler.handleCrash(TAG, th, 2);
                            }
                        }
                        notifyChange();
                    } catch (Throwable th2) {
                        if (!isEdp) {
                            arrayList.addAll(list);
                        }
                        TTCrashHandler.handleCrash(TAG, th2, 2);
                    }
                }
            }
            TTLogger tTLogger2 = logger;
            tTLogger2.debug("Flushed %d events successfully", Integer.valueOf(successfulRequests));
            if (!arrayList.isEmpty()) {
                tTLogger2.debug("Failed to flush %d events, will save them to disk", new Object[0]);
            }
            if (size != 0) {
                tTLogger2.debug("Failed to flush " + size + " events, will discard them", new Object[0]);
                TTAppEventLogger.totalDumped = TTAppEventLogger.totalDumped + size;
                if (TikTokBusinessSdk.diskListener != null) {
                    TikTokBusinessSdk.diskListener.onDumped(TTAppEventLogger.totalDumped);
                }
            }
            tTLogger2.debug("Failed to flush %d events in total", Integer.valueOf(failedRequests));
            toBeSentRequests = 0;
            failedRequests = 0;
            successfulRequests = 0;
            notifyChange();
            return arrayList;
        }
        return new ArrayList();
    }

    public static HttpRequestUtil.HttpResponse reportMonitorEvent(JSONObject stat) {
        return HttpRequestUtil.doPost(UrlConst.getMonitorUrl(), headParamMap, stat.toString());
    }

    private static JSONObject transferJson(TTAppEvent event) {
        if (event == null) {
            return null;
        }
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putObject(jSONObjectBuild, "event_id", UUID.randomUUID());
            JSON.putObject(jSONObjectBuild, "tt_event_id", TextUtils.isEmpty(event.getEventId()) ? "" : event.getEventId());
            JSON.putObject(jSONObjectBuild, "type", event.getType());
            if (event.getEventName() != null) {
                JSON.putObject(jSONObjectBuild, NotificationCompat.CATEGORY_EVENT, event.getEventName());
            }
            JSON.putObject(jSONObjectBuild, "timestamp", TimeUtil.getISO8601Timestamp(event.getTimeStamp()));
            if (TikTokBusinessSdk.isInSdkLDUMode().booleanValue()) {
                JSON.putBoolean(jSONObjectBuild, "limited_data_use", true);
            }
            JSONObject jSONObjectBuild2 = JSON.build(event.getPropertiesJson());
            if (jSONObjectBuild2 != null && jSONObjectBuild2.length() > 0) {
                JSON.putObject(jSONObjectBuild, "properties", jSONObjectBuild2);
            }
            JSON.putObject(jSONObjectBuild, "context", TTRequestBuilder.getContextForApi(event));
            ReferrerInfo installReferrer = SystemInfoUtil.getInstallReferrer();
            if (installReferrer != null) {
                JSON.putLong(jSONObjectBuild, "gp_referrer_install_ts", installReferrer.getGpReferrerInstallTs());
                JSON.putLong(jSONObjectBuild, "gp_referrer_click_ts", installReferrer.getGpReferrerClickTs());
            }
            String screenShot = event.getScreenShot();
            if (!TextUtils.isEmpty(screenShot)) {
                JSON.putObject(jSONObjectBuild, "screenshot", screenShot);
            }
            return jSONObjectBuild;
        } catch (Throwable th) {
            TTCrashHandler.handleCrash(TAG, th, 2);
            return null;
        }
    }
}
