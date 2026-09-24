package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7447pt implements InterfaceC442224 {
    public static byte[] A00;
    public static String[] A01 = {"aC8uc30vckBh0ldJ8CsDkWWGmQgl7sOm", "2", "dPCbCdxH5PRV4edn", "QHj", "dDf", "KHWYQA", "nwDl9CeJStZlhkBKgBcw2akg3aHE6X2p", "I5"};
    public static final String A02;
    public static final InterfaceC442123<AbstractC7447pt> A03;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-126, -101, -104, -101, -100, -92, -101, 77, 127, -114, -95, -106, -101, -108, -127, -90, -99, -110, 103, 77};
    }

    static {
        A07();
        A02 = AbstractC46115C.A0h(0);
        A03 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pu
            @Override // com.facebook.ads.redexgen.core.InterfaceC442123
            public final InterfaceC442224 A6f(Bundle bundle) {
                return AbstractC7447pt.A04(bundle);
            }
        };
    }

    public static AbstractC7447pt A04(Bundle bundle) {
        int i = bundle.getInt(A02, -1);
        switch (i) {
            case 0:
                return (AbstractC7447pt) C4924AX.A02.A6f(bundle);
            case 1:
                AbstractC7447pt abstractC7447pt = (AbstractC7447pt) C4922AV.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr = A01;
                    strArr[7] = "RK";
                    strArr[1] = "0";
                    return abstractC7447pt;
                }
                break;
            case 2:
                return (AbstractC7447pt) C4921AU.A04.A6f(bundle);
            case 3:
                InterfaceC442224 interfaceC442224A6f = C4920AT.A02.A6f(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr2 = A01;
                    strArr2[7] = "Vr";
                    strArr2[1] = "2";
                    return (AbstractC7447pt) interfaceC442224A6f;
                }
                break;
            default:
                throw new IllegalArgumentException(A06(0, 20, 36) + i);
        }
        throw new RuntimeException();
    }
}
