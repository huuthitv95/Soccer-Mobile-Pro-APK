package com.apm.insight.p022l;

import android.text.TextUtils;
import androidx.room.FtsOptions;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p016f.C1400b;
import com.apm.insight.p021k.C1418e;
import com.apm.insight.runtime.C1468j;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C12460ra;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.l.f */
/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1430f {

    /* JADX INFO: renamed from: a */
    private final int f722a;

    /* JADX INFO: renamed from: b */
    private String f723b;

    /* JADX INFO: renamed from: c */
    private JSONObject f724c;

    /* JADX INFO: renamed from: d */
    private byte[] f725d;

    public C1430f(int i) {
        this.f722a = i;
    }

    public C1430f(int i, Throwable th) {
        this.f722a = i;
        this.f723b = th.getMessage();
    }

    public C1430f(String str) {
        this.f722a = 206;
        this.f723b = str;
    }

    public C1430f(JSONObject jSONObject) {
        this.f722a = 0;
        this.f724c = jSONObject;
    }

    public C1430f(byte[] bArr) {
        this.f722a = 204;
        this.f725d = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX INFO: renamed from: a */
    private static C1395a m1319a(File file, boolean z) {
        String strM1323a;
        String str;
        String str2;
        C1395a c1395a = new C1395a();
        String string = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
        if (file.exists()) {
            try {
                strM1323a = m1323a(file.getAbsolutePath(), "\n");
            } catch (IOException unused) {
                strM1323a = null;
            }
            if (TextUtils.isEmpty(strM1323a)) {
                if (!z) {
                    string = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
                }
                str2 = null;
                str = null;
            } else {
                String[] strArrSplit = strM1323a.split("\n");
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z2 = false;
                boolean z3 = false;
                for (String str3 : strArrSplit) {
                    if (!z2 && str3.startsWith("stack:")) {
                        z2 = true;
                    } else if (!z3 && str3.startsWith("err:")) {
                        z3 = true;
                    } else if (z3) {
                        sb2.append(str3);
                        sb2.append("\n");
                    } else if (z2) {
                        sb.append(str3);
                        sb.append("\n");
                    } else {
                        arrayList.add(str3);
                    }
                }
                String str4 = arrayList.size() > 0 ? (String) arrayList.get(0) : null;
                String str5 = arrayList.size() >= 2 ? (String) arrayList.get(1) : null;
                String str6 = arrayList.size() >= 3 ? (String) arrayList.get(2) : null;
                String str7 = arrayList.size() >= 4 ? (String) arrayList.get(3) : null;
                if (z2 && sb.length() > 0) {
                    string = sb.toString();
                } else if (str6 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str6);
                    sb3.append("\nCaused by: ");
                    sb3.append(z ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                    string = sb3.toString();
                } else if (str5 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str5);
                    sb4.append("\nCaused by: ");
                    sb4.append(z ? "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n" : "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n");
                    string = sb4.toString();
                } else if (!z) {
                    string = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
                }
                if (z3 && sb2.length() > 0) {
                    string = string + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth error when dumpping the stack:\n" + ((Object) sb2);
                }
                str = str4;
                str2 = str7;
            }
        } else {
            if (!z) {
                string = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
            }
            str2 = null;
            str = null;
        }
        c1395a.m1095a("data", (Object) string);
        c1395a.m1095a("process_name", (Object) str);
        c1395a.m1095a("crash_thread_name", (Object) str2);
        c1395a.m1095a("isOOM", Boolean.valueOf(z));
        return c1395a;
    }

    /* JADX INFO: renamed from: a */
    public static C1400b m1320a(File file, CrashType crashType) {
        C1395a c1395aM1344f = m1344f(file);
        String name = file.getName();
        String strSubstring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject jSONObjectOptJSONObject = c1395aM1344f.m1102c().optJSONObject("header");
        if (jSONObjectOptJSONObject.optString("unique_key", null) == null) {
            try {
                jSONObjectOptJSONObject.put("unique_key", "android_" + C1390e.m1024c().m1639a() + "_" + strSubstring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        C1400b c1400b = new C1400b();
        c1400b.m1133a(crashType == CrashType.LAUNCH ? C1418e.m1249e() : C1418e.m1245c());
        c1400b.m1135a(c1395aM1344f.m1102c());
        c1400b.m1136a(C1418e.m1237a());
        return c1400b;
    }

    /* JADX INFO: renamed from: a */
    public static String m1321a(File file, String str) throws IOException {
        return m1336b(file, str);
    }

    /* JADX INFO: renamed from: a */
    public static String m1322a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return m1337b(file, str, str2, jSONObject, z);
    }

    /* JADX INFO: renamed from: a */
    public static String m1323a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m1336b(new File(str), str2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1324a(File file, long j) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C1373a.m860a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    C1373a.m860a((Closeable) bufferedReader2);
                    return jSONArray;
                }
                jSONArray.put(line);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1325a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m1324a(new File(str), -1L);
    }

    /* JADX INFO: renamed from: a */
    public static void m1326a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                    C1373a.m860a((Closeable) fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        C1373a.m860a((Closeable) fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        C1373a.m860a((Closeable) fileInputStream);
                        C1373a.m860a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    C1373a.m860a((Closeable) fileInputStream);
                    C1373a.m860a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        C1373a.m860a((Closeable) fileOutputStream);
    }

    /* JADX INFO: renamed from: a */
    public static void m1327a(File file, String str, boolean z) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                C1373a.m860a((Closeable) fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C1373a.m860a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1328a(File file, Map<String, String> map) throws Throwable {
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    C1373a.m860a((Closeable) fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    C1373a.m874b((Throwable) e);
                    C1373a.m860a((Closeable) fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C1373a.m860a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1329a(File file, JSONArray jSONArray) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                C1432h.m1355a(jSONArray, bufferedWriter);
                C1373a.m860a((Closeable) bufferedWriter);
            } catch (Throwable unused) {
                C1373a.m860a((Closeable) bufferedWriter);
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1330a(File file, JSONObject jSONObject) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                C1432h.m1357a(jSONObject, bufferedWriter);
                C1373a.m860a((Closeable) bufferedWriter);
            } catch (Throwable unused) {
                C1373a.m860a((Closeable) bufferedWriter);
            }
        } catch (Throwable unused2) {
            bufferedWriter = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1331a(OutputStream outputStream, File... fileArr) throws IOException {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry(RemoteSettings.FORWARD_SLASH_STRING));
                for (File file : fileArr) {
                    m1332a(zipOutputStream2, file);
                }
                C1373a.m860a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                C1373a.m860a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1332a(ZipOutputStream zipOutputStream, File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            m1333a(zipOutputStream, file2, file2.getName());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1333a(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str + RemoteSettings.FORWARD_SLASH_STRING));
            String str2 = str.length() == 0 ? "" : str + RemoteSettings.FORWARD_SLASH_STRING;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                m1333a(zipOutputStream, fileArrListFiles[i], str2 + fileArrListFiles[i].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = fileInputStream2.read(bArr);
                    if (-1 == i2) {
                        C1373a.m860a((Closeable) fileInputStream2);
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C1373a.m860a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1334a(File file) {
        boolean zM1334a;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isFile()) {
                if (fileArrListFiles[i].canWrite()) {
                    zM1334a = fileArrListFiles[i].delete();
                } else {
                    z = false;
                }
            } else {
                zM1334a = m1334a(fileArrListFiles[i]);
            }
            z &= zM1334a;
        }
        return file.delete() & z;
    }

    /* JADX INFO: renamed from: b */
    public static C1400b m1335b(String str) {
        try {
            String strM1323a = m1323a(str, "\n");
            if (strM1323a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM1323a);
            C1400b c1400b = new C1400b();
            c1400b.m1133a(jSONObject.optString("url"));
            c1400b.m1135a(jSONObject.optJSONObject("body"));
            c1400b.m1138b(jSONObject.optString("dump_file"));
            c1400b.m1136a(jSONObject.optBoolean("encrypt", false));
            return c1400b;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m1336b(File file, String str) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        C1373a.m860a((Closeable) bufferedReader2);
                        return sb.toString();
                    }
                    if (sb.length() != 0 && str != null) {
                        sb.append(str);
                    }
                    sb.append(line);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C1373a.m860a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m1337b(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", z);
            m1330a(file2, jSONObject2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static void m1338b(String str, String str2) throws Exception {
        ZipOutputStream zipOutputStream;
        Throwable th;
        File file = new File(str);
        try {
            new File(str2).getParentFile().mkdirs();
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
            try {
                m1333a(zipOutputStream, file, "");
                C1373a.m860a((Closeable) zipOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C1373a.m860a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            zipOutputStream = null;
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1339b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    /* JADX INFO: renamed from: c */
    public static C1400b m1340c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m1323a(str, "\n"));
            C1400b c1400b = new C1400b();
            c1400b.m1142d(jSONObject.optString(C12460ra.f31825b));
            c1400b.m1140c(jSONObject.optString("did"));
            c1400b.m1144e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alogFiles");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
                c1400b.m1134a(arrayList);
            }
            return c1400b;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:21:0x0041 */
    /* JADX INFO: renamed from: c */
    public static Map<String, String> m1341c(File file) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                Properties properties = new Properties();
                fileInputStream = new FileInputStream(file);
                try {
                    properties.load(fileInputStream);
                    Set<String> setStringPropertyNames = properties.stringPropertyNames();
                    HashMap map = new HashMap();
                    for (String str : setStringPropertyNames) {
                        map.put(str, properties.getProperty(str));
                    }
                    C1373a.m860a((Closeable) fileInputStream);
                    return map;
                } catch (IOException e) {
                    e = e;
                    C1373a.m874b((Throwable) e);
                    C1373a.m860a((Closeable) fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                C1373a.m860a(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C1373a.m860a(closeable2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1342d(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.m1460c(file2.getAbsolutePath());
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1343e(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int iM1460c = NativeImpl.m1460c(file.getAbsolutePath());
            if (iM1460c > 0) {
                NativeImpl.m1447a(iM1460c);
                return false;
            }
            if (iM1460c < 0) {
                return true;
            }
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private static C1395a m1344f(File file) {
        C1395a c1395aM1319a = m1319a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < 6; i++) {
            File fileM1371a = C1434j.m1371a(file, ".".concat(String.valueOf(i)));
            if (fileM1371a.exists()) {
                try {
                    c1395aM1319a.m1103c(new JSONObject(m1323a(fileM1371a.getAbsolutePath(), "\n")));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        c1395aM1319a.m1091a("crash_type", z ? "step" : FtsOptions.TOKENIZER_SIMPLE);
        JSONObject jSONObjectOptJSONObject = c1395aM1319a.m1102c().optJSONObject("header");
        C1390e.m1032g();
        JSONObject jSONObjectM1076f = Header.m1060a(c1395aM1319a.m1102c().optLong("crash_time", 0L)).m1076f();
        if (jSONObjectOptJSONObject == null) {
            c1395aM1319a.m1094a(jSONObjectM1076f);
        } else {
            C1373a.m867a(jSONObjectOptJSONObject, jSONObjectM1076f);
        }
        return c1395aM1319a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1345a() {
        return this.f722a != 207;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1346b() {
        return this.f725d;
    }
}
