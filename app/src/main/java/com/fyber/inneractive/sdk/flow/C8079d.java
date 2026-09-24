package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8261b;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.d */
/* JADX INFO: loaded from: classes9.dex */
public final class C8079d {

    /* JADX INFO: renamed from: a */
    public Handler f17972a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8261b f17973b;

    /* JADX INFO: renamed from: c */
    public final RunnableC8075b f17974c = new RunnableC8075b(this);

    /* JADX INFO: renamed from: d */
    public final RunnableC8077c f17975d = new RunnableC8077c(this);

    public C8079d(InterfaceC8261b interfaceC8261b) {
        this.f17973b = interfaceC8261b;
    }

    /* JADX INFO: renamed from: a */
    public final void m20496a() {
        IAlog.m21945a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.m21943a(this));
        if (this.f17972a != null) {
            IAlog.m21945a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.m21943a(this));
            Handler handler = this.f17972a;
            if (handler != null) {
                handler.removeCallbacks(this.f17975d);
            }
            this.f17972a.getLooper().quitSafely();
            this.f17972a = null;
        }
    }
}
