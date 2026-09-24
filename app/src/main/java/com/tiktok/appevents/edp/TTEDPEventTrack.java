package com.tiktok.appevents.edp;

import com.adjust.sdk.Constants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.JSON;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTEDPEventTrack {
    public static long LAST_CLICK_TS;
    private static boolean hasSendLaunch;
    public static volatile boolean isSending;
    public static volatile boolean pageShowIsSending;
    private static final Random sRandom = new Random();
    private static TTAppLaunchEvent ttAppLaunchEvent;

    public static boolean checkUpload() {
        return sRandom.nextDouble() <= EDPConfig.report_frequency_control;
    }

    public static void trackAppLaunch(String refer, String sourceUrl) {
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_REFER, refer);
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_SOURCE_URL, sourceUrl);
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, Constants.REFERRER_API_META, jSONObjectBuild);
            if (TikTokBusinessSdk.isInitialized()) {
                TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_APP_LAUNCH, jSONObjectBuild2, null);
            } else {
                if (ttAppLaunchEvent != null || hasSendLaunch) {
                    return;
                }
                ttAppLaunchEvent = new TTAppLaunchEvent(jSONObjectBuild, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public static void trackClick(String className, float x, float y, int width, int height, String text, String pageName, JSONObject components, int pageCount, long duration) {
        try {
            LAST_CLICK_TS = System.currentTimeMillis();
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putDouble(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_POSITON_X, x);
            JSON.putDouble(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_POSITON_Y, y);
            JSON.putInt(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_SIZE_W, width);
            JSON.putInt(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_SIZE_H, height);
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_BUTTON_TEXT, text);
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CURRENT_PAGE_NAME, pageName);
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_COMPONENTS, components);
            JSON.putInt(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_DEEP_COUNT, pageCount);
            JSON.putLong(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_DURATION, duration);
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME, className);
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, Constants.REFERRER_API_META, jSONObjectBuild);
            TikTokBusinessSdk.getAppEventLogger().trackEdp("click", jSONObjectBuild2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackFirstAppLaunch() {
        try {
            if (ttAppLaunchEvent != null) {
                hasSendLaunch = true;
                JSONObject jSONObjectBuild = JSON.build();
                JSON.putObject(jSONObjectBuild, Constants.REFERRER_API_META, ttAppLaunchEvent.getProp());
                TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_APP_LAUNCH, jSONObjectBuild, null);
                ttAppLaunchEvent = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void trackPageShow(String pageName, int index, boolean isFromBackground, JSONObject components, int pageCount) {
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CURRENT_PAGE_NAME, pageName);
            JSON.putInt(jSONObjectBuild, "index", index);
            JSON.putBoolean(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_FROM_BACKGROUND, isFromBackground);
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_COMPONENTS, components);
            JSON.putInt(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_DEEP_COUNT, pageCount);
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, Constants.REFERRER_API_META, jSONObjectBuild);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_PAGE_SHOW, jSONObjectBuild2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackPayShow(int code, JSONArray skuInfo) {
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putInt(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, code);
            JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_SKU_INFO, skuInfo);
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, Constants.REFERRER_API_META, jSONObjectBuild);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_PAY_SHOW, jSONObjectBuild2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackUnityEvent(String name, JSONObject meta) {
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putObject(jSONObjectBuild, Constants.REFERRER_API_META, meta);
            JSON.putObject(jSONObjectBuild, "api_platform", meta.remove("api_platform"));
            TikTokBusinessSdk.getAppEventLogger().trackEdp(name, jSONObjectBuild, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackWebviewRequest(String url) {
        try {
            JSONObject jSONObjectBuild = JSON.build();
            JSON.putObject(jSONObjectBuild, "url", url);
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, Constants.REFERRER_API_META, jSONObjectBuild);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_WEBVIEW_REQUEST, jSONObjectBuild2, null);
        } catch (Throwable unused) {
        }
    }
}
