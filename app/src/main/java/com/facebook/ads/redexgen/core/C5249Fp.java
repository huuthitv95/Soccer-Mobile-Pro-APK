package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5249Fp extends AbstractC5926Qq<C5233FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC6400Yb A04;
    public InterfaceC6406Yh A05;
    public String A06;
    public List<C6740e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC7077jd A0A;
    public final C6056Sx A0B;
    public final C6902gi A0C;
    public final InterfaceC6192VA A0D;
    public final C6365Y2 A0E;
    public final C5258Fy A0F;
    public final C6847fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C5249Fp(C6902gi c6902gi, List<C6740e5> list, AbstractC7077jd abstractC7077jd, InterfaceC6192VA interfaceC6192VA, C6056Sx c6056Sx, C6847fp c6847fp, C6365Y2 c6365y2, InterfaceC6406Yh interfaceC6406Yh, String str, int i, int i2, int i3, int i4, C5258Fy c5258Fy, AbstractC6400Yb abstractC6400Yb) {
        this.A0C = c6902gi;
        this.A0D = interfaceC6192VA;
        this.A0B = c6056Sx;
        this.A0G = c6847fp;
        this.A0E = c6365y2;
        this.A05 = interfaceC6406Yh;
        this.A0A = abstractC7077jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c5258Fy;
        this.A04 = abstractC6400Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C5233FY A0F(ViewGroup viewGroup, int i) {
        return new C5233FY(AbstractC6671cy.A00(new C6617c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C5233FY c5233fy, int i) {
        c5233fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            c5233fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    public final int A0B() {
        return this.A07.size();
    }
}
