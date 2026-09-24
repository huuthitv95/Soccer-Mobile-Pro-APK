package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.entity.Header;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.runtime.p023a.C1449b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.runtime.o */
/* JADX INFO: compiled from: RuntimeContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1473o {

    /* JADX INFO: renamed from: a */
    private static C1473o f889a;

    /* JADX INFO: renamed from: b */
    private File f890b;

    /* JADX INFO: renamed from: c */
    private File f891c;

    /* JADX INFO: renamed from: d */
    private File f892d;

    /* JADX INFO: renamed from: e */
    private Context f893e;

    /* JADX INFO: renamed from: f */
    private a f894f = null;

    /* JADX INFO: renamed from: com.apm.insight.runtime.o$a */
    /* JADX INFO: compiled from: RuntimeContext.java */
    static class a {

        /* JADX INFO: renamed from: a */
        private long f897a;

        /* JADX INFO: renamed from: b */
        private long f898b;

        /* JADX INFO: renamed from: c */
        private File f899c;

        /* JADX INFO: renamed from: d */
        private JSONObject f900d;

        private a(File file) {
            this.f900d = null;
            this.f899c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f897a = Long.parseLong(strArrSplit[0]);
                this.f898b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j = Long.parseLong(strSubstring);
                this.f897a = j;
                this.f898b = j;
            }
        }

        /* synthetic */ a(File file, byte b) {
            this(file);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public JSONObject m1719a() {
            if (this.f900d == null) {
                try {
                    this.f900d = new JSONObject(C1430f.m1323a(this.f899c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f900d == null) {
                    this.f900d = new JSONObject();
                }
            }
            return this.f900d;
        }

        /* JADX INFO: renamed from: a */
        static /* synthetic */ boolean m1721a(a aVar, long j) {
            long j2 = aVar.f897a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = aVar.f898b;
            if (j3 >= j || j - j3 <= 604800000) {
                return aVar.f899c.lastModified() < j && j - aVar.f899c.lastModified() > 604800000;
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m1724d(a aVar) {
            aVar.f899c.delete();
        }
    }

    private C1473o(Context context) {
        File fileM1377c = C1434j.m1377c(context);
        if (!fileM1377c.exists() || (!fileM1377c.isDirectory() && fileM1377c.delete())) {
            fileM1377c.mkdirs();
            C1449b.m1552a();
        }
        this.f890b = fileM1377c;
        this.f891c = new File(fileM1377c, "did");
        this.f892d = new File(fileM1377c, "device_uuid");
        this.f893e = context;
    }

    /* JADX INFO: renamed from: a */
    public static C1473o m1709a() {
        if (f889a == null) {
            f889a = new C1473o(C1390e.m1032g());
        }
        return f889a;
    }

    /* JADX INFO: renamed from: a */
    private void m1710a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f890b, j + "-" + j2 + ".ctx");
        File file2 = new File(this.f890b, j + "-" + j2 + ".allData");
        try {
            C1430f.m1330a(file, jSONObject);
            C1430f.m1329a(file2, jSONArray);
            this.f894f = new a(file, (byte) 0);
        } catch (IOException e) {
            C1386c.m990a();
            C1468j.m1652a(e, "NPTH_CATCH");
        }
    }

    /* JADX INFO: renamed from: c */
    private ArrayList<a> m1711c(final String str) {
        File[] fileArrListFiles = this.f890b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            C1373a.m861a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b);
                    arrayList.add(aVar2);
                    if (this.f894f == null && ".ctx".equals(str) && (aVar == null || aVar2.f898b >= aVar.f898b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
            }
            if (this.f894f == null && aVar != null) {
                this.f894f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m1712a(long j) {
        JSONObject jSONObject;
        File file;
        boolean z;
        String strM1323a;
        Iterator<a> it = m1711c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j >= next.f897a && j <= next.f898b) {
                file = next.f899c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : m1711c(".ctx")) {
                if (aVar == null || Math.abs(aVar.f898b - j) > Math.abs(aVar2.f898b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f899c;
            z = true;
        } else {
            z = false;
        }
        if (file != null) {
            try {
                strM1323a = C1430f.m1323a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strM1323a);
                } catch (Throwable th) {
                    th = th;
                    C1386c.m990a();
                    C1468j.m1652a(new IOException("content :".concat(String.valueOf(strM1323a)), th), "NPTH_CATCH");
                }
            } catch (Throwable th2) {
                th = th2;
                strM1323a = null;
            }
        }
        if (jSONObject != null && z) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e) {
                C1386c.m990a();
                C1468j.m1652a(e, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    protected final void m1713a(String str) {
        try {
            C1430f.m1327a(this.f891c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX INFO: renamed from: a */
    public final void m1714a(Map<String, Object> map, JSONArray jSONArray) {
        char c;
        JSONObject jSONObjectM1071a = Header.m1061a(this.f893e).m1071a(map);
        if (Header.m1068c(jSONObjectM1071a)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f894f == null) {
            m1711c(".ctx");
        }
        a aVar = this.f894f;
        if (aVar == null) {
            m1710a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectM1071a, jSONArray);
            return;
        }
        JSONObject jSONObjectM1719a = aVar.m1719a();
        if (Header.m1068c(jSONObjectM1719a)) {
            c = 2;
        } else if (Header.m1068c(jSONObjectM1071a)) {
            c = 0;
        } else if (String.valueOf(jSONObjectM1071a.opt("update_version_code")).equals(String.valueOf(jSONObjectM1719a.opt("update_version_code"))) && Header.m1069d(jSONObjectM1719a)) {
            c = 1;
        } else {
            c = 2;
        }
        if (c == 1) {
            m1710a(aVar.f897a, jCurrentTimeMillis, jSONObjectM1071a, jSONArray);
            jCurrentTimeMillis = jCurrentTimeMillis;
            C1430f.m1334a(aVar.f899c);
        } else if (c == 2) {
            m1710a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectM1071a, jSONArray);
        }
        try {
            ArrayList<a> arrayListM1711c = m1711c("");
            if (arrayListM1711c.size() <= 6) {
                return;
            }
            for (a aVar2 : arrayListM1711c) {
                if (a.m1721a(aVar2, jCurrentTimeMillis)) {
                    a.m1724d(aVar2);
                }
            }
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
    }

    /* JADX INFO: renamed from: b */
    protected final String m1715b() {
        try {
            return C1430f.m1323a(this.f891c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m1716b(long j) {
        File file;
        String strM1323a;
        Iterator<a> it = m1711c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j >= next.f897a && j <= next.f898b) {
                file = next.f899c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : m1711c(".allData")) {
                if (aVar == null || Math.abs(aVar.f898b - j) > Math.abs(aVar2.f898b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f899c;
        }
        if (file != null) {
            try {
                strM1323a = C1430f.m1323a(file.getAbsolutePath(), "\n");
                try {
                    return new JSONArray(strM1323a);
                } catch (Throwable th) {
                    th = th;
                    C1386c.m990a();
                    C1468j.m1652a(new IOException("content :".concat(String.valueOf(strM1323a)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                strM1323a = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1717b(String str) {
        try {
            C1430f.m1327a(this.f892d, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m1718c() {
        try {
            return C1430f.m1323a(this.f892d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }
}
