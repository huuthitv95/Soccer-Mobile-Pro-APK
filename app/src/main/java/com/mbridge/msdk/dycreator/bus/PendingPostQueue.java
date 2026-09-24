package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes5.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a */
    private PendingPost f35263a;

    /* JADX INFO: renamed from: b */
    private PendingPost f35264b;

    PendingPostQueue() {
    }

    /* JADX INFO: renamed from: a */
    synchronized void m36344a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f35264b;
            if (pendingPost2 != null) {
                pendingPost2.f35262c = pendingPost;
                this.f35264b = pendingPost;
            } else {
                if (this.f35263a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f35264b = pendingPost;
                this.f35263a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized PendingPost m36342a() {
        PendingPost pendingPost;
        pendingPost = this.f35263a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f35262c;
            this.f35263a = pendingPost2;
            if (pendingPost2 == null) {
                this.f35264b = null;
            }
        }
        return pendingPost;
    }

    /* JADX INFO: renamed from: a */
    synchronized PendingPost m36343a(int i) throws InterruptedException {
        if (this.f35263a == null) {
            wait(i);
        }
        return m36342a();
    }
}
