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
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.br */
/* JADX INFO: loaded from: classes6.dex */
public final class C11853br extends AbstractC11840be {

    /* JADX INFO: renamed from: ﮐ */
    private static int f27818 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char f27819 = 64238;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27820 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static long f27821 = -5928053858977158289L;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27822;

    /* JADX INFO: renamed from: ﾒ */
    private static long f27823;

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ double m29116(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 109;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        double dM29115 = m29115(impressionData);
        int i4 = f27818 + 75;
        f27822 = i4 % 128;
        if (i4 % 2 == 0) {
            return dM29115;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ MediationManager m29117() {
        int i = 2 % 2;
        int i2 = f27822 + 17;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        MediationManager mediationManagerM29111 = m29111();
        int i4 = f27822 + 29;
        f27818 = i4 % 128;
        if (i4 % 2 != 0) {
            return mediationManagerM29111;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    static /* synthetic */ String m29118(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27822 + 35;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        String strM29107 = m29107(impressionData);
        int i4 = f27822 + 65;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return strM29107;
    }

    /* JADX INFO: renamed from: ﱡ */
    static /* synthetic */ String m29119(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27822 + 65;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        String strM29108 = m29108(impressionData);
        int i4 = f27822 + 11;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return strM29108;
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ boolean m29121() {
        int i = 2 % 2;
        int i2 = f27822 + 5;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM29114 = m29114();
        int i4 = f27822 + 79;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return zM29114;
    }

    /* JADX INFO: renamed from: ﻏ */
    static /* synthetic */ String m29123(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 111;
        f27822 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29106(impressionData);
        }
        m29106(impressionData);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ PlacementType m29124(Constants.AdType adType) {
        int i = 2 % 2;
        int i2 = f27818 + 59;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType placementTypeM29135 = m29135(adType);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return placementTypeM29135;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ Constants.AdType m29125(Placement placement) {
        int i = 2 % 2;
        int i2 = f27818 + 83;
        f27822 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29145(placement);
        }
        m29145(placement);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m29127(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27822 + 59;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        String strM29109 = m29109(impressionData);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return strM29109;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29130(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f27818 + 65;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        String strM29141 = m29141(adsConfig);
        int i4 = f27822 + 65;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return strM29141;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m29131(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 39;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        String strM29112 = m29112(impressionData);
        int i4 = f27822 + 113;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return strM29112;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ List m29133(MediationConfig mediationConfig) {
        int i = 2 % 2;
        int i2 = f27822 + 81;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        List<AdapterConfiguration> listM29142 = m29142(mediationConfig);
        int i4 = f27822 + 31;
        f27818 = i4 % 128;
        if (i4 % 2 != 0) {
            return listM29142;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29136(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f27818 + 25;
        f27822 = i2 % 128;
        if (i2 % 2 != 0) {
            m29126(adsConfig);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM29126 = m29126(adsConfig);
        int i3 = f27818 + 105;
        f27822 = i3 % 128;
        int i4 = i3 % 2;
        return strM29126;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29137(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 29;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        String strM29113 = m29113(impressionData);
        int i4 = f27818 + 17;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return strM29113;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ String m29138(Placement placement) {
        int i = 2 % 2;
        int i2 = f27822 + 111;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        String strM29132 = m29132(placement);
        int i4 = f27818 + 99;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return strM29132;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ PlacementType m29139(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27822 + 101;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType placementTypeM29120 = m29120(impressionData);
        int i4 = f27822 + 51;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return placementTypeM29120;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ PlacementsHandler m29140(MediationManager mediationManager) {
        int i = 2 % 2;
        int i2 = f27822 + 39;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        PlacementsHandler placementsHandlerM29147 = m29147(mediationManager);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        int i5 = f27818 + 91;
        f27822 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return placementsHandlerM29147;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29143(InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f27822 + 61;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        m29149(interstitialListener);
        if (i3 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f27822 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27818 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m29144(RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f27818 + 71;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        m29134(rewardedListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f27818 + 41;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Constants.AdType m29146(String str) {
        int i = 2 % 2;
        int i2 = f27818 + 81;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        Constants.AdType adTypeM29122 = m29122(str);
        int i4 = f27818 + 35;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return adTypeM29122;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29148(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 83;
        f27822 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m29110(impressionData);
            super.hashCode();
            throw null;
        }
        String strM29110 = m29110(impressionData);
        int i3 = f27822 + 73;
        f27818 = i3 % 128;
        if (i3 % 2 != 0) {
            return strM29110;
        }
        throw null;
    }

    public C11853br(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0046  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo28808(String str) {
        int i = 2 % 2;
        byte b = 0;
        switch (str.hashCode()) {
            case -2041833493:
                b = !str.equals(m29128("ण舾픮푶䅱㥠탂묌俕혝坕", (char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') - 1299346956, "\uf385趉▲귞").intern()) ? (byte) -1 : (byte) 16;
                break;
            case -1598046662:
                if (!str.equals(m29128("⠅ᔴᯎ傖逦\u20c2\uefc0ꨵ\ue63a抬⢢蘢륳ᛮ죱", (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5260), "\u0000\u0000\u0000\u0000", (-1026886107) - View.getDefaultSize(0, 0), "╕쫶賂崔").intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1115843213:
                b = !str.equals(m29128("䙷\ud833꽽礟弋롓\ud9fe퀇걇tጻ냟瑂笔", (char) (TextUtils.getCapsMode("", 0, 0) + 33461), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0, 0), "偺\u0bc4땦튂").intern()) ? (byte) -1 : (byte) 9;
                break;
            case -847426041:
                b = !str.equals(m29129("吞웇◾\uf211呟귌\uf341뀬淪\udf89ꄖɛ༉N៎澽嵍눑얞맱\ue29a\ue4f1ꡟୂ", 1 - View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -498060603:
                b = !str.equals(m29129("⚐踍\u0bd4\uf8a8⛀\ue50e\udd6b몆證靋輫࣏綜", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -368841467:
                b = !str.equals(m29128("늇遜뾭뜦혌㳃졺ﳕ", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTouchSlop() >> 8, "\uec70菍ꤑ칰").intern()) ? (byte) -1 : Ascii.f22500SO;
                break;
            case -174936018:
                b = !str.equals(m29129("ﾀ䏀ᯗ䲦ￒ⣊쵾ຊ剎媏鼨볋", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case 99044255:
                b = !str.equals(m29129("튬\uaace쭔㢪틼쇍ᷫ窄罵뎈侫죍覠汽糧ꔟ\udbfd", -MotionEvent.axisFromString("")).intern()) ? (byte) -1 : Ascii.f22503VT;
                break;
            case 438795617:
                if (!str.equals(m29129("শ\ued0f襞著৸蘅忴왭ꑥ\uf456ද琟努⮉뭸᧦ç駞", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b = -1;
                } else {
                    int i2 = f27822 + 71;
                    f27818 = i2 % 128;
                    b = i2 % 2 != 0 ? Ascii.f22499SI : (byte) 39;
                }
                break;
            case 578208537:
                if (!str.equals(m29129("혉螐횭㡓홏\uec9e\u001a穬篷黒剓", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i3 = f27818 + 13;
                    f27822 = i3 % 128;
                    if (i3 % 2 != 0) {
                        b = 1;
                    }
                }
                break;
            case 769047372:
                b = !str.equals(m29128("⯨쟧ﯡꉧ䂇斫᙮继駎焊䱝믹", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumFlingVelocity() >> 16, "퉥ꏵ㌹\ue324").intern()) ? (byte) -1 : (byte) 10;
                break;
            case 806552769:
                if (!str.equals(m29128("팠伎렌耖춽䳫\udd78菃迭鿈ዄ", (char) ('0' - AndroidCharacter.getMirror('0')), "\u0000\u0000\u0000\u0000", 1426910283 - Process.getGidForName(""), "䱖೬ꉕ檂").intern())) {
                    b = -1;
                } else {
                    int i4 = f27822 + 19;
                    f27818 = i4 % 128;
                    b = i4 % 2 != 0 ? (byte) 13 : (byte) 54;
                }
                break;
            case 1062384924:
                if (!str.equals(m29129("ᬲ풅끤\uef0e᭢뾆曛괠뛫췃㒛Ὡ䀾ሑ艺犪ቨꁂ倚ꓪ궰", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b = -1;
                } else {
                    int i5 = f27818 + 49;
                    f27822 = i5 % 128;
                    if (i5 % 2 == 0) {
                        b = 5;
                    } else {
                        b = 4;
                    }
                }
                break;
            case 1212533506:
                if (!str.equals(m29128("ᷴ㮼ꦀ飆蒔ᢛ◎そ9桯䊾胔߀颵妠ᬠ", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62643), "\u0000\u0000\u0000\u0000", View.getDefaultSize(0, 0), "漒㗚듦嗴").intern())) {
                    b = -1;
                } else {
                    int i6 = f27822 + 71;
                    f27818 = i6 % 128;
                    b = i6 % 2 != 0 ? (byte) 8 : Ascii.SYN;
                }
                break;
            case 1297340448:
                b = !str.equals(m29128("퍝퉟䅉驯ᩱ뤙ꊤꕁ\ud8d6骺晖烗\ue950잌ਝ补෨玆颟\ud8a1", (char) ExpandableListView.getPackedPositionType(0L), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0', 0, 0) + 1, "䲺\ufde8遟茋").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1775008410:
                if (!str.equals(m29128("ㅕ恞ě嗓鱚㯳ᰌ旿ె枑\uf43d", (char) ExpandableListView.getPackedPositionGroup(0L), "\u0000\u0000\u0000\u0000", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1891481050, "⛀䉊ꢏ\ud898").intern())) {
                    b = -1;
                } else {
                    int i7 = f27822 + 29;
                    f27818 = i7 % 128;
                    b = i7 % 2 != 0 ? Ascii.DC2 : (byte) 74;
                }
                break;
            case 1884304309:
                if (!str.equals(m29128("쀪솂棈蟝\uda5b⿃\u1afeᕾ蜶퉱砉\udbc8榡רּ幥ㄻ", (char) (Color.argb(0, 0, 0, 0) + 45590), "\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16, "狗鸃ᙃ醲").intern())) {
                    b = -1;
                } else {
                    int i8 = f27818 + 19;
                    f27822 = i8 % 128;
                    if (i8 % 2 == 0) {
                        b = 1;
                    }
                }
                break;
            case 1955869213:
                if (!str.equals(m29129("愚隄쥚氌慛ﶏῐ⸸쳖迊", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i9 = f27818 + 13;
                    f27822 = i9 % 128;
                    if (i9 % 2 == 0) {
                        b = 2;
                    } else {
                        b = 5;
                    }
                }
                break;
            case 1969669106:
                if (!str.equals(m29129("⍻玧\udc9eꉺ⌺\u18acਲ਼\ue074躨櫢塢刚硤", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern())) {
                    b = -1;
                } else {
                    int i10 = f27818 + 85;
                    f27822 = i10 % 128;
                    if (i10 % 2 == 0) {
                        b = 3;
                    } else {
                        b = 2;
                    }
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case 8:
                return RewardedListener.class;
            case 9:
                return ImpressionData.class;
            case 10:
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case 12:
                return Rewarded.class;
            case 13:
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        Field declaredField;
        int i = 2 % 2;
        int i2 = f27822 + 73;
        f27818 = i2 % 128;
        try {
            try {
                if (i2 % 2 == 0) {
                    Process.myPid();
                    declaredField = FairBid.class.getDeclaredField(m29129("︖鵱쟅\ue62e﹅\uf65aᅐꐼ叼萟䌍ᙴꔧ寙\uf5dd", 0).intern());
                } else {
                    declaredField = FairBid.class.getDeclaredField(m29129("︖鵱쟅\ue62e﹅\uf65aᅐꐼ叼萟䌍ᙴꔧ寙\uf5dd", (Process.myPid() >> 22) + 1).intern());
                }
                return (String) declaredField.get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return C12019hv.m30362().m30363().m30451(FairBid.class, m29128("䗍୦\uf5ff㓥\udcc2ჷ\uf4a8\ue203\ue484∧톀嗩텄两\uf8ec\uef86❙\udb08쟲\ue2c8︿氛髚", (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", Gravity.getAbsoluteGravity(0, 0) + 699056996, "擭\uaac3툩\uedae").intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29129("쳱耊롆叆첖\ueb00滬ᇆ愨饅㲵ꎮ韽䚄詿칭얈\uf4c8堺ᠦ穦ꈰ㗺ꪲ꠳偢莸\uf55e\udef7ﶾ入", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29117();
            }
        });
        map.put(m29129("롮栳誖ⶠ렉̹尼澬ᖶ煌\u0e75\uddd9\ue373꺄뢬뀄넹ᳵ櫩晄\u0ef0䨘܌퓤\udcb2롍", AndroidCharacter.getMirror('0') - '/').intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29124((Constants.AdType) list.get(0));
            }
        });
        map.put(m29129("寿\udc25弣\udce3官뜯覉黧\uf62e앾\udbcbⲏô᪱洜䅉劥ꣂ뽐霖\ued6e︪튁▿㼰\u0c5b擄穿䧹ꆆ똱蠯鮫\uf7d3", 1 - TextUtils.getTrimmedLength("")).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.12
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29139((ImpressionData) list.get(0));
            }
        });
        map.put(m29128("ᤩ\ue3fb佇\udf73뾨㷛䚱聦\uf078씭\ue416㠩ᙊ曊蚦벟\ude0fຍ뺆햵釆錣⎼頵匀쌾\ue5fc岏狝", (char) (7776 - View.resolveSizeAndState(0, 0, 0)), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 699203393, "삘匀惖䰞").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.19
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29131((ImpressionData) list.get(0));
            }
        });
        map.put(m29128("\uf232∖ெ＠sꉽ—\u086dꡑ셌츿逖鋏ഝ\ufb19鑬㖬Ἥﶎ觞ꤥ煻\ud945꾝퀕䇃⯸겇ऍ\ue4fa썧ꯣꮰ볯㙽ဦ", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0') + 1, "䠺殍무䤊").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.16
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29137((ImpressionData) list.get(0));
            }
        });
        map.put(m29128("깕䥍ᮽ䇦冱\udbb6帖겗\u0ea4縴邕扱ﺶ\u0df7唺鸘ഡ狒\uf6c3觧㑑\ue139\u0ebfﲱꟑ呃\u181f鑬캔", (char) (6619 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1824008939, "ᙙ䟕\udc93⼙").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.17
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29127((ImpressionData) list.get(0));
            }
        });
        map.put(m29129("娽焁㧠㛈婚ᨋ\uef4a瓌\uf7ec桚봈욤Ķ랕\u0bdfꭢ卧צ\ud993紽\uecac匈둏쾇㻸ꅻȄ遅䠜ಲ", Color.argb(0, 0, 0, 0) + 1).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.18
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29148((ImpressionData) list.get(0));
            }
        });
        map.put(m29128("锡艮쁚噯\udc10ℌ⤑\udd6bᯁ凈䵁ⲩ街ᴿᘬ嶌\ud9e1ം\ude37曂诖ශ뫨\ude24蛓몙", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 19982), "\u0000\u0000\u0000\u0000", Color.alpha(0), "飹蟩෩腎").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.20
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Double.valueOf(C11853br.m29116((ImpressionData) list.get(0)));
            }
        });
        map.put(m29129("ꌫ齖躻∘ꍌ\uf45c堑怜\u0efa蘍\u0a53퉴\uf820姂버뾲ꩱ\uebb1滈槭ᖺ뵊̇\udb40쟦伹땘蒗넦\ue2c8枙", 1 - KeyEvent.normalizeMetaState(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.24
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29118((ImpressionData) list.get(0));
            }
        });
        map.put(m29129("㥾蒩鼣\udbd5㤙\uefa3䦉駑钯鷲ᯋ⮹扵䈽괜䙿〤\uf04e罐造迯ꚷ\u1289⊞嶷哀ꓝ絅⭥亂瘗輤蘆꽗ࡀ\ud9cd哰", TextUtils.indexOf("", "") + 1).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29123((ImpressionData) list.get(0));
            }
        });
        map.put(m29129("ψ牁鼩ˎί᥋䦃䃊긙欚ᯁ\uf2a2壃듕괖齤\u0a92ڦ罚䤻땙偝ኆﮞ朔ꈻ\ua4caꑐᇎ\u0fdf瘋", TextUtils.getCapsMode("", 0, 0) + 1).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29119((ImpressionData) list.get(0));
            }
        });
        map.put(m29129("侪唆\ue066噛俍㸌㛌ᑗ\ue266䱝撵\ua636", 1 - Color.green(0)).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29136((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m29128("\ud823砋Ꮱ击쨨酙\ud860\uf097", (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "\u0000\u0000\u0000\u0000", TextUtils.getCapsMode("", 0, 0), "\ue806뺢\ud96b븺").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29130((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m29128("蓔焽닩龺ﻌ䙄삃\uaa3b쮙뿧붽敿쉫ꁑ졳孷쑂뢮‑裴纠〈僧ꔝ", (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "텼ꢔဪ䤈").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29133((MediationConfig) list.get(0));
            }
        });
        map.put(m29129("裼蘞뎪皴袛\ued14攀㒩┬齔㝓蛘폩䂜膒\ueb05膉\uf2d9召㵌㹼ꐤ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29125((Placement) list.get(0));
            }
        });
        map.put(m29129("薵鋙닡傭藒陸摋ኰ⡥讓㘘ꃁ\udea0呛胙촜賏\ue61b办ᭉ", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29138((Placement) list.get(0));
            }
        });
        map.put(m29129("Ꝭ돑粪⪷꜋\ud8dbꨀ梪઼ꪛ\uf853\udadbﱹ畓互뜆긫윺鳙慘ᇸ釢\uf101폸", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29140((MediationManager) list.get(0));
            }
        });
        map.put(m29129("⣩磻ᤈ⸚⢎Ᏹ쾢氖蔱憄鷫\ude63珴빙⬰뎪↰", -TextUtils.indexOf((CharSequence) "", '0')).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11853br.m29146((String) list.get(0));
            }
        });
        map.put(m29129("э꾊\uf4d0왢о쒀≺葦ꦟ뛕瀯㘙彆椙웯寓ഐ\udb48ᒮ趯닔趦祪㼺悏翴켨", -TextUtils.lastIndexOf("", '0')).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.14
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11853br.m29143((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m29128("훞ᙪ\ue68f쮈᧩튝ࠥ\uecfaꅈ翼䖶䆳䘕줍氩᎒龂䃡綧", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 52323), "\u0000\u0000\u0000\u0000", 1249940983 - ExpandableListView.getPackedPositionType(0L), "\uf764肕扊鏌").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.13
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11853br.m29144((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m29128("쬱词灻笼걪쟛夫踬ራ獕矖꽃\uef46", (char) (6784 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetAfter("", 0) + 977278390, "똯䀕耺\uab1a").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.15
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Boolean.valueOf(C11853br.m29121());
            }
        });
        int i2 = f27822 + 13;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﭸ */
    private static MediationManager m29111() {
        int i = 2 % 2;
        int i2 = f27818 + 81;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        MediationManager companion = MediationManager.Companion.getInstance();
        int i4 = f27818 + 115;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return companion;
    }

    /* JADX INFO: renamed from: ﺙ */
    private static PlacementType m29120(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 83;
        f27822 = i2 % 128;
        if (i2 % 2 == 0) {
            return impressionData.getPlacementType();
        }
        impressionData.getPlacementType();
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ */
    private static String m29112(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 93;
        f27822 = i2 % 128;
        if (i2 % 2 != 0) {
            impressionData.getRenderingSdk();
            throw null;
        }
        String renderingSdk = impressionData.getRenderingSdk();
        int i3 = f27822 + 115;
        f27818 = i3 % 128;
        if (i3 % 2 != 0) {
            return renderingSdk;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ */
    private static String m29113(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        String renderingSdkVersion = impressionData.getRenderingSdkVersion();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = f27822 + 93;
        f27818 = i5 % 128;
        int i6 = i5 % 2;
        return renderingSdkVersion;
    }

    /* JADX INFO: renamed from: ﭖ */
    private static String m29109(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27822 + 45;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        String demandSource = impressionData.getDemandSource();
        int i4 = f27818 + 75;
        f27822 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return demandSource;
    }

    /* JADX INFO: renamed from: ﭴ */
    private static String m29110(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 7;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        String variantId = impressionData.getVariantId();
        int i4 = f27818 + 39;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return variantId;
    }

    /* JADX INFO: renamed from: ﮌ */
    private static double m29115(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 109;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        double netPayout = impressionData.getNetPayout();
        int i4 = f27822 + 33;
        f27818 = i4 % 128;
        if (i4 % 2 != 0) {
            return netPayout;
        }
        throw null;
    }

    /* JADX INFO: renamed from: סּ */
    private static String m29107(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 43;
        f27822 = i2 % 128;
        if (i2 % 2 != 0) {
            impressionData.getCreativeId();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String creativeId = impressionData.getCreativeId();
        int i3 = f27822 + 99;
        f27818 = i3 % 128;
        int i4 = i3 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: טּ */
    private static String m29106(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27818 + 27;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i4 = f27818 + 31;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return advertiserDomain;
    }

    /* JADX INFO: renamed from: ףּ */
    private static String m29108(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f27822 + 33;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        String campaignId = impressionData.getCampaignId();
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return campaignId;
    }

    /* JADX INFO: renamed from: ｋ */
    private static PlacementType m29135(Constants.AdType adType) {
        int i = 2 % 2;
        int i2 = f27822 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27818 = i2 % 128;
        if (i2 % 2 != 0) {
            return adType.getPlacementType();
        }
        adType.getPlacementType();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29126(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f27818 + 113;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        String str = adsConfig.appId;
        int i4 = f27822 + 65;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29141(FairBid.AdsConfig adsConfig) {
        int i = 2 % 2;
        int i2 = f27822 + 11;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        String str = adsConfig.store;
        int i4 = f27818 + 41;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static List<AdapterConfiguration> m29142(MediationConfig mediationConfig) {
        int i = 2 % 2;
        int i2 = f27818 + 47;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        int i4 = f27818 + 107;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
        return adapterConfigurations;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static Constants.AdType m29145(Placement placement) {
        int i = 2 % 2;
        int i2 = f27818 + 27;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        Constants.AdType adType = placement.getAdType();
        int i4 = f27822 + 49;
        f27818 = i4 % 128;
        int i5 = i4 % 2;
        return adType;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29132(Placement placement) {
        int i = 2 % 2;
        int i2 = f27822 + 67;
        f27818 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            placement.getName();
            super.hashCode();
            throw null;
        }
        String name = placement.getName();
        int i3 = f27822 + 91;
        f27818 = i3 % 128;
        if (i3 % 2 != 0) {
            return name;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static PlacementsHandler m29147(MediationManager mediationManager) {
        int i = 2 % 2;
        int i2 = f27818 + 19;
        f27822 = i2 % 128;
        if (i2 % 2 != 0) {
            mediationManager.getPlacementsHandler();
            throw null;
        }
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        int i3 = f27818 + 25;
        f27822 = i3 % 128;
        int i4 = i3 % 2;
        return placementsHandler;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x00cd  */
    /* JADX INFO: renamed from: ﻏ */
    private static Constants.AdType m29122(String str) {
        byte b;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1372958932:
                if (!str.equals(m29128("㤻푽쫍띟⨏砡︒쟊Ἕ笓ᨺ\ue0fe", (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", TextUtils.lastIndexOf("", '0', 0) + 1, "ᬔ䆣섻쀨").intern())) {
                    b = -1;
                } else {
                    int i2 = f27818 + 79;
                    f27822 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 2;
                }
                break;
            case 433141802:
                if (!str.equals(m29128("豛㈍ି\uda4e专祚ﲄ", (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", Color.rgb(0, 0, 0) - 1640316244, "갲㫂ҝ䪔").intern())) {
                    b = -1;
                } else {
                    int i4 = f27818 + 3;
                    f27822 = i4 % 128;
                    int i5 = i4 % 2;
                }
                break;
            case 543046670:
                if (!str.equals(m29128("\uf6e1坲웙輰퓐ꌺ\ue2de\ude93", (char) (ExpandableListView.getPackedPositionChild(0L) + 1), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMinimumFlingVelocity() >> 16, "婁뎀顁웆").intern())) {
                    b = -1;
                } else {
                    int i6 = f27822 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    f27818 = i6 % 128;
                    b = i6 % 2 != 0 ? (byte) 3 : (byte) 5;
                }
                break;
            case 1951953708:
                if (!str.equals(m29128("ภじ㾁\ueceb藥⚲", (char) (48764 - KeyEvent.keyCodeFromString("")), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString(""), "ʃ뽣粡馾").intern())) {
                    b = -1;
                } else {
                    int i7 = f27818 + 107;
                    f27822 = i7 % 128;
                    b = i7 % 2 == 0 ? (byte) 1 : (byte) 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (b == 1) {
            return Constants.AdType.BANNER;
        }
        if (b != 2) {
            if (b != 3) {
                return null;
            }
            return Constants.AdType.REWARDED;
        }
        Constants.AdType adType = Constants.AdType.INTERSTITIAL;
        int i8 = f27822 + 101;
        f27818 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 37 / 0;
        }
        return adType;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m29149(InterstitialListener interstitialListener) {
        int i = 2 % 2;
        int i2 = f27818 + 61;
        f27822 = i2 % 128;
        int i3 = i2 % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        int i4 = f27818 + 79;
        f27822 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m29134(RewardedListener rewardedListener) {
        int i = 2 % 2;
        int i2 = f27822 + 21;
        f27818 = i2 % 128;
        int i3 = i2 % 2;
        Rewarded.setRewardedListener(rewardedListener);
        int i4 = f27818 + 101;
        f27822 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ */
    private static boolean m29114() {
        int i = 2 % 2;
        int i2 = f27822 + 37;
        f27818 = i2 % 128;
        if (i2 % 2 != 0) {
            return FairBid.assertStarted();
        }
        FairBid.assertStarted();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29129(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27821, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27821));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29128(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f27823) ^ ((long) f27820)) ^ ((long) f27819));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
