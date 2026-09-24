package com.facebook.ads.redexgen.core;

import com.facebook.ads.RewardedVideoAd;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ib */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7015ib extends AbstractC5694N2 {
    public static byte[] A01;
    public final /* synthetic */ C7013iZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, Ascii.CAN, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C7015ib(C7013iZ c7013iZ) {
        this.A00 = c7013iZ;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A06() {
        this.A00.A07.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A07() {
        this.A00.A07.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A08() {
        if (this.A00.A02 == null) {
            this.A00.A07.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A09() {
        if (this.A00.A02 == null) {
            this.A00.A07.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0A() {
        if (this.A00.A02 != null) {
            C6017SJ c6017sj = (C6017SJ) this.A00.A02.buildShowAdConfig();
            c6017sj.A02(System.currentTimeMillis() - this.A00.A01);
            this.A00.A02.show(c6017sj.build());
            return;
        }
        this.A00.A07.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0C() {
        this.A00.A06.A0F().A3K();
        this.A00.A07.onAdClicked(this.A00.A08.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0F(InterfaceC5693N1 interfaceC5693N1) {
        if (this.A00.A04 == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), AbstractC6098Td.A0N, new C6099Te(A00(3, 18, 108)));
            return;
        }
        AbstractC7081jh abstractC7081jh = (AbstractC7081jh) interfaceC5693N1;
        if (this.A00.A08.A03 != null) {
            abstractC7081jh.A02(this.A00.A08.A03);
        }
        this.A00.A08.A00 = abstractC7081jh.A0H();
        this.A00.A05 = true;
        this.A00.A03 = this.A00.A04.A0I();
        if (this.A00.A03 != null) {
            int iA26 = 0;
            if (!this.A00.A03.A1b()) {
                iA26 = ((AbstractC7077jd) this.A00.A03).A26();
            }
            if (iA26 > 0) {
                C6313XC c6313xc = new C6313XC();
                if (c6313xc.A09(this.A00.A06, this.A00.A08.A06, iA26)) {
                    c6313xc.A08(this.A00.A06, true);
                    this.A00.A02 = c6313xc.A07(this.A00.A06, this.A00.A08.A0D, this.A00.A08.A06);
                } else {
                    c6313xc.A08(this.A00.A06, false);
                }
            }
        }
        if (this.A00.A02 != null) {
            ((AbstractC7077jd) this.A00.A03).A2J(true);
            RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A02.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A03.A0s()).withAdExperience(this.A00.A08.A02).withAdListener(new C5772OI(this)).build();
            this.A00.A02.loadAd(loadAdConfig);
            return;
        }
        this.A00.A07.onAdLoaded(this.A00.A08.A6k());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5694N2
    public final void A0G(C6229Vm c6229Vm) {
        this.A00.A0D(true);
        this.A00.A08.A0B.A0F().A3N(C6364Y1.A01(this.A00.A00), c6229Vm.A03().getErrorCode(), c6229Vm.A04());
        this.A00.A07.onError(this.A00.A08.A6k(), AbstractC6315XE.A00(c6229Vm));
    }
}
