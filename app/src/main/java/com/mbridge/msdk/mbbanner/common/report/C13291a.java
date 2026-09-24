package com.mbridge.msdk.mbbanner.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbsignalcommon.mraid.C13382c;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.report.a */
/* JADX INFO: compiled from: BannerReport.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13291a {
    /* JADX INFO: renamed from: a */
    public static void m38285a(CampaignEx campaignEx, String str, String str2) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                new C13146h(C13008c.m36588n().m36542d()).m37371a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, str2, campaignEx.isBidCampaign());
            } catch (Exception e) {
                C13219q0.m37816b("BannerReport", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m38292b(String str) {
        String md5 = SameMD5.getMD5(C13229v0.m37920d());
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length < 3) {
                    return "";
                }
                String str2 = strArrSplit[2];
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
            return md5;
        } catch (Exception e) {
            C13219q0.m37816b("BannerReport", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38284a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                String strM38701b = C13382c.m38701b(campaignEx.getId());
                if (TextUtils.isEmpty(strM38701b)) {
                    return;
                }
                new C13146h(C13008c.m36588n().m36542d()).m37372b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, strM38701b, campaignEx.isBidCampaign());
                C13382c.m38699a(campaignEx.getId());
            } catch (Throwable th) {
                C13219q0.m37816b("BannerReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38289a(String str, CampaignEx campaignEx, String str2) {
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
            C13219q0.m37816b("BannerReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38288a(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000067");
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put("cid", campaignEx.getId());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                HashMap<String, String> map = AbstractC13003a.f35476r;
                if (map != null) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("u_stid", str2);
                    }
                }
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("BannerReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38283a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36901i() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36901i(), false, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m38290a(String str, C13154c c13154c, CampaignEx campaignEx, Context context, InterfaceC13155a interfaceC13155a) {
        try {
            C13156d.m37475b().m37485a(str, c13154c, campaignEx, context, interfaceC13155a);
        } catch (Exception e) {
            C13219q0.m37816b("BannerReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C13154c m38282a(String str, String str2) {
        C13154c c13154c = new C13154c();
        try {
            LinkedHashMap<String, C13154c> linkedHashMapM37495c = C13156d.m37475b().m37495c();
            if (linkedHashMapM37495c != null && !linkedHashMapM37495c.isEmpty()) {
                Iterator<Map.Entry<String, C13154c>> it = linkedHashMapM37495c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, C13154c> next = it.next();
                    if (next != null && next.getValue().m37416E()) {
                        it.remove();
                    }
                }
            }
            c13154c = C13156d.m37475b().m37489b(str2);
            if (c13154c == null) {
                C13154c c13154c2 = new C13154c();
                try {
                    C13156d.m37475b().m37495c().put(str2, c13154c2);
                    c13154c2.m37436d(true);
                    c13154c = c13154c2;
                } catch (Exception e) {
                    e = e;
                    c13154c = c13154c2;
                    C13219q0.m37816b("BannerReport", e.getMessage());
                    return c13154c;
                }
            }
            c13154c.m37420a(296);
            c13154c.m37446i(str2);
            c13154c.m37456n(str);
            return c13154c;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38291a(String str, C13154c c13154c, C13157e c13157e) {
        try {
            m38286a(c13154c, c13157e);
            if (c13157e != null) {
                c13154c.m37423a(str, c13157e);
            }
            C13156d.m37475b().m37491b(str, c13154c, null);
        } catch (Exception e) {
            C13219q0.m37816b("BannerReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m38286a(C13154c c13154c, C13157e c13157e) {
        List<CampaignEx> listM37457o;
        try {
            String strM37413B = c13154c.m37413B();
            if (TextUtils.isEmpty(strM37413B) && (listM37457o = c13154c.m37457o()) != null && !listM37457o.isEmpty() && listM37457o.get(0) != null) {
                strM37413B = listM37457o.get(0).getCampaignUnitId();
                c13154c.m37420a(listM37457o.get(0).getAdType());
                c13154c.m37456n(strM37413B);
            }
            C13640l c13640lM39719d = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), strM37413B);
            if (c13640lM39719d != null) {
                if (c13157e == null) {
                    c13157e = new C13157e();
                }
                c13157e.m37501a("us_rid", c13640lM39719d.m39612I());
                HashMap<String, String> map = AbstractC13003a.f35476r;
                if (map != null) {
                    String str = map.get(strM37413B);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    c13157e.m37501a("u_stid", str);
                    return;
                }
                c13157e.m37501a("u_stid", c13640lM39719d.m39617a());
            }
        } catch (Exception e) {
            C13219q0.m37816b("BannerReport", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38287a(String str) {
        LinkedHashMap<String, C13154c> linkedHashMapM37495c;
        try {
            if (TextUtils.isEmpty(str) || (linkedHashMapM37495c = C13156d.m37475b().m37495c()) == null || linkedHashMapM37495c.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, C13154c>> it = linkedHashMapM37495c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, C13154c> next = it.next();
                if (next != null) {
                    C13154c value = next.getValue();
                    if (value.m37416E()) {
                        it.remove();
                    }
                    if (value.m37413B().equals(str)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BannerReport", th.getMessage());
        }
    }
}
