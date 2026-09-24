package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.c */
/* JADX INFO: loaded from: classes3.dex */
public class C1515c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private final List f1223a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b */
    private WeakReference f1224b;

    /* JADX INFO: renamed from: c */
    private WeakReference f1225c;

    public C1515c(Context context) {
        this.f1224b = new WeakReference(null);
        this.f1225c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f1224b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f1225c = this.f1224b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: renamed from: a */
    public Activity m2143a() {
        return (Activity) this.f1225c.get();
    }

    /* JADX INFO: renamed from: a */
    public void m2144a(AbstractC1505b abstractC1505b) {
        this.f1223a.add(abstractC1505b);
    }

    /* JADX INFO: renamed from: b */
    public Activity m2145b() {
        return (Activity) this.f1224b.get();
    }

    /* JADX INFO: renamed from: b */
    public void m2146b(AbstractC1505b abstractC1505b) {
        this.f1223a.remove(abstractC1505b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f1223a).iterator();
        while (it.hasNext()) {
            ((AbstractC1505b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f1223a).iterator();
        while (it.hasNext()) {
            ((AbstractC1505b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f1225c = new WeakReference(null);
        Iterator it = new ArrayList(this.f1223a).iterator();
        while (it.hasNext()) {
            ((AbstractC1505b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f1224b = weakReference;
        this.f1225c = weakReference;
        Iterator it = new ArrayList(this.f1223a).iterator();
        while (it.hasNext()) {
            ((AbstractC1505b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f1223a).iterator();
        while (it.hasNext()) {
            ((AbstractC1505b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f1223a).iterator();
        while (it.hasNext()) {
            ((AbstractC1505b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f1223a).iterator();
        while (it.hasNext()) {
            ((AbstractC1505b) it.next()).onActivityStopped(activity);
        }
    }
}
