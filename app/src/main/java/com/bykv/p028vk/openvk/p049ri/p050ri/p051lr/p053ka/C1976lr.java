package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1976lr {
    /* JADX INFO: renamed from: ik */
    public static File m6203ik(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    /* JADX INFO: renamed from: lr */
    public static File m6204lr(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    /* JADX INFO: renamed from: ri */
    public static long m6205ri(String str, String str2) {
        File fileM6203ik = m6203ik(str, str2);
        if (fileM6203ik.exists()) {
            return fileM6203ik.length();
        }
        File fileM6204lr = m6204lr(str, str2);
        if (fileM6204lr.exists()) {
            return fileM6204lr.length();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ri */
    public static void m6206ri(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
