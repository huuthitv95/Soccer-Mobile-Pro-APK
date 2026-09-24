package com.bytedance.sdk.openadsdk.core.p226sf.p227ri;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sf.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3328ri implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ri */
    private static volatile C3328ri f11676ri;

    /* JADX INFO: renamed from: lr */
    private final C3327lr f11677lr;

    private C3328ri(Application application) {
        this.f11677lr = C3327lr.m14951ri(application);
    }

    /* JADX INFO: renamed from: ri */
    public static C3328ri m14957ri(Application application) {
        if (f11676ri == null) {
            synchronized (C3328ri.class) {
                if (f11676ri == null) {
                    f11676ri = new C3328ri(application);
                    application.registerActivityLifecycleCallbacks(f11676ri);
                }
            }
        }
        return f11676ri;
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
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C3327lr c3327lr = this.f11677lr;
        if (c3327lr != null) {
            c3327lr.m14956ri(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C3327lr c3327lr = this.f11677lr;
        if (c3327lr != null) {
            c3327lr.m14954lr(activity);
        }
    }

    /* JADX INFO: renamed from: ri */
    public String m14958ri(String str, long j, int i) {
        C3327lr c3327lr = this.f11677lr;
        return c3327lr != null ? c3327lr.m14955ri(str, j, i) : AbstractJsonLexerKt.NULL;
    }
}
