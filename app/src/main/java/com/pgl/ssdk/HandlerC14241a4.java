package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.pgl.ssdk.a4 */
/* JADX INFO: loaded from: classes7.dex */
public class HandlerC14241a4 extends Handler {

    /* JADX INFO: renamed from: a */
    protected WeakReference<a> f41205a;

    /* JADX INFO: renamed from: com.pgl.ssdk.a4$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m42795a(Message message);
    }

    public HandlerC14241a4(Looper looper, a aVar) {
        super(looper);
        if (aVar != null) {
            this.f41205a = new WeakReference<>(aVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        WeakReference<a> weakReference = this.f41205a;
        if (weakReference == null || (aVar = weakReference.get()) == null || message == null) {
            return;
        }
        aVar.m42795a(message);
    }
}
