package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.messages.Message;
import com.ironsource.C11455Gb;
import com.ironsource.C11744X3;
import com.ironsource.C12317m4;
import com.ironsource.C12411of;
import com.ironsource.C12601x8;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class IronSourceStorageUtils {

    /* JADX INFO: renamed from: a */
    private static final String f32395a = "supersonicads";

    /* JADX INFO: renamed from: b */
    private static C12411of f32396b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f32397c = false;

    /* JADX INFO: renamed from: a */
    private static void m33631a(Context context) {
        C12411of c12411of = f32396b;
        if (c12411of != null && c12411of.m33005b()) {
            deleteCacheDirectories(context);
        }
        C12411of c12411of2 = f32396b;
        if (c12411of2 == null || !c12411of2.m33006c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    /* JADX INFO: renamed from: b */
    private static File m33634b(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        C12411of c12411of = f32396b;
        return (c12411of == null || !c12411of.m33007d()) ? interfaceC12582w7Mo25842a.mo27902g(context) : interfaceC12582w7Mo25842a.mo27914m(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objM33637c = m33637c(file2);
                    if (objM33637c instanceof JSONArray) {
                        jSONObject.put("files", m33637c(file2));
                    } else if (objM33637c instanceof JSONObject) {
                        jSONObject.put(file2.getName(), m33637c(file2));
                    }
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C12601x8 c12601x8, JSONObject jSONObject) throws Exception {
        if (c12601x8 == null || !c12601x8.isDirectory()) {
            return new JSONObject();
        }
        File[] fileArrListFiles = c12601x8.listFiles();
        if (fileArrListFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : fileArrListFiles) {
            C12601x8 c12601x9 = new C12601x8(file.getPath());
            if (c12601x9.isFile()) {
                String name = c12601x9.getName();
                JSONObject jSONObjectM34139a = c12601x9.m34139a();
                if (jSONObject.has(name)) {
                    jSONObject2.put(name, SDKUtils.mergeJSONObjects(jSONObjectM34139a, jSONObject.getJSONObject(name)));
                } else {
                    jSONObject2.put(name, jSONObjectM34139a);
                }
            } else if (c12601x9.isDirectory()) {
                jSONObject2.put(c12601x9.getName(), buildFilesMapOfDirectory(c12601x9, jSONObject));
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: c */
    private static File m33636c(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        C12411of c12411of = f32396b;
        return (c12411of == null || !c12411of.m33007d()) ? interfaceC12582w7Mo25842a.mo27910k(context) : interfaceC12582w7Mo25842a.mo27871C(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        m33632a(interfaceC12582w7Mo25842a.mo27914m(context));
        m33632a(interfaceC12582w7Mo25842a.mo27871C(context));
    }

    public static synchronized boolean deleteFile(C12601x8 c12601x8) {
        if (!c12601x8.exists()) {
            return false;
        }
        return c12601x8.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = C11455Gb.m25891U().mo25842a();
        m33632a(interfaceC12582w7Mo25842a.mo27902g(context));
        m33632a(interfaceC12582w7Mo25842a.mo27910k(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        File file;
        file = new File(str);
        return deleteFolderContentRecursive(file) && file.delete();
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        C12411of c12411of = f32396b;
        if (c12411of == null || !c12411of.m33008e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(C11744X3.c.f26217u + canonicalPath2);
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileM33634b;
        if (!m33633a() || !SDKUtils.isExternalStorageAvailable() || (fileM33634b = m33634b(context)) == null || !fileM33634b.canWrite()) {
            return m33636c(context).getPath();
        }
        f32397c = true;
        return fileM33634b.getPath();
    }

    public static ArrayList<C12601x8> getFilesInFolderRecursive(C12601x8 c12601x8) {
        if (c12601x8 == null || !c12601x8.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C12601x8> arrayList = new ArrayList<>();
        File[] fileArrListFiles = c12601x8.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C12601x8 c12601x9 = new C12601x8(file.getPath());
                if (c12601x9.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c12601x9));
                }
                if (c12601x9.isFile()) {
                    arrayList.add(c12601x9);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileM33635b = m33635b(new File(getDiskCacheDirPath(context)));
        if (!fileM33635b.exists()) {
            fileM33635b.mkdir();
        }
        return fileM33635b.getPath();
    }

    public static long getTotalSizeOfDir(C12601x8 c12601x8) {
        long totalSizeOfDir;
        long j = 0;
        if (c12601x8 != null && c12601x8.isDirectory()) {
            File[] fileArrListFiles = c12601x8.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                C12601x8 c12601x9 = new C12601x8(file.getPath());
                if (c12601x9.isFile()) {
                    totalSizeOfDir = c12601x9.length();
                } else {
                    if (c12601x9.isDirectory()) {
                        totalSizeOfDir = getTotalSizeOfDir(c12601x9);
                    }
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, C12411of c12411of) {
        f32396b = c12411of;
        m33631a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f32397c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C12601x8 c12601x8) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c12601x8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[Message.MAX_CONTENT_SIZE_BYTES];
            int i = 0;
            while (true) {
                int i2 = byteArrayInputStream.read(bArr2);
                if (i2 == -1) {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return i;
                }
                fileOutputStream.write(bArr2, 0, i2);
                i += i2;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            byteArrayInputStream.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m33632a(File file) {
        if (file != null) {
            deleteFolder(m33635b(file).getPath());
        }
    }

    /* JADX INFO: renamed from: b */
    private static File m33635b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f32395a);
        sb.append(str);
        return new File(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    private static Object m33637c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObject.put(file2.getName(), m33637c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObject.put("files", jSONArray);
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m33633a() {
        C12411of c12411of;
        return Build.VERSION.SDK_INT > 29 && (c12411of = f32396b) != null && c12411of.m33004a();
    }
}
