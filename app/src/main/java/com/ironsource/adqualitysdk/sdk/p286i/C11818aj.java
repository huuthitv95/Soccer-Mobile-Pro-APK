package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import com.google.android.exoplayer2.C9415C;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aj */
/* JADX INFO: loaded from: classes6.dex */
public final class C11818aj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27135 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27136;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f27137 = {AbstractJsonLexerKt.COLON, 'l', 'l', 's', 'q', 'i', 'i', 'j', 'f', 'l', 'i', 'V', 172, 175, 172, 'I', 148, 146, 152, '2', 'f', 'm', 'p', '6', 'q', 'q', 'o', 'J', 136, 131, 140, 129, 253, 244, 247, 257, AbstractJsonLexerKt.STRING_ESC, 184, 193, 201};

    /* JADX INFO: renamed from: ｋ */
    private final C11814af f27138;

    public C11818aj(C11814af c11814af) {
        this.f27138 = c11814af;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28439(ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        int i2 = f27135 + 3;
        f27136 = i2 % 128;
        int i3 = i2 % 2;
        this.f27138.m28385(m28437(new int[]{0, 11, 0, 3}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000", true).intern(), m28438(iSAdQualitySegment));
        int i4 = f27135 + 55;
        f27136 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static JSONObject m28438(ISAdQualitySegment iSAdQualitySegment) {
        String strIntern;
        AtomicBoolean isPaying;
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                int i2 = f27135 + 87;
                f27136 = i2 % 128;
                jSONObject.put(i2 % 2 != 0 ? m28437(new int[]{11, 4, 63, 2}, "\u0001\u0001\u0000\u0000", false).intern() : m28437(new int[]{11, 4, 63, 2}, "\u0001\u0001\u0000\u0000", false).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                jSONObject.put(m28437(new int[]{15, 4, 46, 0}, "\u0001\u0000\u0000\u0000", true).intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m28437(new int[]{19, 4, 0, 3}, "\u0001\u0000\u0000\u0001", true).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                int i3 = f27136 + 87;
                f27135 = i3 % 128;
                jSONObject.put(i3 % 2 == 0 ? m28437(new int[]{23, 4, 0, 0}, "\u0000\u0000\u0000\u0001", false).intern() : m28437(new int[]{23, 4, 0, 0}, "\u0000\u0000\u0000\u0001", true).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                int i4 = f27136 + 19;
                f27135 = i4 % 128;
                if (i4 % 2 == 0) {
                    strIntern = m28437(new int[]{27, 4, 27, 4}, "\u0000\u0000\u0001\u0001", true).intern();
                    isPaying = iSAdQualitySegment.getIsPaying();
                } else {
                    strIntern = m28437(new int[]{27, 4, 27, 4}, "\u0000\u0000\u0001\u0001", true).intern();
                    isPaying = iSAdQualitySegment.getIsPaying();
                }
                jSONObject.put(strIntern, isPaying.get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                int i5 = f27135 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f27136 = i5 % 128;
                int i6 = i5 % 2;
                jSONObject.put(m28437(new int[]{31, 5, 143, 0}, "\u0000\u0000\u0000\u0001\u0000", false).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
                int i7 = f27135 + 23;
                f27136 = i7 % 128;
                int i8 = i7 % 2;
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                jSONObject.put(m28437(new int[]{36, 4, 85, 0}, "\u0001\u0001\u0000\u0000", true).intern(), iSAdQualitySegment.getUserCreationDate());
                int i9 = f27135 + 33;
                f27136 = i9 % 128;
                int i10 = i9 % 2;
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28437(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f27137, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
