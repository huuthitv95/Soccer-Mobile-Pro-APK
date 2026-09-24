package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterfaceC4297Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bo */
/* JADX INFO: loaded from: classes6.dex */
public final class C11850bo extends AbstractC11840be {

    /* JADX INFO: renamed from: ﱟ */
    private static int f27755 = 1;

    /* JADX INFO: renamed from: ﻏ */
    private static int f27758 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static boolean f27759 = true;

    /* JADX INFO: renamed from: ﻛ */
    private static boolean f27760 = true;

    /* JADX INFO: renamed from: ﾒ */
    private static int f27763 = 79;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f27761 = {144, 179, 148, 193, 190, 155, 184, 194, 195, 180, Typography.half, 178, 188, AbstractJsonLexerKt.END_OBJ, 181, Typography.degree, Typography.plusMinus, 186, 165, 198, 159, 187, Typography.pound, 200, 191, 147, 146, 152, 161, 196, 157, 197, 145, Typography.paragraph, 149, 156, 154, 173, 171, 170, 172, 'z', 'y'};

    /* JADX INFO: renamed from: ﾇ */
    private static long f27762 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f27756 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static char f27757 = 4972;

    /* JADX INFO: renamed from: ﭸ */
    static /* synthetic */ DynamicLoader m29032() {
        int i = 2 % 2;
        int i2 = f27755 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27758 = i2 % 128;
        if (i2 % 2 == 0) {
            return m29033();
        }
        m29033();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ String m29035() {
        int i = 2 % 2;
        int i2 = f27758 + 25;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        String strM29034 = m29034();
        int i4 = f27758 + 69;
        f27755 = i4 % 128;
        int i5 = i4 % 2;
        return strM29034;
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ String m29036() {
        int i = 2 % 2;
        int i2 = f27758 + 55;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        String strM29031 = m29031();
        int i4 = f27755 + 19;
        f27758 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return strM29031;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ WeakHashMap m29040(C11850bo c11850bo, WeakHashMap weakHashMap, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        int i2 = f27755 + 87;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        WeakHashMap<View, WeakReference<Object>> weakHashMapM29046 = c11850bo.m29046((WeakHashMap<View, WeakReference<Object>>) weakHashMap, interfaceC11874cl);
        int i4 = f27758 + 75;
        f27755 = i4 % 128;
        if (i4 % 2 != 0) {
            return weakHashMapM29046;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m29042(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = 2 % 2;
        int i2 = f27755 + 59;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        m29050(interstitialAd, interstitialAdListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ AdPlacementType m29044(AdAdapter adAdapter) {
        int i = 2 % 2;
        int i2 = f27755 + 3;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        AdPlacementType adPlacementTypeM29043 = m29043(adAdapter);
        int i4 = f27758 + 75;
        f27755 = i4 % 128;
        if (i4 % 2 != 0) {
            return adPlacementTypeM29043;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m29045(AdView adView) {
        int i = 2 % 2;
        int i2 = f27755 + 93;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        String strM29038 = m29038(adView);
        int i4 = f27758 + 13;
        f27755 = i4 % 128;
        int i5 = i4 % 2;
        return strM29038;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29047(InterfaceC4297Ad interfaceC4297Ad) {
        int i = 2 % 2;
        int i2 = f27755 + 17;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        String strM29037 = m29037(interfaceC4297Ad);
        int i4 = f27755 + 71;
        f27758 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return strM29037;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m29049(AdView adView, AdListener adListener) {
        int i = 2 % 2;
        int i2 = f27758 + 89;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        m29041(adView, adListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f27755 + 61;
        f27758 = i4 % 128;
        int i5 = i4 % 2;
    }

    public C11850bo(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:88:0x033c  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        byte b = 3;
        switch (str.hashCode()) {
            case -2107186802:
                if (!str.equals(m29039("荳\u0603\udfa0\ue47dⶂꅙ⎲壌Ꮢ⭽ꆏ謁⦝橿\ue5e5ᙢ", (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 47521), "\u0000\u0000\u0000\u0000", Color.blue(0), "諂뻇ꇠ\uf1b9").intern())) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -1585374524:
                if (!str.equals(m29048((String) null, Color.rgb(0, 0, 0) + 16777343, (int[]) null, "\u0084\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0081\u0085\u008a\u0082\u0087\u0093\u0082\u008a\u0082\u0084\u0090\u0094\u008a\u009d").intern())) {
                    b = -1;
                } else {
                    int i2 = f27758 + 1;
                    f27755 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 10;
                }
                break;
            case -1513928064:
                if (!str.equals(m29039("筹ꄽ◎㩅ꀷ࠘烙\ue1e7䓨虻ݒ曒脵괹ዑ⬚惢纄\u1aea뙭璱\ude33ꢕ\ue49b낺绍鐮╳\uaad5벖∹䔇뒔䢠ꖏ㤡\ue39c陣ᓐ쨅", (char) (24659 - Process.getGidForName("")), "\u0000\u0000\u0000\u0000", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), "廝렠哛饠").intern())) {
                    b = -1;
                } else {
                    int i4 = f27758 + 69;
                    f27755 = i4 % 128;
                    int i5 = i4 % 2;
                    b = Ascii.f22490CR;
                }
                break;
            case -1256969519:
                if (!str.equals(m29048((String) null, 127 - Color.blue(0), (int[]) null, "\u0094\u008a\u0087\u0093\u0088\u0088\u008a\u0084¢\u0085\u0084\u0095\u0084\u0090\u0096\u009e\u008c\u0084\u0087\u009b").intern())) {
                    b = -1;
                } else {
                    int i6 = f27755 + 113;
                    f27758 = i6 % 128;
                    b = i6 % 2 == 0 ? Ascii.DC4 : (byte) 71;
                }
                break;
            case -501313640:
                if (!str.equals(m29039("\ue4c4晭엿望擼窴\udb42ꓲ夥Ꮠ몍ẑꈗ캆䲊詎㫄䲶形Ҋ", (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), "\u0000\u0000\u0000\u0000", AndroidCharacter.getMirror('0') - '0', "\ueb79줞嶵눝").intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22500SO;
                }
                break;
            case -498709917:
                if (str.equals(m29048((String) null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (int[]) null, "\u0084\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0081\u0096\u0090\u0087\u0089\u0087\u0089\u0088\u0084\u008a\u0089\u008b\u009c").intern())) {
                    int i7 = f27758 + 107;
                    f27755 = i7 % 128;
                    b = i7 % 2 != 0 ? (byte) 8 : (byte) 123;
                } else {
                    b = -1;
                }
                break;
            case -105717264:
                if (!str.equals(m29039("Fꮖᄐ桄쓢㞟ᙿ⺩륨亇뒞·ᤌ﹋书", (char) (42518 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", (-964807479) - View.getDefaultSize(0, 0), "질縴ᗆ㾦").intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22503VT;
                }
                break;
            case 2115:
                if (!str.equals(m29048((String) null, 127 - ExpandableListView.getPackedPositionType(0L), (int[]) null, "\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 289409084:
                if (!str.equals(m29048((String) null, 127 - Color.blue(0), (int[]) null, "\u008a\u0099\u0098\u0097\u0089\u008b\u008a\u008d\u008a\u008c\u0090\u0096\u0095\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 320151695:
                if (!str.equals(m29039("奕轰籼\ua82fڻ蠢അ鬵쨝ꬩ\ueb10警둺\ue184", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 61610), "\u0000\u0000\u0000\u0000", AndroidCharacter.getMirror('0') - '0', "ꛁ㿓ꯟ\ue7f0").intern())) {
                    b = -1;
                } else {
                    int i8 = f27758 + 63;
                    f27755 = i8 % 128;
                    b = i8 % 2 != 0 ? (byte) 9 : (byte) 37;
                }
                break;
            case 435867927:
                if (!str.equals(m29039("\ud8f6\uf6bfꚓ돖ﻠ哘쬧䢮產㒛\ufae8㫅ᗎ殳\uecac끖Ⲷ\u0a7f㔍㴲盠", (char) (ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", 353751567 - TextUtils.indexOf("", ""), "ྤᗒ됕㯎").intern())) {
                    b = -1;
                } else {
                    int i9 = f27758 + 87;
                    f27755 = i9 % 128;
                    int i10 = i9 % 2;
                    b = Ascii.SYN;
                }
                break;
            case 488344453:
                if (!str.equals(m29048((String) null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), (int[]) null, "\u0084\u0085\u0084\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 535330969:
                if (!str.equals(m29048((String) null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, (int[]) null, "\u0098\u0089\u0087 \u0087\u0089\u008c\u0081\u0092\u0084\u0085\u0094\u0089\u008a\u009f\u008a\u008c\u008b\u008a\u0087\u0082\u009e\u0081").intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22492FF;
                }
                break;
            case 553704929:
                if (!str.equals(m29048((String) null, 127 - Color.blue(0), (int[]) null, "\u0084\u008a\u0096\u0096\u0085\u0084\u0089\u008b\u0085\u009b\u0082\u0081\u0098\u0090\u0096\u0099\u0088\u0087\u009a").intern())) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1165508119:
                if (!str.equals(m29048((String) null, 126 - ExpandableListView.getPackedPositionChild(0L), (int[]) null, "\u0084\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0081").intern())) {
                    b = -1;
                }
                break;
            case 1237162638:
                if (!str.equals(m29039("웭鷠ཱྀ塴\uf14a爲㱍塌쩚\udaa9㆘駼믆⤁ᔋﻤḴ넩輝\ue44f觯", (char) Drawable.resolveOpacity(0, 0), "\u0000\u0000\u0000\u0000", Process.getGidForName("") - 364330545, "칶䣁ﻪ䁵").intern())) {
                    b = -1;
                } else {
                    int i11 = f27755 + 47;
                    f27758 = i11 % 128;
                    int i12 = i11 % 2;
                    b = Ascii.NAK;
                }
                break;
            case 1476063628:
                if (!str.equals(m29039("養䰻苋᧐佊᷸י\ue200㝏", (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", (-1568461475) - View.resolveSizeAndState(0, 0, 0), "巍茭覢礯").intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1838933446:
                if (!str.equals(m29039("儃\u009b\uf468킵鐪玦‷岤㳋\uf11c威伅緡\uebc8", (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12193), "\u0000\u0000\u0000\u0000", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "籞ᩈꆪ儯").intern())) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 1908493505:
                if (!str.equals(m29048((String) null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (int[]) null, "\u0094\u008a\u0087\u0093\u0082\u0081\u008e\u0088\u0082\u0090\u008e\u0092\u0085\u0085\u0091\u008a\u008c\u0090\u008f\u008e\u008d\u0085\u008c").intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1955913096:
                if (!str.equals(m29039("浟鸁笳존盹뉕", (char) (34135 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", View.MeasureSpec.getMode(0), "튥鵧嚴礪").intern())) {
                    b = -1;
                } else {
                    int i13 = f27755 + 85;
                    f27758 = i13 % 128;
                    if (i13 % 2 == 0) {
                        b = 4;
                    }
                }
                break;
            case 2035065003:
                if (!str.equals(m29048((String) null, Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u008a\u0088\u0090¡\u0082\u0081\u008a \u0087\u0089\u0090\u009f").intern())) {
                    b = -1;
                } else {
                    b = Ascii.f22499SI;
                }
                break;
            case 2035668095:
                if (!str.equals(m29039("괚耂䩼鏤㔖ԙ컽쉏\uef00㰞©멎", (char) KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000", ViewConfiguration.getKeyRepeatDelay() >> 16, "昭釭⬯锸").intern())) {
                    b = -1;
                } else {
                    b = Ascii.DC2;
                }
                break;
            case 2110329530:
                if (!str.equals(m29048((String) null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (int[]) null, "\u0082\u0081\u008a \u0087\u0089\u0090\u009f").intern())) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return InterfaceC4297Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case 8:
                return InterstitialAdListener.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                return RewardedVideoAdListener.class;
            case 11:
                return RewardedVideoAd.class;
            case 12:
            case 13:
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                int i14 = f27755 + 105;
                f27758 = i14 % 128;
                int i15 = i14 % 2;
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return d.class;
            case 22:
                return C11819ak.m28443();
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29048((String) null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), (int[]) null, "\u0094\u008a\u0087\u0093\u0082\u0081\u008d\u0085\u0084£\u0082\u009c\u0089\u008b\u008a\u008d\u008a\u008c\u0090\u0096\u0095\u0089\u008a¢").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11850bo.m29045((AdView) list.get(0));
            }
        });
        map.put(m29048((String) null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, (int[]) null, "\u0082\u0081\u008d\u0085\u0084£\u0082\u009c\u0089\u008b\u008a\u008d\u008a\u008c\u0090\u0096\u0095\u0089\u008a¢").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11850bo.m29047((InterfaceC4297Ad) list.get(0));
            }
        });
        map.put(m29039("횃甥蝘᳒呛ꬊ蠵\uec77碡㊼\uea21\uea16槢", (char) (TextUtils.lastIndexOf("", '0', 0) + 42514), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 628369752, "꧍诖ᇚ\ue0a6").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11850bo.m29049((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m29039("\uea4c漤ะꟂ霪쨹튡\ued9e젲쎫ꄃ\ued9b㐵ፅ됨퇃︱Ⱎ䓅\ue5bb뻀旸碘鵸\uea3f鸇㴚魴ጄ舱睂螖ⅿ腒Ƞ\ue0f3湺", (char) TextUtils.getCapsMode("", 0, 0), "\u0000\u0000\u0000\u0000", 64030117 - TextUtils.getCapsMode("", 0, 0), "ꖾ턅ฃ췪").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11850bo.m29035();
            }
        });
        map.put(m29048((String) null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (int[]) null, "\u0098\u008a¥\u0099\u009e\u0092\u0084\u0090¤\u0082\u0084\u0090\u009b\u0082\u008b\u0083\u0098\u0089\u0087 \u0087\u0089\u008c\u0081\u0092\u0084\u0085\u0094\u0089\u008a\u009f\u008a\u008c\u008b\u008a\u0087\u0082\u009e\u0081\u0089\u008a¢").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11850bo.m29036();
            }
        });
        map.put(m29048((String) null, View.resolveSize(0, 0) + 127, (int[]) null, "\u0084\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0081\u0096\u0090\u0089\u0087\u0089\u0088\u0084\u008a\u0089\u008b\u009c\u0089\u008a\u0088").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11850bo.m29042((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m29039("陱㬇鰋眩ꊠ\u0b59⺷秊\uef4a稺\uf6f3왚乱鹵悮䰯", (char) (11232 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", ViewConfiguration.getEdgeSlop() >> 16, "ጦ暍\ue13c狼").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11850bo.m29032();
            }
        });
        map.put(m29039("輴뀢\udb17頝\uea2c\u0df9略⚦婀뛚㴑\ud9f7饘\ua8c9虷䙜", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46861), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "嗀茏ీ\uf5b7").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11850bo.m29044((AdAdapter) list.get(0));
            }
        });
        map.put(m29039("฿\ue9fcЉ銌ꀊ輄\ue18d硰蜧\uf83a頾䤒⥐狻髇\u1316⾧愶㠔龣篮審ᐧ셤㴳\uddf6斷", (char) (TextUtils.indexOf("", "", 0) + 29548), "\u0000\u0000\u0000\u0000", 390904712 - Color.red(0), "蠜䲻気ꉳ").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                return C11850bo.m29040(C11850bo.this, (WeakHashMap) list.get(0), interfaceC11874cl);
            }
        });
        int i2 = f27755 + 73;
        f27758 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27755 + 61;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                try {
                    String str = (String) C12019hv.m30362().m30364().m30308(AdSdkVersion.class, String.class).get(null);
                    int i4 = f27758 + 85;
                    f27755 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 95 / 0;
                    }
                    return str;
                } catch (Throwable unused) {
                    return (String) C12019hv.m30362().m30364().m30308(AdSdkVersion.class, String.class).get(null);
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            return C12019hv.m30362().m30363().m30451(BuildConfig.class, m29048((String) null, Color.blue(0) + 127, (int[]) null, "«\u008eª©\u008e\u0082§¨\u0082§¦").intern());
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29038(AdView adView) {
        int i = 2 % 2;
        int i2 = f27755 + 91;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adView.getPlacementId();
        int i4 = f27755 + 17;
        f27758 = i4 % 128;
        int i5 = i4 % 2;
        return placementId;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m29037(InterfaceC4297Ad interfaceC4297Ad) {
        int i = 2 % 2;
        int i2 = f27758 + 43;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = interfaceC4297Ad.getPlacementId();
        int i4 = f27755 + 21;
        f27758 = i4 % 128;
        int i5 = i4 % 2;
        return placementId;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m29041(AdView adView, AdListener adListener) {
        int i = 2 % 2;
        int i2 = f27755 + 109;
        f27758 = i2 % 128;
        int i3 = i2 % 2;
        adView.setAdListener(adListener);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮌ */
    private static String m29034() {
        int i = 2 % 2;
        int i2 = f27755 + 59;
        f27758 = i2 % 128;
        return m29048((String) null, i2 % 2 != 0 ? 120 >> TextUtils.getCapsMode("", 0, 0) : 127 - TextUtils.getCapsMode("", 0, 0), (int[]) null, "\u008a\u0099\u0098\u0097\u0094\u008a\u0087 ").intern();
    }

    /* JADX INFO: renamed from: ﭴ */
    private static String m29031() {
        int i = 2 % 2;
        int i2 = f27758 + 115;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m29048((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u0099\u009e\u0092\u0084\u0090¤\u0082\u0084\u0090\u009b\u0082\u008b\u0083\u0085\u008a\u0082\u0087\u0093\u0082\u008a\u0082\u0084\u0090\u0094\u008a\u009d\u0092\u0085\u0085\u0091\u008a\u008c\u0090\u008f").intern();
        int i4 = f27755 + 13;
        f27758 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m29050(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = 2 % 2;
        int i2 = f27758 + 69;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdListener(interstitialAdListener);
        int i4 = f27758 + 9;
        f27755 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ */
    private static DynamicLoader m29033() {
        int i = 2 % 2;
        int i2 = f27758 + 111;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        int i4 = f27758 + 57;
        f27755 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }

    /* JADX INFO: renamed from: ｋ */
    private static AdPlacementType m29043(AdAdapter adAdapter) {
        int i = 2 % 2;
        int i2 = f27758 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f27755 = i2 % 128;
        int i3 = i2 % 2;
        AdPlacementType placementType = adAdapter.getPlacementType();
        int i4 = f27755 + 33;
        f27758 = i4 % 128;
        if (i4 % 2 == 0) {
            return placementType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private WeakHashMap<View, WeakReference<Object>> m29046(WeakHashMap<View, WeakReference<Object>> weakHashMap, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        d dVar = new d(weakHashMap, interfaceC11874cl);
        int i2 = f27755 + 19;
        f27758 = i2 % 128;
        if (i2 % 2 == 0) {
            return dVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bo$d */
    class d extends WeakHashMap<View, WeakReference<Object>> implements InterfaceC12003hf<WeakHashMap<View, WeakReference<Object>>> {

        /* JADX INFO: renamed from: ﮐ */
        private static int f27773 = 0;

        /* JADX INFO: renamed from: ﱡ */
        private static boolean f27774 = true;

        /* JADX INFO: renamed from: ﺙ */
        private static int f27775 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private static int f27776 = 169;

        /* JADX INFO: renamed from: ｋ */
        private static boolean f27777 = true;

        /* JADX INFO: renamed from: ﾒ */
        private static char[] f27778 = {247, 266, 285, 274, 287, 270, 234, 269, 256, 276, 241, 284, 273, 246, 281, Typography.times, 286};

        /* JADX INFO: renamed from: ﾇ */
        private InterfaceC11874cl f27780;

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = f27773 + 87;
            f27775 = i2 % 128;
            int i3 = i2 % 2;
            WeakReference<Object> weakReferenceM29052 = m29052((View) obj, (WeakReference) obj2);
            int i4 = f27773 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f27775 = i4 % 128;
            if (i4 % 2 != 0) {
                return weakReferenceM29052;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12003hf
        /* JADX INFO: renamed from: ﻐ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo28813() {
            int i = 2 % 2;
            int i2 = f27773 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f27775 = i2 % 128;
            int i3 = i2 % 2;
            WeakHashMap<View, WeakReference<Object>> weakHashMapM29051 = m29051();
            int i4 = f27773 + 35;
            f27775 = i4 % 128;
            if (i4 % 2 != 0) {
                return weakHashMapM29051;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public d(WeakHashMap<View, WeakReference<Object>> weakHashMap, InterfaceC11874cl interfaceC11874cl) {
            super(weakHashMap);
            this.f27780 = interfaceC11874cl;
        }

        /* JADX INFO: renamed from: ｋ */
        private WeakReference<Object> m29052(View view, WeakReference<Object> weakReference) {
            int i = 2 % 2;
            int i2 = f27775 + 13;
            f27773 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            C11850bo.this.m28837(this, this.f27780, m29053(null, 127 - View.MeasureSpec.getMode(0), null, "\u0083\u0091\u008f\u0090\u008f\u0082\u008e\u008d\u008c\u0082\u008b\u008a\u0082\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i4 = f27773 + 35;
            f27775 = i4 % 128;
            if (i4 % 2 != 0) {
                return weakReference2;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ */
        private WeakHashMap<View, WeakReference<Object>> m29051() {
            int i = 2 % 2;
            int i2 = f27775;
            int i3 = i2 + 59;
            f27773 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            f27773 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m29053(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f27778;
                int i2 = f27776;
                if (f27774) {
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
                if (f27777) {
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

    /* JADX INFO: renamed from: ﾒ */
    private static String m29048(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f27761;
            int i2 = f27763;
            if (f27759) {
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
            if (f27760) {
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

    /* JADX INFO: renamed from: ﻛ */
    private static String m29039(String str, char c, String str2, int i, String str3) {
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
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f27762) ^ ((long) f27756)) ^ ((long) f27757));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
