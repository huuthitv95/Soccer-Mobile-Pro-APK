package com.iab.omid.library.chartboost.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11032d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f22979a;

    /* JADX INFO: renamed from: b */
    protected boolean f22980b;

    /* JADX INFO: renamed from: c */
    private a f22981c;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo23718a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m23731a(boolean z) {
        if (this.f22980b != z) {
            this.f22980b = z;
            if (this.f22979a) {
                mo23722b(z);
                a aVar = this.f22981c;
                if (aVar != null) {
                    aVar.mo23718a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m23732a() {
        return m23735b().importance == 100 || mo23723d();
    }

    /* JADX INFO: renamed from: a */
    public void m23733a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23734a(a aVar) {
        this.f22981c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m23735b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo23722b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m23736c() {
        return this.f22980b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo23723d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m23737e() {
        this.f22979a = true;
        boolean zM23732a = m23732a();
        this.f22980b = zM23732a;
        mo23722b(zM23732a);
    }

    /* JADX INFO: renamed from: f */
    public void m23738f() {
        this.f22979a = false;
        this.f22981c = null;
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
        m23731a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m23731a(m23732a());
    }
}
