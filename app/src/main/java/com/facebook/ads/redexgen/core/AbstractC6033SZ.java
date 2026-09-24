package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6033SZ {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<C6031SX> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
            i4++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, Ascii.ESC, Ascii.SYN, 17, 33, 40, Ascii.ETB, 36, 36, Ascii.ESC, Ascii.SYN, Ascii.ETB, 17, Ascii.f22499SI, Ascii.CAN, Ascii.f22499SI, Ascii.f22493FS, 19, Ascii.f22490CR, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static C6031SX A00() {
        C6031SX advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return C6031SX.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C6031SX A01(com.facebook.ads.redexgen.core.C6067T8 r5, com.facebook.ads.redexgen.core.C6031SX r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.SX r0 = com.facebook.ads.redexgen.core.AbstractC6038Sf.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.Tc r5 = r5.A08()
            int r4 = com.facebook.ads.redexgen.core.AbstractC6098Td.A1Q
            com.facebook.ads.redexgen.X.Te r3 = new com.facebook.ads.redexgen.X.Te
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.ABC(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC6033SZ.A01(com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.SX):com.facebook.ads.redexgen.X.SX");
    }

    public static C6031SX A02(C6067T8 c6067t8, C6031SX c6031sx, C6032SY c6032sy) {
        C6034Sa c6034SaA00 = null;
        try {
            if (AbstractC6170Uo.A06(c6067t8) && (c6031sx == null || TextUtils.isEmpty(c6031sx.A03()))) {
                c6034SaA00 = AbstractC6035Sb.A00(c6067t8.getContentResolver());
            }
        } catch (Throwable th) {
            c6067t8.A08().ABC(A04(12, 7, 84), AbstractC6098Td.A1S, new C6099Te(th));
        }
        if (c6034SaA00 != null && c6034SaA00.A01 != null) {
            A03.set(c6034SaA00.A01);
            c6032sy.A05(c6034SaA00.A01);
        }
        if (c6031sx == null && c6034SaA00 != null && !TextUtils.isEmpty(c6034SaA00.A00)) {
            return new C6031SX(c6034SaA00.A00, c6034SaA00.A02, EnumC6030SW.A04);
        }
        return c6031sx;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(C6032SY c6032sy) {
        A02.set(c6032sy.A02());
        A03.set(c6032sy.A03());
    }

    public static void A07(C6067T8 c6067t8) {
        long jA01;
        C6031SX advertisingIdInfo;
        try {
            C6032SY c6032sy = new C6032SY(c6067t8);
            A06(c6032sy);
            if (A08()) {
                return;
            }
            C6031SX advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                jA01 = advertisingIdInfo2.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < AbstractC6170Uo.A00(c6067t8)) {
                return;
            }
            if (AbstractC6170Uo.A07(c6067t8)) {
                advertisingIdInfo = A01(c6067t8, A02(c6067t8, null, c6032sy));
            } else {
                advertisingIdInfo = A02(c6067t8, A01(c6067t8, null), c6032sy);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c6032sy.A04(advertisingIdInfo);
            }
        } catch (Throwable t) {
            c6067t8.A08().ABC(A04(12, 7, 84), AbstractC6098Td.A1R, new C6099Te(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = C6314XD.A04();
        if (updated) {
            String strA04 = A04(0, 12, 92);
            boolean updated2 = C6314XD.A05(strA04);
            if (updated2) {
                A03.set(C6314XD.A01(strA04));
                z = true;
            }
        }
        boolean zA04 = C6314XD.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!zA04) {
            return z;
        }
        String strA05 = A04(19, 13, 108);
        boolean updated3 = C6314XD.A05(strA05);
        if (updated3) {
            String strA01 = C6314XD.A01(strA05);
            AtomicReference<C6031SX> atomicReference = A02;
            if (strA01 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    strA01 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    strA01 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new C6031SX(strA01, false, EnumC6030SW.A03));
            return true;
        }
        return z;
    }
}
