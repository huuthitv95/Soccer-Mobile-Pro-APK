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
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11868cf extends AbstractC11840be {

    /* JADX INFO: renamed from: ﭸ */
    private static int f28122 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28126 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28128 = 88;

    /* JADX INFO: renamed from: ｋ */
    private static short[] f28130 = null;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28131 = 2086666265;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28132 = -1135833402;

    /* JADX INFO: renamed from: ﻛ */
    private static byte[] f28129 = {-62, 10, 51, -48, 49, -52, 10, 3, -7, 10, 0, 48, 68, -3, Ascii.f22491EM, Ascii.f22502US, Ascii.f22494GS, 47, Ascii.f22499SI, 87, -39, -53, -50, -6, -91, -37, -46, -52, -28, -26, -65, 7, -15, 8, -39, 2, -18, -11, -14, -14, -13, -5, -12, 33, -58, 2, -31, Ascii.f22490CR, -22, 17, -42, -1, -10, -16, 8, 2, -26, -20, -44, -18, -42, -14, 3, -80, -18, -51, -7, -42, -3, -62, -21, -30, -36, -12, 111, 117, 93, 119, 95, 123, -116, 57, 119, 86, -126, 95, -122, 75, 116, 107, 101, 125, -110, 38, 119, 86, -126, 95, -122, 75, 116, 107, 101, 93, -78, 38, 119, 103, 95, 116, 103, 116, 87, 111, -84, 45, 113, 91, -81, 51, 98, 104, 102, 120, 88, -128, 89, 119, 95, 101, 108, -81, 34, 108, 19, Ascii.f22491EM, 1, Ascii.ESC, 3, Ascii.f22502US, 48, -21, 49, -21, Ascii.f22490CR, Ascii.f22492FF, Ascii.DC4, 1, Ascii.ESC, 34, Ascii.SUB, -4, 51, -40, Ascii.f22490CR, Ascii.f22492FF, Ascii.DC4, 1, Ascii.ESC, 2, 77, -54, Ascii.ESC, Ascii.f22503VT, 3, Ascii.CAN, Ascii.f22503VT, Ascii.CAN, -5, 19, 80, -47, Ascii.NAK, -1, 83, -41, 6, Ascii.f22492FF, 10, Ascii.f22493FS, -4, 36, -3, Ascii.ESC, 3, 9, Ascii.DLE, 83, -58, Ascii.DLE, 70, 48, 71, 40, 49, 66, Ascii.f22498RS, 50, 47, 53, 50, 102, 54, 34, 48, Ascii.SUB, 44, Ascii.DC4, 36, 45, SignedBytes.MAX_POWER_OF_TWO, 10, 33, 38, Ascii.f22498RS, Ascii.SUB, 83, -15, 39, 42, Ascii.SUB, 50, 51, Ascii.NAK, Ascii.f22500SO, 56, 58, -10, 53, Ascii.f22502US, 54, Ascii.NAK, 70, -52, -39, -45, -20, -51, -43, -26, -65, -23, -62, 62, 58, 63, 36, 70, 88, 58, 37, -91, -72, -78, -78, -80, -63, -58, -60, -95, -48, 124, -70, -92, -83, -70, -52, -82, -101, -82, -85, -40, -118, -54, -98, -96, -70, -90, -54, -94, -78, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱡ */
    private static char f28125 = 10431;

    /* JADX INFO: renamed from: ﮐ */
    private static char f28123 = 60037;

    /* JADX INFO: renamed from: ﱟ */
    private static char f28124 = 56880;

    /* JADX INFO: renamed from: ﻏ */
    private static char f28127 = 48532;

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ SAInterface m29539() {
        int i = 2 % 2;
        int i2 = f28122 + 39;
        f28126 = i2 % 128;
        int i3 = i2 % 2;
        SAInterface sAInterfaceM29538 = m29538();
        int i4 = f28122 + 23;
        f28126 = i4 % 128;
        int i5 = i4 % 2;
        return sAInterfaceM29538;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29544(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i = 2 % 2;
        int i2 = f28122 + 105;
        f28126 = i2 % 128;
        int i3 = i2 % 2;
        m29542(sABannerAd, sAInterface);
        int i4 = f28122 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28126 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ JSONObject m29545(SAAd sAAd) {
        int i = 2 % 2;
        int i2 = f28122 + 17;
        f28126 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM29540 = m29540(sAAd);
        int i4 = f28122 + 101;
        f28126 = i4 % 128;
        if (i4 % 2 == 0) {
            return jSONObjectM29540;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public C11868cf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f28126 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28122 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String sDKVersionNumber = SAVersion.getSDKVersionNumber();
            int i4 = f28122 + 65;
            f28126 = i4 % 128;
            if (i4 % 2 == 0) {
                return sDKVersionNumber;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            return C12019hv.m30362().m30363().m30451(SAVersion.class, m29541((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1135833403, (short) ((-2) - (Process.myPid() >> 22)), (-2086666171) - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 77).intern());
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x051c  */
    /* JADX WARN: Code duplicated, block: B:47:0x020d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0338  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        byte b = 1;
        switch (str.hashCode()) {
            case -1959951430:
                b = !str.equals(m29543("\udb70ﬀ똕㝥〧ힳ㴮沃፻ᯍ…፭ॕ\ue6d5ﻞ띠Ǖ\ud971ㅾᏏ䨽ꑩꕢ졿໔ڨ↓뾚", 27 - TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -1855458488:
                b = !str.equals(m29543("鷪킉ࢃ✫锃﷾埌틊Ẻꪈ茝㰧㑈\uf8cdೈᶗ踕걑ㆳ煞茝㰧똕㝥\uf1a8\uf471阠‶賴䎗\ud898\uf3a5茝㰧", 35 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1788589794:
                b = !str.equals(m29543("\udb70ﬀ똕㝥\uf1a8\uf471場\uf151ᚂ睰璤ι骝௦ὥ臑뺹\uf463ࢃ✫摸쿛", 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case -1718372116:
                if (!str.equals(m29543("䡤罵學▜\ud898\uf3a5ﭲ\udfce", 6 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    b = -1;
                } else {
                    int i2 = f28122 + 65;
                    f28126 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 35;
                }
                break;
            case -1711491530:
                if (!str.equals(m29543("䡤罵웷⾙郕\udba9⓹ꞈ", 7 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i4 = f28122 + 35;
                    f28126 = i4 % 128;
                    if (i4 % 2 == 0) {
                        b = 31;
                    } else {
                        b = 88;
                    }
                }
                break;
            case -1305374924:
                if (!str.equals(m29541(1135833537 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) ((-14) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), View.resolveSize(0, 0) - 2086666149, (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.blue(0) - 31).intern())) {
                    b = -1;
                } else {
                    int i5 = f28122 + 91;
                    f28126 = i5 % 128;
                    if (i5 % 2 == 0) {
                        b = 19;
                    } else {
                        b = 31;
                    }
                }
                break;
            case -1292741795:
                b = !str.equals(m29543("䡤罵⎴髜敷䤔\udb70ﬀ", 7 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : Ascii.f22491EM;
                break;
            case -1246480821:
                b = !str.equals(m29541(ExpandableListView.getPackedPositionType(0L) + 1135833458, (short) (31 - Gravity.getAbsoluteGravity(0, 0)), View.getDefaultSize(0, 0) - 2086666179, (byte) ('0' - AndroidCharacter.getMirror('0')), (-69) - View.MeasureSpec.getSize(0)).intern()) ? (byte) -1 : Ascii.f22490CR;
                break;
            case -983382056:
                b = !str.equals(m29543("똕㝥〧ힳ㴮沃፻ᯍ…፭ॕ\ue6d5ﻞ띠Ǖ\ud971ㅾᏏ䨽ꑩ톪僔", 22 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : Ascii.f22499SI;
                break;
            case -926853969:
                if (!str.equals(m29541((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1135833653, (short) ((ViewConfiguration.getTouchSlop() >> 8) + 77), (-2086666182) - (ViewConfiguration.getTouchSlop() >> 8), (byte) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 79).intern())) {
                    b = -1;
                } else {
                    int i6 = f28126 + 101;
                    f28122 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 32;
                }
                break;
            case -877887884:
                b = !str.equals(m29541(Color.alpha(0) + 1135833433, (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11), (-2086666192) - TextUtils.getCapsMode("", 0, 0), (byte) View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 61).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -844831949:
                if (!str.equals(m29543("鷪킉ࢃ✫锃﷾埌틊Ẻꪈ茝㰧", Color.argb(0, 0, 0, 0) + 12).intern())) {
                    b = -1;
                } else {
                    int i8 = f28122 + 37;
                    f28126 = i8 % 128;
                    if (i8 % 2 == 0) {
                        b = 8;
                    } else {
                        b = Ascii.SUB;
                    }
                }
                break;
            case -499959157:
                b = !str.equals(m29543("䡤罵豧⣧逑愄旦柞\uf334씉珈࡚", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11).intern()) ? (byte) -1 : (byte) 33;
                break;
            case -279114759:
                b = !str.equals(m29541(1135833476 - Color.argb(0, 0, 0, 0), (short) ((-106) - TextUtils.getCapsMode("", 0, 0)), (-2086666149) - ExpandableListView.getPackedPositionGroup(0L), (byte) Gravity.getAbsoluteGravity(0, 0), (-28) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) ? (byte) -1 : Ascii.f22500SO;
                break;
            case -258874416:
                b = !str.equals(m29543("䡤罵똕㝥〧ힳ㎉ꝗ侅惦", 10 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 2537233:
                if (!str.equals(m29543("䡤罵\udb70ﬀ", 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i9 = f28126 + 17;
                    f28122 = i9 % 128;
                    b = i9 % 2 != 0 ? (byte) 27 : (byte) 95;
                }
                break;
            case 102107741:
                if (!str.equals(m29543("䡤罵豧⣧逑愄ꌻ斩瓿賺瓿賺壭\u2d99\udb70ﬀ", 16 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b = -1;
                } else {
                    int i10 = f28122 + 85;
                    f28126 = i10 % 128;
                    if (i10 % 2 == 0) {
                        b = 4;
                    } else {
                        b = 5;
                    }
                }
                break;
            case 347965699:
                b = !str.equals(m29543("鷪킉ࢃ✫锃﷾埌틊Ẻꪈ茝㰧㑈\uf8cdೈᶗ踕걑ㆳ煞茝㰧阠‶賴䎗\ud898\uf3a5茝㰧", 30 - View.resolveSize(0, 0)).intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case 511814123:
                b = !str.equals(m29543("䡤罵乓贯滞읅໔ڨ↓뾚", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 562364207:
                b = str.equals(m29543("鷪킉ࢃ✫锃﷾埌틊Ẻꪈ茝㰧㑈\uf8cdೈᶗ踕걑ㆳ煞茝㰧", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21).intern()) ? (byte) 11 : (byte) -1;
                break;
            case 690451442:
                if (!str.equals(m29541(1135833606 - Color.argb(0, 0, 0, 0), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 36), (-2086666201) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) KeyEvent.keyCodeFromString(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 58).intern())) {
                    b = -1;
                } else {
                    int i11 = f28126 + 43;
                    f28122 = i11 % 128;
                    int i12 = i11 % 2;
                    b = 22;
                }
                break;
            case 816054202:
                b = !str.equals(m29541(1135833591 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) ((-52) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-2086666182) - TextUtils.getOffsetBefore("", 0), (byte) TextUtils.getOffsetAfter("", 0), TextUtils.getTrimmedLength("") - 73).intern()) ? (byte) -1 : Ascii.DC4;
                break;
            case 846064660:
                b = !str.equals(m29541((Process.myPid() >> 22) + 1135833645, (short) ((-56) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 2086666183, (byte) (KeyEvent.getMaxKeyCode() >> 16), (-80) - MotionEvent.axisFromString("")).intern()) ? (byte) -1 : Ascii.f22498RS;
                break;
            case 912139882:
                if (!str.equals(m29541(1135833635 - Color.red(0), (short) (43 - ImageFormat.getBitsPerPixel(0)), (-2086666182) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSize(0, 0) - 77).intern())) {
                    b = -1;
                } else {
                    b = Ascii.SUB;
                }
                break;
            case 947295484:
                b = !str.equals(m29543("䡤罵똕㝥〧ힳ㎉ꝗﳹ⏪럽⏼綔鏏\uf2aa풾", View.MeasureSpec.getMode(0) + 15).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1067523235:
                b = !str.equals(m29543("䡤罵焳\u2e75洎䶌摸쿛ꂤ㡵ꂤ㡵ﳹ⏪럽⏼綔鏏\uf2aa풾", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case 1179812605:
                if (!str.equals(m29543("萭ᕉ⦜릎㞕䚽茝㰧\udfd0踷伧秫Ӏኪ䥯ʗꦾアꀧ\u12b6픣ᙖ\ue56d⪘\uddf0\udcc4Ḃ⮋ۧ䂵䡤罵豧⣧逑愄ꌻ斩瓿賺瓿賺壭\u2d99\udb70ﬀ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1233891357:
                b = !str.equals(m29543("䡤罵撓츧ក删瓿賺壙윖", 10 - TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : Ascii.f22493FS;
                break;
            case 1635726011:
                if (!str.equals(m29541(1135833422 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (KeyEvent.normalizeMetaState(0) + 47), (-2086666182) - Gravity.getAbsoluteGravity(0, 0), (byte) ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getSize(0) - 76).intern())) {
                    b = -1;
                } else {
                    int i13 = f28122 + 39;
                    f28126 = i13 % 128;
                    if (i13 % 2 == 0) {
                        b = 2;
                    } else {
                        b = 5;
                    }
                }
                break;
            case 1852615901:
                b = !str.equals(m29541(1135833662 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (83 - View.resolveSizeAndState(0, 0, 0)), View.resolveSize(0, 0) - 2086666182, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) - 77).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 1864912441:
                b = !str.equals(m29543("䡤罵焳\u2e75洎䶌摸쿛ꂤ㡵ћ犮໔ڨ↓뾚", (-16777201) - Color.rgb(0, 0, 0)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 1888267954:
                b = !str.equals(m29543("萭ᕉ⦜릎㞕䚽茝㰧\udfd0踷伧秫Ӏኪ䥯ʗꦾアꀧ\u12b6픣ᙖ\ue56d⪘\uddf0\udcc4Ḃ⮋諠ꚗᩪ칪ࢃ✫锃﷾縝禺瓿賺\uf1c0히唛\uaa3d", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1968274797:
                b = !str.equals(m29541(1135833413 - TextUtils.getTrimmedLength(""), (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 33), (-2086666199) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (-79) - TextUtils.lastIndexOf("", '0', 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 1976248583:
                if (!str.equals(m29543("鷪킉ࢃ✫锃﷾埌틊Ẻꪈ茝㰧阠‶賴䎗\ud898\uf3a5茝㰧", Drawable.resolveOpacity(0, 0) + 20).intern())) {
                    b = -1;
                } else {
                    int i14 = f28122 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                    f28126 = i14 % 128;
                    int i15 = i14 % 2;
                }
                break;
            case 2044807796:
                b = !str.equals(m29543("䡤罵撓츧ក删瓿賺壙윖閥ｕ\uf75b쨷\udd91蔬", 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : Ascii.f22494GS;
                break;
            case 2057982119:
                b = !str.equals(m29543("䡤罵乓贯ṓ\uf4ac፻ᯍ…፭톪僔", View.resolveSize(0, 0) + 11).intern()) ? (byte) -1 : Ascii.CAN;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return AwesomeAds.class;
            case 1:
                return IVideoPlayer.Listener.class;
            case 2:
                return SAVideoClick.class;
            case 3:
                return SAVideoAd.class;
            case 4:
            case 5:
                return SAInterstitialAd.class;
            case 6:
            case 7:
                return SAVideoActivity.class;
            case 8:
                return IVideoPlayer.class;
            case 9:
                return IVideoPlayerControllerView.class;
            case 10:
                return IVideoPlayerControllerView.Listener.class;
            case 11:
                return IVideoPlayerController.class;
            case 12:
                return IVideoPlayerController.Listener.class;
            case 13:
            case 14:
                return VideoPlayerActivity.class;
            case 15:
                return VideoPlayerController.class;
            case 16:
                return AdVideoPlayerControllerView.class;
            case 17:
                return SAManagedAdView.class;
            case 18:
            case 19:
                return SAManagedAdActivity.class;
            case 20:
                return SACustomWebView.class;
            case 21:
                return AdViewJavaScriptBridge.class;
            case 22:
                return AdViewJavaScriptBridge.Listener.class;
            case 23:
                return SAWebView.class;
            case 24:
                return SAWebPlayer.class;
            case 25:
                return SAVASTAd.class;
            case 26:
                return SAVASTMedia.class;
            case 27:
                return SAAd.class;
            case 28:
                return SACreative.class;
            case 29:
                return SACreativeFormat.class;
            case 30:
                return SADetails.class;
            case 31:
                return SAMedia.class;
            case 32:
                return SAResponse.class;
            case 33:
                return SAInterface.class;
            case 34:
                return SABannerAd.class;
            case 35:
                return SAEvent.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29541((ViewConfiguration.getJumpTapTimeout() >> 16) + 1135833671, (short) (81 - Color.red(0)), (ViewConfiguration.getEdgeSlop() >> 16) - 2086666168, (byte) TextUtils.getCapsMode("", 0, 0), (-75) - Color.red(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11868cf.m29545((SAAd) list.get(0));
            }
        });
        map.put(m29543("摸쿛甔ﯙࢃ✫锃﷾\udb70ﬀ阠‶賴䎗\ud898\uf3a5茝㰧", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11868cf.m29539();
            }
        });
        map.put(m29543("믛짋ᦎڦᤤ㬃듮护㜅뜿\uddf0\udcc4逑愄듮护톪僔", TextUtils.lastIndexOf("", '0') + 18).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11868cf.m29544((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        int i2 = f28126 + 47;
        f28122 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static JSONObject m29540(SAAd sAAd) {
        int i = 2 % 2;
        int i2 = f28126 + 81;
        f28122 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        int i4 = f28122 + 83;
        f28126 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObjectWriteToJson;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static SAInterface m29538() {
        int i = 2 % 2;
        int i2 = f28122 + 47;
        f28126 = i2 % 128;
        if (i2 % 2 == 0) {
            return SAVideoAd.getListener();
        }
        SAVideoAd.getListener();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m29542(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i = 2 % 2;
        int i2 = f28122 + 65;
        f28126 = i2 % 128;
        int i3 = i2 % 2;
        sABannerAd.setListener(sAInterface);
        int i4 = f28122 + 73;
        f28126 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29541(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28128;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28129;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28132 + i] + i4);
                } else {
                    i5 = (short) (f28130[f28132 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28132 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28131);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28129;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28130;
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

    /* JADX INFO: renamed from: ｋ */
    private static String m29543(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f28125)) ^ ((c2 >>> 5) + f28124)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f28123) ^ ((c3 + i2) ^ ((c3 << 4) + f28127))));
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
