package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4924AX extends AbstractC7447pt {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC46115C.A0h(1);
    public static final String A03 = AbstractC46115C.A0h(2);
    public static final InterfaceC442123<C4924AX> A02 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.qH
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C4924AX.A00(bundle);
        }
    };

    public C4924AX() {
        this.A01 = false;
        this.A00 = false;
    }

    public C4924AX(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C4924AX A00(Bundle bundle) {
        boolean isRated = bundle.getInt(AbstractC7447pt.A02, -1) == 0;
        AbstractC45353y.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new C4924AX(bundle.getBoolean(A03, false));
        }
        return new C4924AX();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4924AX)) {
            return false;
        }
        C4924AX c4924ax = (C4924AX) obj;
        return this.A00 == c4924ax.A00 && this.A01 == c4924ax.A01;
    }

    public final int hashCode() {
        return AbstractC5025CB.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
