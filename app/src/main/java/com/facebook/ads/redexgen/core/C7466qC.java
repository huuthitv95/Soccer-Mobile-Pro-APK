package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7466qC implements InterfaceC442224 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C7466qC A06 = new C44732v().A0A();
    public static final InterfaceC442123<C4923AW> A05 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return new C44732v().A06(bundle.getLong(C7466qC.A01(0), 0L)).A05(bundle.getLong(C7466qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C7466qC.A01(2), false)).A07(bundle.getBoolean(C7466qC.A01(3), false)).A09(bundle.getBoolean(C7466qC.A01(4), false)).A0B();
        }
    };

    public C7466qC(C44732v c44732v) {
        this.A01 = c44732v.A01;
        this.A00 = c44732v.A00;
        this.A03 = c44732v.A03;
        this.A02 = c44732v.A02;
        this.A04 = c44732v.A04;
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7466qC)) {
            return false;
        }
        C7466qC c7466qC = (C7466qC) obj;
        return this.A01 == c7466qC.A01 && this.A00 == c7466qC.A00 && this.A03 == c7466qC.A03 && this.A02 == c7466qC.A02 && this.A04 == c7466qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
