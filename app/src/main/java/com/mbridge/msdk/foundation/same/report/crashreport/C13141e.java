package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.e */
/* JADX INFO: compiled from: MBridgeUncaughtExceptionHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13141e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d */
    private static volatile C13141e f36093d;

    /* JADX INFO: renamed from: a */
    private final String f36094a = "CrashHandlerUtil";

    /* JADX INFO: renamed from: b */
    private Thread.UncaughtExceptionHandler f36095b;

    /* JADX INFO: renamed from: c */
    private final WeakReference<Context> f36096c;

    private C13141e(Context context) {
        this.f36096c = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public static C13141e m37317a(Context context) {
        if (f36093d == null) {
            synchronized (C13141e.class) {
                if (f36093d == null) {
                    f36093d = new C13141e(context);
                }
            }
        }
        return f36093d;
    }

    /* JADX INFO: renamed from: b */
    private void m37320b(Thread thread, Throwable th) {
        try {
            List<String> listM37293a = C13138b.m37293a();
            StackTraceElement[] stackTrace = th.getStackTrace();
            StringBuilder sb = new StringBuilder();
            String str = th.getClass() + ": " + th.getMessage();
            sb.append(str);
            sb.append("\n");
            boolean zM37319a = m37319a(listM37293a, str);
            int i = 0;
            for (int i2 = 0; i2 < stackTrace.length; i2++) {
                String string = stackTrace[i2].toString();
                if (m37319a(listM37293a, string)) {
                    zM37319a = true;
                    if (i2 == 0) {
                        i = 1;
                    }
                }
                sb.append(string);
                sb.append("\n");
            }
            if (zM37319a && sb.length() >= 1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000052");
                jSONObject.put("crash_first_index_from_mtg", i);
                JSONObject jSONObjectM37321a = m37321a(String.valueOf(System.currentTimeMillis()));
                jSONObjectM37321a.put("crashinfo", sb.toString());
                jSONObject.put("exception", jSONObjectM37321a);
                if (jSONObject.length() > 0) {
                    C13156d.m37475b().m37488a(jSONObject);
                }
                try {
                    Thread.sleep(500L);
                    return;
                } catch (InterruptedException e) {
                    C13219q0.m37816b("CrashHandlerUtil", e.getMessage());
                    return;
                }
            }
            m37318a(thread, th);
        } catch (Throwable th2) {
            m37318a(thread, th);
            C13219q0.m37816b("CrashHandlerUtil", th2.getMessage());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            try {
                m37320b(thread, th);
            } catch (Throwable th2) {
                C13219q0.m37816b("CrashHandlerUtil", th2.getMessage());
            }
        }
        m37318a(thread, th);
    }

    /* JADX INFO: renamed from: a */
    public void m37322a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f36095b = defaultUncaughtExceptionHandler;
        if (defaultUncaughtExceptionHandler instanceof C13141e) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m37321a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f36096c.get() == null) {
                return jSONObject;
            }
            float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
            float f = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
            float fFreeMemory = (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d);
            jSONObject.put("max_memory", String.valueOf(fMaxMemory));
            jSONObject.put("memoryby_app", String.valueOf(f));
            jSONObject.put("remaining_memory", fFreeMemory);
            jSONObject.put("crashtime", str);
            return jSONObject;
        } catch (Throwable th) {
            C13219q0.m37816b("CrashHandlerUtil", th.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m37319a(List<String> list, String str) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m37318a(Thread thread, Throwable th) {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f36095b;
            if (uncaughtExceptionHandler != null) {
                if (uncaughtExceptionHandler instanceof C13141e) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                Process.killProcess(Process.myPid());
                System.exit(1);
            }
        } catch (Throwable th2) {
            C13219q0.m37816b("CrashHandlerUtil", th2.getMessage());
        }
    }
}
