package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Et */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5192Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C7427pY A01(C5187Eo c5187Eo, List<? extends InterfaceC5189Eq>[] listArr) {
        C44382K c44382k = new C44382K();
        int i = 0;
        while (true) {
            boolean z = false;
            if (i >= c5187Eo.A02()) {
                C7302nW c7302nWA06 = c5187Eo.A06();
                for (int i2 = 0; i2 < c7302nWA06.A01; i2++) {
                    C7435pg c7435pgA05 = c7302nWA06.A05(i2);
                    int[] iArr = new int[c7435pgA05.A01];
                    Arrays.fill(iArr, 0);
                    c44382k.A04(new C7428pZ(c7435pgA05, false, iArr, new boolean[c7435pgA05.A01]));
                }
                return new C7427pY(c44382k.A05());
            }
            C7302nW c7302nWA07 = c5187Eo.A07(i);
            List<? extends InterfaceC5189Eq> list = listArr[i];
            int i3 = 0;
            while (i3 < c7302nWA07.A01) {
                C7435pg c7435pgA06 = c7302nWA07.A05(i3);
                int iA05 = c5187Eo.A05(i, i3, z);
                String[] strArr = A00;
                if (strArr[7].charAt(11) == strArr[0].charAt(11)) {
                    String[] strArr2 = A00;
                    strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                    strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                    boolean z2 = iA05 != 0;
                    int[] iArr2 = new int[c7435pgA06.A01];
                    boolean[] zArr = new boolean[c7435pgA06.A01];
                    for (int i4 = 0; i4 < c7435pgA06.A01; i4++) {
                        iArr2[i4] = c5187Eo.A04(i, i3, i4);
                        boolean z3 = false;
                        if (A00[5].length() == 9) {
                            String[] strArr3 = A00;
                            strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                            strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                InterfaceC5189Eq interfaceC5189Eq = list.get(i5);
                                if (interfaceC5189Eq.A9L().equals(c7435pgA06) && interfaceC5189Eq.AA6(i4) != -1) {
                                    z3 = true;
                                    break;
                                }
                            }
                            zArr[i4] = z3;
                        }
                    }
                    c44382k.A04(new C7428pZ(c7435pgA06, z2, iArr2, zArr));
                    i3++;
                    z = false;
                }
                throw new RuntimeException();
            }
            i++;
        }
    }

    public static C7427pY A00(C5187Eo c5187Eo, InterfaceC5189Eq[] interfaceC5189EqArr) {
        List listA01;
        List[] listArr = new List[interfaceC5189EqArr.length];
        for (int i = 0; i < interfaceC5189EqArr.length; i++) {
            InterfaceC5189Eq interfaceC5189Eq = interfaceC5189EqArr[i];
            if (interfaceC5189Eq != null) {
                listA01 = AbstractC4978BP.A04(interfaceC5189Eq);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = listA01;
        }
        return A01(c5187Eo, listArr);
    }
}
