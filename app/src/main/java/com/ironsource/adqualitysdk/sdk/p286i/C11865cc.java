package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11865cc extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28064 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28065 = 105;

    /* JADX INFO: renamed from: ｋ */
    private static int f28066;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f28067 = {20189, 16109, 44715, 7716, 36410, 32755, 61350, 24432, 53041, 48347, 11464, 40062, 3108, 65011, 28050, 56687, 19728, 15659, 43762, 6795, 35437, 31270, 60415, 23468, 52087, 47894, 10463, 10965, 23269, 51875, 31276, 59954, 7163, 35758, 15224, 43833, 55507, 18624, 63606, 26668, 39417, 2449, 47452, 10498, 22831, 52960, 32438, 60999, 7737, 36842, 16315, 44896, 57091, 19674, 64667, 1826, 30464, 59230, 22446, 51175, 13881, 42619, 5823, 34547, 62724, 25946, 54694, 17863, 46094, 9311, 7281, 27773, 64548, 19696, 56496, 11642, 48425, 25282, 4801, 33430, 12882, 41499, 21493, 50062, 29518, 58136, 13017, 17147, 53940, 25181, 61992, 975, 37772, 9053, 63317, 34679, 5929, 42969, 14224, 50766, 22028, 59080, 30340, 1395, 38189, 9689, 46520, 17534, 54333, 25824, 62639, 33944, 4939, 31656, 2954, 39877, 11052, 47961, 19134, 56061, 27180, 64075, 35205, 6598, 43326, 14661, 51349, 22723, 59444, 30805, 2163, 40880, 12269, 48930, 20341, 56998, 18349, 14223, 42944, 5929, 34652, 30395, 59128, 22057, 50767, 46476, 9669, 38152, 1350, 62649, 25816, 54286, 17485, 13408, 41903, 5096, 33595, 4532, 24982, 61915, 16673, 53602, 8382, 45293, '*', 36963, 58245, 'T', 28790, 57384, 20696, 49297, 12623, 41229, 4553, 33157, 62066, 25132, 'T', 28790, 57401, 20695, 49284, 12613, 41223, 4554, 33202, 62073, 25129, 53985, 17077, 45951, 9020, 'g', 28761, 57356, 20705, 49282, 12608, 21142, 8872, 45821, 525, 37493, 25513, 62441, 17159, 54132, 41118, 12505, 32778, 4175, 57742, 29148};

    /* JADX INFO: renamed from: ﾒ */
    private static long f28068 = -5742560601874862020L;

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29472(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f28064 + 97;
        f28066 = i2 % 128;
        int i3 = i2 % 2;
        String strM29469 = m29469(tJPlacement);
        int i4 = f28064 + 67;
        f28066 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM29469;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29473(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f28064 + 21;
        f28066 = i2 % 128;
        int i3 = i2 % 2;
        String strM29467 = m29467(tJPlacementData);
        int i4 = f28066 + 101;
        f28064 = i4 % 128;
        int i5 = i4 % 2;
        return strM29467;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29475(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f28066 + 105;
        f28064 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29470(tJPlacementData);
        }
        m29470(tJPlacementData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ TJPlacementListener m29476(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f28064 + 109;
        f28066 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29474(tJPlacement);
        }
        m29474(tJPlacement);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m29479(TJSplitWebView tJSplitWebView) {
        int i = 2 % 2;
        int i2 = f28064 + 85;
        f28066 = i2 % 128;
        if (i2 % 2 != 0) {
            m29482(tJSplitWebView);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM29482 = m29482(tJSplitWebView);
        int i3 = f28064 + 83;
        f28066 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return strM29482;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ TJPlacementVideoListener m29480(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f28064 + 89;
        f28066 = i2 % 128;
        if (i2 % 2 != 0) {
            m29468(tJPlacement);
            throw null;
        }
        TJPlacementVideoListener tJPlacementVideoListenerM29468 = m29468(tJPlacement);
        int i3 = f28066 + 41;
        f28064 = i3 % 128;
        if (i3 % 2 != 0) {
            return tJPlacementVideoListenerM29468;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29481(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f28066 + 71;
        f28064 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29478(tJPlacementData);
        }
        m29478(tJPlacementData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m29484(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = 2 % 2;
        int i2 = f28066 + 59;
        f28064 = i2 % 128;
        int i3 = i2 % 2;
        m29471(tJPlacement, tJPlacementVideoListener);
        int i4 = f28064 + 3;
        f28066 = i4 % 128;
        int i5 = i4 % 2;
    }

    public C11865cc(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:96:0x047c  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        byte b = 1;
        switch (str.hashCode()) {
            case -1983375197:
                if (!str.equals(m29477(178 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) TextUtils.getOffsetAfter("", 0), 15 - Color.green(0)).intern())) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case -1687314074:
                if (!str.equals(m29483("\u0014\u0010\u0002\u000f\u0000\f\nￋ\u0011\ufffe\r\u0007\f\u0016ￋ\n\u000f\ufffe\u0006\u0001ￋ\u0013\u0006\u0002\u0014ￋ\uffdf\u000f\f", View.MeasureSpec.makeMeasureSpec(0, 0) + 29, false, (Process.myTid() >> 22) + 4, MotionEvent.axisFromString("") + 205).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1640254126:
                if (!str.equals(m29483("\t\uffdd￤￮\u0013\u000e\u0003\u0010\u0003\u000e�ￛ\u000e\b\uffff\u000e\b", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, true, 4 - TextUtils.getTrimmedLength(""), 207 - View.getDefaultSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i2 = f28064 + 35;
                    f28066 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 4 / 5;
                    }
                    b = 2;
                }
                break;
            case -1628534628:
                if (!str.equals(m29477(MotionEvent.axisFromString("") + 78, (char) (25231 - KeyEvent.normalizeMetaState(0)), KeyEvent.keyCodeFromString("") + 9).intern())) {
                    b = -1;
                } else {
                    int i4 = f28064 + 93;
                    f28066 = i4 % 128;
                    b = i4 % 2 == 0 ? (byte) 9 : (byte) 55;
                }
                break;
            case -1429063965:
                if (!str.equals(m29477(94 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (63234 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 19).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22500SO;
                }
                break;
            case -1414965228:
                if (!str.equals(m29483("\u0001\b\u0000\n�￤\n\u000b\u0005\u0010\uffff\uffdd\u000e", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, true, 12 - Drawable.resolveOpacity(0, 0), 205 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i5 = f28064 + 61;
                    f28066 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 5;
                }
                break;
            case -1147119309:
                if (!str.equals(m29483("\u0005\u0002\ufff6\t\u0005\u0017\u0003\u000f\rￎ\u0014\u0001\u0010\n\u000f\u0019ￎ\ufff4￪\ufff7", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19, false, 5 - ExpandableListView.getPackedPositionChild(0L), 201 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22492FF;
                }
                break;
            case -872754855:
                if (!str.equals(m29477(TextUtils.lastIndexOf("", '0', 0) + 56, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1909), 15 - View.resolveSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i7 = f28066 + 81;
                    f28064 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 4;
                }
                break;
            case -721136035:
                if (!str.equals(m29477(85 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (12941 - KeyEvent.keyCodeFromString("")), 8 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case -668579974:
                if (!str.equals(m29483("\u0007\u0003\u0015\u0001\r\u000bￌ\u0012\uffff\u000e\b\r\u0017ￌ\u000b\u0010\uffff\u0007\u0002ￌ\u0014\u0007\u0003\u0015ￌ￫\u0010\uffff\u0007\u0002\ufff4", 31 - TextUtils.indexOf("", "", 0), false, KeyEvent.keyCodeFromString("") + 3, 203 - Color.green(0)).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -593336436:
                if (!str.equals(m29483("\u0012ￜ￥\uffef\r\u0000\t\u0000\u000f\u000e\u0004\uffe7\u0014\ufffe\t\u0000\r\r\u0010\uffde\uffff\r￼", KeyEvent.getDeadChar(0, 0) + 23, true, 4 - View.getDefaultSize(0, 0), 206 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case -217417742:
                if (!str.equals(m29483("\u0001\r\u000bￌ\u0012\uffff\u000e\b\r\u0017ￌ\u000b\u0010\uffff\u0007\u0002ￌ\u0014\u0007\u0003\u0015ￌ\uffdf\u0001\u0012\u0007\r\f￦\uffff\f\u0002\n\u0003\u0010", KeyEvent.getDeadChar(0, 0) + 35, false, Process.getGidForName("") + 36, 203 - (Process.myPid() >> 22)).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 178410181:
                if (!str.equals(m29483("\n\u000e\ufff1￨\ufff2ￌ\u0017\r\b\u000e\uffff\u0012ￌ\u000b\r\u0001\u0015\u0003\u0007\ufff4\u0000\u0003\ufff5\u0012\u0007", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25, true, 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSize(0, 0) + 203).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22491EM;
                }
                break;
            case 206635148:
                if (!str.equals(m29483("\u0001\uffde\uffe7\ufff1\u0016\u0011\u0006\u0013\u0006\u0011\u0000\uffde\u0011\u0006\u000b\ufff2", Color.alpha(0) + 16, true, Color.alpha(0) + 4, 204 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 268330895:
                if (!str.equals(m29483("\ufff7￮\u0018\r\u0012\ufff9\b￥￮\ufff8\t\u000b\b\r\u0016￦", (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, 196 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i9 = f28066 + 45;
                    f28064 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 19;
                }
                break;
            case 327820672:
                if (!str.equals(m29483("\u0005\ufff2\u0010\n\u0001\t\u0001\uffff�\b￬￦\ufff0\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u000b\u0001\u0000", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, TextUtils.indexOf("", "") + 205).intern())) {
                    b = -1;
                } else {
                    int i11 = f28064 + 27;
                    f28066 = i11 % 128;
                    b = i11 % 2 == 0 ? Ascii.DC2 : (byte) 111;
                }
                break;
            case 705136807:
                if (!str.equals(m29477(157 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (4576 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Color.alpha(0) + 10).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC4;
                }
                break;
            case 741045788:
                if (!str.equals(m29477(View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 20158), 26 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    b = -1;
                }
                break;
            case 832039888:
                if (!str.equals(m29477((ViewConfiguration.getTapTimeout() >> 16) + 113, (char) (KeyEvent.normalizeMetaState(0) + 31740), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24).intern())) {
                    b = -1;
                } else {
                    int i12 = f28066 + 113;
                    f28064 = i12 % 128;
                    b = i12 % 2 != 0 ? (byte) 16 : (byte) 56;
                }
                break;
            case 906946425:
                if (!str.equals(m29483("\u0002\u000b\u0002\u0011\u0010\u0006￩\f\u0002\u0001\u0006\ufff3\uffe7\ufff1\u000f", TextUtils.lastIndexOf("", '0') + 16, true, TextUtils.indexOf((CharSequence) "", '0') + 15, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 205).intern())) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case 1317517621:
                if (!str.equals(m29483("\u0007\n\u000e\ufff1￨\ufff2\u0015\u0003\u0007\ufff4\u0000\u0003\ufff5\u0012", 14 - TextUtils.getOffsetBefore("", 0), true, KeyEvent.keyCodeFromString("") + 6, (ViewConfiguration.getWindowTouchSlop() >> 8) + 203).intern())) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case 1504750787:
                if (!str.equals(m29483("\u0003\ufff7\n\u0006\u0018\ufff5￫\ufff8\u0006", (ViewConfiguration.getTapTimeout() >> 16) + 9, false, TextUtils.indexOf("", "", 0) + 5, 200 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22503VT;
                }
                break;
            case 1519750415:
                if (!str.equals(m29477(168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 11).intern())) {
                    b = -1;
                } else {
                    b = Ascii.NAK;
                }
                break;
            case 1815593736:
                if (!str.equals(m29477('v' - AndroidCharacter.getMirror('0'), (char) ((Process.myTid() >> 22) + 7219), 7 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1891461874:
                if (!str.equals(m29477(137 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (18426 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.alpha(0) + 21).intern())) {
                    b = -1;
                } else {
                    int i13 = f28064 + 63;
                    f28066 = i13 % 128;
                    int i14 = i13 % 2;
                    b = 17;
                }
                break;
            case 2041573826:
                if (!str.equals(m29477(27 - View.resolveSizeAndState(0, 0, 0), (char) (10934 - (Process.myPid() >> 22)), 27 - TextUtils.lastIndexOf("", '0')).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return TJAdUnitActivity.class;
            case 2:
            case 3:
                return TJContentActivity.class;
            case 4:
                return TJPlacementData.class;
            case 5:
            case 6:
                return ActionHandler.class;
            case 7:
            case 8:
                return Browser.class;
            case 9:
            case 10:
                return MraidView.class;
            case 11:
            case 12:
                return TJWebView.class;
            case 13:
                return TJAdUnit.class;
            case 14:
                return TJPlacementListener.class;
            case 15:
                return TJVideoListener.class;
            case 16:
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case 17:
                return TJAdUnit.TJAdUnitVideoListener.class;
            case 18:
                return TJPlacementVideoListener.class;
            case 19:
                return TJAdUnitJSBridge.class;
            case 20:
                return TJCurrency.class;
            case 21:
                return TJPlacement.class;
            case 22:
                return TJActionRequest.class;
            case 23:
                return TJAwardCurrencyListener.class;
            case 24:
            case 25:
                return TJSplitWebView.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        String version;
        int i = 2 % 2;
        int i2 = f28064 + 49;
        f28066 = i2 % 128;
        if (i2 % 2 != 0) {
            version = Tapjoy.getVersion();
            int i3 = 47 / 0;
        } else {
            version = Tapjoy.getVersion();
        }
        int i4 = f28066 + 71;
        f28064 = i4 % 128;
        if (i4 % 2 != 0) {
            return version;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29483("\u0007￼\ufffe\u0000\b\u0000\t\u000f￩￼\b\u0000\u0002\u0000\u000f￫", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, false, 12 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 207).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11865cc.m29481((TJPlacementData) list.get(0));
            }
        });
        map.put(m29477(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 194, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 6).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11865cc.m29475((TJPlacementData) list.get(0));
            }
        });
        map.put(m29477(199 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21233), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11865cc.m29473((TJPlacementData) list.get(0));
            }
        });
        map.put(m29483("\u0001\u0003\u0001\t�￪\u0010", 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, Color.red(0) + 205).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11865cc.m29472((TJPlacement) list.get(0));
            }
        });
        map.put(m29483("￣\u0000\n\u000b￼\u0005￼\t\ufffe￼\u000b", (Process.myTid() >> 22) + 11, false, 8 - Drawable.resolveOpacity(0, 0), 210 - KeyEvent.getDeadChar(0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11865cc.m29476((TJPlacement) list.get(0));
            }
        });
        map.put(m29483("�\ufffe\b￥\u0002\f\r\ufffe\u0007\ufffe\u000b\u0000\ufffe\r\uffef\u0002", 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11865cc.m29480((TJPlacement) list.get(0));
            }
        });
        map.put(m29483("\u0001￼�\u0007￤\u0001\u000b\f�\u0006�\n\u000b�\f￮", 16 - View.combineMeasuredStates(0, 0), false, 12 - (ViewConfiguration.getTouchSlop() >> 8), (-16777007) - Color.rgb(0, 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11865cc.m29484((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m29483("\ufffe\u0000\u0005\u000b￮\r\f\ufffa￥\r", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.f22503VT, true, KeyEvent.keyCodeFromString("") + 2, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 207).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11865cc.m29479((TJSplitWebView) list.get(0));
            }
        });
        int i2 = f28066 + 61;
        f28064 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29478(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f28064 + 63;
        f28066 = i2 % 128;
        if (i2 % 2 != 0) {
            tJPlacementData.getPlacementName();
            throw null;
        }
        String placementName = tJPlacementData.getPlacementName();
        int i3 = f28066 + 29;
        f28064 = i3 % 128;
        int i4 = i3 % 2;
        return placementName;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29470(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f28066 + 109;
        f28064 = i2 % 128;
        if (i2 % 2 != 0) {
            return tJPlacementData.getUrl();
        }
        tJPlacementData.getUrl();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static String m29467(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f28064 + 75;
        f28066 = i2 % 128;
        if (i2 % 2 != 0) {
            tJPlacementData.getHttpResponse();
            throw null;
        }
        String httpResponse = tJPlacementData.getHttpResponse();
        int i3 = f28064 + 37;
        f28066 = i3 % 128;
        int i4 = i3 % 2;
        return httpResponse;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29469(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f28064 + 9;
        f28066 = i2 % 128;
        int i3 = i2 % 2;
        String name = tJPlacement.getName();
        int i4 = f28066 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f28064 = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    /* JADX INFO: renamed from: ｋ */
    private static TJPlacementListener m29474(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f28066 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28064 = i2 % 128;
        int i3 = i2 % 2;
        TJPlacementListener listener = tJPlacement.getListener();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return listener;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static TJPlacementVideoListener m29468(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f28066 + 45;
        f28064 = i2 % 128;
        if (i2 % 2 == 0) {
            tJPlacement.getVideoListener();
            throw null;
        }
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i3 = f28064 + 71;
        f28066 = i3 % 128;
        if (i3 % 2 == 0) {
            return videoListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m29471(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = 2 % 2;
        int i2 = f28064 + 7;
        f28066 = i2 % 128;
        int i3 = i2 % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29482(TJSplitWebView tJSplitWebView) {
        int i = 2 % 2;
        int i2 = f28064 + 99;
        f28066 = i2 % 128;
        if (i2 % 2 == 0) {
            return tJSplitWebView.getLastUrl();
        }
        tJSplitWebView.getLastUrl();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29483(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f28065);
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

    /* JADX INFO: renamed from: ﾇ */
    private static String m29477(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28067[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28068)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
