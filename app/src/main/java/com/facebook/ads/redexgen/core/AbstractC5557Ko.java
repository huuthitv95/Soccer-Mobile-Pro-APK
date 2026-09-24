package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5557Ko {
    public static byte[] A00;
    public static String[] A01 = {"rzG5nsHyiLOWX8UOWspYPJE0qk8", "zzN7h9kZ1110Ms84Vk8TxNIxLbkfn1bs", "Ea1csqz6uGTsOrOcIglVsCF", "HzbrV2YdC0QyP2mr3Tf3UtzOp", "wDtYJLWcmo8biPQhT7PXhiXa0nvGQfME", "EfdNeKI6mNZbvmHLu3zFEqD29", "z9B2Nu2EMki8SlMmHuJ5tm0bMARcwAxE", "Vyy1RSqHmZDwxzuj6K"};
    public static final Pattern A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{115, 108, 48, Ascii.f22490CR, 5, Ascii.DLE, Ascii.SYN, 1, Ascii.DLE, 17, 85, 34, 48, 55, 35, 33, 33, 91, 85, 50, Ascii.SUB, 1, 85, 76, 121, 110, 127, 121, 114, 104, 125, 123, 121, 111, 60, 113, 105, 111, 104, 60, 121, 114, 120, 60, 107, 117, 104, 116, 60, 57, 87, 69, 66, 86, 84, 84, 121, Ascii.f22503VT, 74, 90, 91, SignedBytes.MAX_POWER_OF_TWO, 81, 60, 79, 52, Ascii.f22494GS, 73, 58, 62, Base64.padSymbol, 43, 48};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(58, 15, 19));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 81))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 27));
    }

    public static long A01(String str) throws NumberFormatException {
        long j = 0;
        String[] subparts = AbstractC46115C.A1P(str, A02(56, 2, 34));
        for (String str2 : AbstractC46115C.A1O(subparts[0], A02(1, 1, 81))) {
            long j2 = 60 * j;
            if (A01[0].length() != 27) {
                throw new RuntimeException();
            }
            String[] parts = A01;
            parts[2] = "6AHxBA9eqgTuoeEClHZkEfjq11VkmmF";
            long value = Long.parseLong(str2);
            j = j2 + value;
        }
        long j3 = j * 1000;
        if (subparts.length == 2) {
            long value2 = Long.parseLong(subparts[1]);
            j3 += value2;
        }
        return 1000 * j3;
    }

    public static void A04(C45944v c45944v) throws C44963K {
        int iA09 = c45944v.A09();
        if (A05(c45944v)) {
            return;
        }
        c45944v.A0f(iA09);
        throw C44963K.A01(A02(2, 21, 114) + c45944v.A0T(), null);
    }

    public static boolean A05(C45944v c45944v) {
        String strA0T = c45944v.A0T();
        if (strA0T != null) {
            String line = A02(50, 6, 7);
            if (strA0T.startsWith(line)) {
                return true;
            }
        }
        return false;
    }
}
