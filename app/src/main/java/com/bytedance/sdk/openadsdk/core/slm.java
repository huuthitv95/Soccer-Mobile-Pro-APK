package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.utils.C3585ri;

/* JADX INFO: loaded from: classes3.dex */
public class slm {

    /* JADX INFO: renamed from: lr */
    private boolean f11678lr;

    /* JADX INFO: renamed from: ri */
    private final C3585ri f11679ri = new C3585ri();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.slm$ri */
    private static class C3329ri {

        /* JADX INFO: renamed from: ri */
        private static final slm f11680ri = new slm();
    }

    /* JADX INFO: renamed from: ri */
    public static slm m14959ri() {
        return C3329ri.f11680ri;
    }

    /* JADX INFO: renamed from: fi */
    public C3585ri m14960fi() {
        return this.f11679ri;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m14961ik() {
        return this.f11678lr;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m14962ka() {
        return this.f11679ri.m16641ri();
    }

    /* JADX INFO: renamed from: lr */
    public void m14963lr() {
        try {
            Context contextM14642ri = C3299nr.m14642ri();
            if (contextM14642ri instanceof Application) {
                ((Application) contextM14642ri).registerActivityLifecycleCallbacks(this.f11679ri);
                this.f11678lr = true;
            } else {
                if (contextM14642ri == null || contextM14642ri.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextM14642ri.getApplicationContext()).registerActivityLifecycleCallbacks(this.f11679ri);
                this.f11678lr = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14964ri(boolean z) {
        return this.f11679ri.m16642ri(z);
    }
}
