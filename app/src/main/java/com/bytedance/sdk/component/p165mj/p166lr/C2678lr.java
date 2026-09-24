package com.bytedance.sdk.component.p165mj.p166lr;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.bytedance.sdk.component.mj.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2678lr<V> extends FutureTask<V> implements Comparable<C2678lr<V>> {

    /* JADX INFO: renamed from: lr */
    private int f7651lr;

    /* JADX INFO: renamed from: ri */
    private int f7652ri;

    public C2678lr(Callable<V> callable, int i, int i2) {
        super(callable);
        this.f7652ri = i == -1 ? 5 : i;
        this.f7651lr = i2;
    }

    /* JADX INFO: renamed from: ri */
    public int m10056ri() {
        return this.f7652ri;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2678lr c2678lr) {
        if (m10056ri() < c2678lr.m10056ri()) {
            return 1;
        }
        return m10056ri() > c2678lr.m10056ri() ? -1 : 0;
    }
}
