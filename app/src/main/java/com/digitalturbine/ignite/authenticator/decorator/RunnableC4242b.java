package com.digitalturbine.ignite.authenticator.decorator;

import android.content.Context;
import android.content.Intent;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4253c;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.logger.ILogger;
import com.digitalturbine.ignite.authenticator.utils.events.AbstractC4266a;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.b */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4242b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4245e f17305a;

    public RunnableC4242b(C4245e c4245e) {
        this.f17305a = c4245e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17305a.f17322l) {
            Intent intent = new Intent();
            intent.setClassName(this.f17305a.f17318h, "com.digitalturbine.ignite.cl.IgniteRemoteService");
            C4245e c4245e = this.f17305a;
            Context context = c4245e.f17315e;
            if (context != null) {
                try {
                    context.bindService(intent, c4245e, 1);
                } catch (Throwable th) {
                    Object[] objArr = {th};
                    ILogger iLogger = C4259a.f17346b.f17347a;
                    if (iLogger != null) {
                        iLogger.mo20304e("Failed to bind IgniteRemoteService", objArr);
                    }
                    if (th.getMessage() != null && th.getMessage().contains("Too many bind requests")) {
                    } else {
                        C4252b.m20298a(EnumC4254d.ONE_DT_GENERAL_ERROR, AbstractC4266a.m20312a(th, EnumC4253c.IGNITE_SERVICE_UNAVAILABLE));
                    }
                }
            }
        }
    }
}
