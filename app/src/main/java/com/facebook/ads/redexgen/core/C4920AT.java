package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4920AT extends AbstractC7447pt {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC46115C.A0h(1);
    public static final String A03 = AbstractC46115C.A0h(2);
    public static final InterfaceC442123<C4920AT> A02 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pr
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C4920AT.A00(bundle);
        }
    };

    public C4920AT() {
        this.A01 = false;
        this.A00 = false;
    }

    public C4920AT(boolean z) {
        this.A01 = true;
        this.A00 = z;
    }

    public static C4920AT A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC7447pt.A02, -1) == 3;
        AbstractC45353y.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new C4920AT(bundle.getBoolean(A03, false));
        }
        return new C4920AT();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4920AT)) {
            return false;
        }
        C4920AT c4920at = (C4920AT) obj;
        return this.A00 == c4920at.A00 && this.A01 == c4920at.A01;
    }

    public final int hashCode() {
        return AbstractC5025CB.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
