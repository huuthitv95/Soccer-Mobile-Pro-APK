package com.iab.omid.library.bytedance2.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C10981d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f22844a;

    /* JADX INFO: renamed from: b */
    protected boolean f22845b;

    /* JADX INFO: renamed from: c */
    private a f22846c;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo23471a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m23484a(boolean z) {
        if (this.f22845b != z) {
            this.f22845b = z;
            if (this.f22844a) {
                mo23475b(z);
                a aVar = this.f22846c;
                if (aVar != null) {
                    aVar.mo23471a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m23485a() {
        return m23488b().importance == 100 || mo23476d();
    }

    /* JADX INFO: renamed from: a */
    public void m23486a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23487a(a aVar) {
        this.f22846c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m23488b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo23475b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m23489c() {
        return this.f22845b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo23476d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m23490e() {
        this.f22844a = true;
        boolean zM23485a = m23485a();
        this.f22845b = zM23485a;
        mo23475b(zM23485a);
    }

    /* JADX INFO: renamed from: f */
    public void m23491f() {
        this.f22844a = false;
        this.f22846c = null;
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
        m23484a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m23484a(m23485a());
    }
}
