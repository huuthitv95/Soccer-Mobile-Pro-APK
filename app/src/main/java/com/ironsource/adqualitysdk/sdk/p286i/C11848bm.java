package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.PlaybackException;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.sdk.CBImpressionActivity;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.a;
import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.g;
import com.chartboost.sdk.impl.InterfaceC3627a;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bm */
/* JADX INFO: loaded from: classes6.dex */
public final class C11848bm extends AbstractC11840be {

    /* JADX INFO: renamed from: ﮐ */
    private static int f27717 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f27719 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static short[] f27720 = null;

    /* JADX INFO: renamed from: ﻛ */
    private static char f27722 = 7;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f27725 = {'C', 'h', 'a', 'r', 't', 'b', 'o', 's', 'A', 'c', 'i', 'v', 'y', 'B', 'M', 'e', 'd', 'n', 'T', 'k', 'D', 'l', 'g', 'm', 'R', 'w', 'S', 'I', 'p', 'V', '.', '8', '_', '4', '0', 'W', 'E', 'L', 'N', 'F', 'G', 'H', 'J', 'K', 'O', 'P', 'Q', 'U', 'X'};

    /* JADX INFO: renamed from: ﻐ */
    private static int f27721 = -335088143;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27724 = 31;

    /* JADX INFO: renamed from: ｋ */
    private static int f27723 = 1613996414;

    /* JADX INFO: renamed from: ﱟ */
    private static byte[] f27718 = {-11, -22, -16, -40, -14, -38, -10, 7, -72, -28, -21, -37, -27, -13, -40, -25, -24, 9, -20, -28, -21, 45, 48, 44, 57, Ascii.SUB, 46, Base64.padSymbol, 37, 81, -23, Ascii.f22494GS, -6, 33, -25, 42, Ascii.f22492FF, 4, -17, -16, -22, -34, Ascii.f22503VT, -56, -24, -17, -34, -4, -31, -18, -24, 1, -5, 36, 42, Ascii.DC2, 44, Ascii.DC4, 48, 65, -25, 53, 33, Ascii.f22491EM, 33, 56, -3, Ascii.f22498RS, 37, Ascii.NAK, Ascii.f22502US, 45, Ascii.DC2, 33, 34, 67, 38, Ascii.f22498RS, Ascii.f22499SI, 107, 113, 89, 115, 91, 119, -120, 57, 101, 108, 92, 102, 116, 89, 104, 105, -118, 109, 101, 123, Ascii.ESC, 124, 104, 96, 104, 95, -92, 41, 109, 87, -85, 32, 103, 106, 102, 115, 84, 104, 119, 95, 107, -101, 39, 100, 114, -19, -47, -66, -69, -47, -69, -57, -57, -45, -73, -52, -21, -23, -69, -67, -82, -51, -90, -50, -49, -11, -81, -87, -90, -99, -89, -78, -59, 126, -78, -97, -100, -78, -100, -88, -88, -76, -104, -83, -52, -26, -68, -73, -67, -78, -10, -29, 5, -20, -12, -21, -7, 19, -62, -13, -10, -14, -1, -32, -12, 3, -21, Ascii.ETB, -63, 1, -16, -19, 63, 97, 72, 80, 71, 85, 111, 48, 92, 47, 88};

