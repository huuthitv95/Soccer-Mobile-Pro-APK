package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {
    /* JADX INFO: renamed from: ri */
    public static String m13550ri(int i) {
        try {
            if (i == -16) {
                return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_ad_able_false_msg");
            }
            if (i == -15) {
                return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_lack_android_manifest_configuration");
            }
            if (i == 117) {
                return "dynamic1 render time_out";
            }
            if (i == 118) {
                return "dynamic1 render error";
            }
            if (i == 127) {
                return "dynamic2 render time_out";
            }
            if (i == 128) {
                return "dynamic2 render error";
            }
            if (i == 137) {
                return "ugen render time_out";
            }
            if (i == 138) {
                return "ugen render error";
            }
            if (i == 201) {
                return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_load_creative_icon_response_error");
            }
            if (i == 202) {
                return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_load_creative_icon_error");
            }
            switch (i) {
                case -100:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_init_setting_config_not_complete");
                case 113:
                    return "dynamic1 parse error";
                case INVALID_RI_ENDPOINT_VALUE:
                    return "dynamic2 parse error";
                case OMSDK_JS_WRITE_FAILED_VALUE:
                    return "ugen parse error";
                case AD_SERVER_ERROR_VALUE:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_no_ad");
                case 40000:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_content_type");
                case 40001:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_request_pb_error");
                case 40002:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_app_empty");
                case 40003:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_wap_empty");
                case 40004:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_adslot_empty");
                case 40005:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_adslot_size_empty");
                case 40006:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_adslot_id_error");
                case 40007:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_code_adcount_error");
                case 40008:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_image_size");
                case 40009:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_media_id");
                case 40010:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_media_type");
                case 40011:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_ad_type");
                case 40012:
                case 40017:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_access_method_pass");
                case 40013:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_splash_ad_type");
                case 40014:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_redirect");
                case 40015:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_request_invalid");
                case 40016:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_slot_id_app_id_differ");
                case 40018:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_package_name");
                case 40019:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_adtype_differ");
                case 40020:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_new_register_limit");
                case 40021:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_apk_sign_check_error");
                case 40022:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_origin_ad_error");
                case 40023:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_union_os_error");
                case 40024:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_union_sdk_too_old");
                case 40026:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_device_ip");
                case 40028:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_update_version");
                case 40034:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_bidding_type");
                case 40042:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_interstitial_version");
                case 40060:
                    return "Appid is not registered on pangle media platform";
                case 50001:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_sys_error");
                case 60001:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_ror_code_show_event_error");
                case 60002:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_code_click_event_error");
                case 60007:
                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_verify_reward");
                default:
                    switch (i) {
                        case SplitInstallErrorCode.SPLITCOMPAT_EMULATION_ERROR /* -12 */:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_splash_not_have_cache_error");
                        case SplitInstallErrorCode.SPLITCOMPAT_VERIFICATION_ERROR /* -11 */:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_splash_cache_expired_error");
                        case -10:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_splash_cache_parse_error");
                        case SplitInstallErrorCode.SERVICE_DIED /* -9 */:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_request_body_error");
                        case -8:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_frequent_call_erroe");
                        case -7:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_splash_ad_load_image_error");
                        case -6:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_insert_ad_load_image_error");
                        case -5:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_banner_ad_load_image_error");
                        case -4:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_ad_data_error");
                        case -3:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_no_ad_parse");
                        case -2:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_net_error");
                        case -1:
                            return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_parse_fail");
                        default:
                            switch (i) {
                                case 101:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_render_render_parse_error");
                                case 102:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_render_main_template_invalid");
                                case 103:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_render_diff_template_invalid");
                                case 104:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_render_fail_meta_invalid");
                                case 105:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_render_fail_template_parse_error");
                                case 106:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_render_fail_unknown");
                                case 107:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_render_fail_timeout");
                                case 108:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_reder_ad_load_timeout");
                                case 109:
                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_template_load_fail");
                                default:
                                    switch (i) {
                                        case 10002:
                                            return "load time out";
                                        case GamesActivityResultCodes.RESULT_LICENSE_FAILED /* 10003 */:
                                            return "resource error";
                                        case GamesActivityResultCodes.RESULT_APP_MISCONFIGURED /* 10004 */:
                                            return "Not allowed PAConsent value, please set 0 or 1";
                                        case 10005:
                                            return "Token enable is invalid";
                                        case GamesActivityResultCodes.RESULT_NETWORK_FAILURE /* 10006 */:
                                            return "Adx id not allow request,Please check adx id";
                                        case 10007:
                                            return "Pangle SDK does not provide advertising services for child users-(" + System.currentTimeMillis() + "-" + C3307lr.m14718ri().m14719aw() + ")";
                                        case 10008:
                                            return "The user compliance status verification is incomplete or has failed-(" + C3307lr.m14718ri().m14727mj() + ")";
                                        case 10009:
                                            return "Pangle SDK has disable,Please do not use PAGSdk.setSdkDisable";
                                        default:
                                            switch (i) {
                                                case 40052:
                                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_empty_content");
                                                case 40053:
                                                    return "The material meta data was incorrect.";
                                                default:
                                                    return C2729uq.m10311ri(C3299nr.m14642ri(), "tt_error_unknow");
                                            }
                                    }
                            }
                    }
            }
        } catch (Throwable unused) {
            return "";
        }
    }
}
