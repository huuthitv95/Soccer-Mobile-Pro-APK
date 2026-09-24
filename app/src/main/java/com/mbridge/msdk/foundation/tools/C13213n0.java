package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.n0 */
/* JADX INFO: compiled from: SameFileMD5.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13213n0 {

    /* JADX INFO: renamed from: a */
    protected static char[] f36351a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    protected static MessageDigest f36352b = null;

    /* JADX INFO: renamed from: c */
    private static String f36353c = "SameFileMD5";

    static {
        try {
            f36352b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e) {
            System.err.println(C13213n0.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37785a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        if (file == null || !file.exists()) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[10485760];
                while (true) {
                    int i = randomAccessFile.read(bArr);
                    if (i == -1) {
                        String strM37786a = m37786a(messageDigest.digest());
                        try {
                            randomAccessFile.close();
                            return strM37786a;
                        } catch (IOException e) {
                            C13219q0.m37816b(f36353c, e.getMessage());
                            return strM37786a;
                        }
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C13219q0.m37816b(f36353c, th.getMessage());
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            C13219q0.m37816b(f36353c, e2.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m37786a(byte[] bArr) {
        return m37787a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    private static String m37787a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            m37788a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m37788a(byte b, StringBuffer stringBuffer) {
        char[] cArr = f36351a;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & Ascii.f22499SI];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }
}
