package com.mbridge.msdk.splash.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.report.a */
/* JADX INFO: compiled from: SplashReport.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13665a {
    /* JADX INFO: renamed from: a */
    public static void m40017a(int i, String str, String str2, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000068");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", C13211m0.m37770s(C13008c.m36588n().m36542d()));
                jSONObject.put("result", i);
                jSONObject.put("reason", str);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("SplashReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40018a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36901i() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36901i(), false, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m40019a(Context context, CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    C13080n c13080n = new C13080n();
                    c13080n.m36990n(campaignEx.getRequestId());
                    c13080n.m36992o(campaignEx.getRequestIdNotice());
                    c13080n.m36962b(campaignEx.getId());
                    c13080n.m36961b(campaignEx.isMraid() ? C13080n.f35733N : C13080n.f35734O);
                    C13145g.m37364d(c13080n, context.getApplicationContext(), str);
                }
            } catch (Exception e) {
                C13219q0.m37816b("SplashReport", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40020a(Context context, CampaignEx campaignEx, String str, String str2, long j, int i) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    C13080n c13080n = new C13080n();
                    c13080n.m36990n(campaignEx.getRequestId());
                    c13080n.m36992o(campaignEx.getRequestIdNotice());
                    c13080n.m36962b(campaignEx.getId());
                    c13080n.m36968d(i);
                    c13080n.m36972e(String.valueOf(System.currentTimeMillis() - j));
                    c13080n.m36976g("");
                    c13080n.m36988m(str2);
                    c13080n.m36959a("6");
                    c13080n.m36961b(C13080n.f35733N);
                    C13145g.m37362b(c13080n, str, campaignEx);
                }
            } catch (Exception e) {
                C13219q0.m37816b("SplashReport", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40021a(CampaignEx campaignEx, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000092");
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("network_type", String.valueOf(C13211m0.m37770s(C13008c.m36588n().m36542d())));
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b("SplashReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40022a(CampaignEx campaignEx, String str, int i) {
        try {
            m40025a(str, i, campaignEx);
        } catch (Exception e) {
            C13219q0.m37816b("SplashReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40023a(CampaignEx campaignEx, String str, int i, int i2, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("flb_size", i2);
                jSONObject.put("x", i);
                jSONObject.put("flb_type", i3);
            } catch (JSONException e) {
                C13219q0.m37816b("SplashReport", "e:" + e.getMessage());
            }
            C13148j.m37395b(C13008c.m36588n().m36542d(), campaignEx, str, jSONObject.toString());
        } catch (Exception e2) {
            C13219q0.m37816b("SplashReport", e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40024a(CampaignEx campaignEx, String str, String str2) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str2) || !campaignEx.isMraid()) {
                    return;
                }
                new C13146h(C13008c.m36588n().m36542d()).m37371a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, str2, campaignEx.isBidCampaign());
            } catch (Exception e) {
                C13219q0.m37816b("SplashReport", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40025a(String str, int i, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000069");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", C13211m0.m37770s(C13008c.m36588n().m36542d()));
                jSONObject.put("close_type", i);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("SplashReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40026a(String str, CampaignEx campaignEx) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        C13080n c13080n = new C13080n("2000061", campaignEx.getId(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), str, C13211m0.m37770s(C13008c.m36588n().m36542d()));
        c13080n.m36961b(C13080n.f35733N);
        C13145g.m37361b(c13080n, C13008c.m36588n().m36542d(), str);
    }

    /* JADX INFO: renamed from: a */
    public static void m40027a(String str, CampaignEx campaignEx, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put("key", "2000070");
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, str2);
            jSONObject.put("network_type", String.valueOf(C13211m0.m37770s(C13008c.m36588n().m36542d())));
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b("SplashReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40028a(String str, C13154c c13154c, CampaignEx campaignEx, Context context, InterfaceC13155a interfaceC13155a) {
        try {
            C13156d.m37475b().m37485a(str, c13154c, campaignEx, context, interfaceC13155a);
        } catch (Exception e) {
            C13219q0.m37816b("SplashReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m40029b(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000067");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                jSONObject.put("network_type", C13211m0.m37770s(C13008c.m36588n().m36542d()));
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("SplashReport", th.getMessage());
            }
        }
    }
}
