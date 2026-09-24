package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdFormat;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdState;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bq */
/* JADX INFO: loaded from: classes6.dex */
public final class C11852bq extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27802 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27805 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f27806 = {4862, 17492, 49092, 4434, 18669, 41541, 'F', 22252, 44412, 1002, 23125, 45309, 1885, 24012, 46150, 2763, 24923, 47056, 60508, 47862, 16742, 61424, 46671, 23783, 60231, 45516, 22593, 59075, 36167, 23488, 57962, 35002, 22309, 64958, 33855, 21179, 'F', 22252, 44412, 1002, 23125, 45309, 1880, 24012, 46170, 2752, 24915, 47043, 49644, 38726, 27862, 49728, 39935, 29015, 50941, 40039, 30198, 52066, 41194, 30331, 53239, 42248, 31369, 371, 22489, 44105, 735, 23392, 45512, 1639, 23807, 46446, 3052, 24674, 46828, 3948, 25990, 6756, 19662, 46942, 6600, 16503, 43743, 7535, 18421, 44651, 4347, 31605, 50474, 37760, 26640, 50822, 40761, 30097, 49700, 39078, 28961, 53174, 42011, 29357, 52021, 41411, 32350, 54507, 44373, 31690, 53314, 44758, 1894, 56800, 43632, 41760, 62848, 3626, 41101, 63745, 5009, 41993, 65195, 5949, 43445, 'F', 22252, 44412, 1002, 23125, 45309, 1879, 24013, 46172, 2760, 24896, 47044, 3656, 25768, 47922, 4514, 26673, 48825, 5407, 27561, 49665, 6279, 28442, 50623, 7185, 29326, 51702, 8290, 30434, 52596, 9188, 'F', 22252, 44412, 1002, 23125, 45309, 1864, 24010, 46156, 2760, 24925, 47077, 3673, 25782, 47911, 4537, 26676, 48784, 5420, 27578, 49674, 6301, 28450, 50586, 7179, 29321, 51687, 8297, 30441, 52579, 'g', 22240, 44414, 974, 23140, 45289, 1879, 24007, 46190, 2783, 24925, 47066, 3709, 25765, 47877, 4516, 26686, 48819, 5427, 27576, 41914, 62781, 3747, 40980, 63904, 4914, 42150, 65087, 6033, 43321, 49793, 5150, 44420, 51054, 6397, 45687, 52206, 7533, 46790, 51302, 25065, 47957, 52417, 26191, 49096, 53573, 27179, 33727, 54563, 'g', 22240, 44414, 969, 23165, 45295, 1915, 24034, 46156, 2814, 24923, 47065, 3675, 25773, 47907, 4543, 26687, 48827, 'g', 22240, 44414, 969, 23165, 45295, 1915, 24034, 46156, 2798, 24903, 47044, 3656, 25774, 47915, 4487, 26673, 48812, 5429, 27562, 49680, 6312, 28426, 50565, 7197, 29327, 51702, 8302, 30463, 52596, 9188, 31317, 53441, 10056, 32207, 57917, 46254, 20272, 57741, 47157, 21174, 58676, 49057, 22031, 59536, 33544, 21916, 60444, 34538, 22906, 's', 22240, 44414, 985, 23165, 45308, 1897, 24038, 46174, 2760, 24924, 47043, 3696, 25768, 47925, 4543, 26677, 48827, 5439, 27565};

    /* JADX INFO: renamed from: ｋ */
    private static long f27804 = -7166554482910865787L;

    /* JADX INFO: renamed from: ﻛ */
    private static int[] f27803 = {1786013423, -42854362, -2069444021, 1324350908, 1355291274, 1876546483, -663128695, 752422754, -170267966, 275222560, -1200065772, 1486480196, 1375327824, 60475593, -2068331894, -1405563547, -1883283543, -220175885};

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ FiveAd m29086() {
        int i = 2 % 2;
        int i2 = f27805 + 71;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        FiveAd fiveAdM29083 = m29083();
        int i4 = f27805 + 83;
        f27802 = i4 % 128;
        int i5 = i4 % 2;
        return fiveAdM29083;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ CreativeType m29089(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27805 + 11;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        CreativeType creativeTypeM29082 = m29082(fiveAdInterface);
        int i4 = f27802 + 13;
        f27805 = i4 % 128;
        if (i4 % 2 != 0) {
            return creativeTypeM29082;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29091(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i = 2 % 2;
        int i2 = f27802 + 59;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        m29102(fiveAdInterface, fiveAdLoadListener);
        int i4 = f27802 + 107;
        f27805 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29093(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27805 + 43;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        String strM29085 = m29085(fiveAdInterface);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return strM29085;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m29094(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i = 2 % 2;
        int i2 = f27802 + 73;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        m29105(fiveAdInterface, fiveAdListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f27802 + 105;
        f27805 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m29095(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = 2 % 2;
        int i2 = f27802 + 65;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        m29092(fiveAdInterface, fiveAdViewEventListener);
        int i4 = f27805 + 113;
        f27802 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ FiveAdListener m29096(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27805 + 1;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        FiveAdListener fiveAdListenerM29087 = m29087(fiveAdInterface);
        int i4 = f27805 + 41;
        f27802 = i4 % 128;
        if (i4 % 2 == 0) {
            return fiveAdListenerM29087;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29098(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = 2 % 2;
        int i2 = f27802 + 19;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        String strM29103 = m29103(fiveAdCustomLayout);
        int i4 = f27805 + 27;
        f27802 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM29103;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m29100(FiveAdConfig fiveAdConfig) {
        int i = 2 % 2;
        int i2 = f27805 + 49;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        String strM29090 = m29090(fiveAdConfig);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = f27802 + 83;
        f27805 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return strM29090;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m29101(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27805 + 57;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        String strM29084 = m29084(fiveAdInterface);
        int i4 = f27802 + 101;
        f27805 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM29084;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29104(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27802 + 93;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        String strM29088 = m29088(fiveAdInterface);
        int i4 = f27802 + 83;
        f27805 = i4 % 128;
        int i5 = i4 % 2;
        return strM29088;
    }

    public C11852bq(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27802 + 25;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        int i4 = f27802 + 91;
        f27805 = i4 % 128;
        int i5 = i4 % 2;
        return sdkSemanticVersion;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:15:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x0116  */
    /* JADX WARN: Code duplicated, block: B:34:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x013c  */
    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0162  */
    /* JADX WARN: Code duplicated, block: B:40:0x016f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0189  */
    /* JADX WARN: Code duplicated, block: B:44:0x0196  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01de  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x020c  */
    /* JADX WARN: Code duplicated, block: B:56:0x022c  */
    /* JADX WARN: Code duplicated, block: B:59:0x023a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0257  */
    /* JADX WARN: Code duplicated, block: B:62:0x025b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0282  */
    /* JADX WARN: Code duplicated, block: B:65:0x0284  */
    /* JADX WARN: Code duplicated, block: B:67:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d8  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = f27805 + 61;
        f27802 = i5 % 128;
        byte b = 5;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
            switch (str.hashCode()) {
                case -1836618638:
                    if (str.equals(m29097((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 110, (char) (41825 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22490CR;
                    }
                    break;
                case -1782131271:
                    if (str.equals(m29097(152 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getScrollBarSize() >> 8) + 30).intern())) {
                        b = -1;
                    } else {
                        int i7 = f27805 + 81;
                        f27802 = i7 % 128;
                        int i8 = i7 % 2;
                        b = 16;
                    }
                    break;
                case -962125644:
                    if (str.equals(m29097(88 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (50540 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case -939888073:
                    if (str.equals(m29097(5 - Process.getGidForName(""), (char) TextUtils.getOffsetAfter("", 0), 11 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -853874964:
                    if (str.equals(m29097(35 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i = f27805 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                        f27802 = i % 128;
                        if (i % 2 != 0) {
                            b = 4;
                        }
                    }
                    break;
                case -735613671:
                    if (!str.equals(m29099(new int[]{-1427076250, -386376448, 587362, -977505868, 33877258, 396990586, 304180617, -1926121516, -1270128390, -1324750644, -391866196, 1445584640, -546640075, 884070166}, 27 - Color.argb(0, 0, 0, 0)).intern())) {
                        int i9 = f27805 + 29;
                        f27802 = i9 % 128;
                        int i10 = i9 % 2;
                        b = Ascii.f22500SO;
                    } else {
                        b = -1;
                    }
                    break;
                case -624329424:
                    if (str.equals(m29097((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, (char) (Color.rgb(0, 0, 0) + 16837658), (ViewConfiguration.getEdgeSlop() >> 16) + 18).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -295916403:
                    if (str.equals(m29097(169 - AndroidCharacter.getMirror('0'), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 31 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22499SI;
                    }
                    break;
                case -189625759:
                    if (str.equals(m29099(new int[]{1565618753, -53902190, 923445180, 1746809228, 1041603412, 1164107694, 2131459490, 273564132, -317649201, 1265089816}, View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern())) {
                        int i11 = f27802 + 113;
                        f27805 = i11 % 128;
                        int i12 = i11 % 2;
                        b = 7;
                    } else {
                        b = -1;
                    }
                    break;
                case -6611420:
                    if (str.equals(m29097(48 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((-16727638) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 16).intern())) {
                        b = -1;
                    } else {
                        int i13 = f27805 + 93;
                        f27802 = i13 % 128;
                        int i14 = i13 % 2;
                        b = 6;
                    }
                    break;
                case 636996201:
                    if (str.equals(m29097(63 - View.resolveSize(0, 0), (char) (310 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 13 - Process.getGidForName("")).intern())) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 890103511:
                    if (str.equals(m29099(new int[]{-1427076250, -386376448, 587362, -977505868, 33877258, 396990586, 304180617, -1926121516, 2100037302, -613801216, -1449167430, -1405381105, -1945798213, -133011864, -1590863431, -742857141, 546338863, -146203121}, 35 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1252059573:
                    if (str.equals(m29099(new int[]{1565618753, -53902190, 1067125766, 857625251, 493313872, -1252752964, 51766908, 447556156, -213354174, -1830256257}, ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern())) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1508614908:
                    if (str.equals(m29097(77 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.lastIndexOf("", '0') + 6691), 11 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i2 = f27802 + 35;
                        f27805 = i2 % 128;
                        if (i2 % 2 == 0) {
                            b = 10;
                        } else {
                            b = 41;
                        }
                    }
                    break;
                case 1835584239:
                    if (str.equals(m29099(new int[]{1565618753, -53902190, -1092928763, -1272483801, 1139911351, 1920433629, -72981900, -1324072689, -672335788, -1318834198}, 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 1942443945:
                    if (str.equals(m29099(new int[]{-242686320, 699437812, 1022053296, 1767458194, 754177729, -694846926}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12).intern())) {
                        b = -1;
                    } else {
                        i3 = f27805 + 97;
                        f27802 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b = 1;
                        } else {
                            b = 0;
                        }
                    }
                    break;
                case 2104624789:
                    if (str.equals(m29097(ExpandableListView.getPackedPositionChild(0L) + 1, (char) (4792 - TextUtils.getOffsetAfter("", 0)), 6 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -1836618638:
                    if (str.equals(m29097((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 110, (char) (41825 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22490CR;
                    }
                    break;
                case -1782131271:
                    if (str.equals(m29097(152 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getScrollBarSize() >> 8) + 30).intern())) {
                        b = -1;
                    } else {
                        int i15 = f27805 + 81;
                        f27802 = i15 % 128;
                        int i16 = i15 % 2;
                        b = 16;
                    }
                    break;
                case -962125644:
                    if (str.equals(m29097(88 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (50540 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case -939888073:
                    if (str.equals(m29097(5 - Process.getGidForName(""), (char) TextUtils.getOffsetAfter("", 0), 11 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -853874964:
                    if (str.equals(m29097(35 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i = f27805 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                        f27802 = i % 128;
                        if (i % 2 != 0) {
                            b = 4;
                        }
                    }
                    break;
                case -735613671:
                    if (!str.equals(m29099(new int[]{-1427076250, -386376448, 587362, -977505868, 33877258, 396990586, 304180617, -1926121516, -1270128390, -1324750644, -391866196, 1445584640, -546640075, 884070166}, 27 - Color.argb(0, 0, 0, 0)).intern())) {
                        int i17 = f27805 + 29;
                        f27802 = i17 % 128;
                        int i18 = i17 % 2;
                        b = Ascii.f22500SO;
                    } else {
                        b = -1;
                    }
                    break;
                case -624329424:
                    if (str.equals(m29097((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, (char) (Color.rgb(0, 0, 0) + 16837658), (ViewConfiguration.getEdgeSlop() >> 16) + 18).intern())) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -295916403:
                    if (str.equals(m29097(169 - AndroidCharacter.getMirror('0'), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 31 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22499SI;
                    }
                    break;
                case -189625759:
                    if (str.equals(m29099(new int[]{1565618753, -53902190, 923445180, 1746809228, 1041603412, 1164107694, 2131459490, 273564132, -317649201, 1265089816}, View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern())) {
                        b = -1;
                    } else {
                        int i19 = f27802 + 113;
                        f27805 = i19 % 128;
                        int i110 = i19 % 2;
                        b = 7;
                    }
                    break;
                case -6611420:
                    if (str.equals(m29097(48 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((-16727638) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 16).intern())) {
                        b = -1;
                    } else {
                        int i111 = f27805 + 93;
                        f27802 = i111 % 128;
                        int i112 = i111 % 2;
                        b = 6;
                    }
                    break;
                case 636996201:
                    if (str.equals(m29097(63 - View.resolveSize(0, 0), (char) (310 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 13 - Process.getGidForName("")).intern())) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 890103511:
                    if (str.equals(m29099(new int[]{-1427076250, -386376448, 587362, -977505868, 33877258, 396990586, 304180617, -1926121516, 2100037302, -613801216, -1449167430, -1405381105, -1945798213, -133011864, -1590863431, -742857141, 546338863, -146203121}, 35 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 1252059573:
                    if (str.equals(m29099(new int[]{1565618753, -53902190, 1067125766, 857625251, 493313872, -1252752964, 51766908, 447556156, -213354174, -1830256257}, ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern())) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1508614908:
                    if (str.equals(m29097(77 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.lastIndexOf("", '0') + 6691), 11 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i2 = f27802 + 35;
                        f27805 = i2 % 128;
                        if (i2 % 2 == 0) {
                            b = 10;
                        } else {
                            b = 41;
                        }
                    }
                    break;
                case 1835584239:
                    if (str.equals(m29099(new int[]{1565618753, -53902190, -1092928763, -1272483801, 1139911351, 1920433629, -72981900, -1324072689, -672335788, -1318834198}, 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 1942443945:
                    if (str.equals(m29099(new int[]{-242686320, 699437812, 1022053296, 1767458194, 754177729, -694846926}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12).intern())) {
                        b = -1;
                    } else {
                        i3 = f27805 + 97;
                        f27802 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b = 1;
                        } else {
                            b = 0;
                        }
                    }
                    break;
                case 2104624789:
                    if (str.equals(m29097(ExpandableListView.getPackedPositionChild(0L) + 1, (char) (4792 - TextUtils.getOffsetAfter("", 0)), 6 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        }
        switch (b) {
            case 0:
                return FiveAd.class;
            case 1:
                return CreativeType.class;
            case 2:
                return FiveAdConfig.class;
            case 3:
            case 4:
                return FiveAdCustomLayout.class;
            case 5:
                return FiveAdFormat.class;
            case 6:
                int i20 = f27802 + 41;
                f27805 = i20 % 128;
                if (i20 % 2 != 0) {
                    return FiveAdInterface.class;
                }
                throw null;
            case 7:
                return FiveAdInterstitial.class;
            case 8:
                return FiveAdListener.class;
            case 9:
                return FiveAdVideoReward.class;
            case 10:
                return FiveAdState.class;
            case 11:
                return FiveAdLoadListener.class;
            case 12:
                return FiveAdViewEventListener.class;
            case 13:
            case 14:
                return AdActivity.class;
            case 15:
                return FiveAdInterstitialEventListener.class;
            case 16:
                return FiveAdVideoRewardEventListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29097(ExpandableListView.getPackedPositionGroup(0L) + 182, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) + 20).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29100((FiveAdConfig) list.get(0));
            }
        });
        map.put(m29099(new int[]{-1066249484, 225750856, -539741880, 1739155335, -262125317, 1680423966, -1614592082, 55373843, -691176847, -576031149, -799108170, 85931847}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29093((FiveAdInterface) list.get(0));
            }
        });
        map.put(m29099(new int[]{-1066249484, 225750856, -539741880, 1739155335, -262125317, 1680423966, -1614592082, 55373843, 1364777156, 1032928124, -829152329, 162789591}, View.resolveSize(0, 0) + 21).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29104((FiveAdInterface) list.get(0));
            }
        });
        map.put(m29099(new int[]{-1066249484, 225750856, -539741880, 1739155335, -262125317, 1680423966, -1614592082, 55373843, -91535379, 1452612356, -534306828, -1916711991, 189219007, -511727504, -119323485, 1713068094}, 30 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29089((FiveAdInterface) list.get(0));
            }
        });
        map.put(m29097((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 201, (char) (View.getDefaultSize(0, 0) + 41949), 28 - MotionEvent.axisFromString("")).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29101((FiveAdInterface) list.get(0));
            }
        });
        map.put(m29099(new int[]{-1066249484, 225750856, -539741880, 1739155335, -262125317, 1680423966, -1614592082, 55373843, 2100759219, 615380999, -72981900, -1324072689, -672335788, -1318834198}, 26 - (Process.myPid() >> 22)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29096((FiveAdInterface) list.get(0));
            }
        });
        map.put(m29099(new int[]{-1017582091, -327075815, -539741880, 1739155335, -262125317, 1680423966, -1614592082, 55373843, 2100759219, 615380999, -72981900, -1324072689, -672335788, -1318834198}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11852bq.m29094((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m29097((KeyEvent.getMaxKeyCode() >> 16) + 231, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29086();
            }
        });
        map.put(m29097((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 249, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.rgb(0, 0, 0) + 16777251).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.13
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11852bq.m29098((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m29097(284 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (57982 - AndroidCharacter.getMirror('0')), 15 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11852bq.m29091((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m29097(299 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 20).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11852bq.m29095((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        int i2 = f27805 + 35;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29090(FiveAdConfig fiveAdConfig) {
        int i = 2 % 2;
        int i2 = f27805 + 91;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        String str = fiveAdConfig.appId;
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f27805 + 57;
        f27802 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﱡ */
    private static String m29085(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27805 + 11;
        f27802 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            fiveAdInterface.getSlotId();
            throw null;
        }
        String slotId = fiveAdInterface.getSlotId();
        int i3 = f27802 + 51;
        f27805 = i3 % 128;
        if (i3 % 2 != 0) {
            return slotId;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ */
    private static String m29088(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27805 + 83;
        f27802 = i2 % 128;
        if (i2 % 2 != 0) {
            fiveAdInterface.getFiveAdTag();
            throw null;
        }
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i3 = f27802 + 55;
        f27805 = i3 % 128;
        int i4 = i3 % 2;
        return fiveAdTag;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static CreativeType m29082(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27802 + 105;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i4 = f27805 + 97;
        f27802 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return creativeType;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static String m29084(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27805 + 71;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        String adParameter = fiveAdInterface.getAdParameter();
        int i4 = f27805 + 97;
        f27802 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return adParameter;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static FiveAdListener m29087(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f27802 + 77;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        FiveAdListener listener = fiveAdInterface.getListener();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        int i5 = f27805 + 33;
        f27802 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return listener;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m29105(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i = 2 % 2;
        int i2 = f27805 + 79;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setListener(fiveAdListener);
        int i4 = f27802 + 7;
        f27805 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static FiveAd m29083() {
        int i = 2 % 2;
        int i2 = f27805 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27802 = i2 % 128;
        int i3 = i2 % 2;
        FiveAd singleton = FiveAd.getSingleton();
        int i4 = f27802 + 93;
        f27805 = i4 % 128;
        int i5 = i4 % 2;
        return singleton;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29103(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = 2 % 2;
        int i2 = f27805 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27802 = i2 % 128;
        if (i2 % 2 == 0) {
            return fiveAdCustomLayout.getAdvertiserName();
        }
        fiveAdCustomLayout.getAdvertiserName();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m29092(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = 2 % 2;
        int i2 = f27802 + 99;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f27802 + 89;
        f27805 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m29102(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i = 2 % 2;
        int i2 = f27802 + 65;
        f27805 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        int i4 = f27802 + 31;
        f27805 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29097(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f27806[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f27804)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29099(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f27803.clone();
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
