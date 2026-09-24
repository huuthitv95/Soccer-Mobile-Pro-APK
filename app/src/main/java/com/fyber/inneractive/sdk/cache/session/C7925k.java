package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C7925k extends PriorityQueue {

    /* JADX INFO: renamed from: a */
    public final int f17606a;

    public C7925k(int i) {
        super(1, new C7926l());
        this.f17606a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(C7921g c7921g) {
        boolean zAdd = super.add(c7921g);
        if (super.size() > this.f17606a) {
            poll();
        }
        return zAdd;
    }
}
