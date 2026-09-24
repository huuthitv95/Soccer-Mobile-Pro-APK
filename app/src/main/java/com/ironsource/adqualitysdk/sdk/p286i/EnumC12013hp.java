package com.ironsource.adqualitysdk.sdk.p286i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hp */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC12013hp {
    f29201(-1),
    f29199(0),
    f29200(1),
    f29202(2),
    f29203(3),
    f29195(4),
    f29197(5),
    f29196(6);


    /* JADX INFO: renamed from: ﭴ */
    private static long f29192 = 0;

    /* JADX INFO: renamed from: ﮉ */
    private static int f29193 = 1;

    /* JADX INFO: renamed from: ﮌ */
    private static int f29194;

    /* JADX INFO: renamed from: ﮐ */
    private final int f29204;

    /* JADX INFO: renamed from: ﻐ */
    static void m30299() {
        f29192 = -3297529404576942851L;
    }

    public static EnumC12013hp valueOf(String str) {
        int i = 2 % 2;
        int i2 = f29194 + 63;
        f29193 = i2 % 128;
        int i3 = i2 % 2;
        EnumC12013hp enumC12013hp = (EnumC12013hp) Enum.valueOf(EnumC12013hp.class, str);
        int i4 = f29193 + 59;
        f29194 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return enumC12013hp;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC12013hp[] valuesCustom() {
        int i = 2 % 2;
        int i2 = f29194 + 29;
        f29193 = i2 % 128;
        int i3 = i2 % 2;
        EnumC12013hp[] enumC12013hpArr = (EnumC12013hp[]) values().clone();
        int i4 = f29194 + 63;
        f29193 = i4 % 128;
        int i5 = i4 % 2;
        return enumC12013hpArr;
    }

    static {
        m30299();
        int i = f29194 + 83;
        f29193 = i % 128;
        int i2 = i % 2;
    }

    EnumC12013hp(int i) {
        this.f29204 = i;
    }

    /* JADX INFO: renamed from: ｋ */
    public static EnumC12013hp m30301(int i) {
        int i2 = 2 % 2;
        int i3 = f29194;
        int i4 = i3 + 83;
        int i5 = i4 % 128;
        f29193 = i5;
        int i6 = i4 % 2;
        switch (i) {
            case -1:
                return f29201;
            case 0:
                EnumC12013hp enumC12013hp = f29199;
                int i7 = i3 + 23;
                f29193 = i7 % 128;
                int i8 = i7 % 2;
                return enumC12013hp;
            case 1:
                return f29200;
            case 2:
                EnumC12013hp enumC12013hp2 = f29202;
                int i9 = i5 + 13;
                f29194 = i9 % 128;
                int i10 = i9 % 2;
                return enumC12013hp2;
            case 3:
                return f29203;
            case 4:
                return f29195;
            case 5:
                return f29197;
            case 6:
                return f29196;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final int m30302() {
        int i = 2 % 2;
        int i2 = f29194 + 39;
        f29193 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f29204;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30300(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f29192, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29192));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
