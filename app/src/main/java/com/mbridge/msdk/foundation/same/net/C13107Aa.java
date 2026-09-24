package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.foundation.tools.C13207k0;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.Aa */
/* JADX INFO: loaded from: classes6.dex */
public class C13107Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";

    /* JADX INFO: renamed from: a */
    private static String f35953a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.Aa$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.killProcess(Process.myPid());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37185a() {
        return f35953a;
    }

    /* JADX INFO: renamed from: b */
    public static String m37186b() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static void m37187b(String str) {
        String strM37712a;
        Integer numM37188c;
        if (!TextUtils.isEmpty(str)) {
            try {
                strM37712a = C13207k0.m37712a(str);
            } catch (Throwable th) {
                th.printStackTrace();
                strM37712a = null;
            }
            if (!TextUtils.isEmpty(strM37712a) && strM37712a.startsWith(C_START) && strM37712a.endsWith(C_END) && (numM37188c = m37188c(strM37712a)) != null) {
                f35953a = String.valueOf(numM37188c);
            } else {
                if (MBridgeConstans.DEBUG) {
                    m37189g();
                    throw new RuntimeException("please don't update this value");
                }
                f35953a = "";
            }
        }
        if (C12907a.m36194c().m36202d()) {
            HashMap map = new HashMap();
            map.put("channel", m37185a());
            C12907a.m36194c().m36201b(C12770c.m35199a(), "c22", map);
        }
    }

    /* JADX INFO: renamed from: c */
    private static Integer m37188c(String str) {
        Throwable th;
        Integer numValueOf;
        if (str != null) {
            int iIndexOf = str.indexOf(C_START);
            int iIndexOf2 = str.indexOf(C_END);
            if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf2 > iIndexOf) {
                try {
                    numValueOf = Integer.valueOf(str.substring(iIndexOf + 11, iIndexOf2));
                    try {
                        if (numValueOf.intValue() > 0) {
                            return numValueOf;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        return numValueOf;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    numValueOf = null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static void m37189g() {
        new Handler().postDelayed(new a(), 500L);
    }
}
