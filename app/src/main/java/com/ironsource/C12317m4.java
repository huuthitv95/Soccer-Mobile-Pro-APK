package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m4 */
/* JADX INFO: loaded from: classes6.dex */
public class C12317m4 {

    /* JADX INFO: renamed from: k */
    private static final String f30920k = "1.0.6";

    /* JADX INFO: renamed from: l */
    public static String f30921l = "";

    /* JADX INFO: renamed from: a */
    private final InterfaceC12582w7 f30922a;

    /* JADX INFO: renamed from: b */
    private String f30923b;

    /* JADX INFO: renamed from: c */
    private String f30924c;

    /* JADX INFO: renamed from: d */
    private String f30925d;

    /* JADX INFO: renamed from: e */
    private String f30926e;

    /* JADX INFO: renamed from: f */
    private ContextProvider f30927f;

    /* JADX INFO: renamed from: g */
    public Thread.UncaughtExceptionHandler f30928g;

    /* JADX INFO: renamed from: h */
    public String f30929h;

    /* JADX INFO: renamed from: i */
    private String f30930i;

    /* JADX INFO: renamed from: j */
    private boolean f30931j;

    /* JADX INFO: renamed from: com.ironsource.m4$a */
    class a implements InterfaceC12103b {
        a() {
        }

        @Override // com.ironsource.InterfaceC12103b
        /* JADX INFO: renamed from: a */
        public void mo28091a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" (");
                    sb.append(thread.getState().toString());
                    sb.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            C12317m4.f30921l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC12103b
        /* JADX INFO: renamed from: b */
        public void mo28092b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f30933a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f30934b;

        b(Context context, String str) {
            this.f30933a = context;
            this.f30934b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strMo27878J = C12317m4.this.f30922a.mo27878J(this.f30933a);
                if (!TextUtils.isEmpty(strMo27878J)) {
                    C12317m4.this.f30924c = strMo27878J;
                }
                String strMo27894c = C12317m4.this.f30922a.mo27894c(this.f30933a);
                if (!TextUtils.isEmpty(strMo27894c)) {
                    C12317m4.this.f30926e = strMo27894c;
                }
                SharedPreferences.Editor editorEdit = this.f30933a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C12317m4.this.f30924c);
                editorEdit.putString("sId", this.f30934b);
                editorEdit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$c */
    class c extends RunnableC12382n4 {
        c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        static volatile C12317m4 f30937a = new C12317m4();

        private d() {
        }
    }

    private C12317m4() {
        this.f30931j = false;
        this.f30922a = C11455Gb.m25891U().mo25842a();
        this.f30927f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f30928g = defaultUncaughtExceptionHandler;
        this.f30930i = " ";
        this.f30929h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C12278k4(defaultUncaughtExceptionHandler));
    }

    /* JADX INFO: renamed from: c */
    static List<C11503J5> m32152c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static C12317m4 m32153d() {
        return d.f30937a;
    }

    /* JADX INFO: renamed from: a */
    public void m32156a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        Context applicationContext = this.f30927f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f30930i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f30929h = str;
            }
            this.f30925d = str3;
            if (z) {
                new C11791a(i).m28086a(z2).m28089b(true).m28083a(new a()).start();
            }
            m32151a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f30931j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    /* JADX INFO: renamed from: b */
    public String m32157b() {
        return f30920k;
    }

    /* JADX INFO: renamed from: e */
    String m32158e() {
        return this.f30930i;
    }

    /* JADX INFO: renamed from: a */
    public void m32155a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f30931j);
        if (!this.f30931j || th == null) {
            return;
        }
        new C11503J5(new C12296l4(th).m32052b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").m26176a();
    }

    /* JADX INFO: renamed from: a */
    private void m32151a(Context context, HashSet<String> hashSet) {
        String strM32150a = m32150a(m32154a());
        if (strM32150a.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f30924c);
        String string2 = sharedPreferences.getString("sId", this.f30925d);
        List<C11503J5> listM25603b = C11394D4.m25603b();
        IronLog.INTERNAL.verbose("reportList size " + listM25603b.size());
        for (C11503J5 c11503j5 : listM25603b) {
            JSONObject jSONObject = new JSONObject();
            String strM26177b = c11503j5.m26177b();
            String strM26180e = c11503j5.m26180e();
            String strM26179d = c11503j5.m26179d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoMo27918o = this.f30922a.mo27918o(context);
                if (memoryInfoMo27918o != null) {
                    jSONObject2.put("availRam", this.f30922a.mo27893c(memoryInfoMo27918o));
                    jSONObject2.put(C11540L6.f25025x, this.f30922a.mo27890b(memoryInfoMo27918o));
                    jSONObject2.put("mThreshold", this.f30922a.mo27885a(memoryInfoMo27918o));
                }
                String strMo27928t = this.f30922a.mo27928t();
                if (strMo27928t != null) {
                    jSONObject2.put(C11540L6.f25031z, strMo27928t);
                }
                jSONObject2.put("crashDate", strM26177b);
                jSONObject2.put("stacktraceCrash", strM26180e);
                jSONObject2.put("crashType", strM26179d);
                jSONObject2.put("CrashReporterVersion", f30920k);
                jSONObject2.put(C11744X3.j.f26464q, "9.3.0");
                jSONObject2.put(C11744X3.j.f26475x, this.f30922a.mo27896d(context));
                jSONObject2.put("appVersion", C11409E1.m25648b(context, packageName));
                jSONObject2.put(C11744X3.j.f26458n, this.f30922a.mo27905i());
                jSONObject2.put("network", strM32150a);
                jSONObject2.put(C11744X3.j.f26462p, this.f30922a.mo27897e());
                jSONObject2.put("deviceModel", this.f30922a.mo27912l());
                jSONObject2.put("totalRam", this.f30922a.mo27924r(context));
                jSONObject2.put(C11683Ta.f25802o, this.f30922a.mo27899f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.f30922a.mo27921q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f30926e)) {
                    jSONObject2.put(C11744X3.j.f26419M, Boolean.parseBoolean(this.f30926e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObject2.has(str)) {
                                jSONObject.put(str, jSONObject2.opt(str));
                            }
                        } catch (Exception e) {
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        C11394D4.m25600a();
    }

    /* JADX INFO: renamed from: a */
    Context m32154a() {
        return this.f30927f.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private String m32150a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return C11676T3.f25719b;
            }
            return networkCapabilities.hasTransport(0) ? C11676T3.f25724g : "none";
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }
}
