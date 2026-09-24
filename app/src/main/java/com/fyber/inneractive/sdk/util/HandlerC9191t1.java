package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.t1 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC9191t1 extends Handler {

    /* JADX INFO: renamed from: a */
    public final WeakReference f21493a;

    public HandlerC9191t1(C9197v1 c9197v1) {
        super(Looper.getMainLooper());
        this.f21493a = new WeakReference(c9197v1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        C9197v1 c9197v1 = (C9197v1) this.f21493a.get();
        if (c9197v1 == null || message.what != 1932593528 || c9197v1.f21501d) {
            return;
        }
        c9197v1.m22035a(message.getWhen());
    }
}
