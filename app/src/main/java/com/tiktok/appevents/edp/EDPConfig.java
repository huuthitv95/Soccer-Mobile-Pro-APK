package com.tiktok.appevents.edp;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.JSON;
import com.tiktok.util.TTUtil;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class EDPConfig {
    public static boolean enable_app_launch_track = false;
    public static boolean enable_click_track = false;
    public static boolean enable_page_show_track = false;
    public static boolean enable_pay_show_track = false;
    public static boolean enable_sdk = false;
    public static boolean enable_webview_request_track = false;
    public static int page_detail_upload_deep_count = 12;
    public static double report_frequency_control = 1.0d;
    public static double time_diff_frequency_control;
    public static Set<String> button_black_list = new HashSet();
    public static final String DEFAULT_SENSIG_FILTERING_REGEX_LIST = "([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9._-]+)|(\\+?0?86-?)?1[3-9]\\d{9}|(\\+\\d{1,2}\\s?)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}";
    public static String sensig_filtering_regex_list = DEFAULT_SENSIG_FILTERING_REGEX_LIST;
    public static int sensig_filtering_regex_version = 0;

    public interface ConfigConst {
        public static final String BUTTON_BLACK_LIST = "button_black_list";
        public static final String EDP_NATIVE_SDK_CONFIG = "enhanced_data_postback_native_config";
        public static final String EDP_UNITY_SDK_CONFIG = "enhanced_data_postback_unity_config";
        public static final String ENABLE_APP_LAUNCH_TRACK = "enable_app_launch_track";
        public static final String ENABLE_CLICK_TRACK = "enable_click_track";
        public static final String ENABLE_PAGE_SHOW_TRACK = "enable_page_show_track";
        public static final String ENABLE_PAY_SHOW_TRACK = "enable_pay_show_track";
        public static final String ENABLE_SDK = "enable_sdk";
        public static final String ENABLE_WEBVIEW_REQUEST_TRACK = "enable_webview_request_track";
        public static final String PAGE_DETAIL_UPLOAD_DEEP_COUNT = "page_detail_upload_deep_count";
        public static final String REPORT_FREQUENCY_CONTROL = "report_frequency_control";
        public static final String SENSIG_FILTERING_REGEX_LIST = "sensig_filtering_regex_list";
        public static final String SENSIG_FILTERING_REGEX_VERSION = "sensig_filtering_regex_version";
        public static final String TIME_DIFF_FREQUENCY_CONTROL = "time_diff_frequency_control";
    }

    public static void optConfig(JSONObject config) {
        if (config == null) {
            return;
        }
        try {
            boolean z = JSON.getBoolean(config, ConfigConst.ENABLE_SDK, false);
            enable_sdk = z;
            boolean z2 = true;
            enable_app_launch_track = z && JSON.getBoolean(config, ConfigConst.ENABLE_APP_LAUNCH_TRACK, false);
            enable_page_show_track = enable_sdk && JSON.getBoolean(config, ConfigConst.ENABLE_PAGE_SHOW_TRACK, false);
            enable_click_track = enable_sdk && JSON.getBoolean(config, ConfigConst.ENABLE_CLICK_TRACK, false);
            enable_webview_request_track = enable_sdk && JSON.getBoolean(config, ConfigConst.ENABLE_WEBVIEW_REQUEST_TRACK, false);
            if (!enable_sdk || !JSON.getBoolean(config, ConfigConst.ENABLE_PAY_SHOW_TRACK, false)) {
                z2 = false;
            }
            enable_pay_show_track = z2;
            page_detail_upload_deep_count = JSON.getInt(config, ConfigConst.PAGE_DETAIL_UPLOAD_DEEP_COUNT, 0);
            time_diff_frequency_control = JSON.getDouble(config, ConfigConst.TIME_DIFF_FREQUENCY_CONTROL, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            report_frequency_control = JSON.getDouble(config, ConfigConst.REPORT_FREQUENCY_CONTROL, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            JSONArray jsonArray = JSON.getJsonArray(config, ConfigConst.BUTTON_BLACK_LIST);
            button_black_list.clear();
            if (jsonArray != null) {
                int length = jsonArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        String string = jsonArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            button_black_list.add(string);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            JSONArray jsonArray2 = JSON.getJsonArray(config, ConfigConst.SENSIG_FILTERING_REGEX_LIST);
            if (jsonArray2 != null) {
                String string2 = jsonArray2.getString(0);
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                sensig_filtering_regex_list = string2;
                sensig_filtering_regex_version = JSON.getInt(config, ConfigConst.SENSIG_FILTERING_REGEX_VERSION);
                TTUtil.setSensigInfo(TikTokBusinessSdk.getApplicationContext(), new Sensig(sensig_filtering_regex_version, sensig_filtering_regex_list));
            }
        } catch (Throwable unused2) {
        }
    }
}
