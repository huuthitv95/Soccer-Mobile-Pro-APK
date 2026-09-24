package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.d1 */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes6.dex */
class C13191d1 {

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.d1$a */
    /* JADX INFO: compiled from: Util.java */
    private static class a {

        /* JADX INFO: renamed from: a */
        static final char[] f36261a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        /* JADX INFO: renamed from: b */
        static final SecureRandom f36262b = new SecureRandom();
    }

    /* JADX INFO: renamed from: a */
    static int m37655a(int[] iArr, int i) {
        int length = (iArr.length >> 1) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3 << 1];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    private static void m37661b(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m37661b(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: c */
    static byte[] m37662c(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        m37658a(file, bArr, i);
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    static boolean m37663d(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    static void m37657a(File file) {
        try {
            if (file.exists()) {
                m37661b(file);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    static void m37658a(File file, byte[] bArr, int i) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = randomAccessFile.read(bArr, i2, i - i2);
                if (i3 < 0) {
                    break;
                } else {
                    i2 += i3;
                }
            } finally {
                m37656a(randomAccessFile);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static String m37660b() {
        byte[] bArr = new byte[16];
        a.f36262b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = a.f36261a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & Ascii.f22499SI];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    static void m37656a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static int m37654a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m37659a(File file, byte[] bArr) {
        try {
            File file2 = new File(file.getParent(), file.getName() + ".tmp");
            if (!m37663d(file2)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(bArr.length);
                randomAccessFile.write(bArr);
                m37656a(randomAccessFile);
                if (!file.exists() || file.delete()) {
                    return file2.renameTo(file);
                }
            } catch (Throwable th) {
                m37656a(randomAccessFile);
                throw th;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
