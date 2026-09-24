package com.tiktok.util;

import android.util.Base64;
import com.tiktok.TikTokBusinessSdk;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class DecryptUtil {
    public static String encryptWithHmac(String message) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(TikTokBusinessSdk.getAccessToken().getBytes(), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return Base64.encodeToString(mac.doFinal(message.getBytes()), 2);
        } catch (Throwable unused) {
            return "";
        }
    }
}
