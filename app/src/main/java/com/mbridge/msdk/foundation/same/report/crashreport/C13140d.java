package com.mbridge.msdk.foundation.same.report.crashreport;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.C13134c;
import com.mbridge.msdk.foundation.same.report.C13144f;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.tracker.C13818e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.d */
/* JADX INFO: compiled from: AnrMonitorManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13140d {

    /* JADX INFO: renamed from: a */
    private static long f36089a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.d$a */
    /* JADX INFO: compiled from: AnrMonitorManager.java */
    private static final class a implements InterfaceC13137a {

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnrMonitorManager.java */
        class RunnableC15553a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f36090a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ StackTraceElement[] f36091b;

            RunnableC15553a(String str, StackTraceElement[] stackTraceElementArr) {
                this.f36090a = str;
                this.f36091b = stackTraceElementArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.m37316c(this.f36090a, this.f36091b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static void m37316c(String str, StackTraceElement[] stackTraceElementArr) {
            try {
                C13140d.m37308b(str, stackTraceElementArr);
            } catch (Exception e) {
                C13219q0.m37817b("AnrMonitorManager", "handler anr failed", e);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.crashreport.InterfaceC13137a
        /* JADX INFO: renamed from: a */
        public void mo37291a() {
        }

        @Override // com.mbridge.msdk.foundation.same.report.crashreport.InterfaceC13137a
        /* JADX INFO: renamed from: a */
        public void mo37292a(String str, StackTraceElement[] stackTraceElementArr) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("AnrMonitorManager", "onAnrHappened: " + str);
            }
            if (!C13140d.m37310b(str)) {
                C13219q0.m37813a("AnrMonitorManager", "onAnrHappened: can track false");
                return;
            }
            long unused = C13140d.f36089a = System.currentTimeMillis();
            C13167a.m37546e().execute(new RunnableC15553a(str, stackTraceElementArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37307b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\r\n");
                    }
                }
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m37311c(String str) throws JSONException {
        JSONObject jSONObjectM37294a = C13138b.m37294a(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
        jSONObjectM37294a.put("crashinfo", str);
        return jSONObjectM37294a;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m37314d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) || str.contains("com.google") || str.contains("java.lang") || str.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) || str.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_APP);
    }

    /* JADX INFO: renamed from: a */
    public static String m37304a(StackTraceElement[] stackTraceElementArr) {
        return m37313c(stackTraceElementArr) ? "1" : "0";
    }

    /* JADX INFO: renamed from: c */
    public static boolean m37313c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.toString())) {
                        String string = stackTraceElement.toString();
                        if (!m37314d(string)) {
                            arrayList.add(string);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
                return m37310b((String) arrayList.get(0));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("AnrMonitorManager", "isMBridgeFirst exception", e);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static int m37302a() {
        try {
            int iM37843b = C13223s0.m37831a().m37843b("anr_check_timeout", 5000);
            if (iM37843b <= 0) {
                return 5000;
            }
            return iM37843b;
        } catch (Exception e) {
            C13219q0.m37817b("AnrMonitorManager", "get anr check timeout failed", e);
            return 5000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m37308b(String str, StackTraceElement[] stackTraceElementArr) throws JSONException {
        try {
            JSONObject jSONObjectM37311c = m37311c(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", jSONObjectM37311c.toString());
            jSONObject.put("crash_first_index_from_mtg", m37304a(stackTraceElementArr));
            C13818e c13818e = new C13818e("m_anr_report");
            c13818e.m41006a(jSONObject);
            c13818e.m41004a(C13134c.m37283d());
            c13818e.m41008b(0);
            c13818e.m41002a(1);
            C13144f.m37354a().m37356b().m41079c(c13818e);
        } catch (JSONException e) {
            C13219q0.m37817b("AnrMonitorManager", "reportANRByEventLibrary anr failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m37310b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : C13138b.m37293a()) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m37312c() {
        if (!m37309b()) {
            C13219q0.m37813a("AnrMonitorManager", "anr monitor is not available");
            return;
        }
        try {
            C13139c.m37296a().m37298a(m37302a(), new a()).start();
        } catch (Exception e) {
            C13219q0.m37817b("AnrMonitorManager", "start anr monitor failed", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m37309b() {
        try {
            return C13223s0.m37831a().m37842a("anr_monitor_available", false);
        } catch (Exception e) {
            C13219q0.m37817b("AnrMonitorManager", "get anr monitor available failed", e);
            return false;
        }
    }
}
