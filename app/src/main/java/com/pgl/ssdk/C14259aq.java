package com.pgl.ssdk;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.C2726ri;

/* JADX INFO: renamed from: com.pgl.ssdk.aq */
/* JADX INFO: loaded from: classes7.dex */
public class C14259aq {
    /* JADX INFO: renamed from: a */
    public static Pair<Integer, String> m42990a(String str) {
        Pair<Integer, String> pairCypher4EncryptWithNoWrapBase64 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            pairCypher4EncryptWithNoWrapBase64 = PglCryptUtils.getInstance().cypher4EncryptWithNoWrapBase64(str);
        } catch (Throwable unused) {
        }
        return (pairCypher4EncryptWithNoWrapBase64 == null || ((Integer) pairCypher4EncryptWithNoWrapBase64.first).intValue() != 0 || TextUtils.isEmpty((CharSequence) pairCypher4EncryptWithNoWrapBase64.second)) ? new Pair<>(3, C2726ri.m10273lr(str)) : new Pair<>(4, pairCypher4EncryptWithNoWrapBase64.second);
    }
}
