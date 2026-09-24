package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4905AE implements InterfaceC7381oo, InterfaceC47747p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C47777s A05;
    public C48098O A06;
    public InterfaceC5104DT A07;
    public boolean A08;
    public boolean A09;
    public C7472qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC7031ir A0B = EnumC7031ir.A09;
    public final C47226z A0D = new C47226z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j, boolean z) throws C4904AD;

    public abstract void A1c(C7472qI[] c7472qIArr, long j, long j2) throws C4904AD;

    public AbstractC4905AE(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j, boolean z) throws C4904AD {
        this.A08 = false;
        this.A02 = j;
        this.A03 = j;
        A1a(j, z);
    }

    public final int A1Q(long j) {
        return ((InterfaceC5104DT) AbstractC45353y.A01(this.A07)).AK2(j - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C47226z c47226z, C7393p0 c7393p0, int i) {
        int iAHP = ((InterfaceC5104DT) AbstractC45353y.A01(this.A07)).AHP(c47226z, c7393p0, i);
        if (iAHP == -4) {
            if (c7393p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c7393p0.A00 = c7393p0.A01;
            c7393p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c7393p0.A01);
        } else if (iAHP == -5) {
            C7472qI c7472qI = (C7472qI) AbstractC45353y.A01(c47226z.A00);
            if (c7472qI.A0M != Long.MAX_VALUE) {
                c47226z.A00 = c7472qI.A07().A0s(c7472qI.A0M + this.A04).A14();
            }
        }
        return iAHP;
    }

    public final C4904AD A1S(Throwable th, C7472qI c7472qI, int i) {
        return A1T(th, c7472qI, false, i);
    }

    public final C4904AD A1T(Throwable th, C7472qI c7472qI, boolean z, int i) {
        int iA03 = 4;
        if (c7472qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c7472qI);
                iA03 = AbstractC47677i.A03(formatSupport);
            } catch (C4904AD unused) {
            } finally {
                this.A09 = false;
            }
        }
        return C4904AD.A04(th, getName(), A1O(), c7472qI, iA03, z, i);
    }

    public final C47226z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C47777s A1V() {
        return (C47777s) AbstractC45353y.A01(this.A05);
    }

    public final C48098O A1W() {
        return (C48098O) AbstractC45353y.A01(this.A06);
    }

    public void A1X() throws C4904AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z, boolean z2) throws C4904AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((InterfaceC5104DT) AbstractC45353y.A01(this.A07)).AAe();
    }

    public final C7472qI[] A1e() {
        return (C7472qI[]) AbstractC45353y.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void A5x() {
        AbstractC45353y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void A6L(C47777s c47777s, C7472qI[] c7472qIArr, InterfaceC5104DT interfaceC5104DT, long j, boolean z, boolean z2, long j2, long j3) throws C4904AD {
        AbstractC45353y.A08(this.A01 == 0);
        this.A05 = c47777s;
        this.A01 = 1;
        A1b(z, z2);
        AIa(c7472qIArr, interfaceC5104DT, j2, j3);
        A1P(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final InterfaceC47747p A7D() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public InterfaceC473178 A8T() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC7031ir A99() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final InterfaceC5104DT A9D() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo, com.facebook.ads.redexgen.core.InterfaceC47747p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC47617c
    public void A9i(int i, Object obj) throws C4904AD {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void AA9(int i, C48098O c48098o) {
        this.A00 = i;
        this.A06 = c48098o;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void ACU() throws IOException {
        ((InterfaceC5104DT) AbstractC45353y.A01(this.A07)).ACR();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void AIa(C7472qI[] c7472qIArr, InterfaceC5104DT interfaceC5104DT, long j, long j2) throws C4904AD {
        AbstractC45353y.A08(!this.A08);
        this.A07 = interfaceC5104DT;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j;
        }
        this.A0A = c7472qIArr;
        this.A04 = j2;
        A1c(c7472qIArr, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void AIm(long j) throws C4904AD {
        A1P(j, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws C4904AD {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void start() throws C4904AD {
        AbstractC45353y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7381oo
    public final void stop() {
        AbstractC45353y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
