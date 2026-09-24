package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.d */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4244d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ComponentName f17308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f17309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4245e f17310c;

    public RunnableC4244d(C4245e c4245e, ComponentName componentName, IBinder iBinder) {
        this.f17310c = c4245e;
        this.f17308a = componentName;
        this.f17309b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17310c.mo20277a(this.f17308a, this.f17309b);
    }
}
