package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.monetization.ads.base.model.reward.RewardData;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ck */
/* JADX INFO: loaded from: classes6.dex */
public final class C11873ck extends AbstractC11840be {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28164 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static int f28165 = -744849088;

    /* JADX INFO: renamed from: ﱡ */
    private static char f28166 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28167 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static long f28168 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char f28169 = 54219;

    /* JADX INFO: renamed from: ｋ */
    private static char f28170 = 14960;

    /* JADX INFO: renamed from: ﾇ */
    private static char f28171 = 7299;

    /* JADX INFO: renamed from: ﾒ */
    private static char f28172 = 17060;

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ int m29577(Reward reward) {
        int i = 2 % 2;
        int i2 = f28167 + 103;
        f28164 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29583(reward);
        }
        m29583(reward);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29582(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i = 2 % 2;
        int i2 = f28167 + 35;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        m29593(interstitialAd, interstitialAdEventListener);
        int i4 = f28164 + 81;
        f28167 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ MediaFile m29586(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f28164 + 25;
        f28167 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29601(videoAd);
        }
        m29601(videoAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29587(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f28167 + 73;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        String strM29578 = m29578(impressionData);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return strM29578;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m29588(VideoController videoController, VideoEventListener videoEventListener) {
        int i = 2 % 2;
        int i2 = f28167 + 35;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m29581(videoController, videoEventListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f28164 + 45;
        f28167 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ AdInfo m29589(InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = f28164 + 63;
        f28167 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29584(interstitialAd);
        }
        m29584(interstitialAd);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29590(AdInfo adInfo) {
        int i = 2 % 2;
        int i2 = f28167 + 65;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        String strM29602 = m29602(adInfo);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return strM29602;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29591(MediaFile mediaFile) {
        int i = 2 % 2;
        int i2 = f28167 + 67;
        f28164 = i2 % 128;
        if (i2 % 2 != 0) {
            m29597(mediaFile);
            throw null;
        }
        String strM29597 = m29597(mediaFile);
        int i3 = f28164 + 31;
        f28167 = i3 % 128;
        int i4 = i3 % 2;
        return strM29597;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ AdInfo m29595(RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = f28167 + 25;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        AdInfo adInfoM29585 = m29585(rewardedAd);
        int i4 = f28167 + 53;
        f28164 = i4 % 128;
        if (i4 % 2 == 0) {
            return adInfoM29585;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m29598(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f28164 + 41;
        f28167 = i2 % 128;
        if (i2 % 2 != 0) {
            return m29592(videoAd);
        }
        m29592(videoAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29599(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = 2 % 2;
        int i2 = f28167 + 63;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        m29580(bannerAdView, bannerAdEventListener);
        int i4 = f28164 + 97;
        f28167 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29600(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i = 2 % 2;
        int i2 = f28164 + 67;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        m29594(rewardedAd, rewardedAdEventListener);
        int i4 = f28167 + 73;
        f28164 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29603(Reward reward) {
        int i = 2 % 2;
        int i2 = f28164 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        String strM29596 = m29596(reward);
        int i4 = f28167 + 77;
        f28164 = i4 % 128;
        int i5 = i4 % 2;
        return strM29596;
    }

    public C11873ck(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f28164 + 97;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        String libraryVersion = MobileAds.getLibraryVersion();
        int i4 = f28167 + 11;
        f28164 = i4 % 128;
        if (i4 % 2 == 0) {
            return libraryVersion;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b;
        int i = 2 % 2;
        int i2 = f28164 + 95;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -1850459313:
                b = !str.equals(m29604("瘐\u202c연ᝎჃ\u2fed", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12906), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollBarSize() >> 8, "\ue652덊櫅頲").intern()) ? (byte) -1 : Ascii.f22500SO;
                break;
            case -1836618638:
                if (!str.equals(m29579("詛뺶沀應\uf03b兎\ud7c7괕푦힙", 10 - View.resolveSize(0, 0)).intern())) {
                    b = -1;
                } else {
                    int i4 = f28167 + 57;
                    f28164 = i4 % 128;
                    b = i4 % 2 == 0 ? (byte) 0 : (byte) 1;
                }
                break;
            case -1666698098:
                b = !str.equals(m29579("䃨癍鎂뙻怇͡詛뺶䘺ὖ", 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1401317165:
                if (!str.equals(m29604("ᤡꉺ촜멠〯พ骉浏烬ﯝᇉ쾁냑筊蛷∧㚒ᓸ", (char) (22027 - TextUtils.getTrimmedLength("")), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "볙吪ବ퍖").intern())) {
                    b = -1;
                } else {
                    int i5 = f28167 + 21;
                    f28164 = i5 % 128;
                    b = i5 % 2 == 0 ? (byte) 10 : (byte) 110;
                }
                break;
            case -1338246468:
                if (!str.equals(m29579("櫪ᠬ\uf261潤ﭑᚳ뵴哛慲㟡꡶홿퇘澘፨⣫娧\ue4b6\u0a60ﴘ궫韗\udf13嵷넡쑪쳝쇜珰稡禈튽㘣뇨識ᅔ\uf215ᔞ鮁\ud94fɭⶭ", (ViewConfiguration.getPressedStateDuration() >> 16) + 41).intern())) {
                    b = -1;
                } else {
                    int i6 = f28167 + 51;
                    f28164 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 8;
                }
                break;
            case -1139615429:
                if (!str.equals(m29604("ष䓾얀洕ㅧ﵎ꧢ蛞枥\uf5ab㈨͜硘䧅iᷡ楨￼Ꭺ呒嗇Გ禖髽弔刌沑苔㮷\uf787▴咖韟\u0a64\uef79慟ﮦ㟟\ue02d", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16864), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 863574241, "\ue148礘\ue133恁").intern())) {
                    b = -1;
                } else {
                    int i8 = f28164 + 87;
                    f28167 = i8 % 128;
                    int i9 = i8 % 2;
                }
                break;
            case -1115843213:
                if (!str.equals(m29604("쮦\ue113쑋骠ླ듀婸ᆺ鸓\ue12a❢\ue27a㙠掟", (char) (KeyEvent.keyCodeFromString("") + 38997), "\u0000\u0000\u0000\u0000", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "భ\u18f8啭梘").intern())) {
                    b = -1;
                } else {
                    int i10 = f28167 + 41;
                    f28164 = i10 % 128;
                    b = i10 % 2 == 0 ? (byte) 5 : (byte) 2;
                }
                break;
            case -650052115:
                b = !str.equals(m29604("㱂卑ե埍Ӂ쫛⹔\udd78䆸ힲ욉鯱熅ʭ社\u1ae9ᱼ骒᷼킨\uf703糤䧅", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0000\u0000\u0000\u0000", 585494285 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "෯\ue5efꠢ\ue255").intern()) ? (byte) -1 : (byte) 17;
                break;
            case -610771047:
                b = !str.equals(m29579("⟜㷛ቸ篿䳽恻\uee6e肱용五", 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 20;
                break;
            case -609786639:
                b = !str.equals(m29579("⟜㷛ቸ篿䳽恻㐽ꇐ詛뺶", 10 - TextUtils.indexOf("", "")).intern()) ? (byte) -1 : Ascii.f22499SI;
                break;
            case -572702516:
                b = !str.equals(m29604("展萧厘ᅭ蓶㦒鵝䨓銮", (char) View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", Color.alpha(0) + 431532835, "⌰뢫ﰙ璚").intern()) ? (byte) -1 : (byte) 3;
                break;
            case -564429827:
                b = !str.equals(m29579("⟜㷛ቸ篿䳽恻㐽ꇐ詛뺶✘벋\udbeb䢚⁷槲烣\uf741䌫ᤥ㘣뇨\uf2ba䰏", (ViewConfiguration.getScrollBarSize() >> 8) + 23).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -150968480:
                b = !str.equals(m29604("䑷歙脎罼䘡\udb71䙙тǀ", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1767590237 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "崫孉㱩≥").intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case 308060116:
                b = !str.equals(m29579("㥢䲪넡쑪쳝쇜詛뺶奎㮟ꀀ깾", View.getDefaultSize(0, 0) + 12).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 320151695:
                b = !str.equals(m29604("ؗ\ue427풞梌\uf5e5㈶Ԣ鈲혹⻓ꚅ淰莐\u0013", (char) (37884 - TextUtils.indexOf("", "", 0, 0)), "\u0000\u0000\u0000\u0000", View.resolveSizeAndState(0, 0, 0), "\uf748ᐪﲲ隓").intern()) ? (byte) -1 : (byte) 12;
                break;
            case 871099991:
                b = !str.equals(m29604("鴚抈癩蔿䰆㵯➳컌ሱ긐櫡\ue4b6诩㇆\uf31f", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24482), "\u0000\u0000\u0000\u0000", 752958201 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "寮\ue13aꈬ\ue15f").intern()) ? (byte) -1 : (byte) 9;
                break;
            case 957243679:
                b = !str.equals(m29579("㥢䲪넡쑪쳝쇜詛뺶✘벋\udbeb䢚⁷槲烣\uf741䌫ᤥ㘣뇨\uf2ba䰏", 20 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 1228411167:
                if (!str.equals(m29579("ﳤꋞ䌫ᤥ撢⎯\uf03b兎\uf03b兎역䦖詛뺶✘벋\udbeb䢚⁷槲烣\uf741䌫ᤥ㘣뇨\uf2ba䰏", Color.blue(0) + 27).intern())) {
                    b = -1;
                } else {
                    int i11 = f28167 + 61;
                    f28164 = i11 % 128;
                    int i12 = i11 % 2;
                    b = Ascii.f22490CR;
                }
                break;
            case 1955530641:
                if (!str.equals(m29579("詛뺶ﳤꋞ鸷㪿", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6).intern())) {
                    b = -1;
                } else {
                    int i13 = f28167 + 19;
                    f28164 = i13 % 128;
                    int i14 = i13 % 2;
                }
                break;
            case 1955869213:
                b = !str.equals(m29579("詛뺶圾ꚴ뚨㞙", 6 - Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 2117435870:
                b = !str.equals(m29604("締⸂\ueb9d먛鸃\uda71描", (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), "\u0000\u0000\u0000\u0000", (-1639309689) - Color.blue(0), "蜤䨞ﲞࠒ").intern()) ? (byte) -1 : (byte) 19;
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
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                return ImpressionData.class;
            case 6:
                return MobileAds.class;
            case 7:
            case 8:
                return BannerAdView.class;
            case 9:
                return VideoController.class;
            case 10:
                return VideoEventListener.class;
            case 11:
                return BannerAdEventListener.class;
            case 12:
                return InterstitialAd.class;
            case 13:
                return InterstitialAdEventListener.class;
            case 14:
                return Reward.class;
            case 15:
                return RewardedAd.class;
            case 16:
                return RewardedAdEventListener.class;
            case 17:
                return VideoAdPlaybackListener.class;
            case 18:
                return MediaFile.class;
            case 19:
                return VideoAd.class;
            case 20:
                return RewardData.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29604("▞䣴菦呾殺䞴ᶧ⊄ͺ\u318f밳", (char) View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", 61567 - AndroidCharacter.getMirror('0'), "会廰\ue1b5䪴").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29590((AdInfo) list.get(0));
            }
        });
        map.put(m29579("쓇鏉鵰\ueb5f\udd8f\udf44\uee6e肱용五", TextUtils.indexOf((CharSequence) "", '0') + 11).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29587((ImpressionData) list.get(0));
            }
        });
        map.put(m29579("\u181bꪤ證둲뻥퀀长䣠✘벋\udbeb䢚⁷槲烣\uf741䌫ᤥ㘣뇨\uf2ba䰏", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11873ck.m29588((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m29579("쓇鏉固㽐\ud9d6䫠䌫ᤥ撢⎯\uf03b兎\uf03b兎역䦖ﳤꋞ鸷㪿", (ViewConfiguration.getEdgeSlop() >> 16) + 20).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29589((InterstitialAd) list.get(0));
            }
        });
        map.put(m29604("\ue4af\uda1b\ueba6ⱽ☱ᙗꕔ枇遍䟂깊땍է\udf13쌊", (char) (56471 - TextUtils.getOffsetAfter("", 0)), "\u0000\u0000\u0000\u0000", (-2120295248) - Color.alpha(0), "냺黜鞁◜").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Integer.valueOf(C11873ck.m29577((Reward) list.get(0)));
            }
        });
        map.put(m29604("乐塌蝮㼆শ개⪦鮗ꈨᡧ\uee99\u0ff9恗", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63268), "\u0000\u0000\u0000\u0000", KeyEvent.getDeadChar(0, 0) + 616023710, "黲럆┤쓷").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29603((Reward) list.get(0));
            }
        });
        map.put(m29579("쓇鏉鵰\ueb5fꀀ깾揵朔ƾ鞑뻙ꢾ摉鯕䋾ﳶ뗦焄", 17 - ExpandableListView.getPackedPositionType(0L)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.14
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29595((RewardedAd) list.get(0));
            }
        });
        map.put(m29604("ﳷࢃ刎忧ㅕ\ue7de⤌쪘蠊퉧ზಎ赗䴨쭸\ue1b8쫿⤧뚍紉녝歩ክ㽉ⶓၷ", (char) ((ViewConfiguration.getTapTimeout() >> 16) + 6556), "\u0000\u0000\u0000\u0000", Color.blue(0), "㜋愎鲆鰙").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11873ck.m29600((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m29604("躂\ued44\uf157ℏ㽛䶮엶敤㻆ᄏ빱գ轓ꅤ뀹툇\u0590袤荕\ueebc䷡촯熮昫腜徊\ufbca掅\ue049㯚", (char) (16230 - TextUtils.getOffsetBefore("", 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getPressedStateDuration() >> 16, "ꈍ冦曀氿").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.13
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11873ck.m29582((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m29579("쓇鏉Ѽ벝㐽ꇐꖺ哪Ҁ㬤怇͡퓩ꢖ現㖜", 14 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29591((MediaFile) list.get(0));
            }
        });
        map.put(m29604("⚬쏁龲\ueffa﹩\ued92⾈\uf56b댛秕㨄☆ᙥ\uef88⯂ἷ\uee13䅑ꆆ", (char) (55005 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 464067433, "槆ꤛ\udd1b\uebd6").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29586((VideoAd) list.get(0));
            }
        });
        map.put(m29579("쓇鏉證둲뻥퀀长䣠詛뺶ﳤꋞ鸷㪿", 14 - Color.alpha(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11873ck.m29598((VideoAd) list.get(0));
            }
        });
        map.put(m29579("\u181bꪤ緕\uf82d禈튽㘣뇨識ᅔ㫡ﺪ氽\ueddf䟄샘॓聫ᆉዪ\udbeb䢚쳝쇜", 23 - ExpandableListView.getPackedPositionChild(0L)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ck.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11873ck.m29599((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i2 = f28167 + 95;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m29602(AdInfo adInfo) {
        int i = 2 % 2;
        int i2 = f28167 + 39;
        f28164 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            adInfo.getAdUnitId();
            super.hashCode();
            throw null;
        }
        String adUnitId = adInfo.getAdUnitId();
        int i3 = f28167 + 23;
        f28164 = i3 % 128;
        if (i3 % 2 == 0) {
            return adUnitId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29578(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f28167 + 107;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        String rawData = impressionData.getRawData();
        int i4 = f28167 + 7;
        f28164 = i4 % 128;
        if (i4 % 2 == 0) {
            return rawData;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m29581(VideoController videoController, VideoEventListener videoEventListener) {
        int i = 2 % 2;
        int i2 = f28167 + 103;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        videoController.setVideoEventListener(videoEventListener);
        int i4 = f28167 + 115;
        f28164 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static AdInfo m29584(InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = f28164 + 13;
        f28167 = i2 % 128;
        if (i2 % 2 == 0) {
            interstitialAd.getInfo();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        AdInfo info = interstitialAd.getInfo();
        int i3 = f28164 + 31;
        f28167 = i3 % 128;
        int i4 = i3 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static int m29583(Reward reward) {
        int i = 2 % 2;
        int i2 = f28164 + 65;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        int amount = reward.getAmount();
        int i4 = f28164 + 103;
        f28167 = i4 % 128;
        int i5 = i4 % 2;
        return amount;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29596(Reward reward) {
        int i = 2 % 2;
        int i2 = f28167 + 23;
        f28164 = i2 % 128;
        if (i2 % 2 != 0) {
            reward.getType();
            throw null;
        }
        String type = reward.getType();
        int i3 = f28167 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28164 = i3 % 128;
        int i4 = i3 % 2;
        return type;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static AdInfo m29585(RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = f28164 + 107;
        f28167 = i2 % 128;
        if (i2 % 2 == 0) {
            rewardedAd.getInfo();
            throw null;
        }
        AdInfo info = rewardedAd.getInfo();
        int i3 = f28164 + 39;
        f28167 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return info;
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m29594(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i = 2 % 2;
        int i2 = f28164 + 89;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m29593(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i = 2 % 2;
        int i2 = f28164 + 85;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        int i4 = f28164 + 77;
        f28167 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29597(MediaFile mediaFile) {
        int i = 2 % 2;
        int i2 = f28167 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28164 = i2 % 128;
        int i3 = i2 % 2;
        String url = mediaFile.getUrl();
        int i4 = f28164 + 39;
        f28167 = i4 % 128;
        if (i4 % 2 != 0) {
            return url;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static MediaFile m29601(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f28164 + 85;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        MediaFile mediaFile = videoAd.getMediaFile();
        int i4 = f28164 + 109;
        f28167 = i4 % 128;
        if (i4 % 2 != 0) {
            return mediaFile;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29592(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f28164 + 29;
        f28167 = i2 % 128;
        if (i2 % 2 != 0) {
            return videoAd.getInfo();
        }
        videoAd.getInfo();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m29580(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = 2 % 2;
        int i2 = f28164 + 11;
        f28167 = i2 % 128;
        int i3 = i2 % 2;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        int i4 = f28167 + 77;
        f28164 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29579(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f28170)) ^ ((c2 >>> 5) + f28169)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f28172) ^ ((c3 + i2) ^ ((c3 << 4) + f28171))));
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

    /* JADX INFO: renamed from: ﾒ */
    private static String m29604(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28168) ^ ((long) f28165)) ^ ((long) f28166));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
