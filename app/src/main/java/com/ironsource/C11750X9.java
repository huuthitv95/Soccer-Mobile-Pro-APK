package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.ironsource.X9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11750X9 {

    /* JADX INFO: renamed from: a */
    public static final int f26541a = 1024;

    /* JADX INFO: renamed from: b */
    public static final String f26542b = "RSA/ECB/PKCS1Padding";

    /* JADX INFO: renamed from: a */
    public static KeyPair m27944a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f26542b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception on key generation error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static RSAPublicKey m27945a(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, UnsupportedEncodingException {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m27947a(byte[] bArr, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(f26542b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception on encryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m27943a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(m27947a(str.getBytes("UTF-8"), m27945a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception on string encryption error: " + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m27946a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance(f26542b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
