package com.apm.insight.p018h;

import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.C1472n;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11744X3;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.apm.insight.h.b */
/* JADX INFO: compiled from: NpthSoData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1406b {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, String> f604a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f605b;

    public C1406b(File file) {
        String strM1448a;
        File fileM1378c = C1434j.m1378c(file);
        if (!fileM1378c.exists() || fileM1378c.length() == 0 || (strM1448a = NativeImpl.m1448a(fileM1378c.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strM1448a.split("\n");
        this.f605b = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split(C11744X3.j.f26434b);
            if (strArrSplit2.length == 2) {
                this.f605b.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1174a() {
        return C1390e.m1032g().getFilesDir() + "/apminsight/selflib/";
    }

    /* JADX INFO: renamed from: a */
    public static String m1175a(String str) {
        return C1390e.m1032g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m1176b() {
        if (f604a == null) {
            f604a = new HashMap<>();
            File file = new File(C1390e.m1032g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f604a.put(str.substring(0, str.length() - 4), C1430f.m1323a(file.getAbsolutePath() + RemoteSettings.FORWARD_SLASH_STRING + str, "\n"));
                        } catch (Throwable th) {
                            C1386c.m990a();
                            C1468j.m1652a(th, "NPTH_CATCH");
                        }
                    } else if (!str.endsWith(".so")) {
                        C1430f.m1334a(new File(file, str));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1177b(final String str) {
        C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.h.b.1

            /* JADX INFO: renamed from: a */
            private boolean f606a = false;

            @Override // java.lang.Runnable
            public final void run() {
                String strM1183a;
                C1406b.m1176b();
                if (C1406b.m1179c(str)) {
                    return;
                }
                C1472n.m1708a("updateSo", str);
                File file = new File(C1406b.m1175a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                String str2 = "doUnpackLibrary: " + str;
                if (C1390e.m1034i().isDebugMode()) {
                    Log.w("npth", str2);
                }
                try {
                    strM1183a = C1407c.m1183a(C1390e.m1032g(), str, file);
                } catch (Throwable th) {
                    C1472n.m1708a("updateSoError", str);
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                    strM1183a = null;
                }
                if (strM1183a != null) {
                    if (this.f606a) {
                        C1472n.m1708a("updateSoFailed", str);
                        return;
                    }
                    this.f606a = true;
                    C1472n.m1708a("updateSoPostRetry", str);
                    C1471m.m1704a().m1736a(this, 3000L);
                    return;
                }
                C1406b.f604a.put(file.getName(), "2008-20250701130429");
                try {
                    C1430f.m1327a(new File(C1390e.m1032g().getFilesDir() + "/apminsight/selflib/" + str + ".ver"), "2008-20250701130429", false);
                } catch (Throwable unused) {
                }
                C1472n.m1708a("updateSoSuccess", str);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ boolean m1179c(String str) {
        return "2008-20250701130429".equals(f604a.get(str)) && new File(m1175a(str)).exists();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1180d() {
        Map<String, String> map = this.f605b;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f605b.get("process_name")) || TextUtils.isEmpty(this.f605b.get("crash_thread_name")) || TextUtils.isEmpty(this.f605b.get("pid")) || TextUtils.isEmpty(this.f605b.get(ScarConstants.TOKEN_ID_KEY)) || TextUtils.isEmpty(this.f605b.get("start_time")) || TextUtils.isEmpty(this.f605b.get("crash_time")) || TextUtils.isEmpty(this.f605b.get("signal_line"))) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final String m1181e() {
        return this.f605b.get("signal_line");
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m1182f() {
        return this.f605b;
    }
}
