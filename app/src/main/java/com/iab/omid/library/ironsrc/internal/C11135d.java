package com.iab.omid.library.ironsrc.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11135d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f23249a;

    /* JADX INFO: renamed from: b */
    protected boolean f23250b;

    /* JADX INFO: renamed from: c */
    private a f23251c;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24228a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m24241a(boolean z) {
        if (this.f23250b != z) {
            this.f23250b = z;
            if (this.f23249a) {
                mo24232b(z);
                a aVar = this.f23251c;
                if (aVar != null) {
                    aVar.mo24228a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m24242a() {
        return m24245b().importance == 100 || mo24233d();
    }

    /* JADX INFO: renamed from: a */
    public void m24243a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24244a(a aVar) {
        this.f23251c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m24245b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo24232b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m24246c() {
        return this.f23250b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo24233d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m24247e() {
        this.f23249a = true;
        boolean zM24242a = m24242a();
        this.f23250b = zM24242a;
        mo24232b(zM24242a);
    }

    /* JADX INFO: renamed from: f */
    public void m24248f() {
        this.f23249a = false;
        this.f23251c = null;
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
        m24241a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m24241a(m24242a());
    }
}
