package com.facebook.ads;

/* JADX INFO: renamed from: com.facebook.ads.Ad */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4297Ad {

    /* JADX INFO: renamed from: com.facebook.ads.Ad$LoadAdConfig */
    public interface LoadAdConfig {
    }

    /* JADX INFO: renamed from: com.facebook.ads.Ad$LoadConfigBuilder */
    public interface LoadConfigBuilder {
        LoadAdConfig build();

        LoadConfigBuilder withBid(String str);
    }

    void destroy();

    String getPlacementId();

    boolean isAdInvalidated();

    void loadAd();

    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
