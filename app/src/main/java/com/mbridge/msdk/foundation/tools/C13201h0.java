package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;
import com.mbridge.msdk.foundation.controller.C13008c;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.h0 */
/* JADX INFO: compiled from: NetManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13201h0 {

    /* JADX INFO: renamed from: a */
    private static ConnectivityManager f36309a;

    /* JADX INFO: renamed from: a */
    public static synchronized ConnectivityManager m37705a() {
        try {
            if (f36309a == null && C13008c.m36588n().m36542d() != null) {
                f36309a = (ConnectivityManager) C13008c.m36588n().m36542d().getSystemService("connectivity");
            }
        } catch (Exception e) {
            C13219q0.m37816b("NetManager", e.getMessage());
        }
        return f36309a;
    }
}
