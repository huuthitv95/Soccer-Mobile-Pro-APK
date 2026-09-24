package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5455JA {
    public static String[] A0C = {"uuzqWXLhVU5h", "MCiAyNDofRMgV8twnC7AiCrYM6kNh0jg", "HJXujHHcElJRTDtcfeo3Sy7Hv18RGZgy", "Amjr7hMXQx0e32VF8yWASHBDx37PervK", "NgKcffCH0RNam7yPBBIvJezNpINfNkiL", "oMs9elp", "apSAFH841DSL3paVepKSIoWcAWyBkdVZ", "h51QMR"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C5446J1 A04;
    public C5472JR A05;
    public boolean A06;
    public final InterfaceC5361Hd A08;
    public final C5471JQ A09 = new C5471JQ();
    public final C45944v A07 = new C45944v();
    public final C45944v A0B = new C45944v(1);
    public final C45944v A0A = new C45944v();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final int A04(int i, int i2) {
        C45944v c45944v;
        int length;
        C5470JP c5470jpA07 = A07();
        if (c5470jpA07 == null) {
            return 0;
        }
        if (c5470jpA07.A00 != 0) {
            c45944v = this.A09.A0H;
            length = c5470jpA07.A00;
        } else {
            byte[] bArr = (byte[]) AbstractC46115C.A0f(c5470jpA07.A04);
            this.A0A.A0j(bArr, bArr.length);
            c45944v = this.A0A;
            length = bArr.length;
        }
        boolean zA06 = this.A09.A06(this.A01);
        boolean z = zA06 || i2 != 0;
        this.A0B.A0l()[0] = (byte) ((z ? 128 : 0) | length);
        this.A0B.A0f(0);
        this.A08.AIs(this.A0B, 1, 1);
        this.A08.AIs(c45944v, length, 1);
        if (!z) {
            return length + 1;
        }
        if (!zA06) {
            this.A07.A0d(8);
            byte[] bArrA0l = this.A07.A0l();
            bArrA0l[0] = 0;
            bArrA0l[1] = 1;
            bArrA0l[2] = (byte) ((i2 >> 8) & 255);
            bArrA0l[3] = (byte) (i2 & 255);
            bArrA0l[4] = (byte) ((i >> 24) & 255);
            bArrA0l[5] = (byte) ((i >> 16) & 255);
            bArrA0l[6] = (byte) ((i >> 8) & 255);
            bArrA0l[7] = (byte) (i & 255);
            this.A08.AIs(this.A07, 8, 1);
            return length + 1 + 8;
        }
        C45944v c45944v2 = this.A09.A0H;
        int iA0M = c45944v2.A0M();
        c45944v2.A0g(-2);
        int i3 = (iA0M * 6) + 2;
        if (i2 != 0) {
            this.A07.A0d(i3);
            byte[] bArrA0l2 = this.A07.A0l();
            c45944v2.A0k(bArrA0l2, 0, i3);
            int i4 = (((bArrA0l2[2] & 255) << 8) | (bArrA0l2[3] & 255)) + i2;
            bArrA0l2[2] = (byte) ((i4 >> 8) & 255);
            bArrA0l2[3] = (byte) (i4 & 255);
            c45944v2 = this.A07;
        }
        this.A08.AIs(c45944v2, i3, 1);
        return length + 1 + i3;
    }

    public C5455JA(InterfaceC5361Hd interfaceC5361Hd, C5472JR c5472jr, C5446J1 c5446j1) {
        this.A08 = interfaceC5361Hd;
        this.A05 = c5472jr;
        this.A04 = c5446j1;
        A0C(c5472jr, c5446j1);
    }

    public final int A02() {
        int i;
        if (!this.A06) {
            i = this.A05.A04[this.A01];
        } else {
            boolean[] zArr = this.A09.A0G;
            int flags = this.A01;
            i = zArr[flags] ? 1 : 0;
        }
        if (A07() == null) {
            return i;
        }
        String[] strArr = A0C;
        String str = strArr[3];
        String str2 = strArr[2];
        int iCharAt = str.charAt(20);
        int flags2 = str2.charAt(20);
        if (iCharAt != flags2) {
            throw new RuntimeException();
        }
        A0C[4] = "Hkeae3ogmEOju43arfP4ZrrsYFDfrpvf";
        return i | 1073741824;
    }

    public final int A03() {
        if (!this.A06) {
            return this.A05.A05[this.A01];
        }
        return this.A09.A0B[this.A01];
    }

    public final long A05() {
        if (!this.A06) {
            return this.A05.A06[this.A01];
        }
        return this.A09.A0E[this.A02];
    }

    public final long A06() {
        if (!this.A06) {
            return this.A05.A07[this.A01];
        }
        return this.A09.A00(this.A01);
    }

    public final C5470JP A07() {
        C5470JP c5470jpA00;
        if (!this.A06) {
            return null;
        }
        int i = ((C5446J1) AbstractC46115C.A0f(this.A09.A06)).A02;
        if (this.A09.A07 != null) {
            c5470jpA00 = this.A09.A07;
        } else {
            c5470jpA00 = this.A05.A03.A00(i);
        }
        if (c5470jpA00 == null || !c5470jpA00.A03) {
            return null;
        }
        C5470JP encryptionBox = c5470jpA00;
        return encryptionBox;
    }

    public final void A08() {
        this.A09.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final void A09() {
        C5470JP c5470jpA07 = A07();
        if (c5470jpA07 == null) {
            return;
        }
        C45944v c45944v = this.A09.A0H;
        if (c5470jpA07.A00 != 0) {
            c45944v.A0g(c5470jpA07.A00);
        }
        if (this.A09.A06(this.A01)) {
            c45944v.A0g(c45944v.A0M() * 6);
        }
    }

    public final void A0A(long j) {
        for (int i = this.A01; i < searchIndex && this.A09.A00(i) <= j; i++) {
            if (this.A09.A0G[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A0B(DrmInitData drmInitData) {
        C5470JP encryptionBox = this.A05.A03.A00(((C5446J1) AbstractC46115C.A0f(this.A09.A06)).A02);
        this.A08.A6e(this.A05.A03.A07.A07().A0u(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)).A14());
    }

    public final void A0C(C5472JR c5472jr, C5446J1 c5446j1) {
        this.A05 = c5472jr;
        this.A04 = c5446j1;
        this.A08.A6e(c5472jr.A03.A07);
        A08();
    }

    public final boolean A0D() {
        this.A01++;
        if (!this.A06) {
            return false;
        }
        this.A00++;
        if (this.A00 != this.A09.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
