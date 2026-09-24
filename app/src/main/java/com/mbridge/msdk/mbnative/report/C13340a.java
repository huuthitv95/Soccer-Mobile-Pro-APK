package com.mbridge.msdk.mbnative.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.out.Campaign;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.report.a */
/* JADX INFO: compiled from: NativeReport.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13340a {
    /* JADX INFO: renamed from: a */
    public static void m38560a(Context context, CampaignEx campaignEx, String str) {
        Context context2;
        CampaignEx campaignEx2;
        String str2;
        if (campaignEx != null) {
            try {
                if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36909m() == null) {
                    return;
                }
                String[] strArrM36909m = campaignEx.getNativeVideoTracking().m36909m();
                int length = strArrM36909m.length;
                int i = 0;
                while (i < length) {
                    String str3 = strArrM36909m[i];
                    if (TextUtils.isEmpty(str3)) {
                        context2 = context;
                        campaignEx2 = campaignEx;
                        str2 = str;
                    } else {
                        context2 = context;
                        campaignEx2 = campaignEx;
                        str2 = str;
                        C12682a.m34605a(context2, campaignEx2, str2, str3, false, true);
                    }
                    i++;
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Exception e) {
                C13219q0.m37816b("NativeReport", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38562a(Context context, List<Campaign> list, String str) {
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
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
            if (C13229v0.m37916c(campaignEx)) {
                jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
            }
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b("NativeReport", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38561a(Context context, String str, String str2, boolean z, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000047");
                jSONObject.put("network_type", C13211m0.m37770s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put("st", System.currentTimeMillis());
                if (campaignEx != null) {
                    jSONObject.put("cid", campaignEx.getId());
                    jSONObject.put("adtp", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                }
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = AbstractC13003a.f35476r.get(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("u_stid", str3);
                }
                if (!TextUtils.isEmpty(C13088a.f35856V)) {
                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
                }
                if (!TextUtils.isEmpty(C13088a.f35865g)) {
                    jSONObject.put("c", C13088a.f35865g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
                jSONObject.put("reason", str);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("NativeReport", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38563a(String str, C13154c c13154c, CampaignEx campaignEx, Context context, InterfaceC13155a interfaceC13155a) {
        try {
            C13156d.m37475b().m37485a(str, c13154c, campaignEx, context, interfaceC13155a);
        } catch (Exception e) {
            C13219q0.m37816b("NativeReport", e.getMessage());
        }
    }
}
