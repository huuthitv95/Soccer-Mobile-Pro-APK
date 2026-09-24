package com.mbridge.msdk.foundation.entity;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.p289db.middle.C13025b;
import com.mbridge.msdk.foundation.same.report.metrics.C13152a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CampaignEx extends DomainCampaignEx {
    public static final int CAMPAIN_NV_T2_VALUE_3 = 3;
    public static final int CAMPAIN_NV_T2_VALUE_4 = 4;
    public static final String CLICKMODE_ON = "5";
    public static final int CLICK_TIMEOUT_INTERVAL_DEFAULT_VALUE = 2;
    public static final int C_UA_DEFAULT_VALUE = 1;
    private static final int DEFAULT_READY_RATE = 100;
    public static final String ENDCARD_URL = "endcard_url";
    public static final int FLAG_DEFAULT_SPARE_OFFER = -1;
    public static final int FLAG_IS_SPARE_OFFER = 1;
    public static final int FLAG_NOT_SPARE_OFFER = 0;
    public static final int IMP_UA_DEFAULT_VALUE = 1;
    public static final int IV_RV_DEFAULT_PROGRESS_BAR_SHOW_STATE = 0;
    public static final int IV_RV_DEFAULT_USE_SKIP_TIME = 0;
    public static final String JSON_AD_IMP_KEY = "sec";
    public static final String JSON_AD_IMP_VALUE = "url";
    public static final String JSON_KEY_AAB = "aab";
    public static final String JSON_KEY_ADVIMP = "adv_imp";
    public static final String JSON_KEY_AD_AKS = "aks";
    public static final String JSON_KEY_AD_AL = "al";
    public static final String JSON_KEY_AD_HTML = "ad_html";
    public static final String JSON_KEY_AD_K = "k";
    public static final String JSON_KEY_AD_MP = "mp";
    public static final String JSON_KEY_AD_Q = "q";
    public static final String JSON_KEY_AD_R = "r";
    public static final String JSON_KEY_AD_SOURCE_ID = "ad_source_id";
    public static final String JSON_KEY_AD_TMP_IDS = "tmp_ids";
    public static final String JSON_KEY_AD_TRACKING_DROPOUT_TRACK = "dropout_track";
    public static final String JSON_KEY_AD_TRACKING_IMPRESSION_T2 = "impression_t2";
    public static final String JSON_KEY_AD_TRACKING_PLYCMPT_TRACK = "plycmpt_track";
    public static final String JSON_KEY_AD_URL_LIST = "ad_url_list";
    public static final String JSON_KEY_AD_ZIP = "ad_tpl_url";
    public static final String JSON_KEY_APP_SIZE = "app_size";
    public static final String JSON_KEY_AUTO_SHOW_MINI_CARD = "auto_mc";
    public static final String JSON_KEY_BANNER_HTML = "banner_html";
    public static final String JSON_KEY_BANNER_URL = "banner_url";
    public static final String JSON_KEY_BTY = "ctype";
    public static final String JSON_KEY_CAMPAIGN_UNITID = "unitId";
    public static final String JSON_KEY_CLICK_INTERVAL = "c_ct";
    public static final String JSON_KEY_CLICK_MODE = "click_mode";
    public static final String JSON_KEY_CLICK_TIMEOUT_INTERVAL = "c_toi";
    public static final String JSON_KEY_CLICK_URL = "click_url";
    public static final String JSON_KEY_CREATIVE_ID = "creative_id";
    public static final String JSON_KEY_CTA_TEXT = "ctatext";
    public static final String JSON_KEY_C_C_TIME = "c_c_time";
    public static final String JSON_KEY_C_UA = "c_ua";
    public static final String JSON_KEY_DEEP_LINK_URL = "deep_link";
    public static final String JSON_KEY_DESC = "desc";
    public static final String JSON_KEY_ECPPV = "encrypt_ecppv";
    public static final String JSON_KEY_EC_CREATIVE_ID = "ec_crtv_id";
    public static final String JSON_KEY_EC_TEMP_ID = "ec_temp_id";
    public static final String JSON_KEY_ENCRYPT_PRICE = "encrypt_p";
    public static final String JSON_KEY_ENDCARD_CLICK = "endcard_click_result";
    public static final String JSON_KEY_EXT_DATA = "ext_data";
    public static final String JSON_KEY_FAC = "fac";
    public static final String JSON_KEY_FCA = "fca";
    public static final String JSON_KEY_FCB = "fcb";
    public static final String JSON_KEY_FLB = "flb";
    public static final String JSON_KEY_FLB_SKIP_TIME = "flb_skiptime";
    public static final String JSON_KEY_GIF_URL = "gif_url";
    public static final String JSON_KEY_GUIDELINES = "guidelines";
    public static final String JSON_KEY_HASMBTPLMARK = "hasMBTplMark";
    public static final String JSON_KEY_HB = "hb";
    public static final String JSON_KEY_ICON_URL = "icon_url";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_IMAGE_SIZE = "image_size";
    public static final String JSON_KEY_IMAGE_URL = "image_url";
    public static final String JSON_KEY_IMPRESSION_URL = "impression_url";
    public static final String JSON_KEY_IMP_REPORT_TYPE = "imp_report_type";
    public static final String JSON_KEY_IMP_UA = "imp_ua";
    public static final String JSON_KEY_JM_PD = "jm_pd";
    public static final String JSON_KEY_LANDING_TYPE = "landing_type";
    public static final String JSON_KEY_LINK_TYPE = "link_type";
    public static final String JSON_KEY_LOCAL_REQUEST_ID = "local_rid";
    public static final String JSON_KEY_MAITVE = "maitve";
    public static final String JSON_KEY_MAITVESRC = "maitve_src";
    public static final String JSON_KEY_MRAID = "mraid";
    public static final String JSON_KEY_MRAIDFORH5 = "mraid_src";
    public static final String JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T = "adspace_t";
    public static final String JSON_KEY_NEW_INTERSTITIAL_CBD = "cbd";
    public static final String JSON_KEY_NEW_INTERSTITIAL_VST = "vst";
    public static final String JSON_KEY_NOTICE_URL = "notice_url";
    public static final String JSON_KEY_NUMBER_RATING = "number_rating";
    public static final String JSON_KEY_NV_T2 = "nv_t2";
    public static final String JSON_KEY_OFFER_TYPE = "offer_type";
    public static final String JSON_KEY_PACKAGE_NAME = "package_name";
    public static final String JSON_KEY_PLCT = "plct";
    public static final String JSON_KEY_PLCTB = "plctb";
    public static final String JSON_KEY_PRIVACY_URL = "privacy_url";
    public static final String JSON_KEY_PROG_BAR = "prog_bar";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_READY_RATE = "ready_rate";
    public static final String JSON_KEY_RETARGET_OFFER = "retarget_offer";
    public static final String JSON_KEY_RETARGET_TYPE = "rtins_type";
    public static final String JSON_KEY_REWARD_AMOUNT = "reward_amount";
    public static final String JSON_KEY_REWARD_NAME = "reward_name";
    public static final String JSON_KEY_REWARD_PLUS = "rw_pl";
    public static final String JSON_KEY_REWARD_TEMPLATE = "rv";
    public static final String JSON_KEY_REWARD_VIDEO_MD5 = "md5_file";
    public static final String JSON_KEY_RS_IGNORE_CHECK_RULE = "rs_ignc_r";
    public static final String JSON_KEY_SHOW_MINI_CARD_DELAY_TIME = "mc_trig_t";
    public static final String JSON_KEY_STAR = "rating";
    public static final String JSON_KEY_ST_IEX = "iex";
    public static final String JSON_KEY_ST_TS = "ts";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_TIMESTAMP = "timestamp";
    public static final String JSON_KEY_TITLE = "title";
    public static final String JSON_KEY_TOKEN_RULE = "token_r";
    public static final String JSON_KEY_TP_OFFER = "tp_offer";
    public static final String JSON_KEY_T_IMP = "t_imp";
    public static final String JSON_KEY_USER_ACTIVATION = "user_activation";
    public static final String JSON_KEY_USE_SKIP_TIME = "use_skip_time";
    public static final String JSON_KEY_VCN = "vcn";
    public static final String JSON_KEY_VIDEO_CHECK_TYPE = "vck_t";
    public static final String JSON_KEY_VIDEO_COMPLETE_TIME = "view_com_time";
    public static final String JSON_KEY_VIDEO_CREATIVE_ID = "vid_crtv_id";
    public static final String JSON_KEY_VIDEO_CTN_TYPE = "vctn_t";
    public static final String JSON_KEY_VIDEO_LENGTHL = "video_length";
    public static final String JSON_KEY_VIDEO_RESOLUTION = "video_resolution";
    public static final String JSON_KEY_VIDEO_SIZE = "video_size";
    public static final String JSON_KEY_VIDEO_URL = "video_url";
    public static final String JSON_KEY_WATCH_MILE = "watch_mile";
    public static final String JSON_KEY_WITHOUT_INSTALL_CHECK = "wtick";
    public static final String JSON_NATIVE_VIDEO_AD_TRACKING = "ad_tracking";
    public static final String JSON_NATIVE_VIDEO_CLICK = "click";
    public static final String JSON_NATIVE_VIDEO_CLOSE = "close";
    public static final String JSON_NATIVE_VIDEO_COMPLETE = "complete";
    public static final String JSON_NATIVE_VIDEO_ENDCARD = "endcard";
    public static final String JSON_NATIVE_VIDEO_ENDCARD_SHOW = "endcard_show";
    public static final String JSON_NATIVE_VIDEO_ERROR = "error";
    public static final String JSON_NATIVE_VIDEO_FIRST_QUARTILE = "first_quartile";
    public static final String JSON_NATIVE_VIDEO_MIDPOINT = "midpoint";
    public static final String JSON_NATIVE_VIDEO_MUTE = "mute";
    public static final String JSON_NATIVE_VIDEO_PAUSE = "pause";
    public static final String JSON_NATIVE_VIDEO_PLAY_PERCENTAGE = "play_percentage";
    public static final String JSON_NATIVE_VIDEO_RESUME = "resume";
    public static final String JSON_NATIVE_VIDEO_START = "start";
    public static final String JSON_NATIVE_VIDEO_THIRD_QUARTILE = "third_quartile";
    public static final String JSON_NATIVE_VIDEO_UNMUTE = "unmute";
    public static final String JSON_NATIVE_VIDEO_VIDEO_CLICK = "video_click";
    public static final String JSON_NATIVE_VIDOE_IMPRESSION = "impression";
    public static final String KEY_ACTIVITY_CHECK_SWITCH = "ac_s";
    public static final String KEY_ACTIVITY_PATH_AND_NAME = "ac";
    public static final String KEY_ADCHOICE = "adchoice";
    public static final String KEY_AD_TYPE = "ad_type";
    public static final String KEY_CLICK_TEMP_SOURCE = "click_temp_source";
    public static final String KEY_EC_TEMP_DISPLAY_TYPE = "ec_temp_display_type";
    public static final String KEY_IA_CACHE = "ia_cache";
    public static final String KEY_IA_EXT1 = "ia_ext1";
    public static final String KEY_IA_EXT2 = "ia_ext2";
    public static final String KEY_IA_ICON = "ia_icon";
    public static final String KEY_IA_ORI = "ia_ori";
    public static final String KEY_IA_RST = "ia_rst";
    public static final String KEY_IA_URL = "ia_url";
    public static final String KEY_IS_CMPT_ENTRY = "cmpt=1";
    public static final String KEY_IS_DOWNLOAD = "is_download_zip";
    public static final String KEY_LOCAL_ALLOW_TRACK_CLICK = "latc";
    public static final String KEY_LOCAL_CHECK_STATE = "lcs";
    public static final String KEY_OC_TIME = "oc_time";
    public static final String KEY_OC_TYPE = "oc_type";
    public static final String KEY_OMID = "omid";
    public static final String KEY_PLAY_TEMP_DISPLAY_TYPE = "play_temp_display_type";
    public static final String KEY_SECOND_FILTER_AD_SHOW_CALL_STATE = "f_a_s_c_s";
    public static final String KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE = "f_a_v_c_s";
    public static final String KEY_SECOND_REQUEST_CALLBACK_STATE = "i_s_c_t";
    public static final String KEY_SECOND_REQUEST_INDEX = "r_index";
    public static final String KEY_SECOND_SHOW_INDEX = "s_show_index";
    public static final String KEY_SHOW_INDEX = "show_index";
    public static final String KEY_SHOW_TYPE = "show_type";
    public static final String KEY_TRIGGER_CLICK_SOURCE = "trigger_click_source";
    public static final String KEY_T_LIST = "t_list";
    public static final int LANDING_TYPE_VALUE_OPEN_BROWSER = 1;
    public static final int LANDING_TYPE_VALUE_OPEN_GP_BY_PACKAGE = 3;
    public static final int LANDING_TYPE_VALUE_OPEN_WEBVIEW = 2;
    public static final int LINK_TYPE_1 = 1;
    public static final int LINK_TYPE_2 = 2;
    public static final int LINK_TYPE_3 = 3;
    public static final int LINK_TYPE_4 = 4;
    public static final int LINK_TYPE_8 = 8;
    public static final int LINK_TYPE_9 = 9;
    public static final int LINK_TYPE_MINI_PROGRAM = 12;
    public static final int NEW_INTERSTITIAL_DEFAULT_AD_SPACE_T = 1;
    public static final int NEW_INTERSTITIAL_DEFAULT_CBD = -2;
    public static final int NEW_INTERSTITIAL_DEFAULT_VST = -2;
    public static final String PLAYABLE_ADS_WITHOUT_VIDEO = "playable_ads_without_video";
    public static final int PLAYABLE_ADS_WITHOUT_VIDEO_DEFAULT = 1;
    public static final int PLAYABLE_ADS_WITHOUT_VIDEO_ENDCARD = 2;
    public static final String PRIVACY_BUTTON_VIDEO_TEMPLATE_SWITCH = "show_privacy_btn";
    public static final int RETAR_GETING_IS = 1;
    public static final int RETAR_GETING_NOT = 2;
    public static final int RTINS_TYPE_DONE = 1;
    public static final int RTINS_TYPE_NOT_DONE = 2;
    public static final String TAG = "CampaignEx";
    public static final String URL_KEY_EXP_IDS = "exp_ids";
    public static final String VIDEO_END_TYPE = "video_end_type";
    public static final int VIDEO_END_TYPE_BROWSER = 5;
    public static final int VIDEO_END_TYPE_DEFAULT = 2;
    public static final int VIDEO_END_TYPE_FINISH = 1;
    public static final int VIDEO_END_TYPE_NATIVE = 100;
    public static final int VIDEO_END_TYPE_REULSE = 2;
    public static final int VIDEO_END_TYPE_VAST = 3;
    public static final int VIDEO_END_TYPE_WEBVIEW = 4;
    private static final long serialVersionUID = 1;
    private String CMPTEntryUrl;
    private AabEntity aabEntity;
    private int adSpaceT;
    private int adType;
    private String ad_url_list;
    private C13064a adchoice;
    private String advImp;
    private HashMap<String, String> aks;

    /* JADX INFO: renamed from: al */
    private String f35605al;
    private int autoShowStoreMiniCard;
    private int bty;
    private long cVersionCode;
    private int cacheLevel;
    private String campaignUnitId;
    private int cbt;
    private int clickInterval;
    private String click_mode;
    private String ecppv;
    private String endScreenUrl;
    private int endcard_click_result;
    private String endcard_url;
    private String expIds;
    private String ext_data;
    private int fca;
    private int fcb;
    private int flb;
    private int flbSkipTime;
    private String gifUrl;
    private String guidelines;
    private boolean hasMBTplMark;
    private String htmlUrl;
    private String ia_ext1;
    private String ia_ext2;
    private int iex;
    private String interactiveCache;
    private int isAddSuccesful;
    private boolean isBidCampaign;
    private boolean isCallbacked;
    private int isClick;
    private int isDeleted;
    private int isDownLoadZip;
    private boolean isMraid;
    private boolean isReport;
    private boolean isReportClick;
    private int jmPd;
    private JumpLoaderResult jumpResult;

    /* JADX INFO: renamed from: k */
    private String f35606k;
    private String keyIaIcon;
    private int keyIaOri;
    private int keyIaRst;
    private String keyIaUrl;
    private String label;
    private String landingType;
    private int linkType;
    private int localCheckShow;
    private String localRequestId;
    private int maitve;
    private String maitve_src;
    private C13065b mediaViewHolder;
    private String mof_template_url;
    private int mof_tplid;

    /* JADX INFO: renamed from: mp */
    private String f35607mp;
    private String mraid;
    private String n_lrid;
    private String n_rid;
    private C13076j nativeVideoTracking;
    private String nativeVideoTrackingString;
    private int oc_time;
    private int offerType;
    private String pkgSource;
    private String placementId;
    private int progressBarShow;
    private List<String> pv_urls;

    /* JADX INFO: renamed from: q */
    private String f35608q;

    /* JADX INFO: renamed from: r */
    private String f35609r;
    private String reasond;
    private String req_ext_data;
    private String requestId;
    private String requestIdNotice;
    private int retarget_offer;
    private int rewardAmount;
    private int rewardPlayStatus;
    public RewardPlus rewardPlus;
    private C13066c rewardTemplateMode;
    private String reward_name;
    private ArrayList<Integer> rsIgnoreCheckRule;
    private int rtinsType;
    private int showCount;
    private int showStoreMiniCardDelayTime;
    private int t_imp;
    private String t_list;
    private int template;

    /* JADX INFO: renamed from: ts */
    private long f35610ts;
    private int useSkipTime;
    private String videoResolution;
    private int videoSize;
    private int watchMile;
    public boolean isRewardPopViewShowed = false;
    public boolean mMoreOfferImpShow = false;
    public String videoMD5Value = "";
    private String adHtml = "";
    private String adZip = "";
    private String bannerHtml = "";
    private String bannerUrl = "";
    private String bidToken = "";
    private int cUA = 1;
    private boolean campaignIsFiltered = false;
    private boolean canStart2C1Anim = false;
    private boolean canStartMoreOfferAnim = false;
    private int cbd = -2;
    private int clickTimeOutInterval = 2;
    private String clickURL = "";
    private long creativeId = 0;
    private String deepLinkUrl = "";
    private int dynamicTempCode = 0;
    private long ecCrtvId = 0;
    private long ecTemplateId = 0;
    private String encryptPrice = "";
    private int typed = -1;
    private int fac = 0;
    private boolean hasReportAdTrackPause = false;
    private String imageSize = "";
    private int impReportType = 0;
    private int impUA = 1;
    private String impressionURL = "";
    private boolean isCallBackImpression = false;
    private boolean isDynamicView = false;
    private boolean isReady = false;
    private int isTimeoutCheckVideoStatus = -1;
    private int loadTimeoutState = 0;
    private String moreOfferJsonData = "";
    private String noticeUrl = "";
    private int nscpt = 1;
    private int nvT2 = 6;
    private int oc_type = 0;
    private String omid = null;
    private String onlyImpressionURL = "";
    private int playable_ads_without_video = 1;
    private long plct = 0;
    private long plctb = 0;
    private long candidateCacheTime = 0;
    private int privacyButtonTemplateVisibility = 0;
    private String privacyUrl = "";
    private int readyState = 1;
    private int ready_rate = -1;
    private int spareOfferFlag = -1;
    private int tab = -1;
    private int tokenRule = 0;
    private int tpOffer = 0;
    private int trackingTcpPort = 9377;
    private boolean userActivation = false;
    private int vcn = 0;
    private long vidCrtvId = 0;
    private int videoCheckType = 2;
    private int videoCompleteTime = 0;
    private int videoCtnType = 1;
    private int videoPlayProgress = 0;
    private String videoUrlEncode = "";
    private int video_end_type = 2;
    private int vst = -2;
    private int wtick = 0;
    private int showIndex = C13152a.f36129a;
    private int showType = C13152a.f36131c;
    private int clickTempSource = 0;
    private int clickType = 2;
    private int triggerClickSource = 0;
    private boolean isTemplateRenderSucc = true;
    private boolean isECTemplateRenderSucc = true;
    private int ac_s = 1;

    /* JADX INFO: renamed from: ac */
    private String f35604ac = "";
    private int secondRequestIndex = 0;
    private int secondShowIndex = 0;
    private int filterCallBackState = 0;
    private int filterAdsVideoCallState = 0;
    private int filterAdsShowCallState = 0;
    private String netAddress = "";
    private int localAllowTrackClick = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$a */
    public static final class C13064a implements Serializable {

        /* JADX INFO: renamed from: a */
        private String f35611a = "";

        /* JADX INFO: renamed from: b */
        private String f35612b = "";

        /* JADX INFO: renamed from: c */
        private String f35613c = "";

        /* JADX INFO: renamed from: d */
        private String f35614d = "";

        /* JADX INFO: renamed from: e */
        private String f35615e = "";

        /* JADX INFO: renamed from: f */
        private int f35616f = 0;

        /* JADX INFO: renamed from: g */
        private int f35617g = 0;

        /* JADX INFO: renamed from: h */
        private String f35618h = "";

        /* JADX INFO: renamed from: i */
        private String f35619i = "";

        /* JADX INFO: renamed from: j */
        private String f35620j = "";

        /* JADX INFO: renamed from: k */
        private String f35621k = "";

        /* JADX INFO: renamed from: a */
        public static C13064a m36749a(JSONObject jSONObject) {
            C13064a c13064a = null;
            if (jSONObject != null) {
                try {
                    C13064a c13064a2 = new C13064a();
                    try {
                        c13064a2.m36757f(jSONObject.optString("adchoice_icon"));
                        c13064a2.m36759g(jSONObject.optString("adchoice_link"));
                        String strOptString = jSONObject.optString("adchoice_size");
                        c13064a2.m36761h(strOptString);
                        c13064a2.m36755d(jSONObject.optString("ad_logo_link"));
                        c13064a2.m36763i(jSONObject.optString("adv_logo"));
                        c13064a2.m36765j(jSONObject.optString("adv_name"));
                        c13064a2.m36767k(jSONObject.optString("platform_logo"));
                        c13064a2.m36768l(jSONObject.optString("platform_name"));
                        c13064a2.m36752a(m36748a(strOptString));
                        c13064a2.m36753b(m36750b(strOptString));
                        c13064a2.m36756e(jSONObject.toString());
                        return c13064a2;
                    } catch (Exception e) {
                        e = e;
                        c13064a = c13064a2;
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                        return c13064a;
                    } catch (Throwable th) {
                        th = th;
                        c13064a = c13064a2;
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                        return c13064a;
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return c13064a;
        }

        /* JADX INFO: renamed from: b */
        public static int m36750b(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (strArrSplit = str.split("x")) != null && strArrSplit.length > 0) {
                    return Integer.parseInt(strArrSplit[0]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        /* JADX INFO: renamed from: c */
        public static C13064a m36751c(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return m36749a(new JSONObject(str));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m36755d(String str) {
            this.f35611a = str;
        }

        /* JADX INFO: renamed from: e */
        public void m36756e(String str) {
            this.f35612b = str;
        }

        /* JADX INFO: renamed from: f */
        public void m36757f(String str) {
            this.f35613c = str;
        }

        /* JADX INFO: renamed from: g */
        public String m36758g() {
            return this.f35613c;
        }

        /* JADX INFO: renamed from: h */
        public String m36760h() {
            return this.f35614d;
        }

        /* JADX INFO: renamed from: i */
        public String m36762i() {
            return this.f35615e;
        }

        /* JADX INFO: renamed from: j */
        public int m36764j() {
            return this.f35616f;
        }

        /* JADX INFO: renamed from: k */
        public int m36766k() {
            return this.f35617g;
        }

        /* JADX INFO: renamed from: l */
        public void m36768l(String str) {
            this.f35621k = str;
        }

        /* JADX INFO: renamed from: d */
        public String m36754d() {
            return this.f35612b;
        }

        /* JADX INFO: renamed from: g */
        public void m36759g(String str) {
            this.f35614d = str;
        }

        /* JADX INFO: renamed from: h */
        public void m36761h(String str) {
            this.f35615e = str;
        }

        /* JADX INFO: renamed from: i */
        public void m36763i(String str) {
            this.f35618h = str;
        }

        /* JADX INFO: renamed from: j */
        public void m36765j(String str) {
            this.f35619i = str;
        }

        /* JADX INFO: renamed from: k */
        public void m36767k(String str) {
            this.f35620j = str;
        }

        /* JADX INFO: renamed from: b */
        public void m36753b(int i) {
            this.f35617g = i;
        }

        /* JADX INFO: renamed from: a */
        public static int m36748a(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (strArrSplit = str.split("x")) != null && strArrSplit.length > 1) {
                    return Integer.parseInt(strArrSplit[1]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public void m36752a(int i) {
            this.f35616f = i;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$b */
    public static final class C13065b implements Serializable {

        /* JADX INFO: renamed from: a */
        public Map<Integer, String> f35622a;

        /* JADX INFO: renamed from: b */
        public boolean f35623b = false;

        /* JADX INFO: renamed from: c */
        public boolean f35624c = false;

        /* JADX INFO: renamed from: d */
        public boolean f35625d = false;

        /* JADX INFO: renamed from: e */
        public boolean f35626e = false;

        /* JADX INFO: renamed from: f */
        public boolean f35627f = false;

        /* JADX INFO: renamed from: g */
        public boolean f35628g = false;

        /* JADX INFO: renamed from: h */
        public boolean f35629h = false;

        /* JADX INFO: renamed from: i */
        public boolean f35630i = false;

        /* JADX INFO: renamed from: j */
        public boolean f35631j = false;

        /* JADX INFO: renamed from: k */
        public boolean f35632k = false;

        /* JADX INFO: renamed from: l */
        public boolean f35633l = false;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$c */
    public static final class C13066c implements Serializable {

        /* JADX INFO: renamed from: a */
        private List<a> f35634a;

        /* JADX INFO: renamed from: b */
        private int f35635b;

        /* JADX INFO: renamed from: c */
        private String f35636c;

        /* JADX INFO: renamed from: d */
        private String f35637d;

        /* JADX INFO: renamed from: e */
        private String f35638e;

        /* JADX INFO: renamed from: f */
        private int f35639f;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$c$a */
        public static final class a implements Serializable {

            /* JADX INFO: renamed from: a */
            public List<String> f35640a = new ArrayList();

            /* JADX INFO: renamed from: b */
            public String f35641b;
        }

        public C13066c(String str) {
            this.f35637d = str;
        }

        /* JADX INFO: renamed from: b */
        public void m36775b(String str) {
            this.f35636c = str;
        }

        /* JADX INFO: renamed from: c */
        public void m36776c(String str) {
            this.f35638e = str;
        }

        /* JADX INFO: renamed from: d */
        public List<a> m36777d() {
            return this.f35634a;
        }

        /* JADX INFO: renamed from: g */
        public int m36778g() {
            return this.f35635b;
        }

        /* JADX INFO: renamed from: h */
        public String m36779h() {
            return this.f35636c;
        }

        /* JADX INFO: renamed from: i */
        public String m36780i() {
            return this.f35637d;
        }

        /* JADX INFO: renamed from: j */
        public String m36781j() {
            return this.f35638e;
        }

        /* JADX INFO: renamed from: k */
        public int m36782k() {
            return this.f35639f;
        }

        /* JADX INFO: renamed from: a */
        public static C13066c m36769a(String str) {
            try {
                if (C13182a1.m37597b(str)) {
                    return m36770a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m36774b(int i) {
            this.f35639f = i;
        }

        /* JADX INFO: renamed from: a */
        public static C13066c m36770a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!C13182a1.m37597b(jSONObject.toString())) {
                    return null;
                }
                C13066c c13066c = new C13066c(jSONObject.toString());
                c13066c.m36774b(jSONObject.optInt("video_template", 1));
                c13066c.m36776c(jSONObject.optString("template_url"));
                c13066c.m36772a(jSONObject.optInt("orientation"));
                c13066c.m36775b(jSONObject.optString("paused_url"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("image");
                if (jSONObjectOptJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        List<String> listM37907b = C13229v0.m37907b(jSONObjectOptJSONObject.optJSONArray(next));
                        if (listM37907b != null && listM37907b.size() > 0) {
                            a aVar = new a();
                            aVar.f35641b = next;
                            aVar.f35640a.addAll(listM37907b);
                            arrayList.add(aVar);
                        }
                    }
                    c13066c.m36773a(arrayList);
                }
                return c13066c;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m36773a(List<a> list) {
            this.f35634a = list;
        }

        /* JADX INFO: renamed from: a */
        public void m36772a(int i) {
            this.f35635b = i;
        }
    }

    public static C13076j TrackingStr2Object(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                C13076j c13076j = new C13076j();
                c13076j.m36904k(processNativeVideoTrackingArray(jSONObject.optJSONArray("impression")));
                c13076j.m36914p(processNativeVideoTrackingArray(jSONObject.optJSONArray("start")));
                c13076j.m36902j(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_FIRST_QUARTILE)));
                c13076j.m36906l(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_MIDPOINT)));
                c13076j.m36916q(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_THIRD_QUARTILE)));
                c13076j.m36895f(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_COMPLETE)));
                c13076j.m36888a(parsePlayCentage(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_PLAY_PERCENTAGE)));
                c13076j.m36908m(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_MUTE)));
                c13076j.m36918r(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_UNMUTE)));
                c13076j.m36892d(processNativeVideoTrackingArray(jSONObject.optJSONArray("click")));
                c13076j.m36910n(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_PAUSE)));
                c13076j.m36912o(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_RESUME)));
                c13076j.m36900i(processNativeVideoTrackingArray(jSONObject.optJSONArray("error")));
                c13076j.m36896g(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_ENDCARD)));
                c13076j.m36894e(processNativeVideoTrackingArray(jSONObject.optJSONArray("close")));
                c13076j.m36898h(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_ENDCARD_SHOW)));
                c13076j.m36920s(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_VIDEO_CLICK)));
                c13076j.m36891c(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_KEY_AD_TRACKING_IMPRESSION_T2)));
                c13076j.m36889a(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_KEY_AD_TRACKING_DROPOUT_TRACK)));
                c13076j.m36890b(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_KEY_AD_TRACKING_PLYCMPT_TRACK)));
                return DomainCampaignEx.trackingStr2Object(jSONObject, c13076j);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static JSONObject campaignToJsonObject(CampaignEx campaignEx, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObjectCampaignToJsonObject = campaignToJsonObject(campaignEx);
        jSONObjectCampaignToJsonObject.put("isReady", z);
        jSONObjectCampaignToJsonObject.put("expired", z2);
        return jSONObjectCampaignToJsonObject;
    }

    private void checkAndReSetDynamicViewState(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals(this.mof_template_url) || !this.isDynamicView) {
            boolean zM37938i = C13229v0.m37938i(str);
            int iM37903b = C13229v0.m37903b(str);
            if (zM37938i) {
                setDynamicView(true);
                setDynamicTempCode(iM37903b);
            }
        }
    }

    private static JSONObject dealV5Temp(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (jSONObject.has(JSON_KEY_AD_TMP_IDS) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(JSON_KEY_AD_TMP_IDS)) != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject.remove(JSON_KEY_AD_TMP_IDS);
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectM36740a = C13025b.m36738a().m36740a(jSONArrayOptJSONArray.getString(i));
                    if (jSONObjectM36740a != null) {
                        Iterator<String> itKeys = jSONObjectM36740a.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject.put(next, jSONObjectM36740a.opt(next));
                        }
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private Map<Integer, String> generateAdImpression(String str) {
        HashMap map = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            int iOptInt = jSONObjectOptJSONObject.optInt(JSON_AD_IMP_KEY);
                            map2.put(Integer.valueOf(iOptInt), jSONObjectOptJSONObject.optString("url"));
                        } catch (Exception e) {
                            e = e;
                            map = map2;
                            e.printStackTrace();
                            return map;
                        }
                    }
                    return map2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return map;
    }

    private static boolean isBreakCampainOrSetItByEndCard(CampaignEx campaignEx, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C13008c.m36588n().m36553l() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        campaignEx.setendcard_url(str);
        return false;
    }

    public static String object2TrackingStr(C13076j c13076j) {
        if (c13076j != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (c13076j.m36915p() != null) {
                    jSONObject.put("impression", processNativeVideoTrackingArray2Json(c13076j.m36915p()));
                }
                if (c13076j.m36927v() != null) {
                    jSONObject.put("start", processNativeVideoTrackingArray2Json(c13076j.m36927v()));
                }
                if (c13076j.m36913o() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_FIRST_QUARTILE, processNativeVideoTrackingArray2Json(c13076j.m36913o()));
                }
                if (c13076j.m36917q() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_MIDPOINT, processNativeVideoTrackingArray2Json(c13076j.m36917q()));
                }
                if (c13076j.m36928w() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_THIRD_QUARTILE, processNativeVideoTrackingArray2Json(c13076j.m36928w()));
                }
                if (c13076j.m36905k() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_COMPLETE, processNativeVideoTrackingArray2Json(c13076j.m36905k()));
                }
                if (c13076j.m36922t() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_PLAY_PERCENTAGE, reparsePlayCentage(c13076j.m36922t()));
                }
                if (c13076j.m36919r() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_MUTE, processNativeVideoTrackingArray2Json(c13076j.m36919r()));
                }
                if (c13076j.m36929x() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_UNMUTE, processNativeVideoTrackingArray2Json(c13076j.m36929x()));
                }
                if (c13076j.m36901i() != null) {
                    jSONObject.put("click", processNativeVideoTrackingArray2Json(c13076j.m36901i()));
                }
                if (c13076j.m36921s() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_PAUSE, processNativeVideoTrackingArray2Json(c13076j.m36921s()));
                }
                if (c13076j.m36925u() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_RESUME, processNativeVideoTrackingArray2Json(c13076j.m36925u()));
                }
                if (c13076j.m36911n() != null) {
                    jSONObject.put("error", processNativeVideoTrackingArray2Json(c13076j.m36911n()));
                }
                if (c13076j.m36907l() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_ENDCARD, processNativeVideoTrackingArray2Json(c13076j.m36907l()));
                }
                if (c13076j.m36903j() != null) {
                    jSONObject.put("close", processNativeVideoTrackingArray2Json(c13076j.m36903j()));
                }
                if (c13076j.m36909m() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_ENDCARD_SHOW, processNativeVideoTrackingArray2Json(c13076j.m36909m()));
                }
                if (c13076j.m36930y() != null) {
                    jSONObject.put(JSON_NATIVE_VIDEO_VIDEO_CLICK, processNativeVideoTrackingArray2Json(c13076j.m36907l()));
                }
                if (c13076j.m36899h() != null) {
                    jSONObject.put(JSON_KEY_AD_TRACKING_IMPRESSION_T2, processNativeVideoTrackingArray2Json(c13076j.m36899h()));
                }
                if (c13076j.m36893d() != null) {
                    jSONObject.put(JSON_KEY_AD_TRACKING_DROPOUT_TRACK, processNativeVideoTrackingArray2Json(c13076j.m36893d()));
                }
                if (c13076j.m36897g() != null) {
                    jSONObject.put(JSON_KEY_AD_TRACKING_PLYCMPT_TRACK, processNativeVideoTrackingArray2Json(c13076j.m36897g()));
                }
                JSONObject jSONObjectObject2TrackingStr = DomainCampaignEx.object2TrackingStr(jSONObject, c13076j);
                return jSONObjectObject2TrackingStr == null ? "" : jSONObjectObject2TrackingStr.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static CampaignEx parseCampaign(JSONObject jSONObject, String str, String str2, String str3, boolean z, CampaignUnit campaignUnit) {
        return parseCampaign(jSONObject, str, str2, str3, z, campaignUnit, "", "");
    }

    public static CampaignEx parseCampaignWithBackData(JSONObject jSONObject) {
        CampaignEx campaignEx;
        ArrayList arrayList;
        if (jSONObject == null) {
            return null;
        }
        try {
            CampaignEx campaignEx2 = new CampaignEx();
            try {
                campaignEx2.setId(jSONObject.optString("id"));
                campaignEx2.setAppName(jSONObject.optString("title"));
                campaignEx2.setAppDesc(jSONObject.optString(JSON_KEY_DESC));
                campaignEx2.setPackageName(jSONObject.optString("package_name"));
                campaignEx2.setRtinsType(jSONObject.optInt(JSON_KEY_RETARGET_TYPE));
                campaignEx2.setIconUrl(jSONObject.optString(JSON_KEY_ICON_URL));
                campaignEx2.setImageUrl(jSONObject.optString("image_url"));
                campaignEx2.setSize(jSONObject.optString(JSON_KEY_APP_SIZE));
                campaignEx2.setImageSize(jSONObject.optString(JSON_KEY_IMAGE_SIZE));
                campaignEx2.setImpressionURL(jSONObject.optString(JSON_KEY_IMPRESSION_URL));
                campaignEx2.setClickURL(jSONObject.optString(JSON_KEY_CLICK_URL));
                campaignEx2.setRewardPlus(RewardPlus.parseByString(jSONObject.optString(JSON_KEY_REWARD_PLUS)));
                campaignEx2.setWtick(jSONObject.optInt(JSON_KEY_WITHOUT_INSTALL_CHECK));
                campaignEx2.setDeepLinkUrl(jSONObject.optString(JSON_KEY_DEEP_LINK_URL));
                campaignEx2.setUserActivation(jSONObject.optBoolean(JSON_KEY_USER_ACTIVATION, false));
                campaignEx2.setNoticeUrl(jSONObject.optString(JSON_KEY_NOTICE_URL));
                campaignEx2.setTemplate(jSONObject.optInt("template"));
                campaignEx2.setType(jSONObject.optInt(JSON_KEY_AD_SOURCE_ID, 1));
                campaignEx2.setFca(jSONObject.optInt(JSON_KEY_FCA));
                campaignEx2.setFcb(jSONObject.optInt(JSON_KEY_FCB));
                campaignEx2.setEndcard_click_result(jSONObject.optInt(JSON_KEY_ENDCARD_CLICK));
                if (!TextUtils.isEmpty(jSONObject.optString(JSON_KEY_STAR))) {
                    campaignEx2.setRating(Double.parseDouble(jSONObject.optString(JSON_KEY_STAR, "0")));
                }
                if (!TextUtils.isEmpty(jSONObject.optString(JSON_KEY_NUMBER_RATING))) {
                    campaignEx2.setNumberRating(jSONObject.optInt(JSON_KEY_NUMBER_RATING, 333333));
                }
                campaignEx2.setClick_mode(jSONObject.optString(JSON_KEY_CLICK_MODE));
                campaignEx2.setLandingType(jSONObject.optString(JSON_KEY_LANDING_TYPE));
                campaignEx2.setLinkType(jSONObject.optInt(JSON_KEY_LINK_TYPE, 4));
                campaignEx2.setClickInterval(jSONObject.optInt(JSON_KEY_CLICK_INTERVAL));
                campaignEx2.setAdCall(jSONObject.optString(JSON_KEY_CTA_TEXT));
                campaignEx2.setAd_url_list(jSONObject.optString(JSON_KEY_AD_URL_LIST));
                campaignEx2.setRetarget_offer(jSONObject.optInt(JSON_KEY_RETARGET_OFFER, 2));
                campaignEx2.setVideoUrlEncode(jSONObject.optString("video_url"));
                campaignEx2.setVideoLength(jSONObject.optInt(JSON_KEY_VIDEO_LENGTHL));
                campaignEx2.setVideoSize(jSONObject.optInt(JSON_KEY_VIDEO_SIZE));
                campaignEx2.setVideoResolution(jSONObject.optString(JSON_KEY_VIDEO_RESOLUTION));
                campaignEx2.setWatchMile(jSONObject.optInt(JSON_KEY_WATCH_MILE));
                campaignEx2.setTimestamp(System.currentTimeMillis());
                campaignEx2.setBty(jSONObject.optInt(JSON_KEY_BTY));
                campaignEx2.setAdvImp(jSONObject.optString(JSON_KEY_ADVIMP));
                campaignEx2.setTImp(jSONObject.optInt(JSON_KEY_T_IMP));
                campaignEx2.setHtmlUrl(jSONObject.optString(AbstractC13068b.JSON_KEY_HTML_URL));
                campaignEx2.setEndScreenUrl(jSONObject.optString(AbstractC13068b.JSON_KEY_END_SCREEN_URL));
                campaignEx2.setGuidelines(jSONObject.optString(JSON_KEY_GUIDELINES));
                campaignEx2.setOfferType(jSONObject.optInt(JSON_KEY_OFFER_TYPE));
                campaignEx2.setRewardName(jSONObject.optString(JSON_KEY_REWARD_NAME));
                campaignEx2.setRewardAmount(jSONObject.optInt(JSON_KEY_REWARD_AMOUNT));
                try {
                    if (jSONObject.has(JSON_NATIVE_VIDEO_AD_TRACKING)) {
                        String strOptString = jSONObject.optString(JSON_NATIVE_VIDEO_AD_TRACKING);
                        if (!TextUtils.isEmpty(strOptString)) {
                            campaignEx2.setNativeVideoTrackingString(strOptString);
                            campaignEx2.setNativeVideoTracking(TrackingStr2Object(strOptString));
                        }
                    }
                } catch (Exception unused) {
                }
                try {
                    campaignEx2.setReady_rate(jSONObject.optInt(JSON_KEY_READY_RATE, -1));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JSON_KEY_EXT_DATA);
                    if (jSONObjectOptJSONObject != null) {
                        campaignEx2.setExt_data(jSONObjectOptJSONObject.toString());
                    } else {
                        String strOptString2 = jSONObject.optString(JSON_KEY_EXT_DATA);
                        if (!TextUtils.isEmpty(strOptString2)) {
                            campaignEx2.setExt_data(strOptString2);
                        }
                    }
                    campaignEx2.setMof_tplid(jSONObject.optInt(AbstractC13068b.JSON_KEY_MOF_TPLID));
                    campaignEx2.setMof_template_url(jSONObject.optString(AbstractC13068b.JSON_KEY_MOF_TEMPLATE_URL));
                    campaignEx2.setNscpt(jSONObject.optInt(AbstractC13068b.JSON_KEY_NSCPT));
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            arrayList.add(jSONArrayOptJSONArray.optString(i));
                        }
                    }
                    campaignEx2.setPv_urls(arrayList);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(AbstractC13068b.JSON_KEY_REQ_EXT_DATA);
                    if (jSONObjectOptJSONObject2 != null) {
                        campaignEx2.setReq_ext_data(jSONObjectOptJSONObject2.toString());
                    }
                } catch (Exception unused2) {
                }
                campaignEx2.setVideo_end_type(jSONObject.optInt(VIDEO_END_TYPE, 2));
                if (isBreakCampainOrSetItByEndCard(campaignEx2, jSONObject.optString(ENDCARD_URL))) {
                    return null;
                }
                campaignEx2.setPlayable_ads_without_video(jSONObject.optInt(PLAYABLE_ADS_WITHOUT_VIDEO, 1));
                campaignEx2.setVideoMD5Value("");
                if (jSONObject.has(JSON_KEY_NV_T2)) {
                    campaignEx2.setNvT2(jSONObject.optInt(JSON_KEY_NV_T2));
                }
                if (jSONObject.has(JSON_KEY_GIF_URL)) {
                    campaignEx2.setGifUrl(jSONObject.optString(JSON_KEY_GIF_URL));
                }
                try {
                    JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rv");
                    if (jSONObjectOptJSONObject3 != null) {
                        campaignEx2.setRewardTemplateMode(C13066c.m36770a(jSONObjectOptJSONObject3));
                    } else {
                        String strOptString3 = jSONObject.optString("rv");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            campaignEx2.setRewardTemplateMode(C13066c.m36770a(new JSONObject(strOptString3)));
                        }
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
                campaignEx2.setClickTimeOutInterval(jSONObject.optInt(JSON_KEY_CLICK_TIMEOUT_INTERVAL, 2));
                campaignEx2.setImpUA(jSONObject.optInt(JSON_KEY_IMP_UA, 1));
                campaignEx2.setcUA(jSONObject.optInt(JSON_KEY_C_UA, 1));
                campaignEx2.setJmPd(jSONObject.optInt(JSON_KEY_JM_PD));
                campaignEx2.setKeyIaIcon(jSONObject.optString("ia_icon"));
                campaignEx2.setKeyIaRst(jSONObject.optInt("ia_rst"));
                campaignEx2.setKeyIaUrl(jSONObject.optString("ia_url"));
                campaignEx2.setKeyIaOri(jSONObject.optInt("ia_ori"));
                campaignEx2.setAdType(jSONObject.optInt("ad_type"));
                campaignEx2.setTpOffer(jSONObject.optInt(JSON_KEY_TP_OFFER));
                campaignEx2.setFac(jSONObject.optInt(JSON_KEY_FAC));
                campaignEx2.setIa_ext1(jSONObject.optString(KEY_IA_EXT1));
                campaignEx2.setIa_ext2(jSONObject.optString(KEY_IA_EXT2));
                campaignEx2.setIsDownLoadZip(jSONObject.optInt(KEY_IS_DOWNLOAD));
                campaignEx2.setInteractiveCache(jSONObject.optString(KEY_IA_CACHE));
                campaignEx2.setOc_time(jSONObject.optInt(KEY_OC_TIME));
                campaignEx2.setOc_type(jSONObject.optInt(KEY_OC_TYPE));
                campaignEx2.setT_list(jSONObject.optString(KEY_T_LIST));
                campaignEx2.setAdchoice(C13064a.m36751c(jSONObject.optString(KEY_ADCHOICE, "")));
                campaignEx2.setPlct(jSONObject.optLong(JSON_KEY_PLCT));
                campaignEx2.setPlctb(jSONObject.optLong(JSON_KEY_PLCTB));
                campaignEx2.setCandidateCacheTime(jSONObject.optLong(JSON_KEY_C_C_TIME));
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(KEY_OMID);
                if (jSONArrayOptJSONArray2 != null) {
                    campaignEx2.setOmid(jSONArrayOptJSONArray2.toString());
                } else if (TextUtils.isEmpty(jSONObject.optString(KEY_OMID))) {
                    campaignEx2.setOmid(null);
                } else {
                    campaignEx2.setOmid(jSONObject.optString(KEY_OMID));
                }
                campaignEx2.setCreativeId(jSONObject.optLong(JSON_KEY_CREATIVE_ID));
                campaignEx2.setVidCrtvId(jSONObject.optLong(JSON_KEY_VIDEO_CREATIVE_ID));
                campaignEx2.setEcCrtvId(jSONObject.optLong(JSON_KEY_EC_CREATIVE_ID));
                campaignEx2.setEcTemplateId(jSONObject.optLong(JSON_KEY_EC_TEMP_ID));
                campaignEx2.setLocalRequestId(jSONObject.optString(JSON_KEY_LOCAL_REQUEST_ID, ""));
                String strOptString4 = jSONObject.optString("cam_tpl_url");
                Uri uri = Uri.parse(strOptString4);
                if (TextUtils.isEmpty(uri.getPath()) || !(uri.getPath().endsWith(".zip") || uri.getPath().endsWith(".ZIP"))) {
                    campaignEx2.setBannerUrl(strOptString4);
                } else {
                    campaignEx2.setAdZip(strOptString4);
                }
                campaignEx2.setBannerHtml(jSONObject.optString("cam_html"));
                campaignEx2.setAdHtml(jSONObject.optString("cam_html"));
                campaignEx2.setCampaignUnitId(jSONObject.optString("unitId"));
                String strOptString5 = jSONObject.optString(JSON_KEY_MRAID);
                if (TextUtils.isEmpty(strOptString5)) {
                    strOptString5 = jSONObject.optString(JSON_KEY_MRAIDFORH5);
                }
                if (!TextUtils.isEmpty(strOptString5)) {
                    campaignEx2.setIsMraid(true);
                    campaignEx2.setMraid(strOptString5);
                } else if (TextUtils.isEmpty(campaignEx2.getAdHtml()) || campaignEx2.getAdHtml().contains("<MBTPLMARK>")) {
                    campaignEx2.setIsMraid(false);
                } else {
                    campaignEx2.setIsMraid(true);
                }
                campaignEx2.setNetAddress(jSONObject.optString(AbstractC13068b.JSON_KEY_C_I));
                try {
                    String strOptString6 = jSONObject.optString(AbstractC13068b.JSON_KEY_ONLY_IMPRESSION_URL);
                    if (!TextUtils.isEmpty(strOptString6)) {
                        campaignEx2.setOnlyImpressionURL(strOptString6);
                        Uri uri2 = Uri.parse(strOptString6);
                        if (uri2 != null) {
                            campaignEx2.setRequestId(uri2.getQueryParameter(JSON_KEY_AD_K));
                        }
                    }
                    String strOptString7 = jSONObject.optString(JSON_KEY_NOTICE_URL);
                    if (!TextUtils.isEmpty(strOptString7)) {
                        campaignEx2.setNoticeUrl(strOptString7);
                        Uri uri3 = Uri.parse(strOptString7);
                        if (uri3 != null) {
                            campaignEx2.setRequestIdNotice(uri3.getQueryParameter(JSON_KEY_AD_K));
                        }
                    }
                    try {
                        String strOptString8 = jSONObject.optString(JSON_KEY_ECPPV);
                        if (!TextUtils.isEmpty(strOptString8)) {
                            campaignEx2.setEcppv(strOptString8);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    campaignEx2.setAc_s(jSONObject.optInt(KEY_ACTIVITY_CHECK_SWITCH, 1));
                } catch (Exception unused3) {
                }
                campaignEx2.setIsBidCampaign(jSONObject.optBoolean(JSON_KEY_HB, false));
                campaignEx2.setPlacementId(jSONObject.optString(MBridgeConstans.PLACEMENT_ID));
                campaignEx2.setMaitve(jSONObject.optInt(JSON_KEY_MAITVE));
                campaignEx2.setMaitve_src(jSONObject.optString(JSON_KEY_MAITVESRC));
                campaignEx2.setFlb(jSONObject.optInt(JSON_KEY_FLB));
                campaignEx2.setFlbSkipTime(jSONObject.optInt(JSON_KEY_FLB_SKIP_TIME));
                campaignEx2.setCbd(jSONObject.optInt(JSON_KEY_NEW_INTERSTITIAL_CBD, -2));
                campaignEx2.setVst(jSONObject.optInt(JSON_KEY_NEW_INTERSTITIAL_VST, -2));
                campaignEx2.setUseSkipTime(jSONObject.optInt(JSON_KEY_USE_SKIP_TIME, 0));
                campaignEx2.setProgressBarShow(jSONObject.optInt(JSON_KEY_PROG_BAR, 0));
                campaignEx2.setAdSpaceT(jSONObject.optInt(JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, 1));
                CampaignEx campaignWithBackData = DomainCampaignEx.parseCampaignWithBackData(jSONObject, campaignEx2);
                try {
                    campaignWithBackData.setVcn(jSONObject.optInt("vcn"));
                    campaignWithBackData.setTokenRule(jSONObject.optInt("token_r"));
                    campaignWithBackData.setEncryptPrice(jSONObject.optString("encrypt_p"));
                    campaignWithBackData.setVideoCompleteTime(jSONObject.optInt(JSON_KEY_VIDEO_COMPLETE_TIME));
                    campaignWithBackData.setVideoCheckType(jSONObject.optInt(JSON_KEY_VIDEO_CHECK_TYPE, 2));
                    campaignWithBackData.setVideoCtnType(jSONObject.optInt(JSON_KEY_VIDEO_CTN_TYPE, 1));
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(r3);
                    if (jSONArrayOptJSONArray3 == null) {
                        String strOptString9 = jSONObject.optString(JSON_KEY_RS_IGNORE_CHECK_RULE);
                        if (!TextUtils.isEmpty(strOptString9)) {
                            try {
                                jSONArrayOptJSONArray3 = new JSONArray(strOptString9);
                            } catch (JSONException unused4) {
                            }
                        }
                    }
                    if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray3.optInt(i2)));
                        }
                        if (arrayList2.size() > 0) {
                            campaignWithBackData.setRsIgnoreCheckRule(arrayList2);
                        }
                    }
                    if (jSONObject.has(JSON_KEY_AAB)) {
                        campaignWithBackData.setAabEntity(AabEntity.parser(jSONObject.getString(JSON_KEY_AAB)));
                    }
                    try {
                        campaignWithBackData.setPrivacyUrl(jSONObject.optString(JSON_KEY_PRIVACY_URL, ""));
                        campaignWithBackData.setPrivacyButtonTemplateVisibility(jSONObject.optInt(PRIVACY_BUTTON_VIDEO_TEMPLATE_SWITCH, 0));
                    } catch (Exception e3) {
                        C13219q0.m37816b("campaign", e3.getMessage());
                    }
                    campaignWithBackData.setImpReportType(jSONObject.optInt(JSON_KEY_IMP_REPORT_TYPE, 0));
                    campaignWithBackData.setTrackingTcpPort(jSONObject.optInt(AbstractC13068b.JSON_KEY_TK_TCP_PORT, 9377));
                    campaignWithBackData.setAutoShowStoreMiniCard(jSONObject.optInt(JSON_KEY_AUTO_SHOW_MINI_CARD, 0));
                    campaignWithBackData.setShowStoreMiniCardDelayTime(jSONObject.optInt(JSON_KEY_SHOW_MINI_CARD_DELAY_TIME, 0));
                    campaignWithBackData.setShowIndex(jSONObject.optInt(KEY_SHOW_INDEX, 1));
                    campaignWithBackData.setShowType(jSONObject.optInt(KEY_SHOW_TYPE, 1));
                    campaignWithBackData.setClickTempSource(jSONObject.optInt(KEY_CLICK_TEMP_SOURCE));
                    campaignWithBackData.setTemplateRenderSucc(jSONObject.optBoolean(KEY_PLAY_TEMP_DISPLAY_TYPE));
                    campaignWithBackData.setECTemplateRenderSucc(jSONObject.optBoolean(KEY_EC_TEMP_DISPLAY_TYPE));
                    campaignWithBackData.setTriggerClickSource(jSONObject.optInt(KEY_TRIGGER_CLICK_SOURCE));
                    String strOptString10 = jSONObject.optString(KEY_ACTIVITY_PATH_AND_NAME);
                    if (!TextUtils.isEmpty(strOptString10)) {
                        try {
                            campaignWithBackData.setAc(strOptString10);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    campaignWithBackData.setSecondRequestIndex(jSONObject.optInt("r_index", 0));
                    campaignWithBackData.setSecondShowIndex(jSONObject.optInt("s_show_index", 0));
                    campaignWithBackData.setFilterCallBackState(jSONObject.optInt(KEY_SECOND_REQUEST_CALLBACK_STATE, 2));
                    campaignWithBackData.setFilterAdsShowCallState(jSONObject.optInt(KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, 0));
                    campaignWithBackData.setFilterAdsVideoCallState(jSONObject.optInt(KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, 2));
                    campaignWithBackData.setLocalCheckShow(jSONObject.optInt(KEY_LOCAL_CHECK_STATE));
                    campaignWithBackData.setLocalAllowTrackClick(jSONObject.optInt(KEY_LOCAL_ALLOW_TRACK_CLICK));
                    return campaignWithBackData;
                } catch (Exception e5) {
                    e = e5;
                    campaignEx = campaignWithBackData;
                }
            } catch (Exception e6) {
                e = e6;
                campaignEx = campaignEx2;
            }
        } catch (Exception e7) {
            e = e7;
            campaignEx = null;
        }
        e.printStackTrace();
        return campaignEx;
    }

    public static JSONArray parseCamplistToJson(List<CampaignEx> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                jSONArray2.put(campaignToJsonObject(it.next()));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return jSONArray2;
                    } catch (Exception e) {
                        e = e;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        return jSONArray;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONArray;
    }

    private static List<Map<Integer, String>> parsePlayCentage(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap map = new HashMap();
                        int i2 = jSONObject.getInt("rate");
                        map.put(Integer.valueOf(i2), jSONObject.getString("url"));
                        arrayList.add(map);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public static CampaignEx parseSettingCampaign(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        campaignEx.setId(jSONObject.optString("campaignid"));
        campaignEx.setPackageName(jSONObject.optString("packageName"));
        campaignEx.setAppName(jSONObject.optString("title"));
        campaignEx.setAdCall(jSONObject.optString("cta"));
        campaignEx.setAppDesc(jSONObject.optString(JSON_KEY_DESC));
        campaignEx.setImpressionURL(jSONObject.optString(JSON_KEY_IMPRESSION_URL));
        campaignEx.setImageUrl(jSONObject.optString("image_url"));
        campaignEx.setPlct(jSONObject.optLong(JSON_KEY_PLCT));
        campaignEx.setPlctb(jSONObject.optLong(JSON_KEY_PLCTB));
        campaignEx.setCandidateCacheTime(jSONObject.optLong(JSON_KEY_C_C_TIME));
        campaignEx.setAdHtml(jSONObject.optString(JSON_KEY_AD_HTML));
        campaignEx.setAdZip(jSONObject.optString(JSON_KEY_AD_ZIP));
        campaignEx.setBannerUrl(jSONObject.optString(JSON_KEY_BANNER_URL));
        campaignEx.setBannerHtml(jSONObject.optString(JSON_KEY_BANNER_HTML));
        campaignEx.setCreativeId(jSONObject.optLong(JSON_KEY_CREATIVE_ID));
        campaignEx.setVidCrtvId(jSONObject.optLong(JSON_KEY_VIDEO_CREATIVE_ID));
        campaignEx.setEcCrtvId(jSONObject.optLong(JSON_KEY_EC_CREATIVE_ID));
        campaignEx.setEcTemplateId(jSONObject.optLong(JSON_KEY_EC_TEMP_ID));
        campaignEx.setPlacementId(jSONObject.optString(MBridgeConstans.PLACEMENT_ID));
        return campaignEx;
    }

    protected static String[] processNativeVideoTrackingArray(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    protected static JSONArray processNativeVideoTrackingArray2Json(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    private static JSONArray reparsePlayCentage(List<Map<Integer, String>> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                try {
                    Map<Integer, String> map = list.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("rate", map.keySet().iterator().next());
                    jSONObject.put("url", map.values().iterator().next());
                    jSONArray.put(jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONArray;
    }

    private void setMoreOfferAdControl(String str, String str2) {
        try {
            int iM37924e = C13229v0.m37924e(str, MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF);
            if (iM37924e == 0) {
                return;
            }
            JSONObject jSONObject = TextUtils.isEmpty(this.moreOfferJsonData) ? new JSONObject() : new JSONObject(this.moreOfferJsonData);
            int iM37924e2 = C13229v0.m37924e(str, MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF, iM37924e);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM, iM37924e2);
            jSONObject.put(str2, jSONObject2);
            this.moreOfferJsonData = jSONObject.toString();
        } catch (Exception e) {
            C13219q0.m37813a(TAG, e.getMessage());
        }
    }

    public AabEntity getAabEntity() {
        return this.aabEntity;
    }

    public String getAc() {
        return this.f35604ac;
    }

    public int getAc_s() {
        return this.ac_s;
    }

    public String getAdHtml() {
        return this.adHtml;
    }

    public int getAdSpaceT() {
        return this.adSpaceT;
    }

    public int getAdType() {
        return this.adType;
    }

    public List<String> getAdUrlList() {
        Exception e;
        ArrayList arrayList;
        String ad_url_list = getAd_url_list();
        try {
            if (TextUtils.isEmpty(ad_url_list)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(ad_url_list);
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(jSONArray.optString(i));
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
        }
        e.printStackTrace();
        return arrayList;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public String getAd_url_list() {
        return this.ad_url_list;
    }

    public C13064a getAdchoice() {
        return this.adchoice;
    }

    public String getAdvImp() {
        return this.advImp;
    }

    public Map<Integer, String> getAdvImpList() {
        return generateAdImpression(this.advImp);
    }

    public HashMap<String, String> getAks() {
        return this.aks;
    }

    public String getAl() {
        return this.f35605al;
    }

    public int getAutoShowStoreMiniCard() {
        return this.autoShowStoreMiniCard;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public int getBty() {
        return this.bty;
    }

    public String getCMPTEntryUrl() {
        return this.CMPTEntryUrl;
    }

    public int getCacheLevel() {
        return this.cacheLevel;
    }

    public String getCampaignUnitId() {
        return this.campaignUnitId;
    }

    public boolean getCanStart2C1Anim() {
        return this.canStart2C1Anim;
    }

    public boolean getCanStartMoreOfferAnim() {
        return this.canStartMoreOfferAnim;
    }

    public long getCandidateCacheTime() {
        return this.candidateCacheTime;
    }

    public int getCbd() {
        return this.cbd;
    }

    public int getCbt() {
        return this.cbt;
    }

    public int getClickInterval() {
        return this.clickInterval;
    }

    public int getClickTempSource() {
        return this.clickTempSource;
    }

    public int getClickTimeOutInterval() {
        return this.clickTimeOutInterval;
    }

    public int getClickType() {
        return this.clickType;
    }

    public String getClickURL() {
        return this.clickURL;
    }

    public String getClick_mode() {
        return this.click_mode;
    }

    @Override // com.mbridge.msdk.out.Campaign, com.mbridge.msdk.out.BaseCampaign
    public long getCreativeId() {
        return this.creativeId;
    }

    public String getCurrentLocalRid() {
        return TextUtils.isEmpty(this.n_lrid) ? this.localRequestId : this.n_lrid;
    }

    public String getDeepLinkURL() {
        return this.deepLinkUrl;
    }

    public int getDynamicTempCode() {
        return this.dynamicTempCode;
    }

    public long getEcCrtvId() {
        return this.ecCrtvId;
    }

    public long getEcTemplateId() {
        return this.ecTemplateId;
    }

    public String getEcppv() {
        return this.ecppv;
    }

    public String getEncryptPrice() {
        return this.encryptPrice;
    }

    public String getEndScreenUrl() {
        return this.endScreenUrl;
    }

    public int getEndcard_click_result() {
        return this.endcard_click_result;
    }

    public String getExpIds() {
        return this.expIds;
    }

    public String getExt_data() {
        return this.ext_data;
    }

    public int getFac() {
        return this.fac;
    }

    public int getFca() {
        return this.fca;
    }

    public int getFcb() {
        return this.fcb;
    }

    public int getFilterAdsShowCallState() {
        return this.filterAdsShowCallState;
    }

    public int getFilterAdsVideoCallState() {
        return this.filterAdsVideoCallState;
    }

    public int getFilterCallBackState() {
        return this.filterCallBackState;
    }

    public int getFlb() {
        return this.flb;
    }

    public int getFlbSkipTime() {
        return this.flbSkipTime;
    }

    public String getGifUrl() {
        return this.gifUrl;
    }

    public String getGuidelines() {
        return this.guidelines;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public String getIa_ext1() {
        return this.ia_ext1;
    }

    public String getIa_ext2() {
        return this.ia_ext2;
    }

    public int getIex() {
        return this.iex;
    }

    public String getImageSize() {
        return this.imageSize;
    }

    public int getImpReportType() {
        return this.impReportType;
    }

    public int getImpUA() {
        return this.impUA;
    }

    public String getImpressionURL() {
        try {
            if (C13223s0.m37831a().m37842a("v_a_d_p", false)) {
                String strM37887a = C13229v0.m37887a(this.impressionURL, "&tun=", C13211m0.m37715A() + "");
                this.impressionURL = strM37887a;
                return strM37887a;
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
        return this.impressionURL;
    }

    public String getInteractiveCache() {
        return this.interactiveCache;
    }

    public int getIsAddSuccesful() {
        return this.isAddSuccesful;
    }

    public int getIsClick() {
        return this.isClick;
    }

    public int getIsDeleted() {
        return this.isDeleted;
    }

    public int getIsDownLoadZip() {
        return this.isDownLoadZip;
    }

    public int getIsTimeoutCheckVideoStatus() {
        return this.isTimeoutCheckVideoStatus;
    }

    public int getJmPd() {
        return this.jmPd;
    }

    public JumpLoaderResult getJumpResult() {
        return this.jumpResult;
    }

    public String getK() {
        return this.f35606k;
    }

    public String getKeyIaIcon() {
        return this.keyIaIcon;
    }

    public int getKeyIaOri() {
        return this.keyIaOri;
    }

    public int getKeyIaRst() {
        return this.keyIaRst;
    }

    public String getKeyIaUrl() {
        return this.keyIaUrl;
    }

    public String getLabel() {
        return this.label;
    }

    public String getLandingType() {
        return this.landingType;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public int getLoadTimeoutState() {
        return this.loadTimeoutState;
    }

    public int getLocalAllowTrackClick() {
        return this.localAllowTrackClick;
    }

    public int getLocalCheckShow() {
        return this.localCheckShow;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public int getMaitve() {
        return this.maitve;
    }

    public String getMaitve_src() {
        return this.maitve_src;
    }

    public C13065b getMediaViewHolder() {
        return this.mediaViewHolder;
    }

    public String getMof_template_url() {
        return this.mof_template_url;
    }

    public int getMof_tplid() {
        return this.mof_tplid;
    }

    public String getMoreOfferJsonData() {
        return this.moreOfferJsonData;
    }

    public String getMp() {
        return this.f35607mp;
    }

    public String getMraid() {
        return this.mraid;
    }

    public String getNLRid() {
        return this.n_lrid;
    }

    public String getNRid() {
        return this.n_rid;
    }

    public C13076j getNativeVideoTracking() {
        return this.nativeVideoTracking;
    }

    public String getNativeVideoTrackingString() {
        return this.nativeVideoTrackingString;
    }

    public String getNetAddress() {
        return this.netAddress;
    }

    public String getNoticeUrl() {
        try {
            if (C13223s0.m37831a().m37842a("v_a_d_p", false)) {
                String strM37887a = C13229v0.m37887a(this.noticeUrl, "&tun=", C13211m0.m37715A() + "");
                this.noticeUrl = strM37887a;
                return strM37887a;
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
        return this.noticeUrl;
    }

    public int getNscpt() {
        return this.nscpt;
    }

    public int getNvT2() {
        return this.nvT2;
    }

    public int getOc_time() {
        return this.oc_time;
    }

    public int getOc_type() {
        return this.oc_type;
    }

    public int getOfferType() {
        return this.offerType;
    }

    public String getOmid() {
        return this.omid;
    }

    public String getOnlyImpressionURL() {
        try {
            if (C13223s0.m37831a().m37842a("v_a_d_p", false)) {
                String strM37887a = C13229v0.m37887a(this.onlyImpressionURL, "&tun=", C13211m0.m37715A() + "");
                this.onlyImpressionURL = strM37887a;
                return strM37887a;
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
        return this.onlyImpressionURL;
    }

    public String getPkgSource() {
        return this.pkgSource;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public int getPlayable_ads_without_video() {
        return this.playable_ads_without_video;
    }

    public long getPlct() {
        return this.plct;
    }

    public long getPlctb() {
        return this.plctb;
    }

    public int getPrivacyButtonTemplateVisibility() {
        return this.privacyButtonTemplateVisibility;
    }

    public String getPrivacyUrl() {
        return this.privacyUrl;
    }

    public int getProgressBarShow() {
        return this.progressBarShow;
    }

    public List<String> getPv_urls() {
        return this.pv_urls;
    }

    public String getQ() {
        return this.f35608q;
    }

    public String getR() {
        return this.f35609r;
    }

    public int getReadyState() {
        return this.readyState;
    }

    public int getReady_rate() {
        return this.ready_rate;
    }

    public String getReasond() {
        return this.reasond;
    }

    public String getReq_ext_data() {
        return this.req_ext_data;
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (TextUtils.isEmpty(this.onlyImpressionURL)) {
                return null;
            }
            Uri uri = Uri.parse(this.onlyImpressionURL);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(JSON_KEY_AD_K);
                this.requestId = queryParameter;
                setRequestId(queryParameter);
            }
            return this.requestId;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getRequestIdNotice() {
        try {
            if (!TextUtils.isEmpty(this.requestIdNotice)) {
                return this.requestIdNotice;
            }
            if (TextUtils.isEmpty(this.noticeUrl)) {
                return "";
            }
            Uri uri = Uri.parse(this.noticeUrl);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(JSON_KEY_AD_K);
                this.requestIdNotice = queryParameter;
                setRequestIdNotice(queryParameter);
            }
            return this.requestIdNotice;
        } catch (Exception unused) {
            return "";
        }
    }

    public int getRetarget_offer() {
        return this.retarget_offer;
    }

    public int getRewardAmount() {
        return this.rewardAmount;
    }

    public String getRewardName() {
        return this.reward_name;
    }

    public int getRewardPlayStatus() {
        return this.rewardPlayStatus;
    }

    public RewardPlus getRewardPlus() {
        return this.rewardPlus;
    }

    public C13066c getRewardTemplateMode() {
        return this.rewardTemplateMode;
    }

    public ArrayList<Integer> getRsIgnoreCheckRule() {
        return this.rsIgnoreCheckRule;
    }

    public String getRsIgnoreCheckRuleString() {
        if (getRsIgnoreCheckRule() == null || getRsIgnoreCheckRule().size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Integer> it = getRsIgnoreCheckRule().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            return !TextUtils.isEmpty(sb) ? sb.toString() : "";
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
            return "";
        }
    }

    public int getRtinsType() {
        return this.rtinsType;
    }

    public int getSecondRequestIndex() {
        return this.secondRequestIndex;
    }

    public int getSecondShowIndex() {
        return this.secondShowIndex;
    }

    public int getShowCount() {
        return this.showCount;
    }

    public int getShowIndex() {
        return this.showIndex;
    }

    public int getShowStoreMiniCardDelayTime() {
        return this.showStoreMiniCardDelayTime;
    }

    public int getShowType() {
        return this.showType;
    }

    public int getSpareOfferFlag() {
        return this.spareOfferFlag;
    }

    public int getTImp() {
        return this.t_imp;
    }

    public String getT_list() {
        return this.t_list;
    }

    public int getTab() {
        return this.tab;
    }

    public int getTemplate() {
        return this.template;
    }

    public int getTokenRule() {
        int i = this.tokenRule;
        if (i == 1) {
            return i;
        }
        return 0;
    }

    public int getTpOffer() {
        return this.tpOffer;
    }

    public int getTrackingTcpPort() {
        return this.trackingTcpPort;
    }

    public int getTriggerClickSource() {
        return this.triggerClickSource;
    }

    public long getTs() {
        return this.f35610ts;
    }

    public int getTyped() {
        return this.typed;
    }

    public int getUseSkipTime() {
        return this.useSkipTime;
    }

    public boolean getUserActivation() {
        return this.userActivation;
    }

    public int getVcn() {
        int i = this.vcn;
        if (i > 0) {
            return i;
        }
        return 1;
    }

    public long getVidCrtvId() {
        return this.vidCrtvId;
    }

    public int getVideoCheckType() {
        return this.videoCheckType;
    }

    public int getVideoCompleteTime() {
        return this.videoCompleteTime;
    }

    public int getVideoCtnType() {
        return this.videoCtnType;
    }

    public String getVideoMD5Value() {
        return this.videoMD5Value;
    }

    public int getVideoPlayProgress() {
        return this.videoPlayProgress;
    }

    public String getVideoResolution() {
        return this.videoResolution;
    }

    public int getVideoSize() {
        return this.videoSize;
    }

    public String getVideoUrlEncode() {
        return this.videoUrlEncode;
    }

    public int getVideo_end_type() {
        return this.video_end_type;
    }

    public int getVst() {
        return this.vst;
    }

    public int getWatchMile() {
        return this.watchMile;
    }

    public int getWtick() {
        return this.wtick;
    }

    public int getcUA() {
        return this.cUA;
    }

    public long getcVersionCode() {
        return this.cVersionCode;
    }

    public String getendcard_url() {
        return this.endcard_url;
    }

    public boolean isActiveOm() {
        return (TextUtils.isEmpty(this.omid) || TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) ? false : true;
    }

    public boolean isBidCampaign() {
        return this.isBidCampaign;
    }

    public boolean isCallBackImpression() {
        return this.isCallBackImpression;
    }

    public boolean isCallbacked() {
        return this.isCallbacked;
    }

    public boolean isCampaignIsFiltered() {
        return this.campaignIsFiltered;
    }

    public boolean isDynamicView() {
        return this.isDynamicView;
    }

    public boolean isECTemplateRenderSucc() {
        return this.isECTemplateRenderSucc;
    }

    public boolean isEffectiveOffer(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (getPlct() > 0) {
            return getTimestamp() + (getPlct() * 1000) >= jCurrentTimeMillis;
        }
        return getTimestamp() + j >= jCurrentTimeMillis;
    }

    public boolean isHasMBTplMark() {
        return this.hasMBTplMark;
    }

    public boolean isHasReportAdTrackPause() {
        return this.hasReportAdTrackPause;
    }

    public boolean isMraid() {
        return this.isMraid;
    }

    public boolean isReady() {
        return this.isReady;
    }

    public boolean isReport() {
        return this.isReport;
    }

    public boolean isReportClick() {
        return this.isReportClick;
    }

    public boolean isSpareOffer(long j, long j2) {
        if (isEffectiveOffer(j)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (getPlctb() > 0) {
            return getTimestamp() + (getPlctb() * 1000) >= jCurrentTimeMillis;
        }
        return getTimestamp() + j2 >= jCurrentTimeMillis;
    }

    public boolean isTemplateRenderSucc() {
        return this.isTemplateRenderSucc;
    }

    public boolean needShowIDialog() {
        return super.needShowIDialog(this);
    }

    public void setAabEntity(AabEntity aabEntity) {
        this.aabEntity = aabEntity;
    }

    public void setAc(String str) {
        this.f35604ac = str;
    }

    public void setAc_s(int i) {
        this.ac_s = i;
    }

    @Override // com.mbridge.msdk.out.Campaign, com.mbridge.msdk.out.BaseCampaign
    public void setAdCall(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.linkType != 2 ? "Learn more" : "Install";
        }
        super.setAdCall(str);
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public void setAdSpaceT(int i) {
        this.adSpaceT = i;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setAdZip(String str) {
        this.adZip = str;
        boolean zM37938i = C13229v0.m37938i(str);
        int iM37903b = C13229v0.m37903b(str);
        if (zM37938i) {
            setDynamicView(true);
            setDynamicTempCode(iM37903b);
        }
    }

    public void setAd_url_list(String str) {
        this.ad_url_list = str;
    }

    public void setAdchoice(C13064a c13064a) {
        this.adchoice = c13064a;
    }

    public void setAdvImp(String str) {
        this.advImp = str;
    }

    public void setAks(HashMap<String, String> map) {
        this.aks = map;
    }

    public void setAl(String str) {
        this.f35605al = str;
    }

    public void setAutoShowStoreMiniCard(int i) {
        this.autoShowStoreMiniCard = i;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setBty(int i) {
        this.bty = i;
    }

    public void setCMPTEntryUrl(String str) {
        this.CMPTEntryUrl = str;
    }

    public void setCacheLevel(int i) {
        this.cacheLevel = i;
    }

    public void setCallBackImpression(boolean z) {
        this.isCallBackImpression = z;
    }

    public void setCallbacked(boolean z) {
        this.isCallbacked = z;
    }

    public void setCampaignIsFiltered(boolean z) {
        this.campaignIsFiltered = z;
    }

    public void setCampaignUnitId(String str) {
        this.campaignUnitId = str;
    }

    public void setCanStart2C1Anim(boolean z) {
        this.canStart2C1Anim = z;
    }

    public void setCanStartMoreOfferAnim(boolean z) {
        this.canStartMoreOfferAnim = z;
    }

    public void setCandidateCacheTime(long j) {
        this.candidateCacheTime = j;
    }

    public void setCbd(int i) {
        this.cbd = i;
    }

    public void setCbt(int i) {
        this.cbt = i;
    }

    public void setClickInterval(int i) {
        this.clickInterval = i;
    }

    public void setClickTempSource(int i) {
        this.clickTempSource = i;
    }

    public void setClickTimeOutInterval(int i) {
        this.clickTimeOutInterval = i;
    }

    public void setClickType(int i) {
        this.clickType = i;
    }

    public void setClickURL(String str) {
        this.clickURL = str;
    }

    public void setClick_mode(String str) {
        this.click_mode = str;
    }

    @Override // com.mbridge.msdk.out.Campaign, com.mbridge.msdk.out.BaseCampaign
    public void setCreativeId(long j) {
        this.creativeId = j;
    }

    public void setDeepLinkUrl(String str) {
        this.deepLinkUrl = str;
    }

    public void setDynamicTempCode(int i) {
        this.dynamicTempCode = C13229v0.m37875a(i);
    }

    public void setDynamicView(boolean z) {
        this.isDynamicView = z;
    }

    public void setECTemplateRenderSucc(boolean z) {
        this.isECTemplateRenderSucc = z;
    }

    public void setEcCrtvId(long j) {
        this.ecCrtvId = j;
    }

    public void setEcTemplateId(long j) {
        this.ecTemplateId = j;
    }

    public void setEcppv(String str) {
        this.ecppv = str;
    }

    public void setEncryptPrice(String str) {
        this.encryptPrice = str;
    }

    public void setEndScreenUrl(String str) {
        this.endScreenUrl = str;
    }

    public void setEndcard_click_result(int i) {
        this.endcard_click_result = i;
    }

    public void setExpIds(String str) {
        this.expIds = str;
    }

    public void setExt_data(String str) {
        this.ext_data = str;
    }

    public void setFac(int i) {
        this.fac = i;
    }

    public void setFca(int i) {
        this.fca = i;
    }

    public void setFcb(int i) {
        this.fcb = i;
    }

    public void setFilterAdsShowCallState(int i) {
        this.filterAdsShowCallState = i;
    }

    public void setFilterAdsVideoCallState(int i) {
        if (i == 2) {
            i = this.retarget_offer == 1 ? 1 : 0;
        }
        this.filterAdsVideoCallState = i;
    }

    public void setFilterCallBackState(int i) {
        if (i == 2) {
            i = this.retarget_offer == 1 ? 1 : 0;
        }
        this.filterCallBackState = i;
    }

    public void setFlb(int i) {
        this.flb = i;
    }

    public void setFlbSkipTime(int i) {
        this.flbSkipTime = i;
    }

    public void setGifUrl(String str) {
        this.gifUrl = str;
    }

    public void setGuidelines(String str) {
        this.guidelines = str;
    }

    public void setHasMBTplMark(boolean z) {
        this.hasMBTplMark = z;
    }

    public void setHasReportAdTrackPause(boolean z) {
        this.hasReportAdTrackPause = z;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public void setIa_ext1(String str) {
        this.ia_ext1 = str;
    }

    public void setIa_ext2(String str) {
        this.ia_ext2 = str;
    }

    public void setIex(int i) {
        this.iex = i;
    }

    public void setImageSize(String str) {
        this.imageSize = str;
    }

    public void setImpReportType(int i) {
        this.impReportType = i;
        if (i == 1) {
            int i2 = this.adType;
            if (i2 == 296 || i2 == 42) {
                String impressionURL = getImpressionURL();
                String onlyImpressionURL = getOnlyImpressionURL();
                if (!TextUtils.isEmpty(impressionURL) && !impressionURL.contains(JSON_KEY_IMP_REPORT_TYPE)) {
                    setImpressionURL(impressionURL + "&imp_report_type=" + i);
                }
                if (TextUtils.isEmpty(onlyImpressionURL) || onlyImpressionURL.contains(JSON_KEY_IMP_REPORT_TYPE)) {
                    return;
                }
                setOnlyImpressionURL(onlyImpressionURL + "&imp_report_type=" + i);
            }
        }
    }

    public void setImpUA(int i) {
        this.impUA = i;
    }

    public void setImpressionURL(String str) {
        this.impressionURL = str;
    }

    public void setInteractiveCache(String str) {
        this.interactiveCache = str;
    }

    public void setIsAddSuccesful(int i) {
        this.isAddSuccesful = i;
    }

    public void setIsBidCampaign(boolean z) {
        this.isBidCampaign = z;
    }

    public void setIsClick(int i) {
        this.isClick = i;
    }

    public void setIsDeleted(int i) {
        this.isDeleted = i;
    }

    public void setIsDownLoadZip(int i) {
        this.isDownLoadZip = i;
    }

    public void setIsMraid(boolean z) {
        this.isMraid = z;
    }

    public void setIsTimeoutCheckVideoStatus(int i) {
        this.isTimeoutCheckVideoStatus = i;
    }

    public void setJmPd(int i) {
        this.jmPd = i;
    }

    public void setJumpResult(JumpLoaderResult jumpLoaderResult) {
        this.jumpResult = jumpLoaderResult;
    }

    public void setK(String str) {
        this.f35606k = str;
    }

    public void setKeyIaIcon(String str) {
        this.keyIaIcon = str;
    }

    public void setKeyIaOri(int i) {
        this.keyIaOri = i;
    }

    public void setKeyIaRst(int i) {
        this.keyIaRst = i;
    }

    public void setKeyIaUrl(String str) {
        this.keyIaUrl = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setLandingType(String str) {
        this.landingType = str;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setLoadTimeoutState(int i) {
        this.loadTimeoutState = i;
    }

    public void setLocalAllowTrackClick(int i) {
        this.localAllowTrackClick = i;
    }

    public void setLocalCheckShow(int i) {
        this.localCheckShow = i;
    }

    public void setLocalRequestId(String str) {
        this.localRequestId = str;
    }

    public void setMaitve(int i) {
        this.maitve = i;
    }

    public void setMaitve_src(String str) {
        this.maitve_src = str;
    }

    public void setMediaViewHolder(C13065b c13065b) {
        this.mediaViewHolder = c13065b;
    }

    public void setMof_template_url(String str) {
        this.mof_template_url = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCMPTEntryUrl(str);
        boolean zM37938i = C13229v0.m37938i(str);
        int iM37903b = C13229v0.m37903b(str);
        if (zM37938i) {
            setDynamicView(true);
            setDynamicTempCode(iM37903b);
        }
        setCanStart2C1Anim(C13229v0.m37935h(str));
    }

    public void setMof_tplid(int i) {
        this.mof_tplid = i;
    }

    public void setMp(String str) {
        this.f35607mp = str;
    }

    public void setMraid(String str) {
        this.mraid = str;
    }

    public void setNLRid(String str) {
        this.n_lrid = str;
    }

    public void setNRid(String str) {
        this.n_rid = str;
    }

    public void setNativeVideoTracking(C13076j c13076j) {
        this.nativeVideoTracking = c13076j;
    }

    public void setNativeVideoTrackingString(String str) {
        this.nativeVideoTrackingString = str;
    }

    public void setNetAddress(String str) {
        this.netAddress = str;
    }

    public void setNoticeUrl(String str) {
        this.noticeUrl = str;
    }

    public void setNscpt(int i) {
        this.nscpt = i;
    }

    public void setNvT2(int i) {
        this.nvT2 = i;
    }

    public void setOc_time(int i) {
        this.oc_time = i;
    }

    public void setOc_type(int i) {
        this.oc_type = i;
    }

    public void setOfferType(int i) {
        this.offerType = i;
    }

    public void setOmid(String str) {
        this.omid = str;
    }

    public void setOnlyImpressionURL(String str) {
        Uri uri;
        this.onlyImpressionURL = str;
        try {
            if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
                return;
            }
            String queryParameter = uri.getQueryParameter(URL_KEY_EXP_IDS);
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            setExpIds(queryParameter);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void setPkgSource(String str) {
        this.pkgSource = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setPlayable_ads_without_video(int i) {
        this.playable_ads_without_video = i;
    }

    public void setPlct(long j) {
        this.plct = j;
    }

    public void setPlctb(long j) {
        this.plctb = j;
    }

    public void setPrivacyButtonTemplateVisibility(int i) {
        this.privacyButtonTemplateVisibility = i;
    }

    public void setPrivacyUrl(String str) {
        this.privacyUrl = str;
    }

    public void setProgressBarShow(int i) {
        this.progressBarShow = i;
    }

    public void setPv_urls(List<String> list) {
        this.pv_urls = list;
    }

    public void setQ(String str) {
        this.f35608q = str;
    }

    public void setR(String str) {
        this.f35609r = str;
    }

    public void setReady(boolean z) {
        this.isReady = z;
    }

    public void setReadyState(int i) {
        this.readyState = i;
    }

    public void setReady_rate(int i) {
        this.ready_rate = i;
    }

    public void setReasond(String str) {
        this.reasond = str;
    }

    public void setReport(boolean z) {
        this.isReport = z;
    }

    public void setReportClick(boolean z) {
        this.isReportClick = z;
    }

    public void setReq_ext_data(String str) {
        this.req_ext_data = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRequestIdNotice(String str) {
        this.requestIdNotice = str;
    }

    public void setRetarget_offer(int i) {
        this.retarget_offer = i;
    }

    public void setRewardAmount(int i) {
        this.rewardAmount = i;
    }

    public void setRewardName(String str) {
        this.reward_name = str;
    }

    public void setRewardPlayStatus(int i) {
        this.rewardPlayStatus = i;
    }

    public void setRewardPlus(RewardPlus rewardPlus) {
        this.rewardPlus = rewardPlus;
    }

    public void setRewardTemplateMode(C13066c c13066c) {
        this.rewardTemplateMode = c13066c;
        if (c13066c == null || TextUtils.isEmpty(c13066c.m36781j())) {
            return;
        }
        if (TextUtils.isEmpty(this.mof_template_url) && c13066c.m36781j().contains(KEY_IS_CMPT_ENTRY)) {
            setCMPTEntryUrl(c13066c.m36781j());
        }
        boolean zM37938i = C13229v0.m37938i(c13066c.m36781j());
        int iM37903b = C13229v0.m37903b(c13066c.m36781j());
        if (zM37938i) {
            setDynamicView(true);
            setDynamicTempCode(iM37903b);
        }
        setMoreOfferAdControl(c13066c.m36781j(), "template_url");
    }

    public void setRsIgnoreCheckRule(ArrayList<Integer> arrayList) {
        this.rsIgnoreCheckRule = arrayList;
    }

    public void setRsIgnoreCheckRuleByString(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str2 : strArrSplit) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            setRsIgnoreCheckRule(arrayList);
        }
    }

    public void setRtinsType(int i) {
        this.rtinsType = i;
    }

    public void setSecondRequestIndex(int i) {
        this.secondRequestIndex = i;
    }

    public void setSecondShowIndex(int i) {
        this.secondShowIndex = i;
    }

    public void setShowCount(int i) {
        this.showCount = i;
    }

    public void setShowIndex(int i) {
        this.showIndex = i;
    }

    public void setShowStoreMiniCardDelayTime(int i) {
        this.showStoreMiniCardDelayTime = i;
    }

    public void setShowType(int i) {
        this.showType = i;
    }

    public void setSpareOfferFlag(int i) {
        this.spareOfferFlag = i;
    }

    public void setTImp(int i) {
        this.t_imp = i;
    }

    public void setT_list(String str) {
        this.t_list = str;
    }

    public void setTab(int i) {
        this.tab = i;
    }

    public void setTemplate(int i) {
        this.template = i;
    }

    public void setTemplateRenderSucc(boolean z) {
        this.isTemplateRenderSucc = z;
    }

    public void setTokenRule(int i) {
        this.tokenRule = i;
    }

    public void setTpOffer(int i) {
        this.tpOffer = i;
    }

    public void setTrackingTcpPort(int i) {
        this.trackingTcpPort = i;
    }

    public void setTriggerClickSource(int i) {
        this.triggerClickSource = i;
    }

    public void setTs(long j) {
        this.f35610ts = j;
    }

    public void setTyped(int i) {
        this.typed = i;
    }

    public void setUseSkipTime(int i) {
        this.useSkipTime = i;
    }

    public void setUserActivation(boolean z) {
        this.userActivation = z;
    }

    public void setVcn(int i) {
        this.vcn = i;
    }

    public void setVidCrtvId(long j) {
        this.vidCrtvId = j;
    }

    public void setVideoCheckType(int i) {
        if (i > 2 || i < 1) {
            this.videoCheckType = 2;
        } else {
            this.videoCheckType = i;
        }
    }

    public void setVideoCompleteTime(int i) {
        this.videoCompleteTime = i;
    }

    public void setVideoCtnType(int i) {
        if (i > 2 || i < 1) {
            this.videoCtnType = 1;
        } else {
            this.videoCtnType = i;
        }
    }

    public void setVideoMD5Value(String str) {
        this.videoMD5Value = str;
    }

    public void setVideoPlayProgress(int i) {
        this.videoPlayProgress = i;
    }

    public void setVideoResolution(String str) {
        this.videoResolution = str;
    }

    public void setVideoSize(int i) {
        this.videoSize = i;
    }

    public void setVideoUrlEncode(String str) {
        this.videoUrlEncode = str;
    }

    public void setVideo_end_type(int i) {
        this.video_end_type = i;
    }

    public void setVst(int i) {
        this.vst = i;
    }

    public void setWatchMile(int i) {
        this.watchMile = i;
    }

    public void setWtick(int i) {
        this.wtick = i;
    }

    public void setcUA(int i) {
        this.cUA = i;
    }

    public void setcVersionCode(long j) {
        this.cVersionCode = j;
    }

    public void setendcard_url(String str) {
        C13066c c13066c;
        this.endcard_url = str;
        if (TextUtils.isEmpty(this.mof_template_url) && (((c13066c = this.rewardTemplateMode) == null || TextUtils.isEmpty(c13066c.f35638e)) && !TextUtils.isEmpty(str) && str.contains(KEY_IS_CMPT_ENTRY))) {
            setCMPTEntryUrl(str);
        }
        setCanStartMoreOfferAnim(C13229v0.m37935h(str));
        setMoreOfferAdControl(str, ENDCARD_URL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.out.Campaign] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.out.Campaign] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    public static CampaignEx parseCampaign(JSONObject jSONObject, String str, String str2, String str3, boolean z, CampaignUnit campaignUnit, String str4, String str5) {
        ?? campaign;
        String str6;
        CampaignEx campaignEx;
        ?? arrayList;
        String str7 = JSON_KEY_AAB;
        JSONObject jSONObjectDealV5Temp = dealV5Temp(jSONObject);
        if (jSONObjectDealV5Temp == null) {
            return null;
        }
        try {
            ?? campaignEx2 = new CampaignEx();
            try {
                String strOptString = jSONObjectDealV5Temp.optString(JSON_KEY_AD_AKS);
                if (TextUtils.isEmpty(strOptString)) {
                    str6 = JSON_KEY_AAB;
                    campaignEx = null;
                } else {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    Iterator<String> itKeys = jSONObject2.keys();
                    campaignEx = null;
                    HashMap map = new HashMap();
                    while (itKeys != null && itKeys.hasNext()) {
                        Iterator<String> it = itKeys;
                        String next = itKeys.next();
                        map.put(next, jSONObject2.optString(next));
                        str7 = str7;
                        itKeys = it;
                    }
                    str6 = str7;
                    campaignEx2.setAks(map);
                }
                if (!TextUtils.isEmpty(str4)) {
                    campaignEx2.setBidToken(str4);
                    campaignEx2.setIsBidCampaign(true);
                }
                try {
                    campaignEx2.setReady_rate(jSONObjectDealV5Temp.optInt(JSON_KEY_READY_RATE, -1));
                    JSONObject jSONObjectOptJSONObject = jSONObjectDealV5Temp.optJSONObject(JSON_KEY_EXT_DATA);
                    if (jSONObjectOptJSONObject != null) {
                        campaignEx2.setExt_data(jSONObjectOptJSONObject.toString());
                    }
                    campaignEx2.setMof_tplid(jSONObjectDealV5Temp.optInt(AbstractC13068b.JSON_KEY_MOF_TPLID));
                    campaignEx2.setMof_template_url(jSONObjectDealV5Temp.optString(AbstractC13068b.JSON_KEY_MOF_TEMPLATE_URL));
                    campaignEx2.setNscpt(jSONObjectDealV5Temp.optInt(AbstractC13068b.JSON_KEY_NSCPT));
                    new JSONArray();
                    JSONArray jSONArrayOptJSONArray = jSONObjectDealV5Temp.optJSONArray("pv_urls");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        arrayList = campaignEx;
                    } else {
                        arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            arrayList.add(jSONArrayOptJSONArray.optString(i));
                        }
                    }
                    campaignEx2.setPv_urls(arrayList);
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectDealV5Temp.optJSONObject(AbstractC13068b.JSON_KEY_REQ_EXT_DATA);
                    if (jSONObjectOptJSONObject2 != null) {
                        campaignEx2.setReq_ext_data(jSONObjectOptJSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
                campaignEx2.setId(jSONObjectDealV5Temp.optString("id"));
                campaignEx2.setAppName(jSONObjectDealV5Temp.optString("title"));
                campaignEx2.setCampaignUnitId(jSONObjectDealV5Temp.optString("unitId", ""));
                campaignEx2.setAppDesc(jSONObjectDealV5Temp.optString(JSON_KEY_DESC));
                campaignEx2.setPackageName(jSONObjectDealV5Temp.optString("package_name"));
                campaignEx2.setRtinsType(jSONObjectDealV5Temp.optInt(JSON_KEY_RETARGET_TYPE));
                campaignEx2.setIconUrl(jSONObjectDealV5Temp.optString(JSON_KEY_ICON_URL));
                campaignEx2.setImageUrl(jSONObjectDealV5Temp.optString("image_url"));
                campaignEx2.setSize(jSONObjectDealV5Temp.optString(JSON_KEY_APP_SIZE));
                campaignEx2.setImageSize(jSONObjectDealV5Temp.optString(JSON_KEY_IMAGE_SIZE));
                campaignEx2.setImpressionURL(DomainCampaignEx.replaceValueByKey(campaignUnit, campaignEx2, jSONObjectDealV5Temp.optString(JSON_KEY_IMPRESSION_URL)));
                campaignEx2.setClickURL(DomainCampaignEx.replaceValueByKey(campaignUnit, campaignEx2, jSONObjectDealV5Temp.optString(JSON_KEY_CLICK_URL)));
                campaignEx2.setRewardPlus(RewardPlus.parseByString(jSONObjectDealV5Temp.optString(JSON_KEY_REWARD_PLUS)));
                campaignEx2.setWtick(jSONObjectDealV5Temp.optInt(JSON_KEY_WITHOUT_INSTALL_CHECK));
                campaignEx2.setDeepLinkUrl(DomainCampaignEx.replaceValueByKey(campaignUnit, campaignEx2, jSONObjectDealV5Temp.optString(JSON_KEY_DEEP_LINK_URL)));
                campaignEx2.setUserActivation(jSONObjectDealV5Temp.optBoolean(JSON_KEY_USER_ACTIVATION, false));
                campaignEx2.setNoticeUrl(DomainCampaignEx.replaceValueByKey(campaignUnit, campaignEx2, jSONObjectDealV5Temp.optString(JSON_KEY_NOTICE_URL)));
                campaignEx2.setTemplate(jSONObjectDealV5Temp.optInt("template"));
                campaignEx2.setType(jSONObjectDealV5Temp.optInt(JSON_KEY_AD_SOURCE_ID, 1));
                campaignEx2.setFca(jSONObjectDealV5Temp.optInt(JSON_KEY_FCA));
                campaignEx2.setFcb(jSONObjectDealV5Temp.optInt(JSON_KEY_FCB));
                campaignEx2.setEndcard_click_result(jSONObjectDealV5Temp.optInt(JSON_KEY_ENDCARD_CLICK));
                if (!TextUtils.isEmpty(jSONObjectDealV5Temp.optString(JSON_KEY_STAR))) {
                    campaignEx2.setRating(Double.parseDouble(jSONObjectDealV5Temp.optString(JSON_KEY_STAR, "0")));
                }
                if (!TextUtils.isEmpty(jSONObjectDealV5Temp.optString(JSON_KEY_NUMBER_RATING))) {
                    campaignEx2.setNumberRating(jSONObjectDealV5Temp.optInt(JSON_KEY_NUMBER_RATING, 333333));
                }
                campaignEx2.setClick_mode(jSONObjectDealV5Temp.optString(JSON_KEY_CLICK_MODE));
                campaignEx2.setLandingType(jSONObjectDealV5Temp.optString(JSON_KEY_LANDING_TYPE));
                campaignEx2.setLinkType(jSONObjectDealV5Temp.optInt(JSON_KEY_LINK_TYPE, 4));
                campaignEx2.setClickInterval(jSONObjectDealV5Temp.optInt(JSON_KEY_CLICK_INTERVAL));
                campaignEx2.setAdCall(jSONObjectDealV5Temp.optString(JSON_KEY_CTA_TEXT));
                campaignEx2.setAd_url_list(jSONObjectDealV5Temp.optString(JSON_KEY_AD_URL_LIST));
                campaignEx2.setRetarget_offer(jSONObjectDealV5Temp.optInt(JSON_KEY_RETARGET_OFFER, 2));
                String strOptString2 = jSONObjectDealV5Temp.optString("video_url");
                if (!TextUtils.isEmpty(strOptString2)) {
                    if (z) {
                        campaignEx2.setVideoUrlEncode(strOptString2);
                    } else {
                        campaignEx2.setVideoUrlEncode(C13207k0.m37712a(strOptString2));
                    }
                }
                campaignEx2.setVideoCompleteTime(jSONObjectDealV5Temp.optInt(JSON_KEY_VIDEO_COMPLETE_TIME));
                campaignEx2.setVideoLength(jSONObjectDealV5Temp.optInt(JSON_KEY_VIDEO_LENGTHL));
                campaignEx2.setVideoSize(jSONObjectDealV5Temp.optInt(JSON_KEY_VIDEO_SIZE));
                campaignEx2.setVideoResolution(jSONObjectDealV5Temp.optString(JSON_KEY_VIDEO_RESOLUTION));
                campaignEx2.setWatchMile(jSONObjectDealV5Temp.optInt(JSON_KEY_WATCH_MILE));
                campaignEx2.setTimestamp(System.currentTimeMillis());
                campaignEx2.setOnlyImpressionURL(DomainCampaignEx.replaceValueByKey(campaignUnit, campaignEx2, str));
                try {
                    if (!TextUtils.isEmpty(str5)) {
                        campaignEx2.setEcppv(str5);
                    }
                    campaignEx2.setAc_s(jSONObjectDealV5Temp.optInt(KEY_ACTIVITY_CHECK_SWITCH, 1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                campaignEx2.setBty(jSONObjectDealV5Temp.optInt(JSON_KEY_BTY));
                campaignEx2.setAdvImp(jSONObjectDealV5Temp.optString(JSON_KEY_ADVIMP));
                campaignEx2.setTImp(jSONObjectDealV5Temp.optInt(JSON_KEY_T_IMP));
                campaignEx2.setHtmlUrl(str2);
                campaignEx2.setEndScreenUrl(str3);
                campaignEx2.setGuidelines(jSONObjectDealV5Temp.optString(JSON_KEY_GUIDELINES));
                campaignEx2.setOfferType(jSONObjectDealV5Temp.optInt(JSON_KEY_OFFER_TYPE));
                campaignEx2.setRewardName(jSONObjectDealV5Temp.optString(JSON_KEY_REWARD_NAME));
                campaignEx2.setRewardAmount(jSONObjectDealV5Temp.optInt(JSON_KEY_REWARD_AMOUNT));
                try {
                    String strReplaceValueByKey = DomainCampaignEx.replaceValueByKey(campaignUnit, campaignEx2, jSONObjectDealV5Temp.optString(JSON_NATIVE_VIDEO_AD_TRACKING));
                    if (!TextUtils.isEmpty(strReplaceValueByKey)) {
                        campaignEx2.setNativeVideoTrackingString(strReplaceValueByKey);
                        campaignEx2.setNativeVideoTracking(TrackingStr2Object(strReplaceValueByKey));
                    }
                } catch (Exception unused2) {
                }
                campaignEx2.setVideo_end_type(jSONObjectDealV5Temp.optInt(VIDEO_END_TYPE, 2));
                if (isBreakCampainOrSetItByEndCard(campaignEx2, jSONObjectDealV5Temp.optString(ENDCARD_URL))) {
                    return campaignEx;
                }
                campaignEx2.setPlayable_ads_without_video(jSONObjectDealV5Temp.optInt(PLAYABLE_ADS_WITHOUT_VIDEO, 1));
                campaignEx2.setVideoMD5Value("");
                if (jSONObjectDealV5Temp.has(JSON_KEY_NV_T2)) {
                    campaignEx2.setNvT2(jSONObjectDealV5Temp.optInt(JSON_KEY_NV_T2));
                }
                if (jSONObjectDealV5Temp.has(JSON_KEY_GIF_URL)) {
                    campaignEx2.setGifUrl(jSONObjectDealV5Temp.optString(JSON_KEY_GIF_URL));
                }
                campaignEx2.setRewardTemplateMode(C13066c.m36770a(jSONObjectDealV5Temp.optJSONObject("rv")));
                campaignEx2.setClickTimeOutInterval(jSONObjectDealV5Temp.optInt(JSON_KEY_CLICK_TIMEOUT_INTERVAL, 2));
                campaignEx2.setImpUA(jSONObjectDealV5Temp.optInt(JSON_KEY_IMP_UA, 1));
                campaignEx2.setcUA(jSONObjectDealV5Temp.optInt(JSON_KEY_C_UA, 1));
                campaignEx2.setJmPd(jSONObjectDealV5Temp.optInt(JSON_KEY_JM_PD));
                campaignEx2.setKeyIaIcon(jSONObjectDealV5Temp.optString("ia_icon"));
                campaignEx2.setKeyIaRst(jSONObjectDealV5Temp.optInt("ia_rst"));
                campaignEx2.setKeyIaUrl(jSONObjectDealV5Temp.optString("ia_url"));
                campaignEx2.setKeyIaOri(jSONObjectDealV5Temp.optInt("ia_ori"));
                campaignEx2.setAdType(campaignUnit.getAdType());
                campaignEx2.setTpOffer(jSONObjectDealV5Temp.optInt(JSON_KEY_TP_OFFER));
                campaignEx2.setFac(jSONObjectDealV5Temp.optInt(JSON_KEY_FAC));
                campaignEx2.setIa_ext1(jSONObjectDealV5Temp.optString(KEY_IA_EXT1));
                campaignEx2.setIa_ext2(jSONObjectDealV5Temp.optString(KEY_IA_EXT2));
                campaignEx2.setIsDownLoadZip(jSONObjectDealV5Temp.optInt(KEY_IS_DOWNLOAD));
                campaignEx2.setInteractiveCache(jSONObjectDealV5Temp.optString(KEY_IA_CACHE));
                campaignEx2.setOc_time(jSONObjectDealV5Temp.optInt(KEY_OC_TIME));
                campaignEx2.setOc_type(jSONObjectDealV5Temp.optInt(KEY_OC_TYPE));
                campaignEx2.setT_list(jSONObjectDealV5Temp.optString(KEY_T_LIST));
                campaignEx2.setAdchoice(C13064a.m36751c(jSONObjectDealV5Temp.optString(KEY_ADCHOICE, "")));
                campaignEx2.setPlct(jSONObjectDealV5Temp.optLong(JSON_KEY_PLCT));
                campaignEx2.setCandidateCacheTime(jSONObjectDealV5Temp.optLong(JSON_KEY_C_C_TIME));
                campaignEx2.setPlctb(jSONObjectDealV5Temp.optLong(JSON_KEY_PLCTB));
                campaignEx2.setCreativeId(jSONObjectDealV5Temp.optLong(JSON_KEY_CREATIVE_ID));
                campaignEx2.setVidCrtvId(jSONObjectDealV5Temp.optLong(JSON_KEY_VIDEO_CREATIVE_ID));
                campaignEx2.setEcCrtvId(jSONObjectDealV5Temp.optLong(JSON_KEY_EC_CREATIVE_ID));
                campaignEx2.setEcTemplateId(jSONObjectDealV5Temp.optLong(JSON_KEY_EC_TEMP_ID));
                String strOptString3 = jSONObjectDealV5Temp.optString("cam_tpl_url");
                Uri uri = Uri.parse(strOptString3);
                if (TextUtils.isEmpty(uri.getPath()) || !(uri.getPath().endsWith(".zip") || uri.getPath().endsWith(".ZIP"))) {
                    campaignEx2.setBannerUrl(strOptString3);
                } else {
                    campaignEx2.setAdZip(strOptString3);
                }
                campaignEx2.setBannerHtml(jSONObjectDealV5Temp.optString("cam_html"));
                campaignEx2.setAdHtml(jSONObjectDealV5Temp.optString("cam_html"));
                String strOptString4 = jSONObjectDealV5Temp.optString(JSON_KEY_MRAID);
                if (!TextUtils.isEmpty(strOptString4)) {
                    campaignEx2.setIsMraid(true);
                    campaignEx2.setMraid(strOptString4);
                } else if (TextUtils.isEmpty(campaignEx2.getAdHtml()) || campaignEx2.getAdHtml().contains("<MBTPLMARK>")) {
                    campaignEx2.setIsMraid(false);
                } else {
                    campaignEx2.setIsMraid(true);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectDealV5Temp.optJSONArray(KEY_OMID);
                if (jSONArrayOptJSONArray2 != null) {
                    campaignEx2.setOmid(jSONArrayOptJSONArray2.toString());
                } else if (TextUtils.isEmpty(jSONObjectDealV5Temp.optString(KEY_OMID))) {
                    campaignEx2.setOmid(campaignEx);
                } else {
                    campaignEx2.setOmid(jSONObjectDealV5Temp.optString(KEY_OMID));
                }
                campaignEx2.setPlacementId(jSONObjectDealV5Temp.optString(MBridgeConstans.PLACEMENT_ID));
                campaignEx2.setMaitve(jSONObjectDealV5Temp.optInt(JSON_KEY_MAITVE));
                campaignEx2.setMaitve_src(jSONObjectDealV5Temp.optString(JSON_KEY_MAITVESRC));
                campaignEx2.setFlb(jSONObjectDealV5Temp.optInt(JSON_KEY_FLB));
                campaignEx2.setCbd(jSONObjectDealV5Temp.optInt(JSON_KEY_NEW_INTERSTITIAL_CBD, -2));
                campaignEx2.setVst(jSONObjectDealV5Temp.optInt(JSON_KEY_NEW_INTERSTITIAL_VST, -2));
                campaignEx2.setUseSkipTime(jSONObjectDealV5Temp.optInt(JSON_KEY_USE_SKIP_TIME, 0));
                campaignEx2.setProgressBarShow(jSONObjectDealV5Temp.optInt(JSON_KEY_PROG_BAR, 0));
                campaignEx2.setAdSpaceT(jSONObjectDealV5Temp.optInt(JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, 1));
                campaignEx2.setFlbSkipTime(jSONObjectDealV5Temp.optInt(JSON_KEY_FLB_SKIP_TIME));
                campaign = DomainCampaignEx.parseCampaign(jSONObjectDealV5Temp, campaignEx2);
                try {
                    try {
                        campaign.setImpressionURL(C13229v0.m37882a(C13008c.m36588n().m36542d(), campaign.getPackageName(), campaign.getImpressionURL()));
                    } catch (Exception e2) {
                        C13219q0.m37816b("campaign", e2.getMessage());
                    }
                    campaign.setVideoCheckType(jSONObjectDealV5Temp.optInt(JSON_KEY_VIDEO_CHECK_TYPE, 2));
                    campaign.setVideoCtnType(jSONObjectDealV5Temp.optInt(JSON_KEY_VIDEO_CTN_TYPE, 1));
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectDealV5Temp.optJSONArray(JSON_KEY_RS_IGNORE_CHECK_RULE);
                    if (jSONArrayOptJSONArray3 == null) {
                        String strOptString5 = jSONObjectDealV5Temp.optString(JSON_KEY_RS_IGNORE_CHECK_RULE);
                        if (!TextUtils.isEmpty(strOptString5)) {
                            try {
                                jSONArrayOptJSONArray3 = new JSONArray(strOptString5);
                            } catch (JSONException unused3) {
                            }
                        }
                    }
                    if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray3.optInt(i2)));
                        }
                        if (arrayList2.size() > 0) {
                            campaign.setRsIgnoreCheckRule(arrayList2);
                        }
                    }
                    String str8 = str6;
                    if (jSONObjectDealV5Temp.has(str8)) {
                        campaign.setAabEntity(AabEntity.parser(jSONObjectDealV5Temp.getString(str8)));
                    }
                    try {
                        campaign.setPrivacyUrl(jSONObjectDealV5Temp.optString(JSON_KEY_PRIVACY_URL, ""));
                        campaign.setPrivacyButtonTemplateVisibility(jSONObjectDealV5Temp.optInt(PRIVACY_BUTTON_VIDEO_TEMPLATE_SWITCH, 0));
                    } catch (Exception e3) {
                        C13219q0.m37816b("campaign", e3.getMessage());
                    }
                    campaign.setImpReportType(jSONObjectDealV5Temp.optInt(JSON_KEY_IMP_REPORT_TYPE, 0));
                    campaign.setAutoShowStoreMiniCard(jSONObjectDealV5Temp.optInt(JSON_KEY_AUTO_SHOW_MINI_CARD, 0));
                    campaign.setShowStoreMiniCardDelayTime(jSONObjectDealV5Temp.optInt(JSON_KEY_SHOW_MINI_CARD_DELAY_TIME, 0));
                    String strOptString6 = jSONObjectDealV5Temp.optString(KEY_ACTIVITY_PATH_AND_NAME);
                    if (!TextUtils.isEmpty(strOptString6)) {
                        try {
                            campaign.setAc(strOptString6);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    campaign.setSecondRequestIndex(campaignUnit.getSecondRequestIndex());
                    campaign.setSecondShowIndex(campaignUnit.getSecondShowIndex());
                    campaign.setFilterCallBackState(jSONObjectDealV5Temp.optInt(KEY_SECOND_REQUEST_CALLBACK_STATE, 2));
                    campaign.setFilterAdsShowCallState(jSONObjectDealV5Temp.optInt(KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, 0));
                    campaign.setFilterAdsVideoCallState(jSONObjectDealV5Temp.optInt(KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, 2));
                    campaign.setLocalCheckShow(jSONObjectDealV5Temp.optInt(KEY_LOCAL_CHECK_STATE));
                    campaign.setLocalAllowTrackClick(jSONObjectDealV5Temp.optInt(KEY_LOCAL_ALLOW_TRACK_CLICK));
                    return campaign;
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Exception e6) {
                e = e6;
                campaign = campaignEx2;
            }
        } catch (Exception e7) {
            e = e7;
            campaign = 0;
        }
        e.printStackTrace();
        return campaign;
    }

    public String getHost() {
        if (TextUtils.isEmpty(getNoticeUrl())) {
            return "";
        }
        try {
            Uri uri = Uri.parse(getNoticeUrl());
            if (uri == null) {
                return "";
            }
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
            return "";
        }
    }

    public static JSONObject campaignToJsonObject(CampaignEx campaignEx) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", campaignEx.getId());
        jSONObject.put(JSON_KEY_FLB, campaignEx.getFlb());
        jSONObject.put(JSON_KEY_FLB_SKIP_TIME, campaignEx.getFlbSkipTime());
        jSONObject.put(JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
        jSONObject.put(JSON_KEY_NEW_INTERSTITIAL_VST, campaignEx.getVst());
        jSONObject.put(JSON_KEY_USE_SKIP_TIME, campaignEx.getUseSkipTime());
        jSONObject.put(JSON_KEY_PROG_BAR, campaignEx.getProgressBarShow());
        jSONObject.put(JSON_KEY_NEW_INTERSTITIAL_CBD, campaignEx.getCbd());
        if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
            jSONObject.put("unitId", campaignEx.getCampaignUnitId());
        }
        if (!TextUtils.isEmpty(campaignEx.getExt_data())) {
            try {
                jSONObject.put(JSON_KEY_EXT_DATA, new JSONObject(campaignEx.getExt_data()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(campaignEx.getReq_ext_data())) {
            try {
                jSONObject.put(AbstractC13068b.JSON_KEY_REQ_EXT_DATA, new JSONObject(campaignEx.getReq_ext_data()));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = campaignEx.getPv_urls().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
            jSONObject.put(AbstractC13068b.JSON_KEY_MOF_TPLID, campaignEx.getMof_tplid());
            jSONObject.put(AbstractC13068b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
            jSONObject.put(AbstractC13068b.JSON_KEY_NSCPT, campaignEx.getNscpt());
        }
        jSONObject.put(JSON_KEY_READY_RATE, campaignEx.getReady_rate());
        jSONObject.put("title", campaignEx.getAppName());
        jSONObject.put(JSON_KEY_DESC, campaignEx.getAppDesc());
        jSONObject.put("package_name", campaignEx.getPackageName());
        jSONObject.put(JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
        jSONObject.put(JSON_KEY_ICON_URL, campaignEx.getIconUrl());
        jSONObject.put("image_url", campaignEx.getImageUrl());
        jSONObject.put(JSON_KEY_APP_SIZE, campaignEx.getSize());
        jSONObject.put(JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
        jSONObject.put(JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
        jSONObject.put(JSON_KEY_CLICK_URL, campaignEx.getClickURL());
        if (campaignEx.getRewardPlus() != null) {
            jSONObject.put(JSON_KEY_REWARD_PLUS, campaignEx.getRewardPlus().toJsonObject());
        }
        jSONObject.put(JSON_KEY_WITHOUT_INSTALL_CHECK, campaignEx.getWtick());
        jSONObject.put(JSON_KEY_DEEP_LINK_URL, campaignEx.getDeepLinkURL());
        jSONObject.put(JSON_KEY_USER_ACTIVATION, campaignEx.getUserActivation());
        jSONObject.put(JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
        jSONObject.put("template", campaignEx.getTemplate());
        jSONObject.put(JSON_KEY_AD_SOURCE_ID, campaignEx.getType());
        jSONObject.put(JSON_KEY_FCA, campaignEx.getFca());
        jSONObject.put(JSON_KEY_FCB, campaignEx.getFcb());
        jSONObject.put(JSON_KEY_STAR, campaignEx.getRating() + "");
        jSONObject.put(JSON_KEY_NUMBER_RATING, campaignEx.getNumberRating());
        jSONObject.put(JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
        jSONObject.put(JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
        jSONObject.put(JSON_KEY_LINK_TYPE, campaignEx.getLinkType());
        jSONObject.put(JSON_KEY_CLICK_INTERVAL, campaignEx.getClickInterval());
        jSONObject.put(JSON_KEY_CTA_TEXT, campaignEx.getAdCall());
        jSONObject.put(JSON_KEY_ENDCARD_CLICK, campaignEx.getEndcard_click_result());
        jSONObject.put(JSON_KEY_RETARGET_OFFER, campaignEx.getRetarget_offer());
        jSONObject.put("video_url", campaignEx.getVideoUrlEncode());
        jSONObject.put(JSON_KEY_VIDEO_LENGTHL, campaignEx.getVideoLength());
        jSONObject.put(JSON_KEY_VIDEO_SIZE, campaignEx.getVideoSize());
        jSONObject.put(JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
        jSONObject.put(JSON_KEY_WATCH_MILE, campaignEx.getWatchMile());
        jSONObject.put(JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
        jSONObject.put(AbstractC13068b.JSON_KEY_ONLY_IMPRESSION_URL, campaignEx.getOnlyImpressionURL());
        jSONObject.put(AbstractC13068b.JSON_KEY_C_I, campaignEx.getNetAddress());
        jSONObject.put(KEY_ACTIVITY_CHECK_SWITCH, campaignEx.getAc_s());
        jSONObject.put(JSON_KEY_ECPPV, campaignEx.getEcppv());
        jSONObject.put(JSON_KEY_BTY, campaignEx.getBty());
        jSONObject.put(JSON_KEY_T_IMP, campaignEx.getTImp());
        jSONObject.put(JSON_KEY_ADVIMP, campaignEx.getAdvImp());
        jSONObject.put(AbstractC13068b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
        jSONObject.put(AbstractC13068b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
        jSONObject.put(JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
        jSONObject.put(JSON_KEY_OFFER_TYPE, campaignEx.getOfferType());
        jSONObject.put(JSON_KEY_REWARD_AMOUNT, campaignEx.getRewardAmount());
        jSONObject.put(JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
        jSONObject.put(JSON_KEY_GIF_URL, campaignEx.getGifUrl());
        if (C13182a1.m37597b(campaignEx.getNativeVideoTrackingString())) {
            jSONObject.put(JSON_NATIVE_VIDEO_AD_TRACKING, new JSONObject(campaignEx.getNativeVideoTrackingString()));
        }
        jSONObject.put(VIDEO_END_TYPE, campaignEx.getVideo_end_type());
        jSONObject.put(ENDCARD_URL, campaignEx.getendcard_url());
        jSONObject.put(PLAYABLE_ADS_WITHOUT_VIDEO, campaignEx.getPlayable_ads_without_video());
        if (campaignEx.getRewardTemplateMode() != null && C13182a1.m37597b(campaignEx.getRewardTemplateMode().m36780i())) {
            jSONObject.put("rv", new JSONObject(campaignEx.getRewardTemplateMode().m36780i()));
        }
        jSONObject.put(JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
        jSONObject.put(JSON_KEY_CLICK_TIMEOUT_INTERVAL, campaignEx.getClickTimeOutInterval());
        jSONObject.put(JSON_KEY_C_UA, campaignEx.getcUA());
        jSONObject.put(JSON_KEY_IMP_UA, campaignEx.getImpUA());
        jSONObject.put(JSON_KEY_JM_PD, campaignEx.getJmPd());
        jSONObject.put("ia_icon", campaignEx.getKeyIaIcon());
        jSONObject.put("ia_rst", campaignEx.getKeyIaRst());
        jSONObject.put("ia_url", campaignEx.getKeyIaUrl());
        jSONObject.put("ia_ori", campaignEx.getKeyIaOri());
        jSONObject.put("ad_type", campaignEx.getAdType());
        jSONObject.put(KEY_IA_EXT1, campaignEx.getIa_ext1());
        jSONObject.put(KEY_IA_EXT2, campaignEx.getIa_ext2());
        jSONObject.put(KEY_IS_DOWNLOAD, campaignEx.getIsDownLoadZip());
        jSONObject.put(KEY_IA_CACHE, campaignEx.getInteractiveCache());
        jSONObject.put(KEY_OC_TYPE, campaignEx.getOc_type());
        jSONObject.put(KEY_OC_TIME, campaignEx.getOc_time());
        jSONObject.put(KEY_T_LIST, campaignEx.getT_list());
        C13064a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            jSONObject.put(KEY_ADCHOICE, new JSONObject(adchoice.m36754d()));
        }
        jSONObject.put(JSON_KEY_PLCT, campaignEx.getPlct());
        jSONObject.put(JSON_KEY_PLCTB, campaignEx.getPlctb());
        jSONObject.put(JSON_KEY_C_C_TIME, campaignEx.getCandidateCacheTime());
        jSONObject.put(KEY_OMID, campaignEx.getOmid());
        jSONObject.put(JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
        jSONObject.put("cam_html", campaignEx.getBannerHtml());
        jSONObject.put("cam_tpl_url", campaignEx.getBannerUrl() != null ? campaignEx.getBannerUrl() : campaignEx.getAdZip());
        jSONObject.put(JSON_KEY_MRAID, campaignEx.getMraid());
        jSONObject.put(JSON_KEY_MRAIDFORH5, campaignEx.getMraid());
        jSONObject.put("timestamp", campaignEx.getTimestamp());
        jSONObject.put(JSON_KEY_HB, campaignEx.isBidCampaign);
        jSONObject.put(MBridgeConstans.PLACEMENT_ID, campaignEx.getPlacementId());
        jSONObject.put(JSON_KEY_MAITVE, campaignEx.getMaitve());
        jSONObject.put(JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
        jSONObject.put("vcn", campaignEx.getVcn());
        jSONObject.put("token_r", campaignEx.getTokenRule());
        jSONObject.put("encrypt_p", campaignEx.getEncryptPrice());
        jSONObject.put(JSON_KEY_VIDEO_COMPLETE_TIME, campaignEx.getVideoCompleteTime());
        jSONObject.put(JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRule());
        jSONObject.put(JSON_KEY_VIDEO_CHECK_TYPE, campaignEx.getVideoCheckType());
        jSONObject.put(JSON_KEY_VIDEO_CTN_TYPE, campaignEx.getVideoCtnType());
        jSONObject.put(JSON_KEY_TP_OFFER, campaignEx.getTpOffer());
        jSONObject.put(JSON_KEY_FAC, campaignEx.getFac());
        jSONObject.put(JSON_KEY_LOCAL_REQUEST_ID, campaignEx.getLocalRequestId());
        jSONObject.put(JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
        jSONObject.put(PRIVACY_BUTTON_VIDEO_TEMPLATE_SWITCH, campaignEx.getPrivacyButtonTemplateVisibility());
        try {
            jSONObject.put("misk_spt", C13229v0.m37874a());
            jSONObject.put("misk_spt_det", C13229v0.m37913c());
        } catch (JSONException unused) {
        }
        if (campaignEx.getAabEntity() != null) {
            jSONObject.put(JSON_KEY_AAB, campaignEx.getAabEntity().toJson());
        }
        jSONObject.put(JSON_KEY_VIDEO_CREATIVE_ID, campaignEx.getVidCrtvId());
        jSONObject.put(JSON_KEY_EC_CREATIVE_ID, campaignEx.getEcCrtvId());
        jSONObject.put(JSON_KEY_EC_TEMP_ID, campaignEx.getEcTemplateId());
        jSONObject.put(JSON_KEY_IMP_REPORT_TYPE, campaignEx.getImpReportType());
        jSONObject.put(AbstractC13068b.JSON_KEY_TK_TCP_PORT, campaignEx.getTrackingTcpPort());
        jSONObject.put(JSON_KEY_AUTO_SHOW_MINI_CARD, campaignEx.getAutoShowStoreMiniCard());
        jSONObject.put(JSON_KEY_SHOW_MINI_CARD_DELAY_TIME, campaignEx.getShowStoreMiniCardDelayTime());
        jSONObject.put(KEY_SHOW_INDEX, campaignEx.getShowIndex());
        jSONObject.put(KEY_SHOW_TYPE, campaignEx.getShowType());
        jSONObject.put(KEY_CLICK_TEMP_SOURCE, campaignEx.getClickTempSource());
        jSONObject.put(KEY_PLAY_TEMP_DISPLAY_TYPE, campaignEx.isTemplateRenderSucc());
        jSONObject.put(KEY_EC_TEMP_DISPLAY_TYPE, campaignEx.isECTemplateRenderSucc());
        jSONObject.put(KEY_TRIGGER_CLICK_SOURCE, campaignEx.getTriggerClickSource());
        jSONObject.put(KEY_ACTIVITY_PATH_AND_NAME, campaignEx.getAc());
        jSONObject.put(KEY_SECOND_REQUEST_CALLBACK_STATE, campaignEx.getFilterCallBackState());
        jSONObject.put("s_show_index", campaignEx.getSecondShowIndex());
        jSONObject.put("r_index", campaignEx.getSecondRequestIndex());
        jSONObject.put(KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, campaignEx.getFilterAdsShowCallState());
        jSONObject.put(KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, campaignEx.getFilterAdsVideoCallState());
        jSONObject.put(KEY_LOCAL_CHECK_STATE, campaignEx.getLocalCheckShow());
        jSONObject.put(KEY_LOCAL_ALLOW_TRACK_CLICK, campaignEx.getLocalAllowTrackClick());
        return DomainCampaignEx.campaignToJsonObject(jSONObject, campaignEx);
    }
}
