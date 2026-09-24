package com.iab.omid.library.unity3d.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11235d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f23520a;

    /* JADX INFO: renamed from: b */
    protected boolean f23521b;

    /* JADX INFO: renamed from: c */
    private a f23522c;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24737a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m24750a(boolean z) {
        if (this.f23521b != z) {
            this.f23521b = z;
            if (this.f23520a) {
                mo24741b(z);
                a aVar = this.f23522c;
                if (aVar != null) {
                    aVar.mo24737a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m24751a() {
        return m24754b().importance == 100 || mo24742d();
    }

    /* JADX INFO: renamed from: a */
    public void m24752a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24753a(a aVar) {
        this.f23522c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m24754b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo24741b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m24755c() {
        return this.f23521b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo24742d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m24756e() {
        this.f23520a = true;
        boolean zM24751a = m24751a();
        this.f23521b = zM24751a;
        mo24741b(zM24751a);
    }

    /* JADX INFO: renamed from: f */
    public void m24757f() {
        this.f23520a = false;
        this.f23522c = null;
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
        m24750a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m24750a(m24751a());
    }
}
