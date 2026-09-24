package com.mbridge.msdk.config.component.midi.monitor;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.kit.C12754a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.midi.monitor.b */
/* JADX INFO: compiled from: MonitorOMSDKPlayer.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12826b {
    /* JADX INFO: renamed from: a */
    public void m35587a(String str, C12894a c12894a) {
        try {
            new C12754a().m35086a(str, c12894a);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("OMSDKPlayerMonitor", e.getMessage(), e);
            }
        }
    }
}
