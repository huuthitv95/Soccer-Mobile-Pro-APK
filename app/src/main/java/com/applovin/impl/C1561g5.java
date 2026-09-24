package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.applovin.impl.g5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1561g5 {

    /* JADX INFO: renamed from: a */
    private final WeakHashMap f1711a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    private final Object f1712b = new Object();

    /* JADX INFO: renamed from: c */
    private final Handler f1713c = new Handler();

    /* JADX INFO: renamed from: d */
    private boolean f1714d = false;

    /* JADX INFO: renamed from: e */
    private final WeakReference f1715e;

    /* JADX INFO: renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f1716f;

    /* JADX INFO: renamed from: g */
    private a f1717g;

    /* JADX INFO: renamed from: com.applovin.impl.g5$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2739a(int i, int i2);
    }

    public C1561g5(View view) {
        this.f1715e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f1716f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.g5$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f$0.m2732b();
            }
        };
        this.f1716f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: renamed from: a */
    private boolean m2731a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean m2732b() {
        m2734d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m2733c() {
        synchronized (this.f1712b) {
            this.f1714d = false;
            int iMin = -1;
            int iMax = -1;
            for (Map.Entry entry : this.f1711a.entrySet()) {
                if (m2731a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (iMin == -1 && iMax == -1) {
                        iMin = num.intValue();
                        iMax = num.intValue();
                    } else {
                        iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                        iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.f1717g;
            if (aVar != null) {
                aVar.mo2739a(iMin, iMax);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2734d() {
        if (this.f1714d) {
            return;
        }
        this.f1714d = true;
        this.f1713c.postDelayed(new Runnable() { // from class: com.applovin.impl.g5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2733c();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: a */
    public void m2735a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f1717g = null;
        View view = (View) this.f1715e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f1716f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f1715e.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2736a(View view, int i) {
        synchronized (this.f1712b) {
            this.f1711a.put(view, Integer.valueOf(i));
            m2734d();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2737a(a aVar) {
        this.f1717g = aVar;
    }

    /* JADX INFO: renamed from: b */
    public void m2738b(View view) {
        synchronized (this.f1712b) {
            this.f1711a.remove(view);
        }
    }
}
