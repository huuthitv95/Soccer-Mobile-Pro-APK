package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC7459q5<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC7459q5() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q5 != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC7459q5(C4969BG c4969bg) {
        this();
    }

    public static AbstractC7458q4<Object> A00(int expectedKeys) {
        AbstractC7289nJ.A00(expectedKeys, A03(0, 12, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        return new C4969BG(expectedKeys);
    }

    public static <K0> AbstractC7458q4<K0> A01(Comparator<K0> comparator) {
        AbstractC7142ki.A04(comparator);
        return new C4968BF(comparator);
    }

    public static AbstractC7458q4<Comparable> A02() {
        return A01(AbstractC7474qK.A03());
    }
}
