package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.c */
/* JADX INFO: compiled from: SDKAuthorityController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13006c extends AbstractC13005b {

    /* JADX INFO: renamed from: j */
    private static volatile C13006c f35515j;

    private C13006c() {
        m36579h();
    }

    /* JADX INFO: renamed from: c */
    public static void m36581c(boolean z) {
    }

    /* JADX INFO: renamed from: l */
    public static boolean m36582l() {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static C13006c m36583m() {
        if (f35515j == null) {
            synchronized (C13006c.class) {
                if (f35515j == null) {
                    f35515j = new C13006c();
                }
            }
        }
        return f35515j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b
    /* JADX INFO: renamed from: a */
    public int mo36565a(C13635g c13635g, String str) {
        if (c13635g == null) {
            c13635g = C13636h.m39706b().m39708a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return c13635g.m39582x0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return c13635g.m39578w0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return c13635g.m39586y0();
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public boolean m36584c(String str) {
        boolean z;
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
            z = true;
        } else {
            z = false;
        }
        int iM39534l0 = c13635gM39718d.m39534l0();
        boolean z2 = iM39534l0 != 0 ? iM39534l0 == 1 && mo36565a(c13635gM39718d, str) == 1 : m36566a(str) == 1 && mo36565a(c13635gM39718d, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z2 = m36566a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m36583m().m36576e() == 2) {
            return (c13635gM39718d.m39415I0() || z || m36566a(str) != 1) ? false : true;
        }
        return z2;
    }
}
