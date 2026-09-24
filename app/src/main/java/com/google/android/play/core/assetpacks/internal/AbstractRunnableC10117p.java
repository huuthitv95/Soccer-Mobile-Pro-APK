package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.p */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC10117p implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TaskCompletionSource f22414a;

    AbstractRunnableC10117p() {
        this.f22414a = null;
    }

    public AbstractRunnableC10117p(TaskCompletionSource taskCompletionSource) {
        this.f22414a = taskCompletionSource;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo22482a();

    /* JADX INFO: renamed from: b */
    final TaskCompletionSource m22754b() {
        return this.f22414a;
    }

    /* JADX INFO: renamed from: c */
    public final void m22755c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f22414a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo22482a();
        } catch (Exception e) {
            m22755c(e);
        }
    }
}
