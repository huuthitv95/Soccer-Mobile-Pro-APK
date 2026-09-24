package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.J7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5452J7 {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C5446J1 A04;
    public C5469JO A05;
    public final InterfaceC5361Hd A06;
    public final C5471JQ A07 = new C5471JQ();
    public final C45944v A09 = new C45944v(1);
    public final C45944v A08 = new C45944v();

    public C5452J7(InterfaceC5361Hd interfaceC5361Hd) {
        this.A06 = interfaceC5361Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C5470JP A00() {
        C5470JP encryptionBox;
        int i = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C5470JP c5470jpA00 = A00();
        if (c5470jpA00 == null) {
            return;
        }
        C45944v c45944v = this.A07.A0H;
        if (c5470jpA00.A00 != 0) {
            c45944v.A0g(c5470jpA00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c45944v.A0g(c45944v.A0M() * 6);
        }
    }

    public final int A04() {
        C45944v c45944v;
        int vectorSize;
        C5470JP c5470jpA00 = A00();
        if (c5470jpA00 == null) {
            return 0;
        }
        if (c5470jpA00.A00 != 0) {
            c45944v = this.A07.A0H;
            vectorSize = c5470jpA00.A00;
        } else {
            byte[] initVectorData = c5470jpA00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c45944v = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean zA06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((zA06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        InterfaceC5361Hd interfaceC5361Hd = this.A06;
        C45944v initializationVectorData = this.A09;
        interfaceC5361Hd.AIr(initializationVectorData, 1);
        this.A06.AIr(c45944v, vectorSize);
        if (!zA06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        C45944v c45944v2 = this.A07.A0H;
        int iA0M = c45944v2.A0M();
        c45944v2.A0g(-2);
        int i = (iA0M * 6) + 2;
        this.A06.AIr(c45944v2, i);
        return vectorSize + 1 + i;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A06(long j) {
        for (int i = this.A01; i < searchIndex && this.A07.A00(i) < j; i++) {
            if (this.A07.A0G[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        C5470JP encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6e(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(C5469JO c5469jo, C5446J1 c5446j1) {
        this.A05 = (C5469JO) AbstractC45353y.A01(c5469jo);
        this.A04 = (C5446J1) AbstractC45353y.A01(c5446j1);
        this.A06.A6e(c5469jo.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
