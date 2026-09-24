package com.mbridge.msdk.video.module.report;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13188c1;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.report.a */
/* JADX INFO: compiled from: RewardDynamicViewReporter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C14074a {
    /* JADX INFO: renamed from: a */
    public static void m42193a(String str, CampaignEx campaignEx, C13157e c13157e) {
        String strM37645a;
        String strM37645a2;
        if (TextUtils.isEmpty(str) || campaignEx == null || c13157e == null) {
            return;
        }
        try {
            String mof_template_url = campaignEx.getMof_template_url();
            String strM37645a3 = "";
            if (TextUtils.isEmpty(mof_template_url)) {
                strM37645a = "";
                strM37645a2 = strM37645a;
            } else {
                strM37645a2 = C13188c1.m37645a(mof_template_url, "cltp");
                strM37645a = C13188c1.m37645a(mof_template_url, "xt");
            }
            if (!TextUtils.isEmpty(strM37645a2)) {
                c13157e.m37501a("cltp", strM37645a2);
            }
            if (!TextUtils.isEmpty(strM37645a)) {
                c13157e.m37501a("xt", strM37645a);
            }
            CampaignEx.C13066c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                String strM36781j = rewardTemplateMode.m36781j();
                if (!TextUtils.isEmpty(strM36781j)) {
                    strM37645a3 = C13188c1.m37645a(strM36781j, "alecfc");
                }
            }
            if (!TextUtils.isEmpty(strM37645a3)) {
                c13157e.m37501a("alecfc", strM37645a3);
            }
            C13156d.m37475b().m37483a(str, campaignEx, c13157e);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
