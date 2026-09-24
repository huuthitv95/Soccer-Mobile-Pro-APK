package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7428pZ implements InterfaceC442224 {
    public final int A00;
    public final C7435pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = AbstractC46115C.A0h(0);
    public static final String A09 = AbstractC46115C.A0h(1);
    public static final String A08 = AbstractC46115C.A0h(3);
    public static final String A06 = AbstractC46115C.A0h(4);
    public static final InterfaceC442123<C7428pZ> A05 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7428pZ.A00(bundle);
        }
    };

    public C7428pZ(C7435pg c7435pg, boolean z, int[] iArr, boolean[] zArr) {
        this.A00 = c7435pg.A01;
        boolean z2 = false;
        AbstractC45353y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c7435pg;
        if (z && this.A00 > 1) {
            z2 = true;
        }
        this.A02 = z2;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C7428pZ A00(Bundle bundle) {
        C7435pg c7435pg = (C7435pg) C7435pg.A06.A6f((Bundle) AbstractC45353y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC7135ka.A00(bundle.getIntArray(A09), new int[c7435pg.A01]);
        boolean[] selected = (boolean[]) AbstractC7135ka.A00(bundle.getBooleanArray(A08), new boolean[c7435pg.A01]);
        return new C7428pZ(c7435pg, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7428pZ c7428pZ = (C7428pZ) obj;
        if (this.A02 == c7428pZ.A02 && this.A01.equals(c7428pZ.A01) && Arrays.equals(this.A03, c7428pZ.A03) && Arrays.equals(this.A04, c7428pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
