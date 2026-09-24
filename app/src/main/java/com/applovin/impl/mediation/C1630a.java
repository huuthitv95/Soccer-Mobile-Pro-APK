package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC1505b;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1515c;
import com.applovin.impl.C1539e3;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;

/* JADX INFO: renamed from: com.applovin.impl.mediation.a */
/* JADX INFO: loaded from: classes3.dex */
public class C1630a extends AbstractC1505b {

    /* JADX INFO: renamed from: a */
    private final C1515c f2124a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2125b;

    /* JADX INFO: renamed from: c */
    private final String f2126c;

    /* JADX INFO: renamed from: d */
    private a f2127d;

    /* JADX INFO: renamed from: e */
    private C1539e3 f2128e;

    /* JADX INFO: renamed from: f */
    private String f2129f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo3296b(C1539e3 c1539e3);
    }

    C1630a(C1748l c1748l) {
        this.f2125b = c1748l.m4782Q();
        this.f2124a = c1748l.m4826e();
        this.f2126c = AbstractC1701q7.m4030a(C1748l.m4756p(), "AdActivityObserver", c1748l);
    }

    /* JADX INFO: renamed from: a */
    public void m3294a() {
        if (C1768p.m5160a()) {
            this.f2125b.m5171a("AdActivityObserver", "Cancelling...");
        }
        this.f2124a.m2146b(this);
        this.f2127d = null;
        this.f2128e = null;
        this.f2129f = null;
    }

    /* JADX INFO: renamed from: a */
    public void m3295a(C1539e3 c1539e3, a aVar) {
        if (C1768p.m5160a()) {
            this.f2125b.m5171a("AdActivityObserver", "Starting for ad " + c1539e3.getAdUnitId() + "...");
        }
        m3294a();
        this.f2127d = aVar;
        this.f2128e = c1539e3;
        this.f2124a.m2144a(this);
    }

    @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f2126c) && this.f2128e.m2468C0()) {
            if (C1768p.m5160a()) {
                this.f2125b.m5171a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f2127d != null) {
                if (C1768p.m5160a()) {
                    this.f2125b.m5171a("AdActivityObserver", "Invoking callback...");
                }
                this.f2127d.mo3296b(this.f2128e);
            }
            m3294a();
            return;
        }
        if (this.f2129f == null) {
            this.f2129f = activity.getClass().getName();
            if (C1768p.m5160a()) {
                this.f2125b.m5171a("AdActivityObserver", "Started tracking ad Activity: " + this.f2129f);
            }
        }
    }

    @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f2129f)) {
            if (C1768p.m5160a()) {
                this.f2125b.m5171a("AdActivityObserver", "Ad Activity destroyed: " + this.f2129f);
            }
            if (this.f2127d != null) {
                if (C1768p.m5160a()) {
                    this.f2125b.m5171a("AdActivityObserver", "Invoking callback...");
                }
                this.f2127d.mo3296b(this.f2128e);
            }
            m3294a();
        }
    }
}
