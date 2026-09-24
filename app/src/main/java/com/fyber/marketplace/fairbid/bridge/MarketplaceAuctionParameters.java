package com.fyber.marketplace.fairbid.bridge;

import com.fyber.inneractive.sdk.config.global.C8006r;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface MarketplaceAuctionParameters {
    String getAdvertisingId();

    String getAmazonAdvertisingId();

    String getAppVersion();

    String getBundleId();

    String getCarrier();

    String getDeviceModel();

    C8006r getFeatureProvider(String str);

    int getHeight();

    @Deprecated
    String getHorizontalAccuracy();

    List<String> getInputLanguages();

    String getLanguage();

    @Deprecated
    String getLatitudeLongitude();

    JSONObject getMarketplaceEntry();

    String getMobileCountryCode();

    String getMobileNetworkCode();

    String getNetwork();

    List<Integer> getSupportedApis();

    List<Integer> getSupportedProtocols();

    int getSupportedTypesBitwise();

    @Deprecated
    String getTimeAccuracy();

    @Deprecated
    String getVerticalAccuracy();

    int getWidth();

    boolean hasAmazonAdvertisingId();

    Boolean isLimitTrackingEnabled();
}
