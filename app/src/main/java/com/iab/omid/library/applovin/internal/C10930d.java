package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C10930d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f22709a;

    /* JADX INFO: renamed from: b */
    protected boolean f22710b;

    /* JADX INFO: renamed from: c */
    private a f22711c;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo23218a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m23231a(boolean z) {
        if (this.f22710b != z) {
            this.f22710b = z;
            if (this.f22709a) {
                mo23222b(z);
                a aVar = this.f22711c;
                if (aVar != null) {
                    aVar.mo23218a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m23232a() {
        return m23235b().importance == 100 || mo23223d();
    }

    /* JADX INFO: renamed from: a */
    public void m23233a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23234a(a aVar) {
        this.f22711c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m23235b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo23222b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m23236c() {
        return this.f22710b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo23223d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m23237e() {
        this.f22709a = true;
        boolean zM23232a = m23232a();
        this.f22710b = zM23232a;
        mo23222b(zM23232a);
    }

    /* JADX INFO: renamed from: f */
    public void m23238f() {
        this.f22709a = false;
        this.f22711c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m23231a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m23231a(m23232a());
    }
}
