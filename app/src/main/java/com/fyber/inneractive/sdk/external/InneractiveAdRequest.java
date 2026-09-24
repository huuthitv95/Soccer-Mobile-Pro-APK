package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.flow.AbstractC8223v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveAdRequest extends AbstractC8223v0 {
    public static final double FLOOR_PRICE_MAX_VALUE = 400000.0d;
    public static final double FLOOR_PRICE_MIN_VALUE = 0.0d;

    /* JADX INFO: renamed from: c */
    public final String f17914c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8041s0 f17915d;

    /* JADX INFO: renamed from: e */
    public Double f17916e;

    public InneractiveAdRequest(String str) {
        this.f17914c = str;
    }

    public Double getFloorPrice() {
        return this.f17916e;
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public InterfaceC8041s0 getSelectedUnitConfig() {
        return this.f17915d;
    }

    public String getSpotId() {
        return this.f17914c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    public void setFloorPrice(double d) {
        boolean zIsNaN = Double.isNaN(d);
        double dMax = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (!zIsNaN) {
            dMax = Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(d, 400000.0d));
        }
        if (dMax != d) {
            IAlog.m21950f("Invalid floor price: %.2f — adjusted to %.2f.", Double.valueOf(d), Double.valueOf(dMax));
        }
        this.f17916e = Double.valueOf(dMax);
    }

    @Deprecated
    public void setMuteVideo(boolean z) {
        InneractiveAdManager.setMuteVideo(z);
    }

    public void setSelectedUnitConfig(InterfaceC8041s0 interfaceC8041s0) {
        this.f17915d = interfaceC8041s0;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
