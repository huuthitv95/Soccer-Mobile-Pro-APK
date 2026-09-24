package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
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
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11837bb {

    /* JADX INFO: renamed from: ﭴ */
    private static long f27471 = 5560976379925602106L;

    /* JADX INFO: renamed from: ﭸ */
    private static int f27472 = 1;

    /* JADX INFO: renamed from: ﮉ */
    private static int f27473 = 0;

    /* JADX INFO: renamed from: ﮌ */
    private static char f27474 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static int f27475 = 1074432500;

    /* JADX INFO: renamed from: ﺙ */
    private static long f27476;

    /* JADX INFO: renamed from: ﱡ */
    private String f27478;

    /* JADX INFO: renamed from: ﻐ */
    private String f27480;

    /* JADX INFO: renamed from: ﻛ */
    private String f27481;

    /* JADX INFO: renamed from: ｋ */
    private String f27482;

    /* JADX INFO: renamed from: ﾇ */
    private String f27483;

    /* JADX INFO: renamed from: ﾒ */
    private String f27484;

    /* JADX INFO: renamed from: ﮐ */
    private a f27477 = a.f27492;

    /* JADX INFO: renamed from: ﻏ */
    private b f27479 = b.f27503;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$a */
    public enum a {
        f27492,
        f27495,
        f27494,
        f27493,
        f27496,
        f27489;


        /* JADX INFO: renamed from: ﮐ */
        private static int f27487 = 1;

        /* JADX INFO: renamed from: ﺙ */
        private static int f27490;

        /* JADX INFO: renamed from: ﻏ */
        private static char[] f27491;

        /* JADX INFO: renamed from: ﻐ */
        static void m28742() {
            f27491 = new char[]{AbstractJsonLexerKt.BEGIN_LIST, Typography.plusMinus, Typography.paragraph, '#', 'E', 'L', 'K', 'E', 'H', 'K', 'J', 'x', 236, 234, 237, 237, 240, 240, 231, 232, 236, 243, 243, '\'', 'M', '\"', 'D', 'H', 'G', 'A', 'J', 'N', 'F', 'B', 133, 135, 128, 128};
        }

        public static a valueOf(String str) {
            int i = 2 % 2;
            int i2 = f27487 + 25;
            f27490 = i2 % 128;
            int i3 = i2 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            if (i3 == 0) {
                return aVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f27490 + 107;
            f27487 = i2 % 128;
            int i3 = i2 % 2;
            a[] aVarArrValuesCustom = values();
            if (i3 != 0) {
                return (a[]) aVarArrValuesCustom.clone();
            }
            int i4 = 90 / 0;
            return (a[]) aVarArrValuesCustom.clone();
        }

        static {
            m28742();
            int i = f27490 + 87;
            f27487 = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m28743(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes(C9415C.ISO88591_NAME);
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (C12024i.f29270) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f27491, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C12024i.f29269 = 0;
                    char c = 0;
                    while (C12024i.f29269 < i2) {
                        if (bArr[C12024i.f29269] == 1) {
                            cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                        } else {
                            cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                        }
                        c = cArr2[C12024i.f29269];
                        C12024i.f29269++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C12024i.f29269 = 0;
                    while (C12024i.f29269 < i2) {
                        cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                        C12024i.f29269++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C12024i.f29269 = 0;
                    while (C12024i.f29269 < i2) {
                        cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                        C12024i.f29269++;
                    }
                }
                str2 = new String(cArr);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$b */
    public enum b {
        f27503,
        f27506,
        f27504,
        f27502,
        f27505,
        f27498;


        /* JADX INFO: renamed from: ﱡ */
        private static int f27499 = 0;

        /* JADX INFO: renamed from: ﺙ */
        private static int[] f27500 = null;

        /* JADX INFO: renamed from: ﻏ */
        private static int f27501 = 1;

        /* JADX INFO: renamed from: ﾇ */
        static void m28745() {
            f27500 = new int[]{1167634881, 337582516, -566408001, -1039084443, -1392367814, -1160631285, -665781860, -29182455, -1056669960, 159309714, 223221797, -53618083, 1470077629, 985328599, 1694102741, 636536547, 451394971, -369107504};
        }

        public static b valueOf(String str) {
            int i = 2 % 2;
            int i2 = f27501 + 61;
            f27499 = i2 % 128;
            int i3 = i2 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            if (i3 == 0) {
                return bVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f27499 + 69;
            f27501 = i2 % 128;
            int i3 = i2 % 2;
            b[] bVarArrValuesCustom = values();
            if (i3 != 0) {
                return (b[]) bVarArrValuesCustom.clone();
            }
            throw null;
        }

        static {
            m28745();
            int i = f27499 + 97;
            f27501 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m28744(int[] iArr, int i) {
            String str;
            synchronized (C11835b.f27464) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f27500.clone();
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

    C11837bb(String str) {
        this.f27482 = str;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0079  */
    /* JADX INFO: renamed from: ｋ */
    final void m28740(C11878cp c11878cp) {
        int i = 2 % 2;
        int i2 = f27473 + 41;
        f27472 = i2 % 128;
        int i3 = i2 % 2;
        c11878cp.m29740();
        this.f27482 = c11878cp.m29739();
        this.f27480 = c11878cp.m29742();
        this.f27484 = c11878cp.m29737();
        if (m28734("棁\ue703裆⟽ཹⅾ訕", (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", KeyEvent.getDeadChar(0, 0) - 1903463305, "睕譴\udf8e쯓").intern().equals(this.f27484)) {
            this.f27484 = m28735("耨聦︀愕킏\ueeba礒", TextUtils.lastIndexOf("", '0') + 1).intern();
        } else {
            int i4 = f27473 + 95;
            f27472 = i4 % 128;
            int i5 = i4 % 2;
            if (m28734("\udf0eԏ改땧芠\ue32bਧ\ud8ee", (char) (TextUtils.lastIndexOf("", '0') + 1), "\u0000\u0000\u0000\u0000", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "῝Ճ罫≟").intern().equals(this.f27484)) {
                this.f27484 = m28735("耨聦︀愕킏\ueeba礒", TextUtils.lastIndexOf("", '0') + 1).intern();
            }
        }
        this.f27481 = c11878cp.m29734();
        this.f27483 = c11878cp.m29735();
        this.f27478 = c11878cp.m29738();
    }

    /* JADX INFO: renamed from: ｋ */
    final void m28739(a aVar) {
        int i = 2 % 2;
        int i2 = f27472 + 21;
        f27473 = i2 % 128;
        int i3 = i2 % 2;
        this.f27477 = aVar;
        if (aVar != a.f27489) {
            int i4 = f27473 + 3;
            f27472 = i4 % 128;
            if (i4 % 2 == 0) {
                this.f27479 = b.f27503;
                int i5 = 82 / 0;
            } else {
                this.f27479 = b.f27503;
            }
        }
        int i6 = AnonymousClass2.f27485[this.f27477.ordinal()];
        if (i6 == 3 || i6 == 4 || i6 == 5) {
            m28736();
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    final void m28738(b bVar) {
        int i = 2 % 2;
        int i2 = f27472 + 107;
        f27473 = i2 % 128;
        int i3 = i2 % 2;
        this.f27479 = bVar;
        m28739(a.f27489);
        int i4 = f27473 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27472 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m28736() {
        int i = 2 % 2;
        int i2 = f27473 + 101;
        f27472 = i2 % 128;
        if (i2 % 2 != 0 ? !this.f27482.equals(m28735("\ue055\ue002窹\ue5e6ᠲ\uebba☤㙂鳔曾鴏", Color.alpha(0)).intern()) : !this.f27482.equals(m28735("\ue055\ue002窹\ue5e6ᠲ\uebba☤㙂鳔曾鴏", Color.alpha(0)).intern())) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m28733());
            sb2.append(m28734("잮", (char) (TextUtils.indexOf("", "", 0) + 34237), "\u0000\u0000\u0000\u0000", 2030154592 - Color.alpha(0), "急Ƴ뵹涅").intern());
            sb.append(sb2.toString());
            String strM28731 = m28731();
            if (strM28731 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strM28731);
                sb3.append(m28734("잮", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 34237), "\u0000\u0000\u0000\u0000", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2030154591, "急Ƴ뵹涅").intern());
                sb.append(sb3.toString());
                int i3 = f27473 + 97;
                f27472 = i3 % 128;
                int i4 = i3 % 2;
            }
            String strM28730 = m28730();
            if (strM28730 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(strM28730);
                sb4.append(m28734("잮", (char) (34237 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getWindowTouchSlop() >> 8) + 2030154592, "急Ƴ뵹涅").intern());
                sb.append(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m28735("艂舑ණ鋥\uebb0\ue70c향㫖ﻟᇺ滃恠", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern());
            sb5.append(m28729());
            sb5.append(m28734("잮", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 34237), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2030154591, "急Ƴ뵹涅").intern());
            sb.append(sb5.toString());
            if (this.f27477 == a.f27493 || this.f27477 == a.f27496) {
                C12085l.m30923(m28734("쩷ὒ⳻\uabee繜ꆟ꭛悁婃䯃ྭ镡", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, "\uda6d礮㳬ઃ").intern(), sb.toString());
                return;
            }
            String strM28732 = m28732(this.f27479);
            if (strM28732 != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(m28734("㘌鷄䓽㦉宓ⷥ盟䎍̠", (char) (ViewConfiguration.getTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", ((Process.getThreadPriority(0) + 20) >> 6) + 662935949, "赳莙脧\u0d0d").intern());
                sb6.append(strM28732);
                sb.append(sb6.toString());
            }
            C12085l.m30912(m28734("쩷ὒ⳻\uabee繜ꆟ꭛悁婃䯃ྭ镡", (char) (Color.rgb(0, 0, 0) + 16777216), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollDefaultDelay() >> 16, "\uda6d礮㳬ઃ").intern(), sb.toString());
            int i5 = f27472 + 7;
            f27473 = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f27473 + 115;
        f27472 = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private String m28733() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m28735("ᏎᏣ◠뫷쪹텿\uf4e0\u0cfc漋㧯侑噇\uea33볇첉\udbaf敛〿䇬", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        sb.append(this.f27482);
        sb.append(m28734("♹ত홈跡ꜱ\ud9c7殠‽\uf010僻尺", (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (-1627815633) - ExpandableListView.getPackedPositionChild(0L), "〱女\uf19e線").intern());
        String string = sb.toString();
        if (this.f27480 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(this.f27480);
            sb2.append(m28734("뎾", (char) (42872 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", 506740374 - ExpandableListView.getPackedPositionGroup(0L), "陏㐾砞控").intern());
            string = sb2.toString();
            int i2 = f27472 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f27473 = i2 % 128;
            int i3 = i2 % 2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(m28735("펈펥\ueaa0疷倽쩥湤៦꽍\uf6af픕䵝⩵率嘍삵ꔝｿ", TextUtils.getOffsetAfter("", 0)).intern());
        return sb3.toString();
    }

    /* JADX INFO: renamed from: ﻐ */
    private String m28731() {
        int i = 2 % 2;
        int i2 = f27472 + 111;
        int i3 = i2 % 128;
        f27473 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (this.f27482 != null) {
            int i5 = i3 + 79;
            f27472 = i5 % 128;
            int i6 = i5 % 2;
            String strIntern = this.f27484;
            if (strIntern != null) {
                if (strIntern.equals(m28735("耨聦︀愕킏\ueeba礒", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1).intern())) {
                    int i7 = f27473 + 113;
                    f27472 = i7 % 128;
                    if (i7 % 2 == 0) {
                        a aVar = a.f27496;
                        super.hashCode();
                        throw null;
                    }
                    if (this.f27477 != a.f27496) {
                        strIntern = m28735("翤羪䌗\udc42掇ꋫ嶇罥ͪ彐\ue6af▐虜\uda78斧", (-1) - TextUtils.lastIndexOf("", '0')).intern();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f27482);
                sb.append(m28735("뱘뱸련❁곉練鋹⑳삐ꑼ⧀纗䗻⅋\uaad2\uf363쫚귺", TextUtils.getOffsetAfter("", 0)).intern());
                sb.append(strIntern);
                return sb.toString();
            }
        }
        int i8 = i3 + 17;
        f27472 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 40 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x007f  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: ﱟ */
    private String m28730() {
        String string;
        int i;
        int i2 = 2 % 2;
        int i3 = f27472 + 67;
        f27473 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
            if (this.f27481 != null) {
                if (this.f27483 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(m28734("뇨Ǆ䘒丞茘\ufd90⯯\udd32ﳫ鑵텀ጪ\ue96b藫\u2fde绝濗ൕ㯋쁖䐜\uf167犓鏍", (char) Color.red(0), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", ""), "䈘噚\udada瘆").intern());
                    sb.append(this.f27481);
                    sb.append(m28734("\uf43d鬩섾", (char) (28339 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getFadingEdgeLength() >> 16) - 270627670, "ꩠ\ude8c닯㙮").intern());
                    sb.append(this.f27483);
                    string = sb.toString();
                    i = f27472 + 113;
                    f27473 = i % 128;
                    if (i % 2 == 0) {
                        return string;
                    }
                    super.hashCode();
                    throw null;
                }
            }
        } else if (this.f27481 != null) {
            if (this.f27483 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m28734("뇨Ǆ䘒丞茘\ufd90⯯\udd32ﳫ鑵텀ጪ\ue96b藫\u2fde绝濗ൕ㯋쁖䐜\uf167犓鏍", (char) Color.red(0), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", ""), "䈘噚\udada瘆").intern());
                sb2.append(this.f27481);
                sb2.append(m28734("\uf43d鬩섾", (char) (28339 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getFadingEdgeLength() >> 16) - 270627670, "ꩠ\ude8c닯㙮").intern());
                sb2.append(this.f27483);
                string = sb2.toString();
                i = f27472 + 113;
                f27473 = i % 128;
                if (i % 2 == 0) {
                    return string;
                }
                super.hashCode();
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bb$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ﻐ */
        static final /* synthetic */ int[] f27485;

        /* JADX INFO: renamed from: ﾇ */
        static final /* synthetic */ int[] f27486;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f27486 = iArr;
            try {
                iArr[b.f27498.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27486[b.f27506.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27486[b.f27504.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27486[b.f27502.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27486[b.f27505.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[a.valuesCustom().length];
            f27485 = iArr2;
            try {
                iArr2[a.f27495.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27485[a.f27494.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27485[a.f27493.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27485[a.f27489.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27485[a.f27496.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private String m28732(b bVar) {
        int i = 2 % 2;
        int i2 = f27472 + 13;
        f27473 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bVar != null) {
            int i3 = AnonymousClass2.f27486[bVar.ordinal()];
            if (i3 == 1) {
                return m28734("\udf1a\ude31瘷祰峜㖜ῌ䯪ᆲ턺䝎\ue9b7너\ud9f4ᨣ︫㡔֊袉\ue3ee⸚ⷈ", (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), "穞汲鈌鿕").intern();
            }
            if (i3 == 2) {
                return String.format(m28734("臺邒鋏肑㫱쿊쌖垡抚浽⚪묙↪龙␕\u12a18닑㺒泿뛞䲽䤘\u12c7웛\uec43咓节⦯垚ྍ\uf568ۚ梺䒨荜먌ጯ嗌\ue773靝͒囋窅叴\ue340他㴯婭\ueb22촔\uee99쨈靱녒ᮘ佶⽋䟳㩜\u0ef9\uf289", (char) Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000\u0000\u0000", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "䁻㫨᧶署").intern(), this.f27482, this.f27484, this.f27478);
            }
            if (i3 == 3) {
                return String.format(m28735("굖굳쑉嬀먴抨葠뽕퇺\ud820㼜\ue5b5哣崱뱗桂\udb81퇕ㅬ\ueb16庅嚳똝湨\uddfe쯥⫳\uf117䀆䢚꿡琿윮춨ⳙ\uf723䩦䉜ꆦ篏줛읏⛜ﻡ䰿䐣鮐ƃ\uf0cb㥛ᡯ蒜矘븽鵑\u07b8\ufaea㌤ሮ", TextUtils.indexOf("", "", 0, 0)).intern(), this.f27482, this.f27484);
            }
            if (i3 == 4) {
                return m28735("씔앒\uf7bd棦휀砟\ue91dꗝ릙\uebfb剡＿㲫溗터狍독\ue23b屘\uf1da㛘攎\udb73瓶떼\uf81c䞎\ueb85⠊筲슚溷꼣﹝", View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
            }
            if (i3 == 5) {
                return m28735("壞墘鶢˹൘ᙆ㍅쮄\u2453臤蠹酦ꅡ҈ୢᲈ⸃蠱蘝龇ꭞ༛ľ᪤⠸鈅鷚藆뗁ᅺ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
            }
        }
        int i4 = f27472 + 99;
        f27473 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    private String m28729() {
        int i = 2 % 2;
        int i2 = f27472 + 35;
        f27473 = i2 % 128;
        int i3 = i2 % 2;
        String strName = this.f27477.name();
        int i4 = f27472 + 81;
        f27473 = i4 % 128;
        if (i4 % 2 == 0) {
            return strName;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    final String m28737() {
        int i = 2 % 2;
        int i2 = f27472 + 51;
        f27473 = i2 % 128;
        int i3 = i2 % 2;
        String strM28732 = m28732(this.f27479);
        int i4 = f27473 + 11;
        f27472 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return strM28732;
    }

    /* JADX INFO: renamed from: ﾒ */
    final boolean m28741() {
        int i = 2 % 2;
        int i2 = f27472 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27473 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
            if (this.f27477 == a.f27495) {
                return true;
            }
        } else if (this.f27477 == a.f27495) {
            return true;
        }
        int i4 = f27472 + 13;
        f27473 = i4 % 128;
        int i5 = i4 % 2;
        if (this.f27477 == a.f27494 || this.f27477 == a.f27492) {
            return true;
        }
        int i6 = f27473 + 105;
        f27472 = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28734(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f27476) ^ ((long) f27475)) ^ ((long) f27474));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28735(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27471, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27471));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
