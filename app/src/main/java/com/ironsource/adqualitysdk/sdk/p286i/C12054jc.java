package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.view.View;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12054jc {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29567 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29568 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static long f29569 = -5820232057839143359L;

    /* JADX INFO: renamed from: ﻛ */
    private JSONObject f29570;

    /* JADX INFO: renamed from: ｋ */
    private String f29571;

    C12054jc(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    C12054jc(JSONObject jSONObject, String str) {
        this.f29570 = jSONObject;
        this.f29571 = str;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final JSONObject m30620() throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m30618("㘱嘿\uf610ᘆ뙁홵癓陗", TextUtils.indexOf((CharSequence) "", '0', 0) + 24594).intern(), this.f29570);
        jSONObject.put(m30618("㘴喇\uf14eᴼ", View.MeasureSpec.getMode(0) + 25523).intern(), this.f29571);
        int i2 = f29567 + 57;
        f29568 = i2 % 128;
        int i3 = i2 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final JSONObject m30621() {
        int i = 2 % 2;
        int i2 = f29567 + 43;
        int i3 = i2 % 128;
        f29568 = i3;
        int i4 = i2 % 2;
        JSONObject jSONObject = this.f29570;
        int i5 = i3 + 81;
        f29567 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m30619() {
        String str;
        int i = 2 % 2;
        int i2 = f29567 + 5;
        int i3 = i2 % 128;
        f29568 = i3;
        if (i2 % 2 == 0) {
            str = this.f29571;
            int i4 = 74 / 0;
        } else {
            str = this.f29571;
        }
        int i5 = i3 + 15;
        f29567 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30618(String str, int i) {
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
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29569);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
