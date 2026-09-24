package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7461q7 implements InterfaceC442224 {
    public final C7466qC A00;

    @Deprecated
    public final C4923AW A01;
    public final C7464qA A02;
    public final C448032 A03;

    @Deprecated
    public final C7463q9 A04;
    public final C7456q2 A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C7461q7 A09 = new C44722u().A05();
    public static final InterfaceC442123<C7461q7> A08 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.qE
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7461q7.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C7461q7 A00(Bundle bundle) {
        String str = (String) AbstractC45353y.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C7464qA c7464qA = bundle2 == null ? C7464qA.A07 : (C7464qA) C7464qA.A06.A6f(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C7456q2 c7456q2 = bundle3 == null ? C7456q2.A0Z : (C7456q2) C7456q2.A0Y.A6f(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C7461q7(str, bundle4 == null ? C4923AW.A00 : (C4923AW) C7466qC.A05.A6f(bundle4), null, c7464qA, c7456q2);
    }

    public C7461q7(String str, C4923AW c4923aw, C7463q9 c7463q9, C7464qA c7464qA, C7456q2 c7456q2) {
        this.A06 = str;
        this.A03 = c7463q9;
        this.A04 = c7463q9;
        this.A02 = c7464qA;
        this.A05 = c7456q2;
        this.A00 = c4923aw;
        this.A01 = c4923aw;
    }

    public static String A02(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7461q7)) {
            return false;
        }
        C7461q7 c7461q7 = (C7461q7) obj;
        if (AbstractC46115C.A1E(this.A06, c7461q7.A06)) {
            C7466qC c7466qC = this.A00;
            C7466qC c7466qC2 = c7461q7.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c7466qC.equals(c7466qC2) && AbstractC46115C.A1E(this.A03, c7461q7.A03) && AbstractC46115C.A1E(this.A02, c7461q7.A02) && AbstractC46115C.A1E(this.A05, c7461q7.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int iHashCode = (((i + result2) * 31) + this.A02.hashCode()) * 31;
        C7466qC c7466qC = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int iCharAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (iCharAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c7466qC.hashCode();
        return ((iHashCode + result4) * 31) + this.A05.hashCode();
    }
}
