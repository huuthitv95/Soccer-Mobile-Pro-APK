package com.mbridge.msdk.click.utils;

import android.content.Context;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.click.utils.a */
/* JADX INFO: compiled from: DspFilterUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12704a {

    /* JADX INFO: renamed from: a */
    public static int f33792a = 1;

    /* JADX INFO: renamed from: b */
    public static int f33793b = 2;

    /* JADX INFO: renamed from: c */
    public static int f33794c = 3;

    /* JADX INFO: renamed from: d */
    public static int f33795d = 1500;

    /* JADX INFO: renamed from: a */
    public static boolean m34808a(CampaignEx campaignEx, String str, int i) {
        boolean z = false;
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            z = campaignEx.getFac() != 0;
            m34809b(campaignEx, str, i);
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private static void m34809b(CampaignEx campaignEx, String str, int i) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d == null || campaignEx == null) {
                return;
            }
            if (URLUtil.isFileUrl(str)) {
                File file = new File(str.replace("file:////", "").replace("file:///", "").replace(AdPayload.FILE_SCHEME, ""));
                if (file.exists()) {
                    str = C13215o0.m37805e(file);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000109");
            jSONObject.put("type", i);
            jSONObject.put("html", str);
            jSONObject.put("network_type", C13211m0.m37770s(contextM36542d));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("cid", campaignEx.getId());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put("op", i == 3 ? 2 : 1);
            jSONObject.put(CampaignEx.JSON_KEY_FAC, campaignEx.getFac());
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b("DspFilterUtils", th.getMessage());
        }
    }
}
