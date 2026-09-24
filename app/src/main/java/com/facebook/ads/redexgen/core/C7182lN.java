package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7182lN implements InterfaceC5564Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public final List<C5581LC> A04;
    public final InterfaceC5361Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, Ascii.DLE, Ascii.DLE, Ascii.f22492FF, 9, 3, 1, Ascii.DC4, 9, Ascii.f22499SI, Ascii.f22500SO, -49, 4, Ascii.SYN, 2, 19, Ascii.NAK, 2, 19};
    }

    public C7182lN(List<C5581LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC5361Hd[list.size()];
    }

    private boolean A02(C45944v c45944v, int i) {
        if (c45944v.A07() == 0) {
            return false;
        }
        if (c45944v.A0I() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void A5A(C45944v c45944v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c45944v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c45944v, 0)) {
                return;
            }
            int iA09 = c45944v.A09();
            int iA07 = c45944v.A07();
            for (InterfaceC5361Hd interfaceC5361Hd : this.A05) {
                c45944v.A0f(iA09);
                interfaceC5361Hd.AIr(c45944v, iA07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + iA07;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void A5c(InterfaceC5332HA interfaceC5332HA, C5585LG c5585lg) {
        for (int i = 0; i < i; i++) {
            C5581LC c5581lc = this.A04.get(i);
            c5585lg.A05();
            InterfaceC5361Hd interfaceC5361HdAKS = interfaceC5332HA.AKS(c5585lg.A03(), 3);
            interfaceC5361HdAKS.A6e(new C44672p().A0y(c5585lg.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(c5581lc.A02)).A10(c5581lc.A01).A14());
            this.A05[i] = interfaceC5361HdAKS;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != -9223372036854775807L) {
                for (InterfaceC5361Hd interfaceC5361Hd : this.A05) {
                    interfaceC5361Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AGq(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j != -9223372036854775807L) {
            this.A02 = j;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5564Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = -9223372036854775807L;
    }
}
