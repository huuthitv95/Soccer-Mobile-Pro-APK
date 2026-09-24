package com.apm.insight.nativecrash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.ICommonParams;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1468j;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C12460ra;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.nativecrash.b */
/* JADX INFO: compiled from: NativeFileParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1442b {

    /* JADX INFO: renamed from: a */
    private Context f768a;

    /* JADX INFO: renamed from: b */
    private ICommonParams f769b;

    /* JADX INFO: renamed from: c */
    private ICommonParams f770c;

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$a */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class a extends c {
        a(File file) {
            super(file);
            this.f772b = "Total FD Count:";
            this.f773c = CertificateUtil.DELIMITER;
            this.f774d = -2;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$b */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class b extends c {
        b(File file) {
            super(file);
            this.f772b = "VmSize:";
            this.f773c = "\\s+";
            this.f774d = -1;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$c */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        protected File f771a;

        /* JADX INFO: renamed from: b */
        protected String f772b;

        /* JADX INFO: renamed from: c */
        protected String f773c;

        /* JADX INFO: renamed from: d */
        protected int f774d;

        public c(File file) {
            this.f771a = file;
        }

        /* JADX INFO: renamed from: a */
        private int m1515a(String str) {
            int i = this.f774d;
            if (!str.startsWith(this.f772b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f773c)[1].trim());
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
        public final int m1516a() {
            int i;
            Throwable th;
            if (!this.f771a.exists() || !this.f771a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f771a));
                int iM1515a = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iM1515a = m1515a(line);
                    } catch (Throwable th2) {
                        th = th2;
                        i = iM1515a;
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
                } while (iM1515a == -1);
                C1373a.m860a((Closeable) bufferedReader2);
                return iM1515a;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$d */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class d extends c {
        d(File file) {
            super(file);
        }

        /* JADX INFO: renamed from: b */
        public final HashMap<String, List<String>> m1517b() {
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                JSONArray jSONArrayM1325a = C1430f.m1325a(this.f771a.getAbsolutePath());
                if (jSONArrayM1325a != null) {
                    for (int i = 0; i < jSONArrayM1325a.length(); i++) {
                        String strOptString = jSONArrayM1325a.optString(i);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                            int iIndexOf = strOptString.indexOf("[routine:0x");
                            int i2 = iIndexOf + 11;
                            String strSubstring = iIndexOf > 0 ? strOptString.substring(i2, strOptString.indexOf(93, i2)) : "unknown addr";
                            List<String> arrayList = map.get(strSubstring);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                map.put(strSubstring, arrayList);
                            }
                            arrayList.add(strOptString);
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$e */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class e extends c {
        e(File file) {
            super(file);
        }

        /* JADX INFO: renamed from: a */
        public final JSONArray m1518a(HashMap<String, List<String>> map) {
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (!map.isEmpty()) {
                try {
                    JSONArray jSONArrayM1325a = C1430f.m1325a(this.f771a.getAbsolutePath());
                    if (jSONArrayM1325a != null) {
                        for (int i = 0; i < jSONArrayM1325a.length(); i++) {
                            String strOptString = jSONArrayM1325a.optString(i);
                            if (!TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(CertificateUtil.DELIMITER)) > 2) {
                                String strSubstring = strOptString.substring(2, iIndexOf);
                                if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                                    Iterator<String> it = list.iterator();
                                    while (it.hasNext()) {
                                        jSONArray.put(it.next() + " " + strOptString);
                                    }
                                    map.remove(strSubstring);
                                }
                            }
                        }
                        Iterator<List<String>> it2 = map.values().iterator();
                        while (it2.hasNext()) {
                            Iterator<String> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                jSONArray.put(it3.next() + "  0x000000:unknown");
                            }
                        }
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
            }
            return jSONArray;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$f */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class f extends c {
        f(File file) {
            super(file);
            this.f772b = "Total Threads Count:";
            this.f773c = CertificateUtil.DELIMITER;
            this.f774d = -2;
        }
    }

    public C1442b(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public C1442b(Context context, ICommonParams iCommonParams, C1442b c1442b) {
        this.f768a = context;
        this.f769b = iCommonParams;
        this.f770c = c1442b == null ? null : c1442b.f769b;
    }

    /* JADX INFO: renamed from: a */
    public static int m1504a(String str) {
        return new a(C1434j.m1375b(str)).m1516a();
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1505a(File file, File file2) {
        return new e(file2).m1518a(new d(file).m1517b());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1506a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static int m1507b(String str) {
        return new f(C1434j.m1379c(str)).m1516a();
    }

    /* JADX INFO: renamed from: c */
    public static int m1508c(String str) {
        return new b(C1434j.m1383d(str)).m1516a();
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m1509a() {
        Object obj;
        Map<String, Object> mapM1510b = m1510b();
        if (((mapM1510b == null || (obj = mapM1510b.get(C12460ra.f31825b)) == null) ? null : String.valueOf(obj)) == null) {
            mapM1510b.put(C12460ra.f31825b, 4444);
        }
        return mapM1510b;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m1510b() {
        Map<String, Object> map;
        Throwable th;
        Map<String, Object> map2;
        try {
            ICommonParams iCommonParams = this.f770c;
            map2 = iCommonParams != null ? iCommonParams.getCommonParams() : new HashMap<>();
            try {
                map2.putAll(this.f769b.getCommonParams());
                th = null;
            } catch (Throwable th2) {
                map = map2;
                th = th2;
                Map<String, Object> map3 = map;
                th = th;
                map2 = map3;
            }
        } catch (Throwable th3) {
            th = th3;
            map = null;
        }
        if (map2 == null) {
            map2 = new HashMap<>(4);
            if (th != null) {
                try {
                    map2.put("err_info", C1437m.m1412a(th));
                } catch (Throwable unused) {
                }
            }
        }
        if (m1506a(map2)) {
            try {
                PackageInfo packageInfo = this.f768a.getPackageManager().getPackageInfo(this.f768a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    Object obj = packageInfo.applicationInfo.metaData != null ? packageInfo.applicationInfo.metaData.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map2.put("version_name", C1425a.m1294c(this.f768a));
                map2.put("version_code", Integer.valueOf(C1425a.m1295d(this.f768a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                String str = this.f768a.getPackageManager().getPackageInfo(this.f768a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f768a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: c */
    public final ICommonParams m1511c() {
        return this.f769b;
    }

    /* JADX INFO: renamed from: d */
    public final String m1512d() {
        try {
            return this.f769b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m1513e() {
        try {
            return String.valueOf(this.f769b.getCommonParams().get(C12460ra.f31825b));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m1514f() {
        try {
            return this.f769b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
