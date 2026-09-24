package com.facebook.ads.redexgen.core;

import com.ironsource.C11341A5;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.V1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6183V1 {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", C11341A5.f23826q, "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC6180Uy A01 = EnumC6180Uy.A03;
    public EnumC6181Uz A02 = EnumC6181Uz.A06;
    public EnumC6182V0 A03 = EnumC6182V0.A02;
    public EnumC6179Ux A00 = EnumC6179Ux.A02;

    public final void A00() {
        this.A00 = EnumC6179Ux.A03;
    }

    public final void A01() {
        this.A02 = EnumC6181Uz.A04;
    }

    public final void A02() {
        this.A02 = EnumC6181Uz.A05;
    }

    public final void A03() {
        this.A03 = EnumC6182V0.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC6181Uz.A06) {
            EnumC6181Uz enumC6181Uz = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC6181Uz != EnumC6181Uz.A02 && this.A02 != EnumC6181Uz.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC6181Uz.A06 || this.A02 == EnumC6181Uz.A02;
    }

    public final boolean A06() {
        return this.A03 == EnumC6182V0.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC6179Ux.A03;
    }
}
