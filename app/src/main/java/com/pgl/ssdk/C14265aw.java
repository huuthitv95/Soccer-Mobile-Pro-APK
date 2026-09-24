package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.pgl.ssdk.aw */
/* JADX INFO: loaded from: classes7.dex */
public class C14265aw {

    /* JADX INFO: renamed from: a */
    private static List<String> f41281a = new ArrayList();

    /* JADX INFO: renamed from: com.pgl.ssdk.aw$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f41282a;

        /* JADX INFO: renamed from: b */
        public String f41283b;

        public a(int i, String... strArr) {
            this.f41282a = i;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.f41283b = jSONArray.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    private static a m43014a(Context context, String str, File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        ZipFile zipFile = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ZipFile zipFile2 = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry zipEntryM43018a = m43018a(zipFile2, Build.CPU_ABI, str);
                if (zipEntryM43018a == null) {
                    try {
                        zipEntryM43018a = m43018a(zipFile2, Build.CPU_ABI2, str);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                        fileOutputStream = null;
                        zipFile = zipFile2;
                        try {
                            return new a(3, th.getMessage());
                        } finally {
                            C14261as.m42996a(fileOutputStream);
                            C14261as.m42996a(inputStream);
                            C14261as.m42998a(zipFile);
                        }
                    }
                }
                if (zipEntryM43018a == null) {
                    a aVar = new a(2, m43017a(zipFile2, str));
                    C14261as.m42996a((Closeable) null);
                    C14261as.m42996a((Closeable) null);
                    C14261as.m42998a(zipFile2);
                    return aVar;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile2.getInputStream(zipEntryM43018a);
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i = inputStream2.read(bArr);
                            if (i <= 0) {
                                C14261as.m42997a(file.getAbsolutePath(), FacebookRequestErrorClassification.ESC_APP_INACTIVE);
                                C14261as.m42996a(fileOutputStream3);
                                C14261as.m42996a(inputStream2);
                                C14261as.m42998a(zipFile2);
                                return null;
                            }
                            fileOutputStream3.write(bArr, 0, i);
                        }
                    } catch (Throwable th2) {
                        fileOutputStream2 = fileOutputStream3;
                        inputStream = inputStream2;
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        zipFile = zipFile2;
                        return new a(3, th.getMessage());
                    }
                } catch (Throwable th3) {
                    inputStream = inputStream2;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static File m43015a(Context context) {
        if (context == null || context.getFilesDir() == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "libso");
        if (!file.exists()) {
            C14261as.m42999a(file.getAbsolutePath());
        }
        return file;
    }

    /* JADX INFO: renamed from: a */
    private static File m43016a(Context context, String str) {
        String strMapLibraryName = System.mapLibraryName(str);
        File fileM43015a = m43015a(context);
        if (fileM43015a != null) {
            return new File(fileM43015a, strMapLibraryName);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m43017a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (m43018a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List listAsList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        String str4 = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", listAsList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static ZipEntry m43018a(ZipFile zipFile, String str, String str2) {
        ZipEntry entry = zipFile.getEntry("lib/" + str + RemoteSettings.FORWARD_SLASH_STRING + System.mapLibraryName(str2));
        if (entry != null) {
            return entry;
        }
        int iIndexOf = str.indexOf(45);
        StringBuilder sb = new StringBuilder("lib/");
        if (iIndexOf <= 0) {
            iIndexOf = str.length();
        }
        sb.append(str.substring(0, iIndexOf));
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m43019a(String str) {
        return f41281a.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized a m43020b(Context context, String str) {
        if (f41281a.contains(str)) {
            return null;
        }
        try {
            try {
                System.loadLibrary(str);
                f41281a.add(str);
            } catch (Throwable th) {
                return new a(3, th.getMessage());
            }
        } catch (UnsatisfiedLinkError e) {
            File fileM43016a = m43016a(context, str);
            if (fileM43016a == null) {
                return new a(3, e.getMessage(), "output null");
            }
            if (fileM43016a.exists()) {
                fileM43016a.delete();
            }
            a aVarM43014a = m43014a(context, str, fileM43016a);
            if (aVarM43014a != null) {
                return aVarM43014a;
            }
            try {
                System.load(fileM43016a.getAbsolutePath());
                f41281a.add(str);
            } catch (Throwable th2) {
                return new a(3, e.getMessage(), th2.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m43021b(String str) {
        if (f41281a.contains(str)) {
            return;
        }
        try {
            System.loadLibrary(str);
            f41281a.add(str);
        } catch (Throwable unused) {
        }
    }
}
