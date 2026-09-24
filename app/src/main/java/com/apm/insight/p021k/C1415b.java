package com.apm.insight.p021k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.C1396b;
import com.apm.insight.entity.C1398d;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.C1441a;
import com.apm.insight.nativecrash.C1442b;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p010a.C1374a;
import com.apm.insight.p013d.C1389a;
import com.apm.insight.p014e.C1391a;
import com.apm.insight.p016f.C1400b;
import com.apm.insight.p017g.C1401a;
import com.apm.insight.p019i.C1408a;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.p022l.C1435k;
import com.apm.insight.p022l.C1438n;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1460b;
import com.apm.insight.runtime.C1464f;
import com.apm.insight.runtime.C1466h;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.C1473o;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C11744X3;
import com.ironsource.C12460ra;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.k.b */
/* JADX INFO: compiled from: CrashFileCollector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1415b {

    /* JADX INFO: renamed from: b */
    private static volatile C1415b f629b;

    /* JADX INFO: renamed from: a */
    private Context f630a;

    /* JADX INFO: renamed from: f */
    private b f634f;

    /* JADX INFO: renamed from: g */
    private HashMap<String, b> f635g;

    /* JADX INFO: renamed from: c */
    private List<File> f631c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private List<File> f632d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private int f633e = -1;

    /* JADX INFO: renamed from: h */
    private volatile boolean f636h = false;

    /* JADX INFO: renamed from: i */
    private Runnable f637i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            C1415b.this.m1217f();
        }
    };

    /* JADX INFO: renamed from: j */
    private Runnable f638j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            C1415b.this.m1215d();
        }
    };

    /* JADX INFO: renamed from: com.apm.insight.k.b$a */
    /* JADX INFO: compiled from: CrashFileCollector.java */
    static class a {

        /* JADX INFO: renamed from: a */
        File f648a;

        /* JADX INFO: renamed from: b */
        long f649b;

        /* JADX INFO: renamed from: c */
        long f650c;

        /* JADX INFO: renamed from: d */
        CrashType f651d;

        /* JADX INFO: renamed from: e */
        String f652e;

        a(File file, long j, CrashType crashType) {
            this.f650c = -1L;
            this.f648a = file;
            this.f649b = j;
            this.f651d = crashType;
            this.f652e = file.getName();
        }

        a(File file, CrashType crashType) {
            this.f649b = -1L;
            this.f650c = -1L;
            this.f648a = file;
            this.f651d = crashType;
            this.f652e = file.getName();
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.k.b$b */
    /* JADX INFO: compiled from: CrashFileCollector.java */
    static class b {

        /* JADX INFO: renamed from: a */
        String f653a;

        /* JADX INFO: renamed from: d */
        a f656d;

        /* JADX INFO: renamed from: e */
        a f657e;

        /* JADX INFO: renamed from: b */
        List<a> f654b = new ArrayList();

        /* JADX INFO: renamed from: c */
        List<a> f655c = new ArrayList();

        /* JADX INFO: renamed from: f */
        boolean f658f = false;

        /* JADX INFO: renamed from: g */
        int f659g = 0;

        b(String str) {
            this.f653a = str;
        }
    }

    private C1415b(Context context) {
        this.f630a = context;
    }

    /* JADX INFO: renamed from: a */
    private C1400b m1203a(File file, CrashType crashType, String str, long j, long j2) {
        C1400b c1400b = null;
        try {
            try {
                if (file.isFile()) {
                    C1430f.m1334a(file);
                    return null;
                }
                boolean z = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return C1430f.m1335b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        C1430f.m1334a(file);
                        C1386c.m990a();
                        C1468j.m1652a(th, "NPTH_CATCH");
                        return c1400b;
                    }
                }
                C1400b c1400bM1320a = C1430f.m1320a(file, crashType);
                try {
                    JSONObject jSONObjectM1137b = c1400bM1320a.m1137b();
                    try {
                        if (c1400bM1320a.m1137b() == null) {
                            C1430f.m1334a(file);
                            return c1400bM1320a;
                        }
                        if (crashType == CrashType.ANR) {
                            return c1400bM1320a;
                        }
                        jSONObjectM1137b.put("crash_time", j);
                        boolean z2 = z;
                        jSONObjectM1137b.put("app_start_time", j2);
                        JSONObject jSONObjectOptJSONObject = jSONObjectM1137b.optJSONObject("header");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = Header.m1060a(j).m1076f();
                        } else if (z2) {
                            jSONObjectM1137b.remove("header");
                        }
                        String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                        if (strOptString == null) {
                            strOptString = "2008-20250701130429";
                        }
                        C1395a.m1079a(jSONObjectM1137b, "filters", "sdk_version", strOptString);
                        JSONArray jSONArrayOptJSONArray = jSONObjectM1137b.optJSONArray("logcat");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                            jSONObjectM1137b.put("logcat", C1466h.m1642a(str));
                        }
                        C1395a.m1079a(jSONObjectM1137b, "filters", "has_dump", "true");
                        C1395a.m1079a(jSONObjectM1137b, "filters", "has_logcat", String.valueOf(!C1373a.m870a(jSONObjectM1137b, "logcat")));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "memory_leak", String.valueOf(C1395a.m1083a(str)));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "fd_leak", String.valueOf(C1395a.m1085b(str)));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "threads_leak", String.valueOf(C1395a.m1086c(str)));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "is_64_devices", String.valueOf(Header.m1063a()));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "is_64_runtime", String.valueOf(NativeImpl.m1467f()));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "is_x86_devices", String.valueOf(Header.m1066b()));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "has_meminfo_file", String.valueOf(C1434j.m1383d(str).exists()));
                        C1395a.m1079a(jSONObjectM1137b, "filters", "is_root", String.valueOf(C1441a.m1482k()));
                        jSONObjectM1137b.put("launch_did", C1408a.m1185a(this.f630a));
                        jSONObjectM1137b.put("crash_uuid", file.getName());
                        try {
                            long j3 = Long.parseLong(C1460b.m1612a(j, str));
                            C1395a.m1079a(jSONObjectM1137b, "filters", "lastAliveTime", Math.abs(j3 - j) < 60000 ? "< 60s" : "> 60s");
                            jSONObjectM1137b.put("lastAliveTime", String.valueOf(j3));
                        } catch (Throwable unused) {
                            jSONObjectM1137b.put("lastAliveTime", "unknown");
                            C1395a.m1079a(jSONObjectM1137b, "filters", "lastAliveTime", "unknown");
                        }
                        jSONObjectM1137b.put("has_dump", "true");
                        if (jSONObjectM1137b.opt(C11744X3.a.f26174k) == null) {
                            C1390e.m1032g();
                            C1395a.m1082a(jSONObjectM1137b, C1438n.m1434a());
                        }
                        if (Header.m1067b(jSONObjectOptJSONObject)) {
                            C1395a.m1079a(jSONObjectM1137b, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        C1398d.m1122b(jSONObjectM1137b);
                        c1400bM1320a.m1137b().put("upload_scene", "launch_scan");
                        if (!z2) {
                            jSONObjectM1137b.put("isJava", 1);
                            return c1400bM1320a;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObjectM1137b.put("event_type", "start_crash");
                        jSONObjectM1137b.put("stack", jSONObjectM1137b.remove("data"));
                        jSONObject.put("data", new JSONArray().put(jSONObjectM1137b));
                        jSONObject.put("header", jSONObjectOptJSONObject);
                        c1400bM1320a.m1135a(jSONObject);
                        return c1400bM1320a;
                    } catch (Throwable th2) {
                        th = th2;
                        c1400b = c1400bM1320a;
                        C1430f.m1334a(file);
                        C1386c.m990a();
                        C1468j.m1652a(th, "NPTH_CATCH");
                        return c1400b;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        C1430f.m1334a(file);
        C1386c.m990a();
        C1468j.m1652a(th, "NPTH_CATCH");
        return c1400b;
    }

    /* JADX INFO: renamed from: a */
    public static C1415b m1204a() {
        if (f629b == null) {
            synchronized (C1415b.class) {
                if (f629b == null) {
                    f629b = new C1415b(C1390e.m1032g());
                }
            }
        }
        return f629b;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m1205a(C1441a c1441a) {
        JSONObject jSONObjectM1486b = c1441a.m1486b();
        if (jSONObjectM1486b != null && jSONObjectM1486b.length() != 0) {
            return jSONObjectM1486b;
        }
        if (C1390e.m1027d()) {
            c1441a.m1493j();
        }
        if (!c1441a.m1485a()) {
            c1441a.m1492i();
            return null;
        }
        if (!c1441a.m1488d()) {
            c1441a.m1492i();
            return null;
        }
        if (c1441a.m1489e()) {
            c1441a.m1492i();
            return null;
        }
        c1441a.m1487c();
        return c1441a.m1491h();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014a A[Catch: all -> 0x015f, TryCatch #6 {all -> 0x015f, blocks: (B:66:0x013e, B:68:0x014a, B:69:0x0159), top: B:96:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00d5 A[EXC_TOP_SPLITTER, PHI: r16
  0x00d5: PHI (r16v7 java.util.Iterator<com.apm.insight.k.b$a>) = (r16v9 java.util.Iterator<com.apm.insight.k.b$a>), (r16v10 java.util.Iterator<com.apm.insight.k.b$a>) binds: [B:49:0x00d3, B:45:0x00c8] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private void m1206a(final b bVar, boolean z, C1464f c1464f) {
        Iterator<a> it;
        CrashType crashType;
        if (!bVar.f654b.isEmpty()) {
            if (bVar.f657e == null) {
                bVar.f657e = bVar.f656d;
            }
            Iterator<a> it2 = bVar.f654b.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                try {
                    final File file = next.f648a;
                    CrashType crashType2 = next.f651d;
                    try {
                        final C1400b c1400bM1203a = m1203a(file, crashType2, bVar.f653a, next.f649b, next.f650c);
                        if (c1400bM1203a == null) {
                            C1430f.m1334a(file);
                        } else {
                            JSONObject jSONObjectM1137b = c1400bM1203a.m1137b();
                            if (jSONObjectM1137b == null) {
                                C1430f.m1334a(file);
                            } else {
                                JSONObject jSONObjectOptJSONObject = jSONObjectM1137b.optJSONObject("header");
                                if (jSONObjectOptJSONObject == null) {
                                    C1430f.m1334a(file);
                                } else if (crashType2 != null || (!new File(file, file.getName()).exists() && file.getName().split("_").length >= 5)) {
                                    File fileM1105a = C1396b.m1105a(file);
                                    if (fileM1105a.exists()) {
                                        try {
                                            JSONArray jSONArray = new JSONArray(C1430f.m1321a(fileM1105a, "\n"));
                                            JSONObject jSONObjectOptJSONObject2 = crashType2 == CrashType.LAUNCH ? ((JSONArray) jSONObjectM1137b.opt("data")).optJSONObject(0) : jSONObjectM1137b;
                                            try {
                                                if (z) {
                                                    it = it2;
                                                } else {
                                                    it = it2;
                                                    try {
                                                        if (bVar.f657e != next) {
                                                            try {
                                                                C1395a.m1079a(jSONObjectOptJSONObject2, "filters", C12460ra.f31825b, String.valueOf(String.valueOf(jSONObjectOptJSONObject.opt(C12460ra.f31825b))));
                                                                crashType = crashType2;
                                                                try {
                                                                    C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f652e.contains("ignore")));
                                                                    jSONObjectOptJSONObject.put(C12460ra.f31825b, 2010);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    C1386c.m990a();
                                                                    C1468j.m1652a(th, "NPTH_CATCH");
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                crashType = crashType2;
                                                            }
                                                        }
                                                        C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "start_uuid", bVar.f653a);
                                                        C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(bVar.f659g));
                                                        C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                                        C1396b.m1113a(jSONObjectM1137b, jSONArray, new C1396b.a() { // from class: com.apm.insight.k.b.3
                                                            @Override // com.apm.insight.entity.C1396b.a
                                                            /* JADX INFO: renamed from: a */
                                                            public final void mo927a(JSONObject jSONObject) {
                                                                C1418e.m1233a(c1400bM1203a.m1132a(), jSONObject.toString(), new File(file, "logZip"), C1434j.m1369a(C1415b.this.f630a, bVar.f653a));
                                                            }
                                                        });
                                                        if (!C1430f.m1334a(file)) {
                                                            C1391a.m1050a().m1053a(C1389a.m1011b(file.getAbsolutePath()));
                                                        }
                                                        AbstractC1416c.m1222a(crashType, jSONObjectM1137b);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        C1386c.m990a();
                                                        C1468j.m1652a(th, "NPTH_CATCH");
                                                        C1430f.m1334a(next.f648a);
                                                        it2 = it;
                                                    }
                                                    it2 = it;
                                                }
                                                if (next.f652e.contains("ignore")) {
                                                    C1395a.m1079a(jSONObjectOptJSONObject2, "filters", C12460ra.f31825b, String.valueOf(String.valueOf(jSONObjectOptJSONObject.opt(C12460ra.f31825b))));
                                                    crashType = crashType2;
                                                    C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f652e.contains("ignore")));
                                                    jSONObjectOptJSONObject.put(C12460ra.f31825b, 2010);
                                                } else {
                                                    crashType = crashType2;
                                                    if (c1464f != null && !c1464f.m1637a(jSONObjectOptJSONObject2.optString("crash_md5", BuildConfig.FLAVOR))) {
                                                        C1430f.m1334a(next.f648a);
                                                    }
                                                    it2 = it;
                                                }
                                                C1396b.m1113a(jSONObjectM1137b, jSONArray, new C1396b.a() { // from class: com.apm.insight.k.b.3
                                                    @Override // com.apm.insight.entity.C1396b.a
                                                    /* JADX INFO: renamed from: a */
                                                    public final void mo927a(JSONObject jSONObject) {
                                                        C1418e.m1233a(c1400bM1203a.m1132a(), jSONObject.toString(), new File(file, "logZip"), C1434j.m1369a(C1415b.this.f630a, bVar.f653a));
                                                    }
                                                });
                                                if (!C1430f.m1334a(file)) {
                                                    C1391a.m1050a().m1053a(C1389a.m1011b(file.getAbsolutePath()));
                                                }
                                                AbstractC1416c.m1222a(crashType, jSONObjectM1137b);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                C1386c.m990a();
                                                C1468j.m1652a(th, "NPTH_CATCH");
                                                C1430f.m1334a(next.f648a);
                                            }
                                            C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "start_uuid", bVar.f653a);
                                            C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(bVar.f659g));
                                            C1395a.m1079a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        } catch (Throwable unused) {
                                            it = it2;
                                        }
                                        it2 = it;
                                    } else {
                                        C1430f.m1334a(file);
                                    }
                                } else if (C1418e.m1242b(c1400bM1203a.m1132a(), jSONObjectM1137b.toString()).m1345a()) {
                                    C1430f.m1334a(file);
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        it = it2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    it = it2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1208a(HashMap<String, b> map) {
        File[] fileArrListFiles = C1434j.m1387f(this.f630a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (!file.isDirectory()) {
                    C1430f.m1334a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    b bVar = map.get(name);
                    if (bVar == null) {
                        bVar = new b(name);
                        map.put(name, bVar);
                    }
                    JSONArray jSONArrayM1505a = C1442b.m1505a(C1434j.m1400l(file), C1434j.m1401m(file));
                    bVar.f659g = jSONArrayM1505a.length();
                    if (bVar.f659g > 0) {
                        try {
                            C1430f.m1329a(C1434j.m1402n(file), jSONArrayM1505a);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    C1430f.m1334a(file);
                }
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
                C1430f.m1334a(file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX INFO: renamed from: a */
    private void m1209a(HashMap<String, b> map, b bVar) {
        byte b2;
        CrashType crashType;
        File[] fileArrListFiles = C1434j.m1368a(this.f630a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        char c = 0;
        int i = 0;
        while (i < fileArrListFiles.length) {
            File file = fileArrListFiles[i];
            try {
                if (C1391a.m1050a().m1054a(file.getAbsolutePath())) {
                    C1430f.m1334a(file);
                } else if (!C1430f.m1343e(file) && !C1401a.m1147a().m1166b(file.getName())) {
                    if (file.isFile()) {
                        C1430f.m1334a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                            String[] strArrSplit = name.split("_");
                            if (strArrSplit.length < 5) {
                                bVar.f654b.add(new a(file, null));
                            } else {
                                try {
                                    long j = Long.parseLong(strArrSplit[c]);
                                    long j2 = Long.parseLong(strArrSplit[4]);
                                    String str = strArrSplit[2];
                                    String str2 = strArrSplit[1];
                                    int iHashCode = str2.hashCode();
                                    if (iHashCode != -1109843021) {
                                        if (iHashCode != 96741) {
                                            if (iHashCode == 3254818 && str2.equals("java")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (str2.equals("anr")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (str2.equals("launch")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    if (b2 == 0) {
                                        crashType = CrashType.LAUNCH;
                                    } else if (b2 != 1) {
                                        crashType = b2 != 2 ? null : CrashType.ANR;
                                    } else {
                                        crashType = CrashType.JAVA;
                                    }
                                    b bVar2 = map.get(str);
                                    if (bVar2 == null) {
                                        bVar2 = new b(str);
                                        map.put(str, bVar2);
                                    }
                                    a aVar = new a(file, j, crashType);
                                    aVar.f650c = j2;
                                    if ((bVar2.f656d == null || bVar2.f656d.f649b > aVar.f649b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                        bVar2.f656d = aVar;
                                    }
                                    bVar2.f654b.add(aVar);
                                } catch (Throwable unused) {
                                    bVar.f654b.add(new a(file, null));
                                    C1386c.m990a();
                                    C1468j.m1652a(new RuntimeException("err format crashTime:".concat(String.valueOf(name))), "NPTH_CATCH");
                                }
                            }
                        } else {
                            C1430f.m1334a(file);
                        }
                    }
                }
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
            i++;
            c = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1210a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m1211b(final b bVar, boolean z, C1464f c1464f) {
        boolean z2;
        if (bVar.f655c.size() <= 1 && bVar.f655c.isEmpty()) {
            bVar.f657e = bVar.f656d;
            return;
        }
        boolean zM1406b = C1435k.m1406b(this.f630a);
        bVar.f657e = bVar.f656d;
        C1441a c1441a = new C1441a(this.f630a);
        for (a aVar : bVar.f655c) {
            final File file = aVar.f648a;
            try {
                c1441a.m1484a(file);
                JSONObject jSONObjectM1205a = m1205a(c1441a);
                if (jSONObjectM1205a == null || jSONObjectM1205a.length() == 0) {
                    z2 = zM1406b;
                    c1441a.m1492i();
                } else if (jSONObjectM1205a.length() != 0) {
                    try {
                        if (z) {
                            z2 = zM1406b;
                            if (c1464f != null && !c1464f.m1637a(BuildConfig.FLAVOR)) {
                                c1441a.m1492i();
                            }
                        } else {
                            long jOptLong = jSONObjectM1205a.optLong("crash_time");
                            try {
                                if (bVar.f657e == null) {
                                    bVar.f657e = aVar;
                                    bVar.f658f = true;
                                    if (c1464f == null || c1464f.m1637a(BuildConfig.FLAVOR)) {
                                        z2 = zM1406b;
                                    } else {
                                        c1441a.m1492i();
                                    }
                                } else {
                                    if (bVar.f658f) {
                                        z2 = zM1406b;
                                    } else {
                                        z2 = zM1406b;
                                        try {
                                            if (jOptLong < bVar.f657e.f649b) {
                                                bVar.f657e = aVar;
                                                if (c1464f == null || c1464f.m1637a(BuildConfig.FLAVOR)) {
                                                    m1210a(file);
                                                    bVar.f658f = true;
                                                } else {
                                                    c1441a.m1492i();
                                                    zM1406b = z2;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            C1386c.m990a();
                                            C1468j.m1652a(th, "NPTH_CATCH");
                                            C1430f.m1334a(file);
                                            zM1406b = z2;
                                        }
                                    }
                                    C1395a.m1079a(jSONObjectM1205a, "filters", C12460ra.f31825b, String.valueOf(jSONObjectM1205a.optJSONObject("header").opt(C12460ra.f31825b)));
                                    jSONObjectM1205a.optJSONObject("header").put(C12460ra.f31825b, 2010);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = zM1406b;
                            }
                        }
                        C1395a.m1079a(jSONObjectM1205a, "filters", "start_uuid", bVar.f653a);
                        C1395a.m1079a(jSONObjectM1205a, "filters", "crash_thread_name", jSONObjectM1205a.optString("crash_thread_name", "unknown"));
                        if (z2) {
                            AbstractC1416c.a aVar2 = new AbstractC1416c.a(jSONObjectM1205a, CrashType.NATIVE);
                            C1396b.m1113a(jSONObjectM1205a, C1396b.m1110a(aVar2.m1225c(), aVar2.m1223a(), C1473o.m1709a().m1716b(aVar2.m1224b() == -1 ? System.currentTimeMillis() : aVar2.m1224b())), new C1396b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.C1396b.a
                                /* JADX INFO: renamed from: a */
                                public final void mo927a(JSONObject jSONObject) {
                                    C1417d.m1226a();
                                    C1417d.m1227a(jSONObject, file, C1434j.m1369a(C1415b.this.f630a, bVar.f653a));
                                }
                            });
                            if (!c1441a.m1492i()) {
                                c1441a.m1490f();
                            }
                        }
                        AbstractC1416c.m1222a(CrashType.NATIVE, jSONObjectM1205a);
                    } catch (Throwable th3) {
                        th = th3;
                        C1386c.m990a();
                        C1468j.m1652a(th, "NPTH_CATCH");
                        C1430f.m1334a(file);
                    }
                } else {
                    z2 = zM1406b;
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = zM1406b;
            }
            zM1406b = z2;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1213b(HashMap<String, b> map) {
        File[] fileArrListFiles = C1434j.m1381d(this.f630a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (!file.isDirectory()) {
                    C1430f.m1334a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    b bVar = map.get(name);
                    if (bVar == null) {
                        bVar = new b(name);
                        map.put(name, bVar);
                    }
                    bVar.f655c.add(new a(file, CrashType.NATIVE));
                } else {
                    C1430f.m1334a(file);
                }
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
                C1430f.m1334a(file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m1215d() throws Throwable {
        if (this.f636h || this.f635g == null) {
            return;
        }
        if (!C1435k.m1406b(this.f630a)) {
            m1216e();
        }
        if (this.f633e == -1) {
            if (C1447a.m1531a() && C1447a.m1541f()) {
                this.f633e = 1;
            } else {
                this.f633e = 0;
            }
        }
        boolean z = this.f633e == 1;
        C1464f c1464f = new C1464f(this.f630a);
        Iterator<b> it = this.f635g.values().iterator();
        while (it.hasNext()) {
            m1211b(it.next(), z, c1464f);
        }
        Iterator<b> it2 = this.f635g.values().iterator();
        while (it2.hasNext()) {
            m1206a(it2.next(), z, c1464f);
        }
        Iterator<b> it3 = this.f635g.values().iterator();
        while (it3.hasNext()) {
            C1430f.m1334a(C1434j.m1369a(this.f630a, it3.next().f653a));
        }
        c1464f.m1636a();
        C1460b.m1613a();
        m1216e();
    }

    /* JADX INFO: renamed from: e */
    private void m1216e() {
        this.f636h = true;
        this.f635g = null;
        NativeImpl.m1474j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m1217f() throws Throwable {
        if (this.f636h) {
            return;
        }
        if (!C1435k.m1406b(this.f630a) || (System.currentTimeMillis() - C1390e.m1035j() <= 5000 && C1390e.m1034i().isApmExists() && !Npth.hasCrash())) {
            C1471m.m1704a().m1736a(this.f637i, 5000L);
        } else {
            m1215d();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m1218g() {
        File[] fileArrListFiles = C1434j.m1395i(this.f630a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            if (file.getName().endsWith(".atmp")) {
                C1374a.m898a();
                file.getAbsolutePath();
            } else {
                try {
                    C1400b c1400bM1340c = C1430f.m1340c(file.getAbsolutePath());
                    if (c1400bM1340c != null) {
                        if (c1400bM1340c.m1137b() != null) {
                            c1400bM1340c.m1137b().put("upload_scene", "launch_scan");
                        }
                        if (C1418e.m1238a(C1418e.m1248d(), c1400bM1340c.m1143e(), c1400bM1340c.m1141d(), c1400bM1340c.m1145f(), c1400bM1340c.m1146g())) {
                            C1430f.m1334a(file);
                            String strM1139c = c1400bM1340c.m1139c();
                            if (!TextUtils.isEmpty(strM1139c)) {
                                C1430f.m1334a(new File(strM1139c));
                            }
                        }
                    } else {
                        C1430f.m1334a(file);
                    }
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1219a(boolean z) throws Throwable {
        if (!Npth.isStopUpload() && z) {
            if (this.f634f == null) {
                this.f634f = new b("old_uuid");
                HashMap<String, b> map = new HashMap<>();
                this.f635g = map;
                m1208a(map);
                m1209a(this.f635g, this.f634f);
                C1430f.m1334a(C1434j.m1373b(this.f630a));
                m1213b(this.f635g);
                m1211b(this.f634f, true, null);
                m1206a(this.f634f, true, null);
                this.f634f = null;
                if (this.f635g.isEmpty()) {
                    m1216e();
                } else {
                    m1217f();
                }
            }
            m1218g();
            C1373a.m876c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1220b() {
        try {
            if (!this.f636h && C1425a.m1292b(C1390e.m1032g())) {
                C1471m.m1704a().m1735a(this.f638j);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1221c() {
        return this.f636h;
    }
}
