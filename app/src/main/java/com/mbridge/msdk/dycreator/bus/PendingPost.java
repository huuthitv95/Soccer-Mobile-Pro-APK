package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d */
    private static final List<PendingPost> f35259d = new ArrayList();

    /* JADX INFO: renamed from: a */
    Object f35260a;

    /* JADX INFO: renamed from: b */
    Subscription f35261b;

    /* JADX INFO: renamed from: c */
    PendingPost f35262c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f35260a = obj;
        this.f35261b = subscription;
    }

    /* JADX INFO: renamed from: a */
    static PendingPost m36340a(Subscription subscription, Object obj) {
        List<PendingPost> list = f35259d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new PendingPost(obj, subscription);
            }
            PendingPost pendingPostRemove = list.remove(size - 1);
            pendingPostRemove.f35260a = obj;
            pendingPostRemove.f35261b = subscription;
            pendingPostRemove.f35262c = null;
            return pendingPostRemove;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m36341a(PendingPost pendingPost) {
        pendingPost.f35260a = null;
        pendingPost.f35261b = null;
        pendingPost.f35262c = null;
        List<PendingPost> list = f35259d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
    }
}
