package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ow */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7389ow implements InterfaceC473178 {
    public static byte[] A07;
    public static String[] A08 = {"yII62Bxz4ePSH41vB2jdKSugEbZVWw1P", "xxJts2URfaqafakNk2KbG7F81xmmDazV", "4dv2SznKWSxWwafbIX2ls1ujl8jSHd2n", "ZTUBGrXVNXomnx09AH", "GEOoy7FoThRACcjBmfZ1TUIlEpKlWtQ8", "rZtP7yRh3duuKSKGXoPyzbqapeA3agH5", "0fM4GZ86zQsT7VByU2LW0lXLtFUbu0NT", "1qHBrVxL1wzL98lt8KL7QvczAsaDn4yk"};
    public InterfaceC473178 A00;
    public InterfaceC7381oo A01;
    public boolean A04;
    public final InterfaceC46866P A05;
    public final C7377ok A06;
    public boolean A03 = true;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public boolean A02 = MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A1h);

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{86, 110, 119, 111, 114, 107, 119, 126, 59, 105, 126, 117, 127, 126, 105, 126, 105, 59, 118, 126, 127, 114, 122, 59, 120, 119, 116, 120, 112, 104, 59, 126, 117, 122, 121, 119, 126, 127, 53};
    }

    static {
        A01();
    }

    public C7389ow(InterfaceC46866P interfaceC46866P, InterfaceC454245 interfaceC454245) {
        this.A05 = interfaceC46866P;
        this.A06 = new C7377ok(interfaceC454245);
    }

    private void A02(boolean z) {
        if (A03(z)) {
            this.A03 = true;
            if (this.A04) {
                this.A06.A00();
                return;
            }
            return;
        }
        InterfaceC473178 interfaceC473178 = (InterfaceC473178) AbstractC45353y.A01(this.A00);
        long jA8p = interfaceC473178.A8p();
        if (this.A03) {
            InterfaceC473178 rendererClock = this.A06;
            long rendererClockPositionUs = rendererClock.A8p();
            if (jA8p < rendererClockPositionUs) {
                this.A06.A01();
                return;
            }
            this.A03 = false;
            if (this.A04) {
                C7377ok c7377ok = this.A06;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "DdBgGw0WSHdH6u";
                c7377ok.A00();
            }
        }
        this.A06.A02(jA8p);
        C7451px c7451pxA8m = interfaceC473178.A8m();
        InterfaceC473178 rendererClock2 = this.A06;
        if (!c7451pxA8m.equals(rendererClock2.A8m())) {
            InterfaceC473178 rendererClock3 = this.A06;
            rendererClock3.AJd(c7451pxA8m);
            this.A05.AFI(c7451pxA8m);
        }
    }

    private boolean A03(boolean z) {
        if (this.A01 != null) {
            InterfaceC7381oo interfaceC7381oo = this.A01;
            String[] strArr = A08;
            if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "259perxNRfR5uYao2q6cSAfIVJfeeK6N";
            strArr2[7] = "EI3wTVxb9Zi5034aB38J7XgUXur7uJJK";
            if (!interfaceC7381oo.AAP()) {
                if (!this.A01.AAe()) {
                    if (!z) {
                        boolean zA9p = this.A01.A9p();
                        String[] strArr3 = A08;
                        if (strArr3[4].charAt(0) != strArr3[5].charAt(0)) {
                            A08[3] = "UNE8e4mByuhRiLOUb8sZtJ";
                            if (zA9p) {
                            }
                        } else if (zA9p) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final long A04(boolean z) {
        A02(z);
        return A8p();
    }

    public final void A05() {
        this.A04 = true;
        this.A06.A00();
    }

    public final void A06() {
        this.A04 = false;
        this.A06.A01();
    }

    public final void A07(long j) {
        this.A06.A02(j);
    }

    public final void A08(InterfaceC7381oo interfaceC7381oo) {
        if (interfaceC7381oo == this.A01) {
            this.A00 = null;
            this.A01 = null;
            this.A03 = true;
        }
    }

    public final void A09(InterfaceC7381oo interfaceC7381oo) throws C4904AD {
        InterfaceC473178 interfaceC473178A8T = interfaceC7381oo.A8T();
        if (interfaceC473178A8T != null) {
            InterfaceC473178 rendererMediaClock = this.A00;
            if (interfaceC473178A8T != rendererMediaClock) {
                InterfaceC473178 interfaceC473178 = this.A00;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "dGOISEf";
                if (interfaceC473178 == null) {
                    this.A00 = interfaceC473178A8T;
                    this.A01 = interfaceC7381oo;
                    InterfaceC473178 interfaceC473179 = this.A00;
                    InterfaceC473178 rendererMediaClock2 = this.A06;
                    interfaceC473179.AJd(rendererMediaClock2.A8m());
                    return;
                }
                throw C4904AD.A02(new IllegalStateException(A00(0, 39, 8)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC473178
    public final C7451px A8m() {
        if (this.A00 != null) {
            return this.A00.A8m();
        }
        return this.A06.A8m();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC473178
    public final long A8p() {
        if (this.A03) {
            return this.A06.A8p();
        }
        return ((InterfaceC473178) AbstractC45353y.A01(this.A00)).A8p();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC473178
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public final void AJd(C7451px c7451px) {
        if (this.A00 != null) {
            this.A00.AJd(c7451px);
            c7451px = this.A00.A8m();
        }
        this.A06.AJd(c7451px);
        if (this.A02) {
            this.A05.AFI(c7451px);
        }
    }
}
