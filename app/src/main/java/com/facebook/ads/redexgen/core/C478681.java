package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.widget.LinearLayout;
import androidx.media3.common.PlaybackException;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.81 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C478681<NativeViewabilityLogger> implements InterfaceC7108k8 {
    public static byte[] A0J;
    public static String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final String A0L;
    public InterfaceC5701N9 A00;
    public C5702NA A01;
    public C7085jl A02;
    public C47737o A03;
    public C472976 A04;
    public InterfaceC6192VA A05;
    public EnumC6231Vp A06;
    public InterfaceC6550b1 A07;
    public C5600LV A08;
    public C466362 A09;
    public AbstractC6846fo A0A;
    public C6847fp A0B;
    public String A0D;
    public final String A0I = UUID.randomUUID().toString();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final C6365Y2 A0H = new C6365Y2();
    public Boolean A0C = false;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{Ascii.f22493FS, 40, 38, -25, Ascii.f22502US, Ascii.SUB, Ascii.f22493FS, Ascii.f22498RS, Ascii.ESC, 40, 40, 36, -25, Ascii.SUB, Ascii.f22494GS, 44, -25, Ascii.ESC, Ascii.SUB, 39, 39, Ascii.f22498RS, 43, -25, Ascii.f22493FS, 37, 34, Ascii.f22493FS, 36, Ascii.f22498RS, Ascii.f22494GS, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = C478681.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A09 != null && this.A03 != null && this.A03.A1g()) {
            this.A00.ADD(this, this.A09);
        }
        if (this.A00 != null) {
            boolean z = this.A0E;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z && (this.A0F || !this.A0G)) {
                InterfaceC5701N9 interfaceC5701N9 = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    interfaceC5701N9.ADD(this, this.A08);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    interfaceC5701N9.ADD(this, this.A08);
                }
            }
        }
        this.A04.A0F().A4O(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i, C6118Tx c6118Tx) {
        C7102k2 c7102k2 = new C7102k2(this);
        this.A09 = new C466362(this.A04, this.A05, c7102k2, this.A03, A08(0, 31, 79), 2, this.A0H);
        this.A0A = new C7101k1(this);
        this.A0B = new C6847fp(this.A09, c6118Tx.A04(), c6118Tx.A09(), true, new WeakReference(this.A0A), this.A04);
        this.A0B.A0W(this.A03.A0m());
        this.A0B.A0X(this.A03.A0n());
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        this.A09.AKD();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C6118Tx c6118Tx, JSONObject jSONObject, EnumC6231Vp enumC6231Vp) {
        this.A0F = false;
        final C7087jn c7087jnA00 = C7087jn.A00(this.A04, jSONObject);
        this.A0D = c7087jnA00.A7O();
        if (AbstractC5690Mx.A06(this.A04, c7087jnA00, this.A05)) {
            this.A04.A0F().A52();
            this.A00.AEN(this, C6229Vm.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new AbstractC5620Lp() { // from class: com.facebook.ads.redexgen.X.82
            public static byte[] A02;
            public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{67, 116, 116, 105, 116, 38, 99, 126, 99, 101, 115, 114, 111, 104, 97, 38, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, SignedBytes.MAX_POWER_OF_TWO, 109, 100, 113, 116, 112, 115, 118, 81, 74, 77, 85, 81, 65, 109, SignedBytes.MAX_POWER_OF_TWO};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void ACz() {
                this.A00.A0F = true;
                if (this.A00.A0G) {
                    this.A00.A0A();
                }
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC5620Lp, com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void ADN(String str, Map<String, String> map) {
                C5734Ng c5734NgA2A;
                this.A00.A04.A0F().A4P();
                Uri uriA00 = AbstractC6312XB.A00(str);
                map.put(A00(22, 10, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), AdPlacementType.BANNER.name());
                map.put(A00(36, 8, 77), this.A00.A0I);
                C472976 c472976 = this.A00.A04;
                InterfaceC6192VA interfaceC6192VA = this.A00.A05;
                String strA7O = c7087jnA00.A7O();
                if (this.A00.A03 == null) {
                    c5734NgA2A = null;
                } else {
                    C478681 c478681 = this.A00;
                    if (A03[7].length() == 4) {
                        throw new RuntimeException();
                    }
                    A03[2] = "7FoTEC4l3Pv3ceMVIqf";
                    c5734NgA2A = c478681.A03.A2A();
                }
                AbstractC5686Mt adAction = C5687Mu.A00(c472976, interfaceC6192VA, strA7O, uriA00, map, c5734NgA2A);
                EnumC5683Mq enumC5683MqA0G = EnumC5683Mq.A09;
                if (adAction != null) {
                    try {
                        this.A00.A04.A0F().A4M();
                        enumC5683MqA0G = adAction.A0G(null);
                    } catch (Exception e) {
                        Log.e(C478681.A0L, A00(0, 22, 111), e);
                    }
                }
                if (A00(32, 4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE).equals(uriA00.getScheme()) && C5687Mu.A04(uriA00.getAuthority()) && this.A00.A00 != null && enumC5683MqA0G != EnumC5683Mq.A06) {
                    this.A00.A00.ADC(this.A00);
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void AEA() {
                this.A00.A04.A0F().A4Q(this.A00.A02 != null);
                if (this.A00.A02 != null) {
                    this.A00.A02.A03();
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void AF8() {
                this.A00.A04.A0F().A4S();
                this.A00.A02.A09();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6550b1
            public final void AGg() {
            }
        };
        this.A08 = new C5600LV(this.A04, (WeakReference<InterfaceC6550b1>) new WeakReference(this.A07), c6118Tx.A04(), A7O());
        this.A08.A0L(c6118Tx.A07(), c6118Tx.A08());
        AbstractC5696N4 impressionHelper = new C7100k0(this);
        this.A02 = new C7085jl(this.A04, this.A05, this.A08, this.A08.getViewabilityChecker(), impressionHelper, enumC6231Vp);
        this.A02.A0A(c7087jnA00);
        this.A08.loadDataWithBaseURL(AbstractC6553b4.A01(AdInternalSettings.getUrlPrefix()), c7087jnA00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0E = true;
        A0A();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053 A[PHI: r1
  0x0053: PHI (r1v13 int) = (r1v10 int), (r1v17 int) binds: [B:20:0x0079, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(EnumC6231Vp enumC6231Vp, C6118Tx c6118Tx) {
        int i;
        int bannerHeight;
        if (this.A03 != null) {
            InterfaceC6192VA interfaceC6192VA = this.A05;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj";
            strArr[4] = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS";
            if (interfaceC6192VA == null) {
                return;
            }
            int iA03 = enumC6231Vp.A03();
            if (A0K[3].charAt(25) != 'G') {
                A0K[5] = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z";
                i = (int) (iA03 * Resources.getSystem().getDisplayMetrics().density);
                if (C6171Up.A2H(this.A04)) {
                    bannerHeight = C6021SN.A0A(this.A03.A1H()) ? 1 : 0;
                }
                if (bannerHeight == 0) {
                    A0C(i, c6118Tx);
                } else {
                    new C6021SN(new C6056Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new C7104k4(this, i, c6118Tx, this)).A0B();
                }
            }
            i = (int) (iA03 * Resources.getSystem().getDisplayMetrics().density);
            if (C6171Up.A2H(this.A04)) {
                if (C6021SN.A0A(this.A03.A1H())) {
                }
            }
            if (bannerHeight == 0) {
                A0C(i, c6118Tx);
            } else {
                new C6021SN(new C6056Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new C7104k4(this, i, c6118Tx, this)).A0B();
            }
            if (bannerHeight == 0) {
                A0C(i, c6118Tx);
            } else {
                new C6021SN(new C6056Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new C7104k4(this, i, c6118Tx, this)).A0B();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final String A7O() {
        return this.A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final AdPlacementType A8k() {
        if (C6171Up.A1A(this.A04)) {
            EnumC6231Vp enumC6231Vp = this.A06;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC6231Vp != null && this.A06 == EnumC6231Vp.A09) {
                return AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7108k8
    public final void AAt(C472976 c472976, InterfaceC6192VA interfaceC6192VA, EnumC6231Vp enumC6231Vp, InterfaceC5701N9 interfaceC5701N9, JSONObject jSONObject, C6118Tx c6118Tx) {
        c472976.A0F().A4N();
        this.A04 = c472976;
        this.A05 = interfaceC6192VA;
        this.A00 = interfaceC5701N9;
        this.A06 = enumC6231Vp;
        this.A0G = C6171Up.A1o(this.A04.getApplicationContext());
        this.A03 = C47737o.A00(jSONObject, this.A04);
        if (this.A03.A1g()) {
            A0G(enumC6231Vp, c6118Tx);
        } else {
            A0F(c6118Tx, jSONObject, enumC6231Vp);
        }
        this.A01 = new C5702NA(this.A04, this.A0I, this, interfaceC5701N9);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final boolean AKL() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5693N1
    public final void onDestroy() {
        this.A04.A0F().A4L(this.A08 != null);
        if (this.A08 != null) {
            this.A08.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
