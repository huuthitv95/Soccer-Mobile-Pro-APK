package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cu */
/* JADX INFO: loaded from: classes6.dex */
public final class C11883cu extends C11886cx {

    /* JADX INFO: renamed from: ﱟ */
    private static int f28349 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f28350 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static byte[] f28351 = {-74};

    /* JADX INFO: renamed from: ﻛ */
    private static int f28352 = 1723160829;

    /* JADX INFO: renamed from: ｋ */
    private static int f28353 = 398516319;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28354 = 75;

    /* JADX INFO: renamed from: ﾒ */
    private static short[] f28355;

    /* JADX INFO: renamed from: ｋ */
    public static Object m29799(C11877co c11877co, List<Object> list) {
        boolean zBooleanValue;
        JSONObject jSONObject;
        int i = 2 % 2;
        boolean zBooleanValue2 = false;
        String str = (String) m29851(list, 0, String.class);
        StringBuilder sb = new StringBuilder();
        sb.append(c11877co.m29666());
        sb.append(m29800(TextUtils.indexOf((CharSequence) "", '0', 0) - 1723160828, (short) (80 - TextUtils.indexOf("", "")), TextUtils.lastIndexOf("", '0', 0) - 398516260, (byte) (AndroidCharacter.getMirror('0') - 'I'), (-77) - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        sb.append(Integer.toHexString(str.hashCode()));
        String string = sb.toString();
        Throwable th = (Throwable) m29851(list, 1, Throwable.class);
        if (list.size() > 2) {
            if (m29852(list, 2, JSONObject.class)) {
                JSONObject jSONObject2 = (JSONObject) m29851(list, 2, JSONObject.class);
                if (list.size() > 3 && m29852(list, 3, Boolean.class)) {
                    int i2 = f28349 + 87;
                    f28350 = i2 % 128;
                    int i3 = i2 % 2;
                    zBooleanValue2 = ((Boolean) m29851(list, 3, Boolean.class)).booleanValue();
                    int i4 = f28350 + 115;
                    f28349 = i4 % 128;
                    int i5 = i4 % 2;
                }
                jSONObject = jSONObject2;
                zBooleanValue = zBooleanValue2;
            } else {
                zBooleanValue = m29852(list, 2, Boolean.class) ? ((Boolean) m29851(list, 2, Boolean.class)).booleanValue() : false;
                jSONObject = null;
            }
            C12080kb.m30848(c11877co.m29666(), str, string, th, jSONObject, zBooleanValue);
            int i6 = f28349 + 49;
            f28350 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            C12080kb.m30848(c11877co.m29666(), str, string, th, null, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29800(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28354;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28351;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28352 + i] + i4);
                } else {
                    i5 = (short) (f28355[f28352 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28352 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28353);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28351;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28355;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
