package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.T0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6059T0 {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, Ascii.ETB, Ascii.f22491EM, Ascii.f22498RS, Ascii.ESC, -42, Ascii.SUB, 37, 45, 36, 34, 37, Ascii.ETB, Ascii.SUB, -42, Ascii.f22493FS, Ascii.ETB, Ascii.f22502US, 34, 43, 40, Ascii.ESC, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, Ascii.SYN, 17, Ascii.NAK, 36, Ascii.ETB, 19, 38, Ascii.ESC, 40, Ascii.ETB, 17, 37, Ascii.ESC, 44, Ascii.ETB, 17, Ascii.DC4, 43, 38, Ascii.ETB, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, Ascii.f22494GS, 32, Ascii.ESC, 34, 43, 46, 41, Ascii.f22494GS, 48, Ascii.ESC, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, Ascii.f22498RS, Ascii.f22493FS, Ascii.f22498RS, 35, 32, 63, Base64.padSymbol, 63, 68, 65, 59, 63, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, Ascii.ETB, Ascii.ESC, Ascii.f22499SI, Ascii.NAK, 19, Ascii.f22493FS, Ascii.f22502US, 17, Ascii.DC4, Ascii.f22499SI, 36, Ascii.f22491EM, Ascii.f22494GS, Ascii.NAK, 70, 67, Base64.padSymbol};
    }

    static {
        A01();
        A09 = C6059T0.class.getSimpleName();
        A05 = AbstractC6098Td.A0o;
        A06 = AbstractC6098Td.A0s;
        A02 = AbstractC6098Td.A0l;
        A01 = AbstractC6098Td.A0k;
        A03 = AbstractC6098Td.A0m;
        A00 = AbstractC6098Td.A0i;
        A04 = AbstractC6098Td.A0n;
        A07 = AbstractC6098Td.A0t;
    }

    public static void A02(C6067T8 c6067t8, C6049Sq c6049Sq, int i, String str, long j) {
        if (!A06(c6067t8)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c6049Sq.A01);
            jSONObject.put(A00(134, 13, 46), c6049Sq.A02);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 73), C6364Y1.A07(System.currentTimeMillis() - j));
            }
            C6099Te c6099Te = new C6099Te(str);
            c6099Te.A07(jSONObject);
            c6099Te.A05(1);
            c6067t8.A08().ABD(A00(154, 5, 84), i, c6099Te);
        } catch (Throwable deLogException) {
            c6067t8.A08().A4I(deLogException);
        }
    }

    public static void A03(C6067T8 c6067t8, C6054Sv c6054Sv, String str, int i, String str2, Long l, Long l2) {
        if (A06(c6067t8)) {
            A05(c6067t8, c6054Sv.A06, c6054Sv.A07, c6054Sv.A08, A00(186, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(C6067T8 c6067t8, C6058Sz c6058Sz, boolean z) {
        if (!A06(c6067t8)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c6058Sz.A01);
            jSONObject.put(A00(134, 13, 46), c6058Sz.A03);
            jSONObject.put(A00(104, 16, 23), c6058Sz.A02);
            jSONObject.put(A00(159, 13, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), c6058Sz.A00);
            if (C6171Up.A2T(c6067t8)) {
                jSONObject.put(A00(200, 3, 106), c6058Sz.A04);
            }
            String strA00 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            C6099Te c6099Te = new C6099Te(strA00);
            c6099Te.A07(jSONObject);
            c6099Te.A05(1);
            c6067t8.A08().ABD(A00(154, 5, 84), i, c6099Te);
        } catch (Throwable th) {
            c6067t8.A08().A4I(th);
        }
    }

    public static void A05(C6067T8 c6067t8, String str, String str2, String str3, String str4, String str5, int i, String str6, Long l, Long l2, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), str5);
            if (C6171Up.A2T(c6067t8)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String strA00 = A00(19, 19, 14);
            if (i == A03) {
                strA00 = A00(38, 23, 79);
            } else if (i == A01) {
                strA00 = A00(0, 19, 39);
            }
            C6099Te c6099Te = new C6099Te(strA00);
            c6099Te.A07(jSONObject);
            c6099Te.A05(1);
            c6067t8.A08().ABD(A00(154, 5, 84), i, c6099Te);
        } catch (Throwable th) {
            c6067t8.A08().A4I(th);
        }
    }

    public static boolean A06(C6067T8 c6067t8) {
        int iA06;
        if (c6067t8.A05().AAO()) {
            iA06 = 1;
        } else {
            iA06 = AbstractC6173Ur.A06(c6067t8);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || c6067t8.A09().A00() <= 1.0d / ((double) iA06);
    }
}
