package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.applovin.impl.i8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1584i8 {

    /* JADX INFO: renamed from: a */
    private final C1768p f1845a;

    /* JADX INFO: renamed from: e */
    private final Runnable f1849e;

    /* JADX INFO: renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f1850f;

    /* JADX INFO: renamed from: g */
    private final WeakReference f1851g;

    /* JADX INFO: renamed from: h */
    private final long f1852h;

    /* JADX INFO: renamed from: k */
    private int f1855k;

    /* JADX INFO: renamed from: l */
    private float f1856l;

    /* JADX INFO: renamed from: m */
    private float f1857m;

    /* JADX INFO: renamed from: n */
    private long f1858n;

    /* JADX INFO: renamed from: b */
    private final Object f1846b = new Object();

    /* JADX INFO: renamed from: c */
    private final Rect f1847c = new Rect();

    /* JADX INFO: renamed from: i */
    private WeakReference f1853i = new WeakReference(null);

    /* JADX INFO: renamed from: j */
    private WeakReference f1854j = new WeakReference(null);

    /* JADX INFO: renamed from: o */
    private long f1859o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    private final Handler f1848d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.applovin.impl.i8$a */
    public interface a {
        void onLogVisibilityImpression();
    }

    public C1584i8(final View view, C1748l c1748l, a aVar) {
        this.f1845a = c1748l.m4782Q();
        this.f1852h = ((Long) c1748l.m4801a(C1831z4.f3672A1)).longValue();
        this.f1851g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f1849e = new Runnable() { // from class: com.applovin.impl.i8$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2931a(weakReference);
            }
        };
        this.f1850f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.i8$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f$0.m2932a(view);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private void m2930a() {
        this.f1848d.postDelayed(this.f1849e, this.f1852h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2931a(WeakReference weakReference) {
        View view = (View) this.f1851g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f1854j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!m2933a(viewGroup, view2)) {
            m2930a();
            return;
        }
        if (C1768p.m5160a()) {
            this.f1845a.m5171a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        m2939b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m2932a(View view) {
        m2930a();
        m2934b(view);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2933a(View view, View view2) {
        if (m2935b(view, view2)) {
            if (this.f1859o == Long.MIN_VALUE) {
                this.f1859o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f1859o >= this.f1858n) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m2934b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f1853i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f1850f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f1850f);
            } else if (C1768p.m5160a()) {
                this.f1845a.m5171a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (C1768p.m5160a()) {
            this.f1845a.m5171a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f1853i.clear();
    }

    /* JADX INFO: renamed from: b */
    private boolean m2935b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f1847c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f1847c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f1847c.height());
        if (jPxToDp < this.f1855k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f1856l) {
            return false;
        }
        return (((float) ((long) (this.f1847c.width() * this.f1847c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f1857m;
    }

    /* JADX INFO: renamed from: c */
    private void m2936c(View view) {
        View viewM2760b = AbstractC1564g8.m2760b((View) this.f1851g.get());
        if (viewM2760b == null) {
            viewM2760b = AbstractC1564g8.m2760b(view);
        }
        if (viewM2760b == null) {
            if (C1768p.m5160a()) {
                this.f1845a.m5171a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewM2760b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f1853i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f1850f);
        } else if (C1768p.m5160a()) {
            this.f1845a.m5178k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2937a(int i, float f, float f2, long j, View view) {
        synchronized (this.f1846b) {
            if (C1768p.m5160a()) {
                this.f1845a.m5171a("VisibilityTracker", "Tracking visibility for " + view);
            }
            m2939b();
            WeakReference weakReference = new WeakReference(view);
            this.f1854j = weakReference;
            this.f1855k = i;
            this.f1856l = f;
            this.f1857m = f2;
            this.f1858n = j;
            m2936c((View) weakReference.get());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2938a(AbstractC1589j3 abstractC1589j3) {
        View viewM2576v0;
        if (abstractC1589j3 instanceof C1529d3) {
            viewM2576v0 = abstractC1589j3.m1865z();
        } else if (!(abstractC1589j3 instanceof C1549f3)) {
            return;
        } else {
            viewM2576v0 = ((C1549f3) abstractC1589j3).m2576v0();
        }
        m2937a(abstractC1589j3.m2980n0(), abstractC1589j3.m2982p0(), abstractC1589j3.m2983q0(), abstractC1589j3.m2984r0(), viewM2576v0);
    }

    /* JADX INFO: renamed from: b */
    public void m2939b() {
        synchronized (this.f1846b) {
            this.f1848d.removeMessages(0);
            m2934b((View) this.f1851g.get());
            this.f1859o = Long.MIN_VALUE;
            this.f1854j.clear();
        }
    }
}
