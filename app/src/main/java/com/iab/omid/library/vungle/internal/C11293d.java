package com.iab.omid.library.vungle.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11293d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private boolean f23672a;

    /* JADX INFO: renamed from: b */
    protected boolean f23673b;

    /* JADX INFO: renamed from: c */
    private a f23674c;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24997a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    private void m25010a(boolean z) {
        if (this.f23673b != z) {
            this.f23673b = z;
            if (this.f23672a) {
                mo25001b(z);
                a aVar = this.f23674c;
                if (aVar != null) {
                    aVar.mo24997a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m25011a() {
        return m25014b().importance == 100 || mo25002d();
    }

    /* JADX INFO: renamed from: a */
    public void m25012a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25013a(a aVar) {
        this.f23674c = aVar;
    }

    /* JADX INFO: renamed from: b */
    ActivityManager.RunningAppProcessInfo m25014b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* JADX INFO: renamed from: b */
    protected void mo25001b(boolean z) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m25015c() {
        return this.f23673b;
    }

    /* JADX INFO: renamed from: d */
    protected boolean mo25002d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m25016e() {
        this.f23672a = true;
        boolean zM25011a = m25011a();
        this.f23673b = zM25011a;
        mo25001b(zM25011a);
    }

    /* JADX INFO: renamed from: f */
    public void m25017f() {
        this.f23672a = false;
        this.f23674c = null;
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
        m25010a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m25010a(m25011a());
    }
}
