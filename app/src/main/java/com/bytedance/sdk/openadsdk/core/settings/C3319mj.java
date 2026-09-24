package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3300oh;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.share.internal.ShareConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3319mj extends AbstractC3320qt {

    /* JADX INFO: renamed from: ka */
    static final ArrayList<String> f11603ka = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));

    /* JADX INFO: renamed from: fi */
    private Set<String> f11604fi;

    /* JADX INFO: renamed from: ik */
    public boolean f11605ik;

    public C3319mj(AbstractC3320qt.ri riVar) {
        super(riVar);
        this.f11604fi = Collections.synchronizedSet(new HashSet());
    }

    /* JADX INFO: renamed from: ri */
    public static Set<String> m14791ri(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt
    /* JADX INFO: renamed from: ri */
    protected String mo14792ri() {
        try {
            if (C3299nr.m14642ri() == null || ihz.m10229ri(C3299nr.m14642ri())) {
                return "tt_sdk_settings_sr.prop";
            }
            return "tt_sdk_settings_sr_" + ihz.m10225ik(C3299nr.m14642ri()) + ".prop";
        } catch (Throwable unused) {
            return "tt_sdk_settings_sr";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi
    /* JADX INFO: renamed from: ri */
    public void mo14756ri(JSONObject jSONObject) {
        int iOptInt;
        InterfaceC3312fi.ri riVarLr = m14803lr();
        JSONObject jSONObjectM14838di = C3322sf.m14819lr().m14838di();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.f11605ik = (jSONObjectOptJSONObject == null || jSONObjectM14838di == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectM14838di.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            riVarLr.mo14764ri("digest", jSONObjectOptJSONObject.toString());
        } else {
            riVarLr.mo14760ri("digest");
        }
        riVarLr.mo14763ri("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * 60000;
            if (jOptLong < 0 || jOptLong > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                jOptLong = 600000;
            }
            riVarLr.mo14763ri("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            riVarLr.mo14762ri("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            riVarLr.mo14762ri("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("duration")) {
                riVarLr.mo14763ri("duration", jSONObjectOptJSONObject2.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject2.has("max")) {
                riVarLr.mo14762ri("max", jSONObjectOptJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            riVarLr.mo14762ri("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                riVarLr.mo14764ri("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                riVarLr.mo14764ri("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            C3322sf.m14819lr().m14860mj();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            riVarLr.mo14761ri("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            riVarLr.mo14764ri("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            riVarLr.mo14764ri("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            riVarLr.mo14764ri("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            riVarLr.mo14764ri("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            riVarLr.mo14764ri("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            riVarLr.mo14764ri("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            riVarLr.mo14764ri("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            riVarLr.mo14762ri("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            riVarLr.mo14764ri("dc", jSONObject.optString("dc"));
        }
        C3322sf.m14819lr().m14879ri(jSONObject, riVarLr);
        if (jSONObject.has("if_both_open")) {
            riVarLr.mo14762ri("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            riVarLr.mo14762ri("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            riVarLr.mo14764ri("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            riVarLr.mo14762ri("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            riVarLr.mo14764ri("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString) && f11603ka.contains(strOptString)) {
                    riVarLr.mo14764ri("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                riVarLr.mo14762ri("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                riVarLr.mo14762ri("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                riVarLr.mo14765ri("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                riVarLr.mo14764ri("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                riVarLr.mo14765ri("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                riVarLr.mo14765ri("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.f11604fi.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            this.f11604fi.add(jSONArrayOptJSONArray.getString(i));
                        }
                    }
                    this.f11604fi = m14791ri(this.f11604fi);
                    riVarLr.mo14764ri("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th) {
                    C2707ac.m10197ik("GeckoLog: settings json error ".concat(String.valueOf(th)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            riVarLr.mo14762ri("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        C3313ik.m14773ri(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                riVarLr.mo14762ri("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                riVarLr.mo14762ri("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                riVarLr.mo14762ri("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                riVarLr.mo14762ri("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                riVarLr.mo14762ri("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String strOptString2 = jSONObjectOptJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (TextUtils.isEmpty(strOptString2)) {
                    riVarLr.mo14760ri("privacy_fields_allowed");
                } else {
                    riVarLr.mo14764ri("privacy_fields_allowed", strOptString2);
                }
            }
            if (jSONObjectOptJSONObject6.has("app_reg")) {
                int iOptInt3 = jSONObjectOptJSONObject6.optInt("app_reg", -1);
                if (iOptInt3 == 0 && C3300oh.m14646ri().mo13483ka() == 1 && C3606fi.m16710ri("app_register_alert_enable", false)) {
                    dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.mj.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(C3299nr.m14642ri(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                riVarLr.mo14765ri("privacy_app_reg", iOptInt3 == 1);
                C3307lr.m14718ri().m14729ri(iOptInt3);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            riVarLr.mo14764ri("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            riVarLr.mo14762ri("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt5 < 0 || iOptInt5 > 3) {
                iOptInt5 = 0;
            }
            riVarLr.mo14762ri("splash_video_load_strategy", iOptInt5);
        }
        if (jSONObject.has("user_compliance_status")) {
            C3307lr.m14718ri().m14726lr(jSONObject.optInt("user_compliance_status", -1));
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            C3307lr.m14718ri().m14732ri(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            C3307lr.m14718ri().m14730ri(jSONObject.optLong("allow_req_time", C3307lr.f11538ri.longValue()));
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            riVarLr.mo14765ri("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                riVarLr.mo14762ri("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                riVarLr.mo14765ri("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                riVarLr.mo14762ri("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                riVarLr.mo14762ri("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                riVarLr.mo14762ri("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                riVarLr.mo14764ri("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                riVarLr.mo14764ri("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                riVarLr.mo14762ri("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                riVarLr.mo14762ri("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", 300));
            }
            if (jSONObjectOptJSONObject7.has(C3322sf.f11624ri)) {
                riVarLr.mo14765ri(C3322sf.f11624ri, jSONObjectOptJSONObject7.optBoolean(C3322sf.f11624ri, false));
            }
            if (jSONObjectOptJSONObject7.has(C3322sf.f11623lr)) {
                riVarLr.mo14762ri(C3322sf.f11623lr, jSONObjectOptJSONObject7.optInt(C3322sf.f11623lr, 10000));
            }
            if (jSONObjectOptJSONObject7.has(C3322sf.f11621ik)) {
                riVarLr.mo14761ri(C3322sf.f11621ik, (float) jSONObjectOptJSONObject7.optDouble(C3322sf.f11621ik, 1.0d));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_slide_num")) {
                int iOptInt6 = jSONObjectOptJSONObject7.optInt("bus_con_slide_num", 2);
                if (iOptInt6 <= 0) {
                    iOptInt6 = 2;
                }
                riVarLr.mo14762ri("bus_con_slide_num", iOptInt6);
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            riVarLr.mo14764ri("perf_con_applog_send", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        riVarLr.mo14762ri("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        riVarLr.mo14762ri("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        riVarLr.mo14762ri("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        riVarLr.mo14762ri("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        riVarLr.mo14762ri("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        riVarLr.mo14762ri("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            riVarLr.mo14764ri("perf_con_thread_pool_config", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        riVarLr.mo14762ri("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        riVarLr.mo14763ri("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        riVarLr.mo14763ri("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        riVarLr.mo14763ri("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        riVarLr.mo14764ri("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        riVarLr.mo14764ri("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        riVarLr.mo14762ri("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        riVarLr.mo14762ri("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        riVarLr.mo14764ri("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_sync_gaid")) {
                        riVarLr.mo14762ri("perf_con_sync_gaid", jSONObjectOptJSONObject8.optInt("perf_con_sync_gaid"));
                    }
                }
            } catch (Throwable th2) {
                C2707ac.m10196ik("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e) {
            C2707ac.m10197ik("SettingsDefaultRepository", "coreSettingJson", e.getMessage());
        }
        riVarLr.mo14764ri("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            riVarLr.mo14764ri("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            riVarLr.mo14762ri("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String strOptString5 = jSONObject.optString("token_adx_ids", "");
            if (TextUtils.isEmpty(strOptString5)) {
                riVarLr.mo14760ri("token_adx_ids");
            } else {
                riVarLr.mo14764ri("token_adx_ids", strOptString5);
            }
        }
        if (jSONObject.has("ads_url_backup")) {
            String strOptString6 = jSONObject.optString("ads_url_backup", "");
            if (TextUtils.isEmpty(strOptString6)) {
                riVarLr.mo14760ri("ads_url_backup");
            } else {
                riVarLr.mo14764ri("ads_url_backup", strOptString6);
            }
        }
        riVarLr.mo14766ri();
        C3322sf.m14819lr().m14850ig();
        m14800fi();
    }
}
