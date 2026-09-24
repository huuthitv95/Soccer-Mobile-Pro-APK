package com.mbridge.msdk.reward.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.report.metrics.a */
/* JADX INFO: compiled from: MetricsRewardReport.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13624a {

    /* JADX INFO: renamed from: a */
    private static volatile C13624a f37901a;

    private C13624a() {
    }

    /* JADX INFO: renamed from: a */
    public static C13624a m39351a() {
        if (f37901a == null) {
            synchronized (C13624a.class) {
                if (f37901a == null) {
                    f37901a = new C13624a();
                }
            }
        }
        return f37901a;
    }

    /* JADX INFO: renamed from: a */
    private void m39352a(C13154c c13154c) {
        if (c13154c == null) {
            try {
                c13154c = new C13154c();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        C14221a c14221aM42670c = C14222b.m42658b().m42670c();
        if (c14221aM42670c != null) {
            c13154c.m37452l(c14221aM42670c.m42633a());
            c13154c.m37450k(c14221aM42670c.m42649f());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m39353b(C13154c c13154c) {
        List<CampaignEx> listM37457o;
        if (c13154c == null) {
            return;
        }
        try {
            int iM37441g = c13154c.m37441g();
            String strM37413B = c13154c.m37413B();
            if (TextUtils.isEmpty(strM37413B) && (listM37457o = c13154c.m37457o()) != null && listM37457o.size() > 0 && listM37457o.get(0) != null) {
                strM37413B = listM37457o.get(0).getCampaignUnitId();
                iM37441g = listM37457o.get(0).getAdType();
                c13154c.m37420a(iM37441g);
                c13154c.m37456n(strM37413B);
            }
            C14223c c14223cM42661a = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), strM37413B, iM37441g == 287);
            if (c14223cM42661a != null) {
                c13154c.m37454m(c14223cM42661a.m42760x());
                c13154c.m37458o(c14223cM42661a.m42699a());
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39354a(String str, C13154c c13154c) {
        try {
            m39352a(c13154c);
            m39353b(c13154c);
            C13156d.m37475b().m37490b(c13154c);
            C13156d.m37475b().m37491b(str, c13154c, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
