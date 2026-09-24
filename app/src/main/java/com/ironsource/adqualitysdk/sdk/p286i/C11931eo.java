package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.KeyEvent;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.eo */
/* JADX INFO: loaded from: classes6.dex */
public final class C11931eo extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28810 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f28811;

    /* JADX INFO: renamed from: ﾇ */
    private static int[] f28812 = {-1130817085, -441040772, 1090026479, -1407867710, -1029033537, -424524925, 86269341, 1103671560, -1678409531, -1341074658, 1508989109, 1400244581, 2107011542, -522561995, -694561276, -1567350370, -7339788, 1771240580};

    /* JADX INFO: renamed from: ﾒ */
    private String f28813;

    public C11931eo(String str, C11904do c11904do) {
        super(c11904do);
        this.f28813 = C11914dy.m30142(str);
    }

    /* JADX INFO: renamed from: ﾒ */
    public final String m30179() {
        int i = 2 % 2;
        int i2 = f28811;
        int i3 = i2 + 23;
        f28810 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f28813;
        int i5 = i2 + 99;
        f28810 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        try {
            C11908ds c11908ds = new C11908ds(c11907dr.m30055(m30179()));
            int i2 = f28811 + 67;
            f28810 = i2 % 128;
            if (i2 % 2 != 0) {
                return c11908ds;
            }
            throw null;
        } catch (Exception e) {
            C11906dq c11906dqM29678 = c11877co.m29678(m30179());
            if (c11906dqM29678 != null) {
                return new C11908ds(c11906dqM29678);
            }
            String strM29666 = c11877co.m29666();
            StringBuilder sb = new StringBuilder();
            sb.append(m30178(new int[]{1931746173, 174097215, 2089760623, -1969317921, -1246751911, -1991837617, 183635526, -1363849247, 819592197, 1053018685, 83935668, 569214247, -662991330, 954609164}, KeyEvent.getDeadChar(0, 0) + 28).intern());
            sb.append(this);
            sb.append(m30154());
            C11875cm.m29607(strM29666, sb.toString(), e);
            C11908ds c11908ds2 = new C11908ds(null);
            int i3 = f28810 + 111;
            f28811 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 84 / 0;
            }
            return c11908ds2;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f28810 + 27;
        f28811 = i2 % 128;
        int i3 = i2 % 2;
        String strM30179 = m30179();
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return strM30179;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f28810 + 81;
            f28811 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i4 = f28810 + 59;
            f28811 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        boolean zEquals = this.f28813.equals(((C11931eo) obj).f28813);
        int i6 = f28810 + 71;
        f28811 = i6 % 128;
        int i7 = i6 % 2;
        return zEquals;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28811;
        int i3 = i2 + 73;
        f28810 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f28813;
        if (str == null) {
            return 0;
        }
        int i4 = i2 + 5;
        f28810 = i4 % 128;
        int i5 = i4 % 2;
        return str.hashCode();
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30178(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28812.clone();
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
