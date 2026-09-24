package com.mbridge.msdk.thrid.okhttp.internal;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.b */
/* JADX INFO: compiled from: NamedRunnable.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractRunnableC13722b implements Runnable {

    /* JADX INFO: renamed from: a */
    protected final String f38770a;

    public AbstractRunnableC13722b(String str, Object... objArr) {
        this.f38770a = C13723c.m40272a(str, objArr);
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo40263b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f38770a);
        try {
            mo40263b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
