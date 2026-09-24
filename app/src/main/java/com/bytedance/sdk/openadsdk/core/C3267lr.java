package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.C3274aw;
import com.bytedance.sdk.openadsdk.core.model.C3275ay;
import com.bytedance.sdk.openadsdk.core.model.C3276bu;
import com.bytedance.sdk.openadsdk.core.model.C3278di;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3280fi;
import com.bytedance.sdk.openadsdk.core.model.C3281fr;
import com.bytedance.sdk.openadsdk.core.model.C3285mj;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.C3290sf;
import com.bytedance.sdk.openadsdk.core.model.C3293su;
import com.bytedance.sdk.openadsdk.core.model.C3294uq;
import com.bytedance.sdk.openadsdk.core.model.C3295vr;
import com.bytedance.sdk.openadsdk.core.model.C3298zf;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3094ka;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.AbstractC3105lr;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.p194ri.C3107fi;
import com.bytedance.sdk.openadsdk.core.p200co.p215mj.C3180ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2898lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.facebook.share.internal.ShareConstants;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3267lr {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lr$ri */
    private static class ri {

        /* JADX INFO: renamed from: lr */
        public int f11059lr;

        /* JADX INFO: renamed from: ri */
        public String f11060ri;

        public ri(String str, int i) {
            this.f11060ri = str;
            this.f11059lr = i;
        }
    }

    /* JADX INFO: renamed from: di */
    private static com.bytedance.sdk.openadsdk.core.model.ihz m13886di(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.ihz ihzVar = new com.bytedance.sdk.openadsdk.core.model.ihz();
        if (jSONObject == null) {
            ihzVar.m14170ri(10L);
            ihzVar.m14168lr(20L);
            ihzVar.m14164ik(10L);
            ihzVar.m14166ka(20L);
            ihzVar.m14171ri("");
            return ihzVar;
        }
        ihzVar.m14170ri(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        ihzVar.m14168lr(jSONObject.optLong("straight_lp_showtime", 20L));
        ihzVar.m14164ik(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        ihzVar.m14166ka(jSONObject.optLong("straight_agg_showtime", 20L));
        ihzVar.m14171ri(jSONObject.optString("loading_text", ""));
        return ihzVar;
    }

    /* JADX INFO: renamed from: fi */
    private static C3278di m13887fi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3278di c3278di = new C3278di();
        c3278di.m14075lr(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        c3278di.m14070ik(jSONObject.optString("package_name"));
        c3278di.m14080ri(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        c3278di.m14078ri(jSONObject.optDouble("score", -1.0d));
        c3278di.m14079ri(jSONObject.optInt("comment_num", -1));
        c3278di.m14074lr(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        c3278di.m14072ka(jSONObject.optString("app_category"));
        return c3278di;
    }

    /* JADX INFO: renamed from: ik */
    private static int m13888ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iM13897ri;
        String strM16444ik = C3571ig.m16444ik(wjvVar.m14404go());
        if (wjvVar.m14565yv() == 0) {
            iM13897ri = m13897ri(wjvVar.lau());
            if (iM13897ri != 200) {
                C3414ik.m15508ik(wjvVar, strM16444ik, iM13897ri);
                return iM13897ri;
            }
        } else {
            iM13897ri = 200;
        }
        int iAdz = wjvVar.adz();
        if (iAdz != 2 && iAdz != 3) {
            if (iAdz == 4) {
                int iM13898ri = m13898ri(wjvVar.tyz());
                if (iM13898ri != 200) {
                    C3414ik.m15508ik(wjvVar, strM16444ik, iM13898ri);
                }
                return iM13898ri;
            }
            if (iAdz != 8) {
                return iM13897ri;
            }
        }
        if (!m13891ka(wjvVar) || !TextUtils.isEmpty(wjvVar.smj())) {
            return iM13897ri;
        }
        C3414ik.m15508ik(wjvVar, strM16444ik, 406);
        return 406;
    }

    /* JADX INFO: renamed from: ik */
    private static com.bytedance.sdk.openadsdk.core.model.xha m13889ik(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j = jOptLong >= 0 ? jOptLong : 0L;
        int iOptInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.xha xhaVar = new com.bytedance.sdk.openadsdk.core.model.xha();
        xhaVar.m14612lr(iOptInt);
        xhaVar.m14610ik(iOptInt2);
        xhaVar.m14615ri(j);
        xhaVar.m14614ri(iOptInt3);
        return xhaVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.bgr jbs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.bgr bgrVar = new com.bytedance.sdk.openadsdk.core.model.bgr();
        bgrVar.m14023ri(jSONObject.optInt("if_send_click", 0));
        return bgrVar;
    }

    /* JADX INFO: renamed from: ka */
    private static FilterWord m13890ka(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    FilterWord filterWordM13890ka = m13890ka(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordM13890ka != null && filterWordM13890ka.isValid()) {
                        filterWord.addOption(filterWordM13890ka);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ka */
    private static boolean m13891ka(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return (wjvVar.m14576zz() || wjvVar.zyu()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX INFO: renamed from: lr */
    private static int m13892lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iM13897ri;
        String strM16444ik = C3571ig.m16444ik(wjvVar.m14404go());
        if (wjvVar.m14565yv() == 0) {
            iM13897ri = m13897ri(wjvVar.lau());
            C3414ik.m15508ik(wjvVar, strM16444ik, iM13897ri);
        } else {
            iM13897ri = 200;
        }
        int iAdz = wjvVar.adz();
        if (iAdz == 2 || iAdz == 3) {
            if (m13891ka(wjvVar) && TextUtils.isEmpty(wjvVar.smj())) {
                C3414ik.m15508ik(wjvVar, strM16444ik, 406);
                iM13897ri = 406;
            }
        } else if (iAdz == 4) {
            C3278di c3278diTyz = wjvVar.tyz();
            if (c3278diTyz == null) {
                C3414ik.m15508ik(wjvVar, strM16444ik, 407);
                iM13897ri = 407;
            } else if (TextUtils.isEmpty(c3278diTyz.m14069ik()) && TextUtils.isEmpty(c3278diTyz.m14077ri())) {
                C3414ik.m15508ik(wjvVar, strM16444ik, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                iM13897ri = 417;
            } else if (TextUtils.isEmpty(c3278diTyz.m14069ik())) {
                iM13897ri = 416;
                C3414ik.m15508ik(wjvVar, strM16444ik, 416);
            } else if (TextUtils.isEmpty(c3278diTyz.m14077ri())) {
                iM13897ri = 408;
                C3414ik.m15508ik(wjvVar, strM16444ik, 408);
            }
        } else if (iAdz == 8) {
            if (m13891ka(wjvVar)) {
                C3414ik.m15508ik(wjvVar, strM16444ik, 406);
                iM13897ri = 406;
            }
        }
        if (iM13897ri == 417 || iM13897ri == 407 || iM13897ri == 406) {
            return iM13897ri;
        }
        if (iM13897ri != 200) {
            C3414ik.m15519lr(wjvVar, strM16444ik, iM13897ri);
        }
        return 200;
    }

    /* JADX INFO: renamed from: lr */
    private static C3180ri m13893lr(JSONObject jSONObject) {
        C3180ri c3180ri = new C3180ri();
        c3180ri.m13275ri(jSONObject.optString("id"));
        c3180ri.m13273lr(jSONObject.optString("md5"));
        c3180ri.m13269ik(jSONObject.optString("url"));
        return c3180ri;
    }

    /* JADX INFO: renamed from: mj */
    private static C3285mj m13894mj(JSONObject jSONObject) {
        C3285mj c3285mj = new C3285mj();
        if (jSONObject == null) {
            c3285mj.m14204ik(0);
            c3285mj.m14206ka(0);
            c3285mj.m14209lr(new ArrayList());
            c3285mj.m14202fi(0);
            c3285mj.m14211ri(new ArrayList());
            c3285mj.m14208lr(0);
            c3285mj.m14210ri(0);
            return c3285mj;
        }
        c3285mj.m14204ik(jSONObject.optInt("interceptor_x", 0));
        c3285mj.m14206ka(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
            }
        }
        c3285mj.m14209lr(arrayList);
        c3285mj.m14202fi(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i2));
            }
        }
        c3285mj.m14211ri(arrayList2);
        c3285mj.m14208lr(jSONObject.optInt("boc_index", 0));
        c3285mj.m14210ri(jSONObject.optInt("is_act", 0));
        return c3285mj;
    }

    /* JADX INFO: renamed from: qt */
    private static C3274aw m13895qt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3274aw c3274aw = new C3274aw();
        c3274aw.m14018ri(jSONObject.optString("deeplink_url"));
        c3274aw.m14015lr(jSONObject.optString(MessengerShareContentUtility.FALLBACK_URL));
        c3274aw.m14017ri(jSONObject.optInt("fallback_type"));
        return c3274aw;
    }

    /* JADX INFO: renamed from: ri */
    private static int m13896ri(C1997lr c1997lr, boolean z) {
        if (c1997lr == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(c1997lr.m6364sf())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(c1997lr.m6357qt())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    /* JADX INFO: renamed from: ri */
    private static int m13897ri(C3274aw c3274aw) {
        if (c3274aw == null) {
            return 200;
        }
        if (TextUtils.isEmpty(c3274aw.m14016ri())) {
            return 403;
        }
        if (TextUtils.isEmpty(c3274aw.m14014lr())) {
            return 404;
        }
        return (c3274aw.m14012ik() == 1 || c3274aw.m14012ik() == 2) ? 200 : 405;
    }

    /* JADX INFO: renamed from: ri */
    private static int m13898ri(C3278di c3278di) {
        if (c3278di == null) {
            return 407;
        }
        if (TextUtils.isEmpty(c3278di.m14077ri())) {
            return 408;
        }
        return TextUtils.isEmpty(c3278di.m14069ik()) ? 416 : 200;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX INFO: renamed from: ri */
    private static int m13899ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iM13900ri;
        int iM13896ri;
        if (wjvVar == null) {
            C3414ik.m15508ik((com.bytedance.sdk.openadsdk.core.model.wjv) null, "", 401);
            return 401;
        }
        String strM16444ik = C3571ig.m16444ik(wjvVar.m14404go());
        if (TextUtils.isEmpty(wjvVar.m14533tn()) || wjvVar.m14533tn().length() <= 1) {
            C3414ik.m15508ik(wjvVar, strM16444ik, 402);
            return 402;
        }
        if (wjvVar.zyu()) {
            if (wjvVar.m14404go() < 0) {
                if (wjvVar.m14388eb() != null) {
                    wjvVar.m14388eb().getDurationSlotType();
                } else {
                    wjvVar.lji();
                }
            }
            if (wjvVar.vgs()) {
                strM16444ik = "fullscreen_interstitial_ad";
            }
            if (TextUtils.isEmpty(wjvVar.rko())) {
                C3414ik.m15522lr(wjvVar, strM16444ik, "load_html_fail", (JSONObject) null);
                return 401;
            }
            C3414ik.m15522lr(wjvVar, strM16444ik, "load_html_success", (JSONObject) null);
        }
        if (wjvVar.m14565yv() == 0) {
            int iM14552vz = wjvVar.m14552vz();
            if (iM14552vz == 2 || iM14552vz == 3 || iM14552vz == 4) {
                iM13900ri = m13900ri(wjvVar.rbz());
                if (iM13900ri != 200) {
                    C3414ik.m15508ik(wjvVar, strM16444ik, iM13900ri);
                    return iM13900ri;
                }
            } else if (iM14552vz == 5 || iM14552vz == 15) {
                iM13896ri = m13896ri(wjvVar.m14389eu(), wjvVar.m14576zz());
                if (iM13896ri != 200) {
                    C3414ik.m15508ik(wjvVar, strM16444ik, iM13896ri);
                    return iM13896ri;
                }
            } else if (iM14552vz == 16) {
                iM13900ri = m13900ri(wjvVar.rbz());
                if (iM13900ri != 200) {
                    C3414ik.m15508ik(wjvVar, strM16444ik, iM13900ri);
                    return iM13900ri;
                }
            } else if (iM14552vz == 50) {
                iM13896ri = m13896ri(wjvVar.m14389eu(), wjvVar.m14576zz());
                if (iM13896ri != 200) {
                    C3414ik.m15508ik(wjvVar, strM16444ik, iM13896ri);
                    return iM13896ri;
                }
            }
        }
        return C3322sf.m14819lr().wjv() ? m13888ik(wjvVar) : m13892lr(wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    private static int m13900ri(List<C3286nr> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (C3286nr c3286nr : list) {
            if (c3286nr == null) {
                return 411;
            }
            if (TextUtils.isEmpty(c3286nr.m14220ri())) {
                return 412;
            }
        }
        return 200;
    }

    /* JADX INFO: renamed from: ri */
    private static Pair<C3104ri, AbstractC3105lr.ri> m13901ri(String str, int i, int i2) {
        int iM16580ik;
        int iM16578fi;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2 == 1 || i2 == 5) {
            iM16580ik = 0;
            iM16578fi = 0;
        } else {
            iM16580ik = C3583qd.m16580ik(C3299nr.m14642ri());
            iM16578fi = C3583qd.m16578fi(C3299nr.m14642ri());
            if (i == 2) {
                iM16578fi = iM16580ik;
                iM16580ik = iM16578fi;
            }
        }
        C3107fi c3107fi = new C3107fi(C3299nr.m14642ri(), iM16580ik, iM16578fi);
        return new Pair<>(c3107fi.mo12555ri(str, (File) null, new ArrayList()), c3107fi.f9865di);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.util.Pair<com.bytedance.sdk.openadsdk.core.model.ri, java.util.ArrayList<java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.sdk.openadsdk.core.model.wjv] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ri */
    public static Pair<C3289ri, ArrayList<Integer>> m13902ri(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        ?? r17;
        ?? r9;
        ?? r18;
        ?? r2 = 0;
        r2 = 0;
        if (jSONObject == null) {
            return null;
        }
        try {
            C3289ri c3289ri = new C3289ri();
            c3289ri.m14264ri(jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID));
            c3289ri.m14260ri(jSONObject.optInt("ret"));
            c3289ri.m14254lr(jSONObject.optInt("multi_ad_style", 0));
            c3289ri.m14256lr(jSONObject.optString("message"));
            String strOptString = jSONObject.optString("gdid_encrypted");
            c3289ri.m14262ri(C3294uq.m14319ri(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (c3289ri.m14250ik() != 0) {
                return null;
            }
            c3289ri.m14261ri(C3281fr.m14121ri(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                jSONArrayOptJSONArray.length();
                int i = 0;
                ?? arrayList2 = c3289ri.m14257mj() ? new ArrayList() : null;
                while (i < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVarM13905ri = m13905ri(jSONArrayOptJSONArray.optJSONObject(i), adSlot, igqVar, c3289ri, i);
                    if (!c3289ri.m14257mj()) {
                        r9 = arrayList2;
                        r9 = r2;
                    }
                    r9 = arrayList2;
                    int iM13899ri = m13899ri(wjvVarM13905ri);
                    if (iM13899ri != 200) {
                        if (wjvVarM13905ri != null) {
                            C3414ik.m15519lr(wjvVarM13905ri, C3571ig.m16444ik(wjvVarM13905ri.m14404go()), iM13899ri);
                        } else {
                            C3414ik.m15519lr((com.bytedance.sdk.openadsdk.core.model.wjv) r2, "", iM13899ri);
                        }
                        arrayList.add(Integer.valueOf(iM13899ri));
                        if (r9 == 0 || wjvVarM13905ri == null) {
                            r18 = r2;
                        } else {
                            r17 = r2;
                            try {
                                r9.add(new ri(wjvVarM13905ri.m14392fe(), iM13899ri));
                                r18 = r17;
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        if (wjvVarM13905ri != null && (wjvVarM13905ri.m14453nd() == 39 || wjvVarM13905ri.m14453nd() == 41)) {
                            c3289ri.m14254lr(0);
                        }
                        jSONArrayOptJSONArray.remove(i);
                        i--;
                    } else {
                        r18 = r2;
                        wjvVarM13905ri.bgr(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            wjvVarM13905ri.jbs(strOptString);
                        }
                        c3289ri.m14263ri(wjvVarM13905ri);
                    }
                    i++;
                    r2 = r18;
                    arrayList2 = r9;
                }
                r17 = r2;
                List<com.bytedance.sdk.openadsdk.core.model.wjv> listM14252ka = c3289ri.m14252ka();
                m13909ri(listM14252ka, c3289ri);
                if (listM14252ka != null) {
                    if (c3289ri.m14257mj() && listM14252ka.size() == 1) {
                        c3289ri.m14254lr(0);
                        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = listM14252ka.get(0);
                        if (wjvVar != null) {
                            wjvVar.m14522sf(false);
                        }
                    }
                    int size = listM14252ka.size();
                    jSONObject.put("creatives", jSONArrayOptJSONArray);
                    for (int i2 = 0; i2 < size; i2++) {
                        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = listM14252ka.get(i2);
                        if (wjvVar2 != null) {
                            if (i2 > 0) {
                                wjvVar2.m14574zp();
                            }
                            wjvVar2.m14557xd(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != 0 && !arrayList2.isEmpty()) {
                    m13908ri((ArrayList<ri>) arrayList2);
                }
            } else {
                r17 = 0;
            }
            return new Pair<>(c3289ri, arrayList);
        } catch (Throwable th2) {
            th = th2;
            r17 = r2;
        }
        C2707ac.m10196ik("TTAD.AdInfoFactory", th.getMessage());
        return r17;
    }

    /* JADX INFO: renamed from: ri */
    private static C1997lr m13903ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        C1997lr c1997lr = new C1997lr();
        c1997lr.m6352lr(jSONObject.optInt("cover_height"));
        c1997lr.m6346ik(jSONObject.optInt("cover_width"));
        c1997lr.m6363ri(jSONObject.optString("resolution"));
        c1997lr.m6362ri(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        c1997lr.m6360ri(dOptDouble);
        int i = 1;
        int iOptInt = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && wjvVar.ajz() != 1 && com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar)) {
            i = iOptInt;
        }
        c1997lr.m6358qt(i);
        c1997lr.m6353lr(jSONObject.optString("cover_url"));
        c1997lr.m6347ik(jSONObject.optString("video_url"));
        c1997lr.m6350ka(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        c1997lr.m6344fi(jSONObject.optString("playable_download_url"));
        c1997lr.m6341di(jSONObject.optString("file_hash"));
        c1997lr.m6355mj(jSONObject.optInt("if_playable_loading_show", 0));
        c1997lr.jbs(jSONObject.optInt("remove_loading_page_type", 0));
        c1997lr.m6361ri(jSONObject.optInt("fallback_endcard_judge", 0));
        c1997lr.m6343fi(jSONObject.optInt("video_preload_size", 307200));
        c1997lr.m6340di(jSONObject.optInt("reward_video_cached_type", 0));
        c1997lr.xha(jSONObject.optInt("execute_cached_type", 0));
        c1997lr.m6349ka(z ? jSONObject.optInt("endcard_render", 0) : jSONObject.optInt("endcard_render", -1));
        return c1997lr;
    }

    /* JADX INFO: renamed from: ri */
    public static AdSlot m13904ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        String strOptString3 = jSONObject.optString("mMediaExtra", "");
        String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    /* JADX WARN: Code duplicated, block: B:179:0x06d2 A[PHI: r0
  0x06d2: PHI (r0v88 int) = (r0v87 int), (r0v137 int) binds: [B:172:0x06be, B:177:0x06cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ri */
    public static com.bytedance.sdk.openadsdk.core.model.wjv m13905ri(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, C3289ri c3289ri, int i) {
        C1997lr c1997lrM13903ri;
        C1997lr c1997lrM13903ri2;
        int i2;
        String str;
        C3104ri c3104ri;
        AbstractC3105lr.ri riVar;
        C3104ri c3104riM12530ri;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = new com.bytedance.sdk.openadsdk.core.model.wjv();
        if (c3289ri != null) {
            wjvVar.m14509ri(c3289ri);
            if (c3289ri.m14257mj()) {
                int iOptInt = jSONObject.optInt("interaction_method");
                if (iOptInt == 30 || iOptInt == 39 || iOptInt == 40 || iOptInt == 41 || iOptInt == 43 || iOptInt == 44) {
                    wjvVar.m14522sf(true);
                } else {
                    c3289ri.m14254lr(0);
                    wjvVar.m14522sf(false);
                }
            }
        }
        wjvVar.m14487ri(i);
        m13910ri(jSONObject, wjvVar);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (jSONObjectOptJSONObject4 != null) {
            wjvVar.m14511ri(C3293su.m14295ri(jSONObjectOptJSONObject4));
        }
        if (jSONObject.has("raw_response_info")) {
            wjvVar.m14557xd(jSONObject.optString("raw_response_info"));
        }
        wjvVar.bgr(jSONObject.optInt("proportion_watching", -1));
        wjvVar.m14371bu(jSONObject.optBoolean("mate_disable_cache", false));
        wjvVar.ory(jSONObject.optInt("interaction_type"));
        wjvVar.m14386dw(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.wjv.f11391ik, 0));
        wjvVar.hcw(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.wjv.f11393lr, 0));
        wjvVar.m14463oh(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.wjv.f11392ka, 0));
        wjvVar.m14460nr(jSONObject.optString("target_url"));
        wjvVar.wjv(jSONObject.optString("ad_id"));
        wjvVar.m14366ay(jSONObject.optString("app_log_url"));
        wjvVar.m14403fr(jSONObject.optString("settings_url"));
        wjvVar.slm(jSONObject.optString("source"));
        wjvVar.m14370bu(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        wjvVar.m14412ig(jSONObject.optInt("dislike_control", 0));
        wjvVar.m14365ay(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        wjvVar.igq(jSONObject.optString("gecko_id"));
        wjvVar.m14438lr(jSONObject.optInt("lp_cache_count", 0));
        if (jSONObject.has("set_click_type")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("set_click_type");
            wjvVar.m14437lr(jSONObjectOptJSONObject5.optDouble("cta", 2.0d));
            wjvVar.m14485ri(jSONObjectOptJSONObject5.optDouble("other", 1.0d));
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(ShareConstants.MEDIA_EXTENSION);
        wjvVar.m14381di(jSONObjectOptJSONObject6);
        if (jSONObjectOptJSONObject6 != null) {
            wjvVar.m14500ri(new C3276bu(jSONObjectOptJSONObject6));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("icon");
        wjvVar.m14376co(jSONObject.optBoolean("screenshot", false));
        wjvVar.m14543uq(jSONObject.optInt("play_bar_style", 0));
        wjvVar.m14570zf(jSONObject.optString("market_url", ""));
        wjvVar.m14354ac(jSONObject.optInt("video_adaptation", 0));
        wjvVar.m14369bu(jSONObject.optInt("feed_video_opentype", 0));
        wjvVar.m14419ik(jSONObject.optJSONObject("session_params"));
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        wjvVar.m14431ka(jSONObjectOptJSONObject8);
        if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject8.optJSONObject("speed_config")) != null) {
            com.bytedance.sdk.openadsdk.core.model.ory oryVar = new com.bytedance.sdk.openadsdk.core.model.ory();
            oryVar.m14240ri((float) jSONObjectOptJSONObject3.optDouble("speed", 1.0d));
            oryVar.m14241ri(jSONObjectOptJSONObject3.optInt("type", 0));
            wjvVar.m14508ri(oryVar);
        }
        wjvVar.bgr(jSONObject.optString("auction_price", ""));
        wjvVar.zyn(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            wjvVar.m14359ar();
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject9 != null) {
            wjvVar.m14459nr(jSONObjectOptJSONObject9.optInt("render_sequence", 0));
            wjvVar.tan(jSONObjectOptJSONObject9.optInt("backup_render_control", 1));
            wjvVar.tnn(jSONObjectOptJSONObject9.optInt("reserve_time", 100));
            wjvVar.m14393fe(jSONObjectOptJSONObject9.optInt("render_thread", 0));
        }
        wjvVar.m14547vr(jSONObject.optInt("render_control", igqVar != null ? igqVar.jbs : 1));
        if (jSONObjectOptJSONObject7 != null) {
            C3286nr c3286nr = new C3286nr();
            c3286nr.m14222ri(jSONObjectOptJSONObject7.optString("url"));
            c3286nr.m14218lr(jSONObjectOptJSONObject7.optInt("height"));
            c3286nr.m14221ri(jSONObjectOptJSONObject7.optInt("width"));
            wjvVar.m14506ri(c3286nr);
        }
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject10 != null) {
            wjvVar.m14362aw(jSONObjectOptJSONObject10.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            wjvVar.m14375co(jSONObjectOptJSONObject10.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject11 != null) {
            C3286nr c3286nr2 = new C3286nr();
            c3286nr2.m14222ri(jSONObjectOptJSONObject11.optString("url"));
            c3286nr2.m14218lr(jSONObjectOptJSONObject11.optInt("height"));
            c3286nr2.m14221ri(jSONObjectOptJSONObject11.optInt("width"));
            wjvVar.m14442lr(c3286nr2);
        }
        if (jSONObject.has("banner") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("banner")) != null) {
            wjvVar.m14493ri(new PAGBannerSize(jSONObjectOptJSONObject2.optInt("width", 0), jSONObjectOptJSONObject2.optInt("height", 0)));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
        if (jSONArrayOptJSONArray != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                C3286nr c3286nr3 = new C3286nr();
                JSONObject jSONObjectOptJSONObject12 = jSONArrayOptJSONArray.optJSONObject(i3);
                c3286nr3.m14222ri(jSONObjectOptJSONObject12.optString("url"));
                c3286nr3.m14218lr(jSONObjectOptJSONObject12.optInt("height"));
                c3286nr3.m14221ri(jSONObjectOptJSONObject12.optInt("width"));
                c3286nr3.m14223ri(jSONObjectOptJSONObject12.optBoolean("image_preview"));
                c3286nr3.m14219lr(jSONObjectOptJSONObject12.optString("image_key"));
                wjvVar.m14418ik(c3286nr3);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                wjvVar.amj().add(jSONArrayOptJSONArray2.optString(i4));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(CampaignEx.JSON_KEY_CLICK_URL);
        if (jSONArrayOptJSONArray3 != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                wjvVar.bfa().add(jSONArrayOptJSONArray3.optString(i5));
            }
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("play_start");
        if (jSONArrayOptJSONArray4 != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray4.length(); i6++) {
                wjvVar.m14400fn().add(jSONArrayOptJSONArray4.optString(i6));
            }
        }
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("click_area");
        if (jSONObjectOptJSONObject13 != null) {
            C3290sf c3290sf = new C3290sf();
            c3290sf.f11344ri = jSONObjectOptJSONObject13.optBoolean("click_upper_content_area", true);
            c3290sf.f11343lr = jSONObjectOptJSONObject13.optBoolean("click_upper_non_content_area", true);
            c3290sf.f11341ik = jSONObjectOptJSONObject13.optBoolean("click_lower_content_area", true);
            c3290sf.f11342ka = jSONObjectOptJSONObject13.optBoolean("click_lower_non_content_area", true);
            c3290sf.f11340fi = jSONObjectOptJSONObject13.optBoolean("click_button_area", true);
            c3290sf.f11339di = jSONObjectOptJSONObject13.optBoolean("click_video_area", true);
            wjvVar.m14510ri(c3290sf);
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject14 != null) {
            wjvVar.m14491ri(m13904ri(jSONObjectOptJSONObject14));
        } else {
            wjvVar.m14491ri(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey(PangleRequestHelper.ADMOB_WATERMARK_KEY)) {
                wjvVar.m14481qt(String.valueOf(requestExtraMap.get(PangleRequestHelper.ADMOB_WATERMARK_KEY)));
            }
        } else {
            wjvVar.m14481qt(jSONObject.optString("identificationOverlayContent"));
        }
        wjvVar.wjv(jSONObject.optInt("intercept_flag", 0));
        wjvVar.tan(jSONObject.optString("phone_num"));
        wjvVar.m14355ac(jSONObject.optString("title"));
        wjvVar.ihz(jSONObject.optString("description"));
        wjvVar.m14544uq(jSONObject.optString("button_text"));
        wjvVar.ihz(jSONObject.optInt("ad_logo", 1));
        wjvVar.m14528su(jSONObject.optString("ext"));
        wjvVar.igq(jSONObject.optInt("cover_click_area", 0));
        wjvVar.m14556xd(jSONObject.optInt("image_mode"));
        wjvVar.m14470pv(jSONObject.optInt("orientation", 1));
        wjvVar.m14486ri((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        wjvVar.igq(jSONObject.optInt("cover_click_area", 0));
        JSONObject jSONObjectOptJSONObject15 = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        JSONObject jSONObjectOptJSONObject16 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        JSONObject jSONObjectOptJSONObject17 = jSONObject.optJSONObject("oem");
        wjvVar.m14378di(jSONObject.optInt("is_web_jump_ip", 0));
        wjvVar.m14516ri(C3298zf.m14616ri(jSONObjectOptJSONObject17));
        wjvVar.m14501ri(m13887fi(jSONObjectOptJSONObject15));
        JSONObject jSONObjectOptJSONObject18 = jSONObject.optJSONObject("interaction_method_params");
        wjvVar.m14505ri(m13894mj(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        wjvVar.m14504ri(m13886di(jSONObjectOptJSONObject18));
        wjvVar.m14512ri(xha(jSONObjectOptJSONObject18));
        wjvVar.m14497ri(m13895qt(jSONObjectOptJSONObject16));
        wjvVar.m14502ri(new C3279dw(jSONObject));
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray5 != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray5.length(); i7++) {
                FilterWord filterWordM13890ka = m13890ka(jSONArrayOptJSONArray5.optJSONObject(i7));
                if (filterWordM13890ka != null && filterWordM13890ka.isValid()) {
                    wjvVar.m14492ri(filterWordM13890ka);
                }
            }
        }
        wjvVar.dzy(jSONObject.optInt("count_down"));
        wjvVar.m14416ik(jSONObject.optLong("expiration_time"));
        wjvVar.siy(jSONObject.optInt("video_encode_type", 0));
        wjvVar.bnj(0);
        JSONObject jSONObjectOptJSONObject19 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject19 != null) {
            c1997lrM13903ri = m13903ri(jSONObjectOptJSONObject19, wjvVar, true);
            wjvVar.m14440lr(c1997lrM13903ri);
            wjvVar.m14447mj(jSONObjectOptJSONObject19.optInt("multi_played_percent", 50));
        } else {
            c1997lrM13903ri = null;
        }
        JSONObject jSONObjectOptJSONObject20 = jSONObject.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject20 != null) {
            c1997lrM13903ri2 = m13903ri(jSONObjectOptJSONObject20, wjvVar, false);
            wjvVar.m14417ik(c1997lrM13903ri2);
        } else {
            c1997lrM13903ri2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || wjvVar.m14523sh() == 0) {
            wjvVar.m14490ri(c1997lrM13903ri);
            wjvVar.siy(0);
        } else {
            if (c1997lrM13903ri2 != null && c1997lrM13903ri != null) {
                if (TextUtils.isEmpty(c1997lrM13903ri2.m6338co())) {
                    c1997lrM13903ri2.m6350ka(c1997lrM13903ri.m6338co());
                }
                if (TextUtils.isEmpty(c1997lrM13903ri2.m6336aw())) {
                    c1997lrM13903ri2.m6344fi(c1997lrM13903ri.m6336aw());
                }
                if (c1997lrM13903ri2.m6348ka() == -1) {
                    c1997lrM13903ri2.m6349ka(c1997lrM13903ri.m6348ka());
                }
            }
            if (c1997lrM13903ri2 != null) {
                wjvVar.m14490ri(c1997lrM13903ri2);
            } else {
                wjvVar.m14490ri(c1997lrM13903ri);
            }
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject21 != null) {
            wjvVar.m14499ri(jbs(jSONObjectOptJSONObject21));
        }
        wjvVar.m14517ri(m13912sf(jSONObject.optJSONObject("media_ext")));
        JSONObject jSONObjectOptJSONObject22 = jSONObject.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject22 != null) {
            com.bytedance.sdk.openadsdk.core.model.wjv.C3296ri c3296ri = new com.bytedance.sdk.openadsdk.core.model.wjv.C3296ri();
            c3296ri.m14588ik(jSONObjectOptJSONObject22.optString("id"));
            c3296ri.m14590ka(jSONObjectOptJSONObject22.optString("md5"));
            c3296ri.m14586fi(jSONObjectOptJSONObject22.optString("url"));
            c3296ri.m14584di(jSONObjectOptJSONObject22.optString("data"));
            c3296ri.xha(jSONObjectOptJSONObject22.optString("diff_data"));
            String strOptString = jSONObjectOptJSONObject22.optString("dynamic_creative");
            c3296ri.m14594mj(strOptString);
            c3296ri.m14592lr(jSONObjectOptJSONObject22.optString("version"));
            c3296ri.jbs(jSONObjectOptJSONObject22.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject2 = new JSONObject(strOptString);
                JSONArray jSONArrayOptJSONArray6 = jSONObject2.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray6.length(); i8++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray6.optInt(i8)));
                    }
                }
                String strOptString2 = jSONObject2.optString("music_url");
                c3296ri.m14599ri(arrayList);
                c3296ri.m14598ri(strOptString2);
            } catch (JSONException e) {
                C2707ac.m10196ik("TTAD.AdInfoFactory", e.getMessage());
            }
            c3296ri.m14596qt(jSONObjectOptJSONObject22.optString("engine_version"));
            c3296ri.m14601sf(jSONObjectOptJSONObject22.optString("ugen_url"));
            c3296ri.m14581co(jSONObjectOptJSONObject22.optString("ugen_md5"));
            c3296ri.m14580aw(jSONObjectOptJSONObject22.optString("ugen_data"));
            wjvVar.m14514ri(c3296ri);
        }
        JSONObject jSONObjectOptJSONObject23 = jSONObject.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject23 != null) {
            wjvVar.m14507ri(C3287oh.m14224ri(jSONObjectOptJSONObject23));
        }
        JSONObject jSONObjectOptJSONObject24 = jSONObject.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject24 != null) {
            wjvVar.m14443lr(jSONObjectOptJSONObject24);
        }
        wjvVar.m14548vr(jSONObject.optString("creative_extra"));
        wjvVar.slm(jSONObject.optInt("if_block_lp", 0));
        wjvVar.m14402fr(jSONObject.optInt("cache_sort", 1));
        wjvVar.m14527su(jSONObject.optInt("if_sp_cache", 0));
        JSONObject jSONObjectOptJSONObject25 = jSONObject.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject25 != null) {
            wjvVar.m14515ri(m13889ik(jSONObjectOptJSONObject25));
        }
        wjvVar.m14475qd(jSONObject.optInt("is_package_open", 1));
        wjvVar.m14363aw(jSONObject.optString("ad_info", null));
        wjvVar.m14569zf(jSONObject.optInt("ua_policy", 2));
        wjvVar.srn(jSONObject.optInt("playable_duration_time", 30));
        wjvVar.m14422jc(jSONObject.optInt("playable_close_time", -1));
        wjvVar.m14435kt(jSONObject.optInt("playable_endcard_close_time", -1));
        wjvVar.feb(jSONObject.optInt("endcard_close_time", -1));
        wjvVar.m14480qt(jSONObject.optInt("interaction_method"));
        wjvVar.m14520sf(jSONObject.optInt("top_area_leave_blank", 0));
        wjvVar.rzk(jSONObject.optInt("lp_click_type", -1));
        wjvVar.m14396fi(jSONObject.optInt("lp_click_interval", -1));
        wjvVar.m14387dw(jSONObject.optString("dsp_html"));
        wjvVar.jbs(jSONObject.optInt("image_stay", 0));
        int iOptInt2 = jSONObject.optInt("dsp_material_type", 0);
        if (iOptInt2 < 0 || iOptInt2 > 3) {
            iOptInt2 = 0;
        }
        if (iOptInt2 == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                iOptInt2 = 1;
            }
            i2 = jSONObject.optBoolean("is_html", false) ? 2 : iOptInt2;
        }
        wjvVar.m14561xm(i2);
        if (i2 == 1 || i2 == 3) {
            int iM14404go = wjvVar.m14404go();
            if (iM14404go < 0) {
                iM14404go = wjvVar.m14388eb() != null ? wjvVar.m14388eb().getDurationSlotType() : wjvVar.lji();
            }
            String strM16444ik = C3571ig.m16444ik(iM14404go);
            if (jSONObject.has("vast_json")) {
                c3104riM12530ri = C3104ri.m12530ri(jSONObject.optJSONObject("vast_json"));
                str = "";
            } else {
                String strOptString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(strOptString3)) {
                    m13907ri(wjvVar, strM16444ik);
                    return null;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Pair<C3104ri, AbstractC3105lr.ri> pairM13901ri = m13901ri(strOptString3, wjvVar.bbu(), iM14404go);
                if (pairM13901ri != null) {
                    c3104ri = (C3104ri) pairM13901ri.first;
                    str = "";
                    riVar = (AbstractC3105lr.ri) pairM13901ri.second;
                } else {
                    str = "";
                    c3104ri = null;
                    riVar = null;
                }
                C3094ka.m12441lr(wjvVar, strM16444ik, c3104ri, jElapsedRealtime, riVar);
                c3104riM12530ri = c3104ri;
            }
            if (c3104riM12530ri == null) {
                return null;
            }
            m13906ri(c3104riM12530ri, wjvVar);
        } else {
            str = "";
        }
        wjvVar.ory(jSONObject.optString("deep_link_appname", str));
        wjvVar.whw(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject jSONObjectOptJSONObject26 = jSONObject.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject26 != null) {
            wjvVar.m14513ri(new C3295vr(jSONObjectOptJSONObject26));
        }
        JSONObject jSONObjectOptJSONObject27 = jSONObject.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject27 != null) {
            wjvVar.xha(jSONObjectOptJSONObject27.optString("adchoices_icon", str));
            wjvVar.m14448mj(jSONObjectOptJSONObject27.optString("adchoices_url", str));
        }
        String strOptString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(strOptString4)) {
            wjvVar.jbs(strOptString4);
        }
        wjvVar.whw();
        JSONObject jSONObjectOptJSONObject28 = jSONObject.optJSONObject("ugen");
        if (jSONObjectOptJSONObject28 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject28.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) != null) {
            wjvVar.m14496ri(m13893lr(jSONObjectOptJSONObject));
            JSONObject jSONObjectOptJSONObject29 = jSONObjectOptJSONObject.optJSONObject("overlay");
            if (jSONObjectOptJSONObject29 != null) {
                wjvVar.m14441lr(m13893lr(jSONObjectOptJSONObject29));
            }
        }
        wjvVar.xha(jSONObject.optInt("preload_h5_type", 0));
        wjvVar.m14482qt(jSONObject.optBoolean("hasReportShow", false));
        wjvVar.m14521sf(jSONObject.optString("endcard_creative", str));
        wjvVar.xha(jSONObject.optJSONObject("ad_label"));
        JSONObject jSONObjectOptJSONObject30 = jSONObject.optJSONObject("ev");
        if (jSONObjectOptJSONObject30 != null) {
            wjvVar.m14461nr(jSONObjectOptJSONObject30.optBoolean(C12364a.f31324j, C2897ik.f8637ri));
            wjvVar.m14478qh(jSONObjectOptJSONObject30.optInt("wait_time", C2897ik.f8636lr));
            wjvVar.dzy(jSONObjectOptJSONObject30.optString("label", C2897ik.f8635ik));
            wjvVar.m14494ri(new C2898lr(wjvVar));
        }
        JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray("ad_tracks");
        if (jSONArrayOptJSONArray7 != null && jSONArrayOptJSONArray7.length() > 0) {
            C3280fi c3280fi = new C3280fi(jSONArrayOptJSONArray7);
            if (c3280fi.m14112ik()) {
                wjvVar.m14503ri(c3280fi);
            }
        }
        JSONObject jSONObjectOptJSONObject31 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject31 != null) {
            wjvVar.m14498ri(new C3275ay(jSONObjectOptJSONObject31));
        }
        JSONArray jSONArrayOptJSONArray8 = jSONObject.optJSONArray("app_log_url_backup");
        if (jSONArrayOptJSONArray8 != null && jSONArrayOptJSONArray8.length() > 0) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray8.length(); i9++) {
                String strOptString5 = jSONArrayOptJSONArray8.optString(i9);
                if (!TextUtils.isEmpty(strOptString5)) {
                    wjvVar.m14471pv(strOptString5);
                }
            }
        }
        return wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    private static void m13906ri(C3104ri c3104ri, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        c3104ri.m12551ri(wjvVar);
        if (!m13911ri(wjvVar.adz())) {
            wjvVar.ory(2);
        }
        wjvVar.m14547vr(1);
        wjvVar.m14495ri(c3104ri);
        if (!TextUtils.isEmpty(c3104ri.m12539ka())) {
            wjvVar.m14355ac(c3104ri.m12539ka());
        }
        if (!TextUtils.isEmpty(c3104ri.m12535fi())) {
            wjvVar.ihz(c3104ri.m12535fi());
        }
        wjvVar.m14460nr(c3104ri.m12533di());
        wjvVar.m14501ri((C3278di) null);
        C1997lr c1997lrM14389eu = wjvVar.m14389eu();
        if (c1997lrM14389eu == null) {
            c1997lrM14389eu = new C1997lr();
        }
        c1997lrM14389eu.m6347ik(c3104ri.xha());
        c1997lrM14389eu.m6360ri(c3104ri.m12544mj());
        c1997lrM14389eu.m6341di((String) null);
        c1997lrM14389eu.m6353lr((String) null);
        c1997lrM14389eu.m6350ka((String) null);
        wjvVar.m14490ri(c1997lrM14389eu);
        if (c3104ri.m12541lr() != null && !TextUtils.isEmpty(c3104ri.m12541lr().m12423ka())) {
            C3286nr c3286nr = new C3286nr();
            c3286nr.m14222ri(c3104ri.m12541lr().m12423ka());
            c3286nr.m14221ri(c3104ri.m12541lr().m12426ri());
            c3286nr.m14218lr(c3104ri.m12541lr().m12424lr());
            wjvVar.m14506ri(c3286nr);
            return;
        }
        if (wjvVar.m14391fb() == null) {
            C3286nr c3286nr2 = new C3286nr();
            c3286nr2.m14222ri("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            c3286nr2.m14221ri(98);
            c3286nr2.m14218lr(98);
            wjvVar.m14506ri(c3286nr2);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m13907ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            C3414ik.m15522lr(wjvVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m13908ri(final ArrayList<ri> arrayList) {
        C3521ka.m15952ri("multiple_ads_parsing_error", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.lr.1
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                for (ri riVar : arrayList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cid", riVar.f11060ri);
                    jSONObject2.put("error_msg", riVar.f11059lr);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return C3531ka.m15967lr().m15985ri("multiple_ads_parsing_error").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private static void m13909ri(List<com.bytedance.sdk.openadsdk.core.model.wjv> list, C3289ri c3289ri) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = list.get(0);
        if (!c3289ri.m14257mj() || wjvVar == null || !wjvVar.biu() || C3571ig.ory() == 0) {
            return;
        }
        c3289ri.m14254lr(0);
        wjvVar.m14522sf(false);
    }

    /* JADX INFO: renamed from: ri */
    private static void m13910ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("iv_skip_time", -1);
            int iOptInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (iOptInt != -1) {
                wjvVar.gcp(iOptInt);
            }
            if (iOptInt2 != -1) {
                wjvVar.m14538tw(iOptInt2);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m13911ri(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    /* JADX INFO: renamed from: sf */
    private static Map<String, Object> m13912sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    private static com.bytedance.sdk.openadsdk.core.model.tan xha(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tan tanVar = new com.bytedance.sdk.openadsdk.core.model.tan();
        if (jSONObject == null) {
            tanVar.m14311ka(5);
            tanVar.m14307fi(30);
            tanVar.m14305di(70);
            tanVar.xha(1);
            tanVar.m14315mj(com.bytedance.sdk.openadsdk.core.model.tan.f11374ri);
            tanVar.m14309ik(0);
            tanVar.m14313lr(0);
            tanVar.m14317ri(3);
            return tanVar;
        }
        tanVar.m14311ka(jSONObject.optInt("ceiling_time", 5));
        tanVar.m14307fi(jSONObject.optInt("ceiling_ratio", 30));
        tanVar.m14305di(jSONObject.optInt("expand_ratio", 70));
        tanVar.xha(jSONObject.optInt("back_type", 1));
        tanVar.m14315mj(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.tan.f11374ri));
        tanVar.m14309ik(jSONObject.optInt("pre_render_status", 0));
        tanVar.m14313lr(jSONObject.optInt("pre_render_use_gecko", 0));
        tanVar.m14317ri(jSONObject.optInt("pre_render_add_type", 3));
        return tanVar;
    }
}
