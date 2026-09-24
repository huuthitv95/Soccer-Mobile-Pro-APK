package com.mbridge.msdk.out.reveue;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.report.C13143e;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;

/* JADX INFO: loaded from: classes6.dex */
public class MBridgeRevenueManager {
    public static void track(Context context, MBridgeRevenueParamsEntity mBridgeRevenueParamsEntity) {
        if (C13008c.m36588n().m36542d() == null) {
            C13008c.m36588n().m36535b(context);
        }
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("name", mBridgeRevenueParamsEntity.getMediationName());
            C13154c c13154c = new C13154c();
            c13154c.m37423a("m_start_ad_rev", c13157e);
            C13156d.m37475b().m37484a("m_start_ad_rev", c13154c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C13143e.m37344c().m37351b(mBridgeRevenueParamsEntity.getReportData());
    }
}
