package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fyber.inneractive.sdk.util.HandlerC9143d1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8365d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8373f f18630a;

    public C8365d(C8373f c8373f) {
        this.f18630a = c8373f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C8373f c8373f = this.f18630a;
        HandlerC9143d1 handlerC9143d1 = c8373f.f18645d;
        if (handlerC9143d1 != null) {
            handlerC9143d1.post(new RunnableC8362c(c8373f, 20150330, 3500L));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        HandlerC9143d1 handlerC9143d1 = this.f18630a.f18645d;
        if (handlerC9143d1 != null) {
            handlerC9143d1.removeMessages(20150330);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
