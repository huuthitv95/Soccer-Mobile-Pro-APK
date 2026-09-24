package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.c5 */
/* JADX INFO: loaded from: classes6.dex */
public class HandlerC12127c5 extends Handler {

    /* JADX INFO: renamed from: b */
    private static final String f30166b = "DownloadHandler";

    /* JADX INFO: renamed from: a */
    InterfaceC11510Jc f30167a;

    public HandlerC12127c5(Looper looper) {
        super(looper);
    }

    /* JADX INFO: renamed from: a */
    public void m31260a(InterfaceC11510Jc interfaceC11510Jc) {
        if (interfaceC11510Jc == null) {
            throw new IllegalArgumentException();
        }
        this.f30167a = interfaceC11510Jc;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC11510Jc interfaceC11510Jc = this.f30167a;
        if (interfaceC11510Jc == null) {
            Logger.m33642i(f30166b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                interfaceC11510Jc.mo26216a((C12601x8) message.obj);
            } else {
                this.f30167a.mo26217a((C12601x8) message.obj, new C12404o8(i, C12174eg.m31379a(i)));
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            Logger.m33642i(f30166b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31259a() {
        this.f30167a = null;
    }
}
