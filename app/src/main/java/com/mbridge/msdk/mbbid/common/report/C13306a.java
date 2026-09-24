package com.mbridge.msdk.mbbid.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbid.common.report.a */
/* JADX INFO: compiled from: BidReport.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13306a {
    /* JADX INFO: renamed from: a */
    public static void m38378a(Context context, String str, String str2, String str3, String str4) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("result", 1);
            c13157e.m37501a("bidid", str2);
            c13157e.m37501a("bid_tk", str4);
            c13157e.m37501a("lrid", str3);
            c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            C13156d.m37475b().m37492b("2000064", c13157e);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38377a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("result", 2);
            c13157e.m37501a("lrid", str3);
            c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            c13157e.m37501a("reason", str2);
            C13156d.m37475b().m37492b("2000064", c13157e);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
