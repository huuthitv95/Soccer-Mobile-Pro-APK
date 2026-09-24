package com.bytedance.sdk.component.p130di.p131ri.p134ik;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.C2554ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import com.google.android.gms.ads.AdError;
import com.ironsource.C11494Ie;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2548ri {

    /* JADX INFO: renamed from: ri */
    private static final LinkedList<String> f7063ri = new LinkedList<>();

    /* JADX INFO: renamed from: lr */
    private static final LinkedList<String> f7061lr = new LinkedList<>();

    /* JADX INFO: renamed from: ik */
    private static final LinkedList<String> f7059ik = new LinkedList<>();

    /* JADX INFO: renamed from: ka */
    private static final LinkedList<String> f7060ka = new LinkedList<>();

    /* JADX INFO: renamed from: fi */
    private static final Map<String, Integer> f7058fi = new HashMap();

    /* JADX INFO: renamed from: di */
    private static HashMap<String, Integer> f7057di = null;
    private static String xha = "upload_init";

    /* JADX INFO: renamed from: mj */
    private static int f7062mj = 0;
    private static int jbs = 0;

    /* JADX INFO: renamed from: di */
    private static synchronized String m9245di() {
        StringBuilder sb;
        sb = new StringBuilder();
        Iterator<String> it = f7060ka.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: di */
    public static void m9246di(InterfaceC2552ri interfaceC2552ri) {
        try {
            if (interfaceC2552ri.mo9286ka() == 0 && xha.m9524di().m9549vr() != null && xha.m9524di().m9549vr().mo9227ri()) {
                JSONObject jSONObjectMo9282di = interfaceC2552ri.mo9282di();
                String strM9261ri = m9261ri(interfaceC2552ri);
                if (m9270ri(strM9261ri)) {
                    return;
                }
                m9247fi(interfaceC2552ri);
                String strOptString = jSONObjectMo9282di.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("will_send_labels", m9250ik(strM9261ri + "_" + jbs(interfaceC2552ri)));
                    jSONObject.put("send_success_valid_labels", m9245di());
                    jSONObjectMo9282di.put("ad_extra_data", jSONObject.toString());
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(strOptString);
                if (TextUtils.isEmpty(jSONObject2.optString("will_send_labels"))) {
                    jSONObject2.put("will_send_labels", m9250ik(strM9261ri + "_" + jbs(interfaceC2552ri)));
                    jSONObject2.put("send_success_valid_labels", m9245di());
                }
                jSONObjectMo9282di.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: fi */
    public static String m9247fi(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null || interfaceC2552ri.mo9282di() == null || m9251ik()) {
            return null;
        }
        String strOptString = interfaceC2552ri.mo9282di().optString("log_extra");
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                return new JSONObject(strOptString).optString("req_id");
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m9248fi() {
        return m9257lr() || m9254ka();
    }

    /* JADX INFO: renamed from: ik */
    public static int m9249ik(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null || interfaceC2552ri.mo9282di() == null || !m9257lr()) {
            return -1;
        }
        try {
            return new JSONObject(interfaceC2552ri.mo9282di().optString("event_extra")).optInt("stats_index");
        } catch (JSONException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ik */
    private static synchronized String m9250ik(String str) {
        StringBuilder sb;
        LinkedList<String> linkedList = f7059ik;
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
            linkedList.add(str);
        } else {
            linkedList.add(str);
        }
        sb = new StringBuilder();
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m9251ik() {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        return interfaceC2540fiM9549vr != null && interfaceC2540fiM9549vr.mo9214di() == 2;
    }

    public static long jbs(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null || interfaceC2552ri.mo9282di() == null || !m9257lr()) {
            return 0L;
        }
        try {
            return new JSONObject(interfaceC2552ri.mo9282di().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        } catch (Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: ka */
    public static synchronized int m9252ka(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri != null) {
            if (interfaceC2552ri.mo9282di() != null) {
                if (!m9257lr()) {
                    return 0;
                }
                try {
                    return new JSONObject(interfaceC2552ri.mo9282di().optString("ad_extra_data")).optInt("sdk_event_self_count");
                } catch (Exception unused) {
                    return 0;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ka */
    private static synchronized void m9253ka(String str) {
        LinkedList<String> linkedList = f7060ka;
        if (linkedList.size() < 10) {
            linkedList.add(str);
        } else {
            linkedList.removeFirst();
            linkedList.add(str);
        }
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m9254ka() {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        return interfaceC2540fiM9549vr != null && interfaceC2540fiM9549vr.mo9214di() == 1;
    }

    /* JADX INFO: renamed from: lr */
    public static String m9255lr(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null || interfaceC2552ri.mo9282di() == null || m9251ik()) {
            return null;
        }
        return interfaceC2552ri.mo9282di().optString("type");
    }

    /* JADX INFO: renamed from: lr */
    private static synchronized String m9256lr(String str) {
        StringBuilder sb;
        LinkedList<String> linkedList = f7061lr;
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
            linkedList.add(str);
        } else {
            linkedList.add(str);
        }
        sb = new StringBuilder();
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m9257lr() {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        return interfaceC2540fiM9549vr != null && interfaceC2540fiM9549vr.mo9214di() == 0;
    }

    /* JADX INFO: renamed from: mj */
    public static long m9258mj(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null || interfaceC2552ri.mo9282di() == null || !m9257lr()) {
            return 0L;
        }
        try {
            return new JSONObject(interfaceC2552ri.mo9282di().optString("ad_extra_data")).optLong("sdk_event_index");
        } catch (Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: qt */
    public static void m9259qt(InterfaceC2552ri interfaceC2552ri) {
        try {
            if (m9257lr()) {
                InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
                if (!TextUtils.isEmpty(interfaceC2552ri.mo9284ik())) {
                    C2547lr.m9244ri(C2557ka.f7082ka.m9402qh(), 1);
                }
                if (interfaceC2540fiM9549vr == null || !interfaceC2540fiM9549vr.mo9220lr()) {
                    return;
                }
                if (interfaceC2552ri.mo9286ka() == 1) {
                    m9255lr(interfaceC2552ri);
                    m9249ik(interfaceC2552ri);
                    interfaceC2552ri.mo9284ik();
                    m9271sf(interfaceC2552ri);
                    return;
                }
                if (interfaceC2552ri.mo9286ka() == 0) {
                    if (interfaceC2552ri.mo9287lr() != 3) {
                        if (jbs(interfaceC2552ri) != 0) {
                            m9261ri(interfaceC2552ri);
                        } else {
                            m9261ri(interfaceC2552ri);
                        }
                        m9258mj(interfaceC2552ri);
                        interfaceC2552ri.mo9284ik();
                        m9271sf(interfaceC2552ri);
                        return;
                    }
                    if (interfaceC2552ri.mo9282di() != null) {
                        interfaceC2552ri.mo9282di().optString(NotificationCompat.CATEGORY_EVENT);
                        m9258mj(interfaceC2552ri);
                        jbs(interfaceC2552ri);
                        interfaceC2552ri.mo9284ik();
                        m9271sf(interfaceC2552ri);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m9260ri(int i) {
        switch (i) {
            case 1:
                return "flush once";
            case 2:
                return "flush memory db";
            case 3:
                return "flush memory";
            case 4:
                return "new event";
            case 5:
                return "server busy";
            case 6:
                return "empty message";
            case 7:
                return "net error";
            default:
                return BuildConfig.FLAVOR;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m9261ri(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null || interfaceC2552ri.mo9282di() == null || m9251ik()) {
            return null;
        }
        return interfaceC2552ri.mo9287lr() == 3 ? interfaceC2552ri.mo9282di().optString(NotificationCompat.CATEGORY_EVENT) : interfaceC2552ri.mo9282di().optString("label");
    }

    /* JADX INFO: renamed from: ri */
    public static void m9262ri() {
        if (f7057di != null) {
            return;
        }
        String[] strArr = {"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", "render_time", "splash_ad", "preload_start", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, "preload_success", "show_failed", "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", "client_false_show", "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", "request", C11494Ie.f24627n, "parse_finished", "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", "network_type", "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", "triggered", "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", AdError.UNDEFINED_DOMAIN, "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", "track", "custom_event", "rd_landing_page_stat", "update_local_data", "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", "push_launch", "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", "service_description_page_duration", "enter_business_qualification_page ", "service_description_page_show", "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", "bidding_receive", "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", "click_anchor_gift_card", "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", "auto_open", "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", "check_closed_type", "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"};
        f7057di = new HashMap<>(446);
        for (int i = 0; i < 446; i++) {
            f7057di.put(strArr[i], 1);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9263ri(int i, List<InterfaceC2552ri> list, long j) {
        if (xha.m9524di().m9549vr().xha()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (i == 200) {
                C2557ka.f7082ka.saa().getAndAdd(jCurrentTimeMillis);
                C2557ka.f7082ka.m9413xe().incrementAndGet();
                C2557ka.f7082ka.m9396nd().getAndAdd(list.size());
                C2557ka.f7082ka.m9390jc().getAndAdd(list.size());
                return;
            }
            if (i == -1) {
                C2557ka.f7082ka.m9415zb().getAndAdd(list.size());
            } else {
                C2557ka.f7082ka.tnn().getAndAdd(list.size());
            }
            C2557ka.f7082ka.m9399pc().getAndAdd(jCurrentTimeMillis);
            C2557ka.f7082ka.yjm().incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m9264ri(InterfaceC2552ri interfaceC2552ri, String str, InterfaceC2540fi interfaceC2540fi) {
        String strM9261ri = m9261ri(interfaceC2552ri);
        if (m9270ri(strM9261ri)) {
            return;
        }
        String strM9247fi = m9247fi(interfaceC2552ri);
        if (interfaceC2552ri.mo9286ka() == 0 && interfaceC2540fi.mo9227ri()) {
            m9253ka(strM9261ri + "_" + jbs(interfaceC2552ri) + "_" + strM9247fi + "_" + str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9265ri(List<InterfaceC2552ri> list, int i) {
        try {
            if (xha.m9524di().m9549vr().xha()) {
                for (InterfaceC2552ri interfaceC2552ri : list) {
                    if (interfaceC2552ri != null && interfaceC2552ri.mo9289mj() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC2552ri.mo9289mj();
                        C2557ka.f7082ka.m9385fe().incrementAndGet();
                        C2557ka.f7082ka.m9414xm().getAndAdd(jCurrentTimeMillis);
                        interfaceC2552ri.mo9285ik(System.currentTimeMillis());
                    }
                    if (interfaceC2552ri != null) {
                        m9246di(interfaceC2552ri);
                    }
                }
                C2557ka.f7082ka.bnj().getAndAdd(list.size());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9266ri(List<InterfaceC2552ri> list, int i, String str) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || !interfaceC2540fiM9549vr.mo9220lr() || list == null || m9251ik()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (InterfaceC2552ri interfaceC2552ri : list) {
            if (interfaceC2552ri.mo9286ka() == 0) {
                JSONObject jSONObjectMo9282di = interfaceC2552ri.mo9282di();
                m9261ri(interfaceC2552ri);
                if (interfaceC2552ri.mo9287lr() != 3) {
                    m9258mj(interfaceC2552ri);
                    jbs(interfaceC2552ri);
                    m9252ka(interfaceC2552ri);
                } else if (jSONObjectMo9282di != null) {
                    jSONObjectMo9282di.optString(NotificationCompat.CATEGORY_EVENT);
                }
                z = true;
            } else if (interfaceC2552ri.mo9286ka() == 1) {
                m9255lr(interfaceC2552ri);
                m9249ik(interfaceC2552ri);
            }
        }
        if (z) {
            sb.toString();
            m9260ri(i);
            list.size();
        } else {
            sb.toString();
            m9260ri(i);
            list.size();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9267ri(List<InterfaceC2552ri> list, String str) {
        try {
            InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
            if (interfaceC2540fiM9549vr == null || !interfaceC2540fiM9549vr.xha() || list == null) {
                return;
            }
            for (InterfaceC2552ri interfaceC2552ri : list) {
                if (interfaceC2552ri != null) {
                    m9264ri(interfaceC2552ri, str, interfaceC2540fiM9549vr);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9268ri(JSONObject jSONObject, C2554ri c2554ri) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr != null && interfaceC2540fiM9549vr.mo9220lr() && m9248fi()) {
            jSONObject.optString("label");
            c2554ri.mo9283fi();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9269ri(boolean z, int i, InterfaceC2552ri interfaceC2552ri) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (m9251ik() || interfaceC2540fiM9549vr == null || !interfaceC2540fiM9549vr.mo9220lr()) {
            return;
        }
        m9260ri(i);
        TextUtils.isEmpty(m9255lr(interfaceC2552ri));
        TextUtils.isEmpty(m9261ri(interfaceC2552ri));
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m9270ri(String str) {
        HashMap<String, Integer> map = f7057di;
        if (map == null || str == null) {
            return false;
        }
        return map.containsKey(str);
    }

    /* JADX INFO: renamed from: sf */
    private static String m9271sf(InterfaceC2552ri interfaceC2552ri) {
        if (interfaceC2552ri == null || interfaceC2552ri.mo9282di() == null || !m9257lr()) {
            return null;
        }
        JSONObject jSONObjectMo9282di = interfaceC2552ri.mo9282di();
        try {
            return new JSONObject(interfaceC2552ri.mo9286ka() == 1 ? jSONObjectMo9282di.optString("event_extra") : jSONObjectMo9282di.optString("ad_extra_data")).optString("sdk_session_id");
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public static void xha(InterfaceC2552ri interfaceC2552ri) {
        try {
            if (xha.m9524di().m9549vr().xha()) {
                C2557ka.f7082ka.m9405ri(System.currentTimeMillis() - interfaceC2552ri.xha());
                interfaceC2552ri.mo9288lr(System.currentTimeMillis());
                if (interfaceC2552ri.mo9286ka() == 0 && xha.m9524di().m9549vr() != null && xha.m9524di().m9549vr().mo9227ri()) {
                    String strM9261ri = m9261ri(interfaceC2552ri);
                    if (m9270ri(strM9261ri)) {
                        return;
                    }
                    JSONObject jSONObjectMo9282di = interfaceC2552ri.mo9282di();
                    String strOptString = interfaceC2552ri.mo9282di().optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("save_success_labels", m9256lr(strM9261ri + "_" + jbs(interfaceC2552ri)));
                        jSONObjectMo9282di.put("ad_extra_data", jSONObject.toString());
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject2.optString("save_success_labels"))) {
                        jSONObject2.put("save_success_labels", m9256lr(strM9261ri + "_" + jbs(interfaceC2552ri)));
                    }
                    jSONObjectMo9282di.put("ad_extra_data", jSONObject2.toString());
                }
            }
        } catch (Exception unused) {
        }
    }
}
