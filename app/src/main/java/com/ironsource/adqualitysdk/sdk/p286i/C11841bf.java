package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11841bf extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static long f27605 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27606 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f27607 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27608 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static char f27609 = 41431;

    public C11841bf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27607 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27606 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m28838("緍䪴\ueaf6臻蔁筴醍", (char) (ViewConfiguration.getTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", 226106832 - View.combineMeasuredStates(0, 0), "퀰稝㰍࿉").intern();
        int i4 = f27607 + 101;
        f27606 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        int i2 = f27606 + 73;
        int i3 = i2 % 128;
        f27607 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        f27606 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f27606 + 89;
        f27607 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo28821() {
        int i = 2 % 2;
        int i2 = f27607;
        int i3 = i2 + 29;
        f27606 = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 65;
        f27606 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28838(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f27605) ^ ((long) f27608)) ^ ((long) f27609));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
