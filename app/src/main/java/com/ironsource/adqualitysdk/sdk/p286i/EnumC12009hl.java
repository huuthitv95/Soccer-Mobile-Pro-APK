package com.ironsource.adqualitysdk.sdk.p286i;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hl */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC12009hl {
    f29173(-1),
    f29171(0),
    f29174(1),
    f29172(2),
    f29175(3),
    f29169(4),
    f29167(5),
    f29168(6),
    f29170(7);


    /* JADX INFO: renamed from: ﭖ */
    private static int f29163 = 1;

    /* JADX INFO: renamed from: ﭴ */
    private static int f29164;

    /* JADX INFO: renamed from: ﭸ */
    private static long f29165;

    /* JADX INFO: renamed from: ﻏ */
    private final int f29176;

    /* JADX INFO: renamed from: ﻐ */
    static void m30270() {
        f29165 = 5599281752823538303L;
    }

    public static EnumC12009hl valueOf(String str) {
        int i = 2 % 2;
        int i2 = f29164 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29163 = i2 % 128;
        int i3 = i2 % 2;
        EnumC12009hl enumC12009hl = (EnumC12009hl) Enum.valueOf(EnumC12009hl.class, str);
        int i4 = f29163 + 71;
        f29164 = i4 % 128;
        int i5 = i4 % 2;
        return enumC12009hl;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC12009hl[] valuesCustom() {
        int i = 2 % 2;
        int i2 = f29164 + 101;
        f29163 = i2 % 128;
        int i3 = i2 % 2;
        EnumC12009hl[] enumC12009hlArr = (EnumC12009hl[]) values().clone();
        int i4 = f29163 + 67;
        f29164 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return enumC12009hlArr;
    }

    static {
        m30270();
        int i = f29163 + 107;
        f29164 = i % 128;
        int i2 = i % 2;
    }

    EnumC12009hl(int i) {
        this.f29176 = i;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static EnumC12009hl m30272(int i) {
        int i2 = 2 % 2;
        int i3 = f29163;
        int i4 = i3 + 113;
        f29164 = i4 % 128;
        int i5 = i4 % 2;
        switch (i) {
            case -1:
                return f29173;
            case 0:
                return f29171;
            case 1:
                return f29174;
            case 2:
                return f29172;
            case 3:
                return f29175;
            case 4:
                EnumC12009hl enumC12009hl = f29169;
                int i6 = i3 + 63;
                f29164 = i6 % 128;
                if (i6 % 2 == 0) {
                    return enumC12009hl;
                }
                throw null;
            case 5:
                return f29167;
            case 6:
                return f29168;
            case 7:
                return f29170;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final int m30273() {
        int i = 2 % 2;
        int i2 = f29164 + 83;
        int i3 = i2 % 128;
        f29163 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = this.f29176;
        int i5 = i3 + 29;
        f29164 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30271(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f29165, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29165));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
