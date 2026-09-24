package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.UUID;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6r */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47146r extends C5183Ek {
    public static byte[] A0F;
    public static String[] A0G = {"Cb7nBOTqt", "Uv90YERdy9SZ9btNePue9j4WSufKww0d", "5tFdsnJl1aHC8QazlewrqKxrXvRcdsO5", "4XUHzfDXngka", "6zmG8GCKaenNI", "iTvfTfiU680tAW5ZUJpNe0fUcB62AaOp", "iIjhxtVkNHrsB", "9VdyyBhNHsky"};
    public static final String A0H;
    public Uri A00;
    public NativeAd A01;
    public InterfaceC6192VA A02;
    public InterfaceC6420Yv A03;
    public C5193Eu A04;
    public C45584L A05;
    public String A06;
    public String A07;
    public String A08;
    public final C5713NL A09;
    public final C6902gi A0A;
    public final AbstractC5147EA A0B;
    public final AbstractC5141E4 A0C;
    public final AbstractC5139E2 A0D;
    public final String A0E;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A0G[0].length() == 17) {
                throw new RuntimeException();
            }
            A0G[2] = "GV7dEmS9dQikFIsLGq03TvmmBp0PGqms";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{32, 2, Ascii.f22490CR, 68, Ascii.ETB, 67, Ascii.DLE, Ascii.ETB, 2, 17, Ascii.ETB, 67, 34, Ascii.SYN, 7, 10, 6, Ascii.f22490CR, 0, 6, 45, 6, Ascii.ETB, Ascii.DC4, Ascii.f22492FF, 17, 8, 34, 0, Ascii.ETB, 10, Ascii.NAK, 10, Ascii.ETB, Ascii.SUB, 77, 67, 46, 2, 8, 6, 67, Ascii.DLE, Ascii.SYN, 17, 6, 67, Ascii.ETB, Ascii.f22503VT, 2, Ascii.ETB, 67, 10, Ascii.ETB, 68, Ascii.DLE, 67, 10, Ascii.f22490CR, 67, Ascii.SUB, Ascii.f22492FF, Ascii.SYN, 17, 67, 34, Ascii.f22490CR, 7, 17, Ascii.f22492FF, 10, 7, 46, 2, Ascii.f22490CR, 10, 5, 6, Ascii.DLE, Ascii.ETB, 77, Ascii.ESC, Ascii.f22500SO, Ascii.f22499SI, 67, 5, 10, Ascii.f22499SI, 6, 77, Ascii.f22494GS, 42, 42, 55, 42, 98, 120, 35, 39, 36, Ascii.DLE, 1, Ascii.f22492FF, 0, Ascii.f22503VT, 6, 0, 43, 0, 17, Ascii.DC2, 10, Ascii.ETB, Ascii.f22500SO, Ascii.NAK, 45, 43, 44, 120, 43, Base64.padSymbol, 44, Ascii.ESC, 52, 49, Base64.padSymbol, 54, 44, Ascii.f22492FF, 55, 51, Base64.padSymbol, 54, 120, 62, 49, 42, 43, 44, 3, 59, Base64.padSymbol, 58, 110, Base64.padSymbol, 43, 58, Ascii.CAN, 39, 42, 43, 33, Ascii.ESC, Ascii.f22493FS, 7, 110, 33, 60, 110, Base64.padSymbol, 43, 58, Ascii.CAN, 39, 42, 43, 33, 3, Ascii.f22498RS, 10, 110, 40, 39, 60, Base64.padSymbol, 58, Ascii.f22498RS, 17, 32, Ascii.f22498RS, Ascii.f22493FS, Ascii.f22503VT, Ascii.SYN, 9, Ascii.SYN, Ascii.f22503VT, 6, 51, 60, 57, 53, 62, 36, 4, 63, 59, 53, 62, 62, 47, 60, Base64.padSymbol, 39, 32, 41, Ascii.ETB, Ascii.NAK, 2, 3, 2, 1, Ascii.f22500SO, 9, 2, 3, 40, Ascii.NAK, Ascii.f22500SO, 2, 9, 19, 6, 19, Ascii.f22500SO, 8, 9, 44, 2, Ascii.f22498RS, 86, 77, 74, 82, 86, 70, 106, 71, 42, 44, 58, 17, 62, 43, 54, 41, 58, Ascii.f22493FS, 43, 62, Ascii.f22494GS, 42, 43, 43, 48, 49, 117, 106, 103, 102, 108, 79, 108, 100, 100, 102, 113, 85, 74, 71, 70, 76, 110, 115, 103, 66, 93, 80, 81, 91, 103, 81, 81, 95, 96, 93, 89, 81, 99, 124, 113, 112, 122, SignedBytes.MAX_POWER_OF_TWO, 71, 89, 17, Ascii.f22500SO, 3, 2, 8, 56, 19, Ascii.f22500SO, 10, 2, 56, Ascii.ETB, 8, Ascii.f22503VT, Ascii.f22503VT, Ascii.f22500SO, 9, 0, 56, Ascii.f22500SO, 9, 19, 2, Ascii.NAK, 17, 6, Ascii.f22503VT, 19, Ascii.f22492FF, 0, Ascii.DC2, 49, Ascii.f22493FS, Ascii.NAK, 0};
    }

    static {
        A03();
        A0H = C47146r.class.getSimpleName();
    }

    public C47146r(C6902gi c6902gi) {
        super(c6902gi);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AFC();
                }
            }
        };
        this.A0C = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45484B c45484b) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C5713NL(this, c6902gi);
        this.A0A = c6902gi;
        A02();
    }

    public C47146r(C6902gi c6902gi, AttributeSet attributeSet) {
        super(c6902gi, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AFC();
                }
            }
        };
        this.A0C = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45484B c45484b) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C5713NL(this, c6902gi);
        this.A0A = c6902gi;
        A02();
    }

    public C47146r(C6902gi c6902gi, AttributeSet attributeSet, int i) {
        super(c6902gi, attributeSet, i);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AFC();
                }
            }
        };
        this.A0C = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45484B c45484b) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C5713NL(this, c6902gi);
        this.A0A = c6902gi;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        if (this.A00 == null && this.A08 == null) {
            A05(A01(TsExtractor.TS_STREAM_TYPE_DTS_UHD, 37, 74));
            String[] strArr = A0G;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "rwc2";
            return;
        }
        intent.putExtra(A01(237, 18, 91), this.A07);
        intent.putExtra(A01(322, 8, 97), EnumC6262WK.A09);
        intent.putExtra(A01(MBSupportMuteAdType.INTERSTITIAL_VIDEO, 8, 17), this.A00.toString());
        intent.putExtra(A01(187, 11, 84), this.A06 == null ? A01(0, 0, 6) : this.A06);
        intent.putExtra(A01(266, 8, 39), this.A08);
        intent.putExtra(A01(205, 24, 99), AbstractC6334XX.A00(this.A0A));
        intent.putExtra(A01(274, 13, 48), getCurrentPositionInMillis());
        String[] strArr2 = A0G;
        if (strArr2[7].length() != strArr2[3].length()) {
            throw new RuntimeException();
        }
        A0G[0] = "bFTSk0Gp6QusC65PcsD";
        intent.putExtra(A01(229, 8, 39), this.A0E);
        intent.putExtra(A01(255, 11, 7), this.A05.A0c());
        intent.putExtra(A01(295, 27, 99), getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    private void A05(String str) {
        this.A0A.A08().ABC(A01(198, 7, 74), AbstractC6098Td.A28, new C6099Te(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 92) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0H, str);
        }
    }

    public final void A0r() {
        if (this.A01 != null) {
            this.A01.onCtaBroadcast();
        }
    }

    public final void A0s() {
        AdActivityIntent adActivityIntentA05 = C6297Wu.A05(this.A0A);
        A04(adActivityIntentA05);
        try {
            A0i(false, 6);
            setVisibility(8);
            C6297Wu.A0B(this.A0A, adActivityIntentA05);
        } catch (Exception e) {
            this.A0A.A08().ABC(A01(176, 11, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), AbstractC6098Td.A0D, new C6099Te(e));
            Log.e(A01(97, 17, 97), A01(0, 90, 103), e);
        }
    }

    public InterfaceC6420Yv getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.core.C5183Ek, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.C5183Ek, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(InterfaceC6192VA interfaceC6192VA) {
        this.A02 = interfaceC6192VA;
    }

    public void setClientToken(String str) {
        C45584L c45584l;
        if (this.A04 != null) {
            C5193Eu c5193Eu = this.A04;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[2] = "geldSN57Uojbab2WOS9MzcIW4E8sQ4xA";
            c5193Eu.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A06 = str;
        C5193Eu c5193Eu2 = null;
        if (str != null) {
            c45584l = new C45584L(this.A0A, this.A02, this, str);
        } else {
            c45584l = null;
        }
        this.A05 = c45584l;
        if (this.A05 != null && C6171Up.A20(this.A0A)) {
            if (str != null) {
                c5193Eu2 = new C5193Eu(this.A0A, this.A02, this, str, false, this.A05, null);
            }
            this.A04 = c5193Eu2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z) {
        super.A0E.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(InterfaceC6420Yv interfaceC6420Yv) {
        this.A03 = interfaceC6420Yv;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.core.C5183Ek
    public void setVideoMPD(String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A08 = str;
        String[] strArr = A0G;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[4] = "ao7Mn74HmNnh4";
        strArr2[6] = "E6rOC8IWnX5Ja";
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.redexgen.core.C5183Ek
    public void setVideoURI(Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
        String[] strArr = A0G;
        if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0G[0] = "z2OQUaNXEwktMvnJ8h1OzGBt0";
    }
}
