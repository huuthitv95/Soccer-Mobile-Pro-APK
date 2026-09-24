package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq */
/* JADX INFO: loaded from: classes6.dex */
public class C11879cq {

    /* JADX INFO: renamed from: ﻐ */
    private List<String> f28330;

    /* JADX INFO: renamed from: ｋ */
    private int f28331;

    /* JADX INFO: renamed from: ﾇ */
    private C11876cn f28332;

    /* JADX INFO: renamed from: ﾒ */
    private C12020hw.c f28333;

    /* JADX INFO: renamed from: ﾒ */
    public final C12020hw m29751(InterfaceC12021hx interfaceC12021hx) {
        return this.f28333.m30391(interfaceC12021hx, this.f28330, this.f28331);
    }

    /* JADX INFO: renamed from: ﻛ */
    public final C11876cn m29750() {
        return this.f28332;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$d */
    public static class d extends C11886cx implements InterfaceC11870ch {

        /* JADX INFO: renamed from: ﱡ */
        private static int f28336 = 1;

        /* JADX INFO: renamed from: ﻏ */
        private static int f28337 = 0;

        /* JADX INFO: renamed from: ﻛ */
        private static int f28338 = 0;

        /* JADX INFO: renamed from: ｋ */
        private static char f28339 = 9394;

        /* JADX INFO: renamed from: ﾒ */
        private static long f28340;

        /* JADX INFO: renamed from: ﻐ */
        private C11879cq f28341;

        /* JADX INFO: renamed from: ﾇ */
        private C11876cn.a f28342;

        /* JADX INFO: renamed from: ﱟ */
        private static char[] f28335 = {'s', 25125, 50420, 9869, 35177, 60206, 19908, 44965, 4720, 29748, 55016, 14470, 39791, 64818, 24535, 49573, 9313, 34347, 59602, 19109, 44390, 3877, 29170, 54181, 13934, 38947, 64229, 23731, 's', 25125, 50420, 9869, 35177, 60206, 19908, 44965, 4720, 29748, 55016, 14470, 39791, 64818, 24525, 49569, 9328, 34355, 19339, 10717, 36620, 28011, 49821, 41177, 1546, 58459, 22928, 16369, 40214, 29557, 53401, 46792, 5131, 50266, 42508, 221, 58020, 19776, 12039, 35309, 27532, 54873, 45085, 4801, 64687, 24390, 14619, 39914, 1414, 57413, 16901, 11468, 36490, 26973, 51968, 46534, 6023, 62042, 's', 25125, 50420, 9875, 35173, 60193, 19954, 44963, 4712, 29705, 55022, 14467, 39791, 64812, 24556, 49573, 9315, 34356, 59625, 19119, 44398, 3891, 61052, 35882, 11003, 51330, 26470, 1313, 41931, 16810, 64639, 39483, 14567, 54921, 30048, 4925, 45518, 12221, 51837, 26670, 1782, 42172, 17129, 8383, 34414, 25625, 52219, 43449, 3954, 60735, 20699, 14006, 38006, 31253, 55800, 49072, 7551, 33593, 26350, 50345, 37796, 61950, 22284, 46462, 6846, 30948, 56874, 15459, 33196, 59375, 17697, 43880, 2187, 28415, 52258, 21088, 'i', 25134, 50419, 9908, 35169, 60206, 19939, 44965, 4687, 29734, 'c', 25141, 50419, 9908, 35183, 60205, 19907, 44968, 4709, 29731, 55019, 14477, 39781, 64820, 24552, 49583, 9316, 42837, 50434, 25566, 33179, 11859};

        /* JADX INFO: renamed from: ﮐ */
        private static long f28334 = -444198717316242880L;

        public d(List<String> list, int i) {
            C11879cq c11879cq = new C11879cq();
            this.f28341 = c11879cq;
            c11879cq.f28333 = new C12020hw.c();
            this.f28341.f28330 = list;
            this.f28341.f28331 = i;
            this.f28342 = new C11876cn.a();
        }

        /* JADX INFO: renamed from: ﻐ */
        private C11879cq m29752() {
            int i = 2 % 2;
            int i2 = f28337 + 63;
            f28336 = i2 % 128;
            int i3 = i2 % 2;
            this.f28341.f28332 = this.f28342.m29617();
            C11879cq c11879cq = this.f28341;
            int i4 = f28336 + 57;
            f28337 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return c11879cq;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
            byte b;
            int i = 2 % 2;
            switch (str.hashCode()) {
                case -1930334554:
                    b = !str.equals(m29753(45 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (19449 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 15 - View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case -1826216039:
                    b = !str.equals(m29754("惟곟뇒띺ﯧ殉ᄘ౻퀅ꁵ", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", View.MeasureSpec.makeMeasureSpec(0, 0), "駆絑帷蛡").intern()) ? (byte) -1 : Ascii.f22500SO;
                    break;
                case -994397843:
                    b = !str.equals(m29753(28 - View.resolveSizeAndState(0, 0, 0), (char) TextUtils.getOffsetAfter("", 0), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 6;
                    break;
                case -941967812:
                    b = !str.equals(m29754("討㧧狰㷸뙠輁郠正狀풯䭿யൻ럑棧ʞԠ珪", (char) (44655 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "ྙ쳑漕澮").intern()) ? (byte) -1 : (byte) 3;
                    break;
                case -770599694:
                    if (!str.equals(m29754("︪Ꮜ昍洢л☢矏\ue2d6됀尕\u1cfc༙ꄫ䠡ᤇဇ검挕奌", (char) (ImageFormat.getBitsPerPixel(0) + 27282), "\u0000\u0000\u0000\u0000", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 2143483745, "ꀏ㴈醀ࡪ").intern())) {
                        b = -1;
                    } else {
                        int i2 = f28337 + 61;
                        f28336 = i2 % 128;
                        int i3 = i2 % 2;
                        b = 0;
                    }
                    break;
                case -235079533:
                    if (!str.equals(m29753(176 - AndroidCharacter.getMirror('0'), (char) (17050 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), AndroidCharacter.getMirror('0') - 30).intern())) {
                        b = -1;
                    } else {
                        int i4 = f28336 + 83;
                        f28337 = i4 % 128;
                        int i5 = i4 % 2;
                        b = Ascii.f22492FF;
                    }
                    break;
                case -213689933:
                    b = !str.equals(m29754("㦾鲍㒠攙䃵옢㡷躽ᧆΨ孶\ue6fdώ푛ꍃ鎡灍쉍娻쌄揶뭖멨", (char) (ViewConfiguration.getTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", Color.argb(0, 0, 0, 0) + 1844207268, "ꐹ\uec5e፭\ud9bf").intern()) ? (byte) -1 : (byte) 5;
                    break;
                case 46561673:
                    b = !str.equals(m29754("ቻ◫⃪岟쾱栜部奿웋뭝ﷇޏ䓇턺埠總ꕱ", (char) (21841 - Color.blue(0)), "\u0000\u0000\u0000\u0000", Color.argb(0, 0, 0, 0) + 588975164, "㱸ᬌ儣硕").intern()) ? (byte) -1 : Ascii.f22503VT;
                    break;
                case 94094958:
                    b = !str.equals(m29753(189 - View.MeasureSpec.getSize(0), (char) (42807 - TextUtils.indexOf("", "", 0)), View.resolveSize(0, 0) + 5).intern()) ? (byte) -1 : (byte) 17;
                    break;
                case 841006591:
                    b = !str.equals(m29753(61 - View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50217), KeyEvent.normalizeMetaState(0) + 25).intern()) ? (byte) -1 : (byte) 8;
                    break;
                case 902024524:
                    if (!str.equals(m29753(View.combineMeasuredStates(0, 0) + 162, (char) (ViewConfiguration.getScrollBarSize() >> 8), Color.argb(0, 0, 0, 0) + 10).intern())) {
                        b = -1;
                    } else {
                        int i6 = f28337 + 97;
                        int i7 = i6 % 128;
                        f28336 = i7;
                        int i8 = i6 % 2;
                        int i9 = i7 + 101;
                        f28337 = i9 % 128;
                        int i10 = i9 % 2;
                        b = 15;
                    }
                    break;
                case 923334616:
                    b = !str.equals(m29753((KeyEvent.getMaxKeyCode() >> 16) + 172, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()) ? (byte) -1 : (byte) 16;
                    break;
                case 1080975014:
                    if (!str.equals(m29753(86 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22).intern())) {
                        b = -1;
                    } else {
                        int i11 = f28336 + 73;
                        f28337 = i11 % 128;
                        int i12 = i11 % 2;
                        b = 9;
                    }
                    break;
                case 1083215325:
                    if (!str.equals(m29753(Color.argb(0, 0, 0, 0) + 146, (char) (37837 - KeyEvent.keyCodeFromString("")), (-16777200) - Color.rgb(0, 0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i13 = f28336 + 99;
                        f28337 = i13 % 128;
                        int i14 = i13 % 2;
                        b = 13;
                    }
                    break;
                case 1202614773:
                    if (!str.equals(m29754("艛ࡈ⭳攅㍦\ued79籤\ud7c9څ쳭䞜∞븉總ҿ᭑쾽⫷䟻껺䒆", (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0000\u0000\u0000\u0000", 468841437 - ExpandableListView.getPackedPositionType(0L), "\udd5b\uf1f3焛\ueaee").intern())) {
                        b = -1;
                    } else {
                        int i15 = f28336 + 13;
                        f28337 = i15 % 128;
                        int i16 = i15 % 2;
                        b = 2;
                    }
                    break;
                case 1689765750:
                    b = !str.equals(m29753(TextUtils.lastIndexOf("", '0', 0) + 1, (char) View.combineMeasuredStates(0, 0), 27 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? (byte) -1 : (byte) 4;
                    break;
                case 1766229249:
                    b = str.equals(m29754("봽뼮뱁貜\uf245橴ᩯ\ue8b8㩄\uf445㭽Ქ끎咬₄\uf184篧푴彂㢆䘛椖叚肿ꁘ趾", (char) (37119 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", (-1) - Process.getGidForName(""), "䴤\uddccＧﺐ").intern()) ? (byte) 1 : (byte) -1;
                    break;
                case 1833576080:
                    b = !str.equals(m29753(109 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 60943), (ViewConfiguration.getLongPressTimeout() >> 16) + 20).intern()) ? (byte) -1 : (byte) 10;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    this.f28341.f28333.m30384(((Integer) m29851(list, 0, Integer.class)).intValue());
                    return this;
                case 1:
                    this.f28341.f28333.m30394(((Integer) m29851(list, 0, Integer.class)).intValue());
                    return this;
                case 2:
                    this.f28341.f28333.m30390(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 3:
                    this.f28341.f28333.m30386(((Integer) m29851(list, 0, Integer.class)).intValue());
                    return this;
                case 4:
                    this.f28341.f28333.m30389(((Integer) m29851(list, 0, Integer.class)).intValue());
                    return this;
                case 5:
                    this.f28341.f28333.m30395(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 6:
                    this.f28341.f28333.m30392(((Integer) m29851(list, 0, Integer.class)).intValue());
                    return this;
                case 7:
                    this.f28341.f28333.m30385(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 8:
                    this.f28341.f28333.m30382(((Integer) m29851(list, 0, Integer.class)).intValue());
                    return this;
                case 9:
                    this.f28341.f28333.m30388(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 10:
                    this.f28341.f28333.m30381(((Integer) m29851(list, 0, Integer.class)).intValue());
                    return this;
                case 11:
                    this.f28341.f28333.m30393(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 12:
                    this.f28341.f28333.m30383(((Boolean) m29851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 13:
                    this.f28342.m29616((Class) m29851(list, 0, Class.class));
                    return this;
                case 14:
                    this.f28342.m29613((Class) m29851(list, 0, Class.class));
                    return this;
                case 15:
                    this.f28342.m29614((Class) m29851(list, 0, Class.class));
                    return this;
                case 16:
                    C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
                    this.f28342.m29615(c11906dq);
                    this.f28341.f28333.m30387(c11906dq);
                    return this;
                case 17:
                    return m29752();
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m29754(String str, char c, String str2, int i, String str3) {
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
                    cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28340) ^ ((long) f28338)) ^ ((long) f28339));
                    C12051j.f29511++;
                }
                str4 = new String(cArr6);
            }
            return str4;
        }

        /* JADX INFO: renamed from: ﻛ */
        private static String m29753(int i, char c, int i2) {
            String str;
            synchronized (C11862c.f28047) {
                char[] cArr = new char[i2];
                C11862c.f28048 = 0;
                while (C11862c.f28048 < i2) {
                    cArr[C11862c.f28048] = (char) ((((long) f28335[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28334)) ^ ((long) c));
                    C11862c.f28048++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }
}
