package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5p */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC46505p {
    public static byte[] A00;
    public static String[] A01 = {"G8ArwIe2VOAE4nt8xzvdLml4UmjpJECF", "hTc5Tda99b5K7ktAOz7Sk2ePkoxu5mJv", "uXzWM43WnlFlNXm1DUXcodvE16nJuXl6", "iRkaMP8lpeEdZIVhMcVD", "lMyhq9DthkfLW6CwBUqq2OEeTBOLdcXD", "OKiPy9zk89rZ6EyhyRbLHpsFwU1qXXE1", "FmDgVX5KrdTAXflr9ckY", "OW8d6LiXJNMD0YcnlVVA282INy85kiu1"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{101, 39, Ascii.ESC, Ascii.ESC, Ascii.f22502US, 58, Ascii.ESC, 6, 3, 103, SignedBytes.MAX_POWER_OF_TWO, 77, 65, SignedBytes.MAX_POWER_OF_TWO, 93, 71, 93, 90, 75, SignedBytes.MAX_POWER_OF_TWO, 90, Ascii.f22500SO, 70, 75, 79, 74, 75, 92, 93, Ascii.f22500SO, 117, 84, 111, 100, 121, 113, 100, 98, 117, 100, 101, 33, 66, 110, 111, 117, 100, 111, 117, 44, 77, 100, 111, 102, 117, 105, 33, 90, 117, 78, 69, 88, 80, 69, 67, 84, 69, 68, 0, 99, 79, 78, 84, 69, 78, 84, Ascii.f22490CR, 114, 65, 78, 71, 69, 0, 123, 49, 107, Ascii.SYN, 109, 5, Ascii.f22498RS, 19, 2, Ascii.DC4, 71, 79, 88, 93, 79, 88, 93, 59, 3, 76, 74, 59, 3, 76, 78, Ascii.ESC, 59, 77, 78, 72, 79, 59, 3, 76, 78, 115, 104, 101, 116, 98, 49, 57, 77, 117, 58, 56, 60, 57, 77, 117, 58, 56, 62, 57, 46, 43, 77, 117, 58, 109, 77, 59, 56, 104, 115, 126, 111, 121, 55};
    }

    static {
        A04();
        A03 = Pattern.compile(A02(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 28, 72));
        A02 = Pattern.compile(A02(88, 30, 62));
    }

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) AbstractC45353y.A01(matcher.group(1)));
        }
        return -1L;
    }

    public static long A01(String str, String str2) {
        long jMax = -1;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strA02 = A02(84, 1, 53);
        String strA03 = A02(1, 8, 54);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AbstractC45794g.A05(strA03, A02(31, 27, 88) + str + strA02);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = A03.matcher(str2);
            if (matcher.matches()) {
                try {
                    long j = (Long.parseLong((String) AbstractC45353y.A01(matcher.group(2))) - Long.parseLong((String) AbstractC45353y.A01(matcher.group(1)))) + 1;
                    if (jMax < 0) {
                        return j;
                    }
                    if (jMax != j) {
                        AbstractC45794g.A07(strA03, A02(9, 22, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + str + A02(85, 3, 111) + str2 + strA02);
                        jMax = Math.max(jMax, j);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    AbstractC45794g.A05(strA03, A02(58, 26, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) + str2 + strA02);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    public static String A03(long j, long j2) {
        StringBuilder sb;
        String string;
        String[] strArr;
        if (j == 0) {
            String[] strArr2 = A01;
            if (strArr2[7].charAt(0) == strArr2[5].charAt(0)) {
                String[] strArr3 = A01;
                strArr3[3] = "BG6bsnZi4wlgFYmXUZNM";
                strArr3[6] = "Qc01l7LnjPCXX6IxAAkq";
                if (j2 == -1) {
                    return null;
                }
                sb = new StringBuilder();
                sb.append(A02(146, 6, 83));
                sb.append(j);
                sb.append(A02(0, 1, 17));
                if (j2 != -1) {
                    sb.append((j + j2) - 1);
                }
                string = sb.toString();
                strArr = A01;
                if (strArr[3].length() == strArr[6].length()) {
                    A01[0] = "BYD36Vzxv8JTZl7GEmQPPJy8vzWoDg2F";
                    return string;
                }
            }
        } else {
            sb = new StringBuilder();
            sb.append(A02(146, 6, 83));
            sb.append(j);
            sb.append(A02(0, 1, 17));
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
            strArr = A01;
            if (strArr[3].length() == strArr[6].length()) {
                A01[0] = "BYD36Vzxv8JTZl7GEmQPPJy8vzWoDg2F";
                return string;
            }
        }
        throw new RuntimeException();
    }
}
