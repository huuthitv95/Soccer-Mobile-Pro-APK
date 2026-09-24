package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ly */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7219ly extends AbstractC5482Jb {
    public static String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public C5341HJ A00;
    public C7220lz A01;

    private int A00(C45944v c45944v) {
        int i = (c45944v.A0l()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c45944v.A0g(4);
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int iCharAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (iCharAt == blockSizeKey) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c45944v.A0S();
        }
        int result = AbstractC5337HF.A00(c45944v, i);
        c45944v.A0f(0);
        return result;
    }

    public static boolean A01(C45944v c45944v) {
        return c45944v.A07() >= 5 && c45944v.A0I() == 127 && c45944v.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    public final long A09(C45944v c45944v) {
        if (!A02(c45944v.A0l())) {
            return -1L;
        }
        return A00(c45944v);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C45944v c45944v, long j, C5481Ja c5481Ja) {
        byte[] bArrA0l = c45944v.A0l();
        C5341HJ c5341hj = this.A00;
        if (c5341hj == null) {
            C5341HJ c5341hj2 = new C5341HJ(bArrA0l, 17);
            this.A00 = c5341hj2;
            c5481Ja.A00 = c5341hj2.A08(Arrays.copyOfRange(bArrA0l, 9, c45944v.A0A()), null);
            return true;
        }
        if ((bArrA0l[0] & 127) == 3) {
            C5340HI c5340hiA03 = AbstractC5339HH.A03(c45944v);
            C5341HJ streamMetadata = c5341hj.A09(c5340hiA03);
            this.A00 = streamMetadata;
            this.A01 = new C7220lz(streamMetadata, c5340hiA03);
            return true;
        }
        if (!A02(bArrA0l)) {
            return true;
        }
        if (this.A01 != null) {
            this.A01.A00(j);
            c5481Ja.A01 = this.A01;
        }
        C7472qI c7472qI = c5481Ja.A00;
        String[] strArr = A02;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
        strArr2[2] = "wrCWS6iAkk";
        AbstractC45353y.A01(c7472qI);
        return false;
    }
}
