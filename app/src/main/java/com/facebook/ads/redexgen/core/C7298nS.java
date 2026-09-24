package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7298nS implements InterfaceC5162EP {
    public static byte[] A00;
    public static String[] A01 = {"RZM4uVKUom5lpktBJEyc25x7FZDN3vpb", "gyiT966obFesLv2pc6lrzZfv63yxEjKJ", "VIDunhCfmmrKAvVQDuOofVowNsnrOYKS", "mSpbf5NAYyyPHT1f9KFsrup9mcKoYOHE", "zbmZ0JzF4Zq1L7424UboTB7UCymQSbun", "dFdj", "MzILoqUyJ5XWrj98JXnqdIxQxE4zJ", "8Kz26tJHiwFUzLhIg6rooXB"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-34, 17, 17, 2, 10, Ascii.f22490CR, 17, 2, 1, -67, 17, Ascii.f22492FF, -67, 0, Ascii.f22499SI, 2, -2, 17, 2, -67, 1, 2, 0, Ascii.f22492FF, 1, 2, Ascii.f22499SI, -67, 3, Ascii.f22492FF, Ascii.f22499SI, -67, Ascii.DC2, Ascii.f22503VT, Ascii.DLE, Ascii.DC2, Ascii.f22490CR, Ascii.f22490CR, Ascii.f22492FF, Ascii.f22499SI, 17, 2, 1, -67, -22, -26, -22, -30, -67, 17, Ascii.SYN, Ascii.f22490CR, 2, -41, -67, 19, 34, 34, Ascii.f22498RS, Ascii.ESC, Ascii.NAK, 19, 38, Ascii.ESC, 33, 32, -31, Ascii.NAK, Ascii.ETB, 19, -33, -24, -30, -22, Ascii.f22494GS, 44, 44, 40, 37, Ascii.f22502US, Ascii.f22494GS, 48, 37, 43, 42, -21, Ascii.f22502US, 33, Ascii.f22494GS, -23, -13, -20, -12, -56, -41, -41, -45, -48, -54, -56, -37, -48, -42, -43, -106, -53, -35, -55, -38, -36, -55, -38, -3, Ascii.f22492FF, Ascii.f22492FF, 8, 5, -1, -3, Ascii.DLE, 5, Ascii.f22503VT, 10, -53, Ascii.f22492FF, 3, Ascii.f22499SI, 59, 74, 74, 70, 67, Base64.padSymbol, 59, 78, 67, 73, 72, 9, 78, 78, 71, 70, 5, 82, 71, 70, -35, -20, -20, -24, -27, -33, -35, -16, -27, -21, -22, -85, -12, -87, -23, -20, -80, -87, -33, -31, -35, -87, -78, -84, -76, Ascii.f22499SI, Ascii.f22498RS, Ascii.f22498RS, Ascii.SUB, Ascii.ETB, 17, Ascii.f22499SI, 34, Ascii.ETB, Ascii.f22494GS, Ascii.f22493FS, -35, 38, -37, Ascii.ESC, Ascii.f22498RS, -30, -37, 36, 34, 34, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -9, -84, -16, -12, -24, -30, -22, -13, -24, -20, -28, -84, -13, -9, -78, -26, -55, -40, -40, -44, -47, -53, -55, -36, -47, -41, -42, -105, -32, -107, -37, -35, -54, -38, -47, -40, -16, -31, -12, -16, -85, -14, -16, -16, Base64.padSymbol, 46, 65, Base64.padSymbol, -8, 65, -10, 46, 65, 56, 57, 53, 42, 66, 46, 59, -10, 44, 62, 46, 60, -45, -60, -41, -45, -114, -41, -116, -46, -46, -64};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5162EP
    public final InterfaceC7211lq A5K(C7472qI c7472qI) {
        byte b;
        String str = c7472qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case 1201784583:
                    String mimeType = A00(249, 21, 107);
                    if (str.equals(mimeType)) {
                        b = 0;
                        break;
                    }
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    return new C48769k();
            }
        }
        StringBuilder sb = new StringBuilder();
        String mimeType2 = A00(0, 55, 63);
        throw new IllegalArgumentException(sb.append(mimeType2).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5162EP
    public final boolean AKN(C7472qI c7472qI) {
        String str = c7472qI.A0W;
        String mimeType = A00(241, 8, 30);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(270, 10, 1);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(127, 20, 124);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(172, 21, 80);
                    if (!mimeType4.equals(str)) {
                        String[] strArr = A01;
                        String str2 = strArr[6];
                        String mimeType5 = strArr[7];
                        if (str2.length() != mimeType5.length()) {
                            A01[4] = "ilKJ2fcQQU31mDfBW0rq4wTAOnRwqntF";
                            String mimeType6 = A00(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 20, 10);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(193, 28, 33);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(55, 19, 84);
                                    boolean zEquals = mimeType8.equals(str);
                                    String mimeType9 = A01[5];
                                    if (mimeType9.length() == 4) {
                                        String[] strArr2 = A01;
                                        strArr2[3] = "zagSEBYMwAryKt6uIWB8fghbt3YyxLCs";
                                        strArr2[0] = "njnOkrTqvKyYsDLdiJrWbCfOV0ebYkea";
                                        if (!zEquals) {
                                            String mimeType10 = A00(147, 25, 30);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(74, 19, 94);
                                                if (!mimeType11.equals(str)) {
                                                    String mimeType12 = A00(93, 19, 9);
                                                    if (!mimeType12.equals(str)) {
                                                        String mimeType13 = A00(112, 15, 62);
                                                        if (!mimeType13.equals(str)) {
                                                            String mimeType14 = A00(249, 21, 107);
                                                            if (!mimeType14.equals(str)) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return true;
    }
}
