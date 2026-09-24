package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Js */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5499Js {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, Ascii.f22490CR, 1, 32, Ascii.NAK, Ascii.CAN, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A04(long j, C45944v c45944v, InterfaceC5361Hd[] interfaceC5361HdArr) {
        int iA0I = c45944v.A0I();
        if ((iA0I & 64) != 0) {
            c45944v.A0g(1);
            int i = (iA0I & 31) * 3;
            int iA09 = c45944v.A09();
            for (InterfaceC5361Hd interfaceC5361Hd : interfaceC5361HdArr) {
                c45944v.A0f(iA09);
                interfaceC5361Hd.AIr(c45944v, i);
                interfaceC5361Hd.AIu(j, 1, i, 0, null);
            }
        }
    }

    static {
        A02();
    }

    public static int A00(C45944v c45944v) {
        int i = 0;
        while (value != 0) {
            int iA0I = c45944v.A0I();
            i += iA0I;
            int b = A01[3].length();
            if (b == 4) {
                throw new RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (iA0I != 255) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j, C45944v c45944v, InterfaceC5361Hd[] interfaceC5361HdArr) {
        while (true) {
            if (c45944v.A07() > 1) {
                int iA00 = A00(c45944v);
                int iA01 = A00(c45944v);
                int iA09 = c45944v.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c45944v.A07();
                    if (iA01 > payloadType) {
                        AbstractC45794g.A07(A01(0, 7, 109), A01(7, 45, 69));
                        iA09 = c45944v.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int userIdentifier = c45944v.A0I();
                        int providerCode = c45944v.A0M();
                        int countryCode = 0;
                        if (providerCode == 49) {
                            countryCode = c45944v.A0C();
                        }
                        int iA0I = c45944v.A0I();
                        if (providerCode == 47) {
                            c45944v.A0g(1);
                        }
                        int i = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && iA0I == 3) ? 1 : 0;
                        if (providerCode == 49) {
                            int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                            i &= userDataTypeCode;
                        }
                        if (i != 0) {
                            A04(j, c45944v, interfaceC5361HdArr);
                        }
                    }
                } else {
                    AbstractC45794g.A07(A01(0, 7, 109), A01(7, 45, 69));
                    iA09 = c45944v.A0A();
                }
                c45944v.A0f(iA09);
            } else {
                return;
            }
        }
    }
}
