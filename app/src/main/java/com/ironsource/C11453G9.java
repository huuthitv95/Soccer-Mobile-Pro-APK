package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.ironsource.G9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11453G9 {
    /* JADX INFO: renamed from: a */
    public static synchronized String m25861a(String str) {
        return m25862a(C12261j5.m31853b().m31855c(), str);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m25864b(String str) {
        return m25868d(C12261j5.m31853b().m31855c(), str);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m25866c(String str) {
        return m25870e(C12261j5.m31853b().m31855c(), str);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m25868d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            byte[] bArrM25867c = m25867c(str, str2);
            if (bArrM25867c != null) {
                return C11597O9.m26740a(bArrM25867c);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public static synchronized String m25870e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return m25863a(str, str2.getBytes("UTF8"));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m25862a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            byte[] bArrM26741a = C11597O9.m26741a(str2);
            if (bArrM26741a != null) {
                return m25863a(str, bArrM26741a);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m25865b(String str, String str2) {
        byte[] bArrM25867c = m25867c(str, str2);
        if (bArrM25867c == null) {
            return "";
        }
        return new String(bArrM25867c);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized byte[] m25867c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpecM25869d = m25869d(str);
            byte[] bArr = new byte[16];
            Arrays.fill(bArr, (byte) 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            byte[] bArrDecode = Base64.decode(str2, 0);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeySpecM25869d, ivParameterSpec);
            return cipher.doFinal(bArrDecode);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m25863a(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (bArr == null) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpecM25869d = m25869d(str);
            byte[] bArr2 = new byte[16];
            Arrays.fill(bArr2, (byte) 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKeySpecM25869d, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(bArr), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    private static SecretKeySpec m25869d(String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes("UTF-8");
        System.arraycopy(bytes, 0, bArr, 0, bytes.length < 32 ? bytes.length : 32);
        return new SecretKeySpec(bArr, "AES");
    }
}
