package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.C1398d;
import com.apm.insight.entity.Header;
import com.apm.insight.p013d.C1389a;
import com.apm.insight.p014e.C1391a;
import com.apm.insight.p018h.C1406b;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1432h;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.p022l.C1438n;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.C1473o;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11744X3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.nativecrash.a */
/* JADX INFO: compiled from: NativeCrashFileManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1441a {

    /* JADX INFO: renamed from: d */
    private static Boolean f751d;

    /* JADX INFO: renamed from: a */
    private final Context f752a;

    /* JADX INFO: renamed from: b */
    private JSONObject f753b = null;

    /* JADX INFO: renamed from: c */
    private b f754c;

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$a */
    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static String m1495b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        C1373a.m860a((Closeable) bufferedReader2);
                        return "";
                    }
                    if (line.startsWith("[FATAL:jni_android.cc") && line.contains("Please include Java exception stack in crash report ttwebview:")) {
                        StringBuilder sb = new StringBuilder();
                        int iIndexOf = line.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(line.substring(iIndexOf + 11));
                        sb.append("\n");
                        while (true) {
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null) {
                                String string = sb.toString();
                                C1373a.m860a((Closeable) bufferedReader2);
                                return string;
                            }
                            sb.append(line2);
                            sb.append("\n");
                        }
                    } else {
                        C1373a.m860a((Closeable) bufferedReader2);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        C1386c.m990a();
                        C1468j.m1652a(th, "NPTH_CATCH");
                    } finally {
                        C1373a.m860a((Closeable) bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$b */
    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    class b {

        /* JADX INFO: renamed from: a */
        private final C1443c f755a;

        /* JADX INFO: renamed from: b */
        private final C1406b f756b;

        /* JADX INFO: renamed from: c */
        private final File f757c;

        /* JADX INFO: renamed from: d */
        private final File f758d;

        public b(File file) {
            this.f757c = file;
            this.f758d = C1434j.m1369a(C1390e.m1032g(), file.getName());
            C1406b c1406b = new C1406b(file);
            this.f756b = c1406b;
            C1443c c1443c = new C1443c(file);
            this.f755a = c1443c;
            if (c1406b.m1180d() && c1443c.m1520a() == null) {
                c1443c.m1521a(file);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0008, B:6:0x000e, B:11:0x001c), top: B:16:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0019  */
        /* JADX INFO: renamed from: a */
        public final long m1499a() {
            String str;
            Map<String, String> mapM1182f = this.f756b.m1182f();
            if (mapM1182f != null) {
                try {
                    if (mapM1182f.isEmpty()) {
                        str = null;
                    } else {
                        str = mapM1182f.get("start_time");
                    }
                    if (str != null) {
                        return Long.parseLong(str);
                    }
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
            } else {
                str = null;
                if (str != null) {
                    return Long.parseLong(str);
                }
            }
            return System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: b */
        public final File m1500b() {
            return this.f757c;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m1501c() {
            return this.f756b.m1180d();
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$c */
    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class c extends e {
        c() {
            super();
            this.f763b = "Total FD Count:";
            this.f762a = C1434j.m1396i(C1441a.this.f754c.m1500b());
            this.f764c = CertificateUtil.DELIMITER;
            this.f765d = -2;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$d */
    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class d extends e {
        d() {
            super();
            this.f763b = "VmSize:";
            this.f762a = C1434j.m1399k(C1441a.this.f754c.m1500b());
            this.f764c = "\\s+";
            this.f765d = -1;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$e */
    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class e {

        /* JADX INFO: renamed from: a */
        protected File f762a;

        /* JADX INFO: renamed from: b */
        protected String f763b;

        /* JADX INFO: renamed from: c */
        protected String f764c;

        /* JADX INFO: renamed from: d */
        protected int f765d;

        public e() {
        }

        /* JADX INFO: renamed from: a */
        private int m1502a(String str) {
            int i = this.f765d;
            if (!str.startsWith(this.f763b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f764c)[1].trim());
            } catch (NumberFormatException e) {
                C1386c.m990a();
                C1468j.m1652a(e, "NPTH_CATCH");
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }

        /* JADX INFO: renamed from: a */
        public final int m1503a() {
            int i;
            Throwable th;
            if (!this.f762a.exists() || !this.f762a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f762a));
                int iM1502a = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iM1502a = m1502a(line);
                    } catch (Throwable th2) {
                        th = th2;
                        i = iM1502a;
                        bufferedReader = bufferedReader2;
                        try {
                            C1386c.m990a();
                            C1468j.m1652a(th, "NPTH_CATCH");
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                C1373a.m860a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (iM1502a == -1);
                C1373a.m860a((Closeable) bufferedReader2);
                return iM1502a;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$f */
    /* JADX INFO: compiled from: NativeCrashFileManager.java */
    public class f extends e {
        f() {
            super();
            this.f763b = "Total Threads Count:";
            this.f762a = C1434j.m1397j(C1441a.this.f754c.m1500b());
            this.f764c = CertificateUtil.DELIMITER;
            this.f765d = -2;
        }
    }

    public C1441a(Context context) {
        this.f752a = context;
    }

    /* JADX INFO: renamed from: a */
    private static String m1478a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: a */
    private void m1479a(C1395a c1395a) {
        File fileM1370a = C1434j.m1370a(this.f754c.m1500b());
        if (fileM1370a.exists()) {
            try {
                String strM1323a = C1430f.m1323a(fileM1370a.getAbsolutePath(), "\n");
                JSONArray jSONArray = new JSONArray();
                if (strM1323a != null) {
                    for (String str : strM1323a.split("\n")) {
                        jSONArray.put(str);
                    }
                }
                c1395a.m1095a("native_log", (Object) jSONArray);
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1480b(C1395a c1395a) {
        BufferedReader bufferedReader;
        File fileM1394h = C1434j.m1394h(this.f754c.m1500b());
        if (!fileM1394h.exists()) {
            NativeImpl.m1452a(fileM1394h.getAbsolutePath(), String.valueOf(C1390e.m1034i().getLogcatDumpCount()), String.valueOf(C1390e.m1034i().getLogcatLevel()));
        }
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.f754c.f756b.m1182f().get("pid") + " ";
        try {
            bufferedReader = new BufferedReader(new FileReader(fileM1394h));
            try {
                if (fileM1394h.length() > 512000) {
                    bufferedReader.skip(fileM1394h.length() - 512000);
                }
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(str)) {
                        jSONArray.put(line);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        C1373a.m860a((Closeable) bufferedReader);
        c1395a.m1095a("logcat", (Object) jSONArray);
    }

    /* JADX INFO: renamed from: g */
    public static long m1481g() {
        if (NativeImpl.m1467f()) {
            return Long.MAX_VALUE;
        }
        return Header.m1063a() ? 3891200L : 2867200L;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1482k() {
        Boolean bool = f751d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i = 0; i < 11; i++) {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean bool2 = Boolean.TRUE;
                    f751d = bool2;
                    return bool2.booleanValue();
                }
                continue;
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
        }
        Boolean bool3 = Boolean.FALSE;
        f751d = bool3;
        return bool3.booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private String m1483l() {
        b bVar = this.f754c;
        if (bVar == null) {
            return null;
        }
        String strM1524c = bVar.f755a.m1524c();
        return (strM1524c == null || strM1524c.isEmpty()) ? this.f754c.f756b.m1181e() : strM1524c;
    }

    /* JADX INFO: renamed from: a */
    public final void m1484a(File file) {
        this.f754c = new b(file);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1485a() {
        b bVar = this.f754c;
        if (bVar != null) {
            return bVar.m1501c();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m1486b() {
        File fileM1388f = C1434j.m1388f(this.f754c.m1500b());
        if (!fileM1388f.exists()) {
            return null;
        }
        try {
            String strM1323a = C1430f.m1323a(fileM1388f.getAbsolutePath(), "\n");
            if (strM1323a != null && !strM1323a.isEmpty()) {
                return new JSONObject(strM1323a);
            }
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m1487c() {
        BufferedWriter bufferedWriter;
        Throwable th;
        try {
            File fileM1385e = C1434j.m1385e(this.f754c.m1500b());
            File file = new File(fileM1385e.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i = 0;
            if (fileM1385e.exists()) {
                while (i < NativeCrashCollector.m1443a()) {
                    File file2 = new File(fileM1385e.getAbsolutePath() + '.' + i);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i++;
                }
                return;
            }
            C1395a c1395a = new C1395a();
            for (int i2 = 0; i2 < NativeCrashCollector.m1443a(); i2++) {
                File file3 = new File(fileM1385e.getAbsolutePath() + '.' + i2);
                if (file3.exists()) {
                    try {
                        String strM1323a = C1430f.m1323a(file3.getAbsolutePath(), "\n");
                        if (!TextUtils.isEmpty(strM1323a)) {
                            JSONObject jSONObject = new JSONObject(strM1323a);
                            if (jSONObject.length() > 0) {
                                c1395a.m1103c(jSONObject);
                            }
                        }
                    } catch (JSONException e2) {
                        C1386c.m990a();
                        C1468j.m1652a(e2, "NPTH_CATCH");
                    }
                }
            }
            JSONObject jSONObjectM1102c = c1395a.m1102c();
            try {
                if (jSONObjectM1102c.length() != 0 && jSONObjectM1102c.opt(C11744X3.a.f26174k) == null) {
                    C1390e.m1032g();
                    C1395a.m1082a(jSONObjectM1102c, C1438n.m1434a());
                }
            } catch (Throwable unused) {
            }
            if (jSONObjectM1102c.length() != 0) {
                this.f753b = jSONObjectM1102c;
                if (jSONObjectM1102c != null) {
                    file.getParentFile().mkdirs();
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                        try {
                            C1432h.m1357a(jSONObjectM1102c, bufferedWriter);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                try {
                                    jSONObjectM1102c.put("err_write", th.toString());
                                    C1395a.m1079a(jSONObjectM1102c, "filters", "err_write", th.getLocalizedMessage());
                                } catch (Throwable th3) {
                                    C1373a.m860a((Closeable) bufferedWriter);
                                    throw th3;
                                }
                            } catch (JSONException unused2) {
                            }
                            C1386c.m990a();
                            C1468j.m1652a(th, "NPTH_CATCH");
                        }
                    } catch (Throwable th4) {
                        bufferedWriter = null;
                        th = th4;
                    }
                    C1373a.m860a((Closeable) bufferedWriter);
                }
                if (file.renameTo(fileM1385e)) {
                    while (i < NativeCrashCollector.m1443a()) {
                        File file4 = new File(fileM1385e.getAbsolutePath() + '.' + i);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i++;
                    }
                }
            }
        } catch (IOException e3) {
            C1386c.m990a();
            C1468j.m1652a(e3, "NPTH_CATCH");
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1488d() {
        ICrashFilter iCrashFilterM894b = C1390e.m1021b().m894b();
        if (iCrashFilterM894b == null) {
            return true;
        }
        try {
            return iCrashFilterM894b.onNativeCrashFilter(m1483l(), "");
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1489e() {
        return C1391a.m1050a().m1054a(C1434j.m1388f(this.f754c.m1500b()).getAbsolutePath());
    }

    /* JADX INFO: renamed from: f */
    public final void m1490f() {
        C1391a.m1050a().m1053a(C1389a.m1011b(C1434j.m1388f(this.f754c.m1500b()).getAbsolutePath()));
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m1491h() {
        try {
            C1395a c1395a = new C1395a();
            Header header = new Header(this.f752a);
            JSONObject jSONObjectM1712a = C1473o.m1709a().m1712a(this.f754c.m1499a());
            if (jSONObjectM1712a != null) {
                header.m1072a(jSONObjectM1712a);
                header.m1074d();
                header.m1075e();
            }
            Header.m1065b(header);
            c1395a.m1089a(header);
            boolean z = true;
            c1395a.m1095a("is_native_crash", (Object) 1);
            c1395a.m1095a("repack_time", Long.valueOf(System.currentTimeMillis()));
            c1395a.m1095a("crash_uuid", this.f754c.m1500b().getName());
            b bVar = this.f754c;
            Map<String, String> mapM1182f = bVar != null ? bVar.f756b.m1182f() : null;
            if (mapM1182f != null) {
                Object obj = (String) mapM1182f.get("process_name");
                if (obj != null) {
                    c1395a.m1095a("process_name", obj);
                }
                String str = mapM1182f.get("start_time");
                if (str != null) {
                    try {
                        c1395a.m1088a(Long.decode(str).longValue());
                    } catch (Throwable th) {
                        C1386c.m990a();
                        C1468j.m1652a(th, "NPTH_CATCH");
                    }
                }
                String str2 = mapM1182f.get("pid");
                if (str2 != null) {
                    try {
                        c1395a.m1095a("pid", Long.decode(str2));
                    } catch (Throwable th2) {
                        C1386c.m990a();
                        C1468j.m1652a(th2, "NPTH_CATCH");
                    }
                }
                Object obj2 = (String) mapM1182f.get("crash_thread_name");
                if (obj2 != null) {
                    c1395a.m1095a("crash_thread_name", obj2);
                }
                String str3 = mapM1182f.get("crash_time");
                if (str3 != null) {
                    try {
                        c1395a.m1095a("crash_time", Long.decode(str3));
                    } catch (Throwable th3) {
                        C1386c.m990a();
                        C1468j.m1652a(th3, "NPTH_CATCH");
                    }
                }
                c1395a.m1095a("data", m1483l());
            }
            Map<String, String> mapM1522b = this.f754c.f755a.m1522b();
            if (!mapM1522b.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str4 : mapM1522b.keySet()) {
                    String strM1478a = m1478a(mapM1522b.get(str4));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lib_name", str4);
                        jSONObject.put("lib_uuid", strM1478a);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        C1386c.m990a();
                        C1468j.m1652a(e2, "NPTH_CATCH");
                    }
                }
                c1395a.m1095a("crash_lib_uuid", (Object) jSONArray);
            }
            File fileM1385e = C1434j.m1385e(this.f754c.m1500b());
            if (fileM1385e.exists() || this.f753b != null) {
                try {
                    JSONObject jSONObject2 = this.f753b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject(C1430f.m1323a(fileM1385e.getAbsolutePath(), "\n"));
                    }
                    c1395a.m1103c(jSONObject2);
                    c1395a.m1091a("has_callback", "true");
                    if (c1395a.m1102c().opt(C11744X3.a.f26174k) == null) {
                        C1390e.m1032g();
                        c1395a.m1099b(C1438n.m1434a());
                    }
                    C1373a.m859a(c1395a, c1395a.m1104d(), CrashType.NATIVE);
                } catch (Throwable th4) {
                    C1386c.m990a();
                    C1468j.m1652a(th4, "NPTH_CATCH");
                }
                long j = -1;
                long jOptLong = c1395a.m1102c().optLong("crash_time", -1L);
                long jOptLong2 = c1395a.m1102c().optLong("java_end", -1L);
                if (jOptLong2 != -1 && jOptLong != -1) {
                    j = jOptLong2 - jOptLong;
                }
                try {
                    c1395a.m1097b("total_cost", String.valueOf(j));
                    c1395a.m1091a("total_cost", String.valueOf(j / 1000));
                } catch (Throwable unused) {
                }
            } else {
                C1390e.m1032g();
                c1395a.m1099b(C1438n.m1434a());
                c1395a.m1091a("has_callback", "false");
            }
            File fileM1391g = C1434j.m1391g(this.f754c.m1500b());
            String strM1411a = "";
            if (fileM1391g.exists()) {
                try {
                    strM1411a = C1437m.m1411a(fileM1391g.getAbsolutePath());
                } catch (Throwable th5) {
                    C1386c.m990a();
                    C1468j.m1652a(th5, "NPTH_CATCH");
                }
            }
            File fileM1403o = C1434j.m1403o(this.f754c.m1500b());
            if (fileM1403o.exists()) {
                String strM1495b = a.m1495b(fileM1403o);
                strM1411a = strM1411a.isEmpty() ? strM1495b : strM1411a + "\n" + strM1495b;
            }
            try {
                if (!strM1411a.isEmpty()) {
                    c1395a.m1095a("java_data", (Object) strM1411a);
                }
            } catch (Throwable th6) {
                C1386c.m990a();
                C1468j.m1652a(th6, "NPTH_CATCH");
            }
            m1480b(c1395a);
            m1479a(c1395a);
            C1398d.m1122b(c1395a.m1102c());
            Map<? extends String, ? extends String> map = new HashMap<>();
            if (m1482k()) {
                map.put("is_root", "true");
                c1395a.m1095a("is_root", "true");
            } else {
                map.put("is_root", "false");
                c1395a.m1095a("is_root", "false");
            }
            map.put("has_fds_file", C1434j.m1396i(this.f754c.m1500b()).exists() ? "true" : "false");
            File fileM1394h = C1434j.m1394h(this.f754c.m1500b());
            map.put("has_logcat_file", (!fileM1394h.exists() || fileM1394h.length() <= 128) ? "false" : "true");
            map.put("has_maps_file", C1434j.m1382d(this.f754c.m1500b()).exists() ? "true" : "false");
            map.put("has_tombstone_file", C1434j.m1374b(this.f754c.m1500b()).exists() ? "true" : "false");
            map.put("has_meminfo_file", C1434j.m1399k(this.f754c.m1500b()).exists() ? "true" : "false");
            map.put("has_threads_file", C1434j.m1397j(this.f754c.m1500b()).exists() ? "true" : "false");
            int iA = new c().m1503a();
            if (iA > 0) {
                if (iA > 960) {
                    map.put("fd_leak", "true");
                } else {
                    map.put("fd_leak", "false");
                }
                c1395a.m1095a("fd_count", Integer.valueOf(iA));
            }
            int iA2 = new f().m1503a();
            if (iA2 > 0) {
                if (iA2 > 350) {
                    map.put("threads_leak", "true");
                } else {
                    map.put("threads_leak", "false");
                }
                c1395a.m1095a("threads_count", Integer.valueOf(iA2));
            }
            int iA3 = new d().m1503a();
            if (iA3 > 0) {
                if (iA3 > m1481g()) {
                    map.put("memory_leak", "true");
                } else {
                    map.put("memory_leak", "false");
                }
                c1395a.m1095a("memory_size", Integer.valueOf(iA3));
            }
            map.put("sdk_version", "2008-20250701130429");
            if (c1395a.m1102c().opt("java_data") == null) {
                z = false;
            }
            map.put("has_java_stack", String.valueOf(z));
            JSONArray jSONArrayM1505a = C1442b.m1505a(C1434j.m1400l(this.f754c.f757c), C1434j.m1401m(this.f754c.f757c));
            map.put("leak_threads_count", String.valueOf(jSONArrayM1505a.length()));
            if (jSONArrayM1505a.length() > 0) {
                try {
                    C1430f.m1329a(C1434j.m1402n(this.f754c.f757c), jSONArrayM1505a);
                } catch (Throwable unused2) {
                }
            }
            c1395a.m1100b();
            c1395a.m1091a("is_64_devices", String.valueOf(Header.m1063a()));
            c1395a.m1091a("is_64_runtime", String.valueOf(NativeImpl.m1467f()));
            c1395a.m1091a("is_x86_devices", String.valueOf(Header.m1066b()));
            c1395a.m1101c(map);
            File fileM1388f = C1434j.m1388f(this.f754c.m1500b());
            JSONObject jSONObjectM1102c = c1395a.m1102c();
            C1430f.m1330a(fileM1388f, jSONObjectM1102c);
            return jSONObjectM1102c;
        } catch (Throwable th7) {
            C1386c.m990a();
            C1468j.m1652a(th7, "NPTH_CATCH");
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1492i() {
        return C1430f.m1334a(this.f754c.m1500b());
    }

    /* JADX INFO: renamed from: j */
    public final void m1493j() {
        try {
            C1430f.m1338b(this.f754c.m1500b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + C1390e.m1032g().getPackageName() + RemoteSettings.FORWARD_SLASH_STRING + this.f754c.m1500b().getName() + ".zip");
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
    }
}
