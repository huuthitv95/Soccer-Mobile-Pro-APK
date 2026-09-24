package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7478qQ implements InterfaceC442224 {
    public C44171z A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public static String[] A06 = {"SFReXFLlI4UOpNrTR2oqZFPGLDG", "ddXxuwKTXrUgQKU5ch6dGlXzKHCNOB4g", "Ka5UQw68nW6F3F15EfeRiHjBxEcftjYi", "TyFhGc", "kpbiwOTtMuCD4LdTginQH36Spnec", "0F8UT5ylucYBCPc3EM7PRaW9", "xfENz4MNKGXPVezlH9FH4FhAxccJ4akv", "0RZwBffOFnQLfCTDTyZnu0"};
    public static final C7478qQ A07 = new C441820().A05();
    public static final String A0A = AbstractC46115C.A0h(0);
    public static final String A0B = AbstractC46115C.A0h(1);
    public static final String A0D = AbstractC46115C.A0h(2);
    public static final String A09 = AbstractC46115C.A0h(3);
    public static final String A0C = AbstractC46115C.A0h(4);
    public static final InterfaceC442123<C7478qQ> A08 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.qR
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7478qQ.A00(bundle);
        }
    };

    public C7478qQ(int i, int i2, int i3, int i4, int i5) {
        this.A02 = i;
        this.A03 = i2;
        this.A05 = i3;
        this.A01 = i4;
        this.A04 = i5;
    }

    public static /* synthetic */ C7478qQ A00(Bundle bundle) {
        C441820 c441820 = new C441820();
        if (bundle.containsKey(A0A)) {
            c441820.A01(bundle.getInt(A0A));
        }
        if (bundle.containsKey(A0B)) {
            c441820.A02(bundle.getInt(A0B));
        }
        String str = A0D;
        if (A06[0].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[5] = "GWwDRzmwjjhTaGez4rqlH73J";
        strArr[4] = "f0ceflDKapN9i1ydncZgjkps1oFM";
        if (bundle.containsKey(str)) {
            c441820.A04(bundle.getInt(A0D));
        }
        if (bundle.containsKey(A09)) {
            c441820.A00(bundle.getInt(A09));
        }
        if (bundle.containsKey(A0C)) {
            c441820.A03(bundle.getInt(A0C));
        }
        return c441820.A05();
    }

    public final C44171z A01() {
        if (this.A00 == null) {
            this.A00 = new C44171z(this);
        }
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7478qQ c7478qQ = (C7478qQ) obj;
        return this.A02 == c7478qQ.A02 && this.A03 == c7478qQ.A03 && this.A05 == c7478qQ.A05 && this.A01 == c7478qQ.A01 && this.A04 == c7478qQ.A04;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A03) * 31;
        int result3 = this.A05;
        int result4 = (((result2 + result3) * 31) + this.A01) * 31;
        int result5 = this.A04;
        return result4 + result5;
    }
}
