package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dt */
/* JADX INFO: loaded from: classes6.dex */
public final class C11909dt {

    /* JADX INFO: renamed from: ﭴ */
    private static int f28675 = 0;

    /* JADX INFO: renamed from: ﭸ */
    private static int[] f28676 = null;

    /* JADX INFO: renamed from: ﮌ */
    private static int f28677 = 1;

    /* JADX INFO: renamed from: ﮐ */
    private static final List<String> f28678;

    /* JADX INFO: renamed from: ﱟ */
    private static final Pattern f28679;

    /* JADX INFO: renamed from: ﱡ */
    private static final Pattern f28680;

    /* JADX INFO: renamed from: ﺙ */
    private static final Pattern f28681;

    /* JADX INFO: renamed from: ﻏ */
    private static long f28682;

    /* JADX INFO: renamed from: ﻐ */
    private static final Pattern f28683;

    /* JADX INFO: renamed from: ﻛ */
    private static final Pattern f28684;

    /* JADX INFO: renamed from: ｋ */
    private static final Pattern f28685;

    /* JADX INFO: renamed from: ﾇ */
    private static final Pattern f28686;

    /* JADX INFO: renamed from: ﾒ */
    private static final Pattern f28687;

    /* JADX INFO: renamed from: ﻛ */
    static void m30070() {
        f28682 = -6872069623061322686L;
        f28676 = new int[]{-1821669159, 1683574167, 1333967007, -631312141, -1666544135, -664894490, -395396636, -1493223590, 882209871, -459225404, -318841000, -888927559, 1980581674, 2144528461, -171682436, 1651576035, 1989349341, -856544747};
    }

