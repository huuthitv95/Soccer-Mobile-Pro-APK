package com.apm.insight;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p018h.C1405a;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1468j;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.a */
/* JADX INFO: compiled from: AppDataCenter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1373a {

    /* JADX INFO: renamed from: a */
    private Map<CrashType, List<AttachUserData>> f363a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Map<CrashType, List<AttachUserData>> f364b = new HashMap();

    /* JADX INFO: renamed from: c */
    private Map<String, String> f365c = new HashMap();

    /* JADX INFO: renamed from: d */
    private ICrashFilter f366d = null;

    /* JADX INFO: renamed from: a */
    public static int m855a(JSONObject jSONObject, int i, String... strArr) {
        JSONObject jSONObjectM872b = m872b(jSONObject, strArr);
        if (jSONObjectM872b == null) {
            return i;
        }
        int iOptInt = jSONObjectM872b.optInt(strArr[strArr.length - 1], i);
        m863a("JSONUtil", "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + iOptInt);
        return iOptInt;
    }

    /* JADX INFO: renamed from: a */
    public static File m856a(String str, int i, int i2) {
        File file = new File(C1434j.m1369a(C1390e.m1032g(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1452a(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
        return file;
    }

    /* JADX INFO: renamed from: a */
    public static String m857a(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM872b = m872b(jSONObject, strArr);
        if (jSONObjectM872b == null) {
            return null;
        }
        String strOptString = jSONObjectM872b.optString(strArr[1]);
        m863a("ApmConfig", "normal get configArray: " + strArr[1] + " : " + strOptString);
        return strOptString;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m858a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static void m859a(C1395a c1395a, Header header, CrashType crashType) {
        JSONObject jSONObjectM1102c;
        if (c1395a == null || (jSONObjectM1102c = c1395a.m1102c()) == null || crashType == null) {
            return;
        }
        long jOptLong = jSONObjectM1102c.optLong("crash_time");
        String strM1639a = C1390e.m1024c().m1639a();
        if (jOptLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            String str = "android__" + strM1639a + "_" + jOptLong + "_" + crashType;
            if (header == null) {
                jSONObjectM1102c.put("unique_key", str);
                return;
            }
            JSONObject jSONObjectM1076f = header.m1076f();
            if (jSONObjectM1076f != null) {
                jSONObjectM1076f.put("unique_key", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m860a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m861a(Object obj) {
        if (C1390e.m1034i().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m862a(String str) {
        C1405a.m1173a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(FacebookRequestErrorClassification.ESC_APP_INACTIVE), -1, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m863a(String str, Object obj) {
        if (C1390e.m1034i().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m864a(String str, Object obj, Throwable th) {
        if (C1390e.m1034i().isDebugMode()) {
            Log.e("npth", str + " " + obj, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m865a(Throwable th) {
        if (C1390e.m1034i().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m866a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m867a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m868a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m869a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m870a(JSONObject jSONObject, String str) {
        return m869a(jSONObject) || m868a(jSONObject.optJSONArray(str));
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m871b(JSONArray jSONArray) {
        int i;
        if (jSONArray.length() <= 384) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        int i2 = 0;
        while (true) {
            if (i2 >= 256) {
                break;
            }
            jSONArray2.put(jSONArray.opt(i2));
            i2++;
        }
        for (i = 256; i < 384; i++) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (384 - i)));
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m872b(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            m864a("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                m863a("JSONUtil", "err get json: not found node:" + strArr[i]);
                return null;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m873b(Object obj) {
        if (C1390e.m1034i().isDebugMode()) {
            Log.d("npth", String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m874b(Throwable th) {
        if (C1390e.m1034i().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m875b(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m876c() {
        File[] fileArrListFiles;
        File file = new File(C1390e.m1032g().getFilesDir(), "apminsight/crashCommand");
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    file2.getName().split("_")[0].equals("0");
                    file2.delete();
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                    try {
                        file2.delete();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m877c(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> arrayList;
        if (this.f363a.get(crashType) == null) {
            arrayList = new ArrayList<>();
            this.f363a.put(crashType, arrayList);
        } else {
            arrayList = this.f363a.get(crashType);
        }
        arrayList.add(attachUserData);
    }

    /* JADX INFO: renamed from: d */
    public static void m878d() {
        try {
            m856a(C1390e.m1030f(), C1390e.m1034i().getLogcatDumpCount(), C1390e.m1034i().getLogcatLevel());
            if (C1390e.m1047v()) {
                m884g();
                m886i();
                m885h();
                m887j();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m879d(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> arrayList;
        if (this.f364b.get(crashType) == null) {
            arrayList = new ArrayList<>();
            this.f364b.put(crashType, arrayList);
        } else {
            arrayList = this.f364b.get(crashType);
        }
        arrayList.add(attachUserData);
    }

    /* JADX INFO: renamed from: e */
    public static File m880e() throws Throwable {
        BufferedWriter bufferedWriter;
        File file = new File(C1434j.m1384e(C1390e.m1032g()), "anr_trace.txt");
        if (!file.exists() && C1447a.m1540e()) {
            File file2 = new File("/data/anr/traces.txt");
            if (file2.exists()) {
                BufferedReader bufferedReader = null;
                try {
                    file.getParentFile().mkdirs();
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                        int length = 0;
                        do {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                bufferedWriter.write(line);
                                bufferedWriter.write(10);
                                length += line.length();
                            } catch (IOException unused) {
                                bufferedReader = bufferedReader2;
                                m860a((Closeable) bufferedReader);
                                m860a((Closeable) bufferedWriter);
                                return file;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                m860a((Closeable) bufferedReader);
                                m860a((Closeable) bufferedWriter);
                                throw th;
                            }
                        } while (length < 1048576);
                        m860a((Closeable) bufferedReader2);
                        m860a((Closeable) bufferedWriter);
                        return file;
                    } catch (IOException unused2) {
                        bufferedWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = null;
                    }
                } catch (IOException unused3) {
                    bufferedWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                }
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    private void m881e(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.f363a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m882f() {
        try {
            return new File("/proc/" + Process.myPid() + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m883f(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.f364b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    /* JADX INFO: renamed from: g */
    private static File m884g() {
        File file = new File(C1434j.m1384e(C1390e.m1032g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1466f(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: h */
    private static File m885h() {
        File file = new File(C1434j.m1384e(C1390e.m1032g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1463d(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: i */
    private static File m886i() {
        File file = new File(C1434j.m1384e(C1390e.m1032g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1464e(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: j */
    private static File m887j() {
        File file = new File(C1434j.m1384e(C1390e.m1032g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1469g(file.getAbsolutePath());
        return file;
    }

    /* JADX INFO: renamed from: a */
    public final List<AttachUserData> m888a(CrashType crashType) {
        return this.f363a.get(crashType);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m889a() {
        return this.f365c;
    }

    /* JADX INFO: renamed from: a */
    final void m890a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType != CrashType.ALL) {
            m877c(crashType, attachUserData);
            return;
        }
        m877c(CrashType.LAUNCH, attachUserData);
        m877c(CrashType.JAVA, attachUserData);
        m877c(CrashType.CUSTOM_JAVA, attachUserData);
        m877c(CrashType.NATIVE, attachUserData);
        m877c(CrashType.ANR, attachUserData);
        m877c(CrashType.DART, attachUserData);
    }

    /* JADX INFO: renamed from: a */
    final void m891a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType != CrashType.ALL) {
            m881e(crashType, attachUserData);
            return;
        }
        m881e(CrashType.LAUNCH, attachUserData);
        m881e(CrashType.JAVA, attachUserData);
        m881e(CrashType.CUSTOM_JAVA, attachUserData);
        m881e(CrashType.NATIVE, attachUserData);
        m881e(CrashType.ANR, attachUserData);
        m881e(CrashType.DART, attachUserData);
    }

    /* JADX INFO: renamed from: a */
    final void m892a(ICrashFilter iCrashFilter) {
        this.f366d = iCrashFilter;
    }

    /* JADX INFO: renamed from: a */
    final void m893a(Map<? extends String, ? extends String> map) {
        this.f365c.putAll(map);
    }

    /* JADX INFO: renamed from: b */
    public final ICrashFilter m894b() {
        return this.f366d;
    }

    /* JADX INFO: renamed from: b */
    public final List<AttachUserData> m895b(CrashType crashType) {
        return this.f364b.get(crashType);
    }

    /* JADX INFO: renamed from: b */
    final void m896b(AttachUserData attachUserData, CrashType crashType) {
        if (crashType != CrashType.ALL) {
            m879d(crashType, attachUserData);
            return;
        }
        m879d(CrashType.LAUNCH, attachUserData);
        m879d(CrashType.JAVA, attachUserData);
        m879d(CrashType.CUSTOM_JAVA, attachUserData);
        m879d(CrashType.NATIVE, attachUserData);
        m879d(CrashType.ANR, attachUserData);
        m879d(CrashType.DART, attachUserData);
    }

    /* JADX INFO: renamed from: b */
    final void m897b(CrashType crashType, AttachUserData attachUserData) {
        if (crashType != CrashType.ALL) {
            m883f(crashType, attachUserData);
            return;
        }
        m883f(CrashType.LAUNCH, attachUserData);
        m883f(CrashType.JAVA, attachUserData);
        m883f(CrashType.CUSTOM_JAVA, attachUserData);
        m883f(CrashType.NATIVE, attachUserData);
        m883f(CrashType.ANR, attachUserData);
        m883f(CrashType.DART, attachUserData);
    }
}
