package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb */
/* JADX INFO: loaded from: classes6.dex */
public class C12053jb {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29550 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29551 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29552 = 157;

    /* JADX INFO: renamed from: ﻐ */
    private String f29553;

    /* JADX INFO: renamed from: ﻛ */
    private String f29554;

    /* JADX INFO: renamed from: ｋ */
    private String f29555;

    /* JADX INFO: renamed from: ﾇ */
    private String f29556;

    /* JADX INFO: renamed from: ﾒ */
    private boolean f29557;

    /* synthetic */ C12053jb(String str, String str2, String str3, String str4, byte b) {
        this(str, str2, str3, str4);
    }

    private C12053jb(String str, String str2, String str3, String str4) {
        this.f29553 = str;
        this.f29556 = str2;
        this.f29554 = str3;
        this.f29555 = str4;
        this.f29557 = true;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static String m30606() {
        int i = 2 % 2;
        int i2 = f29550 + 85;
        f29551 = i2 % 128;
        int i3 = i2 % 2;
        AbstractC11823ao abstractC11823aoM28472 = AbstractC11823ao.m28472();
        if (i3 != 0) {
            return abstractC11823aoM28472.mo28483();
        }
        abstractC11823aoM28472.mo28483();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    protected final String m30611() {
        int i = 2 % 2;
        int i2 = f29550;
        int i3 = i2 + 27;
        f29551 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f29553;
        int i5 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29551 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﺙ */
    private String m30608() {
        int i = 2 % 2;
        int i2 = f29551 + 69;
        int i3 = i2 % 128;
        f29550 = i3;
        int i4 = i2 % 2;
        String str = this.f29556;
        int i5 = i3 + 45;
        f29551 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    protected final String m30615() {
        int i = 2 % 2;
        int i2 = f29550 + 25;
        int i3 = i2 % 128;
        f29551 = i3;
        int i4 = i2 % 2;
        String str = this.f29554;
        int i5 = i3 + 51;
        f29550 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ */
    private String m30605() {
        int i = 2 % 2;
        int i2 = f29551 + 95;
        int i3 = i2 % 128;
        f29550 = i3;
        int i4 = i2 % 2;
        String str = this.f29555;
        int i5 = i3 + 79;
        f29551 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30614() {
        int i = 2 % 2;
        int i2 = f29550;
        int i3 = i2 + 11;
        f29551 = i3 % 128;
        int i4 = i3 % 2;
        this.f29557 = false;
        int i5 = i2 + 21;
        f29551 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public String mo30612() {
        int i = 2 % 2;
        String strM30607 = m30607();
        StringBuilder sb = new StringBuilder();
        sb.append(strM30607);
        sb.append(this.f29553);
        sb.append(m30609("\u0000", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, 1 - (Process.myTid() >> 22), 204 - TextUtils.getOffsetAfter("", 0)).intern());
        sb.append(this.f29556);
        sb.append(m30609("\u0000", View.resolveSize(0, 0) + 1, false, TextUtils.getOffsetAfter("", 0) + 1, TextUtils.getOffsetAfter("", 0) + 203).intern());
        sb.append(m30609("\b\ufffe\ufffb", (ViewConfiguration.getLongPressTimeout() >> 16) + 3, false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, 259 - View.resolveSizeAndState(0, 0, 0)).intern());
        sb.append(m30609("\u0000", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 1 - Color.green(0), 204 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
        sb.append(this.f29554);
        sb.append(m30609("\u0000", Color.red(0) + 1, false, AndroidCharacter.getMirror('0') - '/', (KeyEvent.getMaxKeyCode() >> 16) + 203).intern());
        sb.append(this.f29555);
        String string = sb.toString();
        int i2 = f29550 + 7;
        f29551 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    protected final String m30613(String str) {
        int i = 2 % 2;
        String strM30607 = m30607();
        StringBuilder sb = new StringBuilder();
        sb.append(strM30607);
        sb.append(m30611());
        sb.append(m30609("\u0000", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, Color.rgb(0, 0, 0) + 16777217, AndroidCharacter.getMirror('0') + 156).intern());
        sb.append(m30609("\b\ufffe\ufffb", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, false, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, 259 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        sb.append(m30609("\u0000", TextUtils.getTrimmedLength("") + 1, true, 1 - View.resolveSizeAndState(0, 0, 0), 204 - Color.blue(0)).intern());
        sb.append(str);
        sb.append(m30609("\u0000", -ImageFormat.getBitsPerPixel(0), true, 1 - (ViewConfiguration.getEdgeSlop() >> 16), 203 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
        sb.append(m30608());
        sb.append(m30609("\u0000", -((byte) KeyEvent.getModifierMetaStateMask()), false, 1 - ExpandableListView.getPackedPositionGroup(0L), 203 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        sb.append(m30609("\b\ufffe\ufffb", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, false, 2 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 259 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
        sb.append(m30609("\u0000", KeyEvent.getDeadChar(0, 0) + 1, false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, Color.rgb(0, 0, 0) + 16777419).intern());
        sb.append(m30615());
        sb.append(m30609("\u0000", 1 - Color.alpha(0), false, Color.blue(0) + 1, (ViewConfiguration.getTouchSlop() >> 8) + 203).intern());
        sb.append(m30605());
        String string = sb.toString();
        int i2 = f29550 + 47;
        f29551 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m30610() {
        int i = 2 % 2;
        int i2 = f29551 + 69;
        f29550 = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = mo30612().replace(m30609("\u0000", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 1 - TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 205).intern(), m30609("\u0000", KeyEvent.keyCodeFromString("") + 1, false, 1 - KeyEvent.keyCodeFromString(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 203).intern());
        int i4 = f29550 + 63;
        f29551 = i4 % 128;
        if (i4 % 2 != 0) {
            return strReplace;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    private String m30607() {
        String strIntern;
        String strM30606;
        int i = 2 % 2;
        int i2 = f29550 + 83;
        f29551 = i2 % 128;
        if (i2 % 2 == 0) {
            strIntern = m30609("ￌ\uffff\u0001\u0002\u0011\f\n\u0002\u000f", 16777225 >> Color.rgb(1, 1, 0), false, 13 << (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)), 15403 % TextUtils.indexOf("", "", 0)).intern();
            strM30606 = m30606();
            if (!this.f29557) {
                return strIntern;
            }
        } else {
            strIntern = m30609("ￌ\uffff\u0001\u0002\u0011\f\n\u0002\u000f", Color.rgb(0, 0, 0) + 16777225, true, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 256).intern();
            strM30606 = m30606();
            if (this.f29557) {
            }
            return strIntern;
        }
        int i3 = f29550 + 111;
        f29551 = i3 % 128;
        int i4 = i3 % 2;
        if (!TextUtils.isEmpty(strM30606)) {
            StringBuilder sb = new StringBuilder();
            sb.append(strIntern);
            sb.append(m30609("\u0007\uffd1\u0018\u0010", '4' - AndroidCharacter.getMirror('0'), true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 250 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            sb.append(strM30606);
            sb.append(m30609("\u0000", TextUtils.indexOf("", "", 0) + 1, true, 1 - (ViewConfiguration.getScrollBarSize() >> 8), (Process.myTid() >> 22) + 204).intern());
            return sb.toString();
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb$c */
    public static class c extends C12053jb {

        /* JADX INFO: renamed from: ﻐ */
        private static char f29561 = 59681;

        /* JADX INFO: renamed from: ﻛ */
        private static char f29562 = 32118;

        /* JADX INFO: renamed from: ﾇ */
        private static char f29563 = 53529;

        /* JADX INFO: renamed from: ﾒ */
        private static char f29564 = 57083;

        public c(String str, String str2) {
            super(str, m30617("嬪盉ﹹↈ", 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), str2, m30617("䜂ᏸﱊ\udca3Ẏ뀛ቫ㩎", 8 - (Process.myPid() >> 22)).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m30617(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C12078k.f29776) {
                char[] cArr2 = new char[cArr.length];
                C12078k.f29775 = 0;
                char[] cArr3 = new char[2];
                while (C12078k.f29775 < cArr.length) {
                    cArr3[0] = cArr[C12078k.f29775];
                    cArr3[1] = cArr[C12078k.f29775 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29563)) ^ ((c2 >>> 5) + f29562)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29561) ^ ((c3 + i2) ^ ((c3 << 4) + f29564))));
                        i2 -= 40503;
                    }
                    cArr2[C12078k.f29775] = cArr3[0];
                    cArr2[C12078k.f29775 + 1] = cArr3[1];
                    C12078k.f29775 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb$d */
    public static class d extends c {

        /* JADX INFO: renamed from: ﾇ */
        private final String f29565;

        public d(String str, String str2, String str3) {
            super(str, str2);
            this.f29565 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.C12053jb
        /* JADX INFO: renamed from: ｋ */
        public final String mo30612() {
            return m30613(this.f29565);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb$a */
    public static class a extends C12053jb {

        /* JADX INFO: renamed from: ｋ */
        private static int f29558 = 0;

        /* JADX INFO: renamed from: ﾇ */
        private static char f29559 = 0;

        /* JADX INFO: renamed from: ﾒ */
        private static long f29560 = -4188652982131725294L;

        public a(String str, String str2) {
            super(str, m30616("嫰楔塀⇣", (char) (32413 - (ViewConfiguration.getEdgeSlop() >> 16)), "氒₨\uea4e엞", TextUtils.indexOf("", ""), "。꽻鵹\ue77e").intern(), str2, m30616("⪽遱揍峢⏳皾笽畎", (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), "氒₨\uea4e엞", Gravity.getAbsoluteGravity(0, 0), "䏳뿐ᨺ◩").intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m30616(String str, char c, String str2, int i, String str3) {
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
                    cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f29560) ^ ((long) f29558)) ^ ((long) f29559));
                    C12051j.f29511++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jb$e */
    public static class e extends a {

        /* JADX INFO: renamed from: ﾇ */
        private final String f29566;

        public e(String str, String str2, String str3) {
            super(str, str2);
            this.f29566 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.C12053jb
        /* JADX INFO: renamed from: ｋ */
        public final String mo30612() {
            return m30613(this.f29566);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30609(String str, int i, boolean z, int i2, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11889d.f28479) {
            char[] cArr2 = new char[i];
            C11889d.f28481 = 0;
            while (C11889d.f28481 < i) {
                C11889d.f28480 = cArr[C11889d.f28481];
                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                int i4 = C11889d.f28481;
                cArr2[i4] = (char) (cArr2[i4] - f29552);
                C11889d.f28481++;
            }
            if (i2 > 0) {
                C11889d.f28478 = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
            }
            if (z) {
                char[] cArr4 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                    C11889d.f28481++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
