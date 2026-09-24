package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9j */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC48759j implements InterfaceC7284nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C7472qI[] A04;
    public final int A05;
    public final C7435pg A06;
    public final int[] A07;

    public AbstractC48759j(C7435pg c7435pg, int[] iArr, int i) {
        AbstractC45353y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C7435pg) AbstractC45353y.A01(c7435pg);
        this.A05 = iArr.length;
        this.A04 = new C7472qI[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            C7472qI[] c7472qIArr = this.A04;
            int i3 = iArr[i2];
            c7472qIArr[i2] = c7435pg.A08(i3);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC48759j.A07((C7472qI) obj, (C7472qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c7435pg.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C7472qI c7472qI, C7472qI c7472qI2) {
        return c7472qI2.A05 - c7472qI.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7284nE
    public void A5x() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7284nE
    public void A6K() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5189Eq
    public final C7472qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5189Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7284nE
    public final C7472qI A92() {
        return this.A04[A93()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5189Eq
    public final C7435pg A9L() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5189Eq
    public final int AA6(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7284nE
    public void AFJ(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC48759j abstractC48759j = (AbstractC48759j) obj;
        return this.A06 == abstractC48759j.A06 && Arrays.equals(this.A07, abstractC48759j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5189Eq
    public final int length() {
        return this.A07.length;
    }
}
