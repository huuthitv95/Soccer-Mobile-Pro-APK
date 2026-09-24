package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11341A5;
import com.ironsource.C11540L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.net.wrapper.C13127f;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.util.C13884b;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.j */
/* JADX INFO: compiled from: ReportUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13148j extends C13133b {

    /* JADX INFO: renamed from: b */
    public static final String f36122b = "j";

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.j$a */
    /* JADX INFO: compiled from: ReportUtil.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] list;
            try {
                String strM37149b = C13098e.m37149b(EnumC13096c.MBRIDGE_CRASH_INFO);
                if (TextUtils.isEmpty(strM37149b)) {
                    return;
                }
                File file = new File(strM37149b);
                if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                    for (String str : list) {
                        File file2 = new File(strM37149b + RemoteSettings.FORWARD_SLASH_STRING + str);
                        if (file2.exists()) {
                            String strM37805e = C13215o0.m37805e(file2);
                            if (!TextUtils.isEmpty(strM37805e)) {
                                String[] strArrSplit = strM37805e.split("====");
                                if (strArrSplit.length > 0) {
                                    C13156d.m37475b().m37488a(new JSONObject(strArrSplit[0]));
                                }
                            }
                            C13093d.m37128a(file2);
                        }
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37816b(C13148j.f36122b, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37393a() {
        try {
            return System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS > ((Long) C13235y0.m37956a(C13008c.m36588n().m36542d(), "privateAuthorityTimesTamp", 0L)).longValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37395b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            jSONObject.put("key", "2000054");
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("reason", "");
            jSONObject.put("result", 2);
            if (campaignEx.getAdType() == 287) {
                jSONObject.put("creative", campaignEx.getendcard_url());
                jSONObject.put("ad_type", 3);
            } else if (campaignEx.getAdType() == 94) {
                jSONObject.put("creative", campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            } else if (campaignEx.getAdType() == 296) {
                jSONObject.put("ad_type", 5);
                jSONObject.put("creative", campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 297) {
                jSONObject.put("ad_type", 6);
                jSONObject.put("creative", campaignEx.getCreativeId());
            } else if (campaignEx.getAdType() == 298) {
                jSONObject.put("ad_type", 7);
                jSONObject.put("creative", campaignEx.getCreativeId());
            } else {
                jSONObject.put("creative", campaignEx.getendcard_url());
                jSONObject.put("ad_type", 1);
            }
            jSONObject.put("devid", C13198g.m37689d());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
            }
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m37397c() {
        try {
            C13235y0.m37957b(C13008c.m36588n().m36542d(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m37376a(Campaign campaign, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put("action", str);
            jSONObject.put("label", i);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
                return jSONObject;
            }
            jSONObject.put("value", "");
            return jSONObject;
        } catch (Exception e) {
            C13219q0.m37816b(f36122b, e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C13126e m37374a(Context context) {
        String str = "1";
        C13126e c13126e = new C13126e();
        try {
            c13126e.m37245a(C11540L6.f24917H, "1");
            c13126e.m37245a("package_name", URLEncoder.encode(C13211m0.m37772t(context)));
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                c13126e.m37245a("os_version", Build.VERSION.RELEASE);
                c13126e.m37245a("brand", URLEncoder.encode(C13211m0.m37771t()));
                c13126e.m37245a(C11540L6.f24899B, URLEncoder.encode(C13211m0.m37762o()));
                if (C13884b.m41421a()) {
                    c13126e.m37245a(C11540L6.f24947V0, "");
                } else {
                    c13126e.m37245a(C11540L6.f24947V0, C13198g.m37689d());
                }
                c13126e.m37245a("mnc", C13211m0.m37768r(context));
                c13126e.m37245a("mcc", C13211m0.m37766q(context));
                int iM37770s = C13211m0.m37770s(context);
                c13126e.m37245a("network_type", iM37770s + "");
                c13126e.m37245a("network_str", C13211m0.m37732a(context, iM37770s));
                c13126e.m37245a("language", URLEncoder.encode(C13211m0.m37763p(context)));
                c13126e.m37245a("timezone", URLEncoder.encode(C13211m0.m37781y()));
                c13126e.m37245a(C11540L6.f24966d0, URLEncoder.encode(C13211m0.m37749i()));
                c13126e.m37245a("adid_limit", C13198g.m37679a() + "");
                if (!AbstractC13005b.m36563j()) {
                    str = "0";
                }
                c13126e.m37245a("adid_limit_dev", str);
            }
            c13126e.m37245a("sdk_version", MBConfiguration.SDK_VERSION);
            c13126e.m37245a("app_version_name", URLEncoder.encode(C13211m0.m37720C(context)));
            c13126e.m37245a("orientation", URLEncoder.encode(C13211m0.m37728G(context) + ""));
            c13126e.m37245a("screen_size", C13211m0.m37760n(context) + "x" + C13211m0.m37757m(context));
            if (C13884b.m41421a()) {
                C13127f.m37255f(c13126e);
            }
            C13149k.m37399a(c13126e, context);
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            if (c13635gM39718d != null) {
                JSONObject jSONObjectM37375a = m37375a(context, c13635gM39718d);
                if (!TextUtils.isEmpty(jSONObjectM37375a.toString())) {
                    String strM37713b = C13207k0.m37713b(jSONObjectM37375a.toString());
                    if (!TextUtils.isEmpty(strM37713b)) {
                        c13126e.m37245a("dvi", strM37713b);
                        return c13126e;
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return c13126e;
    }

    /* JADX INFO: renamed from: b */
    public static void m37394b() {
        try {
            C13167a.m37546e().execute(new a());
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m37375a(Context context, C13635g c13635g) throws Exception {
        return C13149k.m37398a(context, c13635g);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m37377a(String str, Map<String, Object> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37396b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000090");
            jSONObject.put("reason", TextUtils.isEmpty(str) ? "" : str);
            jSONObject.put("result", str);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b(f36122b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37384a(Context context, String str, String str2, int i, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000076");
                jSONObject.put("network_type", C13211m0.m37770s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put("reason", str3);
                jSONObject.put("result", i);
                jSONObject.put("url", str);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b(f36122b, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37383a(Context context, CampaignEx campaignEx, String str, String str2, int i, String str3, int i2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000073");
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("reason", str3);
            jSONObject.put("result", i);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i2 != -1) {
                jSONObject.put("d_t", i2);
            }
            jSONObject.put("url", str);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37382a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2, int i3) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000075");
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("type", i);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("status", i2);
            if (i3 != -1) {
                jSONObject.put("d_t", i3);
            }
            jSONObject.put("url", str);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37381a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000074");
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("type", i);
            jSONObject.put("adtp", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            if (i2 != -1) {
                jSONObject.put("d_t", i2);
            }
            jSONObject.put("url", str);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37385a(Context context, String str, String str2, boolean z, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000047");
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = AbstractC13003a.f35476r.get(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("u_stid", str3);
                }
                if (campaignEx != null) {
                    jSONObject.put("cid", campaignEx.getId());
                    jSONObject.put("adtp", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                }
                jSONObject.put("st", System.currentTimeMillis());
                jSONObject.put("network_type", C13211m0.m37770s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
                jSONObject.put("reason", str);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b(f36122b, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37387a(Context context, List<CampaignEx> list, String str, boolean z) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000048");
            jSONObject.put("st", System.currentTimeMillis());
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx2 = list.get(i);
                if (i < list.size() - 1) {
                    sb.append(campaignEx2.getRtinsType());
                    sb.append(",");
                } else {
                    sb.append(campaignEx2.getRtinsType());
                }
            }
            jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, sb.toString());
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37386a(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000104");
                if (!TextUtils.isEmpty(str2)) {
                    String str7 = AbstractC13003a.f35476r.get(str2);
                    if (str7 == null) {
                        str7 = "";
                    }
                    jSONObject.put("u_stid", str7);
                }
                jSONObject.put("network_type", C13211m0.m37770s(context));
                jSONObject.put("rid", str3);
                jSONObject.put("rid_n", str4);
                jSONObject.put("cid", str5);
                jSONObject.put("template_id", str6);
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
                jSONObject.put("reason", str);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b(f36122b, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37380a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", "2000054");
                    jSONObject.put("network_type", C13211m0.m37770s(context));
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    jSONObject.put("reason", str2);
                    jSONObject.put("result", 1);
                    jSONObject.put("devid", C13198g.m37689d());
                    if (campaignEx != null) {
                        jSONObject.put("cid", campaignEx.getId());
                        if (campaignEx.getAdType() == 287) {
                            jSONObject.put("creative", campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 3);
                        } else if (campaignEx.getAdType() == 94) {
                            jSONObject.put("creative", campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        } else if (campaignEx.getAdType() == 296) {
                            jSONObject.put("ad_type", 5);
                            jSONObject.put("creative", campaignEx.getCreativeId());
                        } else if (campaignEx.getAdType() == 297) {
                            jSONObject.put("ad_type", 6);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else if (campaignEx.getAdType() == 298) {
                            jSONObject.put("ad_type", 7);
                            jSONObject.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getCreativeId());
                            jSONObject.put(CampaignEx.JSON_KEY_AD_ZIP, campaignEx.getAdZip());
                        } else {
                            jSONObject.put("creative", campaignEx.getendcard_url());
                            jSONObject.put("ad_type", 1);
                        }
                        jSONObject.put("devid", C13198g.m37689d());
                        if (campaignEx.isBidCampaign()) {
                            jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
                        }
                        jSONObject.put("rid", campaignEx.getRequestId());
                        jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                        jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                    }
                    C13156d.m37475b().m37488a(jSONObject);
                }
            } catch (Throwable th) {
                C13219q0.m37816b(f36122b, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37389a(CampaignEx campaignEx, String str, int i, int i2, String str2, int i3, int i4, int i5, String str3) {
        C13154c c13154c;
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("key", URLEncoder.encode("2000094", C11341A5.f23802O));
            if (campaignEx != null) {
                c13157e.m37501a("rid", URLEncoder.encode(campaignEx.getRequestId(), C11341A5.f23802O));
                c13157e.m37501a("rid_n", URLEncoder.encode(campaignEx.getRequestIdNotice(), C11341A5.f23802O));
                c13157e.m37501a("cid", URLEncoder.encode(campaignEx.getId(), C11341A5.f23802O));
                c13154c = C13156d.m37475b().m37489b(campaignEx.getCurrentLocalRid());
            } else {
                c13154c = null;
            }
            c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str, C11341A5.f23802O));
            if (i == 0) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "0";
                }
                c13157e.m37501a("video_prg", str3 + "");
            } else {
                c13157e.m37501a("video_prg", i + "");
            }
            c13157e.m37501a(TypedValues.CycleType.S_WAVE_PHASE, i2 + "");
            c13157e.m37501a("feedback_content", URLEncoder.encode(str2, C11341A5.f23802O));
            c13157e.m37501a("feedback_close", i3 + "");
            c13157e.m37501a("type", i5 + "");
            c13157e.m37501a("ad_type", i4 + "");
            c13157e.m37501a("network_type", URLEncoder.encode(String.valueOf(C13211m0.m37770s(C13008c.m36588n().m36542d())), C11341A5.f23802O));
            if (c13154c == null) {
                c13154c = new C13154c();
            }
            c13154c.m37456n(str);
            c13154c.m37420a(i4);
            c13154c.m37423a("2000094", c13157e);
            C13156d.m37475b().m37484a("2000094", c13154c);
        } catch (Exception e) {
            C13219q0.m37816b(f36122b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37390a(String str) {
        try {
            if (C13008c.m36588n().m36542d() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000088");
            jSONObject.put("state", str);
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null || C13133b.m37277a(c13635gM39718d, jSONObject.toString())) {
                C13156d.m37475b().m37488a(jSONObject);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37379a(Context context, CampaignEx campaignEx, int i, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000114");
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(DomainCampaignEx.KEY_GH_ID, TextUtils.isEmpty(campaignEx.getGhId()) ? "" : campaignEx.getGhId());
            jSONObject.put(DomainCampaignEx.KEY_GH_PATH, TextUtils.isEmpty(campaignEx.getGhPath()) ? "" : campaignEx.getGhPath());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("result", i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("reason", str);
            jSONObject.put("cid", campaignEx.getId());
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37378a(int i, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000080");
            jSONObject.put("ad_type", i);
            jSONObject.put("url", str);
            jSONObject.put("reason", str2);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b(f36122b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37388a(CampaignEx campaignEx, String str, int i, int i2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000121");
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("type", i);
            jSONObject.put("result", i2);
            jSONObject.put("reason", str2);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b(f36122b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37391a(String str, int i, int i2, String str2, int i3, String str3) {
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("key", URLEncoder.encode("m_water_mark_result", C11341A5.f23802O));
            c13157e.m37501a("water_mark_result", i2 + "");
            c13157e.m37501a("water_mark_error_msg", URLEncoder.encode(str2, C11341A5.f23802O));
            c13157e.m37501a("render_result", i3 + "");
            c13157e.m37501a("water_mark_str", URLEncoder.encode(str3, C11341A5.f23802O));
            C13154c c13154c = new C13154c();
            c13154c.m37420a(i);
            c13154c.m37456n(str);
            c13154c.m37423a("m_water_mark_result", c13157e);
            C13156d.m37475b().m37484a("m_water_mark_result", c13154c);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37392a(boolean z, long j, String str) {
        try {
            C13157e c13157e = new C13157e();
            String str2 = "1";
            c13157e.m37501a("status", z ? "1" : "2");
            c13157e.m37501a("is_allow_crash", C13008c.m36588n().m36544e().m37828b() ? "1" : "2");
            if (!C13008c.m36588n().m36544e().m37827a()) {
                str2 = "2";
            }
            c13157e.m37501a("is_allow_anr", str2);
            c13157e.m37501a("executionTime", String.valueOf(j));
            if (!TextUtils.isEmpty(str)) {
                c13157e.m37501a("reason", str);
            }
            C13154c c13154c = new C13154c();
            c13154c.m37423a("m_init_sdk", c13157e);
            C13156d.m37475b().m37484a("m_init_sdk", c13154c);
        } catch (Throwable th) {
            C13219q0.m37816b(f36122b, th.getMessage());
        }
    }
}
