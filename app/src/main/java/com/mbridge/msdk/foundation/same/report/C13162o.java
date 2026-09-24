package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.C11540L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.o */
/* JADX INFO: compiled from: VideoDataReport.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13162o {
    /* JADX INFO: renamed from: a */
    public static void m37518a(List<C13080n> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C13080n c13080n : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (c13080n.m37007w() != null) {
                    jSONObject.put("resource_type", c13080n.m37007w());
                }
                if (c13080n.m36970e() != null) {
                    jSONObject.put("creative", c13080n.m36970e());
                }
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("result", c13080n.m37008x());
                jSONObject.put("duration", c13080n.m36975g());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, c13080n.m36953D());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, c13080n.m36952C());
                jSONObject.put("reason", c13080n.m37001t());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put("video_url", c13080n.m36954E());
                jSONObject.put("rid", c13080n.m37003u());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("offer_url", c13080n.m36999s());
                if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", c13080n.m36995q());
                    jSONObject.put("network_str", c13080n.m36997r());
                }
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37520b(List<C13080n> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C13080n c13080n : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("result", c13080n.m37008x());
                jSONObject.put("duration", c13080n.m36975g());
                jSONObject.put(CampaignEx.ENDCARD_URL, c13080n.m36979i());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("reason", c13080n.m37001t());
                jSONObject.put("ad_type", c13080n.m36956a());
                jSONObject.put("rid", c13080n.m37003u());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put("type", c13080n.m36977h());
                jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, c13080n.m36960b());
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m37522c(List<C13080n> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                Iterator<C13080n> it = list.iterator();
                while (it.hasNext()) {
                    m37517a(it.next());
                }
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m37524d(List<C13080n> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                for (C13080n c13080n : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", c13080n.m36989n());
                    jSONObject.put("cid", c13080n.m36967d());
                    jSONObject.put("image_url", c13080n.m36985l());
                    jSONObject.put("reason", c13080n.m37001t());
                    jSONObject.put("rid", c13080n.m37003u());
                    jSONObject.put("rid_n", c13080n.m37005v());
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                    if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        jSONObject.put("network_type", c13080n.m36995q());
                    }
                    C13156d.m37475b().m37488a(jSONObject);
                }
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m37526e(List<C13080n> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                for (C13080n c13080n : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", c13080n.m36989n());
                    jSONObject.put("reason", c13080n.m37001t());
                    jSONObject.put("cid", c13080n.m36967d());
                    jSONObject.put("video_url", c13080n.m36954E());
                    jSONObject.put("rid", c13080n.m37003u());
                    jSONObject.put("rid_n", c13080n.m37005v());
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                    jSONObject.put("offer_url", c13080n.m36999s());
                    if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        jSONObject.put("network_type", c13080n.m36995q());
                        jSONObject.put("network_str", c13080n.m36997r());
                    }
                    C13156d.m37475b().m37488a(jSONObject);
                }
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m37528f(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("result", c13080n.m37008x());
                jSONObject.put("duration", c13080n.m36975g());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("reason", c13080n.m37001t());
                jSONObject.put("ad_type", c13080n.m36956a());
                jSONObject.put("rid", c13080n.m37003u());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put("network_type", c13080n.m36995q());
                jSONObject.put("mraid_type", c13080n.m36993p());
                jSONObject.put("devid", c13080n.m36973f());
                jSONObject.put("type", c13080n.m36977h());
                if (c13080n.m37007w() != null) {
                    jSONObject.put("resource_type", c13080n.m37007w());
                }
                if (!TextUtils.isEmpty(c13080n.m36979i())) {
                    jSONObject.put(CampaignEx.ENDCARD_URL, c13080n.m36979i());
                }
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m37529g(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("result", c13080n.m37008x());
                jSONObject.put("duration", c13080n.m36975g());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put("reason", c13080n.m37001t());
                jSONObject.put("ad_type", c13080n.m36956a());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("devid", c13080n.m36973f());
                jSONObject.put("mraid_type", c13080n.m36993p());
                jSONObject.put("network_type", c13080n.m36995q());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put("rid", c13080n.m37003u());
                if (!TextUtils.isEmpty(c13080n.m36979i())) {
                    jSONObject.put(CampaignEx.ENDCARD_URL, c13080n.m36979i());
                }
                if (!TextUtils.isEmpty(c13080n.m36977h())) {
                    jSONObject.put("type", c13080n.m36977h());
                }
                if (c13080n.m37007w() != null) {
                    jSONObject.put("resource_type", c13080n.m37007w());
                }
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m37530h(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("network_type", c13080n.m36995q());
                jSONObject.put("mraid_type", c13080n.m36993p());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put("rid", c13080n.m37003u());
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m37531i(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("error", C13229v0.m37884a(c13080n.m36981j()));
                jSONObject.put("template_url", C13229v0.m37884a(c13080n.m37010z()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, C13229v0.m37884a(c13080n.m36951B()));
                jSONObject.put("cid", C13229v0.m37884a(c13080n.m36967d()));
                if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", c13080n.m36997r());
                    jSONObject.put("network_type", c13080n.m36995q());
                }
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Exception e) {
                C13219q0.m37816b("VideoDataReport", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m37521c(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put("rid", c13080n.m37003u());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("network_type", c13080n.m36995q());
                jSONObject.put("mraid_type", c13080n.m36993p());
                jSONObject.put(C11540L6.f24917H, "1");
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m37523d(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put("rid", c13080n.m37003u());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("reason", c13080n.m37001t());
                jSONObject.put("case", c13080n.m36964c());
                jSONObject.put("network_type", c13080n.m36995q());
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37519b(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, C13229v0.m37884a(c13080n.m36983k()));
                jSONObject.put("template", C13229v0.m37884a(c13080n.m36950A()));
                jSONObject.put("layout", C13229v0.m37884a(c13080n.m36991o()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, C13229v0.m37884a(c13080n.m36951B()));
                jSONObject.put("cid", C13229v0.m37884a(c13080n.m36967d()));
                if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", c13080n.m36997r());
                    jSONObject.put("network_type", c13080n.m36995q());
                }
                return jSONObject.toString();
            } catch (Exception e) {
                C13219q0.m37816b("VideoDataReport", e.getMessage());
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public static void m37525e(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("network_type", c13080n.m36995q());
                jSONObject.put("rid", c13080n.m37003u());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put("reason", c13080n.m37001t());
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("VideoDataReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m37527f(List<C13080n> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            for (C13080n c13080n : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put("cid", c13080n.m36967d());
                jSONObject.put("template_url", c13080n.m37010z());
                jSONObject.put("reason", c13080n.m37001t());
                jSONObject.put("rid", c13080n.m37003u());
                jSONObject.put("rid_n", c13080n.m37005v());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, c13080n.m36951B());
                jSONObject.put("result", c13080n.m37008x());
                if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", c13080n.m36995q());
                }
                C13156d.m37475b().m37488a(jSONObject);
            }
            return null;
        } catch (Throwable th) {
            C13219q0.m37816b("VideoDataReport", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37517a(C13080n c13080n) {
        if (c13080n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", c13080n.m36989n());
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, C13229v0.m37884a(c13080n.m36983k()));
                jSONObject.put("template", C13229v0.m37884a(c13080n.m36950A()));
                jSONObject.put("layout", C13229v0.m37884a(c13080n.m36991o()));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, C13229v0.m37884a(c13080n.m36951B()));
                jSONObject.put("cid", C13229v0.m37884a(c13080n.m36967d()));
                if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_str", c13080n.m36997r());
                    jSONObject.put("network_type", c13080n.m36995q());
                }
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Exception e) {
                C13219q0.m37816b("VideoDataReport", e.getMessage());
            }
        }
    }
}
