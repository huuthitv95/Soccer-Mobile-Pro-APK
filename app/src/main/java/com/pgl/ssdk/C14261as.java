package com.pgl.ssdk;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.pgl.ssdk.as */
/* JADX INFO: loaded from: classes7.dex */
public class C14261as {
    /* JADX INFO: renamed from: a */
    public static void m42996a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42997a(String str, int i) {
        C14262at.m43003a("android.os.FileUtils", str, Integer.valueOf(i), -1, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m42998a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m42999a(String str) {
        return new File(str).mkdirs();
    }
}
