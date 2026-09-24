package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.applovin.impl.j0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1586j0 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1865a;

    /* JADX INFO: renamed from: b */
    private final C1768p f1866b;

    /* JADX INFO: renamed from: c */
    private final long f1867c;

    /* JADX INFO: renamed from: d */
    private final long f1868d;

    /* JADX INFO: renamed from: e */
    private final int f1869e;

    /* JADX INFO: renamed from: f */
    private final int f1870f;

    /* JADX INFO: renamed from: g */
    private final int f1871g;

    /* JADX INFO: renamed from: h */
    private final int f1872h;

    /* JADX INFO: renamed from: i */
    private final int f1873i;

    /* JADX INFO: renamed from: k */
    private int f1875k;

    /* JADX INFO: renamed from: l */
    private int f1876l;

    /* JADX INFO: renamed from: m */
    private Integer f1877m;

    /* JADX INFO: renamed from: n */
    private volatile boolean f1878n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f1879o;

    /* JADX INFO: renamed from: p */
    private Handler f1880p;

    /* JADX INFO: renamed from: q */
    private HandlerThread f1881q;

    /* JADX INFO: renamed from: s */
    private c f1883s;

    /* JADX INFO: renamed from: j */
    private WeakReference f1874j = new WeakReference(null);

    /* JADX INFO: renamed from: r */
    private final Runnable f1882r = new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m2951a();
        }
    };

    /* JADX INFO: renamed from: com.applovin.impl.j0$a */
    class a implements d {
        a() {
        }

        @Override // com.applovin.impl.C1586j0.d
        /* JADX INFO: renamed from: a */
        public void mo2974a(Bitmap bitmap) {
            try {
                C1586j0.m2949a(C1586j0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = width / C1586j0.this.f1871g;
                int i2 = height / C1586j0.this.f1871g;
                int i3 = i / 2;
                for (int i4 = i2 / 2; i4 < height; i4 += i2) {
                    for (int i5 = i3; i5 < width; i5 += i) {
                        int pixel = bitmap.getPixel(i5, i4);
                        if (C1586j0.this.m2953a(pixel)) {
                            bitmap.recycle();
                            C1586j0.this.m2970j();
                            C1586j0.this.m2965g();
                            return;
                        }
                        if (C1586j0.this.f1877m == null) {
                            C1586j0.this.f1877m = Integer.valueOf(pixel);
                        }
                    }
                }
                C1586j0.m2962f(C1586j0.this);
                bitmap.recycle();
                C1586j0.this.m2965g();
            } catch (Exception e) {
                C1586j0.this.f1865a.m4764E().m4329a("BlackViewDetector", "onScreenshotCaptured", e);
                C1586j0.this.m2971k();
            }
        }

        @Override // com.applovin.impl.C1586j0.d
        /* JADX INFO: renamed from: a */
        public void mo2975a(boolean z) {
            if (z) {
                C1586j0.this.m2971k();
            } else {
                C1586j0.this.m2965g();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.j0$b */
    class b implements PixelCopy$OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ d f1885a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Bitmap f1886b;

        b(d dVar, Bitmap bitmap) {
            this.f1885a = dVar;
            this.f1886b = bitmap;
        }

        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.f1885a.mo2974a(this.f1886b);
                return;
            }
            C1768p unused = C1586j0.this.f1866b;
            if (C1768p.m5160a()) {
                C1586j0.this.f1866b.m5174b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
            }
            this.f1885a.mo2975a(true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.j0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2976a(int i, int i2);

        /* JADX INFO: renamed from: a */
        void mo2977a(int i, int i2, int i3);
    }

    /* JADX INFO: renamed from: com.applovin.impl.j0$d */
    private interface d {
        /* JADX INFO: renamed from: a */
        void mo2974a(Bitmap bitmap);

        /* JADX INFO: renamed from: a */
        void mo2975a(boolean z);
    }

    public C1586j0(C1748l c1748l) {
        this.f1865a = c1748l;
        this.f1866b = c1748l.m4782Q();
        this.f1867c = ((Long) c1748l.m4801a(C1831z4.f4000n6)).longValue();
        this.f1868d = ((Long) c1748l.m4801a(C1831z4.f3991m6)).longValue();
        this.f1871g = ((Integer) c1748l.m4801a(C1831z4.f4009o6)).intValue();
        this.f1872h = ((Integer) c1748l.m4801a(C1831z4.f4017p6)).intValue();
        this.f1873i = ((Integer) c1748l.m4801a(C1831z4.f4025q6)).intValue();
        this.f1869e = ((Integer) c1748l.m4801a(C1831z4.f4073w6)).intValue();
        this.f1870f = ((Integer) c1748l.m4801a(C1831z4.f4081x6)).intValue();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m2949a(C1586j0 c1586j0) {
        int i = c1586j0.f1876l;
        c1586j0.f1876l = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m2951a() {
        ActivityManager.MemoryInfo memoryInfoM4022a;
        View view = (View) this.f1874j.get();
        if (view == null) {
            if (C1768p.m5160a()) {
                this.f1866b.m5178k("BlackViewDetector", "Monitored view no longer exists.");
            }
            m2971k();
            return;
        }
        Long l = (Long) this.f1865a.m4801a(C1831z4.f4057u6);
        if (l.longValue() > 0 && (memoryInfoM4022a = AbstractC1701q7.m4022a((ActivityManager) C1748l.m4756p().getSystemService("activity"))) != null && memoryInfoM4022a.availMem < l.longValue()) {
            if (C1768p.m5160a()) {
                this.f1866b.m5178k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f1865a.m4846o0().isApplicationPaused()) {
            if (C1768p.m5160a()) {
                this.f1866b.m5171a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            m2970j();
            m2965g();
            return;
        }
        if (C1768p.m5160a()) {
            this.f1866b.m5171a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            m2952a(view, new a());
            return;
        }
        if (C1768p.m5160a()) {
            this.f1866b.m5178k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        m2970j();
        m2965g();
    }

    /* JADX INFO: renamed from: a */
    private void m2952a(View view, d dVar) {
        if (!AbstractC1677p0.m3811e()) {
            if (C1768p.m5160a()) {
                this.f1866b.m5178k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
            }
            dVar.mo2975a(true);
            return;
        }
        Activity activityM2143a = this.f1865a.m4826e().m2143a();
        if (activityM2143a == null) {
            if (C1768p.m5160a()) {
                this.f1866b.m5174b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
            }
            dVar.mo2975a(false);
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, i + measuredWidth, i2 + measuredHeight);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            PixelCopy.request(activityM2143a.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1866b.m5174b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
            }
            dVar.mo2975a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX INFO: renamed from: a */
    public boolean m2953a(int i) {
        boolean z;
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        Integer num = this.f1877m;
        if (num != null) {
            int iRed2 = Color.red(num.intValue());
            int iGreen2 = Color.green(this.f1877m.intValue());
            int iBlue2 = Color.blue(this.f1877m.intValue());
            if (Math.abs(iRed - iRed2) > this.f1873i || Math.abs(iGreen - iGreen2) > this.f1873i || Math.abs(iBlue - iBlue2) > this.f1873i) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i2 = this.f1872h;
        return iRed > i2 || iGreen > i2 || iBlue > i2 || z;
    }

    /* JADX INFO: renamed from: c */
    private void m2956c() {
        if (this.f1875k >= this.f1870f && !this.f1879o) {
            this.f1879o = true;
            m2966h();
        }
        if (this.f1875k < this.f1869e || this.f1878n) {
            return;
        }
        this.f1878n = true;
        m2969i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m2958d() {
        c cVar = this.f1883s;
        if (cVar != null) {
            cVar.mo2977a(this.f1869e, this.f1875k, this.f1876l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m2961e() {
        c cVar = this.f1883s;
        if (cVar != null) {
            cVar.mo2976a(this.f1875k, this.f1876l);
        }
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ int m2962f(C1586j0 c1586j0) {
        int i = c1586j0.f1875k;
        c1586j0.f1875k = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m2963f() {
        this.f1883s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m2965g() {
        if (this.f1867c <= 0) {
            if (this.f1875k == 1) {
                if (!this.f1879o) {
                    this.f1879o = true;
                    m2966h();
                }
                if (!this.f1878n) {
                    this.f1878n = true;
                    m2969i();
                }
            }
            m2971k();
            return;
        }
        m2956c();
        if (this.f1880p == null) {
            if (C1768p.m5160a()) {
                this.f1866b.m5178k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            m2971k();
        } else if (this.f1878n && this.f1879o) {
            m2971k();
        } else {
            this.f1880p.postDelayed(this.f1882r, this.f1867c);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m2966h() {
        View view = (View) this.f1874j.get();
        if (C1768p.m5160a()) {
            this.f1866b.m5178k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2958d();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    private void m2969i() {
        View view = (View) this.f1874j.get();
        if (C1768p.m5160a()) {
            this.f1866b.m5178k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2961e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m2970j() {
        this.f1875k = 0;
        this.f1877m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m2971k() {
        if (this.f1874j.get() != null) {
            if (C1768p.m5160a()) {
                this.f1866b.m5171a("BlackViewDetector", "Stopped monitoring view: " + this.f1874j.get());
            }
            this.f1874j.clear();
        }
        Handler handler = this.f1880p;
        if (handler != null) {
            handler.removeCallbacks(this.f1882r);
            this.f1880p = null;
        }
        if (this.f1883s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.j0$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2963f();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2972a(View view, c cVar) {
        if (((Boolean) this.f1865a.m4801a(C1831z4.f3982l6)).booleanValue()) {
            View view2 = (View) this.f1874j.get();
            if (view2 != null) {
                if (C1768p.m5160a()) {
                    this.f1866b.m5178k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (C1768p.m5160a()) {
                this.f1866b.m5171a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f1881q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f1881q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f1865a.m4764E().m2677a(C1548f2.f1501S0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    m2971k();
                }
                this.f1883s = cVar;
                this.f1874j = new WeakReference(view);
                m2970j();
                this.f1878n = false;
                this.f1879o = false;
                Handler handler = new Handler(this.f1881q.getLooper());
                this.f1880p = handler;
                handler.postDelayed(this.f1882r, this.f1868d);
            } catch (Throwable th) {
                m2971k();
                this.f1865a.m4764E().m4329a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2973b() {
        m2971k();
        HandlerThread handlerThread = this.f1881q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1881q = null;
        }
    }
}
