package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes5.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a */
    private final PendingPostQueue f35230a = new PendingPostQueue();

    /* JADX INFO: renamed from: b */
    private final EventBus f35231b;

    AsyncPoster(EventBus eventBus) {
        this.f35231b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f35230a.m36344a(PendingPost.m36340a(subscription, obj));
        EventBus.f35235n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostM36342a = this.f35230a.m36342a();
        if (pendingPostM36342a == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f35231b.m36335a(pendingPostM36342a);
    }
}