    static {
        m30070();
        f28685 = Pattern.compile(m30072(new int[]{584531476, -685142839, 1165395664, 928518647, -1621531703, -1176697421, -1733774948, 2089348980, 1859185984, -1403837899, 261113065, 769961860, 1500819574, -124478772}, 25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        f28684 = Pattern.compile(m30069("搜뱃퐬\uec14Ӵ岱瓌貕ꔦﴢᕂⷡ䖻鶬떂칭", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 55332).intern());
        f28683 = Pattern.compile(m30069("搜碖嶌㊤឴\uf4a1즬껀莦悒䕢娔㽻᰼\uf122환", 7410 - ExpandableListView.getPackedPositionChild(0L)).intern());
        f28686 = Pattern.compile(m30072(new int[]{-561874452, -1593056090, 235266996, 1595040750, -70882741, 842886482, -1693995702, -680655325}, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
        f28687 = Pattern.compile(m30069("搜\uf7be䌼\ude9a⫧虜ᆃ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37799).intern());
        f28681 = Pattern.compile(m30069("搜窢奕㡞Ổﶤ\udc0d댅醾炎坑㘐ᓧ\ueb10쨂ꣶ迟湳䵔⎎˧\ue131쀏ꚡ薗搫章姕㡕ἁ\ufdc9\udc94덑", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7866).intern());
        f28679 = Pattern.compile(m30069("搜ᡕ鰆", TextUtils.lastIndexOf("", '0') + 31794).intern());
        f28680 = Pattern.compile(m30069("搜不〘ᨧ챲", 10771 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
        f28678 = Arrays.asList(m30072(new int[]{1536519532, 16852478}, TextUtils.lastIndexOf("", '0', 0) + 3).intern(), m30069("搧㷵힇榶", TextUtils.lastIndexOf("", '0', 0, 0) + 23004).intern(), m30069("搬\uec56瓬ﴍ", 34913 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m30069("搰ᄠ踸㬢뀬ⴏ", ((Process.getThreadPriority(0) + 20) >> 6) + 29959).intern(), m30069("搱ⷤ\uf794륞䍼", Gravity.getAbsoluteGravity(0, 0) + 18899).intern(), m30072(new int[]{-360447669, -1004331518}, Color.argb(0, 0, 0, 0) + 3).intern(), m30072(new int[]{-773483318, 1236977284, -593431399, 1140557994}, Color.red(0) + 5).intern());
        int i = f28677 + 89;
        f28675 = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0120 A[PHI: r8 r10
  0x0120: PHI (r8v29 com.ironsource.adqualitysdk.sdk.i.dw$c) = (r8v28 com.ironsource.adqualitysdk.sdk.i.dw$c), (r8v46 com.ironsource.adqualitysdk.sdk.i.dw$c) binds: [B:41:0x00a8, B:43:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r10v21 java.lang.String) = (r10v20 java.lang.String), (r10v36 java.lang.String) binds: [B:41:0x00a8, B:43:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x0311 A[PHI: r18
  0x0311: PHI (r18v5 int) = (r18v6 int), (r18v14 int) binds: [B:92:0x02ee, B:75:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0315  */
    /* JADX INFO: renamed from: ﻐ */
    public static List<C11912dw> m30067(String str, String str2, String str3) {
        char cCharAt;
        int i;
        int length;
        int length2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i5 = f28677 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28675 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        int i8 = 0;
        while (i7 < str3.length()) {
            int i9 = f28675 + 21;
            f28677 = i9 % 128;
            if (i9 % i3 != 0 ? i7 + 1 < str3.length() : i7 % 0 < str3.length()) {
                cCharAt = str3.charAt(i7 + 1);
                int i10 = f28675 + 97;
                f28677 = i10 % 128;
                int i11 = i10 % i3;
            } else {
                cCharAt = 0;
            }
            char cCharAt2 = str3.charAt(i7);
            if (cCharAt2 != '\n') {
                if (cCharAt2 != '%' && cCharAt2 != '[' && cCharAt2 != ']' && cCharAt2 != '{' && cCharAt2 != '}') {
                    if (cCharAt2 != '!') {
                        if (cCharAt2 != '\"') {
                            switch (cCharAt2) {
                                case '\'':
                                    i = i3;
                                    String strM30068 = m30068(m30071(f28683, str3, i7));
                                    if (strM30068.length() == 1) {
                                        arrayList.add(new C11912dw(C11912dw.c.f28734, String.valueOf((int) strM30068.charAt(0)), i8));
                                    } else {
                                        arrayList.add(new C11912dw(C11912dw.c.f28735, strM30068, i8));
                                    }
                                    length = strM30068.length();
                                    length2 = length + 2;
                                    i7 += length2;
                                    i3 = i;
                                    break;
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case '.':
                                case '/':
                                    break;
                                case '+':
                                    i = i3;
                                    if (cCharAt != '+') {
                                        if (cCharAt == '-') {
                                            arrayList.add(new C11912dw(C11912dw.c.f28732, m30072(new int[]{-2036776809, 866560649}, 2 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), i8));
                                        }
                                        C11912dw.c cVar = C11912dw.c.f28732;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str3.charAt(i7));
                                        arrayList.add(new C11912dw(cVar, sb.toString(), i8));
                                        i7++;
                                        i3 = i;
                                    } else {
                                        arrayList.add(new C11912dw(C11912dw.c.f28732, m30069("摩\ue086", 34031 - (Process.myTid() >> 22)).intern(), i8));
                                    }
                                    i7 += 2;
                                    i3 = i;
                                    break;
                                case '-':
                                    i = i3;
                                    if (cCharAt == '-') {
                                        arrayList.add(new C11912dw(C11912dw.c.f28732, m30072(new int[]{-2036776809, 866560649}, 2 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), i8));
                                        i7 += 2;
                                        i3 = i;
                                    }
                                    C11912dw.c cVar2 = C11912dw.c.f28732;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str3.charAt(i7));
                                    arrayList.add(new C11912dw(cVar2, sb2.toString(), i8));
                                    i7++;
                                    i3 = i;
                                    break;
                                default:
                                    switch (cCharAt2) {
                                        case ':':
                                        case ';':
                                            break;
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i7))) {
                                                C11912dw.c cVar3 = C11912dw.c.f28728;
                                                String strM30071 = m30071(f28681, str3, i7);
                                                if (TextUtils.isEmpty(strM30071)) {
                                                    cVar3 = C11912dw.c.f28736;
                                                    strM30071 = m30071(f28685, str3, i7);
                                                    if (TextUtils.isEmpty(strM30071)) {
                                                        i = i3;
                                                        i2 = 51071;
                                                    } else {
                                                        i = i3;
                                                        if (strM30071.equals(m30069("搶뮓\udb71龜", ExpandableListView.getPackedPositionGroup(0L) + 57251).intern())) {
                                                            i2 = 51071;
                                                        } else {
                                                            int i12 = f28675 + 5;
                                                            f28677 = i12 % 128;
                                                            int i13 = i12 % 2;
                                                            i2 = 51071;
                                                            if (!strM30071.equals(m30072(new int[]{318789425, -1051324432, -956545143, -15870142}, 5 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                                                                if (f28678.contains(strM30071)) {
                                                                    int i14 = f28675 + 77;
                                                                    f28677 = i14 % 128;
                                                                    int i15 = i14 % 2;
                                                                    cVar3 = C11912dw.c.f28733;
                                                                }
                                                            }
                                                        }
                                                        cVar3 = C11912dw.c.f28730;
                                                    }
                                                } else {
                                                    i = i3;
                                                    i2 = 51071;
                                                }
                                                if (TextUtils.isEmpty(strM30071)) {
                                                    int i16 = f28675 + 111;
                                                    f28677 = i16 % 128;
                                                    int i17 = i16 % 2;
                                                    cVar3 = C11912dw.c.f28727;
                                                    strM30071 = m30071(f28686, str3, i7);
                                                }
                                                if (TextUtils.isEmpty(strM30071)) {
                                                    cVar3 = C11912dw.c.f28734;
                                                    strM30071 = m30071(f28687, str3, i7);
                                                }
                                                if (TextUtils.isEmpty(strM30071)) {
                                                    cVar3 = C11912dw.c.f28732;
                                                    strM30071 = m30071(f28680, str3, i7);
                                                }
                                                if (TextUtils.isEmpty(strM30071)) {
                                                    cVar3 = C11912dw.c.f28732;
                                                    strM30071 = m30071(f28679, str3, i7);
                                                }
                                                if (!TextUtils.isEmpty(strM30071)) {
                                                    arrayList.add(new C11912dw(cVar3, strM30071, i8));
                                                    length2 = strM30071.length();
                                                    i7 += length2;
                                                    i3 = i;
                                                } else {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(m30069("搎ꍘ\ueac4㉚秌脖", Color.blue(0) + i2).intern());
                                                    sb3.append(str);
                                                    String string = sb3.toString();
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append(m30069("搗葝ꓒ앴\ue5e5ؘ⚃䜻枣蟁ꁍ샽\ue12eƜ∄䊼挠菣", ExpandableListView.getPackedPositionType(0L) + 57457).intern());
                                                    sb4.append(str3.charAt(i7));
                                                    sb4.append(m30069("摢穎壬㼥ᶆﰌ튿냐非痾呯⪃ॾ", View.combineMeasuredStates(0, 0) + 7789).intern());
                                                    sb4.append(i7);
                                                    sb4.append(m30069("摢짰㾚淳", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44507).intern());
                                                    sb4.append(str2);
                                                    C11875cm.m29607(string, sb4.toString(), null);
                                                    i7++;
                                                    i3 = i;
                                                }
                                            } else {
                                                int i18 = f28677 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                                                f28675 = i18 % 128;
                                                if (i18 % i3 != 0) {
                                                    i7 += 100;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            i = i3;
                            String strM30072 = m30071(f28684, str3, i7);
                            if (strM30072 == null) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(m30069("搎ꍘ\ueac4㉚秌脖", 51071 - ExpandableListView.getPackedPositionType(0L)).intern());
                                sb5.append(str);
                                String string2 = sb5.toString();
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(m30069("搇\u2da7\uf71e루䉬\u0b91\uddb8朂⢈\uf27e믍䵑ᜱ\ud8c9扳⯯﵀蜬䢲ሐ\udbae浀㛌\uf8f3舚䮒ᵧꛆ梲㈰ﮟ赥嚂", 18839 - KeyEvent.getDeadChar(0, 0)).intern());
                                sb6.append(i7);
                                sb6.append(m30069("摢짰㾚淳", 44506 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
                                sb6.append(str2);
                                C11875cm.m29607(string2, sb6.toString(), null);
                                i7++;
                                i3 = i;
                            } else {
                                String strM30069 = m30068(strM30072);
                                arrayList.add(new C11912dw(C11912dw.c.f28735, strM30069, i8));
                                length = strM30069.length();
                                length2 = length + 2;
                                i7 += length2;
                                i3 = i;
                            }
                        }
                    }
                    i = i3;
                    if (cCharAt == '=') {
                        C11912dw.c cVar4 = C11912dw.c.f28732;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str3.charAt(i7));
                        sb7.append(m30069("摿", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40123).intern());
                        arrayList.add(new C11912dw(cVar4, sb7.toString(), i8));
                    } else if (cCharAt != '+') {
                        arrayList.add(new C11912dw(C11912dw.c.f28732, m30069("摩\ue086", 34031 - (Process.myTid() >> 22)).intern(), i8));
                    } else {
                        if (cCharAt == '-') {
                            arrayList.add(new C11912dw(C11912dw.c.f28732, m30072(new int[]{-2036776809, 866560649}, 2 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), i8));
                        }
                        C11912dw.c cVar5 = C11912dw.c.f28732;
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str3.charAt(i7));
                        arrayList.add(new C11912dw(cVar5, sb8.toString(), i8));
                        i7++;
                        i3 = i;
                    }
                    i7 += 2;
                    i3 = i;
                }
                i = i3;
                C11912dw.c cVar6 = C11912dw.c.f28732;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str3.charAt(i7));
                arrayList.add(new C11912dw(cVar6, sb9.toString(), i8));
                i7++;
                i3 = i;
            } else {
                i8++;
            }
            i7++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30068(String str) {
        int i = 2 % 2;
        int i2 = f28677 + 29;
        f28675 = i2 % 128;
        int i3 = i2 % 2;
        String strSubstring = str.substring(1, str.length() - 1);
        int i4 = f28677 + 25;
        f28675 = i4 % 128;
        int i5 = i4 % 2;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30071(Pattern pattern, String str, int i) {
        int i2 = 2 % 2;
        Matcher matcher = pattern.matcher(str);
        matcher.region(i, str.length());
        if (!(!matcher.find())) {
            int i3 = f28677 + 105;
            f28675 = i3 % 128;
            int i4 = i3 % 2;
            return str.substring(matcher.start(), matcher.end());
        }
        int i5 = f28675 + 31;
        f28677 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30069(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28682);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30072(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28676.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
