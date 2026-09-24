package com.mbridge.msdk.foundation.tools;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.b */
/* JADX INFO: compiled from: AESGCMUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13183b {

    /* JADX INFO: renamed from: a */
    private static byte[] f36242a = new byte[32];

    static {
        m37599a(C13207k0.m37712a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN=="));
    }

    /* JADX INFO: renamed from: a */
    private static void m37599a(String str) {
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-384").digest(str.getBytes()), 0, f36242a, 0, 32);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37600b(String str, byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }

    /* JADX INFO: renamed from: a */
    public static String m37598a(String str, byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr2));
            return new String(cipher.doFinal(bArrDecode), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
