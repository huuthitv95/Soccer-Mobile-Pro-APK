package com.facebook.ads.redexgen.core;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5531KO {
    public static byte[] A00;
    public static String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5529KM A00(C5529KM c5529km, Map<String, C5536KT> map) {
        while (c5529km != null) {
            C5536KT c5536ktA02 = A02(c5529km.A04, c5529km.A0H(), map);
            if (c5536ktA02 != null && c5536ktA02.A09() == 1) {
                return c5529km;
            }
            c5529km = c5529km.A03;
        }
        return null;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
            i4++;
        }
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, SignedBytes.MAX_POWER_OF_TWO, 88, 86, 93, 93, 86, 91, 84, Ascii.f22490CR, 95, 98, 79, 102, 65, 82, 101, 97, Ascii.f22490CR, 91, 92, 81, 82, Ascii.f22490CR, 100, 86, 97, 85, 92, 98, 97, Ascii.f22490CR, 82, 101, 78, 80, 97, 89, 102, Ascii.f22490CR, 92, 91, 82, Ascii.f22490CR, 97, 82, 101, 97, Ascii.f22490CR, 80, 85, 86, 89, 81, Ascii.ESC, -10, Ascii.SYN, Ascii.f22499SI, Ascii.f22500SO, -12, 7, Ascii.DLE, 6, 7, Ascii.DC4, -9, Ascii.SYN, Ascii.f22503VT, Ascii.f22500SO, 73, Ascii.f22500SO, -9, 74, 102, Ascii.f22498RS, 48, -6, -5, 75, Ascii.f22491EM};
    }

    static {
        A05();
    }

    public static C5529KM A01(C5529KM c5529km, Map<String, C5536KT> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c5529km);
        while (!arrayDeque.isEmpty()) {
            C5529KM c5529km2 = (C5529KM) arrayDeque.pop();
            C5536KT c5536kt = c5529km2.A04;
            String[] strArrA0H = c5529km2.A0H();
            if (A01[6].length() != 8) {
                throw new RuntimeException();
            }
            A01[6] = "prCmMBcG";
            C5536KT c5536ktA02 = A02(c5536kt, strArrA0H, map);
            if (c5536ktA02 != null && c5536ktA02.A09() == 3) {
                return c5529km2;
            }
            for (int iA0C = c5529km2.A0C() - 1; iA0C >= 0; iA0C--) {
                arrayDeque.push(c5529km2.A0D(iA0C));
            }
        }
        return null;
    }

    public static C5536KT A02(C5536KT c5536kt, String[] strArr, Map<String, C5536KT> map) {
        int i = 0;
        if (c5536kt == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C5536KT c5536kt2 = new C5536KT();
                int length = strArr.length;
                while (i < length) {
                    c5536kt2.A0O(map.get(strArr[i]));
                    i++;
                }
                return c5536kt2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return c5536kt.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i < length3) {
                        C5536KT c5536kt3 = map.get(strArr[i]);
                        if (A01[5].length() != 27) {
                            throw new RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        c5536kt.A0O(c5536kt3);
                        i++;
                    }
                    return c5536kt;
                }
            }
        }
        return c5536kt;
    }

    public static String A04(String str) {
        String strA03 = A03(1, 2, 53);
        String strA04 = A03(0, 1, 14);
        String strReplaceAll = str.replaceAll(strA03, strA04);
        String out = A03(4, 5, 69);
        String strReplaceAll2 = strReplaceAll.replaceAll(out, strA04);
        String strA05 = A03(3, 1, 6);
        String strReplaceAll3 = strReplaceAll2.replaceAll(strA04, strA05);
        String out2 = A03(77, 11, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        return strReplaceAll3.replaceAll(out2, strA05);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    public static void A06(Spannable spannable, int i, int i2, C5536KT c5536kt, C5529KM c5529km, Map<String, C5536KT> map, int i3) {
        C5529KM c5529kmA01;
        C5536KT c5536ktA02;
        int i4;
        int i5;
        int i6;
        if (c5536kt.A0A() != -1) {
            spannable.setSpan(new StyleSpan(c5536kt.A0A()), i, i2, 33);
        }
        if (c5536kt.A0b()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c5536kt.A0c()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c5536kt.A0a()) {
            AbstractC45303t.A00(spannable, new ForegroundColorSpan(c5536kt.A06()), i, i2, 33);
        }
        boolean zA0Z = c5536kt.A0Z();
        if (A01[5].length() == 27) {
            A01[2] = "DOLHbyxdL1TIGmJ49PhqpcsDL7xIVQFO";
            if (zA0Z) {
                AbstractC45303t.A00(spannable, new BackgroundColorSpan(c5536kt.A05()), i, i2, 33);
            }
            if (c5536kt.A0W() != null) {
                AbstractC45303t.A00(spannable, new TypefaceSpan(c5536kt.A0W()), i, i2, 33);
            }
            if (c5536kt.A0D() != null) {
                C5525KI c5525ki = (C5525KI) AbstractC45353y.A01(c5536kt.A0D());
                if (c5525ki.A01 == -1) {
                    String[] strArr = A01;
                    if (strArr[1].charAt(10) == strArr[7].charAt(10)) {
                        A01[5] = "2MSbzH5cEcM3iPzp1Bk7CXgbIPr";
                        if (i3 == 2 || i3 == 1) {
                            i4 = 3;
                        } else {
                            i4 = 1;
                        }
                        i5 = 1;
                    }
                } else {
                    i4 = c5525ki.A01;
                    i5 = c5525ki.A00;
                }
                if (c5525ki.A02 == -2) {
                    i6 = 1;
                } else {
                    i6 = c5525ki.A02;
                }
                AbstractC45303t.A00(spannable, new C7417pO(i4, i5, i6), i, i2, 33);
            }
            switch (c5536kt.A09()) {
                case 2:
                    C5529KM c5529kmA00 = A00(c5529km, map);
                    if (c5529kmA00 != null && (c5529kmA01 = A01(c5529kmA00, map)) != null) {
                        if (c5529kmA01.A0C() != 1) {
                            AbstractC45794g.A06(A03(63, 14, 47), A03(9, 54, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
                        } else {
                            C5529KM containerNode = c5529kmA01.A0D(0);
                            if (containerNode.A08 != null) {
                                C5529KM containerNode2 = c5529kmA01.A0D(0);
                                String str = (String) AbstractC46115C.A0f(containerNode2.A08);
                                C5536KT c5536ktA03 = A02(c5529kmA01.A04, c5529kmA01.A0H(), map);
                                int iA08 = c5536ktA03 != null ? c5536ktA03.A08() : -1;
                                if (iA08 == -1 && (c5536ktA02 = A02(c5529kmA00.A04, c5529kmA00.A0H(), map)) != null) {
                                    iA08 = c5536ktA02.A08();
                                }
                                spannable.setSpan(new C7418pP(str, iA08), i, i2, 33);
                            } else {
                                AbstractC45794g.A06(A03(63, 14, 47), A03(9, 54, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
                            }
                        }
                    }
                    break;
                case 3:
                case 4:
                    spannable.setSpan(new C5522KF(), i, i2, 33);
                    break;
            }
            if (c5536kt.A0Y()) {
                AbstractC45303t.A00(spannable, new C7419pQ(), i, i2, 33);
            }
            switch (c5536kt.A07()) {
                case 1:
                    AbstractC45303t.A00(spannable, new AbsoluteSizeSpan((int) c5536kt.A03(), true), i, i2, 33);
                    return;
                case 2:
                    AbstractC45303t.A00(spannable, new RelativeSizeSpan(c5536kt.A03()), i, i2, 33);
                    return;
                case 3:
                    AbstractC45303t.A00(spannable, new RelativeSizeSpan(c5536kt.A03() / 100.0f), i, i2, 33);
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
