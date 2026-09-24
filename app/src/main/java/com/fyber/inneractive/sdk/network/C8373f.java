package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import com.fyber.inneractive.sdk.util.HandlerC9143d1;
import com.fyber.inneractive.sdk.util.InterfaceC9146e1;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8373f implements InterfaceC9146e1 {

    /* JADX INFO: renamed from: d */
    public HandlerC9143d1 f18645d;

    /* JADX INFO: renamed from: e */
    public int f18646e;

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue f18642a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b */
    public JSONArray f18643b = new JSONArray();

    /* JADX INFO: renamed from: f */
    public boolean f18647f = false;

    /* JADX INFO: renamed from: g */
    public boolean f18648g = false;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f18644c = new HandlerThread("EventCollectorHandlerThread", 0);

    /* JADX INFO: renamed from: a */
    public final void m20743a(Application application) {
        if (!this.f18648g) {
            this.f18648g = true;
            this.f18644c.start();
            HandlerC9143d1 handlerC9143d1 = new HandlerC9143d1(this.f18644c.getLooper(), this);
            this.f18645d = handlerC9143d1;
            this.f18647f = true;
            this.f18646e = 30;
            if (handlerC9143d1.hasMessages(12312329)) {
                this.f18645d.removeMessages(12312329);
            }
            long j = this.f18646e * 1000;
            HandlerC9143d1 handlerC9143d2 = this.f18645d;
            if (handlerC9143d2 != null) {
                handlerC9143d2.post(new RunnableC8362c(this, 12312329, j));
            }
        }
        application.registerActivityLifecycleCallbacks(new C8365d(this));
    }
}
