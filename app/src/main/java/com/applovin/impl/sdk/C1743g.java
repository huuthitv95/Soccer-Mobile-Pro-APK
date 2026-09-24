package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.C1593j7;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.sdk.g */
/* JADX INFO: loaded from: classes3.dex */
public class C1743g implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a */
    private C1593j7 f2955a;

    /* JADX INFO: renamed from: b */
    private final Object f2956b = new Object();

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f2957c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    private boolean f2958d;

    /* JADX INFO: renamed from: e */
    private final C1748l f2959e;

    /* JADX INFO: renamed from: f */
    private final WeakReference f2960f;

    /* JADX INFO: renamed from: g */
    private long f2961g;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.g$a */
    public interface a {
        void onAdRefresh();
    }

    public C1743g(C1748l c1748l, a aVar) {
        this.f2960f = new WeakReference(aVar);
        this.f2959e = c1748l;
    }

    /* JADX INFO: renamed from: e */
    private void m4646e() {
        if (((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3321F7)).booleanValue()) {
            m4649k();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4647f() {
        if (((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3321F7)).booleanValue()) {
            synchronized (this.f2956b) {
                if (this.f2958d) {
                    this.f2959e.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f2959e.m4782Q().m5171a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f2959e.m4846o0().isApplicationPaused()) {
                    this.f2959e.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f2959e.m4782Q().m5171a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    C1593j7 c1593j7 = this.f2955a;
                    if (c1593j7 != null) {
                        c1593j7.m3026e();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m4648i() {
        m4650l();
        a aVar = (a) this.f2960f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m4649k() {
        synchronized (this.f2956b) {
            C1593j7 c1593j7 = this.f2955a;
            if (c1593j7 != null) {
                c1593j7.m3025d();
            } else {
                this.f2959e.m4782Q();
                if (C1768p.m5160a()) {
                    this.f2959e.m4782Q().m5171a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f2957c.set(true);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m4650l() {
        synchronized (this.f2956b) {
            this.f2955a = null;
            if (!((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3323G7)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m4651n() {
        synchronized (this.f2956b) {
            C1593j7 c1593j7 = this.f2955a;
            if (c1593j7 != null) {
                c1593j7.m3026e();
            } else {
                this.f2957c.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4652a() {
        synchronized (this.f2956b) {
            C1593j7 c1593j7 = this.f2955a;
            if (c1593j7 != null) {
                c1593j7.m3023a();
                m4650l();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4653a(long j) {
        synchronized (this.f2956b) {
            m4652a();
            this.f2961g = j;
            this.f2955a = C1593j7.m3012a(j, this.f2959e, new Runnable() { // from class: com.applovin.impl.sdk.g$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4648i();
                }
            });
            if (!((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3323G7)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3321F7)).booleanValue() && (this.f2959e.m4773J().m5151d() || this.f2959e.m4846o0().isApplicationPaused())) {
                this.f2955a.m3025d();
            }
            if (this.f2957c.compareAndSet(true, false) && ((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3325H7)).booleanValue()) {
                this.f2959e.m4782Q();
                if (C1768p.m5160a()) {
                    this.f2959e.m4782Q().m5171a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f2955a.m3025d();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m4654b() {
        long jM3024c;
        synchronized (this.f2956b) {
            C1593j7 c1593j7 = this.f2955a;
            jM3024c = c1593j7 != null ? c1593j7.m3024c() : -1L;
        }
        return jM3024c;
    }

    /* JADX INFO: renamed from: c */
    public void m4655c() {
        if (((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3319E7)).booleanValue()) {
            m4649k();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4656d() {
        boolean z;
        a aVar;
        if (((Boolean) this.f2959e.m4801a(AbstractC1776t3.f3319E7)).booleanValue()) {
            synchronized (this.f2956b) {
                if (this.f2958d) {
                    this.f2959e.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f2959e.m4782Q().m5171a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f2959e.m4773J().m5151d()) {
                    this.f2959e.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f2959e.m4782Q().m5171a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                if (this.f2955a != null) {
                    long jM4654b = this.f2961g - m4654b();
                    long jLongValue = ((Long) this.f2959e.m4801a(AbstractC1776t3.f3317D7)).longValue();
                    if (jLongValue < 0 || jM4654b <= jLongValue) {
                        this.f2955a.m3026e();
                        z = false;
                    } else {
                        m4652a();
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (!z || (aVar = (a) this.f2960f.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m4657g() {
        return this.f2958d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4658h() {
        boolean z;
        synchronized (this.f2956b) {
            z = this.f2955a != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public void m4659j() {
        synchronized (this.f2956b) {
            m4649k();
            this.f2958d = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4660m() {
        synchronized (this.f2956b) {
            m4651n();
            this.f2958d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            m4655c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m4656d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            m4646e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m4647f();
        }
    }
}
