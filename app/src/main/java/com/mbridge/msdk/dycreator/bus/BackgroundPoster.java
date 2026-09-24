package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a */
    private final PendingPostQueue f35232a = new PendingPostQueue();

    /* JADX INFO: renamed from: b */
    private volatile boolean f35233b;

    /* JADX INFO: renamed from: c */
    private final EventBus f35234c;

    BackgroundPoster(EventBus eventBus) {
        this.f35234c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostM36340a = PendingPost.m36340a(subscription, obj);
        synchronized (this) {
            this.f35232a.m36344a(pendingPostM36340a);
            if (!this.f35233b) {
                this.f35233b = true;
                EventBus.f35235n.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost pendingPostM36343a = this.f35232a.m36343a(1000);
                    if (pendingPostM36343a == null) {
                        synchronized (this) {
                            pendingPostM36343a = this.f35232a.m36342a();
                            if (pendingPostM36343a == null) {
                                this.f35233b = false;
                                this.f35233b = false;
                                return;
                            }
                        }
                    }
                    this.f35234c.m36335a(pendingPostM36343a);
                } catch (InterruptedException e) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    this.f35233b = false;
                    return;
                }
            } catch (Throwable th) {
                this.f35233b = false;
                throw th;
            }
        }
    }
}
