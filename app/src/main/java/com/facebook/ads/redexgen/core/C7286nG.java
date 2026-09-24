package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7286nG extends AbstractC5180Eh<C7286nG> implements Comparable<C7286nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C7286nG> list, List<C7286nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C7286nG(int i, C7435pg c7435pg, int i2, C48749i c48749i, int i3, String str) {
        List<String> listA03;
        super(i, c7435pg, i2);
        int i4 = 0;
        this.A08 = C48739h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C7431pc) c48749i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c48749i.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = c48749i.A0K;
        }
        for (int bestLanguageIndex = 0; bestLanguageIndex < listA03.size(); bestLanguageIndex++) {
            int iA02 = C48739h.A02(super.A02, listA03.get(bestLanguageIndex), c48749i.A0P);
            if (iA02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        this.A02 = C48739h.A00(super.A02.A0E, ((C7431pc) c48749i).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C48739h.A02(super.A02, str, C48739h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c48749i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C48739h.A0S(i3, c48749i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C7286nG c7286nG) {
        AbstractC7324ns abstractC7324nsA06 = AbstractC7324ns.A01().A09(this.A08, c7286nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c7286nG.A00), AbstractC7474qK.A03().A06()).A06(this.A01, c7286nG.A01).A06(this.A02, c7286nG.A02).A09(this.A06, c7286nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c7286nG.A07), this.A01 == 0 ? AbstractC7474qK.A03() : AbstractC7474qK.A03().A06()).A06(this.A03, c7286nG.A03);
        if (this.A02 == 0) {
            abstractC7324nsA06 = abstractC7324nsA06.A0A(this.A05, c7286nG.A05);
        }
        return abstractC7324nsA06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static AbstractC4978BP<C7286nG> A02(int i, C7435pg c7435pg, C48749i c48749i, int[] iArr, String str) {
        C44382K c44382kA01 = AbstractC4978BP.A01();
        for (int i2 = 0; i2 < c7435pg.A01; i2++) {
            c44382kA01.A04(new C7286nG(i, c7435pg, i2, c48749i, iArr[i2], str));
        }
        return c44382kA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5180Eh
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C7286nG c7286nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5180Eh
    public final int A08() {
        return this.A04;
    }
}