    /* JADX INFO: renamed from: ﭴ */
    static /* synthetic */ boolean m28991() {
        int i = 2 % 2;
        int i2 = f27719 + 69;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM28990 = m28990();
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return zM28990;
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ Object m28995() {
        int i = 2 % 2;
        int i2 = f27717 + 47;
        f27719 = i2 % 128;
        int i3 = i2 % 2;
        Object objM28992 = m28992();
        int i4 = f27719 + 91;
        f27717 = i4 % 128;
        int i5 = i4 % 2;
        return objM28992;
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ Object m28996() {
        int i = 2 % 2;
        int i2 = f27719 + 39;
        f27717 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28994();
        }
        m28994();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29000(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f27719 + 101;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        String strM28997 = m28997(cBInPlay);
        int i4 = f27717 + 83;
        f27719 = i4 % 128;
        int i5 = i4 % 2;
        return strM28997;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29001(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f27719 + 59;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        String strM29004 = m29004(cBInPlay);
        int i4 = f27719 + 105;
        f27717 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM29004;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m29003(ChartboostDelegate chartboostDelegate) {
        int i = 2 % 2;
        int i2 = f27719 + 13;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        m29005(chartboostDelegate);
        int i4 = f27719 + 19;
        f27717 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ boolean m29006(C11848bm c11848bm) {
        int i = 2 % 2;
        int i2 = f27719 + 73;
        f27717 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28993();
        }
        m28993();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ d m29008(C11848bm c11848bm, ChartboostDelegate chartboostDelegate, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f27719 + 35;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        d dVarM29007 = c11848bm.m29007(chartboostDelegate, interfaceC11874cl);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return dVarM29007;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m29009(C11848bm c11848bm, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f27719 + 11;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        c11848bm.m28998(interfaceC11874cl);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    public C11848bm(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1602236458:
                b = !str.equals(m29002("\u0011\u0004\t\u0010\u0013\u0001\t\u0010\u000e\u0005\u0002\u0003\u0004\u0005\u0006\u0000\u0000\r\u0006\u0012\u000e\u0016\u0016\u001d\u0003\u0005\u009a", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 52)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1251618628:
                b = !str.equals(m29002("\u0006\u0007\u0015\u0018\u001f\u0000\u000e\b\b\u000b\u0003\u0014\u001f\b\u0012\u0016\t\n\u0003\u000b\f\u000b\u0005\u000b", 24 - View.MeasureSpec.getSize(0), (byte) (102 - TextUtils.indexOf("", ""))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -921117961:
                b = !str.equals(m28999((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 335088143, (short) (27 - Color.red(0)), View.MeasureSpec.getSize(0) - 1613996347, (byte) TextUtils.indexOf("", "", 0), (-32) - View.MeasureSpec.getSize(0)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -869710636:
                b = !str.equals(m29002("\u0001\u0002\u0003\u0004\u0005\u0006ÄÄ\u000b\u0000\t\n\u0003\u000b\f\u000b\u0005\u000b", 18 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (Process.getGidForName("") + 86)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -513187163:
                b = !str.equals(m28999((Process.myTid() >> 22) + 335088163, (short) ((KeyEvent.getMaxKeyCode() >> 16) - 44), View.resolveSizeAndState(0, 0, 0) - 1613996347, (byte) (ViewConfiguration.getTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 33).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -416101408:
                b = !str.equals(m28999(335088195 - Gravity.getAbsoluteGravity(0, 0), (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 31), (ViewConfiguration.getLongPressTimeout() >> 16) - 1613996347, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.red(0) - 32).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -371244199:
                if (!str.equals(m29002("\u0006\u0007\u000f\u0010\u0011\t\u0003\u0005\r\u0003è", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, (byte) (122 - (Process.myPid() >> 22))).intern())) {
                    b = -1;
                } else {
                    int i2 = f27719 + 67;
                    f27717 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 4;
                }
                break;
            case -352872024:
                b = !str.equals(m29002("\t\u000f\u0001\u0003²²\u0006\u0003\f\u0010", View.getDefaultSize(0, 0) + 10, (byte) (70 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case -305846637:
                b = !str.equals(m29002("\u0016\u0011\u0017\u0004\u0002\u0011\u0010\u0011\u0001\u0003ÆÆ\u0006\u0003\f\u0010", 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 90)).intern()) ? (byte) -1 : Ascii.f22499SI;
                break;
            case -221039695:
                if (!str.equals(m28999((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 335088287, (short) (Color.alpha(0) + 89), (-1613996341) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 32).intern())) {
                    b = -1;
                } else {
                    int i4 = f27719 + 43;
                    f27717 = i4 % 128;
                    b = i4 % 2 != 0 ? Ascii.f22500SO : Ascii.f22498RS;
                }
                break;
            case -174936018:
                if (!str.equals(m28999(335088279 - ((Process.getThreadPriority(0) + 20) >> 6), (short) ((-16777148) - Color.rgb(0, 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1613996332, (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (-32) - TextUtils.getTrimmedLength("")).intern())) {
                    b = -1;
                } else {
                    int i5 = f27719 + 105;
                    f27717 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 11;
                }
                break;
            case 2115:
                b = !str.equals(m29002("\t\u000f", 1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 26)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 296803428:
                b = !str.equals(m29002("\u0011\r\t\u0015\u000b\b\b\u000b\u0000\u001a\u0016\u000f\u000e\u0002\u0000\u0017\u001a\u0000\t\u0010\u0095", 21 - Color.argb(0, 0, 0, 0), (byte) (42 - View.resolveSize(0, 0))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case 544981520:
                b = !str.equals(m29002("\r\u0002\u001e%\b\u0002\u0003\u0004\u0005\u0006ÔÔ\u000b\u0000\u001c\t\u0011\u0014 \t\b\u0011\u0017 \u0006\u0007\u0015\u0018\u001f\u0000\u000e\b\b\u000b\u0003\u0014\t\n\u0003\u000b\f\u000b\u0005\u000b", 44 - Gravity.getAbsoluteGravity(0, 0), (byte) (View.resolveSizeAndState(0, 0, 0) + 101)).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 604162924:
                b = !str.equals(m28999((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 335088221, (short) (KeyEvent.keyCodeFromString("") + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED), Process.getGidForName("") - 1613996314, (byte) Gravity.getAbsoluteGravity(0, 0), KeyEvent.normalizeMetaState(0) - 32).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 650412337:
                b = !str.equals(m28999(335088181 - (ViewConfiguration.getLongPressTimeout() >> 16), (short) (23 - View.MeasureSpec.getSize(0)), (-1613996338) - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) - 32).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 753858215:
                if (!str.equals(m29002("\u0019\u0005\u0003\u0004\u0005\u0001\u0000\u0017\u001a\u0000\t\u0010\u008a", TextUtils.getCapsMode("", 0, 0) + 13, (byte) (View.resolveSizeAndState(0, 0, 0) + 31)).intern())) {
                    b = -1;
                } else {
                    int i7 = f27719 + 87;
                    f27717 = i7 % 128;
                    b = i7 % 2 != 0 ? (byte) 16 : Ascii.f22502US;
                }
                break;
            case 769047372:
                b = !str.equals(m28999((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 335088267, (short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 58), (-1613996341) - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myTid() >> 22) - 32).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1443881784:
                if (!str.equals(m28999(TextUtils.lastIndexOf("", '0') + 335088174, (short) (ExpandableListView.getPackedPositionGroup(0L) - 5), (ViewConfiguration.getLongPressTimeout() >> 16) - 1613996347, (byte) Color.alpha(0), (-32) - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i8 = f27719 + 9;
                    f27717 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return ChartboostActivity.class;
            case 1:
                return CBImpressionActivity.class;
            case 2:
                return Chartboost.class;
            case 3:
                return CBInPlay.class;
            case 4:
                return Chartboost.CBMediation.class;
            case 5:
                return MediationModel.class;
            case 6:
                return d.class;
            case 7:
            case 8:
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case 9:
                return InterfaceC3614Ad.class;
            case 10:
                return Interstitial.class;
            case 11:
                return Rewarded.class;
            case 12:
                return AdCallback.class;
            case 13:
                int i10 = f27717 + 85;
                f27719 = i10 % 128;
                if (i10 % 2 == 0) {
                    return DismissibleAdCallback.class;
                }
                throw null;
            case 14:
                return InterstitialCallback.class;
            case 15:
                return RewardedCallback.class;
            case 16:
                return StartCallback.class;
            case 17:
            case 18:
                return com.chartboost.sdk.view.CBImpressionActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27717 + 109;
        f27719 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String sDKVersion = Chartboost.getSDKVersion();
            int i4 = f27717 + 105;
            f27719 = i4 % 128;
            int i5 = i4 % 2;
            return sDKVersion;
        } catch (Error unused) {
            return m28999(Color.blue(0) + 335088307, (short) (70 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (-1613996360) - TextUtils.getOffsetBefore("", 0), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.green(0) - 32).intern();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29002("\b\u000e\u000b\u0019\u0006\u0013\u000e\u0016\u0016\u001d\u0003\u0005\u0098", View.MeasureSpec.getSize(0) + 13, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11848bm.m29009(C11848bm.this, interfaceC11874cl);
                return null;
            }
        });
        map.put(m28999(335088312 - Color.argb(0, 0, 0, 0), (short) (14 - (Process.myTid() >> 22)), ExpandableListView.getPackedPositionChild(0L) - 1613996310, (byte) (ImageFormat.getBitsPerPixel(0) + 1), (-32) - View.getDefaultSize(0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11848bm.m28996();
            }
        });
        map.put(m29002("\u001d\u0016\u0005\u0001\u0002\u0003\u0004\u0005\u0006\u0000\u0000\r\u0001  !\"!)\u001b\u000e\u0016\u0016\u001d\u0003\u0005³", 27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (78 - TextUtils.indexOf("", "", 0, 0))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11848bm.m28995();
            }
        });
        map.put(m29002("\n\u0002\u0010\u0001\u0001\u0012\u0014\u000b\u0001\u0002\u0003\u0004\u0005\u0006\u0093\u0093\u000b\u0000\u000e\u0010\u0016\u000e\u0017\u0001\u0001\u0012", Color.alpha(0) + 26, (byte) (35 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11848bm.m29008(C11848bm.this, (ChartboostDelegate) list.get(0), interfaceC11874cl);
            }
        });
        map.put(m29002("\b\u000e\u0005\u0001\u0002\u0003\u0004\u0005\u0006\u0000\u0000\r\u0006\u0012\u000e\u0016\u0016\u001d\u0003\u0005á", 20 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (124 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11848bm.m29003((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m29002("\u000b\b$\u000e\u0001!\b\u0011\u0016'\u0010\u0003\u0000\u001a\u0010\u0011", ExpandableListView.getPackedPositionType(0L) + 16, (byte) (Color.green(0) + 111)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Boolean.valueOf(C11848bm.m28991());
            }
        });
        map.put(m29002("\u001d\u0016\u0002'\u0002\r\u0003\u0005\r\u0003\u0088", View.resolveSize(0, 0) + 11, (byte) (26 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11848bm.m29000((CBInPlay) list.get(0));
            }
        });
        map.put(m29002("\u001d\u0016\u0001\u000b°°%\u0003\u0016\u0010", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, (byte) (MotionEvent.axisFromString("") + 65)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11848bm.m29001((CBInPlay) list.get(0));
            }
        });
        map.put(m28999(TextUtils.getCapsMode("", 0, 0) + 335088333, (short) ((-78) - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 1613996309, (byte) ExpandableListView.getPackedPositionType(0L), (-32) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Boolean.valueOf(C11848bm.m29006(C11848bm.this));
            }
        });
        int i2 = f27717 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27719 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28998(InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f27719 + 27;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        m29005(m29007((ChartboostDelegate) m28994(), interfaceC11874cl));
        int i4 = f27719 + 59;
        f27717 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private d m29007(ChartboostDelegate chartboostDelegate, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        d dVar = new d(chartboostDelegate, interfaceC11874cl);
        int i2 = f27717 + 61;
        f27719 = i2 % 128;
        int i3 = i2 % 2;
        return dVar;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m29005(ChartboostDelegate chartboostDelegate) {
        int i = 2 % 2;
        int i2 = f27719 + 67;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        Chartboost.setDelegate(chartboostDelegate);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ */
    private static boolean m28993() {
        int i = 2 % 2;
        int i2 = f27719 + 27;
        f27717 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28994() instanceof d;
        }
        boolean z = m28994() instanceof d;
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ */
    private static boolean m28990() {
        boolean zIsWebViewEnabled;
        int i = 2 % 2;
        int i2 = f27719 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27717 = i2 % 128;
        if (i2 % 2 == 0) {
            zIsWebViewEnabled = Chartboost.isWebViewEnabled();
            int i3 = 54 / 0;
        } else {
            zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        }
        int i4 = f27717 + 91;
        f27719 = i4 % 128;
        int i5 = i4 % 2;
        return zIsWebViewEnabled;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28997(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f27719 + 43;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        String location = cBInPlay.getLocation();
        int i4 = f27719 + 21;
        f27717 = i4 % 128;
        int i5 = i4 % 2;
        return location;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29004(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f27717 + 107;
        f27719 = i2 % 128;
        int i3 = i2 % 2;
        String appName = cBInPlay.getAppName();
        int i4 = f27719 + 33;
        f27717 = i4 % 128;
        if (i4 % 2 != 0) {
            return appName;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ */
    private static Object m28994() {
        int i = 2 % 2;
        int i2 = f27717 + 99;
        f27719 = i2 % 128;
        int i3 = i2 % 2;
        a delegate = Chartboost.getDelegate();
        int i4 = f27717 + 97;
        f27719 = i4 % 128;
        int i5 = i4 % 2;
        return delegate;
    }

    /* JADX INFO: renamed from: ﭸ */
    private static Object m28992() {
        int i = 2 % 2;
        int i2 = f27719 + 97;
        f27717 = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC3627a interfaceC3627a = g.d;
        int i4 = f27719 + 7;
        f27717 = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceC3627a;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bm$d */
    class d extends ChartboostDelegate implements InterfaceC12003hf<ChartboostDelegate> {

        /* JADX INFO: renamed from: ﮐ */
        private static int f27735 = 1;

        /* JADX INFO: renamed from: ﱡ */
        private static int f27736;

        /* JADX INFO: renamed from: ﻛ */
        private static long f27737;

        /* JADX INFO: renamed from: ﾒ */
        private static char[] f27738;

        /* JADX INFO: renamed from: ﻐ */
        private InterfaceC11874cl f27739;

        /* JADX INFO: renamed from: ｋ */
        private ChartboostDelegate f27740;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("b,US\f¦Çá¿Kv©)øáLØ¼\u0093ïKc\u0002\u0096õó\u00adNd\u0090_â\u0017[Î\u009e\u0081©y 0\u0097ëä£\"\u009a\u008fMë\u0005\tü\u0082·Âo*&\u008e\u0019ÄÑ7\u0088¦CÕ;3òv¥Í\u009d8Tc\u000fÊÇ;¾rqÆ)\u001f¹á\u008e\u009e×k\u001c,d\u0086\u00addò5:\u0081\u0003qH\"\u0090®Ù[.>v\u0083¿]\u0084/Ì\u0096\u0015SZd¢íëZ0)xïAB\u0096&ÞÒ'Cl\r´âýJÂ\u001b\n÷Sk\u0098\u0018àþ)»~\u0000Fõ\u008f®Ô\u0007\u001cöe¿ª\u000bòÒ\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Á{øí/\u0083g\\\u009eíÕ\u0095\r^Dð{½³^êó! YA\u0090\bÇ¹ÿE6\u0014\u00133$L}¹¶þÎT\u0007¶Xç\u0090S©£âð:|s\u0089\u0084ìÜQ\u0015\u008f.ýfD¿\u0081ð¶\b(A\u0089\u009aðÒ\u000eë\u009d<ùt(\u008d¬ÆÃ\u001e\fW\u009bhÉ 8ù¹2ÊJ,\u0083iÔÒì'%|~Õ¶$Ïm\u0000ÙX\u0000\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Á|øå/\u0093gY\u009eáÕ¯\rCDÍ{¶³Xêå!¦Y[\u0090\bÇ¹ÿP6\u0011m\u00ad¥L\u0019ì.\u0093wf¼!Ä\u008b\riR8\u009a\u008c£|è/0£yV\u008e3Ö\u008e\u001fP$\"l\u009bµ^úi\u0002÷KV\u0090/ØÔáO6 ~è\u0087BÌ:\u0014ñ]_b\u0012ªñó\\8\u000f@î\u0089§Þ\u0016æê/»\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Á{øà/\u0089gW\u009eãÕ\u0095\r^Dð{½³^êó! YA\u0090\bÇ¹ÿE6\u0014\u0081C¶<ïÉ$\u008e\\$\u0095ÆÊ\u0097\u0002#;Óp\u0080¨\fáù\u0016\u009cN!\u0087ÿ¼\u008dô4-ñbÆ\u009aXÓù\b\u0080@|yå®\u0093æD\u001fäT½\u008cIÅÍú¶2Xkå ¦Ø[\u0011\bF¹~P·\u0011ì\u00ad$LúIÍ6\u0094Ã_\u0084'.îÌ±\u009dy)@Ù\u000b\u008aÓ\u0006\u009aóm\u00965+üõÇ\u0087\u008f>Vû\u0019ÌáR¨ós\u008a;q\u0002éÕ\u0087\u009dNdî/³÷N¾ë\u0081\u009bIH\u0010þÛ»£Pj\u0005=®\u0005GÌ\u0006\u0097¯_K&\u0012\u001bj,\u0015uà¾§Æ\r\u000fïP¾\u0098\n¡úê©2%{Ð\u008cµÔ\b\u001dÖ&¤n\u001d·Øøï\u0000fIÑ\u0092¢ÚdãÉ4\u00ad|O\u0085ÄÎ\u0084\u0016l_È`\u0082¨qñä:\u0092Bs\u008b0Ü¸ä}-!v\u0096¦Ç\u0091¸ÈM\u0003\n{ ²Bí\u0013%§\u001cWW\u0004\u008f\u0088Æ}1\u0018i¥ {\u009b\tÓ°\nuEB½Üô}/\u0004gÿ^i\u0089\u0007ÁØ8is\u0015«ÛârÝ9\u0015éLt\u0087 ÿßÓ\u0086äù½\fvK\u000eáÇ\u0003\u0098RPæi\u0016\"EúÉ³<DY\u001cäÕ:îH¦ñ\u007f40\u0003È\u008a\u0081=ZN\u0012\u0088+%üA´µM$\u0006jÞ\u0085\u0097-¨|`\u00909\bò~\u008a\u009fCÜ\u0014T,\u0091åÍ¾zoØX§\u0001RÊ\u0015²¿{]$\fì¸ÕH\u009e\u001bF\u0097\u000fbø\u0007 ºidR\u0016\u001a¯Ãj\u008c]tÃ=bæ\u001b®å\u0097v@\u0012\bÃñGº(bç+p\u0014\"ÜÓ\u0085VN 6Áÿ\u0082¨\n\u0090ÏY\u0093\u0002$@\u0007wx.\u008dåÊ\u009d`T\u0082\u000bÓÃgú\u0097±ÄiH ½×Ø\u008feF»}É5pìµ£\u0082[\u001c\u0012½ÉÄ\u00818¸¡o×'\u001dÞ¥\u0095ëM\u0007\u0004\u008d;óó\u001aª¡aÑ\u0019\u001cÐH\u0087çnrY\r\u0000øË¿³\u0015z÷%¦í\u0012Ôâ\u009f±G=\u000eÈù\u00ad¡\u0010hÎS¼\u001b\u0005ÂÀ\u008d÷ui<Èç±¯J\u0096ÑA¾\tvðÜ» cn*Ç\u0015\u008cÝ\\\u0084ÁO\u00957j\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Á{øà/\u0089gW\u009eãÕ\u0091\r_Dö{½³mêð!¤Y[$\u0013\u0013lJ\u0099\u0081Þùt0\u0096oÇ§s\u009e\u0083ÕÐ\r\\D©³Ìëq\"¯\u0019ÝQd\u0088¡Ç\u0096?\bv©\u00adÐå,Üµ\u000bÃC\u0014º´ñí)\u0019`\u0099_ç\u0097\u000eÎµ\u0005Å}\b´\\ãóF[q$(Ñã\u0096\u009b<RÞ\r\u008fÅ;üË·\u0098o\u0014&áÑ\u0084\u00899@ç{\u00953,êé¥Þ]@\u0014áÏ\u0098\u0087f¾õi\u0091!@ØÄ\u0093«Kz\u0002ù=£õ[¬êg¨\u001fsÖ\b\u0081¡¹_p\u000b\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Áhøí/\u0095gG\u009eíÕ\u009f\r\\Dí{»³GêÆ!»YZ\u0090?Ç¿ÿJ6\u001em¥¥RÜ\u0019\u0013©Kh\u0082\u0019¹«ñv\u0081\u0003¶Zï«$Ë\\V\u0095¶Êì\u0002N;\u0084pÿ¨Fá\u0098\u0016üNe\u0087\u0090¼ùôd-\u009cbá\u009a=Ó\u009e\bñ@2y\u008a®óæ:\u001f\u0080TÕ¶[\u0081$ØÑ\u0013\u0096k<¢Þý\u008f5;\fËG\u0098\u009f\u0014Öá!\u0084y9°ç\u008b\u0095Ã,\u001aéUÞ\u00adWäà?\u0093wUNø\u0099\u009cÑh(ùc·»XòðÍ¡\u0005M\\Ê\u0097©ïG&\u0005qºIX\u0080\u0005Û°\u0013nj\u0005¥´ýa4\u00078}\u000f\u0002V÷\u009d°å\u001a,øs©»\u001d\u0082íÉ¾\u00112XÇ¯¢÷\u001f>Á\u0005³M\n\u0094ÏÛø#fjÇ±¾ùEÀÓ\u0017½_b¦Óí°5k|ÍC\u0087\u008b`ÒÚ\u0019\u008far¨\u0014ÿ\u0087Ç~\u000e#U\u009d\u008a³½Ìä9/~WÔ\u009e6Ág\tÓ0#{p£üê\t\u001dlEÑ\u008c\u000f·}ÿÄ&\u0001i6\u0091¨Ø\t\u0003pK\u008er\u001d¥yí¨\u0014,_C\u0087\u008cÎ\u001bñI9¸`\"«AÓ¯\u001aíMRu°¼íçX/\u0086Ví\u0099\\Á\u0089\bï\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Á|øå/\u0093gY\u009eáÕ¯\rCDÖ{½³[êá!¦YL\u0090\u0019Ç´ÿr6\u0011m¨¥EÜ\u001b\u001cà+\u009frj¹-Á\u0087\beW4\u009f\u0080¦pí#5¯|Z\u008b?Ó\u0082\u001a\\!.i\u0097°Rÿe\u0007ûNZ\u0095#ÝØäC3,{ä\u0082NÉ-\u0011öXPg\u001a¯ýöG=\u0012Eï\u008c\u0089Û\u001aãã*¾q\u0000÷§ÀØ\u0099-Rj*Àã\"¼stÇM7\u0006dÞè\u0097\u001d`x8Åñ\u001bÊi\u0082Ð[\u0015\u0014\"ì¼¥\u001d~d6\u009f\u000f\u0004Øm\u0090³i\u0007\"jú±³\u0017\u008c]Dº\u001d\u0000ÖU®¨gÎ0]\b¤Áù\u009aG\u0010,'S~¦µáÍK\u0004©[ø\u0093Lª¼áï9cp\u0096\u0087óßN\u0016\u0090-âe[¼\u009eó©\u000b7B\u0096\u0099ïÑ\u0014è\u008c?âw+\u008e\u008bÅÖ\u001d+T\u008ekå£&ú\u00981ÚI5\u0080w×Úï/&A}Êµ+Ì~\u0003Èý\u000eÊq\u0093\u0084XÃ ié\u008b¶Ú~nG\u009e\fÍÔA\u009d´jÑ2lû²ÀÀ\u0088yQ¼\u001e\u008bæ\u0015¯´tÍ<1\u0005¨ÒÞ\u009a\tc©(ðð\u0004¹\u009b\u0086ðN\u0016\u0017¬Üë¤\u0001mT:ù\u0002?Ë\\\u0090åX\b!V\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bKRù\u0089\u0088ÁTøÈ/\u0089gG\u009eøÕ°\rQDý{\u008e³Eêä!±YG\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Á{øí/\u0083g\\\u009eíÕ\u0095\r^DÔ{´³Mêùß.èQ±¤zã\u0002IË«\u0094ú\\Ne¾.íöa¿\u0094Hñ\u0010LÙ\u0092âàªYs\u009c<«Ä5\u008d\u0094Ví\u001e\u0013'\u0080ðä¸5A±\nÞÒ\u0011\u009b\u0086¤Ôl%5¤þ×\u0086\u0015O}\u0018Ü 0\u0000C7<nÉ¥\u008eÝ$\u0014ÆK\u0097\u0083#ºÓñ\u0080)\f`ù\u0097\u009cÏ!\u0006ÿ=\u008du4¬ñãÆ\u001bXRù\u0089\u0080Áqøâ/\u0089g@\u009eáÕ½\r\\Dí{¢³I".getBytes(C9415C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1261);
            f27738 = cArr;
            f27737 = 4359863177354950484L;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12003hf
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ ChartboostDelegate mo28813() {
            ChartboostDelegate chartboostDelegateM29010;
            int i = 2 % 2;
            int i2 = f27736 + 27;
            f27735 = i2 % 128;
            if (i2 % 2 == 0) {
                chartboostDelegateM29010 = m29010();
                int i3 = 99 / 0;
            } else {
                chartboostDelegateM29010 = m29010();
            }
            int i4 = f27736 + 19;
            f27735 = i4 % 128;
            int i5 = i4 % 2;
            return chartboostDelegateM29010;
        }

        d(ChartboostDelegate chartboostDelegate, InterfaceC11874cl interfaceC11874cl) {
            this.f27740 = chartboostDelegate;
            this.f27739 = interfaceC11874cl;
        }

        /* JADX INFO: renamed from: ﾇ */
        private ChartboostDelegate m29010() {
            int i = 2 % 2;
            int i2 = f27736 + 79;
            int i3 = i2 % 128;
            f27735 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            ChartboostDelegate chartboostDelegate = this.f27740;
            int i4 = i3 + 33;
            f27736 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return chartboostDelegate;
        }

        public boolean shouldRequestInterstitial(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(ViewConfiguration.getEdgeSlop() >> 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25198), (ViewConfiguration.getTouchSlop() >> 8) + 44).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27736 + 41;
                f27735 = i2 % 128;
                int i3 = i2 % 2;
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            int i4 = f27736 + 99;
            f27735 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public boolean shouldDisplayInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f27735 + 45;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(TextUtils.lastIndexOf("", '0', 0, 0) + 45, (char) (47522 - View.MeasureSpec.getSize(0)), 44 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate == null) {
                int i4 = f27736 + 51;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = f27736 + 73;
            f27735 = i6 % 128;
            if (i6 % 2 != 0) {
                return chartboostDelegate.shouldDisplayInterstitial(str);
            }
            int i7 = 27 / 0;
            return chartboostDelegate.shouldDisplayInterstitial(str);
        }

        public void didCacheInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f27735 + 35;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(KeyEvent.keyCodeFromString("") + 88, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0') + 40).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheInterstitial(str);
            }
            int i4 = f27735 + 37;
            f27736 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            int i2 = f27736 + 73;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(Gravity.getAbsoluteGravity(0, 0) + 127, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4975), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f27740;
            Object obj = null;
            if (chartboostDelegate != null) {
                int i4 = f27735 + 43;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                if (i5 != 0) {
                    super.hashCode();
                    throw null;
                }
            }
            int i6 = f27736 + 1;
            f27735 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        public void didDismissInterstitial(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 172, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 40 - Process.getGidForName("")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            Object obj = null;
            if (chartboostDelegate != null) {
                int i2 = f27735 + 21;
                f27736 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDismissInterstitial(str);
                if (i3 != 0) {
                    super.hashCode();
                    throw null;
                }
            }
            int i4 = f27736 + 93;
            f27735 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void didCloseInterstitial(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(TextUtils.getTrimmedLength("") + Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, (char) ((Process.myPid() >> 22) + 6575), Color.green(0) + 39).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27736 + 95;
                f27735 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCloseInterstitial(str);
                int i4 = f27735 + 53;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didClickInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f27735 + 83;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(251 - View.MeasureSpec.getMode(0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 39).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27736 + 33;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didClickInterstitial(str);
                if (i5 == 0) {
                    throw null;
                }
                int i6 = f27735 + 83;
                f27736 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        public void didDisplayInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 115;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(290 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (33023 - TextUtils.lastIndexOf("", '0', 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 42).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27735 + 55;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDisplayInterstitial(str);
                int i6 = f27736 + 29;
                f27735 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        public void didCompleteInterstitial(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((Process.myTid() >> 22) + 331, (char) (64010 - Gravity.getAbsoluteGravity(0, 0)), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27735 + 39;
                f27736 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCompleteInterstitial(str);
                int i4 = f27735 + 29;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public boolean shouldRequestMoreApps(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((ViewConfiguration.getLongPressTimeout() >> 16) + 373, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6952), 41 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27736 + 39;
                f27735 = i2 % 128;
                int i3 = i2 % 2;
                return chartboostDelegate.shouldRequestMoreApps(str);
            }
            int i4 = f27736 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f27735 = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public void didCacheMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 31;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((ViewConfiguration.getLongPressTimeout() >> 16) + TTAdConstant.VIDEO_INFO_CODE, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42628), 34 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27736 + 75;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCacheMoreApps(str);
                int i6 = f27735 + 1;
                f27736 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        public boolean shouldDisplayMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 81;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 447, (char) (Color.green(0) + 54213), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate == null) {
                return false;
            }
            int i4 = f27736 + 5;
            f27735 = i4 % 128;
            if (i4 % 2 != 0) {
                return chartboostDelegate.shouldDisplayMoreApps(str);
            }
            chartboostDelegate.shouldDisplayMoreApps(str);
            throw null;
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            int i2 = f27736 + 23;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(487 - TextUtils.indexOf((CharSequence) "", '0'), (char) (28571 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 40 - (Process.myPid() >> 22)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27735 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didDismissMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 5;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((Process.myTid() >> 22) + 528, (char) (16451 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27736 + 79;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDismissMoreApps(str);
            }
            int i6 = f27736 + 77;
            f27735 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public void didCloseMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f27735 + 53;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(565 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28210), TextUtils.getTrimmedLength("") + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseMoreApps(str);
            }
            int i4 = f27735 + 49;
            f27736 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void didClickMoreApps(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(600 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27736 + 77;
                f27735 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didClickMoreApps(str);
                int i4 = f27736 + 115;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didDisplayMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 43;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(636 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (9297 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 38).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27735 + 31;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDisplayMoreApps(str);
                if (i5 != 0) {
                    throw null;
                }
            }
            int i6 = f27736 + 19;
            f27735 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(673 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (Color.alpha(0) + 17944), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27735 + 1;
                f27736 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
                if (i3 != 0) {
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
            }
            int i4 = f27735 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f27736 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void didPauseClickForConfirmation(Activity activity) {
            int i = 2 % 2;
            int i2 = f27735 + 35;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(TextUtils.getTrimmedLength("") + IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, (char) Color.blue(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m29011(759 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33126), 27 - TextUtils.lastIndexOf("", '0')).intern(), Activity.class).invoke(this.f27740, activity);
                    return;
                } catch (Throwable unused) {
                }
            }
            int i4 = f27736 + 1;
            f27735 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(786 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (46617 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 45 - View.resolveSize(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27735 + 79;
                f27736 = i2 % 128;
                int i3 = i2 % 2;
                return chartboostDelegate.shouldDisplayRewardedVideo(str);
            }
            int i4 = f27736 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f27735 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public void didCacheRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f27735 + 29;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((ViewConfiguration.getLongPressTimeout() >> 16) + 831, (char) (View.MeasureSpec.getMode(0) + 14398), 40 - TextUtils.getTrimmedLength("")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            Object obj = null;
            if (chartboostDelegate != null) {
                int i4 = f27736 + 77;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCacheRewardedVideo(str);
                if (i5 == 0) {
                    throw null;
                }
            }
            int i6 = f27735 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f27736 = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            super.hashCode();
            throw null;
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            int i2 = f27735 + 17;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(Color.green(0) + 871, (char) (KeyEvent.normalizeMetaState(0) + 35568), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 45).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27735 + 59;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didDismissRewardedVideo(String str) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(((Process.getThreadPriority(0) + 20) >> 6) + 916, (char) (Process.getGidForName("") + 1), 42 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDismissRewardedVideo(str);
                int i2 = f27735 + 33;
                f27736 = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = f27735 + 87;
            f27736 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public void didCloseRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 63;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(TextUtils.lastIndexOf("", '0') + 959, (char) (7331 - (Process.myTid() >> 22)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27735 + 65;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCloseRewardedVideo(str);
            }
            int i6 = f27735 + 77;
            f27736 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public void didClickRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 81;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(TextUtils.indexOf("", "") + DescriptorProtos.Edition.EDITION_PROTO2_VALUE, (char) (63460 - KeyEvent.getDeadChar(0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                chartboostDelegate.didClickRewardedVideo(str);
                int i4 = f27735 + 89;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didCompleteRewardedVideo(String str, int i) {
            int i2 = 2 % 2;
            int i3 = f27736 + 1;
            f27735 = i3 % 128;
            int i4 = i3 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(1038 - TextUtils.getTrimmedLength(""), (char) (4207 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 43).intern(), str, Integer.valueOf(i));
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i5 = f27735 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f27736 = i5 % 128;
                int i6 = i5 % 2;
                chartboostDelegate.didCompleteRewardedVideo(str, i);
            }
        }

        public void didDisplayRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f27735 + 89;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(1082 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64845), 41 - TextUtils.lastIndexOf("", '0')).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27736 + 9;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
            int i6 = f27735 + 113;
            f27736 = i6 % 128;
            int i7 = i6 % 2;
        }

        public void willDisplayVideo(String str) {
            int i = 2 % 2;
            int i2 = f27735 + 73;
            f27736 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(ImageFormat.getBitsPerPixel(0) + 1124, (char) Color.alpha(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i4 = f27736 + 83;
                f27735 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.willDisplayVideo(str);
            }
        }

        public void didCacheInPlay(String str) {
            int i = 2 % 2;
            int i2 = f27736 + 47;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(TextUtils.lastIndexOf("", '0', 0) + 1159, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionGroup(0L) + 33).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheInPlay(str);
            }
            int i4 = f27736 + 3;
            f27735 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011(1192 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 57197), 38 - View.resolveSize(0, 0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                int i2 = f27735 + 17;
                f27736 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                if (i3 != 0) {
                    int i4 = 13 / 0;
                }
                int i5 = f27736 + 7;
                f27735 = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public void didInitialize() {
            int i = 2 % 2;
            int i2 = f27736 + 71;
            f27735 = i2 % 128;
            int i3 = i2 % 2;
            C11848bm.this.m28837(this, this.f27739, m29011((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1229, (char) (Color.rgb(0, 0, 0) + 16777216), 32 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f27740;
            if (chartboostDelegate != null) {
                chartboostDelegate.didInitialize();
                int i4 = f27735 + 45;
                f27736 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m29011(int i, char c, int i2) {
            String str;
            synchronized (C11862c.f28047) {
                char[] cArr = new char[i2];
                C11862c.f28048 = 0;
                while (C11862c.f28048 < i2) {
                    cArr[C11862c.f28048] = (char) ((((long) f27738[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f27737)) ^ ((long) c));
                    C11862c.f28048++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29002(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f27725;
            char c = f27722;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c;
                        C11970g.f28959 = C11970g.f28964 % c;
                        C11970g.f28966 = C11970g.f28965 / c;
                        C11970g.f28960 = C11970g.f28965 % c;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                            int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28999(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f27724;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f27718;
                if (bArr != null) {
                    i5 = (byte) (bArr[f27721 + i] + i4);
                } else {
                    i5 = (short) (f27720[f27721 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f27721 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f27723);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f27718;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f27720;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
