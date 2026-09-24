package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47577Y extends AbstractC7024ik {
    public static final InterfaceC5773OJ A02 = new C7009iV();
    public C7017id A00;
    public final C7012iY A01;

    public C47577Y(C7012iY c7012iY, String str) {
        super(c7012iY.A05(), str, A02.A5T(c7012iY));
        this.A01 = c7012iY;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7024ik
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AJM(EnumC5767OD.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7024ik
    public final void A09() {
        this.A00 = new C7017id(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7024ik
    public final void A0D(boolean z) {
        this.A05.AJn(z);
    }

    public final void A0E(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A6U()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (AbstractC6174Us.A09(this.A02) && AbstractC6174Us.A0A(this.A02)) {
            if (AbstractC6174Us.A0M(str)) {
                A05();
                return;
            } else {
                A09();
                return;
            }
        }
        A09();
    }

    public final void A0F(RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(1013, AbstractC5788OY.A00(new Bundle(), rewardData));
        }
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && C6364Y1.A00() > this.A01.A00();
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6p() == EnumC5767OD.A05;
    }

    public final boolean A0I(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A6V()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        }
        if (this.A00 != null) {
            return this.A00.A0J();
        }
        this.A00 = new C7017id(this.A01, this, A04());
        this.A00.A0J();
        return false;
    }
}
