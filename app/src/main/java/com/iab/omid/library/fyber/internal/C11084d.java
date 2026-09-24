package com.iab.omid.library.fyber.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11084d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f23114a;

    /* JADX INFO: renamed from: b */
    protected boolean f23115b;

    /* JADX INFO: renamed from: c */
    private a f23116c;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo23975a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m23988a(boolean z) {
        if (this.f23115b != z) {
            this.f23115b = z;
            if (this.f23114a) {
                mo23979b(z);
                a aVar = this.f23116c;
                if (aVar != null) {
                    aVar.mo23975a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m23989a() {
        return m23992b().importance == 100 || mo23980d();
    }

    /* JADX INFO: renamed from: a */
    public void m23990a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23991a(a aVar) {
        this.f23116c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m23992b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo23979b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m23993c() {
        return this.f23115b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo23980d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m23994e() {
        this.f23114a = true;
        boolean zM23989a = m23989a();
        this.f23115b = zM23989a;
        mo23979b(zM23989a);
    }

    /* JADX INFO: renamed from: f */
    public void m23995f() {
        this.f23114a = false;
        this.f23116c = null;
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
        m23988a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m23988a(m23989a());
    }
}
