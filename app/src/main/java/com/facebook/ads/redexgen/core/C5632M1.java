package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.M1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5632M1 extends AbstractC5926Qq<C5250Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC6406Yh A03;
    public C6847fp A04;
    public String A05;
    public List<C6740e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC7077jd A08;
    public final C6056Sx A09;
    public final C6902gi A0A;
    public final InterfaceC6192VA A0B;
    public final C6140UK A0C;
    public final C6365Y2 A0D;
    public final C46946X A0E;
    public final C5110DZ A0F;

    public C5632M1(C6902gi c6902gi, List<C6740e5> list, AbstractC7077jd abstractC7077jd, InterfaceC6192VA interfaceC6192VA, C6140UK c6140uk, InterfaceC6406Yh interfaceC6406Yh, String str, C46946X c46946x, C5110DZ c5110dz) {
        this.A0A = c6902gi;
        this.A0B = interfaceC6192VA;
        this.A0C = c6140uk;
        this.A09 = c6140uk.A14();
        this.A04 = c6140uk.A1G();
        this.A0D = c6140uk.A1E();
        this.A03 = interfaceC6406Yh;
        this.A08 = abstractC7077jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c46946x;
        this.A0F = c5110dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C5250Fq A0F(ViewGroup viewGroup, int i) {
        return new C5250Fq(AbstractC6581bW.A00(new C6617c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C5250Fq c5250Fq, int i) {
        C6740e5 c6740e5 = this.A06.get(i);
        c5250Fq.A0q(this.A04);
        c5250Fq.A0p(c6740e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C6847fp c6847fp) {
        this.A04 = c6847fp;
    }
}
