package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5594LP {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5592LN A02(InterfaceC7263ms interfaceC7263ms) throws IOException {
        byte[] bArr;
        C45944v c45944v = new C45944v(16);
        C5593LO c5593loA03 = A03(1718449184, interfaceC7263ms, c45944v);
        AbstractC45353y.A08(c5593loA03.A01 >= 16);
        interfaceC7263ms.AGt(c45944v.A0l(), 0, 16);
        c45944v.A0f(0);
        int iA0G = c45944v.A0G();
        int iA0G2 = c45944v.A0G();
        int iA0F = c45944v.A0F();
        int iA0F2 = c45944v.A0F();
        int iA0G3 = c45944v.A0G();
        int iA0G4 = c45944v.A0G();
        int i = ((int) c5593loA03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC7263ms.AGt(bArr, 0, i);
        } else {
            bArr = AbstractC46115C.A07;
        }
        interfaceC7263ms.AK3((int) (interfaceC7263ms.A8i() - interfaceC7263ms.A8n()));
        return new C5592LN(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, Ascii.DLE, Ascii.f22490CR, Ascii.SYN, 19, 88, 17, Ascii.f22503VT, 88, Ascii.f22492FF, Ascii.ETB, Ascii.ETB, 88, Ascii.DC4, Ascii.f22491EM, 10, Ascii.f22502US, Ascii.f22494GS, 88, 80, 6, 74, 63, 58, 83, 81, 88, Ascii.f22492FF, Ascii.ETB, 88, Ascii.f22503VT, 19, 17, 8, 67, 88, 17, Ascii.f22493FS, 66, 88, 45, 3, 10, Ascii.f22503VT, Ascii.SYN, Ascii.f22490CR, 10, 3, 68, 17, 10, Ascii.f22499SI, 10, Ascii.f22503VT, 19, 10, 68, 51, 37, 50, 68, 7, Ascii.f22492FF, 17, 10, Ascii.f22499SI, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, Ascii.f22493FS, 90, 83, 78, 81, Ascii.f22493FS, 72, 69, 76, 89, 6, Ascii.f22493FS, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C45944v c45944v = new C45944v(8);
        C5593LO chunkHeader = C5593LO.A00(interfaceC7263ms, c45944v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC7263ms.AIl();
            return -1L;
        }
        interfaceC7263ms.A47(8);
        c45944v.A0f(0);
        interfaceC7263ms.AGt(c45944v.A0l(), 0, 8);
        long sampleDataSize = c45944v.A0N();
        interfaceC7263ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC7263ms interfaceC7263ms) throws IOException {
        interfaceC7263ms.AIl();
        C5593LO c5593loA03 = A03(1684108385, interfaceC7263ms, new C45944v(8));
        interfaceC7263ms.AK3(8);
        return Pair.create(Long.valueOf(interfaceC7263ms.A8n()), Long.valueOf(c5593loA03.A01));
    }

    public static C5593LO A03(int i, InterfaceC7263ms interfaceC7263ms, C45944v c45944v) throws IOException {
        C5593LO c5593loA00 = C5593LO.A00(interfaceC7263ms, c45944v);
        while (c5593loA00.A00 != i) {
            AbstractC45794g.A07(A04(91, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A04(40, 28, 39) + c5593loA00.A00);
            long j = c5593loA00.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC7263ms.AK3((int) j);
                c5593loA00 = C5593LO.A00(interfaceC7263ms, c45944v);
            } else {
                throw C44963K.A00(A04(0, 40, 59) + c5593loA00.A00);
            }
        }
        return c5593loA00;
    }

    public static boolean A06(InterfaceC7263ms interfaceC7263ms) throws IOException {
        C45944v c45944v = new C45944v(8);
        C5593LO c5593loA00 = C5593LO.A00(interfaceC7263ms, c45944v);
        if (c5593loA00.A00 != 1380533830) {
            int i = c5593loA00.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC7263ms.AGt(c45944v.A0l(), 0, 4);
        c45944v.A0f(0);
        int iA0C = c45944v.A0C();
        if (iA0C != 1463899717) {
            AbstractC45794g.A05(A04(91, 15, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A04(68, 23, 127) + iA0C);
            return false;
        }
        return true;
    }
}
