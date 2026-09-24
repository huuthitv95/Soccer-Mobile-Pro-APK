package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ogury.sdk.Ogury;
import com.vungle.ads.internal.protos.Sdk;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bx */
/* JADX INFO: loaded from: classes6.dex */
public final class C11859bx extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27947 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27950 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f27951 = {22507, 12925, 40076, 26434, 49584, 44087, 13969, 37139, 31589, 50679, 40972, 2779, 38188, 32678, 55815, 42112, 3825, 59750, 29643, 56902, 47275, 819, 60814, 18524, 53835, 48380, 1878, 57815, 19504, 54945, 45334, 7067, 58870, 16507, 10947, 46430, 8067, 64049, 17558, 12059, 35188, 5115, 65110, 22731, 12774, 21578, 64218, 365, 42887, 51718, 20641, 63280, 7495, 41930, 50791, 27882, 62226, 6543, 48146, 49824, 26823, 36682, 5605, 47210, 56967, 25882, 23550, 15948, 37099, 27501, 52623, 40985, 15019, 40209, 30558, 51658, 44135, 1776, 39224, 29591, 54826, 43195, 705, 26609, 611, 44226, 22390, 61860, 39971, 1669, 41223, 19313, 62947, 36991, 15048, 42277, 20402, 59927, 38024, 16117, 55651, 's', 26101, 52052, 12537, 38446, 64420, 24837, 50818, 11507, 37476, 63433, 23876, 49833, 10289, 36236, 62259, 22881, 48892, 9292, 35282, 61217, 21683, 47627, 1375, 24777, 52792, 13814, 37636, 65155, 25637, 50087, 10705, 38723, 62136, 22629, 51097, 11531, 35003, 63017, 23640, 48008, 8575, 36064, 59992, 20912, 48951, 6821, 32990, 60995, 21988, 45935, 7832, 33794, 58275, 18734, 46935, 4819, 30818, 59330, 19737, 43155, 5684, 32181, 56315, 16713, 44280, 2674, 29074, 57129, 15012, 49591};

    /* JADX INFO: renamed from: ｋ */
    private static long f27949 = -4589710065168849520L;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27948 = 138;

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ Presage m29292() {
        int i = 2 % 2;
        int i2 = f27947 + 55;
        f27950 = i2 % 128;
        int i3 = i2 % 2;
        Presage presageM29293 = m29293();
        int i4 = f27947 + 19;
        f27950 = i4 % 128;
        int i5 = i4 % 2;
        return presageM29293;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m29297(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = 2 % 2;
        int i2 = f27950 + 47;
        f27947 = i2 % 128;
        int i3 = i2 % 2;
        m29298(presageInterstitial, presageInterstitialCallback);
        int i4 = f27950 + 115;
        f27947 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29299(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = 2 % 2;
        int i2 = f27947 + 61;
        f27950 = i2 % 128;
        int i3 = i2 % 2;
        m29294(presageOptinVideo, presageOptinVideoCallback);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f27950 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27947 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    public C11859bx(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:15:0x0086  */
    /* JADX WARN: Code duplicated, block: B:16:0x008a  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:26:0x010c  */
    /* JADX WARN: Code duplicated, block: B:27:0x010f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0132  */
    /* JADX WARN: Code duplicated, block: B:30:0x0135  */
    /* JADX WARN: Code duplicated, block: B:33:0x015b  */
    /* JADX WARN: Code duplicated, block: B:34:0x015e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0186  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01df  */
    /* JADX WARN: Code duplicated, block: B:47:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x0213  */
    /* JADX WARN: Code duplicated, block: B:53:0x021e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0220  */
    /* JADX WARN: Code duplicated, block: B:55:0x0222  */
    /* JADX WARN: Code duplicated, block: B:57:0x0247  */
    /* JADX WARN: Code duplicated, block: B:60:0x0254  */
    /* JADX WARN: Code duplicated, block: B:61:0x0256  */
    /* JADX WARN: Code duplicated, block: B:63:0x027a  */
    /* JADX WARN: Code duplicated, block: B:89:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = f27950 + 53;
        f27947 = i7 % 128;
        byte b = 3;
        if (i7 % 2 != 0) {
            int i8 = 63 / 0;
            switch (str.hashCode()) {
                case -2101347995:
                    if (str.equals(m29296("\n\b￢\u0005￤\u0010\u000f\u0007", View.getDefaultSize(0, 0) + 8, false, 2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 232 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22492FF;
                    }
                    break;
                case -1907784110:
                    if (str.equals(m29295((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 66, (char) (23470 - TextUtils.indexOf("", "", 0)), 17 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i = f27950 + 13;
                        f27947 = i % 128;
                        if (i % 2 != 0) {
                            b = 9;
                        } else {
                            b = 1;
                        }
                    }
                    break;
                case -1704786309:
                    if (str.equals(m29296("\n\t\b\ufffb\n\u0004\uffdf\u000f\n\uffff\f\uffff\n\ufff9ￗ\u0002\ufff7\uffff\n\uffff", TextUtils.indexOf("", "", 0, 0) + 20, true, 6 - MotionEvent.axisFromString(""), TextUtils.indexOf("", "") + 244).intern())) {
                        b = -1;
                    } else {
                        i2 = f27947 + 9;
                        f27950 = i2 % 128;
                        if (i2 % 2 == 0) {
                            b = 1;
                        } else {
                            b = 0;
                        }
                    }
                    break;
                case -938422005:
                    if (str.equals(m29296("\u0001\u0003�\u000f\u0001\u000e￬\u0007\u0000\uffef", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, Gravity.getAbsoluteGravity(0, 0) + 7, 238 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i3 = f27947 + 97;
                        f27950 = i3 % 128;
                        if (i3 % 2 == 0) {
                            b = 6;
                        } else {
                            b = 59;
                        }
                    }
                    break;
                case -610604286:
                    if (str.equals(m29296("\u000f￤\uffff\r￼\u0012\u0000￭\b\u0000", View.getDefaultSize(0, 0) + 10, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, View.MeasureSpec.makeMeasureSpec(0, 0) + 239).intern())) {
                        b = -1;
                    } else {
                        i4 = f27950 + 27;
                        f27947 = i4 % 128;
                        if (i4 % 2 != 0) {
                            b = 11;
                        } else {
                            b = 76;
                        }
                    }
                    break;
                case -126768170:
                    if (str.equals(m29295((-1) - TextUtils.lastIndexOf("", '0', 0), (char) (22403 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 45).intern())) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case 76142724:
                    if (!str.equals(m29296("\u000b\b\u000f￥�", 5 - TextUtils.getOffsetAfter("", 0), false, 3 - (ViewConfiguration.getTapTimeout() >> 16), 244 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case 698887547:
                    if (str.equals(m29296("\uffff\ufff9\u000b�\n￨\u0004\ufff9\u0001\f\u0001\f\u000b\n�\f\u0006￡�", 19 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 6 - Gravity.getAbsoluteGravity(0, 0), View.resolveSize(0, 0) + 242).intern())) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1067648736:
                    if (str.equals(m29296("\uffdd\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b￣\uffff\u0001\ufffb\r\uffff\f￪\u0005�\ufffb￼\u0006\u0006\ufffb", TextUtils.indexOf((CharSequence) "", '0', 0) + 28, true, View.resolveSize(0, 0) + 20, 239 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 1346371759:
                    if (str.equals(m29296("￫\u0000\u0002￼\u000e\u0000\r", 7 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, View.MeasureSpec.getSize(0) + 1, 239 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i9 = f27950 + 67;
                        f27947 = i9 % 128;
                        int i10 = i9 % 2;
                        b = 5;
                    }
                    break;
                case 1871097647:
                    if (str.equals(m29295(44 - TextUtils.indexOf("", "", 0, 0), (char) (Gravity.getAbsoluteGravity(0, 0) + 12723), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        i5 = f27950 + 77;
                        f27947 = i5 % 128;
                        if (i5 % 2 != 0) {
                            b = 2;
                        }
                    }
                    break;
                case 2109755994:
                    if (str.equals(m29296("\f\n\uffc8\t\u0003\u0013\u000e\u0003\u0010\u0003\u000e�ￛ\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b￣\uffc8\u0003\u000f\uffc8\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b\u0003\uffc8\uffff\u0001\ufffb\r\uffff", '_' - AndroidCharacter.getMirror('0'), true, 5 - Gravity.getAbsoluteGravity(0, 0), 240 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 2128976055:
                    if (str.equals(m29296("\u0001\u0003�\u000f\u0001\u000e￬\u0007\uffff�\ufffe\b\b�\uffdf\u000b\u0001\u0000\u0005\ufff2\n\u0005\u0010\f￫", View.getDefaultSize(0, 0) + 25, true, 7 - TextUtils.getCapsMode("", 0, 0), 237 - Process.getGidForName("")).intern())) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -2101347995:
                    if (str.equals(m29296("\n\b￢\u0005￤\u0010\u000f\u0007", View.getDefaultSize(0, 0) + 8, false, 2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 232 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                        b = -1;
                    } else {
                        b = Ascii.f22492FF;
                    }
                    break;
                case -1907784110:
                    if (str.equals(m29295((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 66, (char) (23470 - TextUtils.indexOf("", "", 0)), 17 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i = f27950 + 13;
                        f27947 = i % 128;
                        if (i % 2 != 0) {
                            b = 9;
                        } else {
                            b = 1;
                        }
                    }
                    break;
                case -1704786309:
                    if (str.equals(m29296("\n\t\b\ufffb\n\u0004\uffdf\u000f\n\uffff\f\uffff\n\ufff9ￗ\u0002\ufff7\uffff\n\uffff", TextUtils.indexOf("", "", 0, 0) + 20, true, 6 - MotionEvent.axisFromString(""), TextUtils.indexOf("", "") + 244).intern())) {
                        b = -1;
                    } else {
                        i2 = f27947 + 9;
                        f27950 = i2 % 128;
                        if (i2 % 2 == 0) {
                            b = 1;
                        } else {
                            b = 0;
                        }
                    }
                    break;
                case -938422005:
                    if (str.equals(m29296("\u0001\u0003�\u000f\u0001\u000e￬\u0007\u0000\uffef", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, Gravity.getAbsoluteGravity(0, 0) + 7, 238 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b = -1;
                    } else {
                        i3 = f27947 + 97;
                        f27950 = i3 % 128;
                        if (i3 % 2 == 0) {
                            b = 6;
                        } else {
                            b = 59;
                        }
                    }
                    break;
                case -610604286:
                    if (str.equals(m29296("\u000f￤\uffff\r￼\u0012\u0000￭\b\u0000", View.getDefaultSize(0, 0) + 10, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, View.MeasureSpec.makeMeasureSpec(0, 0) + 239).intern())) {
                        b = -1;
                    } else {
                        i4 = f27950 + 27;
                        f27947 = i4 % 128;
                        if (i4 % 2 != 0) {
                            b = 11;
                        } else {
                            b = 76;
                        }
                    }
                    break;
                case -126768170:
                    if (str.equals(m29295((-1) - TextUtils.lastIndexOf("", '0', 0), (char) (22403 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 45).intern())) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 76142724:
                    if (!str.equals(m29296("\u000b\b\u000f￥�", 5 - TextUtils.getOffsetAfter("", 0), false, 3 - (ViewConfiguration.getTapTimeout() >> 16), 244 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case 698887547:
                    if (str.equals(m29296("\uffff\ufff9\u000b�\n￨\u0004\ufff9\u0001\f\u0001\f\u000b\n�\f\u0006￡�", 19 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 6 - Gravity.getAbsoluteGravity(0, 0), View.resolveSize(0, 0) + 242).intern())) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1067648736:
                    if (str.equals(m29296("\uffdd\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b￣\uffff\u0001\ufffb\r\uffff\f￪\u0005�\ufffb￼\u0006\u0006\ufffb", TextUtils.indexOf((CharSequence) "", '0', 0) + 28, true, View.resolveSize(0, 0) + 20, 239 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 1346371759:
                    if (str.equals(m29296("￫\u0000\u0002￼\u000e\u0000\r", 7 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, View.MeasureSpec.getSize(0) + 1, 239 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                        b = -1;
                    } else {
                        int i11 = f27950 + 67;
                        f27947 = i11 % 128;
                        int i12 = i11 % 2;
                        b = 5;
                    }
                    break;
                case 1871097647:
                    if (str.equals(m29295(44 - TextUtils.indexOf("", "", 0, 0), (char) (Gravity.getAbsoluteGravity(0, 0) + 12723), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                        b = -1;
                    } else {
                        i5 = f27950 + 77;
                        f27947 = i5 % 128;
                        if (i5 % 2 != 0) {
                            b = 2;
                        }
                    }
                    break;
                case 2109755994:
                    if (str.equals(m29296("\f\n\uffc8\t\u0003\u0013\u000e\u0003\u0010\u0003\u000e�ￛ\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b￣\uffc8\u0003\u000f\uffc8\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b\u0003\uffc8\uffff\u0001\ufffb\r\uffff", '_' - AndroidCharacter.getMirror('0'), true, 5 - Gravity.getAbsoluteGravity(0, 0), 240 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 2128976055:
                    if (str.equals(m29296("\u0001\u0003�\u000f\u0001\u000e￬\u0007\uffff�\ufffe\b\b�\uffdf\u000b\u0001\u0000\u0005\ufff2\n\u0005\u0010\f￫", View.getDefaultSize(0, 0) + 25, true, 7 - TextUtils.getCapsMode("", 0, 0), 237 - Process.getGidForName("")).intern())) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
        }
        switch (b) {
            case 0:
            case 1:
                int i13 = f27947 + 111;
                f27950 = i13 % 128;
                int i14 = i13 % 2;
                return InterstitialActivity.class;
            case 2:
            case 3:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case 4:
                return Ogury.class;
            case 5:
                return Presage.class;
            case 6:
                int i15 = f27947 + 19;
                f27950 = i15 % 128;
                int i16 = i15 % 2;
                return PresageSdk.class;
            case 7:
                return PresageInterstitial.class;
            case 8:
                int i17 = f27947 + 9;
                f27950 = i17 % 128;
                int i18 = i17 % 2;
                return PresageInterstitialCallback.class;
            case 9:
                return PresageOptinVideo.class;
            case 10:
                return PresageOptinVideoCallback.class;
            case 11:
                return RewardItem.class;
            case 12:
                return AdConfig.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29295((KeyEvent.getMaxKeyCode() >> 16) + 83, (char) (26519 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 18).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11859bx.m29292();
            }
        });
        map.put(m29295((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 101, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 24).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11859bx.m29297((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m29296("￼�\u0007\u0007￼\uffde\n\u0000\uffff\u0004\ufff1\t\u0004\u000f\u000b￪\u000f\u0000\u000e\u0006\ufffe", Process.getGidForName("") + 22, true, TextUtils.indexOf("", "") + 19, 239 - Color.red(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11859bx.m29299((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i2 = f27947 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27950 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27950 + 109;
        f27947 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strMo28831 = mo28831();
            if (strMo28831 == null) {
                int i3 = f27950 + 83;
                f27947 = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            int i5 = f27950 + 83;
            f27947 = i5 % 128;
            int i6 = i5 % 2;
            return strMo28831.split(m29296("\u0000", View.MeasureSpec.getMode(0) + 1, true, ExpandableListView.getPackedPositionGroup(0L) + 1, 182 - ExpandableListView.getPackedPositionChild(0L)).intern())[0];
        }
        mo28831();
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo28831() {
        int i = 2 % 2;
        int i2 = f27947 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27950 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                String str = (String) Class.forName(m29295(123 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (1333 - Process.getGidForName("")), TextUtils.lastIndexOf("", '0', 0, 0) + 48).intern()).getMethod(m29295((ViewConfiguration.getJumpTapTimeout() >> 16) + 171, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49622), TextUtils.getCapsMode("", 0, 0) + 1).intern(), null).invoke(null, null);
                int i4 = f27950 + 57;
                f27947 = i4 % 128;
                int i5 = i4 % 2;
                return str;
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﺙ */
    private static Presage m29293() {
        int i = 2 % 2;
        int i2 = f27950 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27947 = i2 % 128;
        int i3 = i2 % 2;
        Presage presage = Presage.getInstance();
        int i4 = f27947 + 87;
        f27950 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return presage;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m29298(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i = 2 % 2;
        int i2 = f27950 + 73;
        f27947 = i2 % 128;
        int i3 = i2 % 2;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m29294(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = 2 % 2;
        int i2 = f27947 + 31;
        f27950 = i2 % 128;
        int i3 = i2 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29295(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f27951[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f27949)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29296(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f27948);
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
