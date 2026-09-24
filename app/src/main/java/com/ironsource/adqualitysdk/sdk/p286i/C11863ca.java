package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ca */
/* JADX INFO: loaded from: classes6.dex */
public final class C11863ca extends AbstractC11840be {

    /* JADX INFO: renamed from: ﱟ */
    private static int f28049 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28050 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f28051 = {'L', 'q', 'w', 'h', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'l', 'd', 'o', 'D', 'f', 'y', '|', 'R', 'j', 'x', 'g', 'O', 'U', 'z'};

    /* JADX INFO: renamed from: ﻛ */
    private static long f28052 = -8376924420124770608L;

    /* JADX INFO: renamed from: ｋ */
    private static boolean f28053 = true;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28054 = 3;

    /* JADX INFO: renamed from: ﾒ */
    private static boolean f28055 = true;

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29458(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = 2 % 2;
        int i2 = f28050 + 51;
        f28049 = i2 % 128;
        int i3 = i2 % 2;
        m29461(oguryInterstitialAd, oguryInterstitialAdListener);
        int i4 = f28049 + 83;
        f28050 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m29462(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = 2 % 2;
        int i2 = f28049 + 67;
        f28050 = i2 % 128;
        int i3 = i2 % 2;
        m29459(oguryRewardedAd, oguryRewardedAdListener);
        int i4 = f28050 + 31;
        f28049 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    public C11863ca(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0127  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b = 2;
        int i = 2 % 2;
        int i2 = f28049 + 13;
        f28050 = i2 % 128;
        int i3 = i2 % 2;
        switch (str.hashCode()) {
            case -1704786309:
                if (!str.equals(m29457(null, 127 - (Process.myPid() >> 22), null, "\u008d\u0083\u0087\u008c\u0087\u0083\u008b\u008a\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -734879533:
                if (!str.equals(m29460("ﺟ薪࢟迵ዝ餓ᰛꍬ♙ꪧ㆖", KeyEvent.keyCodeFromString("") + 31517).intern())) {
                    b = -1;
                } else {
                    int i4 = f28050 + 33;
                    f28049 = i4 % 128;
                    b = i4 % 2 == 0 ? (byte) 7 : (byte) 100;
                }
                break;
            case 76142724:
                if (!str.equals(m29457(null, TextUtils.indexOf("", "", 0) + 127, null, "\u008d\u0085\u0090\u008f\u008e").intern())) {
                    b = -1;
                } else {
                    int i5 = f28049 + 69;
                    f28050 = i5 % 128;
                    int i6 = i5 % 2;
                }
                break;
            case 82913255:
                if (!str.equals(m29457(null, TextUtils.getCapsMode("", 0, 0) + 127, null, "\u0085\u0084\u0082\u0084\u0083\u0086\u0087\u0092\u0091\u008a\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081\u008d\u0085\u0090\u008f\u008e").intern())) {
                    b = -1;
                } else {
                    int i7 = f28049 + 37;
                    f28050 = i7 % 128;
                    int i8 = i7 % 2;
                    b = 4;
                }
                break;
            case 186993737:
                if (!str.equals(m29460("ﺟ鉰✫룷䶵\ue161爟ߖ颉ⱝ셲券\ue7e0碊ౖꄵ㋉잔孚\uec70脲ዦꞸ", 27847 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i9 = f28050 + 19;
                    f28049 = i9 % 128;
                    b = i9 % 2 != 0 ? Ascii.f22502US : (byte) 6;
                }
                break;
            case 1169123445:
                if (!str.equals(m29457(null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, "\u0091\u008a\u0091\u0084\u0091\u0085\u0088\u0094\u0084\u0093\u008d\u0085\u0090\u008f\u008e").intern())) {
                    b = -1;
                } else {
                    int i10 = f28050 + 109;
                    f28049 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 5;
                }
                break;
            case 1789379091:
                if (!str.equals(m29457(null, AndroidCharacter.getMirror('0') + 'O', null, "\u0091\u008a\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081\u008d\u0085\u0090\u008f\u008e").intern())) {
                    b = -1;
                } else {
                    int i12 = f28050 + 33;
                    f28049 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 3;
                }
                break;
            case 1866202823:
                if (!str.equals(m29460("ﺳ㹐罣밳ﴃ㨜笿렫六㚙矧등\uf5ca㊚玬낥\uf045ㅽ湭꼙\uec15ⴿ樳ꯈ\ue8d4⦩曣ꞌ\ue4da▊押ꉕ\ue355\u206d愝鸉\udf25ᰯ巃高\udbe4ᣖ妅隁\ud7adᒥ呋镅퉹", 49439 - AndroidCharacter.getMirror('0')).intern())) {
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
            case 1:
                return InterstitialActivity.class;
            case 2:
                return Ogury.class;
            case 3:
                return OguryInterstitialAd.class;
            case 4:
                return OguryInterstitialAdListener.class;
            case 5:
                return OguryRewardedAd.class;
            case 6:
                return OguryRewardedAdListener.class;
            case 7:
                return OguryReward.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29457(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u0085\u0084\u0082\u0084\u0083\u0086\u0087\u0092\u0091\u008a\u0089\u0088\u0087\u0083\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081\u0083\u0084\u0086").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11863ca.m29458((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m29457(null, (Process.myTid() >> 22) + 127, null, "\u0085\u0084\u0082\u0084\u0083\u0086\u0087\u0092\u0091\u008a\u0091\u0084\u0091\u0085\u0088\u0094\u0084\u0093\u0083\u0084\u0086").intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11863ca.m29462((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        int i2 = f28049 + 85;
        f28050 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f28050 + 87;
        f28049 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                String sdkVersion = Ogury.getSdkVersion();
                int i3 = f28050 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f28049 = i3 % 128;
                int i4 = i3 % 2;
                return sdkVersion;
            }
            Ogury.getSdkVersion();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m29461(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = 2 % 2;
        int i2 = f28050 + 107;
        f28049 = i2 % 128;
        int i3 = i2 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m29459(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = 2 % 2;
        int i2 = f28049 + 43;
        f28050 = i2 % 128;
        int i3 = i2 % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f28050 + 21;
        f28049 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29460(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28052);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29457(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f28051;
            int i2 = f28054;
            if (f28055) {
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
            if (f28053) {
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
