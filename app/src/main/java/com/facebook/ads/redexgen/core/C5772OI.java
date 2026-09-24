package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC4297Ad;
import com.facebook.ads.RewardedVideoAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5772OI implements RewardedVideoAdListener {
    public final /* synthetic */ C7015ib A00;

    public C5772OI(C7015ib c7015ib) {
        this.A00 = c7015ib;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC4297Ad interfaceC4297Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC4297Ad interfaceC4297Ad) {
        this.A00.A00.A07.onAdLoaded(this.A00.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC4297Ad interfaceC4297Ad, AdError adError) {
        this.A00.A00.A02 = null;
        ((AbstractC7077jd) this.A00.A00.A03).A2J(false);
        this.A00.A00.A07.onAdLoaded(this.A00.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC4297Ad interfaceC4297Ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.A00.A07.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.A00.A07.onRewardedVideoCompleted();
    }
}
