package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.AbstractC1819y1;
import com.applovin.impl.C1679p2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* JADX INFO: renamed from: a */
    private final Lifecycle f932a;

    /* JADX INFO: renamed from: b */
    private C1679p2 f933b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f934c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d */
    private AbstractC1819y1 f935d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, C1679p2 c1679p2) {
        this.f932a = lifecycle;
        this.f933b = c1679p2;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f932a.removeObserver(this);
        C1679p2 c1679p2 = this.f933b;
        if (c1679p2 != null) {
            c1679p2.m3861a();
            this.f933b = null;
        }
        AbstractC1819y1 abstractC1819y1 = this.f935d;
        if (abstractC1819y1 != null) {
            abstractC1819y1.mo2085a("lifecycle_on_destroy");
            this.f935d.mo2190r();
            this.f935d = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        AbstractC1819y1 abstractC1819y1 = this.f935d;
        if (abstractC1819y1 != null) {
            abstractC1819y1.mo2088s();
            this.f935d.mo2090v();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        AbstractC1819y1 abstractC1819y1;
        if (this.f934c.getAndSet(false) || (abstractC1819y1 = this.f935d) == null) {
            return;
        }
        abstractC1819y1.mo2089t();
        this.f935d.mo2185b(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        AbstractC1819y1 abstractC1819y1 = this.f935d;
        if (abstractC1819y1 != null) {
            abstractC1819y1.m5669u();
        }
    }

    public void setPresenter(AbstractC1819y1 abstractC1819y1) {
        this.f935d = abstractC1819y1;
    }
}
