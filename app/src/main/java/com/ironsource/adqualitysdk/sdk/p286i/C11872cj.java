package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.google.common.base.Ascii;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.p298ui.AdActivity;
import com.vungle.ads.internal.p298ui.VungleActivity;
import com.vungle.ads.internal.p298ui.VungleWebClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cj */
/* JADX INFO: loaded from: classes6.dex */
public final class C11872cj extends AbstractC11840be {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28149 = 1;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28150;

    /* JADX INFO: renamed from: ﻏ */
    private static short[] f28151;

    /* JADX INFO: renamed from: ﻛ */
    private static int[] f28153 = {-1042144440, -894361575, 1687238525, 94777853, -1508931439, -958623642, -255618374, 170393536, 577279152, 367525201, 196151246, 1640754158, 724313430, 692982775, -1897333014, -367152316, -501790103, -1964716705};

    /* JADX INFO: renamed from: ｋ */
    private static int f28154 = 1928006198;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28155 = 11;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28152 = -872291336;

    /* JADX INFO: renamed from: ﾒ */
    private static byte[] f28156 = {3, -6, -4, -54, 8, 49, -50, 47, -54, 8, 1, -9, 8, -2, -1, 5, Ascii.f22503VT, -13, Ascii.f22490CR, -11, 17, 34, -35, 35, Ascii.SUB, 5, Ascii.f22503VT, -13, Ascii.f22490CR, -11, 17, 34, -35, 35, 19, -59, -12, 71, -62, Ascii.f22503VT, -13, -4, Ascii.f22490CR, -15, 6, 5, 59, -69, Ascii.f22499SI, 3, 51, -55, -7, 5, -7, -7, -1, 72, -63, -2, Ascii.f22492FF, -1, Ascii.f22503VT, -13, -4, Ascii.f22490CR, -15, 6, 37, -27, 35, -2, 3, -14, 3, -13, Ascii.CAN, 17, -20, 35, -3, 35, -49, Ascii.f22490CR, -9, 0, Ascii.f22490CR, Ascii.f22502US, 5, Ascii.f22490CR, -9, 9, -15, 1, 10, Ascii.f22494GS, -24, 35, -49, Ascii.f22490CR, -9, 0, Ascii.f22490CR, Ascii.f22502US, -1, Ascii.DC2, -4, 19, -28, Ascii.f22490CR, -9, 0, Ascii.f22490CR, Ascii.f22502US, Ascii.f22500SO, Ascii.DC2, -4, 19, -28, Ascii.f22490CR, -9, 0, Ascii.f22490CR, Ascii.f22502US, Ascii.DC4, -69, Ascii.f22499SI, 3, 51, -55, -7, 5, -7, -7, -1, 72, -63, -2, Ascii.f22492FF, 5, 35, -45, 9, 0, -13, Ascii.f22499SI, -16, 7, 0, -9, 47, -31, -14, Ascii.DC2, Ascii.f22502US, 1, 35, -45, 9, 0, -13, Ascii.f22499SI, -16, 7, 0, -9, 47, Ascii.f22503VT, Ascii.f22490CR, -9, 9, -15, 1, 10, Ascii.f22494GS, -24, 35, -43, Ascii.f22503VT, -8, -11, Ascii.f22503VT, -11, 1, 1, Ascii.f22490CR, -15, 6, 37, -2, 6, 9, -8, 8, 2, 2, -11, Ascii.f22493FS, -1, 35, -35, -1, 1, -14, 17, -22, Ascii.DC2, 19, 7, Ascii.f22490CR, -9, 9, -15, 1, 10, Ascii.f22494GS, -24, 35, -35, -1, 1, -14, 17, -22, Ascii.DC2, 19, Ascii.f22499SI, -6, Ascii.f22494GS, -31, 6, 9, -8, 8, 2, 2, -11, -4, Ascii.f22503VT, 19, -19, -7, 10, 1, -4, -3, 5, 2, Ascii.f22498RS, -49, Ascii.f22499SI, -2, 8, Ascii.f22492FF, -7, 5, -11, 0, Ascii.f22499SI, Ascii.DC2, -18, -15, 19, -11, -4, 3, 8, 17, -32, Ascii.f22499SI, -2, 4, 10, 1, -5, 19, -14, -1, 1, -14, 17, -22, Ascii.DC2, 19, -33, 10};

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m29562(AppNode appNode) {
        int i = 2 % 2;
        int i2 = f28149 + 73;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        String strM29571 = m29571(appNode);
        int i4 = f28150 + 13;
        f28149 = i4 % 128;
        if (i4 % 2 != 0) {
            return strM29571;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29563(Placement placement) {
        int i = 2 % 2;
        int i2 = f28149 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28150 = i2 % 128;
        if (i2 % 2 != 0) {
            m29567(placement);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM29567 = m29567(placement);
        int i3 = f28149 + 7;
        f28150 = i3 % 128;
        int i4 = i3 % 2;
        return strM29567;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29565(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f28150 + 39;
        f28149 = i2 % 128;
        int i3 = i2 % 2;
        String strM29574 = m29574(adUnit);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = f28150 + 23;
        f28149 = i5 % 128;
        int i6 = i5 % 2;
        return strM29574;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29566(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = 2 % 2;
        int i2 = f28150 + 35;
        f28149 = i2 % 128;
        int i3 = i2 % 2;
        String strM29570 = m29570(cacheableReplacement);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return strM29570;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ AdPayload.AdUnit m29568(AdPayload adPayload) {
        int i = 2 % 2;
        int i2 = f28149 + 101;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.AdUnit adUnitM29564 = m29564(adPayload);
        int i4 = f28150 + 89;
        f28149 = i4 % 128;
        if (i4 % 2 != 0) {
            return adUnitM29564;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ AdPayload.TemplateSettings m29569(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f28149 + 115;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.TemplateSettings templateSettingsM29561 = m29561(adUnit);
        int i4 = f28149 + 83;
        f28150 = i4 % 128;
        int i5 = i4 % 2;
        return templateSettingsM29561;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ boolean m29576(Placement placement) {
        int i = 2 % 2;
        int i2 = f28150 + 3;
        f28149 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29572(placement);
        }
        m29572(placement);
        throw null;
    }

    public C11872cj(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final String mo28809() {
        int i = 2 % 2;
        int i2 = f28149 + 99;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = mo28831().split(m29575(new int[]{-1283118939, -775400379}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1).intern())[0];
            int i4 = f28149 + 3;
            f28150 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo28831() {
        int i = 2 % 2;
        int i2 = f28149 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strM30451 = C12019hv.m30362().m30363().m30451(BuildConfig.class, m29573(Color.argb(0, 0, 0, 0) - 1928006198, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 872291429 - ImageFormat.getBitsPerPixel(0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-12) - Gravity.getAbsoluteGravity(0, 0)).intern());
            int i4 = f28150 + 73;
            f28149 = i4 % 128;
            int i5 = i4 % 2;
            return strM30451;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0490  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1836618638:
                b = !str.equals(m29573(Color.rgb(0, 0, 0) - 1911228968, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 872291401 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "") - 12).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1791176561:
                b = !str.equals(m29573(Gravity.getAbsoluteGravity(0, 0) - 1928006118, (short) (ViewConfiguration.getTapTimeout() >> 16), AndroidCharacter.getMirror('0') + 7194, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-12) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1560947009:
                b = !str.equals(m29573((-1928006084) - View.MeasureSpec.getMode(0), (short) View.MeasureSpec.getSize(0), 872291435 - TextUtils.getCapsMode("", 0, 0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) - 12).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1494265129:
                if (!str.equals(m29575(new int[]{-920470389, -49309993, -1171207921, -1664330345, 1278987029, -44447764, -405732313, 1774254670, -2088724004, -862484961, 1253997974, 526679580, -1121698137, 1034810130, -1299908678, -754882432, 851316401, 1779005482, -1123991814, 1124108396, -473352222, -486349652}, 41 - TextUtils.indexOf("", "")).intern())) {
                    b = -1;
                } else {
                    int i2 = f28149 + 95;
                    f28150 = i2 % 128;
                    b = i2 % 2 == 0 ? Ascii.CAN : (byte) 69;
                }
                break;
            case -1435839138:
                if (!str.equals(m29573(KeyEvent.normalizeMetaState(0) - 1928006043, (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.getOffsetAfter("", 0) + 872291406, (byte) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getOffsetAfter("", 0) - 12).intern())) {
                    b = -1;
                } else {
                    int i3 = f28149 + 61;
                    f28150 = i3 % 128;
                    if (i3 % 2 == 0) {
                        b = 15;
                    } else {
                        b = 1;
                    }
                }
                break;
            case -1179107681:
                b = !str.equals(m29575(new int[]{152236537, 496036789, 796958915, -1001796568, 939277886, 1901796373}, 9 - TextUtils.indexOf("", "", 0)).intern()) ? (byte) -1 : Ascii.f22491EM;
                break;
            case -609786639:
                b = !str.equals(m29573((-1928006000) - Color.red(0), (short) TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0') + 872291419, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 13).intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case -498709917:
                if (!str.equals(m29573((ViewConfiguration.getScrollDefaultDelay() >> 16) - 1928006031, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 872291409, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), Color.green(0) - 12).intern())) {
                    b = -1;
                } else {
                    int i4 = f28150 + 3;
                    f28149 = i4 % 128;
                    b = i4 % 2 != 0 ? Ascii.DC2 : (byte) 81;
                }
                break;
            case -498060603:
                b = !str.equals(m29573((ViewConfiguration.getEdgeSlop() >> 16) - 1928006009, (short) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 872291415, (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.getDeadChar(0, 0) - 12).intern()) ? (byte) -1 : (byte) 20;
                break;
            case -486531311:
                b = !str.equals(m29575(new int[]{-1046373780, 1354700355, 995675378, -992316729, 749955776, 702262011, -711926745, 412896964}, ExpandableListView.getPackedPositionChild(0L) + 15).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -393802555:
                if (!str.equals(m29573(ImageFormat.getBitsPerPixel(0) - 1928005989, (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 872291418 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-12) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i5 = f28149 + 113;
                    f28150 = i5 % 128;
                    int i6 = i5 % 2;
                    b = 22;
                }
                break;
            case -43797322:
                b = !str.equals(m29575(new int[]{1671839080, -395044219, -731413892, -1984849189, 1903779156, -423120963, 1747384394, -1950213578, -649015507, -1322512638}, 20 - KeyEvent.keyCodeFromString("")).intern()) ? (byte) -1 : (byte) 14;
                break;
            case 307971376:
                if (!str.equals(m29575(new int[]{638043018, 287574817, -152780300, -1738280296, -1620089098, 1750373886}, TextUtils.indexOf("", "", 0, 0) + 12).intern())) {
                    b = -1;
                } else {
                    int i7 = f28149 + 39;
                    f28150 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 8;
                }
                break;
            case 320151695:
                if (!str.equals(m29575(new int[]{-754847207, 1436295650, 1115695231, 1302865483, 336005875, -1400482861, 390496629, -661282021}, 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i9 = f28149 + 49;
                    f28150 = i9 % 128;
                    b = i9 % 2 == 0 ? (byte) 17 : (byte) 63;
                }
                break;
            case 324239304:
                b = !str.equals(m29575(new int[]{-910942706, 2084071069, 1699862367, -2016477094, -1470297747, -620638784, -711926745, 412896964}, 14 - TextUtils.getOffsetAfter("", 0)).intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case 389759008:
                b = !str.equals(m29573(MotionEvent.axisFromString("") - 1928006136, (short) ((Process.getThreadPriority(0) + 20) >> 6), 872291401 - (ViewConfiguration.getTouchSlop() >> 8), (byte) Color.red(0), Color.green(0) - 12).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 484680813:
                b = !str.equals(m29575(new int[]{520839364, 1092118913, -126979560, 898705053}, KeyEvent.normalizeMetaState(0) + 7).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 870529955:
                b = !str.equals(m29575(new int[]{115899603, 1029712336, 1932139533, 137634115}, Drawable.resolveOpacity(0, 0) + 7).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 961844241:
                b = !str.equals(m29573(KeyEvent.getDeadChar(0, 0) - 1928006094, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 872291402, (byte) TextUtils.getCapsMode("", 0, 0), (-12) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 989853769:
                if (!str.equals(m29573((-1928006174) - ExpandableListView.getPackedPositionType(0L), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 872291435, (byte) ExpandableListView.getPackedPositionType(0L), (-12) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1205766784:
                b = !str.equals(m29575(new int[]{152236537, 496036789, -1604997149, -1997799483, -337764540, -1816650128, 435193126, 270457101}, 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 1208038126:
                if (!str.equals(m29575(new int[]{152236537, 496036789, -1844437284, -1405817936, -948510046, 92466934, 581474105, 1918029375}, 14 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    b = -1;
                } else {
                    int i10 = f28150 + 25;
                    f28149 = i10 % 128;
                    b = i10 % 2 != 0 ? Ascii.ESC : (byte) 58;
                }
                break;
            case 1442693170:
                b = !str.equals(m29575(new int[]{822688763, 783621406, -1679012579, 999034166, 1392273616, -1531621490, -385574980, 2073665935, 906145932, 673613571}, 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1505622627:
                if (!str.equals(m29573((ViewConfiguration.getEdgeSlop() >> 16) - 1928006110, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 872291403 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-11) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i11 = f28150 + 15;
                    f28149 = i11 % 128;
                    b = i11 % 2 != 0 ? (byte) 7 : Ascii.f22498RS;
                }
                break;
            case 1839869899:
                if (!str.equals(m29573((-1928006127) - (Process.myTid() >> 22), (short) TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 872291401, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-12) - View.MeasureSpec.getSize(0)).intern())) {
                    b = -1;
                } else {
                    int i12 = f28149 + 63;
                    f28150 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 4;
                }
                break;
            case 1853648591:
                b = !str.equals(m29573(ExpandableListView.getPackedPositionChild(0L) - 1928006058, (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 872291402, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") - 12).intern()) ? (byte) -1 : Ascii.f22490CR;
                break;
            case 1930966324:
                if (!str.equals(m29575(new int[]{152236537, 496036789, -792638637, -1901996650, -870021443, 57475699, 581474105, 1918029375}, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i14 = f28150 + 65;
                    f28149 = i14 % 128;
                    int i15 = i14 % 2;
                    b = Ascii.SUB;
                }
                break;
            case 1982630644:
                b = !str.equals(m29575(new int[]{-910942706, 2084071069, 390496629, -661282021}, 6 - Color.red(0)).intern()) ? (byte) -1 : Ascii.f22503VT;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return AdActivity.class;
            case 2:
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case 8:
                return BannerAdSize.class;
            case 9:
            case 10:
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case 12:
                return BaseAdListener.class;
            case 13:
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                return RewardedAd.class;
            case 22:
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29575(new int[]{1869783570, 100139148, 298542612, -1143351861, 2049775208, 391208029}, ((Process.getThreadPriority(0) + 20) >> 6) + 9).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11872cj.m29568((AdPayload) list.get(0));
            }
        });
        map.put(m29575(new int[]{1869783570, 100139148, 1092665922, 396769155}, 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11872cj.m29562((AppNode) list.get(0));
            }
        });
        map.put(m29573(ImageFormat.getBitsPerPixel(0) - 1928005971, (short) Color.blue(0), View.resolveSize(0, 0) + 872291439, (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-13) - ImageFormat.getBitsPerPixel(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11872cj.m29566((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m29575(new int[]{-2142936407, 1835830212, 815982490, -507758233, -970038424, 1524445513}, 11 - ExpandableListView.getPackedPositionType(0L)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11872cj.m29565((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m29575(new int[]{573086588, 1720921744, 1747384394, -1950213578, -649015507, -1322512638, 1137947251, 335441656}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11872cj.m29563((Placement) list.get(0));
            }
        });
        map.put(m29573(ExpandableListView.getPackedPositionChild(0L) - 1928005945, (short) ((-1) - MotionEvent.axisFromString("")), 872291439 - ExpandableListView.getPackedPositionGroup(0L), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-12) - View.MeasureSpec.getMode(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11872cj.m29569((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m29573((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1928005927, (short) ((-1) - ImageFormat.getBitsPerPixel(0)), 872291441 - Color.blue(0), (byte) TextUtils.getOffsetBefore("", 0), (-16777228) - Color.rgb(0, 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Boolean.valueOf(C11872cj.m29576((Placement) list.get(0)));
            }
        });
        int i2 = f28149 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ｋ */
    private static AdPayload.AdUnit m29564(AdPayload adPayload) {
        int i = 2 % 2;
        int i2 = f28150 + 37;
        f28149 = i2 % 128;
        int i3 = i2 % 2;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        int i4 = f28150 + 83;
        f28149 = i4 % 128;
        int i5 = i4 % 2;
        return adUnit;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29571(AppNode appNode) {
        int i = 2 % 2;
        int i2 = f28150 + 65;
        f28149 = i2 % 128;
        int i3 = i2 % 2;
        String appId = appNode.getAppId();
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return appId;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29570(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = 2 % 2;
        int i2 = f28149 + 95;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        String url = cacheableReplacement.getUrl();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return url;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29574(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f28149 + 65;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        String campaign = adUnit.getCampaign();
        int i4 = f28150 + 9;
        f28149 = i4 % 128;
        int i5 = i4 % 2;
        return campaign;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29567(Placement placement) {
        int i = 2 % 2;
        int i2 = f28150 + 9;
        f28149 = i2 % 128;
        int i3 = i2 % 2;
        String referenceId = placement.getReferenceId();
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = f28149 + 49;
        f28150 = i5 % 128;
        int i6 = i5 % 2;
        return referenceId;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static AdPayload.TemplateSettings m29561(AdPayload.AdUnit adUnit) {
        int i = 2 % 2;
        int i2 = f28149 + 21;
        f28150 = i2 % 128;
        if (i2 % 2 != 0) {
            adUnit.getTemplateSettings();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        AdPayload.TemplateSettings templateSettings = adUnit.getTemplateSettings();
        int i3 = f28149 + 95;
        f28150 = i3 % 128;
        int i4 = i3 % 2;
        return templateSettings;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static boolean m29572(Placement placement) {
        int i = 2 % 2;
        int i2 = f28149 + 53;
        f28150 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        int i4 = f28149 + 37;
        f28150 = i4 % 128;
        int i5 = i4 % 2;
        return zIsRewardedVideo;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29575(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f28153.clone();
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

    /* JADX INFO: renamed from: ﾒ */
    private static String m29573(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28155;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28156;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28154 + i] + i4);
                } else {
                    i5 = (short) (f28151[f28154 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28154 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28152);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28156;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28151;
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
