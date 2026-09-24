package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.im */
/* JADX INFO: loaded from: classes6.dex */
public final class C12037im {

    /* JADX INFO: renamed from: ﱡ */
    private static int f29415 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static Map<String, Object> f29416;

    /* JADX INFO: renamed from: ﻛ */
    private static long f29417;

    /* JADX INFO: renamed from: ｋ */
    private static int f29418;

    /* JADX INFO: renamed from: ﾇ */
    private static Map<String, Integer> f29419;

    /* JADX INFO: renamed from: ﾒ */
    private static Map<String, Integer> f29420;

    /* JADX INFO: renamed from: ﻐ */
    static void m30520() {
        f29417 = -3767571846354176905L;
    }

    static {
        m30520();
        f29416 = new HashMap();
        f29420 = new HashMap();
        f29419 = new HashMap();
        int i = f29415 + 3;
        f29418 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static void m30522(Context context, String str, JSONObject jSONObject, Object... objArr) {
        int i = 2 % 2;
        C12031ig.m30493(context).m30497(new Intent(str).putExtra(C12035ik.f29366, jSONObject.toString()));
        int i2 = f29415 + 1;
        f29418 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30521(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29417);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
