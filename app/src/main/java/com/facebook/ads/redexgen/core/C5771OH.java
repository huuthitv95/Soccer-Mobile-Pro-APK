package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC4297Ad;
import com.facebook.ads.InterstitialAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5771OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC7077jd A00;
    public final /* synthetic */ C7019if A01;

    public C5771OH(C7019if c7019if, AbstractC7077jd abstractC7077jd) {
        this.A01 = c7019if;
        this.A00 = abstractC7077jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC4297Ad interfaceC4297Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC4297Ad interfaceC4297Ad) {
        this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC4297Ad interfaceC4297Ad, AdError adError) {
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(InterfaceC4297Ad interfaceC4297Ad) {
        this.A01.A00.A04 = false;
        if (this.A01.A00.A03 != null) {
            this.A01.A00.A03.A0S(new C7021ih(this));
            this.A01.A00.A03.A0N();
            this.A01.A00.A03.A0K();
            this.A01.A00.A03 = null;
        }
        this.A01.A00.A07.onInterstitialDismissed(this.A01.A00.A08.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(InterfaceC4297Ad interfaceC4297Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC4297Ad interfaceC4297Ad) {
    }
}
