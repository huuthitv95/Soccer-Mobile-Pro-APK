package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
final class HandlerPoster extends Handler {

    /* JADX INFO: renamed from: a */
    private final PendingPostQueue f35255a;

    /* JADX INFO: renamed from: b */
    private final int f35256b;

    /* JADX INFO: renamed from: c */
    private final EventBus f35257c;

    /* JADX INFO: renamed from: d */
    private boolean f35258d;

    HandlerPoster(EventBus eventBus, Looper looper, int i) {
        super(looper);
        this.f35257c = eventBus;
        this.f35256b = i;
        this.f35255a = new PendingPostQueue();
    }

    /* JADX INFO: renamed from: a */
    void m36339a(Subscription subscription, Object obj) {
        PendingPost pendingPostM36340a = PendingPost.m36340a(subscription, obj);
        synchronized (this) {
            this.f35255a.m36344a(pendingPostM36340a);
            if (!this.f35258d) {
                this.f35258d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostM36342a = this.f35255a.m36342a();
                if (pendingPostM36342a == null) {
                    synchronized (this) {
                        pendingPostM36342a = this.f35255a.m36342a();
                        if (pendingPostM36342a == null) {
                            this.f35258d = false;
                            return;
                        }
                    }
                }
                this.f35257c.m36335a(pendingPostM36342a);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f35256b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f35258d = true;
        } catch (Throwable th) {
            this.f35258d = false;
            throw th;
        }
    }
}
