package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7038iy implements InterfaceC5704NC {
    public static byte[] A02;
    public final /* synthetic */ C47687j A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{66, 70, 66, Ascii.NAK, Ascii.NAK, 68, 19, 17, 77, 104, 109, 124, 120, 105, 126, 44, 101, 127, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, 127, 120, 101, 120, 101, 109, 96, 77, 104, 59, Ascii.f22493FS, 6, Ascii.ETB, 0, 1, 6, Ascii.ESC, 6, Ascii.ESC, 19, Ascii.f22498RS, 82, Ascii.ESC, Ascii.f22502US, 2, 0, Ascii.ETB, 1, 1, Ascii.ESC, Ascii.f22494GS, Ascii.f22493FS, 82, Ascii.DC4, Ascii.ESC, 0, Ascii.ETB, Ascii.SYN, 63, 48, 1, 63, Base64.padSymbol, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C7038iy(C47687j c47687j, Runnable runnable) {
        this.A00 = c47687j;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEC(C7099jz c7099jz, String str, boolean z) {
        this.A00.A07.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(AbstractC6312XB.A00(str));
                C6297Wu.A0D(this.A00.A0B, intent);
            } catch (C6295Ws e) {
                Throwable cause = e.getCause();
                C6295Ws cause2 = e;
                if (cause != null) {
                    cause2 = e.getCause();
                }
                this.A00.A0B.A08().ABC(A00(74, 11, 100), AbstractC6098Td.A04, new C6099Te(cause2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AED(C7099jz c7099jz) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEE(C7099jz c7099jz) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEF(C7099jz c7099jz) {
        if (c7099jz != this.A00.A00) {
            return;
        }
        if (c7099jz == null) {
            this.A00.A0B.A08().ABC(A00(111, 3, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), AbstractC6098Td.A0X, new C6099Te(A00(8, 37, 54)));
            AEG(c7099jz, AdError.internalError(2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c7099jz;
        this.A00.A0L();
        this.A00.A07.A0F(c7099jz);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEG(C7099jz c7099jz, AdError adError) {
        if (c7099jz != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c7099jz);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C6229Vm(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEH(C7099jz c7099jz) {
        AbstractC6240Vy.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEI() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEJ() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void AEK() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5704NC
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
