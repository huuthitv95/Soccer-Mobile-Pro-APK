package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7449pv implements InterfaceC442224 {
    public final C44652n A00;
    public static String[] A01 = {"mula3CidaM", "QXZvrsMqvoQg77WBvlve", "clHaL9AVxqL", "4", "dTVzaj3Js", "vbPIPyw6rptXOUyrUErD6RaDDuBNyqsV", "dqUk2BmO1rRhKnsvPvl2vnYni3", "mE8b9jVFwC8HjBTnnlrMONG37KhdcP6J"};
    public static final C7449pv A03 = new C45013P().A04();
    public static final String A04 = AbstractC46115C.A0h(0);
    public static final InterfaceC442123<C7449pv> A02 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pw
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7449pv.A01(bundle);
        }
    };

    public C7449pv(C44652n c44652n) {
        this.A00 = c44652n;
    }

    public static C7449pv A01(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(A04);
        if (integerArrayList == null) {
            return A03;
        }
        C45013P c45013p = new C45013P();
        int i = 0;
        while (true) {
            int size = integerArrayList.size();
            if (A01[7].charAt(28) != 'c') {
                throw new RuntimeException();
            }
            A01[7] = "mp2TMNIiilctnlK0CRpdI2bFoWxScr6M";
            if (i < size) {
                c45013p.A00(integerArrayList.get(i).intValue());
                i++;
            } else {
                return c45013p.A04();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7449pv)) {
                return false;
            }
            return this.A00.equals(((C7449pv) obj).A00);
        }
        if (A01[5].charAt(22) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "64Urjp6xISM";
        strArr[0] = "9byEEtKTR1";
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
