package com.mbridge.msdk.reward.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.report.C13162o;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.report.a */
/* JADX INFO: compiled from: RewardReport.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13623a {
    /* JADX INFO: renamed from: a */
    public static void m39349a(Context context, CampaignEx campaignEx, String str) {
        int iM37125a;
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000048");
            jSONObject.put("st", System.currentTimeMillis());
            jSONObject.put("cid", campaignEx.getId());
            jSONObject.put("network_type", C13211m0.m37770s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (C13229v0.m37916c(campaignEx)) {
                jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
            }
            jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            if (campaignEx.getRewardTemplateMode() != null && (iM37125a = C13093d.m37125a(campaignEx, campaignEx.getRewardTemplateMode().m36781j())) != -1) {
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, iM37125a);
            }
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b("RewardReport", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m39350a(Context context, String str) {
        if (context != null) {
            try {
                C13026n c13026nM36744a = C13026n.m36744a(C13017g.m36693a(context));
                if (TextUtils.isEmpty(str) || c13026nM36744a == null || c13026nM36744a.m36747d() <= 0) {
                    return;
                }
                List<C13080n> listM36746a = c13026nM36744a.m36746a("m_download_end");
                List<C13080n> listM36746a2 = c13026nM36744a.m36746a("2000021");
                List<C13080n> listM36746a3 = c13026nM36744a.m36746a("2000039");
                List<C13080n> listM36746a4 = c13026nM36744a.m36746a("m_download_end");
                List<C13080n> listM36746a5 = c13026nM36744a.m36746a("m_download_end");
                List<C13080n> listM36746a6 = c13026nM36744a.m36746a("2000044");
                C13162o.m37526e(listM36746a2);
                C13162o.m37518a(listM36746a);
                C13162o.m37522c(listM36746a3);
                C13162o.m37520b(listM36746a4);
                C13162o.m37527f(listM36746a5);
                C13162o.m37524d(listM36746a6);
            } catch (Exception e) {
                C13219q0.m37816b("RewardReport", e.getMessage());
            }
        }
    }
}
