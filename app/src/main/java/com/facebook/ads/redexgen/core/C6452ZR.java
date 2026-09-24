package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6452ZR implements InterfaceC6069TA {
    public static C6452ZR A07;
    public static byte[] A08;
    public InterfaceC5628Lx A00;
    public InterfaceC6060T1 A01;
    public InterfaceC6068T9 A02;
    public InterfaceC6084TP A03;
    public C6127U7 A04;
    public InterfaceC6204VM A05;
    public InterfaceC5047CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, Base64.padSymbol, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, Base64.padSymbol, Ascii.f22493FS, -13, -19, 32, Ascii.ESC, -15, Ascii.f22493FS, Ascii.f22499SI, Ascii.SUB, Ascii.f22491EM, Ascii.f22493FS, Ascii.f22498RS, -3, Ascii.f22499SI, Ascii.f22494GS, Ascii.f22494GS, 19, Ascii.f22491EM, Ascii.CAN, -18, Ascii.f22503VT, Ascii.f22498RS, Ascii.f22503VT, -13, Ascii.CAN, 19, Ascii.f22498RS, 19, Ascii.f22503VT, Ascii.SYN, 19, 36, Ascii.f22499SI, Ascii.f22500SO};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C6898ge c6898ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c6898ge);
        this.A06 = A05(c6898ge, this.A03, A03(c6898ge));
        A09(c6898ge, A00(c6898ge, this.A06));
        A0A(c6898ge, this.A06);
        A0B(c6898ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static InterfaceC6025SR A00(C6898ge c6898ge, InterfaceC5047CY interfaceC5047CY) {
        if (!C6171Up.A1r(c6898ge) || interfaceC5047CY == null) {
            return null;
        }
        return AbstractC6026SS.A00().A00(interfaceC5047CY);
    }

    public static InterfaceC6084TP A01(C6898ge c6898ge) {
        return AbstractC6085TQ.A00().A00(c6898ge, new C6600bp());
    }

    public static synchronized C6452ZR A02() {
        if (A07 == null) {
            A07 = new C6452ZR();
        }
        return A07;
    }

    public static InterfaceC6853fv A03(C6898ge c6898ge) {
        if (!C6171Up.A1n(c6898ge)) {
            return null;
        }
        return C6871gD.A01(c6898ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC5047CY A9F() {
        return this.A06;
    }

    public static InterfaceC5047CY A05(C6898ge c6898ge, InterfaceC6084TP interfaceC6084TP, InterfaceC6853fv interfaceC6853fv) {
        if (!C6171Up.A2m(c6898ge) || interfaceC6853fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC6894ga.A00().A00(c6898ge, interfaceC6084TP, interfaceC6853fv, AbstractC6260WI.A04(c6898ge), new C6457ZW(new C6252WA(c6898ge, A06(0, 0, 9), null, EnumC6232Vq.A08, 0, new C6236Vu(), AbstractC6356Xt.A01(C6171Up.A0N(c6898ge)), null, null, new C7023ij()), c6898ge), C6892gY.A00().A00());
    }

    public static void A08() {
        AbstractC6240Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C6898ge c6898ge, InterfaceC6025SR interfaceC6025SR) {
        if (!C6171Up.A1r(c6898ge) || interfaceC6025SR == null) {
            return;
        }
        AbstractC6023SP.A00().A00(interfaceC6025SR, c6898ge);
    }

    public static void A0A(C6898ge c6898ge, InterfaceC5047CY interfaceC5047CY) {
        if (!C6171Up.A0m(c6898ge) || interfaceC5047CY == null) {
            return;
        }
        new C6045Sm(c6898ge, interfaceC5047CY, new C6046Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C6898ge c6898ge, InterfaceC5047CY interfaceC5047CY) {
        if (interfaceC5047CY == null) {
            return;
        }
        AbstractC6175Ut.A00(c6898ge, interfaceC5047CY);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final InterfaceC6192VA A6n(C6898ge c6898ge) {
        return C6273WW.A01(c6898ge);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC6068T9 A74(C6067T8 c6067t8) {
        if (this.A02 == null) {
            this.A02 = new C6467Zg(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC6060T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C6903gj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC6084TP A7l(C6067T8 c6067t8) {
        if (this.A03 == null) {
            this.A03 = A01(c6067t8.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC6097Tc A7n(C6067T8 c6067t8) {
        return new C6796f0(c6067t8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC6070TB A7x(final C6067T8 c6067t8) {
        return new AbstractC6599bo(c6067t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC5074Cz.A09();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
            public final void ACP() {
                C6122U2.A06(C5987Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
            public final void ACn() {
                C6122U2.A07(C5987Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
            public final void ADI(C6898ge c6898ge) {
                AbstractC5779OP.A01(c6898ge);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC5628Lx A8C(C6067T8 c6067t8) {
        if (!C6171Up.A13(c6067t8)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC5629Ly.A00().A00(new C6563bE(c6067t8));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC6072TD A8y(C6067T8 c6067t8) {
        return new C6537ao(c6067t8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final C6898ge A8z(Context context) {
        C6898ge sdkContext = AbstractC6066T7.A00();
        if (sdkContext == null) {
            C6898ge sdkContext2 = new C6898ge(context, this);
            AbstractC6066T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized InterfaceC6204VM A90(C6898ge c6898ge) {
        if (this.A05 == null) {
            this.A05 = new C6326XP(c6898ge);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6069TA
    public final synchronized C6127U7 A96() {
        if (this.A04 == null) {
            this.A04 = new C6127U7();
            A08();
        }
        return this.A04;
    }
}
