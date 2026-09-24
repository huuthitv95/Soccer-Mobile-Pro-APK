package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7292nM extends AbstractC5180Eh<C7292nM> implements Comparable<C7292nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C48749i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C7292nM(int i, C7435pg c7435pg, int i2, C48749i c48749i, int i3, boolean z, InterfaceC7143kj<C7472qI> interfaceC7143kj) {
        super(i, c7435pg, i2);
        this.A0A = c48749i;
        this.A0B = C48739h.A0K(super.A02.A0V);
        this.A0F = C48739h.A0S(i3, false);
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < c48749i.A0I.size(); i6++) {
            int iA02 = C48739h.A02(super.A02, c48749i.A0I.get(i6), false);
            if (iA02 > 0) {
                i5 = i6;
                i4 = iA02;
                break;
            }
        }
        this.A04 = i5;
        this.A05 = i4;
        this.A07 = C48739h.A00(super.A02.A0E, ((C7431pc) c48749i).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C7431pc) c48749i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C7431pc) c48749i).A02) && interfaceC7143kj.A4C(super.A02);
        String[] strArrA1L = AbstractC46115C.A1L();
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        for (int i9 = 0; i9 < strArrA1L.length; i9++) {
            int iA03 = C48739h.A02(super.A02, strArrA1L[i9], false);
            if (iA03 > 0) {
                i7 = i9;
                i8 = iA03;
                break;
            }
        }
        this.A02 = i7;
        this.A03 = i8;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < c48749i.A0J.size(); i11++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c48749i.A0J.get(i11))) {
                i10 = i11;
                break;
            }
        }
        this.A06 = i10;
        this.A0H = AbstractC47677i.A02(i3) == 128;
        this.A0G = AbstractC47677i.A04(i3) == 64;
        this.A09 = A00(i3, z);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C7292nM> list, List<C7292nM> list2) {
        return ((C7292nM) Collections.max(list)).compareTo((C7292nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AbstractC4978BP<C7292nM> A03(int i, C7435pg c7435pg, C48749i c48749i, int[] iArr, boolean z, InterfaceC7143kj<C7472qI> interfaceC7143kj) {
        C44382K c44382kA01 = AbstractC4978BP.A01();
        for (int i2 = 0; i2 < c7435pg.A01; i2++) {
            c44382kA01.A04(new C7292nM(i, c7435pg, i2, c48749i, iArr[i2], z, interfaceC7143kj));
        }
        return c44382kA01.A05();
    }

    private int A00(int i, boolean z) {
        if (!C48739h.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C48739h.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C7292nM c7292nM) {
        AbstractC7474qK abstractC7474qKA06;
        AbstractC7474qK abstractC7474qKA07 = (this.A0E && this.A0F) ? C48739h.A09 : C48739h.A09.A06();
        AbstractC7324ns abstractC7324nsA08 = AbstractC7324ns.A01().A09(this.A0F, c7292nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c7292nM.A04), AbstractC7474qK.A03().A06()).A06(this.A05, c7292nM.A05).A06(this.A07, c7292nM.A07).A09(this.A0D, c7292nM.A0D).A09(this.A0C, c7292nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c7292nM.A02), AbstractC7474qK.A03().A06()).A06(this.A03, c7292nM.A03).A09(this.A0E, c7292nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c7292nM.A06), AbstractC7474qK.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(c7292nM.A00);
        if (this.A0A.A0O) {
            abstractC7474qKA06 = C48739h.A09.A06();
        } else {
            abstractC7474qKA06 = C48739h.A0A;
        }
        AbstractC7324ns abstractC7324nsA09 = abstractC7324nsA08.A08(numValueOf, numValueOf2, abstractC7474qKA06).A09(this.A0H, c7292nM.A0H).A09(this.A0G, c7292nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c7292nM.A01), abstractC7474qKA07).A08(Integer.valueOf(this.A08), Integer.valueOf(c7292nM.A08), abstractC7474qKA07);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(c7292nM.A00);
        if (!AbstractC46115C.A1E(this.A0B, c7292nM.A0B)) {
            abstractC7474qKA07 = C48739h.A0A;
        }
        return abstractC7324nsA09.A08(numValueOf3, numValueOf4, abstractC7474qKA07).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // com.facebook.ads.redexgen.core.AbstractC5180Eh
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C7292nM c7292nM) {
        if (this.A0A.A00) {
            if ((!this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC5180Eh) c7292nM).A02.A0W))) && ((this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC5180Eh) c7292nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c7292nM.A0H && this.A0G == c7292nM.A0G)))) {
            }
        } else if (super.A02.A06 != -1) {
            int i = super.A02.A06;
            String[] strArr = A0I;
            if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
            strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            if (i == ((AbstractC5180Eh) c7292nM).A02.A06) {
                return !this.A0A.A02 ? true : true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5180Eh
    public final int A08() {
        return this.A09;
    }
}
