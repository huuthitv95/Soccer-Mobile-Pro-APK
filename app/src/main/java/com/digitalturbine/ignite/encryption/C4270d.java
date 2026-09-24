package com.digitalturbine.ignite.encryption;

import android.util.Base64;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.digitalturbine.ignite.encryption.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4270d {
    /* JADX INFO: renamed from: a */
    public static Pair m20318a(SecretKey secretKey, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        byte[] bArrGenerateSeed = new SecureRandom().generateSeed(12);
        Cipher cipherM20314a = AbstractC4267a.m20314a(1, bArrGenerateSeed, secretKey);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipherM20314a);
        cipherOutputStream.write(str.getBytes("UTF-8"));
        cipherOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new Pair(Base64.encodeToString(bArrGenerateSeed, 0), Base64.encodeToString(byteArray, 0));
    }
}
