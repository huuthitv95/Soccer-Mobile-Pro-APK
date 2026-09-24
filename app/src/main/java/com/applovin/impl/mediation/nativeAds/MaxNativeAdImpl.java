package com.applovin.impl.mediation.nativeAds;

import android.view.View;
import com.applovin.impl.mediation.ads.C1645b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdImpl {
    private C1645b adViewTracker;
    private List<View> clickableViews;

    public C1645b getAdViewTracker() {
        return this.adViewTracker;
    }

    public List<View> getClickableViews() {
        return this.clickableViews;
    }

    public void setAdViewTracker(C1645b c1645b) {
        this.adViewTracker = c1645b;
    }

    public void setClickableViews(List<View> list) {
        this.clickableViews = list;
    }
}
