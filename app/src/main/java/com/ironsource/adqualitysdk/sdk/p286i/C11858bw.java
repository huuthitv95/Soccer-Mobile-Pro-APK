package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
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
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bw */
/* JADX INFO: loaded from: classes6.dex */
public final class C11858bw extends AbstractC11840be {

    /* JADX INFO: renamed from: ﮐ */
    private static int f27935 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static boolean f27936 = true;

    /* JADX INFO: renamed from: ﺙ */
    private static boolean f27937 = true;

    /* JADX INFO: renamed from: ﻏ */
    private static int f27938 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static long f27939 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char f27940 = 60066;

    /* JADX INFO: renamed from: ｋ */
    private static int f27941 = 113;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27942;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f27943 = {190, 224, 221, 212, 178, 213, 196, 217, 232, Typography.half, 218, 228, 229, 214, 223, 227, 179, 210, Typography.middleDot, 230, 186, 195, 222, 159, 220, 233, 231, 234, 199, 216};

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ Object m29284() {
        int i = 2 % 2;
        int i2 = f27938 + 85;
        f27935 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29285();
        }
        m29285();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ BannerAdShowListener m29288(Banner banner) {
        int i = 2 % 2;
        int i2 = f27938 + 99;
        f27935 = i2 % 128;
        int i3 = i2 % 2;
        BannerAdShowListener bannerAdShowListenerM29290 = m29290(banner);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = f27935 + 17;
        f27938 = i5 % 128;
        if (i5 % 2 != 0) {
            return bannerAdShowListenerM29290;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m29289(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = 2 % 2;
        int i2 = f27935 + 103;
        f27938 = i2 % 128;
        int i3 = i2 % 2;
        m29291(banner, bannerAdShowListener);
        int i4 = f27938 + 3;
        f27935 = i4 % 128;
        int i5 = i4 % 2;
    }

    public C11858bw(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        C12023hz c12023hzM30363;
        Class<BuildConfig> cls;
        String strM29286;
        int i = 2 % 2;
        int i2 = f27935 + 67;
        f27938 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                c12023hzM30363 = C12019hv.m30362().m30363();
                cls = BuildConfig.class;
                strM29286 = m29286("쐪垰ꀻꢤ㒤ﶮ\ue3f6찡瀉獥洲", (char) KeyEvent.normalizeMetaState(1), "\u0000\u0000\u0000\u0000", (-2036216224) / View.MeasureSpec.getMode(1), "恐ꇎ\uf286උ");
            } else {
                c12023hzM30363 = C12019hv.m30362().m30363();
                cls = BuildConfig.class;
                strM29286 = m29286("쐪垰ꀻꢤ㒤ﶮ\ue3f6찡瀉獥洲", (char) KeyEvent.normalizeMetaState(0), "\u0000\u0000\u0000\u0000", (-2036216224) - View.MeasureSpec.getMode(0), "恐ꇎ\uf286උ");
            }
            return c12023hzM30363.m30451(cls, strM29286.intern());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = Ascii.f22499SI;
        switch (iHashCode) {
            case -1984684559:
                if (!str.equals(m29287(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u0082\u0084\u0082\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    int i2 = f27935 + 59;
                    f27938 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 1;
                }
                break;
            case -1940439161:
                b = !str.equals(m29286("퐞\ueb6e\uf500ⵃ䡟Ꮭ聞瓿퀓엍辯㺵姩\ue912\ue845\ue023", (char) (23527 - Gravity.getAbsoluteGravity(0, 0)), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0'), "褣\ue6c1\ue79f䁛").intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1921270373:
                if (!str.equals(m29287(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), null, "\u009c\u008d\u008b\u009b\u008b\u008d\u0084\u0085\u008d\u008c\u0092\u009d").intern())) {
                    b = -1;
                } else {
                    int i4 = f27938 + 45;
                    f27935 = i4 % 128;
                    int i5 = i4 % 2;
                    b = Ascii.DC2;
                }
                break;
            case -1483746188:
                b = str.equals(m29286("ꙓ現쥙紨乳培蝚囤彉䯝ၴ磢", (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0, 0), "쪻\ud84c詟\ud87c").intern()) ? (byte) 3 : (byte) -1;
                break;
            case -1473265726:
                b = !str.equals(m29286("껀呝\ue939糍\udfa4뜬㮺읲䤮灙㳪\udf6a\ud9dd㘽菵\ue395训\ude49짝놵뛈ʼ莌⡊퀣묅㧢녣\ue19c₆ҩ", (char) (796 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "\u0000\u0000\u0000\u0000", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 612814798, "㎧礰᳛嬃").intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1435839138:
                b = !str.equals(m29287(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0086\u0085\u008f\u008e\u008e\u0090\u0084\u008c\u0083\u0083\u0094\u0093").intern()) ? (byte) -1 : (byte) 8;
                break;
            case -1413560652:
                b = !str.equals(m29287(null, TextUtils.indexOf((CharSequence) "", '0') + 128, null, "\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u0085").intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1323289850:
                if (!str.equals(m29286("\ue6ee㖻얲陏\udeeb붭┌\ue878돩ܑ켓삺\ue9e4賵⦋鵮몸⅃\ue768멮떤\uee4aꉳﭘ훌캁炖\ue3eb激ⷥ⊽錄毑\ueb5fﺖ萫턤렿\ue1edḆ쟩鿐ਜ਼ꌬ㳱셆薲槵兙뜐퍻᪸쨋䊊\udaa4겿ì\udfec\udf47㡆끙瀌늖玊鴼牰伷鍸공䵟ꭲ퐐빕ђ\udb0cⱳ\uebd4紭\ufe1cఙ\ue8b9ᆎ䃗竏뾹理瘬⓷硨뤴ᦇ", (char) (22483 - TextUtils.indexOf("", "", 0, 0)), "\u0000\u0000\u0000\u0000", (-1833960089) - Color.blue(0), "朆꿽펒칗").intern())) {
                    b = -1;
                } else {
                    int i6 = f27938 + 15;
                    f27935 = i6 % 128;
                    b = i6 % 2 == 0 ? (byte) 17 : Ascii.DC4;
                }
                break;
            case -789262976:
                b = !str.equals(m29286("\ue4d3諸\uefcf劀遷\ue7fa懜귕ꟿ㪽⊶뙀㦍贃\ue9f5\uecf0", (char) (17448 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", ViewConfiguration.getWindowTouchSlop() >> 8, "७\ue832❷豄").intern()) ? (byte) -1 : (byte) 16;
                break;
            case -671875674:
                if (!str.equals(m29286("骽ޓ诰检齁蛙㮉鴃ㄼ⻕\ue14a\u0ba1ꍠ", (char) (54963 - Color.red(0)), "\u0000\u0000\u0000\u0000", 578037470 - TextUtils.indexOf("", ""), "\ude6f琦댢엖").intern())) {
                    b = -1;
                } else {
                    int i7 = f27935 + 101;
                    f27938 = i7 % 128;
                    b = i7 % 2 != 0 ? Ascii.f22503VT : (byte) 54;
                }
                break;
            case -556413696:
                if (!str.equals(m29287(null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0083\u0092\u008b\u008d\u008b\u008d\u008c\u0090\u008e\u008d\u008f\u0095").intern())) {
                    b = -1;
                } else {
                    int i8 = f27935 + 61;
                    f27938 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 10;
                }
                break;
            case -543102915:
                b = !str.equals(m29287(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0086\u0085\u0083\u0092\u008b\u008d\u008b\u008d\u008c\u0090\u008e\u008d\u008f\u0095\u0086\u008e\u0086\u0090\u0092\u0089\u008e\u0096").intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case -517600968:
                if (!str.equals(m29287(null, AndroidCharacter.getMirror('0') + 'O', null, "\u009c\u008d\u008b\u009b\u008b\u008d\u0084\u0085\u0086\u008b\u0092\u0090\u0081\u0098\u0086\u008b\u0092\u0090\u0097\u0098\u0083\u0092\u008f\u0090\u008e\u008d\u008f\u008b\u0098\u0090\u008e\u0090\u008e\u0086\u008f\u008e\u0090\u0086\u0092\u0098\u0086\u008b\u0082\u0090\u0086\u008f\u0092\u0098\u008d\u008b\u0099\u009b\u008e\u0086\u0099\u0086\u008c\u0098\u008c\u008c\u0082\u008f\u008e\u009a\u0098\u0099\u0086\u008c\u0098\u0082\u0084\u0082\u0083\u0082\u0097\u0098\u0097\u0082\u0084").intern())) {
                    b = -1;
                } else {
                    int i10 = f27938 + 75;
                    f27935 = i10 % 128;
                    if (i10 % 2 != 0) {
                        b = 71;
                    }
                }
                break;
            case -316379660:
                b = !str.equals(m29287(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0086\u0085\u0082\u0084\u0082\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 2;
                break;
            case 320151695:
                b = str.equals(m29286("凞ٷ\ueab8◐\uf0c9᧧ǂ麗誕犰ፈ늘퓒薸", (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54465), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "恫や섪鳔").intern()) ? (byte) 9 : (byte) -1;
                break;
            case 664452134:
                b = !str.equals(m29287(null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, "\u009c\u008d\u008b\u009b\u008b\u008d\u0084\u0085\u008d\u008c\u0092\u009d\u0098\u008d\u008c\u0092\u009b\u0098\u0083\u0092\u008f\u0090\u008e\u008d\u008f\u008b\u0098\u0090\u008e\u0090\u008e\u0086\u008f\u008e\u0090\u0086\u0092\u0098\u0086\u008b\u0082\u0090\u0086\u008f\u0092\u0098\u008d\u008b\u0099\u009b\u008e\u0086\u0099\u0086\u008c\u0098\u008c\u008c\u0082\u008f\u008e\u009a\u0098\u0099\u0086\u008c\u0098\u0082\u0084\u0082\u0083\u0082\u0097\u0098\u0097\u0082\u0084").intern()) ? (byte) -1 : (byte) 19;
                break;
            case 704479150:
                b = !str.equals(m29286("姷\ufeff뒳얣\uf661\uf253ਹ젧㰹柆❪\u0c49ℏ䧬嬞逻衹\uefb1愼⤙쒫疜乲력筲\u2d73ⲩ䥜摶鬴\uab1dꝛꚤ慔", (char) View.MeasureSpec.getSize(0), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "ں髶ଗᗗ").intern()) ? (byte) -1 : Ascii.f22490CR;
                break;
            case 1395486086:
                b = !str.equals(m29286("ᶒ穕\uee5eŝᜨ\ufdd0傹ɀ鏷骺\uf8acĳ尘", (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63455), "\u0000\u0000\u0000\u0000", TextUtils.getCapsMode("", 0, 0) - 594732180, "氿贛\udfdc닷").intern()) ? (byte) -1 : Ascii.f22500SO;
                break;
            case 1928690944:
                if (!str.equals(m29287(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0090\u008e\u008f\u008f\u0092\u0091").intern())) {
                    b = -1;
                } else {
                    int i11 = f27938 + 103;
                    f27935 = i11 % 128;
                    b = i11 % 2 == 0 ? (byte) 7 : (byte) 70;
                }
                break;
            case 1982491468:
                b = !str.equals(m29287(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, "\u0090\u008e\u008f\u008f\u0092\u0091").intern()) ? (byte) -1 : (byte) 5;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return MolocoInitParams.class;
            case 1:
                return Moloco.class;
            case 2:
                return MolocoAd.class;
            case 3:
                return AdFormatType.class;
            case 4:
                return AdShowListener.class;
            case 5:
            case 6:
                return Banner.class;
            case 7:
                return BannerAdShowListener.class;
            case 8:
                return FullscreenAd.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                return InterstitialAdShowListener.class;
            case 11:
                return MediationInfo.class;
            case 12:
                int i12 = f27938 + 69;
                f27935 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 73 / 0;
                }
                return RewardedInterstitialAd.class;
            case 13:
                return RewardedInterstitialAdShowListener.class;
            case 14:
            case 15:
                return MraidActivity.class;
            case 16:
            case 17:
                return StaticAdActivity.class;
            case 18:
            case 19:
                return VastActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        Object obj = null;
        map.put(m29287(null, 127 - TextUtils.getOffsetBefore("", 0), null, "\u008e\u0084\u008f\u0092\u008d\u008c\u008f\u0095\u0099\u0086\u0087\u0082\u0084\u0082\u0083\u0082\u0081\u008d\u008e\u009e").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11858bw.m29284();
            }
        });
        map.put(m29287(null, 127 - View.resolveSize(0, 0), null, "\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0090\u008e\u008f\u008f\u0092\u0091\u008d\u008e\u009e").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11858bw.m29288((Banner) list.get(0));
            }
        });
        map.put(m29287(null, TextUtils.indexOf("", "", 0) + 127, null, "\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0090\u008e\u008f\u008f\u0092\u0091\u008d\u008e\u008c").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11858bw.m29289((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        int i2 = f27938 + 13;
        f27935 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static Object m29285() {
        int i = 2 % 2;
        int i2 = f27938 + 7;
        f27935 = i2 % 128;
        int i3 = i2 % 2;
        Moloco moloco = Moloco.INSTANCE;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return moloco;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static BannerAdShowListener m29290(Banner banner) {
        int i = 2 % 2;
        int i2 = f27938 + 61;
        f27935 = i2 % 128;
        if (i2 % 2 == 0) {
            return banner.getAdShowListener();
        }
        banner.getAdShowListener();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m29291(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = 2 % 2;
        int i2 = f27938 + 15;
        f27935 = i2 % 128;
        int i3 = i2 % 2;
        banner.setAdShowListener(bannerAdShowListener);
        int i4 = f27935 + 5;
        f27938 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29286(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f27939) ^ ((long) f27942)) ^ ((long) f27940));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29287(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f27943;
            int i2 = f27941;
            if (f27936) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f27937) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
