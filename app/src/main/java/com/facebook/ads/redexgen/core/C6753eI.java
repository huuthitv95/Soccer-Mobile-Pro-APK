package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p300io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6753eI extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC7077jd A03;
    public final C5742No A04;
    public final C6902gi A05;
    public final InterfaceC6192VA A06;
    public final InterfaceC6550b1 A07;
    public final C5600LV A08;
    public final InterfaceC6751eG A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, Ascii.DC2, 32, Ascii.f22493FS, 17, 9, 17, Ascii.DC2, Ascii.f22493FS, Ascii.NAK, 49, Ascii.DC4, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, 127, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, 127, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, Ascii.f22490CR, 49, 60, 36, 60, 63, 49, 56, Ascii.f22493FS, 57, 46, Ascii.f22503VT, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, 127, 113, 116, 121, 126, 119, 48, 98, 117, 125, 127, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, Ascii.f22490CR, 0, Ascii.CAN, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, Base64.padSymbol, 37, 38, 40, 33, Ascii.ESC, 54, 33, 41, 43, 48, 33, 95, 72, SignedBytes.MAX_POWER_OF_TWO, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A0A();
        A0E = (int) (AbstractC6334XX.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C6753eI(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, C5742No c5742No, InterfaceC6192VA interfaceC6192VA, InterfaceC6751eG interfaceC6751eG, Map<String, String> playableMetricsData) {
        super(c6902gi);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC5620Lp() { // from class: com.facebook.ads.redexgen.X.4S
            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void ACz() {
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC5620Lp, com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void ADu(int i, String str) {
                this.A00.A0B.set(true);
                this.A00.A09.AEh();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void AEA() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true)) {
                    return;
                }
                this.A00.A09.AEA();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void AF8() {
                if (!this.A00.A04.A0b()) {
                    return;
                }
                this.A00.A09.AFQ();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void AGg() {
                this.A00.A09.AGg();
            }
        };
        this.A05 = c6902gi;
        this.A03 = abstractC7077jd;
        this.A04 = c5742No;
        this.A06 = interfaceC6192VA;
        this.A09 = interfaceC6751eG;
        this.A02 = playableMetricsData;
        this.A08 = A05();
        if (C6171Up.A1z(this.A05)) {
            this.A05.A0B().AKn(this.A08, this.A03.A2E(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C6753eI c6753eI) {
        int i = c6753eI.A00;
        c6753eI.A00 = i + 1;
        return i;
    }

    private C5600LV A05() {
        C5600LV c5600lv = new C5600LV(this.A05, (WeakReference<InterfaceC6550b1>) new WeakReference(this.A07), 10, C6171Up.A28(this.A05));
        c5600lv.setCornerRadius(A0E);
        c5600lv.setLogMultipleImpressions(false);
        c5600lv.setCheckAssetsByJavascriptBridge(false);
        c5600lv.setWebViewTimeoutInMillis(this.A04.A0F());
        c5600lv.setRequestId(this.A03.A1D());
        c5600lv.setOnTouchListener(new ViewOnTouchListenerC6752eH(this));
        WebSettings settings = c5600lv.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        c5600lv.addJavascriptInterface(new C6754eJ(this.A05, this, this.A06, this.A02, this.A03.A2E()), A07(0, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        return c5600lv;
    }

    public final void A0B() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.A01;
        C6099Te c6099Te = new C6099Te(A07(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A07(136, 6, 72), this.A00);
            jSONObject.put(A07(142, 5, 104), jCurrentTimeMillis);
            jSONObject.put(A07(187, 5, 51), this.A03.A2E());
        } catch (JSONException e) {
            Log.e(A07(92, 15, 84), A07(12, 13, 74), e);
        }
        c6099Te.A07(jSONObject);
        c6099Te.A05(1);
        InterfaceC6097Tc interfaceC6097TcA08 = this.A05.A08();
        int i = AbstractC6098Td.A2D;
        String strA07 = A07(147, 8, 11);
        interfaceC6097TcA08.ABD(strA07, i, c6099Te);
        this.A00 = 0;
        if (!C6171Up.A1u(this.A05)) {
            this.A09.ADX();
            return;
        }
        if (jCurrentTimeMillis <= C6171Up.A0L(this.A05)) {
            InterfaceC6751eG interfaceC6751eG = this.A09;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            interfaceC6751eG.ADX();
            return;
        }
        c6099Te.A05(0);
        this.A05.A08().ABC(strA07, AbstractC6098Td.A2E, c6099Te);
    }

    public final void A0C() {
        String strA0L;
        if (this.A04.A0Y()) {
            C6099Te c6099Te = new C6099Te(A07(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A07(170, 17, 36), this.A04.A0P());
                jSONObject.put(A07(187, 5, 51), this.A03.A2E());
            } catch (JSONException e) {
                String strA07 = A07(92, 15, 84);
                String strA08 = A07(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(strA07, strA08, e);
            }
            c6099Te.A07(jSONObject);
            c6099Te.A05(1);
            InterfaceC6097Tc interfaceC6097TcA08 = this.A05.A08();
            int i = AbstractC6098Td.A2G;
            String strA09 = A07(155, 15, 77);
            interfaceC6097TcA08.ABD(strA09, i, c6099Te);
            if (C6171Up.A0r(this.A05) && AbstractC6362Xz.A00(this.A05) == EnumC6361Xy.A07) {
                this.A05.A08().ABD(strA09, AbstractC6098Td.A2F, c6099Te);
                this.A07.ADu(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            C5600LV c5600lv = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0I())) {
                strA0L = this.A04.A0I();
            } else {
                strA0L = this.A04.A0L();
            }
            c5600lv.loadUrl(strA0L);
        } catch (Exception e2) {
            this.A05.A08().ABC(A07(192, 8, 9), AbstractC6098Td.A2f, new C6099Te(e2));
        }
    }

    public final void A0D() {
        if (C6171Up.A1z(this.A05)) {
            this.A05.A0B().AKU(this.A08);
        }
        this.A08.removeJavascriptInterface(A07(0, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        this.A08.destroy();
    }

    public final void A0E(int i) {
        this.A08.setVisibility(i);
        if (i == 0) {
            this.A08.resumeTimers();
        } else {
            this.A08.pauseTimers();
        }
    }

    public C6365Y2 getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public C6847fp getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
