package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pe */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7433pe implements InterfaceC442224 {
    public final C7435pg A00;
    public final AbstractC4978BP<Integer> A01;
    public static final String A04 = AbstractC46115C.A0h(0);
    public static final String A03 = AbstractC46115C.A0h(1);
    public static final InterfaceC442123<C7433pe> A02 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pf
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7433pe.A00(bundle);
        }
    };

    public C7433pe(C7435pg c7435pg, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c7435pg.A01)) {
            this.A00 = c7435pg;
            this.A01 = AbstractC4978BP.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C7433pe A00(Bundle bundle) {
        return new C7433pe((C7435pg) C7435pg.A06.A6f((Bundle) AbstractC45353y.A01(bundle.getBundle(A04))), AbstractC4945As.A09((int[]) AbstractC45353y.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7433pe c7433pe = (C7433pe) obj;
        return this.A00.equals(c7433pe.A00) && this.A01.equals(c7433pe.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
