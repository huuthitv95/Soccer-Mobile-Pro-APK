package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ez */
/* JADX INFO: loaded from: classes6.dex */
public final class C11942ez extends AbstractC11922ef {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28843 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28844 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int[] f28845 = {-231424172, 146297544, -1751970297, 1978474108, 1574390768, -712684402, 1492443414, 157750462, 178233296, -1391053251, 794244681, 650221092, -1718360455, 1398110889, -289258247, -458607443, 2064091861, 1184885492};

    public C11942ez(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28844 + 91;
        f28843 = i2 % 128;
        int i3 = i2 % 2;
        C11908ds c11908dsM30156 = m30162().m30156(c11907dr, c11877co);
        C11908ds c11908dsM30157 = m30163().m30156(c11907dr, c11877co);
        if (!(c11908dsM30156.m30066() instanceof String)) {
            int i4 = f28843 + 81;
            f28844 = i4 % 128;
            int i5 = i4 % 2;
            if (!(c11908dsM30157.m30066() instanceof String)) {
                Number numberM30063 = c11908dsM30156.m30063();
                Number numberM30064 = c11908dsM30157.m30063();
                if (!(numberM30063 instanceof Double)) {
                    int i6 = f28844 + 87;
                    f28843 = i6 % 128;
                    int i7 = i6 % 2;
                    if (!(numberM30064 instanceof Double)) {
                        return ((numberM30063 instanceof Long) || (numberM30064 instanceof Long)) ? new C11908ds(Long.valueOf(numberM30063.longValue() + numberM30064.longValue())) : new C11908ds(Integer.valueOf(numberM30063.intValue() + numberM30064.intValue()));
                    }
                }
                return new C11908ds(Double.valueOf(numberM30063.doubleValue() + numberM30064.doubleValue()));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c11908dsM30156.m30066());
        sb.append(c11908dsM30157.m30066());
        return new C11908ds(sb.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28844 + 69;
        f28843 = i2 % 128;
        int[] iArr = {-32480220, -96679108};
        return (i2 % 2 != 0 ? m30188(iArr, (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1))) : m30188(iArr, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern();
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30188(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28845.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
