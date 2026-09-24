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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11864cb extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f28058 = {'^', AbstractJsonLexerKt.STRING_ESC, 'd', AbstractJsonLexerKt.BEGIN_LIST, '.', AbstractJsonLexerKt.END_LIST, '+', Typography.dollar, 'M', 'y', 'T', 'a', 'r', 'g', 'e', 't', 'C', 'o', 'n', 'f', 'i', 'V', 's', 'A', 'c', 'v', 'm', 'E', 'I', 'D', AbstractJsonLexerKt.UNICODE_ESC, 'B', 'l', 'R', 'w', 'L', 'P', '_', '`', 'b', 'h', 'j', 'k', 'p', 'q', 'x', 'z', AbstractJsonLexerKt.BEGIN_OBJ, '|'};

    /* JADX INFO: renamed from: ﻛ */
    private static char f28059 = 7;

    /* JADX INFO: renamed from: ｋ */
    private static int f28060 = 30;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28061 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28062 = 1;

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m29463(Reward reward) {
        int i = 2 % 2;
        int i2 = f28061 + 69;
        f28062 = i2 % 128;
        int i3 = i2 % 2;
        String strM29466 = m29466(reward);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return strM29466;
    }

    public C11864cb(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f28061 + 3;
        f28062 = i2 % 128;
        try {
            try {
                String str = (String) (i2 % 2 == 0 ? MyTargetVersion.class.getDeclaredField(m29465("\ufffb\u0001\u0000\b\ufff7\u0004\u0005", 'q' << AndroidCharacter.getMirror('+'), false, View.resolveSizeAndState(1, 1, 1) * 3, 115 - ExpandableListView.getPackedPositionGroup(0L)).intern()) : MyTargetVersion.class.getDeclaredField(m29465("\ufffb\u0001\u0000\b\ufff7\u0004\u0005", '7' - AndroidCharacter.getMirror('0'), false, 3 - View.resolveSizeAndState(0, 0, 0), 108 - ExpandableListView.getPackedPositionGroup(0L)).intern())).get(null);
                int i3 = f28062 + 57;
                f28061 = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception unused) {
                return C12019hv.m30362().m30363().m30451(MyTargetVersion.class, m29464("\u0001\u0002\u0003\u0004\u0002\u0003\u0005\u0006\u0000\u0002\u0000\t", TextUtils.indexOf("", "") + 12, (byte) (72 - View.MeasureSpec.getMode(0))).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:71:0x0337  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        int i2 = f28062 + 47;
        f28061 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -2103294848:
                if (!str.equals(m29464("\u001e%\u0006\u0010\u000f\u001f\b\u0012Ï", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 110)).intern())) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1850459313:
                if (str.equals(m29464("\u001c\u0013 \r\t\u0005", View.combineMeasuredStates(0, 0) + 6, (byte) (106 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -1766129765:
                if (!str.equals(m29464("\t\n\u000b\f\r\u0007\u000f\u0010\u001c\u0015\b\u001a\u000e\u0012è", View.resolveSizeAndState(0, 0, 0) + 15, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)).intern())) {
                    b = -1;
                } else {
                    int i4 = f28061 + 73;
                    f28062 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 2;
                }
                break;
            case -1282477456:
                if (!str.equals(m29464("\t\n\u000b\f\r\u0007\u000f\u0010\t\f\u0019\u0012\u0007\u0014\u007f", (Process.myPid() >> 22) + 15, (byte) (13 - Color.alpha(0))).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -958537051:
                if (!str.equals(m29465("\u0000\ufff5\b\u0003\u0004\u000e￣\u0000\u0013", 9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, 1 - (KeyEvent.getMaxKeyCode() >> 16), 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i6 = f28062 + 63;
                    f28061 = i6 % 128;
                    b = i6 % 2 != 0 ? (byte) 77 : (byte) 7;
                }
                break;
            case -609786639:
                if (!str.equals(m29464("\u001c\u0013 \r\t\u0005\u0010\u0000\u001e\t", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, (byte) (39 - Gravity.getAbsoluteGravity(0, 0))).intern())) {
                    b = -1;
                } else {
                    b = 14;
                }
                break;
            case -498709917:
                if (!str.equals(m29465("\u0005ￚ�￥\u0002\f\r\ufffe\u0007\ufffe\u000b￢\u0007\r\ufffe\u000b\f\r\u0002\r\u0002\ufffa", 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), false, View.MeasureSpec.getSize(0) + 11, 133 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i7 = f28062 + 29;
                    f28061 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 12;
                }
                break;
            case -393802555:
                if (!str.equals(m29464("\u001c\u0013 \r\t\u0005\u0010\u0000\u001e\t)\u000e\u001d\u0016\u000f\u0013\u0013\u0007", TextUtils.indexOf("", "", 0, 0) + 18, (byte) (91 - View.combineMeasuredStates(0, 0))).intern())) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case 65555862:
                if (!str.equals(m29465("￥\u0010\ufffe\u0002\uffef\r\ufffe\u0000\u000b\ufffa￭\u0012￦\u000b\ufffe\u0007\ufffe\r\f\u0002", 20 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE).intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 320151695:
                if (!str.equals(m29465("\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b￣\ufffeￛ\u0006", 14 - Color.red(0), true, 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 132 - View.combineMeasuredStates(0, 0)).intern())) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 421929408:
                if (!str.equals(m29464(" \n\u0015\u000f \u000e\u0010\u000f\b\u001a\u0010\u000e\u0010\u000e\u0012'\u001e\t", 18 - TextUtils.indexOf("", "", 0, 0), (byte) (View.resolveSizeAndState(0, 0, 0) + 61)).intern())) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 448638071:
                if (!str.equals(m29464("\u0017%\u001d\u0016\u0013\u0018'\b\r\f\u001b\u0017", TextUtils.indexOf((CharSequence) "", '0', 0) + 13, (byte) (MotionEvent.axisFromString("") + 68)).intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 487251537:
                if (!str.equals(m29464("\u0018\u0019\u0010\u000e\u001b\u0012\u0010\b\u0019\u0014\u0014\u001b\u0013\u000f", 14 - (KeyEvent.getMaxKeyCode() >> 16), (byte) (94 - ImageFormat.getBitsPerPixel(0))).intern())) {
                    b = -1;
                } else {
                    int i9 = f28062 + 1;
                    f28061 = i9 % 128;
                    int i10 = i9 % 2;
                    b = 5;
                }
                break;
            case 544598087:
                if (!str.equals(m29464("\u001f\u0018\u0019\u0005\u0017\f\u0001\u0012\f\r\u0007\u0014\u0012\u0001\u001f\u0018³³\u0012\u0013\u0001\u000b\n\u000b\f\r\u0007\u0014\u0010\u0016\u0016\u0011\u0012\u001b\u000e\u0010¿", 38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (View.MeasureSpec.getMode(0) + 70)).intern())) {
                    b = -1;
                } else {
                    int i11 = f28061 + 51;
                    f28062 = i11 % 128;
                    int i12 = i11 % 2;
                    b = 4;
                }
                break;
            case 1125320581:
                if (!str.equals(m29464("!\u0015\f\u0007\u000f\u001c\b\u0012\u0091", Color.argb(0, 0, 0, 0) + 9, (byte) (48 - (Process.myPid() >> 22))).intern())) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1146816194:
                if (!str.equals(m29464("\t\n\u000b\f\r\u0007\u000f\u0010\u001b\u000e\u0014\u001c", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, (byte) (43 - TextUtils.indexOf("", ""))).intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 1413638316:
                if (!str.equals(m29464("\t\n\u000b\f\r\u0007\u000f\u0010\u0018\u0019\u0010\u000e\u001b\u0012\u0010\b", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37)).intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1955824356:
                if (str.equals(m29465("\u0005\u001a\t\ufff3\u0004￡", 6 - (Process.myTid() >> 22), true, AndroidCharacter.getMirror('0') - '*', AndroidCharacter.getMirror('0') + 'N').intern())) {
                    int i13 = f28061 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f28062 = i13 % 128;
                    int i14 = i13 % 2;
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 1982630644:
                if (!str.equals(m29465("\u0019\u0007￨\n\uffe7\u000b", '6' - AndroidCharacter.getMirror('0'), true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, 121 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 2040577055:
                if (!str.equals(m29464("\t\n\u000b\f\r\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u001b\u0014", 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (KeyEvent.normalizeMetaState(0) + 73)).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return MyTargetConfig.class;
            case 1:
                return MyTargetManager.class;
            case 2:
                return MyTargetVersion.class;
            case 3:
            case 4:
                return MyTargetActivity.class;
            case 5:
                return MyTargetActivity.ActivityEngine.class;
            case 6:
                return BaseAd.class;
            case 7:
                return VideoData.class;
            case 8:
                return ImageData.class;
            case 9:
                return AudioData.class;
            case 10:
                return BaseInterstitialAd.class;
            case 11:
                return InterstitialAd.class;
            case 12:
                return InterstitialAd.InterstitialAdListener.class;
            case 13:
                return Reward.class;
            case 14:
                return RewardedAd.class;
            case 15:
                return RewardedAd.RewardedAdListener.class;
            case 16:
                return CustomParams.class;
            case 17:
                return MyTargetView.class;
            case 18:
                return MyTargetView.AdSize.class;
            case 19:
                return MyTargetView.MyTargetViewListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29465("\u0010\ufffa\u000b�￭\u0012\t\ufffe\u0000\ufffe\r￫\ufffe", 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), false, 8 - Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11864cb.m29463((Reward) list.get(0));
            }
        });
        int i2 = f28061 + 17;
        f28062 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29466(Reward reward) {
        int i = 2 % 2;
        int i2 = f28061 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28062 = i2 % 128;
        int i3 = i2 % 2;
        String str = reward.type;
        int i4 = f28062 + 101;
        f28061 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29465(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f28060);
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

    /* JADX INFO: renamed from: ﻛ */
    private static String m29464(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28058;
            char c = f28059;
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
}
