package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6200VI {
    public static byte[] A02;
    public final InterfaceC6192VA A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-15, -13, -32, -14, -9, -18, -29};
    }

    public C6200VI(String str, InterfaceC6192VA interfaceC6192VA) {
        this.A01 = str;
        this.A00 = interfaceC6192VA;
    }

    public static void A02(EnumC6199VH enumC6199VH, Map<String, String> map, String str, InterfaceC6192VA interfaceC6192VA) {
        A03(enumC6199VH.A03(), map, str, interfaceC6192VA);
    }

    public static void A03(String str, Map<String, String> map, String str2, InterfaceC6192VA interfaceC6192VA) {
        if (!AbstractC6202VK.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 81), str);
        interfaceC6192VA.ABF(str2, map);
    }

    public final void A04(EnumC6199VH enumC6199VH, Map<String, String> data) {
        A05(enumC6199VH.A03(), data);
    }

    public final void A05(String str, Map<String, String> data) {
        A03(str, data, this.A01, this.A00);
    }
}
