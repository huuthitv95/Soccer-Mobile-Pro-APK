package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9i */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48749i extends C7431pc implements InterfaceC442224 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C7302nW, C7287nH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final C48749i A0J = new C7290nK().A0p();

    @Deprecated
    public static final C48749i A0I = A0J;
    public static final String A0W = AbstractC46115C.A0h(1000);
    public static final String A0Q = AbstractC46115C.A0h(1001);
    public static final String A0R = AbstractC46115C.A0h(1002);
    public static final String A0T = AbstractC46115C.A0h(1003);
    public static final String A0M = AbstractC46115C.A0h(1004);
    public static final String A0N = AbstractC46115C.A0h(1005);
    public static final String A0K = AbstractC46115C.A0h(1006);
    public static final String A0V = AbstractC46115C.A0h(1007);
    public static final String A0b = AbstractC46115C.A0h(1008);
    public static final String A0O = AbstractC46115C.A0h(1009);
    public static final String A0Z = AbstractC46115C.A0h(1010);
    public static final String A0a = AbstractC46115C.A0h(1011);
    public static final String A0Y = AbstractC46115C.A0h(1012);
    public static final String A0X = AbstractC46115C.A0h(1013);
    public static final String A0P = AbstractC46115C.A0h(1014);
    public static final String A0L = AbstractC46115C.A0h(1015);
    public static final String A0S = AbstractC46115C.A0h(1016);
    public static final String A0U = AbstractC46115C.A0h(1017);
    public static final InterfaceC442123<C48749i> A0H = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.nL
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return new C7290nK(bundle).A0p();
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C7302nW, C7287nH>> sparseArray, SparseArray<Map<C7302nW, C7287nH>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
            if (iIndexOfKey < 0 || !A0O(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C7302nW, C7287nH> map, Map<C7302nW, C7287nH> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C7302nW, C7287nH> entry : map.entrySet()) {
            C7302nW key = entry.getKey();
            if (!map2.containsKey(key) || !AbstractC46115C.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public C48749i(C7290nK c7290nK) {
        super(c7290nK);
        this.A0C = c7290nK.A0C;
        this.A06 = c7290nK.A06;
        this.A07 = c7290nK.A07;
        this.A05 = c7290nK.A05;
        this.A09 = c7290nK.A09;
        this.A02 = c7290nK.A02;
        this.A03 = c7290nK.A03;
        this.A00 = c7290nK.A00;
        this.A01 = c7290nK.A01;
        this.A08 = c7290nK.A08;
        this.A0B = c7290nK.A0B;
        this.A0D = c7290nK.A0D;
        this.A04 = c7290nK.A04;
        this.A0E = c7290nK.A0E;
        this.A0F = c7290nK.A0F;
        this.A0A = c7290nK.A0A;
    }

    public static C48749i A02(Context context) {
        return new C7290nK(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C7290nK A0P() {
        return new C7290nK(this);
    }

    @Deprecated
    public final C7287nH A0Q(int i, C7302nW c7302nW) {
        Map<C7302nW, C7287nH> map = this.A0E.get(i);
        if (map != null) {
            return map.get(c7302nW);
        }
        return null;
    }

    public final boolean A0R(int i) {
        return this.A0F.get(i);
    }

    @Deprecated
    public final boolean A0S(int i, C7302nW c7302nW) {
        Map<C7302nW, C7287nH> map = this.A0E.get(i);
        return map != null && map.containsKey(c7302nW);
    }

    @Override // com.facebook.ads.redexgen.core.C7431pc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                C48749i c48749i = (C48749i) obj;
                if (super.equals(c48749i) && this.A0C == c48749i.A0C && this.A06 == c48749i.A06 && this.A07 == c48749i.A07 && this.A05 == c48749i.A05 && this.A09 == c48749i.A09 && this.A02 == c48749i.A02 && this.A03 == c48749i.A03 && this.A00 == c48749i.A00 && this.A01 == c48749i.A01 && this.A08 == c48749i.A08 && this.A0B == c48749i.A0B && this.A0D == c48749i.A0D && this.A04 == c48749i.A04 && A0N(this.A0F, c48749i.A0F) && A0M(this.A0E, c48749i.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C7431pc
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
