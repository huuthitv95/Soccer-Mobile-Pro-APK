package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.C1549f3;
import com.applovin.impl.C1820y2;
import com.applovin.impl.C1829z2;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdPlacer implements C1829z2.a {

    /* JADX INFO: renamed from: a */
    private AppLovinSdkUtils.Size f4182a;

    /* JADX INFO: renamed from: b */
    private MaxNativeAdViewBinder f4183b;

    /* JADX INFO: renamed from: c */
    private final C1820y2 f4184c;

    /* JADX INFO: renamed from: d */
    private final C1829z2 f4185d;

    /* JADX INFO: renamed from: e */
    private Listener f4186e;
    protected final C1768p logger;
    protected final C1748l sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, C1748l.m4756p());
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f4182a = AppLovinSdkUtils.Size.ZERO;
        C1748l c1748lM5807a = appLovinSdk.m5807a();
        this.sdk = c1748lM5807a;
        C1768p c1768pM4782Q = c1748lM5807a.m4782Q();
        this.logger = c1768pM4782Q;
        this.f4184c = new C1820y2(maxAdPlacerSettings);
        this.f4185d = new C1829z2(maxAdPlacerSettings, context, this);
        if (C1768p.m5160a()) {
            c1768pM4782Q.m5171a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5796a() {
        int iM5684c;
        while (this.f4185d.m5745d() && (iM5684c = this.f4184c.m5684c()) != -1) {
            if (C1768p.m5160a()) {
                this.logger.m5171a("MaxAdPlacer", "Placing ad at position: " + iM5684c);
            }
            this.f4184c.m5679a(this.f4185d.m5743b(), iM5684c);
            Listener listener = this.f4186e;
            if (listener != null) {
                listener.onAdLoaded(iM5684c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5797a(int i) {
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Removing item at position: " + i);
        }
        this.f4184c.m5692i(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5798a(int i, Collection collection) {
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Clearing trailing ads after position " + i);
        }
        this.f4184c.m5680a(collection);
    }

    /* JADX INFO: renamed from: a */
    private void m5799a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f4185d.m5741a(this.f4184c.m5677a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f4186e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f4186e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m5800b() {
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f4184c.m5678a();
        this.f4185d.m5740a();
    }

    public void clearAds() {
        m5799a(this.f4184c.m5682b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5800b();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i) {
        final Collection<Integer> collectionM5688e = this.f4184c.m5688e(i);
        if (!collectionM5688e.isEmpty()) {
            m5799a(collectionM5688e, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m5798a(i, collectionM5688e);
                }
            });
        }
        return collectionM5688e;
    }

    public void destroy() {
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f4185d.m5744c();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return -System.identityHashCode(this.f4184c.m5677a(i));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i) {
        if (isFilledPosition(i)) {
            boolean z = this.f4182a != AppLovinSdkUtils.Size.ZERO;
            C1549f3 c1549f3 = (C1549f3) this.f4184c.m5677a(i);
            if (z) {
                return this.f4182a;
            }
            if (c1549f3.m2576v0() != null) {
                View mainView = c1549f3.m2576v0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.f4184c.m5681b(i);
    }

    public int getAdjustedPosition(int i) {
        return this.f4184c.m5685c(i);
    }

    public int getOriginalPosition(int i) {
        return this.f4184c.m5687d(i);
    }

    public void insertItem(int i) {
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.f4184c.m5689f(i);
    }

    public boolean isAdPosition(int i) {
        return this.f4184c.m5690g(i);
    }

    public boolean isFilledPosition(int i) {
        return this.f4184c.m5691h(i);
    }

    public void loadAds() {
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Loading ads");
        }
        this.f4185d.m5746e();
    }

    public void moveItem(int i, int i2) {
        this.f4184c.m5683b(i, i2);
    }

    @Override // com.applovin.impl.C1829z2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f4186e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.C1829z2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f4186e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.C1829z2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (C1768p.m5160a()) {
            this.logger.m5174b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.C1829z2.a
    public void onNativeAdLoaded() {
        if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Native ad enqueued");
        }
        m5796a();
    }

    public void removeItem(final int i) {
        m5799a(isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.EMPTY_LIST, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5797a(i);
            }
        });
    }

    public void renderAd(int i, ViewGroup viewGroup) {
        MaxAd maxAdM5677a = this.f4184c.m5677a(i);
        if (maxAdM5677a == null) {
            if (C1768p.m5160a()) {
                this.logger.m5171a("MaxAdPlacer", "An ad is not available for position: " + i);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewM2576v0 = ((C1549f3) maxAdM5677a).m2576v0();
        if (maxNativeAdViewM2576v0 == null) {
            if (this.f4183b == null) {
                if (C1768p.m5160a()) {
                    this.logger.m5174b("MaxAdPlacer", "Unable to render ad at position: " + i + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewM2576v0 = new MaxNativeAdView(this.f4183b, viewGroup.getContext());
            if (this.f4185d.m5742a(maxNativeAdViewM2576v0, maxAdM5677a)) {
                if (C1768p.m5160a()) {
                    this.logger.m5171a("MaxAdPlacer", "Rendered ad at position: " + i);
                }
            } else if (C1768p.m5160a()) {
                this.logger.m5174b("MaxAdPlacer", "Unable to render ad at position: " + i);
            }
        } else if (C1768p.m5160a()) {
            this.logger.m5171a("MaxAdPlacer", "Using pre-rendered ad at position: " + i);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewM2576v0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewM2576v0.getParent()).removeView(maxNativeAdViewM2576v0);
        }
        viewGroup.addView(maxNativeAdViewM2576v0, -1, -1);
    }

    public void setAdSize(int i, int i2) {
        this.f4182a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(Listener listener) {
        this.f4186e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f4183b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.f4184c.m5686c(i, i2);
        if (i == -1 || i2 == -1) {
            return;
        }
        m5796a();
    }
}
