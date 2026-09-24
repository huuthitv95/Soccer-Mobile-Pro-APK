package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.C11540L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.net.d */
/* JADX INFO: compiled from: SettingRequestDiff.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13644d {
    /* JADX INFO: renamed from: a */
    public static void m39757a(Context context, C13126e c13126e) {
        if (c13126e == null) {
            return;
        }
        try {
            c13126e.m37245a(C11540L6.f24947V0, C13198g.m37689d());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("SettingRequestDiff", e.getMessage());
            }
        }
    }
}
