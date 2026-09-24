package com.mbridge.msdk.timer;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: renamed from: com.mbridge.msdk.timer.b */
/* JADX INFO: compiled from: TimerController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13813b {

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.b$b */
    /* JADX INFO: compiled from: TimerController.java */
    static class b {

        /* JADX INFO: renamed from: a */
        static C13813b f39369a = new C13813b();
    }

    private C13813b() {
    }

    public static C13813b getInstance() {
        return b.f39369a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            C13812a.m40973a().m40987a(str, str2);
        } catch (Exception e) {
            C13219q0.m37816b("TimerController", "addInterstitialList error:" + e.getMessage());
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            C13812a.m40973a().m40989b(str, str2);
        } catch (Exception e) {
            C13219q0.m37816b("TimerController", "addRewardList error:" + e.getMessage());
        }
    }

    public void start() {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        int iM39512h = c13635gM39718d.m39512h();
        if (iM39512h > 0) {
            C13812a.m40973a().m40988b(iM39512h * 1000);
        }
    }
}
