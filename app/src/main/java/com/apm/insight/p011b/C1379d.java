package com.apm.insight.p011b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1468j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.b.d */
/* JADX INFO: compiled from: ANRUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1379d {

    /* JADX INFO: renamed from: a */
    private static String f414a = null;

    /* JADX INFO: renamed from: b */
    private static long f415b = -1;

    /* JADX INFO: renamed from: c */
    private static boolean f416c;

    /* JADX INFO: renamed from: d */
    private static FileObserver f417d;

    /* JADX INFO: renamed from: e */
    private static ActivityManager.ProcessErrorStateInfo f418e;

    /* JADX INFO: renamed from: a */
    static String m936a(Context context) {
        if (SystemClock.uptimeMillis() - f415b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM1287a = C1425a.m1287a(context);
            if (processErrorStateInfoM1287a != null && Process.myPid() == processErrorStateInfoM1287a.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f418e;
                if (processErrorStateInfo != null && String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfoM1287a.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfoM1287a.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfoM1287a.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfoM1287a.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfoM1287a.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfoM1287a.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfoM1287a.longMsg))) {
                    return null;
                }
                f418e = processErrorStateInfoM1287a;
                f414a = null;
                f415b = SystemClock.uptimeMillis();
                f416c = false;
                if (!C1390e.m1045t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                StringBuilder sb = new StringBuilder("|------------- processErrorStateInfo--------------|\n");
                sb.append("condition: " + processErrorStateInfoM1287a.condition + "\n");
                sb.append("processName: " + processErrorStateInfoM1287a.processName + "\n");
                sb.append("pid: " + processErrorStateInfoM1287a.pid + "\n");
                sb.append("uid: " + processErrorStateInfoM1287a.uid + "\n");
                sb.append("tag: " + processErrorStateInfoM1287a.tag + "\n");
                sb.append("shortMsg : " + processErrorStateInfoM1287a.shortMsg + "\n");
                sb.append("longMsg : " + processErrorStateInfoM1287a.longMsg + "\n");
                sb.append("-----------------------end----------------------------");
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        String str = f414a;
        if (str == null) {
            return null;
        }
        f416c = true;
        f414a = null;
        f415b = SystemClock.uptimeMillis();
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m938a() throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", C1437m.m1414a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m939a(final String str, final C1383h.a aVar) {
        FileObserver fileObserver = f417d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i, String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = C1379d.f414a = aVar.m977a();
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
            }
        };
        f417d = fileObserver2;
        fileObserver2.startWatching();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m940b() {
        return f416c;
    }

    /* JADX INFO: renamed from: c */
    public static void m941c() {
        f418e = null;
    }
}
