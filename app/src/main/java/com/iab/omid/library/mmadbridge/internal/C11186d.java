package com.iab.omid.library.mmadbridge.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11186d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f23384a;

    /* JADX INFO: renamed from: b */
    protected boolean f23385b;

    /* JADX INFO: renamed from: c */
    private a f23386c;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24481a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m24494a(boolean z) {
        if (this.f23385b != z) {
            this.f23385b = z;
            if (this.f23384a) {
                mo24485b(z);
                a aVar = this.f23386c;
                if (aVar != null) {
                    aVar.mo24481a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m24495a() {
        return m24498b().importance == 100 || mo24486d();
    }

    /* JADX INFO: renamed from: a */
    public void m24496a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24497a(a aVar) {
        this.f23386c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m24498b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo24485b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m24499c() {
        return this.f23385b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo24486d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m24500e() {
        this.f23384a = true;
        boolean zM24495a = m24495a();
        this.f23385b = zM24495a;
        mo24485b(zM24495a);
    }

    /* JADX INFO: renamed from: f */
    public void m24501f() {
        this.f23384a = false;
        this.f23386c = null;
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
        m24494a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m24494a(m24495a());
    }
}
