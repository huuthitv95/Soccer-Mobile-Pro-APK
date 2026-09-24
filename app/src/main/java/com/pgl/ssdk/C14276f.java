package com.pgl.ssdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.pgl.ssdk.f */
/* JADX INFO: loaded from: classes7.dex */
public class C14276f {

    /* JADX INFO: renamed from: a */
    public static long f41324a = 28800;

    /* JADX INFO: renamed from: b */
    public static int f41325b = 5;

    /* JADX INFO: renamed from: a */
    public static long m43064a(long j, InputStream inputStream) throws IOException {
        if (j != -1) {
            return j;
        }
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j2;
            }
            j2 += (long) i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m43065a() throws JSONException {
        String[] strArr;
        Context contextM43153a = C14296z.m43153a();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (contextM43153a != null) {
            ApplicationInfo applicationInfo = contextM43153a.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                        for (File file2 : fileArrListFiles) {
                            arrayList.add(file2.getName());
                        }
                    }
                    if ("arm64".equals(file.getName())) {
                        m43068a(jSONObject2, "v8a", arrayList, false);
                    } else {
                        m43068a(jSONObject2, "v7a", arrayList, false);
                    }
                    if (jSONObject2.length() > 0) {
                        jSONObject.put("lib", jSONObject2);
                    }
                }
            }
            if (arrayList.isEmpty() && (strArr = applicationInfo.splitPublicSourceDirs) != null) {
                for (String str2 : strArr) {
                    if (str2.endsWith("armeabi-v7a.apk") || str2.endsWith("arm64_v8a.apk")) {
                        File file3 = new File(str2);
                        if (!file3.exists()) {
                            break;
                        }
                        return m43066a(file3, false);
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m43066a(File file, boolean z) {
        ZipFile zipFile;
        int i;
        char c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        try {
            try {
                zipFile = new ZipFile(file);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null) {
                            String name = zipEntryNextElement.getName();
                            if (!TextUtils.isEmpty(name) || !zipEntryNextElement.isDirectory()) {
                                String[] strArrSplit = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                                long size = zipEntryNextElement.getSize();
                                Enumeration<? extends ZipEntry> enumeration = enumerationEntries;
                                if (name.startsWith("res/drawable/")) {
                                    i = 2;
                                    if (name.length() > 13) {
                                        arrayList2.add(strArrSplit[2]);
                                    }
                                    enumerationEntries = enumeration;
                                } else {
                                    i = 2;
                                }
                                if (name.startsWith("res/")) {
                                    c = 1;
                                    if (strArrSplit.length == i) {
                                        arrayList3.add(strArrSplit[1]);
                                    }
                                    enumerationEntries = enumeration;
                                } else {
                                    c = 1;
                                }
                                if (name.startsWith("assets/") && strArrSplit.length >= 2) {
                                    arrayList.add(strArrSplit[c]);
                                    if (name.startsWith("assets/assets/resources/native/") && strArrSplit.length >= 6 && jSONObject2.length() < 10) {
                                        if (!TextUtils.isEmpty(strArrSplit[4]) && !jSONObject2.has(strArrSplit[4])) {
                                            jSONObject2.put(strArrSplit[4], m43064a(size, zipFile.getInputStream(zipEntryNextElement)));
                                        } else if (jSONObject2.has(strArrSplit[4])) {
                                            jSONObject2.put(strArrSplit[4], m43064a(size, zipFile.getInputStream(zipEntryNextElement)) + jSONObject2.getLong(strArrSplit[4]));
                                        }
                                    }
                                } else if (name.startsWith("lib/armeabi/") && name.length() > 12) {
                                    arrayList4.add(strArrSplit[2]);
                                } else if (name.startsWith("lib/armeabi-v7a/") && name.length() > 16) {
                                    arrayList5.add(strArrSplit[2]);
                                } else if (name.startsWith("lib/arm64-v8a/") && name.length() > 14) {
                                    arrayList6.add(strArrSplit[2]);
                                }
                                enumerationEntries = enumeration;
                            }
                        }
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    m43068a(jSONObject3, "eabi", arrayList4, false);
                    m43068a(jSONObject3, "v7a", arrayList5, false);
                    m43068a(jSONObject3, "v8a", arrayList6, false);
                    if (jSONObject3.length() > 0) {
                        jSONObject.put("lib", jSONObject3);
                    }
                    if (z && jSONObject3.length() <= 0) {
                        jSONObject = m43065a();
                    }
                    if (jSONObject2.length() > 0) {
                        jSONObject.put("cocos", jSONObject2);
                    }
                    m43068a(jSONObject, "assets", arrayList, false);
                    JSONObject jSONObjectM43067a = m43067a(arrayList2);
                    if (jSONObjectM43067a != null && jSONObjectM43067a.length() > 0) {
                        jSONObject.put("drawable", jSONObjectM43067a);
                    }
                    JSONObject jSONObjectM43067a2 = m43067a(arrayList3);
                    if (jSONObjectM43067a2 != null && jSONObjectM43067a2.length() > 0) {
                        jSONObject.put("res", jSONObjectM43067a2);
                    }
                } catch (Throwable unused) {
                    if (zipFile != null) {
                    }
                    return jSONObject;
                }
            } catch (Throwable unused2) {
                zipFile = null;
            }
            zipFile.close();
        } catch (IOException unused3) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m43067a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : list) {
            if (str.endsWith(".png")) {
                arrayList2.add(str.substring(0, str.lastIndexOf(".png")));
            } else if (str.endsWith(".xml")) {
                arrayList.add(str.substring(0, str.lastIndexOf(".xml")));
            } else {
                arrayList3.add(str);
            }
        }
        m43068a(jSONObject, "xml", arrayList, true);
        m43068a(jSONObject, "png", arrayList2, true);
        m43068a(jSONObject, "other", arrayList3, true);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m43068a(JSONObject jSONObject, String str, List<String> list, boolean z) {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        if (z) {
            try {
                jSONObject.put(str + "_size", list.size());
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put(str, C14284n.m43094a(list));
    }

    /* JADX INFO: renamed from: b */
    public static long m43069b() {
        Context contextM43153a = C14296z.m43153a();
        if (contextM43153a == null) {
            return 0L;
        }
        long jM43023a = C14266ax.m43023a(contextM43153a, "pgl_frt", 0L);
        if (jM43023a != 0) {
            return jM43023a;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        C14266ax.m43028b(contextM43153a, "pgl_frt", jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static synchronized void m43070c() {
        try {
            if (m43071d()) {
                String strM43124c = C14292v.m43124c();
                if (TextUtils.isEmpty(strM43124c)) {
                    return;
                }
                File file = new File(strM43124c);
                if (file.exists()) {
                    JSONObject jSONObjectM43066a = m43066a(file, true);
                    jSONObjectM43066a.put("apk_info", C14292v.m43123b());
                    jSONObjectM43066a.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, C14244ab.m42815d(C14296z.m43153a()));
                    PglSSManager pglSSManager = PglSSManager.getInstance();
                    if (pglSSManager == null) {
                        C14263au.m43007a(String.valueOf(jSONObjectM43066a));
                        return;
                    }
                    PglSSCallBack pglCallBack = pglSSManager.getPglCallBack();
                    if (pglCallBack != null) {
                        pglCallBack.reportSoftDecData("detailed_app_info", jSONObjectM43066a.toString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m43071d() {
        int iM43022a = C14266ax.m43022a(C14296z.m43153a(), "pgl_is_hit", 0);
        C14263au.m43007a("hitsTimes " + iM43022a);
        if (iM43022a > 0) {
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - m43069b();
        C14263au.m43007a("runningTime ".concat(String.valueOf(jCurrentTimeMillis)));
        if (jCurrentTimeMillis < f41324a) {
            return false;
        }
        C14266ax.m43027b(C14296z.m43153a(), "pgl_is_hit", 1);
        return m43072e();
    }

    /* JADX INFO: renamed from: e */
    private static boolean m43072e() {
        boolean z = f41325b == 100;
        if (z) {
            return z;
        }
        return ((int) ((Math.random() * 100.0d) + 1.0d)) <= f41325b;
    }
}
