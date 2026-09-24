package com.facebook.ads;

/* JADX INFO: loaded from: classes3.dex */
public interface AdListener {
    void onAdClicked(InterfaceC4297Ad interfaceC4297Ad);

    void onAdLoaded(InterfaceC4297Ad interfaceC4297Ad);

    void onError(InterfaceC4297Ad interfaceC4297Ad, AdError adError);

    void onLoggingImpression(InterfaceC4297Ad interfaceC4297Ad);
}
