package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.L1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5570L1 {
    public static String[] A0G = {"4S0ZR9", "9atY4pLS3", "JCkQ", "0FGnuhRUJbXFjAeocMQA4", "Bc2FjzyWuEwoYoDKosvue", "DSb6itpNp95G1DjaOdl5F45O", "d2IfSwPvc8yd2jGVLBTV47FBT3G8Pl4J", "SXUDcryZ"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C5349HR A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C5570L1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(C5570L1 c5570l1) {
        if (!this.A0F) {
            return false;
        }
        if (!c5570l1.A0F) {
            return true;
        }
        C5349HR c5349hr = (C5349HR) AbstractC45353y.A02(this.A09);
        C5349HR spsData = c5570l1.A09;
        C5349HR otherSpsData = (C5349HR) AbstractC45353y.A02(spsData);
        if (this.A03 == c5570l1.A03 && this.A07 == c5570l1.A07 && this.A0C == c5570l1.A0C && ((!this.A0B || !c5570l1.A0B || this.A0A == c5570l1.A0A) && ((this.A05 == c5570l1.A05 || (this.A05 != 0 && c5570l1.A05 != 0)) && ((c5349hr.A07 != 0 || otherSpsData.A07 != 0 || (this.A06 == c5570l1.A06 && this.A02 == c5570l1.A02)) && ((c5349hr.A07 != 1 || otherSpsData.A07 != 1 || (this.A00 == c5570l1.A00 && this.A01 == c5570l1.A01)) && this.A0E == c5570l1.A0E))))) {
            boolean z = this.A0E;
            if (A0G[6].charAt(8) == '9') {
                throw new RuntimeException();
            }
            A0G[6] = "vYoSPXEMP2H1rloX7Zmdh99svIQCcR37";
            if (!z || this.A04 == c5570l1.A04) {
                return false;
            }
        }
        return true;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i) {
        this.A08 = i;
        this.A0D = true;
    }

    public final void A04(C5349HR c5349hr, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.A09 = c5349hr;
        this.A05 = i;
        this.A08 = i2;
        this.A03 = i3;
        this.A07 = i4;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A0E = z4;
        this.A04 = i5;
        this.A06 = i6;
        this.A02 = i7;
        this.A00 = i8;
        this.A01 = i9;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        return this.A0D && (this.A08 == 7 || this.A08 == 2);
    }
}
