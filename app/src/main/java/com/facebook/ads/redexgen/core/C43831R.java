package com.facebook.ads.redexgen.core;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1R */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C43831R extends AbstractC48148T {
    public static byte[] A05;
    public static String[] A06 = {"W2LX5ghCjNUdHPD6UOG9gNVP2r8Jjr9N", "hy0Kd51hxMRklx2U40MO6uTjDebxbFFc", "3rXKYQ25IDS9XLMelMDoz8fDuc1jWejt", "VHZF6nyXCVj1GWlzSFxOxU8Mk9", "1hZxQPwvp7yuSjm13xBtOFGqAv7wvaBL", "2txr67moghbeiUbFZCBGyiXHK8tBuFWn", "gHf8B0vtrS2LcJp", "q573XCdkPfkFHQHQX29TvMro8DPY3qfe"};
    public static final Pattern A07;
    public float A00;
    public float A01;
    public Map<String, C5519KC> A02;
    public final C5514K7 A03;
    public final boolean A04;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A05 = new byte[]{85, 39, 48, 53, 39, 83, 107, 36, 38, 53, 38, 48, 39, 83, 107, 36, 38, 53, 39, 83, 107, 36, 38, 84, 53, 33, 82, 39, 83, 107, 36, 38, 75, 35, 52, Ascii.f22491EM, 17, Ascii.f22493FS, Ascii.f22502US, Ascii.ETB, 5, Ascii.NAK, 74, 75, 98, 127, 96, 108, 121, 55, 101, 93, 95, 70, 70, 95, 88, 81, Ascii.SYN, 17, 101, 66, 79, 90, 83, Ascii.f22492FF, 17, Ascii.SYN, 90, 95, 88, 83, Ascii.SYN, 84, 83, 80, 89, 68, 83, Ascii.SYN, 17, 112, 89, 68, 91, 87, 66, Ascii.f22492FF, 17, Ascii.SYN, 90, 95, 88, 83, Ascii.f22492FF, Ascii.SYN, 37, Ascii.f22494GS, Ascii.f22502US, 6, 6, Ascii.f22502US, Ascii.CAN, 17, 86, Ascii.DC2, Ascii.f22502US, Ascii.ETB, Ascii.SUB, Ascii.f22491EM, 17, 3, 19, 86, Ascii.SUB, Ascii.f22502US, Ascii.CAN, 19, 86, Ascii.DC4, 19, Ascii.DLE, Ascii.f22491EM, 4, 19, 86, Ascii.NAK, Ascii.f22491EM, Ascii.ESC, 6, Ascii.SUB, 19, 2, 19, 86, Ascii.DLE, Ascii.f22491EM, 4, Ascii.ESC, Ascii.ETB, 2, 76, 86, 53, Ascii.f22490CR, Ascii.f22499SI, Ascii.SYN, Ascii.SYN, Ascii.f22499SI, 8, 1, 70, 2, Ascii.f22499SI, 7, 10, 9, 1, 19, 3, 70, 10, Ascii.f22499SI, 8, 3, 70, 17, Ascii.f22499SI, Ascii.DC2, Ascii.f22500SO, 70, 0, 3, 17, 3, Ascii.DC4, 70, 5, 9, 10, 19, Ascii.f22503VT, 8, Ascii.NAK, 70, Ascii.DC2, Ascii.f22500SO, 7, 8, 70, 0, 9, Ascii.DC4, Ascii.f22503VT, 7, Ascii.DC2, 92, 70, 66, 122, 120, 97, 97, 120, 127, 118, 49, 120, 127, 103, 112, 125, 120, 117, 49, 101, 120, 124, 120, 127, 118, 43, 49, 101, 69, 87, 114, 83, 85, 89, 82, 83, 68, 36, 3, Ascii.f22500SO, Ascii.ESC, Ascii.DC2, 77, 45, Ascii.SYN, 19, Ascii.SYN, Ascii.ETB, Ascii.f22499SI, Ascii.SYN, 88, Ascii.f22491EM, Ascii.DC4, 17, Ascii.f22502US, Ascii.SYN, Ascii.NAK, Ascii.f22494GS, Ascii.SYN, Ascii.f22492FF, 66, 88, 40, 54, 5, Ascii.SYN, Ascii.f22494GS, 7, 0, 46, 94, 86, 102, 119, 108, 117, 113, 37, 76, 107, 99, 106, 88, Ascii.f22490CR, 0, 98, 118, 5, 34, 47, 58, 51, 37, Ascii.f22503VT, 124, 113, 19, 7, 116, 83, 94, 75, 66, 84, 122, 7, 70, 85, 66, 7, 73, 72, 83, 7, 84, 82, 87, 87, 72, 85, 83, 66, 67, 75, 70, 36, 59, 48, 67, 100, 105, 124, 117, 99, 77, 92, 78, 5, 49, 108, 94, 5, Ascii.f22491EM, Ascii.DC4, Ascii.f22492FF, 7, Ascii.DLE, 6, Ascii.f22490CR, 94, 66, 79, 87, 92, 75, 93, 87, -72, -38};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0D(String str, C5514K7 c5514k7, List<List<C7422pT>> list, List<Long> list2) {
        String strA07 = A07(34, 9, 116);
        AbstractC45353y.A07(str.startsWith(strA07));
        String[] strArrSplit = str.substring(strA07.length()).split(A07(32, 1, 99), c5514k7.A01);
        int length = strArrSplit.length;
        int i = c5514k7.A01;
        String strA08 = A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50);
        if (length != i) {
            AbstractC45794g.A07(strA08, A07(143, 55, 98) + str);
            return;
        }
        long jA04 = A04(strArrSplit[c5514k7.A02]);
        String strA09 = A07(198, 25, 21);
        if (jA04 == -9223372036854775807L) {
            AbstractC45794g.A07(strA08, strA09 + str);
            return;
        }
        long jA05 = A04(strArrSplit[c5514k7.A00]);
        if (jA05 == -9223372036854775807L) {
            AbstractC45794g.A07(strA08, strA09 + str);
            return;
        }
        C5519KC c5519kc = (this.A02 == null || c5514k7.A03 == -1) ? null : this.A02.get(strArrSplit[c5514k7.A03].trim());
        String str2 = strArrSplit[c5514k7.A04];
        C5516K9 c5516k9A02 = C5516K9.A02(str2);
        String strA04 = C5516K9.A04(str2);
        String strA010 = A07(331, 2, 4);
        String strA011 = A07(0, 1, 91);
        C7422pT c7422pTA06 = A06(strA04.replace(strA010, strA011).replace(A07(335, 2, 52), strA011).replace(A07(333, 2, 93), A07(353, 2, 126)), c5519kc, c5516k9A02, this.A01, this.A00);
        int iA03 = A03(jA05, list2, list);
        for (int iA04 = A03(jA04, list2, list); iA04 < iA03; iA04++) {
            list.get(iA04).add(c7422pTA06);
        }
    }

    static {
        A09();
        A07 = Pattern.compile(A07(1, 31, 11));
    }

    public C43831R() {
        this(null);
    }

    public C43831R(List<byte[]> list) {
        super(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50));
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String strA0q = AbstractC46115C.A0q(list.get(0));
            String formatLine = A07(43, 7, 9);
            AbstractC45353y.A07(strA0q.startsWith(formatLine));
            this.A03 = (C5514K7) AbstractC45353y.A01(C5514K7.A00(strA0q));
            A0A(new C45944v(list.get(1)));
            return;
        }
        this.A04 = false;
        this.A03 = null;
    }

    public static float A00(int i) {
        switch (i) {
            case 0:
                return 0.05f;
            case 1:
                return 0.5f;
            case 2:
                return 0.95f;
            default:
                return -3.4028235E38f;
        }
    }

    public static int A01(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                AbstractC45794g.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, 124) + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                A06[6] = "Sg07jKGUv12uLKgMKKFA3fI9zPLxcTEi";
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int A02(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                AbstractC45794g.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, 124) + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "bBVjASvxGIVEucqGKWBeREj1nHP5tR7K";
                strArr[4] = "afA0CT9VteApb4cGitBpBAxXonSmRtRK";
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static int A03(long j, List<Long> list, List<List<C7422pT>> list2) {
        ArrayList arrayList;
        int i = 0;
        int insertionIndex = list.size();
        for (int i2 = insertionIndex - 1; i2 >= 0; i2--) {
            long jLongValue = list.get(i2).longValue();
            int i3 = A06[7].charAt(28);
            if (i3 == 116) {
                throw new RuntimeException();
            }
            A06[7] = "L6yhcoI2CoUL0EEbj8PtMmDYbUY1DBiP";
            if (jLongValue == j) {
                return i2;
            }
            if (list.get(i2).longValue() < j) {
                i = i2 + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            int insertionIndex2 = i - 1;
            arrayList = new ArrayList(list2.get(insertionIndex2));
        }
        list2.add(i, arrayList);
        return i;
    }

    public static long A04(String str) {
        Matcher matcher = A07.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) AbstractC46115C.A0f(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) AbstractC46115C.A0f(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) AbstractC46115C.A0f(matcher.group(3))) * 1000000) + (Long.parseLong((String) AbstractC46115C.A0f(matcher.group(4))) * 10000);
    }

    public static Layout.Alignment A05(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                AbstractC45794g.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, 124) + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public static C7422pT A06(String str, C5519KC c5519kc, C5516K9 c5516k9, float f, float f2) {
        int i;
        SpannableString spannableString = new SpannableString(str);
        C45253o c45253oA0G = new C45253o().A0G(spannableString);
        if (c5519kc != null) {
            if (c5519kc.A04 != null) {
                spannableString.setSpan(new ForegroundColorSpan(c5519kc.A04.intValue()), 0, spannableString.length(), 33);
            }
            if (c5519kc.A02 == 3 && c5519kc.A03 != null) {
                spannableString.setSpan(new BackgroundColorSpan(c5519kc.A03.intValue()), 0, spannableString.length(), 33);
            }
            if (c5519kc.A00 != -3.4028235E38f) {
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "hamZaHHK5iJw0vPowwB4Xi3W6GQULYkl";
                strArr[4] = "AtQHcqF1nJuVU9oQ1sBsNKUnqzSBt8ub";
                if (f2 != -3.4028235E38f) {
                    c45253oA0G.A08(c5519kc.A00 / f2, 1);
                }
            }
            if (c5519kc.A06 && c5519kc.A07) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (c5519kc.A06) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c5519kc.A07) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (c5519kc.A09) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c5519kc.A08) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = c5516k9.A00;
        if (A06[6].length() == 19) {
            throw new RuntimeException();
        }
        A06[7] = "i2mc5u7bs2HiiqvdNfcyeR2hNUTbHa8c";
        if (i2 != -1) {
            i = c5516k9.A00;
        } else if (c5519kc != null) {
            i = c5519kc.A01;
        } else {
            i = -1;
        }
        C45253o cue = c45253oA0G.A0F(A05(i));
        cue.A0A(A02(i)).A09(A01(i));
        if (c5516k9.A01 != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            c45253oA0G.A04(c5516k9.A01.x / f);
            c45253oA0G.A07(c5516k9.A01.y / f2, 0);
        } else {
            c45253oA0G.A04(A00(c45253oA0G.A01()));
            c45253oA0G.A07(A00(c45253oA0G.A00()), 0);
        }
        return c45253oA0G.A0H();
    }

    public static Map<String, C5519KC> A08(C45944v c45944v) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5515K8 c5515k8A00 = null;
        while (true) {
            String strA0T = c45944v.A0T();
            if (strA0T == null || (c45944v.A07() != 0 && c45944v.A0B() == 91)) {
                break;
            }
            if (strA0T.startsWith(A07(43, 7, 9))) {
                c5515k8A00 = C5515K8.A00(strA0T);
            } else if (strA0T.startsWith(A07(233, 6, 115))) {
                if (c5515k8A00 == null) {
                    String currentLine = A07(50, 46, 50) + strA0T;
                    AbstractC45794g.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), currentLine);
                } else {
                    C5519KC c5519kcA04 = C5519KC.A04(strA0T, c5515k8A00);
                    if (c5519kcA04 != null) {
                        linkedHashMap.put(c5519kcA04.A05, c5519kcA04);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void A0A(C45944v c45944v) {
        while (true) {
            String strA0T = c45944v.A0T();
            if (strA0T != null) {
                if (A07(266, 13, 1).equalsIgnoreCase(strA0T)) {
                    A0B(c45944v);
                } else if (A07(Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 12, 20).equalsIgnoreCase(strA0T)) {
                    this.A02 = A08(c45944v);
                } else if (A07(279, 11, 82).equalsIgnoreCase(strA0T)) {
                    AbstractC45794g.A06(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(290, 29, 35));
                } else if (A07(258, 8, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE).equalsIgnoreCase(strA0T)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    private void A0B(C45944v c45944v) {
        while (true) {
            String strA0T = c45944v.A0T();
            if (strA0T != null) {
                if (c45944v.A07() == 0 || c45944v.A0B() != 91) {
                    String[] strArrSplit = strA0T.split(A07(33, 1, 29));
                    if (strArrSplit.length == 2) {
                        byte b = 0;
                        String strA01 = AbstractC7107k7.A01(strArrSplit[0].trim());
                        String currentLine = A06[7];
                        if (currentLine.charAt(28) != 't') {
                            String[] strArr = A06;
                            strArr[5] = "TxjPtR6Me2tOCH56RvBuXVxOpTFPkhKs";
                            strArr[4] = "CGC80sv4xmOos6ad3yBESqJRjeXwJGgE";
                            switch (strA01.hashCode()) {
                                case 1879649548:
                                    if (!strA01.equals(A07(337, 8, 113))) {
                                        b = -1;
                                    }
                                    break;
                                case 1879649549:
                                    String currentLine2 = A06[0];
                                    if (currentLine2.charAt(2) == 'L') {
                                        A06[3] = "57knmpqjR0Ls81goizN6npBH6l";
                                        if (!strA01.equals(A07(345, 8, 42))) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                    } else {
                                        String[] strArr2 = A06;
                                        strArr2[5] = "y7TEYh3wOWaLWgkmzZBlA5JQj6rjOZZg";
                                        strArr2[4] = "3gq1Vhf6xja9YBkNvRBFSeYMsj86kNRf";
                                        if (!strA01.equals(A07(345, 8, 31))) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    this.A01 = Float.parseFloat(strArrSplit[1].trim());
                                    break;
                                case 1:
                                    try {
                                        this.A00 = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                    break;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void A0C(C45944v c45944v, List<List<C7422pT>> list, List<Long> list2) {
        C5514K7 c5514k7A00 = this.A04 ? this.A03 : null;
        while (true) {
            String strA0T = c45944v.A0T();
            if (strA0T != null) {
                if (strA0T.startsWith(A07(43, 7, 9))) {
                    c5514k7A00 = C5514K7.A00(strA0T);
                } else if (strA0T.startsWith(A07(34, 9, 116))) {
                    if (c5514k7A00 == null) {
                        AbstractC45794g.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(96, 47, 114) + strA0T);
                    } else {
                        A0D(strA0T, c5514k7A00, list, list2);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC48148T
    public final InterfaceC5490Jj A0g(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C45944v c45944v = new C45944v(bArr, i);
        if (!this.A04) {
            A0A(c45944v);
        }
        A0C(c45944v, arrayList, arrayList2);
        return new C7199le(arrayList, arrayList2);
    }
}
