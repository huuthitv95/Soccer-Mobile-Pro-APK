package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.qq.e.ads.ADActivity;
import com.qq.e.ads.DialogActivity;
import com.qq.e.ads.LandscapeADActivity;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.PortraitADActivity;
import com.qq.e.ads.RewardvideoLandscapeADActivity;
import com.qq.e.ads.RewardvideoPortraitADActivity;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.pi.ACTD;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11869cg extends AbstractC11840be {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28136 = 1;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28137 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static boolean f28138 = true;

    /* JADX INFO: renamed from: ﻛ */
    private static long f28139 = -3082129335156641562L;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f28140 = {393, 405, 403, 340, 407, 395, 391, 394, 409, 362, 399, 402, 397, 359, 410, 412, 415, 370, 404, 406, 379, 396, 367, 408, 376, 413, 380, 360, 374, 377, 411, 363, 414, 378};

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f28141 = true;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28142 = 294;

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ IGDTAdManager m29547() {
        int i = 2 % 2;
        int i2 = f28136 + 65;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        IGDTAdManager iGDTAdManagerM29546 = m29546();
        int i4 = f28137 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28136 = i4 % 128;
        int i5 = i4 % 2;
        return iGDTAdManagerM29546;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ Map m29550(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = 2 % 2;
        int i2 = f28136 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        Map mapM29555 = m29555(unifiedInterstitialAD);
        int i4 = f28137 + 83;
        f28136 = i4 % 128;
        if (i4 % 2 != 0) {
            return mapM29555;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Map m29554(LiteAbstractAD liteAbstractAD) {
        int i = 2 % 2;
        int i2 = f28136 + 83;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapM29553 = m29553(liteAbstractAD);
        int i4 = f28137 + 27;
        f28136 = i4 % 128;
        int i5 = i4 % 2;
        return mapM29553;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Map m29556(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f28136 + 81;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM29551 = m29551(rewardVideoAD);
        int i4 = f28137 + 51;
        f28136 = i4 % 128;
        int i5 = i4 % 2;
        return mapM29551;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ int m29558(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f28137 + 63;
        f28136 = i2 % 128;
        int i3 = i2 % 2;
        int iM29557 = m29557(rewardVideoAD);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = f28136 + 105;
        f28137 = i5 % 128;
        int i6 = i5 % 2;
        return iM29557;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29559(APPStatus aPPStatus) {
        int i = 2 % 2;
        int i2 = f28136 + 3;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        String strM29548 = m29548(aPPStatus);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = f28137 + 111;
        f28136 = i5 % 128;
        if (i5 % 2 != 0) {
            return strM29548;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public C11869cg(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f28137 + 73;
        f28136 = i2 % 128;
        int i3 = i2 % 2;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        int i4 = f28137 + 65;
        f28136 = i4 % 128;
        int i5 = i4 % 2;
        return integrationSDKVersion;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b = 2;
        int i = 2 % 2;
        int i2 = f28136 + 17;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -1950656211:
                if (!str.equals(m29552("ꑆꐊ뇪셭\uec78ේ炷枭≡\uf570䥽㑛⌓㤺蓀﯂\ueeed窷삅뽭\uaa4f빟ᰭ", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i4 = f28136 + 5;
                    f28137 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 5;
                }
                break;
            case -1537668511:
                b = !str.equals(m29549(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u008a\u008e\u008c\u0087\u008b\u008f\u008b\u008f\u0089\u0098\u0086\u008f\u0093\u0097\u0088\u0086\u008b\u0096\u008b\u0093\u0095").intern()) ? (byte) -1 : Ascii.f22490CR;
                break;
            case -1192770783:
                b = !str.equals(m29552("\ue12a\ue178㰣䲠鴊粱⪱⋀硢確㠘湁晾듓\uf599ꇌꮃ\uf760뇺\ue56b\uef29㎇浖ᤕんฺ⺏岫瓎䪿\uea20遉롶蛗", ((byte) KeyEvent.getModifierMetaStateMask()) + 1).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1125491209:
                b = !str.equals(m29552("ᇛᆚ쿞뽼ꖺ䐺䀲툰ዩ譶»Ӎ階䜘", ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : Ascii.f22491EM;
                break;
            case -1040623465:
                b = !str.equals(m29552("ࡿ࠻商◉瞏阢龜쮈쵂ᇐ튪\udb6b輻\uddb6ἅᓉ䋃鸞", ViewConfiguration.getDoubleTapTimeout() >> 16).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -839956733:
                b = !str.equals(m29552("Ⴤ႑ꌫ펣難睆⚿팵瑫\ue7b8㏣扣鞕⯛ﹱ귬婾桛먞\ue974ồ", (-1) - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : Ascii.DC2;
                break;
            case -570955421:
                b = !str.equals(m29549(null, 127 - Gravity.getAbsoluteGravity(0, 0), null, "\u0098\u0086\u0093\u0086\u008f\u0089\u008b\u0092\u008a\u008e\u0082\u0086\u0088\u008b\u009b\u0088\u0098\u0087\u009a\u0086\u0099").intern()) ? (byte) -1 : (byte) 16;
                break;
            case -427681737:
                b = !str.equals(m29552("沿泾枸\u171a\uf41eᖗᦱ꽂䭵⌊儎", TextUtils.indexOf("", "", 0)).intern()) ? (byte) -1 : Ascii.DC4;
                break;
            case -358530385:
                b = !str.equals(m29552("ℚ⅖⿵彼\uf8b8ᤕ캿\ue2c3鱩武嶌詂Ꙙ꜋逩䗸", ExpandableListView.getPackedPositionChild(0L) + 1).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -311779863:
                b = !str.equals(m29552("빕븶ꫯ\uda66韍癬䈆綼ႚ\uee69㊇ڵ㥋∑ｕ줋\uf4b3憚물趗끔ꕒ枅燾濄飜⑬㑟⮉\udc71\ue0ff\uf8bc\ue70eဋ굘묰ꋰ垁椅義幮謬喀⏦᷌컄ለ", Color.rgb(0, 0, 0) + 16777216).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -301299368:
                b = !str.equals(m29549(null, 127 - KeyEvent.normalizeMetaState(0), null, "\u0098\u0086\u008f\u0094\u0087\u0088\u008e\u0098\u0086\u0093\u0086\u008f\u0089\u008b\u0092\u008a\u008e").intern()) ? (byte) -1 : Ascii.SYN;
                break;
            case -287046183:
                b = !str.equals(m29552("彝式阐\ue693毩詒蓿鲷혬튉컻쀏\ud809Ỡͺྞᗺ嵏䜉䬤兜馼鮱띿軡ꐌ\ud84e\uf2f2쪤\ue093᳜㸚،", KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : Ascii.f22503VT;
                break;
            case -207731435:
                b = str.equals(m29552("䴋䵨䳾㱷퐚㖻ឿ転䔣ࡸ煐匌쨕쐀벂鲲߭螉\uf8e1\ud82b䌟䍃\u2457\u2458鲇绨枚懈\ud8f8㩵ꌯ괗ᑊ\uf60d\uee97", TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) 8 : (byte) -1;
                break;
            case 2003474:
                b = !str.equals(m29552("蘧虦\ue2cd鉨㔷풯뤝\uebeb", ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : Ascii.ETB;
                break;
            case 167349330:
                b = !str.equals(m29552("墡壠椠ᦂ늛化ꠃ魍㮝ⶕញ\uecf1\udfe5\ue1ed", View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 555831221:
                if (!str.equals(m29549(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0098\u0086\u0093\u0086\u008f\u0089\u008b\u0092\u008a\u008e\u0098\u0086\u0093\u0093\u0087\u009c\u0088\u0086\u008b\u0096\u008b\u0093\u0095").intern())) {
                    b = -1;
                } else {
                    int i6 = f28136 + 41;
                    f28137 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 19;
                }
                break;
            case 796884557:
                b = !str.equals(m29552("ײַﭏG烎譎櫰蒡㣵홧䓑⹃쁙籮袜\ue3f3\u0fe6놣쬉Ɡ䭴\uf50b\u0ff1", (-1) - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 814717722:
                if (!str.equals(m29552("ᣇᢤ䵆㷏\ue020Ɓ晛\udb2e㓇ী䕪⋨鿙언袸\ued56刡蘠쳰ꧼᛄ䋽ၥ喣쥖罥厝", KeyEvent.normalizeMetaState(0)).intern())) {
                    b = -1;
                }
                break;
            case 937653587:
                b = !str.equals(m29549(null, 127 - View.MeasureSpec.getSize(0), null, "\u0089\u009f\u008f\u0087\u008f\u009e\u009d\u009d\u008e").intern()) ? (byte) -1 : Ascii.NAK;
                break;
            case 1265986405:
                b = str.equals(m29549(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u0091\u008f\u008b\u0090\u008b\u008f\u0081\u008e\u008a\u008e\u0086\u0094\u0087\u0081\u0089\u0088\u0093\u0087\u0092\u0084\u0089\u0088\u0087\u0084\u0086\u0084\u0085\u0085\u0084\u0083\u0082\u0081").intern()) ? (byte) 6 : (byte) -1;
                break;
            case 1305853839:
                if (!str.equals(m29552("畎甜ⁱ僲놫倐ࠀ뚤嫓擨ᒙ䳰\uf21aꢁ\ud938荰㿂", KeyEvent.keyCodeFromString("")).intern())) {
                    b = -1;
                } else {
                    int i8 = f28136 + 55;
                    f28137 = i8 % 128;
                    b = i8 % 2 == 0 ? Ascii.f22499SI : (byte) 59;
                }
                break;
            case 1336889139:
                b = !str.equals(m29552("혓홟ؗ皘澴踌㥔ᗊ殃䊄쪣綽兑軯ܫ눕鲚쵲", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1).intern()) ? (byte) -1 : Ascii.CAN;
                break;
            case 1773421109:
                b = str.equals(m29549(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0098\u0086\u0093\u0086\u008f\u0089\u008b\u0092\u008a\u008e\u008c\u0087\u008b\u008f\u008b\u008f\u0089\u0098\u0086\u008f\u0093\u0097\u0088\u0086\u008b\u0096\u008b\u0093\u0095").intern()) ? Ascii.f22500SO : (byte) -1;
                break;
            case 1874129984:
                if (str.equals(m29552("녜넛럂읠뇮偶᠑犠䫢\uf34dᓮ峃", (-1) - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    int i9 = f28137 + 9;
                    f28136 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 4 % 3;
                    }
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 1958130193:
                b = !str.equals(m29552("岱峒妳⤺\uebc5\u0a64⇸齘獤ᴵ亏敋\udbaf텍荝ꫵᙗ鋆윴\uee69劰嘎ᮍሀ贠殀塤垡쥱⼣鳫魒\u05eb\ue355텘\ud8ca䀰ꓘᔈᱵ벝硭⦗䀇Ｕ㶕", ViewConfiguration.getScrollDefaultDelay() >> 16).intern()) ? (byte) -1 : Ascii.f22492FF;
                break;
            case 2111488863:
                b = !str.equals(m29549(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0091\u008f\u008b\u0090\u008b\u008f\u0081\u008e\u008d\u0082\u008c\u0087\u008b\u008a\u0084\u0089\u0088\u0087\u0084\u0086\u0084\u0085\u0085\u0084\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return GDTAdSdk.class;
            case 1:
            case 2:
                return ADActivity.class;
            case 3:
            case 4:
                return DialogActivity.class;
            case 5:
            case 6:
                return LandscapeADActivity.class;
            case 7:
            case 8:
                return PortraitADActivity.class;
            case 9:
            case 10:
                return RewardvideoLandscapeADActivity.class;
            case 11:
            case 12:
                return RewardvideoPortraitADActivity.class;
            case 13:
                return UnifiedInterstitialAD.class;
            case 14:
                return UnifiedInterstitialADListener.class;
            case 15:
                return RewardVideoAD.class;
            case 16:
                return RewardVideoADListener.class;
            case 17:
                return LoadAdParams.class;
            case 18:
                return UnifiedBannerView.class;
            case 19:
                return UnifiedBannerADListener.class;
            case 20:
                return ADEvent.class;
            case 21:
                return APPStatus.class;
            case 22:
                return RewardVideoAD.ADListenerAdapter.class;
            case 23:
                return ACTD.class;
            case 24:
                return LiteAbstractAD.class;
            case 25:
                return ADListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29552("\ue312\ue375㕤䗧濖蹮\uea38\u20ce룍燍쫳껣摯붐݄慈ꦿ︻", ViewConfiguration.getEdgeSlop() >> 16).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11869cg.m29547();
            }
        });
        map.put(m29549(null, ImageFormat.getBitsPerPixel(0) + 128, null, "\u0088\u0097\u0094\u0094\u008e\u008f\u0086\u008d").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11869cg.m29559((APPStatus) list.get(0));
            }
        });
        map.put(m29549(null, Process.getGidForName("") + 128, null, "\u0082\u0096\u0093\u0097\u0087\u0098\u008f¡ \u008f\u0086\u008d").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11869cg.m29554((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m29549(null, Color.argb(0, 0, 0, 0) + 127, null, "\u0086\u0094\u0091¢\u0088\u008e\u0088\u0098\u0087\u009a\u0086\u0099\u008f\u0086\u008d").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return Integer.valueOf(C11869cg.m29558((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m29549(null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, "\u0089\u008f¡ \u0088\u0086\u0088\u0098\u0087\u009a\u0086\u0099\u008f\u0086\u008d").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11869cg.m29556((RewardVideoAD) list.get(0));
            }
        });
        map.put(m29549(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u008f¡ \u008c\u0087\u008b\u008f\u008b\u008f\u0089\u0098\u0086\u008f\u0093\u0097\u008f\u0086\u008d").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11869cg.m29550((UnifiedInterstitialAD) list.get(0));
            }
        });
        int i2 = f28137 + 3;
        f28136 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﮐ */
    private static IGDTAdManager m29546() {
        int i = 2 % 2;
        int i2 = f28136 + 23;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        IGDTAdManager gDTAdManger = GDTAdSdk.getGDTAdManger();
        int i4 = f28136 + 17;
        f28137 = i4 % 128;
        if (i4 % 2 == 0) {
            return gDTAdManger;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29548(APPStatus aPPStatus) {
        int i = 2 % 2;
        int i2 = f28137 + 89;
        f28136 = i2 % 128;
        if (i2 % 2 != 0) {
            return aPPStatus.getAPPID();
        }
        aPPStatus.getAPPID();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static Map<String, Object> m29553(LiteAbstractAD liteAbstractAD) {
        int i = 2 % 2;
        int i2 = f28137 + 67;
        f28136 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        int i4 = f28136 + 85;
        f28137 = i4 % 128;
        int i5 = i4 % 2;
        return extraInfo;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static int m29557(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f28136 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        int i4 = f28137 + 103;
        f28136 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return rewardAdType;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static Map<String, String> m29551(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f28137 + 21;
        f28136 = i2 % 128;
        if (i2 % 2 != 0) {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static Map m29555(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = 2 % 2;
        int i2 = f28136 + 85;
        f28137 = i2 % 128;
        int i3 = i2 % 2;
        Map ext = unifiedInterstitialAD.getExt();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return ext;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29552(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28139, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28139));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29549(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f28140;
            int i2 = f28142;
            if (f28138) {
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
            if (f28141) {
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
