package com.apm.insight.p020j;

import android.os.Handler;

/* JADX INFO: renamed from: com.apm.insight.j.a */
/* JADX INFO: compiled from: BaseTask.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC1410a implements Runnable {

    /* JADX INFO: renamed from: a */
    private Handler f621a;

    /* JADX INFO: renamed from: b */
    private final long f622b = 0;

    /* JADX INFO: renamed from: c */
    private final long f623c;

    AbstractRunnableC1410a(Handler handler, long j) {
        this.f621a = handler;
        this.f623c = j;
    }

    /* JADX INFO: renamed from: a */
    final void m1188a() {
        this.f621a.post(this);
    }

    /* JADX INFO: renamed from: a */
    final void m1189a(long j) {
        if (j > 0) {
            this.f621a.postDelayed(this, j);
        } else {
            this.f621a.post(this);
        }
    }

    /* JADX INFO: renamed from: b */
    final long m1190b() {
        return this.f623c;
    }
}
