package com.apm.insight.p018h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.apm.insight.C1373a;
import com.apm.insight.p022l.C1430f;
import com.google.firebase.sessions.settings.RemoteSettings;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.apm.insight.h.c */
/* JADX INFO: compiled from: SafelyLibraryLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1407c {
    static {
        new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static String m1183a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String strM1184a = m1184a(applicationInfo.sourceDir, str, file);
        if (strM1184a == null) {
            return null;
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            strM1184a = m1184a(str2, str, file);
            if (strM1184a == null) {
                return null;
            }
        }
        try {
            ClassLoader classLoader = C1407c.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return strM1184a;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (String str3 : (String[]) declaredField2.get(obj)) {
                File file2 = new File(str3, System.mapLibraryName(str));
                if (file2.exists()) {
                    C1430f.m1326a(file2, file);
                    C1373a.m862a(file.getAbsolutePath());
                    return null;
                }
            }
            return "not_found";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m1184a(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + RemoteSettings.FORWARD_SLASH_STRING + System.mapLibraryName(str2));
                if (entry == null) {
                    int iIndexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb = new StringBuilder("lib/");
                    String str3 = Build.CPU_ABI;
                    if (iIndexOf <= 0) {
                        iIndexOf = Build.CPU_ABI.length();
                    }
                    sb.append(str3.substring(0, iIndexOf));
                    sb.append(RemoteSettings.FORWARD_SLASH_STRING);
                    sb.append(System.mapLibraryName(str2));
                    String string = sb.toString();
                    ZipEntry entry2 = zipFile.getEntry(string);
                    if (entry2 == null) {
                        message = "Library entry not found:".concat(String.valueOf(string));
                        C1373a.m860a((Closeable) null);
                        C1373a.m860a((Closeable) null);
                        return message;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile.getInputStream(entry);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = inputStream2.read(bArr);
                            if (i <= 0) {
                                C1373a.m862a(file.getAbsolutePath());
                                C1373a.m860a((Closeable) fileOutputStream2);
                                C1373a.m860a((Closeable) inputStream2);
                                C1373a.m866a(zipFile);
                                return null;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                    } catch (Throwable th) {
                        fileOutputStream = fileOutputStream2;
                        inputStream = inputStream2;
                        th = th;
                        try {
                            message = th.getMessage();
                            C1373a.m860a((Closeable) fileOutputStream);
                            C1373a.m860a((Closeable) inputStream);
                            return message;
                        } finally {
                            C1373a.m860a((Closeable) fileOutputStream);
                            C1373a.m860a((Closeable) inputStream);
                            C1373a.m866a(zipFile);
                        }
                    }
                } catch (Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            zipFile = null;
        }
    }
}
