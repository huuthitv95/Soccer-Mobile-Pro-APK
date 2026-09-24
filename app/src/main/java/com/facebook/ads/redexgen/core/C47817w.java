package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7w */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47817w extends AbstractC7081jh {
    public static C6056Sx A0D;
    public static byte[] A0E;
    public static String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public InterfaceC5711NJ A01;
    public C5712NK A02;
    public AbstractC5718NQ A03;
    public C6902gi A04;
    public EnumC6262WK A05;
    public C6685dC A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, Ascii.f22492FF, 3, 2, -33, 2, -30, -1, Ascii.DC2, -1, -32, 19, Ascii.f22492FF, 2, 10, 3, Ascii.f22494GS, Ascii.NAK, Ascii.DC4, Ascii.f22491EM, 17, 36, Ascii.f22491EM, Ascii.f22502US, Ascii.f22498RS, -12, 17, 36, 17, Ascii.DLE, Ascii.f22492FF, 1, 3, 5, Ascii.f22490CR, 5, Ascii.f22500SO, Ascii.DC4, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, Ascii.f22493FS, Ascii.f22499SI, 33, Ascii.f22503VT, Ascii.f22493FS, Ascii.f22500SO, Ascii.f22499SI, Ascii.f22500SO, 9, 32, 19, Ascii.f22500SO, Ascii.f22499SI, Ascii.f22491EM, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A09();
    }

    private void A07() {
        C5818P2.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A08() {
        if (this.A02 != null) {
            try {
                C5818P2.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A0A(Intent intent) {
        int i = super.A00;
        String strA05 = A05(77, 24, 25);
        if (i != -1 && Settings.System.getInt(this.A04.getContentResolver(), A05(1, 22, 92), 0) != 1) {
            int i2 = super.A00;
            String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(strA05, i2);
            return;
        }
        C6902gi c6902gi = this.A04;
        String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (C6171Up.A0h(c6902gi)) {
                return;
            }
        } else if (C6171Up.A0h(c6902gi)) {
            return;
        }
        intent.putExtra(strA05, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(final C6902gi c6902gi, final C7069jT c7069jT, final int i) {
        if (i >= c7069jT.A23()) {
            return;
        }
        final C47707l c47707l = (C47707l) c7069jT.A27(i);
        A0D = new C6056Sx(c6902gi);
        A0D.A0e(new C6200VI(c47707l.A2E(), c6902gi.A0A()));
        AbstractC5760O6.A02(c6902gi, A0D, c47707l);
        final boolean z = i == 0;
        A0D.A0X(new AbstractC7044j4(z) { // from class: com.facebook.ads.redexgen.X.7x
            @Override // com.facebook.ads.redexgen.core.AbstractC7044j4
            public final void A00() {
                this.A01.A01.AFp(this.A01, AdError.CACHE_ERROR);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC7044j4
            public final void A01(boolean z2) {
                C47817w.A0D = null;
                if (z2) {
                    c6902gi.A01().AJE(c47707l.A2E(), c7069jT.A28());
                }
                if (i == c7069jT.A25()) {
                    this.A01.A0C.set(true);
                    this.A01.A01.AFm(this.A01);
                }
                this.A01.A0C(c6902gi, c7069jT, i + 1);
            }
        }, new C6049Sq(c47707l.A1D(), A05(152, 14, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), i));
    }

    private void A0D(boolean z) {
        if (this.A05 == EnumC6262WK.A0G) {
            A0F(z);
            return;
        }
        if (this.A05 == EnumC6262WK.A0I) {
            A0G(z);
        } else if (this.A05 == EnumC6262WK.A0H) {
            A0E(z);
        } else {
            A0G(z);
        }
    }

    private void A0E(boolean z) {
        C6056Sx c6056Sx = new C6056Sx(this.A04);
        boolean z2 = C6171Up.A2H(this.A04) && C6021SN.A0A(this.A03.A1H());
        if (z2) {
            C6021SN unifiedAssetsLoader = new C6021SN(c6056Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z2, new C7089jp(this));
            c6056Sx.A0e(new C6200VI(((AbstractC7077jd) this.A03).A2E(), this.A04.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC5759O5.A02(this.A04, (AbstractC7077jd) this.A03, z, new C7088jo(this));
    }

    private void A0F(boolean z) {
        C6056Sx c6056Sx = new C6056Sx(this.A04);
        c6056Sx.A0e(new C6200VI(((AbstractC7077jd) this.A03).A2E(), this.A04.A0A()));
        AbstractC5760O6.A03(this.A04, c6056Sx, (C47707l) this.A03);
        c6056Sx.A0X(new C7093jt(this), new C6049Sq(this.A03.A1D(), A05(152, 14, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)));
    }

    private void A0G(boolean z) {
        boolean z2 = false;
        if (this.A03.A1b()) {
            C7069jT c7069jT = (C7069jT) this.A03;
            for (int i = 0; i < c7069jT.A23(); i++) {
                if (TextUtils.isEmpty(c7069jT.A27(i).A29().A0H().A09())) {
                    this.A01.AFp(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0C(this.A04, c7069jT, 0);
            return;
        }
        C6056Sx c6056Sx = new C6056Sx(this.A04);
        c6056Sx.A0e(new C6200VI(((AbstractC7077jd) this.A03).A2E(), this.A04.A0A()));
        if (C6171Up.A2H(this.A04) && C6021SN.A0A(this.A03.A1H())) {
            z2 = true;
        }
        boolean zA1g = this.A03.A1g();
        if (z2) {
            C6021SN unifiedAssetsLoader = new C6021SN(c6056Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z2, new C7091jr(this, zA1g));
            unifiedAssetsLoader.A0B();
            return;
        }
        C47707l c47707l = (C47707l) this.A03;
        if (TextUtils.isEmpty(c47707l.A29().A0H().A09())) {
            if (this.A05 == EnumC6262WK.A0J) {
                this.A04.A0F().AEQ();
            }
            this.A01.AFp(this, AdError.INTERNAL_ERROR);
        } else {
            AbstractC5760O6.A02(this.A04, c6056Sx, c47707l);
            c6056Sx.A0X(new C47837y(this, z, zA1g, c47707l, this), new C6049Sq(c47707l.A1D(), A05(152, 14, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7081jh
    public final int A0H() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0p();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7081jh
    public final AbstractC5718NQ A0I() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7081jh
    public final boolean A0J() {
        C6295Ws cause;
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A1J(super.A01);
        String strA04 = C6770ea.A04(super.A02, this.A0B, this.A07);
        this.A03.A1K(super.A02);
        this.A03.A1O(strA04);
        AdActivityIntent adActivityIntentA05 = C6297Wu.A05(this.A04);
        adActivityIntentA05.putExtra(A05(174, 8, 83), this.A05);
        adActivityIntentA05.putExtra(A05(127, 25, 78), this.A03);
        adActivityIntentA05.putExtra(A05(34, 19, 107), this.A03);
        adActivityIntentA05.putExtra(A05(166, 8, 27), this.A0B);
        if (strA04 != null) {
            adActivityIntentA05.putExtra(A05(112, 15, 89), strA04);
        }
        adActivityIntentA05.putExtra(A05(66, 11, 109), this.A0A);
        adActivityIntentA05.putExtra(A05(101, 11, 74), this.A00);
        if (this.A09 != null) {
            adActivityIntentA05.putExtra(A05(53, 13, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), this.A09);
        }
        A0A(adActivityIntentA05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            adActivityIntentA05.setFlags(adActivityIntentA05.getFlags() | 268435456);
        }
        ActivityUtils.A03(this.A04);
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C6297Wu.A0I(this.A04, adActivityIntentA05)) {
                    this.A04.A0F().AIC();
                    if (this.A01 != null) {
                        this.A01.AFp(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C6297Wu.A0B(this.A04, adActivityIntentA05);
            return true;
        } catch (C6295Ws e) {
            String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            if (e.getCause() != null) {
                cause = e;
                cause = e.getCause();
            }
            cause = e;
            this.A04.A08().ABC(A05(23, 11, 50), AbstractC6098Td.A01, new C6099Te(cause));
            return true;
        }
    }

    public final void A0K(C6902gi c6902gi, InterfaceC5711NJ interfaceC5711NJ, C5762O8 c5762o8, boolean z, String str, String str2) {
        String strA05;
        this.A0C.set(false);
        this.A04 = c6902gi;
        this.A01 = interfaceC5711NJ;
        this.A0A = c5762o8.A02();
        this.A00 = c5762o8.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            String str3 = this.A0A;
            String strA06 = A05(0, 1, 12);
            String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                strA05 = str3.split(strA06)[0];
            }
            throw new RuntimeException();
        }
        strA05 = A05(0, 0, 100);
        this.A07 = strA05;
        this.A03 = AbstractC5718NQ.A03(c5762o8.A03(), this.A04);
        this.A03.A1M(str);
        this.A03.A1I(c5762o8.A01().A06());
        if (this.A03.A1b()) {
            this.A08 = ((C7069jT) this.A03).A2A();
        } else {
            this.A08 = ((AbstractC7077jd) this.A03).A2E();
        }
        if (this.A03.A1g()) {
            this.A05 = EnumC6262WK.A08;
            if (this.A03.A1U()) {
                this.A04.A0F().AJt(EnumC5636M5.A08);
            } else {
                this.A04.A0F().AJt(EnumC5636M5.A0A);
            }
        } else {
            switch (this.A03.A0o()) {
                case 0:
                    this.A05 = EnumC6262WK.A0I;
                    this.A04.A0F().AJt(EnumC5636M5.A0D);
                    break;
                case 1:
                    this.A05 = EnumC6262WK.A0H;
                    this.A04.A0F().AJt(EnumC5636M5.A0C);
                    break;
                case 2:
                    this.A05 = EnumC6262WK.A05;
                    this.A04.A0F().AJt(EnumC5636M5.A05);
                    break;
                case 3:
                    this.A05 = EnumC6262WK.A0G;
                    this.A04.A0F().AJt(EnumC5636M5.A04);
                    break;
                case 4:
                    this.A05 = EnumC6262WK.A0J;
                    this.A04.A0F().AJt(EnumC5636M5.A0E);
                    break;
            }
        }
        if (C6171Up.A0v(c6902gi)) {
            AbstractC5718NQ abstractC5718NQ = this.A03;
            String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (abstractC5718NQ.A1b()) {
                    C7069jT c7069jT = (C7069jT) this.A03;
                    for (int iA23 = c7069jT.A23() - 1; iA23 >= 0; iA23--) {
                        AbstractC7077jd abstractC7077jdA27 = c7069jT.A27(iA23);
                        if (AbstractC5690Mx.A06(this.A04, AbstractC5690Mx.A01(c6902gi, abstractC7077jdA27.A1H(), abstractC7077jdA27.A2E()), c6902gi.A0A())) {
                            this.A04.A0F().A52();
                            c7069jT.A2C(iA23);
                            return;
                        }
                    }
                    if (c7069jT.A23() == 0) {
                        this.A01.AFp(this, AdError.NO_FILL);
                        return;
                    }
                } else if (AbstractC5690Mx.A06(this.A04, AbstractC5690Mx.A01(c6902gi, c5762o8.A03(), ((AbstractC7077jd) this.A03).A2E()), c6902gi.A0A())) {
                    this.A04.A0F().A52();
                    this.A01.AFp(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A02 = new C5712NK(this.A0B, this, interfaceC5711NJ);
        A07();
        A0D(z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final String A7O() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final void onDestroy() {
        A08();
    }
}
