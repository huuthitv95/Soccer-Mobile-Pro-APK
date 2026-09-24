package com.facebook.ads;

/* JADX INFO: loaded from: classes3.dex */
public interface FullScreenAd extends InterfaceC4297Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    InterfaceC4297Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
