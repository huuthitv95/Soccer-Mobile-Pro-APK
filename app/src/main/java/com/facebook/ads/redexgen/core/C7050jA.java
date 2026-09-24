package com.facebook.ads.redexgen.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7050jA implements InterfaceC6048Sp {
    public final C5742No A00;
    public final InterfaceC5757O3 A01;
    public final C6056Sx A02;
    public final C6902gi A03;
    public final boolean A04;

    public C7050jA(C6902gi c6902gi, InterfaceC5757O3 interfaceC5757O3, C6056Sx c6056Sx, C5742No c5742No, boolean z) {
        this.A03 = c6902gi;
        this.A01 = interfaceC5757O3;
        this.A02 = c6056Sx;
        this.A00 = c5742No;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        C5758O4 playableWebViewClient = new C5758O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z) {
        if (this.A00.A0G() == EnumC5743Np.A05) {
            A00();
            return;
        }
        String strA0L = this.A00.A0L();
        if (z) {
            C6056Sx c6056Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            strA0L = c6056Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(strA0L);
        this.A01.AFG();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6048Sp
    public final void ADT() {
        A01(true);
    }
}
