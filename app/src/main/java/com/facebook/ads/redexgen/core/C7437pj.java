package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7437pj implements InterfaceC442224 {
    public static byte[] A0H;
    public static String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final InterfaceC442123<C7437pj> A0J;
    public static final Object A0K;
    public static final C7461q7 A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C7464qA A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public C7461q7 A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C7437pj A00(Bundle bundle) {
        C7464qA c7464qA;
        Bundle bundle2 = bundle.getBundle(A0W);
        C7461q7 c7461q7 = bundle2 != null ? (C7461q7) C7461q7.A08.A6f(bundle2) : C7461q7.A09;
        long j = bundle.getLong(A0Y, -9223372036854775807L);
        long j2 = bundle.getLong(A0Z, -9223372036854775807L);
        long j3 = bundle.getLong(A0P, -9223372036854775807L);
        boolean z = bundle.getBoolean(A0T, false);
        boolean z2 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c7464qA = (C7464qA) C7464qA.A06.A6f(bundle3);
        } else {
            c7464qA = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z3 = bundle.getBoolean(A0S, false);
        long j4 = bundle.getLong(A0N, 0L);
        long j5 = bundle.getLong(A0O, -9223372036854775807L);
        int i = bundle.getInt(A0Q, 0);
        int i2 = bundle.getInt(A0U, 0);
        long j6 = bundle.getLong(A0X, 0L);
        C7437pj c7437pj = new C7437pj();
        c7437pj.A07(A0M, c7461q7, null, j, j2, j3, z, z2, c7464qA, j4, j5, i, i2, j6);
        c7437pj.A0F = z3;
        return c7437pj;
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, Ascii.f22500SO, 75, 4, 1, Ascii.SYN, 75, 4, Ascii.f22503VT, 1, Ascii.ETB, 10, Ascii.f22492FF, 1, Ascii.f22494GS, 75, 8, 0, 1, Ascii.f22492FF, 4, 86, 75, 6, 10, 8, 8, 10, Ascii.f22503VT, 75, 49, Ascii.f22492FF, 8, 0, 9, Ascii.f22492FF, Ascii.f22503VT, 0};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new C44722u().A03(A02(0, 48, 107)).A00(Uri.EMPTY).A05();
        A0W = AbstractC46115C.A0h(1);
        A0Y = AbstractC46115C.A0h(2);
        A0Z = AbstractC46115C.A0h(3);
        A0P = AbstractC46115C.A0h(4);
        A0T = AbstractC46115C.A0h(5);
        A0R = AbstractC46115C.A0h(6);
        A0V = AbstractC46115C.A0h(7);
        A0S = AbstractC46115C.A0h(8);
        A0N = AbstractC46115C.A0h(9);
        A0O = AbstractC46115C.A0h(10);
        A0Q = AbstractC46115C.A0h(11);
        A0U = AbstractC46115C.A0h(12);
        A0X = AbstractC46115C.A0h(13);
        A0J = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pk
            @Override // com.facebook.ads.redexgen.core.InterfaceC442123
            public final InterfaceC442224 A6f(Bundle bundle) {
                return C7437pj.A00(bundle);
            }
        };
    }

    public final long A04() {
        return AbstractC46115C.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return AbstractC46115C.A0P(this.A03);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    public final C7437pj A07(Object obj, C7461q7 c7461q7, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C7464qA c7464qA, long j4, long j5, int i, int i2, long j6) {
        Object obj3;
        this.A0C = obj;
        this.A09 = c7461q7 != null ? c7461q7 : A0L;
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        A0I[5] = "sHLAwqiYlmMVa087WjDP7yFYW";
        if (c7461q7 != null) {
            C448032 c448032 = c7461q7.A03;
            if (A0I[2].charAt(1) != 'z') {
                A0I[2] = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1";
                if (c448032 != null) {
                    obj3 = c7461q7.A03.A03;
                } else {
                    obj3 = null;
                }
            } else {
                A0I[5] = "IGwZtC";
                if (c448032 != null) {
                    obj3 = c7461q7.A03.A03;
                } else {
                    obj3 = null;
                }
            }
        } else {
            obj3 = null;
        }
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0G = z;
        this.A0D = z2;
        this.A0E = c7464qA != null;
        this.A08 = c7464qA;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = j6;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C7437pj c7437pj = (C7437pj) obj;
        if (AbstractC46115C.A1E(this.A0C, c7437pj.A0C) && AbstractC46115C.A1E(this.A09, c7437pj.A09) && AbstractC46115C.A1E(this.A0A, c7437pj.A0A) && AbstractC46115C.A1E(this.A08, c7437pj.A08) && this.A06 == c7437pj.A06 && this.A07 == c7437pj.A07 && this.A04 == c7437pj.A04 && this.A0G == c7437pj.A0G && this.A0D == c7437pj.A0D && this.A0F == c7437pj.A0F && this.A02 == c7437pj.A02 && this.A03 == c7437pj.A03 && this.A00 == c7437pj.A00 && this.A01 == c7437pj.A01) {
            long j = this.A05;
            long j2 = c7437pj.A05;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j == j2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        return (((((((((((((iHashCode * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
