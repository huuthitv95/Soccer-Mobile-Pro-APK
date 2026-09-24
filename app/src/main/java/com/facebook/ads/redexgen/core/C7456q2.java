package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7456q2 implements InterfaceC442224 {
    public final Uri A00;
    public final Uri A01;
    public final Bundle A02;
    public final AbstractC7447pt A03;
    public final AbstractC7447pt A04;
    public final Boolean A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final CharSequence A0E;
    public final CharSequence A0F;
    public final CharSequence A0G;
    public final CharSequence A0H;
    public final CharSequence A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final Integer A0R;
    public final Integer A0S;
    public final Integer A0T;
    public final Integer A0U;

    @Deprecated
    public final Integer A0V;
    public final byte[] A0W;
    public static String[] A0X = {"zubbJHIGN62aQpEy91CnZekmJL7fZhcj", "Tf6Wii3TFEDBDD0h8UvX5qaY8eXSzTkW", "PzB8ZoZFbpUrc7pgJ0ghLttm", "08PAkH52X5piiuzTKugWbIZJ7g2fzjWB", "K8DhncAAf645aMURmZckD", "VnMvQYKg2m3XsU3GlEglt4TQFPWPFThI", "CnA0hK2Gvuh", "oHxylVIJyzccCX3kgnuGG4BXvpn"};
    public static final C7456q2 A0Z = new C448537().A11();
    public static final InterfaceC442123<C7456q2> A0Y = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.q6
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7456q2.A00(bundle);
        }
    };

    public C7456q2(C448537 c448537) {
        this.A0H = c448537.A0H;
        this.A08 = c448537.A08;
        this.A07 = c448537.A07;
        this.A06 = c448537.A06;
        this.A0D = c448537.A0D;
        this.A0G = c448537.A0G;
        this.A0C = c448537.A0C;
        this.A01 = c448537.A01;
        this.A04 = c448537.A04;
        this.A03 = c448537.A03;
        this.A0W = c448537.A0V;
        this.A0J = c448537.A0J;
        this.A00 = c448537.A00;
        this.A0U = c448537.A0U;
        this.A0T = c448537.A0T;
        this.A0L = c448537.A0L;
        this.A05 = c448537.A05;
        this.A0V = c448537.A0O;
        this.A0O = c448537.A0O;
        this.A0N = c448537.A0N;
        this.A0M = c448537.A0M;
        this.A0R = c448537.A0R;
        this.A0Q = c448537.A0Q;
        this.A0P = c448537.A0P;
        this.A0I = c448537.A0I;
        this.A0A = c448537.A0A;
        this.A0B = c448537.A0B;
        this.A0K = c448537.A0K;
        this.A0S = c448537.A0S;
        this.A0E = c448537.A0E;
        this.A09 = c448537.A09;
        this.A0F = c448537.A0F;
        this.A02 = c448537.A02;
    }

    public static C7456q2 A00(Bundle bundle) {
        Integer numValueOf;
        Bundle fieldBundle;
        Bundle fieldBundle2;
        C448537 c448537 = new C448537();
        C448537 c448537A0X = c448537.A0n(bundle.getCharSequence(A02(0))).A0e(bundle.getCharSequence(A02(1))).A0d(bundle.getCharSequence(A02(2))).A0c(bundle.getCharSequence(A02(3))).A0j(bundle.getCharSequence(A02(4))).A0m(bundle.getCharSequence(A02(5))).A0i(bundle.getCharSequence(A02(6))).A0X((Uri) bundle.getParcelable(A02(7)));
        byte[] byteArray = bundle.getByteArray(A02(10));
        if (bundle.containsKey(A02(29))) {
            numValueOf = Integer.valueOf(bundle.getInt(A02(29)));
        } else {
            numValueOf = null;
        }
        c448537A0X.A10(byteArray, numValueOf).A0W((Uri) bundle.getParcelable(A02(11))).A0o(bundle.getCharSequence(A02(22))).A0g(bundle.getCharSequence(A02(23))).A0h(bundle.getCharSequence(A02(24))).A0k(bundle.getCharSequence(A02(27))).A0f(bundle.getCharSequence(A02(28))).A0l(bundle.getCharSequence(A02(30))).A0Y(bundle.getBundle(A02(1000)));
        if (bundle.containsKey(A02(8)) && (fieldBundle2 = bundle.getBundle(A02(8))) != null) {
            c448537.A0a((AbstractC7447pt) AbstractC7447pt.A03.A6f(fieldBundle2));
        }
        if (bundle.containsKey(A02(9)) && (fieldBundle = bundle.getBundle(A02(9))) != null) {
            c448537.A0Z((AbstractC7447pt) AbstractC7447pt.A03.A6f(fieldBundle));
        }
        if (bundle.containsKey(A02(12))) {
            c448537.A0z(Integer.valueOf(bundle.getInt(A02(12))));
        }
        if (bundle.containsKey(A02(13))) {
            c448537.A0y(Integer.valueOf(bundle.getInt(A02(13))));
        }
        if (bundle.containsKey(A02(14))) {
            c448537.A0q(Integer.valueOf(bundle.getInt(A02(14))));
        }
        if (bundle.containsKey(A02(15))) {
            c448537.A0b(Boolean.valueOf(bundle.getBoolean(A02(15))));
        }
        if (bundle.containsKey(A02(16))) {
            c448537.A0t(Integer.valueOf(bundle.getInt(A02(16))));
        }
        if (bundle.containsKey(A02(17))) {
            c448537.A0s(Integer.valueOf(bundle.getInt(A02(17))));
        }
        if (bundle.containsKey(A02(18))) {
            c448537.A0r(Integer.valueOf(bundle.getInt(A02(18))));
        }
        if (bundle.containsKey(A02(19))) {
            c448537.A0w(Integer.valueOf(bundle.getInt(A02(19))));
        }
        if (bundle.containsKey(A02(20))) {
            c448537.A0v(Integer.valueOf(bundle.getInt(A02(20))));
        }
        if (bundle.containsKey(A02(21))) {
            c448537.A0u(Integer.valueOf(bundle.getInt(A02(21))));
        }
        if (bundle.containsKey(A02(25))) {
            c448537.A0p(Integer.valueOf(bundle.getInt(A02(25))));
        }
        if (bundle.containsKey(A02(26))) {
            c448537.A0x(Integer.valueOf(bundle.getInt(A02(26))));
        }
        return c448537.A11();
    }

    public static String A02(int i) {
        return Integer.toString(i, 36);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    public final boolean equals(Object obj) {
        Integer num;
        String[] strArr;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7456q2 c7456q2 = (C7456q2) obj;
        if (AbstractC46115C.A1E(this.A0H, c7456q2.A0H) && AbstractC46115C.A1E(this.A08, c7456q2.A08) && AbstractC46115C.A1E(this.A07, c7456q2.A07) && AbstractC46115C.A1E(this.A06, c7456q2.A06) && AbstractC46115C.A1E(this.A0D, c7456q2.A0D) && AbstractC46115C.A1E(this.A0G, c7456q2.A0G) && AbstractC46115C.A1E(this.A0C, c7456q2.A0C) && AbstractC46115C.A1E(this.A01, c7456q2.A01) && AbstractC46115C.A1E(this.A04, c7456q2.A04) && AbstractC46115C.A1E(this.A03, c7456q2.A03)) {
            byte[] bArr = this.A0W;
            if (A0X[7].length() == 26) {
                throw new RuntimeException();
            }
            A0X[7] = "M3w6qihAe";
            if (Arrays.equals(bArr, c7456q2.A0W) && AbstractC46115C.A1E(this.A0J, c7456q2.A0J) && AbstractC46115C.A1E(this.A00, c7456q2.A00)) {
                boolean zA1E = AbstractC46115C.A1E(this.A0U, c7456q2.A0U);
                if (A0X[1].charAt(3) != 'C') {
                    A0X[1] = "sGLE1KFsO49Fm5sc1i2fDCDxvKajbosH";
                    if (zA1E) {
                        if (AbstractC46115C.A1E(this.A0T, c7456q2.A0T) && AbstractC46115C.A1E(this.A0L, c7456q2.A0L) && AbstractC46115C.A1E(this.A05, c7456q2.A05)) {
                            num = this.A0O;
                            strArr = A0X;
                            if (strArr[5].charAt(18) != strArr[3].charAt(18)) {
                                if (AbstractC46115C.A1E(num, c7456q2.A0O)) {
                                    if (!AbstractC46115C.A1E(this.A0N, c7456q2.A0N) && AbstractC46115C.A1E(this.A0M, c7456q2.A0M) && AbstractC46115C.A1E(this.A0R, c7456q2.A0R) && AbstractC46115C.A1E(this.A0Q, c7456q2.A0Q) && AbstractC46115C.A1E(this.A0P, c7456q2.A0P) && AbstractC46115C.A1E(this.A0I, c7456q2.A0I) && AbstractC46115C.A1E(this.A0A, c7456q2.A0A) && AbstractC46115C.A1E(this.A0B, c7456q2.A0B) && AbstractC46115C.A1E(this.A0K, c7456q2.A0K) && AbstractC46115C.A1E(this.A0S, c7456q2.A0S) && AbstractC46115C.A1E(this.A0E, c7456q2.A0E) && AbstractC46115C.A1E(this.A09, c7456q2.A09) && AbstractC46115C.A1E(this.A0F, c7456q2.A0F)) {
                                        return true;
                                    }
                                }
                            } else {
                                A0X[1] = "FzzazV5V7n9nSTJyboWGAvjneHgdA0Tq";
                                if (AbstractC46115C.A1E(num, c7456q2.A0O)) {
                                    if (!AbstractC46115C.A1E(this.A0N, c7456q2.A0N)) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    String[] strArr2 = A0X;
                    strArr2[5] = "7vhYmT0vu97iLL1XFRgpkTAhMizvZPwW";
                    strArr2[3] = "Q2QItTO3MMpvxLwffhgMDG758PSZ9Zd3";
                    if (zA1E) {
                        if (AbstractC46115C.A1E(this.A0T, c7456q2.A0T)) {
                            num = this.A0O;
                            strArr = A0X;
                            if (strArr[5].charAt(18) != strArr[3].charAt(18)) {
                                if (AbstractC46115C.A1E(num, c7456q2.A0O)) {
                                    if (!AbstractC46115C.A1E(this.A0N, c7456q2.A0N)) {
                                    }
                                }
                            } else {
                                A0X[1] = "FzzazV5V7n9nSTJyboWGAvjneHgdA0Tq";
                                if (AbstractC46115C.A1E(num, c7456q2.A0O)) {
                                    if (!AbstractC46115C.A1E(this.A0N, c7456q2.A0N)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC5025CB.A00(this.A0H, this.A08, this.A07, this.A06, this.A0D, this.A0G, this.A0C, this.A01, this.A04, this.A03, Integer.valueOf(Arrays.hashCode(this.A0W)), this.A0J, this.A00, this.A0U, this.A0T, this.A0L, this.A05, this.A0O, this.A0N, this.A0M, this.A0R, this.A0Q, this.A0P, this.A0I, this.A0A, this.A0B, this.A0K, this.A0S, this.A0E, this.A09, this.A0F);
    }
}
