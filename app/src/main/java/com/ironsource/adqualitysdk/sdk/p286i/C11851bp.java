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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bp */
/* JADX INFO: loaded from: classes6.dex */
public final class C11851bp extends AbstractC11840be {

    /* JADX INFO: renamed from: ﱡ */
    private static short[] f27781 = null;

    /* JADX INFO: renamed from: ﺙ */
    private static int f27782 = 1;

    /* JADX INFO: renamed from: ﻏ */
    private static int f27783 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static int f27784 = 165;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27785 = 6;

    /* JADX INFO: renamed from: ｋ */
    private static int f27786 = -761759429;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27787 = -542304017;

    /* JADX INFO: renamed from: ﾒ */
    private static byte[] f27788 = {Ascii.f22502US, -76, -90, 94, -84, 100, -64, -113, 124, -114, 121, -78, 94, -113, 122, -108, -74, 114, 88, -76, 98, -84, -80, 99, -88, 94, -11, 116, -78, 94, -81, 90, -76, -106, 112, 91, -83, Ascii.f22492FF, -50, -5, 51, 37, -35, 43, -29, 63, Ascii.f22500SO, -5, Ascii.f22490CR, -8, 49, -35, Ascii.f22500SO, -7, 19, 35, -45, -43, Base64.padSymbol, -37, 67, -33, -18, 43, -19, 40, -47, Base64.padSymbol, -18, 41, -13, -27, 17, 71, -45, 65, -37, -49, 66, -41, Base64.padSymbol, -108, -123, -39, -51, -3, 19, -47, Base64.padSymbol, -50, 73, -45, 5, Ascii.f22499SI, 74, -36, 9, -63, 99, -62, 78, -71, -80, 106, -62, 96, 86, -76, 92, -62, -62, 6, 34, 32, -14, 51, 44, -35, 46, -58, -61, 62, -12, 5, Ascii.f22502US, -103, 39, Ascii.f22493FS, 127, 42, -111, SignedBytes.MAX_POWER_OF_TWO, 113, 69, Ascii.f22490CR, -63, 79, 70, -67, -66, 70, -70, 78, -99, 98, 82, -74, 72, -66, -70, 73, -62, -84, Ascii.f22492FF, 67, 84, 97, 67, 97, 77, 77, 73, 93, 78, 49, 108, 79, 91, 42, 119, 49, 9, -67, -60, 46, -70, -62, -49, 36, -33, Ascii.SYN, -69, 47, -32, 19, -39, 4, SignedBytes.MAX_POWER_OF_TWO, 95, 122, 41, 34, -119, 17, 127, Ascii.DLE, 0, -11, 69, -25, 63, Ascii.f22490CR, Ascii.f22499SI, 104, -30, 100, -36, 108, 103, 120, -75, 115, 100, -54, -100, -52, -114, -86, 104, -30, 109, 104, 122, Ascii.f22499SI, -26, -64, -30, -70, -22, -29, -42, -111, -17, -30, -56, -6, -54, Ascii.f22492FF, -107, -56, -26, -66, -36, -36, Ascii.f22492FF, 8, -126, 4, 124, Ascii.f22492FF, 7, Ascii.CAN, 85, 19, 4, 106, 60, 99, 7, Ascii.f22492FF, 118, Ascii.f22498RS, Ascii.f22500SO, 89, 76, 42, 113, 94, 92, 46, 113, 75, 74, 89, 73, 79, 79, 94, 53, 117, 68, 83, 6, -88, -90, 122, -59, -125, -126, -108, -110, 87, -96, 113, Ascii.f22503VT, 82, 84, 2, 76, 76, 42, 82, 56, 91, 88, Ascii.f22492FF, 124, 8, 106, 44, 93, 8, Ascii.ESC, -31, Ascii.f22500SO, Ascii.f22490CR, -68, Ascii.f22492FF, Ascii.DC2, Ascii.DC2, -63, Ascii.CAN, -40, 7, -74, 4, 62, -4, 73, -20, 81, -23, -22, Ascii.f22498RS, -15, 8, 76, -54, -68, -119, 93, -54, 104, -73, 94, -115, 110, -82, 95, 4, 126, -111, -120, 43, 50, -123, 32, -124, 53, Ascii.f22499SI, -49, -67, -43, -42, -67, -22, -70, -51, -49, -67, -51, -53, -66, -55, -40, -56, -62, -62, -51, -44, 19, 125, 118, 35, 119, 38, 111, 118, Ascii.f22502US, 119, Ascii.f22499SI, -116, 33, Ascii.f22502US, 113, 33, 123, 112, 125, 46, 126, 116, 116, 33, 42, Ascii.DLE, -22, Ascii.f22503VT, Ascii.DC4, Ascii.SYN, -32, -36, -23, -3, -24, -22, Ascii.CAN, -24, Ascii.DC2, -34, Ascii.f22490CR, -36, 4, -25, -15, -2, Ascii.SYN};

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ Enum m29054(String str) {
        int i = 2 % 2;
        int i2 = f27782 + 87;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        Enum enumM29058 = m29058(str);
        int i4 = f27783 + 7;
        f27782 = i4 % 128;
        if (i4 % 2 != 0) {
            return enumM29058;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    static /* synthetic */ Enum m29056(String str) {
        int i = 2 % 2;
        int i2 = f27782 + 101;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        Enum enumM29061 = m29061(str);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return enumM29061;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ Object m29063(Ad ad) {
        int i = 2 % 2;
        int i2 = f27783 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29057 = m29057(ad);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return objM29057;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Object m29067(AdContainer adContainer) {
        int i = 2 % 2;
        int i2 = f27783 + 39;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29062 = m29062(adContainer);
        int i4 = f27782 + 39;
        f27783 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return objM29062;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Object m29068(Ad ad) {
        int i = 2 % 2;
        int i2 = f27783 + 11;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29060 = m29060(ad);
        int i4 = f27783 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27782 = i4 % 128;
        if (i4 % 2 != 0) {
            return objM29060;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Object m29069(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f27782 + 31;
        f27783 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29080(adResponse);
        }
        m29080(adResponse);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Object m29070(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f27782 + 1;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29065 = m29065(adSet);
        int i4 = f27782 + 5;
        f27783 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM29065;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Object m29071(ContextData contextData) {
        int i = 2 % 2;
        int i2 = f27783 + 91;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29066 = m29066(contextData);
        int i4 = f27782 + 43;
        f27783 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM29066;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Object m29072(Ad ad) {
        int i = 2 % 2;
        int i2 = f27782 + 59;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29055 = m29055(ad);
        int i4 = f27782 + 41;
        f27783 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM29055;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Object m29073(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f27782 + 61;
        f27783 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29064(adResponse);
        }
        m29064(adResponse);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ Object m29076(Ad ad) {
        int i = 2 % 2;
        int i2 = f27782 + 85;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29079 = m29079(ad);
        int i4 = f27782 + 19;
        f27783 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM29079;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Enum m29078(String str) {
        int i = 2 % 2;
        int i2 = f27782 + 81;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        Enum enumM29059 = m29059(str);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = f27782 + 17;
        f27783 = i5 % 128;
        int i6 = i5 % 2;
        return enumM29059;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Object m29081(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f27783 + 109;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        Object objM29077 = m29077(adSet);
        int i4 = f27782 + 59;
        f27783 = i4 % 128;
        int i5 = i4 % 2;
        return objM29077;
    }

    public C11851bp(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0558  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -2044438337:
                if (!str.equals(m29074(TextUtils.lastIndexOf("", '0') + 761759564, (short) (Color.red(0) - 6), Process.getGidForName("") + 542304100, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 75), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 6).intern())) {
                    b = -1;
                } else {
                    int i2 = f27783 + 13;
                    f27782 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 7;
                }
                break;
            case -1769689844:
                if (!str.equals(m29075("\u000f￭\u000e￩\u000b\u0004\ufff3\t\u0002", TextUtils.lastIndexOf("", '0', 0, 0) + 10, true, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 260).intern())) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -1716191362:
                if (!str.equals(m29074((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 761759552, (short) ((-91) - (Process.myPid() >> 22)), 542304082 - TextUtils.getCapsMode("", 0, 0), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 56), (-7) - View.resolveSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1405271692:
                if (!str.equals(m29075("\u0003\u0010\uffff￬\uffff�\u0013�\u0006\uffff\f\ufff0\u0003\uffff\u0011ￛ\ufffe\ufffb\n\u000e\uffff\f￨\ufffb\u000e", ExpandableListView.getPackedPositionGroup(0L) + 25, false, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, 267 - Color.red(0)).intern())) {
                    b = -1;
                } else {
                    int i4 = f27782 + 23;
                    int i5 = i4 % 128;
                    f27783 = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 7;
                    f27782 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 16;
                }
                break;
            case -1401317165:
                if (!str.equals(m29074(761759673 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (TextUtils.getCapsMode("", 0, 0) - 68), 542304103 - (ViewConfiguration.getTouchSlop() >> 8), (byte) ((-55) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) - 6).intern())) {
                    b = -1;
                } else {
                    int i9 = f27782 + 21;
                    f27783 = i9 % 128;
                    b = i9 % 2 == 0 ? Ascii.DC4 : (byte) 105;
                }
                break;
            case -1304544044:
                if (!str.equals(m29074(761759652 - Color.red(0), (short) ((KeyEvent.getMaxKeyCode() >> 16) + 47), 542304095 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (24 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (-7) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -1062227179:
                if (!str.equals(m29074(761759429 - KeyEvent.normalizeMetaState(0), (short) ((-6) - Color.alpha(0)), Color.red(0) + 542304116, (byte) (TextUtils.getCapsMode("", 0, 0) - 85), (-7) - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -808014786:
                if (!str.equals(m29074(TextUtils.lastIndexOf("", '0') + 761759601, (short) ((-121) - ExpandableListView.getPackedPositionGroup(0L)), 542304090 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (TextUtils.indexOf("", "") + 69), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 8).intern())) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case -595852006:
                if (!str.equals(m29075("￨\r￬\u000e\u0001\b￡\u0000\r\r\u0004\u0011", 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, 12 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 262).intern())) {
                    b = -1;
                } else {
                    int i10 = f27783 + 101;
                    f27782 = i10 % 128;
                    b = i10 % 2 != 0 ? (byte) 10 : SignedBytes.MAX_POWER_OF_TWO;
                }
                break;
            case -560158238:
                if (!str.equals(m29074(View.MeasureSpec.getSize(0) + 761759466, (short) ((Process.myTid() >> 22) - 5), 542304089 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (Color.rgb(0, 0, 0) + 16777259), (-7) - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -541364416:
                if (str.equals(m29075("\uffde\u0001\uffde\u0000\u0011\u0006\u0013\u0006\u0011\u0016￦\u000b￪\f\uffff\u0006", Color.argb(0, 0, 0, 0) + 16, false, 10 - TextUtils.indexOf("", "", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 264).intern())) {
                    int i11 = f27783 + 79;
                    f27782 = i11 % 128;
                    if (i11 % 2 != 0) {
                        b = 0;
                    } else {
                        b = 1;
                    }
                } else {
                    b = -1;
                }
                break;
            case -520974940:
                if (!str.equals(m29075("￭\uffffￜ\u0000\u000e\t\n\u000b\u000e\u0000", 10 - ExpandableListView.getPackedPositionGroup(0L), true, Color.blue(0) + 3, Color.argb(0, 0, 0, 0) + 266).intern())) {
                    b = -1;
                } else {
                    b = Ascii.NAK;
                }
                break;
            case -235933147:
                if (!str.equals(m29074((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 761759540, (short) Color.green(0), 542304082 - TextUtils.getOffsetAfter("", 0), (byte) (Color.alpha(0) - 41), TextUtils.lastIndexOf("", '0', 0, 0) - 6).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -204096109:
                if (!str.equals(m29074(761759483 - TextUtils.lastIndexOf("", '0', 0), (short) (116 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 542304116 - Gravity.getAbsoluteGravity(0, 0), (byte) (66 - ((byte) KeyEvent.getModifierMetaStateMask())), ((byte) KeyEvent.getModifierMetaStateMask()) - 6).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -93733047:
                if (!str.equals(m29074(View.MeasureSpec.makeMeasureSpec(0, 0) + 761759525, (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 11), 542304095 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (View.resolveSize(0, 0) - 92), (ViewConfiguration.getScrollBarSize() >> 8) - 7).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -32161126:
                if (!str.equals(m29074(Color.argb(0, 0, 0, 0) + 761759582, (short) (View.MeasureSpec.getSize(0) - 82), 542304089 - TextUtils.lastIndexOf("", '0'), (byte) ((-6) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 7).intern())) {
                    b = -1;
                } else {
                    int i12 = f27782 + 73;
                    f27783 = i12 % 128;
                    b = i12 % 2 == 0 ? Ascii.f22503VT : (byte) 49;
                }
                break;
            case 2115:
                if (!str.equals(m29075("\u0012\uffef", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, false, -TextUtils.indexOf((CharSequence) "", '0'), 247 - (Process.myTid() >> 22)).intern())) {
                    b = -1;
                } else {
                    int i13 = f27782 + 81;
                    f27783 = i13 % 128;
                    int i14 = i13 % 2;
                    b = 23;
                }
                break;
            case 63090975:
                if (!str.equals(m29075("\u0007\ufff6\b\u0017￤", 5 - (ViewConfiguration.getLongPressTimeout() >> 16), false, 3 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 258).intern())) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case 99044255:
                if (!str.equals(m29075("\u0006\ufffe￼\ufffa\u0005￩\ufffe\t\u0012￭\r\u0007\ufffe", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, true, ExpandableListView.getPackedPositionGroup(0L) + 6, 268 - TextUtils.indexOf("", "", 0)).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 515339810:
                if (!str.equals(m29074(761759616 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((-80) - View.getDefaultSize(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 542304103, (byte) ((-45) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (-7) - TextUtils.getOffsetBefore("", 0)).intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22500SO;
                }
                break;
            case 957243679:
                if (!str.equals(m29074((ViewConfiguration.getFadingEdgeLength() >> 16) + 761759631, (short) (ImageFormat.getBitsPerPixel(0) - 35), 542304084 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (74 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-6) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC2;
                }
                break;
            case 1228411167:
                if (!str.equals(m29075("\u0005\ufffa\u0002\r\u0002\r\f\u000b\ufffe\r\u0007￢\u000b\ufffe\u0007\ufffe\r\f\u0002￥\r\u0007\ufffe\u000f\uffde�ￚ", 26 - ExpandableListView.getPackedPositionChild(0L), true, 12 - Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 268).intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 1564529113:
                if (!str.equals(m29075("\t\n\uffde￼\u000f￼\uffdf\u000f\u0013\u0000\u000f", Color.green(0) + 11, true, 3 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0) + 267).intern())) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case 1955888231:
                if (str.equals(m29074(761759625 - TextUtils.getOffsetAfter("", 0), (short) ((-24) - Color.argb(0, 0, 0, 0)), 542304082 - Color.argb(0, 0, 0, 0), (byte) (TextUtils.indexOf("", "") - 42), (-7) - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b = Ascii.f22499SI;
                } else {
                    b = -1;
                }
                break;
            case 2035398868:
                if (!str.equals(m29075("\u0012\t\ufffe\uffde\u000f\ufffe\u0007\r￭", 8 - Process.getGidForName(""), false, 3 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionChild(0L) + 269).intern())) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case 8:
                return AdContainer.RenderingProperties.PlacementType.class;
            case 9:
                return AdContainer.EventType.class;
            case 10:
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case 12:
                return InMobiSdk.class;
            case 13:
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27782 + 99;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        String version = InMobiSdk.getVersion();
        int i4 = f27782 + 41;
        f27783 = i4 % 128;
        if (i4 % 2 == 0) {
            return version;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29074(761759691 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 83), Color.blue(0) + 542304120, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 3), (-7) - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29078((String) list.get(0));
            }
        });
        map.put(m29075("\u0002\u0000\u000fￜ\uffff￨￼\r\u0006\u0010\u000b\uffef\u0014\u000b\u0000￠\t\u0010\b", Color.argb(0, 0, 0, 0) + 19, false, ExpandableListView.getPackedPositionType(0L) + 19, TextUtils.indexOf("", "", 0, 0) + 266).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29054((String) list.get(0));
            }
        });
        map.put(m29074(761759711 - TextUtils.getOffsetBefore("", 0), (short) ((-11) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 542304120, (byte) ((-101) - Color.blue(0)), TextUtils.lastIndexOf("", '0', 0, 0) - 6).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29067((AdContainer) list.get(0));
            }
        });
        map.put(m29074(761759723 - Color.argb(0, 0, 0, 0), (short) (TextUtils.getCapsMode("", 0, 0) + 62), TextUtils.getCapsMode("", 0, 0) + 542304120, (byte) (101 - (KeyEvent.getMaxKeyCode() >> 16)), Color.blue(0) - 7).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29056((String) list.get(0));
            }
        });
        map.put(m29074(View.MeasureSpec.getSize(0) + 761759740, (short) (26 - View.MeasureSpec.getMode(0)), ExpandableListView.getPackedPositionType(0L) + 542304120, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 47), (ViewConfiguration.getLongPressTimeout() >> 16) - 7).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29073((AdResponse) list.get(0));
            }
        });
        map.put(m29075("\u0000\uffdd\u0010\u0001\u0003\u000f\u0010\u0001\uffef", View.MeasureSpec.getMode(0) + 9, true, (ViewConfiguration.getTouchSlop() >> 8) + 5, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 265).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29069((AdResponse) list.get(0));
            }
        });
        map.put(m29074(Color.rgb(0, 0, 0) + 778536970, (short) ((-29) - View.MeasureSpec.getSize(0)), View.MeasureSpec.getSize(0) + 542304122, (byte) ((-35) - TextUtils.indexOf((CharSequence) "", '0', 0)), (-7) - View.MeasureSpec.getMode(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29081((AdSet) list.get(0));
            }
        });
        map.put(m29075("\u0000\uffdd\u0010\u0001\u0003\u000f", 6 - ExpandableListView.getPackedPositionType(0L), true, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 264).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.11
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29070((AdSet) list.get(0));
            }
        });
        map.put(m29074(Drawable.resolveOpacity(0, 0) + 761759764, (short) (117 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 59304 - AndroidCharacter.getMirror('0'), (byte) (45 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getScrollBarSize() >> 8) - 7).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29076((Ad) list.get(0));
            }
        });
        map.put(m29075("�\f￪�\u000f\ufff9\n￼\u000b\uffff", 10 - (Process.myPid() >> 22), false, View.resolveSizeAndState(0, 0, 0) + 9, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.f22500SO).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29072((Ad) list.get(0));
            }
        });
        map.put(m29074(761759778 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((-90) - TextUtils.getOffsetBefore("", 0)), 542304119 - ImageFormat.getBitsPerPixel(0), (byte) (Color.red(0) + 37), (-7) - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29063((Ad) list.get(0));
            }
        });
        map.put(m29075("\u0001\u0003\u0000￥\u0001\u0012\u0005\u0010�\u0001\u000e\uffdf\u0010", Color.green(0) + 13, true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 265).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29068((Ad) list.get(0));
            }
        });
        map.put(m29075("\u0001\u000b�￼ￛ\u0007\u0006\f�\u0006\f\uffff�\f\uffd9￼\u000e�\n\f", 20 - View.getDefaultSize(0, 0), false, 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 270).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11851bp.m29071((ContextData) list.get(0));
            }
        });
        int i2 = f27782 + 79;
        f27783 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x009b  */
    /* JADX INFO: renamed from: ﺙ */
    private static Enum m29059(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != -1097819034) {
            if (iHashCode == 1554700484 && str.equals(m29074(KeyEvent.keyCodeFromString("") + 761759788, (short) (52 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 542304098 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (KeyEvent.normalizeMetaState(0) - 12), (-7) - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                int i2 = f27782 + 29;
                f27783 = i2 % 128;
                int i3 = i2 % 2;
            } else {
                b = -1;
            }
        } else if (str.equals(m29074(ExpandableListView.getPackedPositionGroup(0L) + 761759809, (short) (View.MeasureSpec.getMode(0) - 79), 542304097 - TextUtils.indexOf("", ""), (byte) (TextUtils.indexOf("", "", 0) + 39), (ViewConfiguration.getFadingEdgeLength() >> 16) - 7).intern())) {
            int i4 = f27782 + 47;
            f27783 = i4 % 128;
            int i5 = i4 % 2;
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (b != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008b  */
    /* JADX INFO: renamed from: ﱡ */
    private static Enum m29058(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != 556003820) {
            if (iHashCode != 556062505) {
                if (iHashCode == 1382961856 && !(!str.equals(m29074(761759834 - (ViewConfiguration.getEdgeSlop() >> 16), (short) ((-124) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 542304082, (byte) ((-104) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-7) - Color.green(0)).intern()))) {
                    int i2 = f27783 + 1;
                    f27782 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 % 4;
                    }
                    b = 2;
                }
            } else if (!(!str.equals(m29075("\ufffe\ufff9\u000f\ufff5\u0000\t\u0004\u000f\u0000\u0005\ufffb\u0002\ufff1�\u000f\ufff4\ufff1\ufffe\uffff\u0003\ufffa\u000f�", 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, View.resolveSize(0, 0) + 17, Process.getGidForName("") + 246).intern()))) {
                b = 1;
            }
            b = -1;
        } else if (str.equals(m29075("\u0006\u0001\u0010\u0005\n\u0001\ufff6\u0010\ufffa\uffff\ufffe\u0010\ufff9\u0005\ufffe�\ufff2\ufff5\u0010\ufffe\ufff2\u0003￼", 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, TextUtils.lastIndexOf("", '0', 0, 0) + 245).intern())) {
            int i4 = f27782 + 73;
            f27783 = i4 % 128;
            if (i4 % 2 != 0) {
                b = 1;
            }
        } else {
            b = -1;
        }
        if (b == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (b == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (b != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX INFO: renamed from: ﻏ */
    private static Enum m29061(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != -2102692847) {
            if (iHashCode != -1357644918) {
                if (iHashCode == 235669401 && str.equals(m29075("\u000b\u0002\ufff7\u0011\u0007\u0000�\u0000\u0001\t\u0000\ufff3\ufff6\u0011\ufff5\u0004\ufff7\ufff3\u0006\ufffb\b\ufff7\u0011\u0006", 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, 10 - TextUtils.lastIndexOf("", '0'), 242 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    int i2 = f27782 + 39;
                    f27783 = i2 % 128;
                    if (i2 % 2 != 0) {
                        b = 1;
                    }
                } else {
                    b = -1;
                }
            } else if (str.equals(m29075("\ufff8\t￼\u0007\ufff4\ufff8\u0005\ufff6\u0012\ufff7\ufff4\u0002\ufff8\ufff7￼\t\u0012\ufff8\u0003\f\u0007\u0012", 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, View.getDefaultSize(0, 0) + 11, 242 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(m29075("\ufff8\u0012\u0007\f\u0003\ufff8\u0012\ufff7￼\u0006\u0003\uffff\ufff4\f\ufff4\ufff7\u0012\ufff6\u0005\ufff8\ufff4\u0007￼\t", 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), false, 13 - Process.getGidForName(""), Gravity.getAbsoluteGravity(0, 0) + 242).intern())) {
            int i3 = f27783;
            int i4 = i3 + 67;
            f27782 = i4 % 128;
            b = i4 % 2 == 0 ? (byte) 4 : (byte) 2;
            int i5 = i3 + 45;
            f27782 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            b = -1;
        }
        if (b == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (b == 1) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        }
        if (b != 2) {
            return null;
        }
        return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static Object m29062(AdContainer adContainer) {
        int i = 2 % 2;
        int i2 = f27783 + 31;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        Object dataModel = adContainer.getDataModel();
        int i4 = f27783 + 19;
        f27782 = i4 % 128;
        int i5 = i4 % 2;
        return dataModel;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static Object m29064(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f27782 + 29;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(adResponse.getPlacementId());
        int i4 = f27782 + 107;
        f27783 = i4 % 128;
        int i5 = i4 % 2;
        return lValueOf;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static Object m29080(AdResponse adResponse) {
        int i = 2 % 2;
        int i2 = f27783 + 93;
        f27782 = i2 % 128;
        if (i2 % 2 != 0) {
            return adResponse.getAdSets();
        }
        adResponse.getAdSets();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static Object m29077(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f27783 + 99;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(adSet.isRewarded());
        int i4 = f27783 + 15;
        f27782 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static Object m29065(AdSet adSet) {
        int i = 2 % 2;
        int i2 = f27782 + 63;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        LinkedList ads = adSet.getAds();
        int i4 = f27782 + 113;
        f27783 = i4 % 128;
        int i5 = i4 % 2;
        return ads;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static Object m29079(Ad ad) {
        int i = 2 % 2;
        int i2 = f27782 + 113;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        ContextData contextData = ad.getContextData();
        int i4 = f27782 + 45;
        f27783 = i4 % 128;
        if (i4 % 2 == 0) {
            return contextData;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static Object m29055(Ad ad) {
        int i = 2 % 2;
        int i2 = f27783 + 67;
        f27782 = i2 % 128;
        if (i2 % 2 != 0) {
            return ad.getRewards();
        }
        ad.getRewards();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    private static Object m29057(Ad ad) {
        int i = 2 % 2;
        int i2 = f27783 + 17;
        f27782 = i2 % 128;
        int i3 = i2 % 2;
        String webVast = ad.getWebVast();
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = f27782 + 23;
        f27783 = i5 % 128;
        int i6 = i5 % 2;
        return webVast;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static Object m29060(Ad ad) {
        int i = 2 % 2;
        int i2 = f27782 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27783 = i2 % 128;
        int i3 = i2 % 2;
        String creativeId = ad.getCreativeId();
        int i4 = f27783 + 11;
        f27782 = i4 % 128;
        int i5 = i4 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static Object m29066(ContextData contextData) {
        int i = 2 % 2;
        int i2 = f27782 + 113;
        f27783 = i2 % 128;
        if (i2 % 2 != 0) {
            contextData.getAdvertisedContent();
            throw null;
        }
        String advertisedContent = contextData.getAdvertisedContent();
        int i3 = f27782 + 109;
        f27783 = i3 % 128;
        int i4 = i3 % 2;
        return advertisedContent;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29075(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f27784);
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

    /* JADX INFO: renamed from: ｋ */
    private static String m29074(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f27785;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f27788;
                if (bArr != null) {
                    i5 = (byte) (bArr[f27786 + i] + i4);
                } else {
                    i5 = (short) (f27781[f27786 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f27786 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f27787);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f27788;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f27781;
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
