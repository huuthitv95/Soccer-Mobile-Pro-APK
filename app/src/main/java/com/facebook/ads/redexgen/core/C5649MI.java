package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5649MI implements InterfaceC6407Yi {
    public static byte[] A0D;
    public int A00;
    public C5193Eu A01;
    public C45584L A02;
    public String A03;
    public final C6902gi A04;
    public final InterfaceC6192VA A05;
    public final InterfaceC6406Yh A06;
    public final InterfaceC6450ZP A07;
    public final C5183Ek A08;
    public final AbstractC5139E2 A0C = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.6d
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{115, 108, 97, 96, 106, 76, 107, 113, 96, 119, 118, 113, 108, 113, 100, 105, SignedBytes.MAX_POWER_OF_TWO, 115, 96, 107, 113};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C5140E3 c5140e3) {
            this.A00.A06.A4k(A00(0, 21, 63), c5140e3);
        }
    };
    public final AbstractC5141E4 A0B = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.6a
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{38, 57, 52, 53, 63, Ascii.f22491EM, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, Ascii.NAK, 38, 53, 62, 36};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C45484B c45484b) {
            this.A00.A06.A4k(A00(0, 21, 40), c45484b);
        }
    };
    public final AbstractC5147EA A09 = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.6Z
        public static byte[] A01;
        public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};

        public static String A00(int i, int i2, int i3) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                int i5 = bArrCopyOfRange[i4] ^ i3;
                if (A02[2].charAt(8) != '5') {
                    throw new RuntimeException();
                }
                A02[5] = "7KI0j9KfVtSFY3dF";
                bArrCopyOfRange[i4] = (byte) (i5 ^ 70);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{3, Ascii.f22493FS, 17, Ascii.DLE, Ascii.SUB, 60, Ascii.ESC, 1, Ascii.DLE, 7, 6, 1, Ascii.f22493FS, 1, Ascii.DC4, Ascii.f22491EM, 48, 3, Ascii.DLE, Ascii.ESC, 1};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
        /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C45574K c45574k) {
            this.A00.A06.A4k(A00(0, 21, 51), c45574k);
        }
    };
    public final AbstractC5145E8 A0A = new AbstractC5145E8() { // from class: com.facebook.ads.redexgen.X.6Y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C5146E9 c5146e9) {
            this.A00.A07.ADv();
        }
    };

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, Base64.padSymbol, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, Ascii.DC4, Ascii.DC2, 4, 47, 0, Ascii.NAK, 8, Ascii.ETB, 4, 34, Ascii.NAK, 0, 35, Ascii.DC4, Ascii.NAK, Ascii.NAK, Ascii.f22500SO, Ascii.f22499SI, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, 63, 32, 45, 44, 38, Ascii.f22493FS, Ascii.ESC, 5};
    }

    public C5649MI(C6902gi c6902gi, InterfaceC6450ZP interfaceC6450ZP, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh) {
        this.A04 = c6902gi;
        this.A05 = interfaceC6192VA;
        this.A07 = interfaceC6450ZP;
        this.A08 = new C5183Ek(c6902gi);
        this.A08.A0f(new C45273q(c6902gi));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = interfaceC6406Yh;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC6406Yh.A45(this.A08, layoutParams);
        C6414Yp closeButton = new C6414Yp(c6902gi);
        closeButton.setOnClickListener(new ViewOnClickListenerC6448ZN(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC6406Yh.A45(closeButton, params);
    }

    public final void A04(int i) {
        this.A08.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AAu(Intent intent, Bundle bundle, C5976Re c5976Re) {
        String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C6738e3 c6738e3 = new C6738e3(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * AbstractC6334XX.A02);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c6738e3.setOnClickListener(new ViewOnClickListenerC6449ZO(this));
            this.A06.A45(c6738e3, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), 0);
        this.A02 = new C45584L(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C6171Up.A20(this.A04)) {
            this.A01 = new C5193Eu(this.A04, this.A05, this.A08, this.A03, false, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0a(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0e(EnumC6789et.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFA(boolean z) {
        this.A06.A4k(A02(37, 21, 39), new C5143E6());
        this.A08.A0X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFi(boolean z) {
        this.A06.A4k(A02(37, 21, 39), new C5142E5());
        if (!this.A08.A0o()) {
            this.A08.A0e(EnumC6789et.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void onDestroy() {
        this.A06.A4k(A02(37, 21, 39), new C5135Dy(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0j(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A08();
        }
        this.A08.A0b(1);
        this.A08.A0W();
    }
}
