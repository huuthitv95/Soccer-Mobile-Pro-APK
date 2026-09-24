package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.al */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6534al {
    public static byte[] A02;
    public boolean A00 = true;
    public final C5634M3 A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Ascii.f22490CR, Ascii.SUB, Ascii.SUB, 45, 66, Ascii.DLE, 59, 57, Ascii.f22499SI, 59, 58, SignedBytes.MAX_POWER_OF_TWO, 49, 58, SignedBytes.MAX_POWER_OF_TWO, Ascii.CAN, 59, 45, 48, 49, 48, 6, Ascii.DC4, 33, 33, 52, 73, Ascii.f22502US, 66, 52, 55, Ascii.CAN, 73, 56, 65, 71, Ascii.CAN, 65, 55, Ascii.f22490CR, -52, -39, -39, -20, 1, -35, -16, -2, -5, -6, -7, -2, -16, -48, -7, -17, -59, 34, Ascii.ESC, Ascii.NAK, Ascii.DLE, -44, -44, Ascii.DC2, 33, Ascii.SUB, Ascii.f22499SI, 32, Ascii.NAK, Ascii.ESC, Ascii.SUB, -44, -43, -52, 39, 32, Ascii.f22498RS, 37, -52, 39, -52, -52, Ascii.NAK, Ascii.DC2, -52, -44, -51, 35, Ascii.NAK, Ascii.SUB, Ascii.DLE, Ascii.ESC, 35, -38, Ascii.f22493FS, 17, Ascii.f22498RS, Ascii.DC2, Ascii.ESC, Ascii.f22498RS, Ascii.f22491EM, Ascii.f22490CR, Ascii.SUB, Ascii.f22499SI, 17, -52, 40, 40, -52, -51, 35, Ascii.NAK, Ascii.SUB, Ascii.DLE, Ascii.ESC, 35, -38, Ascii.f22493FS, 17, Ascii.f22498RS, Ascii.DC2, Ascii.ESC, Ascii.f22498RS, Ascii.f22491EM, Ascii.f22490CR, Ascii.SUB, Ascii.f22499SI, 17, -38, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, -52, 40, 40, -52, -51, Ascii.DLE, Ascii.ESC, Ascii.f22499SI, 33, Ascii.f22491EM, 17, Ascii.SUB, 32, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, -51, Ascii.DLE, Ascii.ESC, Ascii.f22499SI, 33, Ascii.f22491EM, 17, Ascii.SUB, 32, -38, Ascii.f22500SO, Ascii.ESC, Ascii.DLE, 37, -52, 40, 40, -52, -51, Ascii.DLE, Ascii.ESC, Ascii.f22499SI, 33, Ascii.f22491EM, 17, Ascii.SUB, 32, -38, Ascii.f22500SO, Ascii.ESC, Ascii.DLE, 37, -38, Ascii.f22499SI, Ascii.DC4, Ascii.NAK, Ascii.CAN, Ascii.DLE, Ascii.f22498RS, 17, Ascii.SUB, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, Ascii.DLE, Ascii.ESC, Ascii.f22499SI, 33, Ascii.f22491EM, 17, Ascii.SUB, 32, -38, Ascii.f22500SO, Ascii.ESC, Ascii.DLE, 37, -38, Ascii.f22499SI, Ascii.DC4, Ascii.NAK, Ascii.CAN, Ascii.DLE, Ascii.f22498RS, 17, Ascii.SUB, -38, Ascii.CAN, 17, Ascii.SUB, 19, 32, Ascii.DC4, -52, -24, -52, -35, -43, -52, 39, -52, -52, -52, -52, Ascii.f22498RS, 17, 32, 33, Ascii.f22498RS, Ascii.SUB, -25, -52, -52, 41, -52, -52, 34, Ascii.f22490CR, Ascii.f22498RS, -52, Ascii.SUB, 34, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, 32, -52, -23, -52, 35, Ascii.NAK, Ascii.SUB, Ascii.DLE, Ascii.ESC, 35, -38, Ascii.f22493FS, 17, Ascii.f22498RS, Ascii.DC2, Ascii.ESC, Ascii.f22498RS, Ascii.f22491EM, Ascii.f22490CR, Ascii.SUB, Ascii.f22499SI, 17, -38, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, -25, -52, -52, Ascii.NAK, Ascii.DC2, -52, -44, Ascii.SUB, 34, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, 32, -38, Ascii.f22498RS, 17, Ascii.f22502US, Ascii.f22493FS, Ascii.ESC, Ascii.SUB, Ascii.f22502US, 17, -15, Ascii.SUB, Ascii.DLE, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, Ascii.f22499SI, Ascii.ESC, Ascii.SUB, Ascii.f22502US, Ascii.ESC, Ascii.CAN, 17, -38, Ascii.CAN, Ascii.ESC, 19, -44, -45, -19, -6, -6, Ascii.f22490CR, 34, -2, 17, Ascii.f22502US, Ascii.f22493FS, Ascii.ESC, Ascii.SUB, Ascii.f22502US, 17, -15, Ascii.SUB, Ascii.DLE, -26, -45, -52, -41, -52, Ascii.SUB, 34, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, 32, -38, Ascii.f22498RS, 17, Ascii.f22502US, Ascii.f22493FS, Ascii.ESC, Ascii.SUB, Ascii.f22502US, 17, -15, Ascii.SUB, Ascii.DLE, -43, -25, -52, -52, 41, -52, -52, Ascii.NAK, Ascii.DC2, -52, -44, Ascii.SUB, 34, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, 32, -38, Ascii.DLE, Ascii.ESC, Ascii.f22491EM, -17, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -8, Ascii.ESC, Ascii.f22490CR, Ascii.DLE, 17, Ascii.DLE, -15, 34, 17, Ascii.SUB, 32, -1, 32, Ascii.f22490CR, Ascii.f22498RS, 32, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, Ascii.f22499SI, Ascii.ESC, Ascii.SUB, Ascii.f22502US, Ascii.ESC, Ascii.CAN, 17, -38, Ascii.CAN, Ascii.ESC, 19, -44, -45, -19, -6, -6, Ascii.f22490CR, 34, -16, Ascii.ESC, Ascii.f22491EM, -17, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -8, Ascii.ESC, Ascii.f22490CR, Ascii.DLE, 17, Ascii.DLE, -26, -45, -52, -41, -52, Ascii.SUB, 34, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, 32, -38, Ascii.DLE, Ascii.ESC, Ascii.f22491EM, -17, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -8, Ascii.ESC, Ascii.f22490CR, Ascii.DLE, 17, Ascii.DLE, -15, 34, 17, Ascii.SUB, 32, -1, 32, Ascii.f22490CR, Ascii.f22498RS, 32, -43, -25, -52, -52, 41, -52, -52, Ascii.NAK, Ascii.DC2, -52, -44, Ascii.SUB, 34, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, 32, -38, Ascii.CAN, Ascii.ESC, Ascii.f22490CR, Ascii.DLE, -15, 34, 17, Ascii.SUB, 32, -15, Ascii.SUB, Ascii.DLE, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, Ascii.f22499SI, Ascii.ESC, Ascii.SUB, Ascii.f22502US, Ascii.ESC, Ascii.CAN, 17, -38, Ascii.CAN, Ascii.ESC, 19, -44, -45, -19, -6, -6, Ascii.f22490CR, 34, -8, Ascii.ESC, Ascii.f22490CR, Ascii.DLE, -15, 34, 17, Ascii.SUB, 32, -15, Ascii.SUB, Ascii.DLE, -26, -45, -52, -41, -52, Ascii.SUB, 34, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, 32, -38, Ascii.CAN, Ascii.ESC, Ascii.f22490CR, Ascii.DLE, -15, 34, 17, Ascii.SUB, 32, -15, Ascii.SUB, Ascii.DLE, -43, -25, -52, -52, 41, 41, -52, Ascii.f22499SI, Ascii.f22490CR, 32, Ascii.f22499SI, Ascii.DC4, -44, 17, Ascii.f22498RS, Ascii.f22498RS, -43, -52, 39, -52, -52, Ascii.f22499SI, Ascii.ESC, Ascii.SUB, Ascii.f22502US, Ascii.ESC, Ascii.CAN, 17, -38, Ascii.CAN, Ascii.ESC, 19, -44, -45, Ascii.f22490CR, Ascii.SUB, Ascii.f22503VT, Ascii.SUB, Ascii.f22490CR, 34, Ascii.NAK, 19, Ascii.f22490CR, 32, Ascii.NAK, Ascii.ESC, Ascii.SUB, Ascii.f22503VT, 32, Ascii.NAK, Ascii.f22491EM, Ascii.NAK, Ascii.SUB, 19, Ascii.f22503VT, 17, Ascii.f22498RS, Ascii.f22498RS, Ascii.ESC, Ascii.f22498RS, -26, -45, -52, -41, -52, 17, Ascii.f22498RS, Ascii.f22498RS, -38, Ascii.f22491EM, 17, Ascii.f22502US, Ascii.f22502US, Ascii.f22490CR, 19, 17, -43, -25, 41, 41, -43, -44, -43, -43, -25};
    }

    public C6534al(C5634M3 c5634m3) {
        this.A01 = c5634m3;
    }

    public static long A00(String str, String str2) {
        String strSubstring = str.substring(str2.length());
        if (TextUtils.isEmpty(strSubstring)) {
            return -1L;
        }
        try {
            long j = Long.parseLong(strSubstring);
            if (j < 0) {
                return -1L;
            }
            return j;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A0I(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (!this.A00) {
            return;
        }
        String strA01 = A01(40, 17, 54);
        if (str.startsWith(strA01)) {
            this.A01.A0M(A00(str, strA01));
            return;
        }
        String strA02 = A01(0, 22, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        if (str.startsWith(strA02)) {
            this.A01.A0K(A00(str, strA02));
            return;
        }
        String strA03 = A01(22, 18, 126);
        if (!str.startsWith(strA03)) {
            return;
        }
        this.A01.A0L(A00(str, strA03));
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
