package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.p159ka.C2643ri;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2726ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ri$ri */
    static class ri {

        /* JADX INFO: renamed from: ri */
        static final Random f7777ri = C2726ri.m10271ik();
    }

    /* JADX INFO: renamed from: ik */
    public static String m10270ik(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strM10276ri = m10276ri(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strM10276ri == null) ? str : C2643ri.m9834lr(str.substring(49), strSubstring, strM10276ri);
    }

    /* JADX INFO: renamed from: ik */
    public static Random m10271ik() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    /* JADX INFO: renamed from: lr */
    public static String m10272lr() {
        String strM10275ri = m10275ri(8);
        if (strM10275ri == null || strM10275ri.length() != 16) {
            return null;
        }
        return strM10275ri;
    }

    /* JADX INFO: renamed from: lr */
    public static String m10273lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strM10274ri = m10274ri();
        String strM10276ri = m10276ri(strM10274ri, 32);
        String strM10272lr = m10272lr();
        return ExifInterface.GPS_MEASUREMENT_3D + strM10274ri + strM10272lr + ((strM10276ri == null || strM10272lr == null) ? null : C2643ri.m9837ri(str, strM10272lr, strM10276ri));
    }

    /* JADX INFO: renamed from: ri */
    public static String m10274ri() {
        String strM10275ri = m10275ri(16);
        if (strM10275ri == null || strM10275ri.length() != 32) {
            return null;
        }
        return strM10275ri;
    }

    /* JADX INFO: renamed from: ri */
    public static String m10275ri(int i) {
        try {
            byte[] bArr = new byte[i];
            ri.f7777ri.nextBytes(bArr);
            return C2717fi.m10221ri(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m10276ri(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m10277ri(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strM10273lr = m10273lr(str);
                    if (TextUtils.isEmpty(strM10273lr)) {
                        jSONObject.put("message", str);
                        jSONObject.put("cypher", 0);
                        return jSONObject;
                    }
                    jSONObject.put("message", strM10273lr);
                    jSONObject.put("cypher", 3);
                    return jSONObject;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put("message", str);
                jSONObject.put("cypher", 0);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m10278ri(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : m10277ri(jSONObject.toString());
    }
}
