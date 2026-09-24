package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.a */
/* JADX INFO: compiled from: AESCBCUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13180a {

    /* JADX INFO: renamed from: b */
    private static byte[] f36241b = new byte[32];

    /* JADX INFO: renamed from: a */
    private static byte[] f36240a = new byte[16];

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.a$a */
    /* JADX INFO: compiled from: AESCBCUtil.java */
    public static class a extends Provider {
        public a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
        }
    }

    static {
        m37592a(C13207k0.m37712a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN=="));
    }

    /* JADX INFO: renamed from: a */
    private static void m37592a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("sha-384").digest(str.getBytes());
            System.arraycopy(bArrDigest, 0, f36241b, 0, 32);
            System.arraycopy(bArrDigest, 32, f36240a, 0, 16);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37593b(String str) {
        return m37591a(str, f36241b, f36240a);
    }

    /* JADX INFO: renamed from: a */
    public static String m37591a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
