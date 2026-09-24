package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.applovin.impl.z2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1829z2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a */
    private final int f3662a;

    /* JADX INFO: renamed from: b */
    private final MaxNativeAdLoader f3663b;

    /* JADX INFO: renamed from: c */
    private final Queue f3664c = new LinkedList();

    /* JADX INFO: renamed from: d */
    private boolean f3665d = false;

    /* JADX INFO: renamed from: e */
    private final Object f3666e = new Object();

    /* JADX INFO: renamed from: f */
    private a f3667f;

    /* JADX INFO: renamed from: com.applovin.impl.z2$a */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public C1829z2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f3662a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f3667f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f3663b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, EnumC1575i.NATIVE_AD_PLACER);
    }

    /* JADX INFO: renamed from: a */
    public void m5740a() {
        synchronized (this.f3666e) {
            Iterator it = this.f3664c.iterator();
            while (it.hasNext()) {
                m5741a((MaxAd) it.next());
            }
            this.f3664c.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5741a(MaxAd maxAd) {
        this.f3663b.destroy(maxAd);
    }

    /* JADX INFO: renamed from: a */
    public boolean m5742a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f3663b.render(maxNativeAdView, maxAd);
    }

    /* JADX INFO: renamed from: b */
    public MaxAd m5743b() {
        MaxAd maxAd;
        synchronized (this.f3666e) {
            maxAd = null;
            while (!this.f3664c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.f3664c.remove();
            }
            m5746e();
        }
        return maxAd;
    }

    /* JADX INFO: renamed from: c */
    public void m5744c() {
        this.f3667f = null;
        m5740a();
        this.f3663b.destroy();
    }

    /* JADX INFO: renamed from: d */
    public boolean m5745d() {
        boolean z;
        synchronized (this.f3666e) {
            z = !this.f3664c.isEmpty();
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public void m5746e() {
        synchronized (this.f3666e) {
            if (!this.f3665d && this.f3664c.size() < this.f3662a) {
                this.f3665d = true;
                this.f3663b.loadAd();
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f3667f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f3667f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f3667f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f3666e) {
            this.f3664c.add(maxAd);
            this.f3665d = false;
            m5746e();
        }
        a aVar = this.f3667f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
