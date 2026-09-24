package com.bytedance.sdk.component.p130di.p131ri.p141ri.p142lr;

import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2548ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2573ka<T extends InterfaceC2552ri> {

    /* JADX INFO: renamed from: ik */
    private Queue<String> f7208ik;

    /* JADX INFO: renamed from: ka */
    private String f7209ka;

    /* JADX INFO: renamed from: lr */
    private Queue<T> f7210lr = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ri */
    private C2551ri f7211ri;

    public AbstractC2573ka(C2551ri c2551ri, Queue<String> queue, String str) {
        this.f7211ri = c2551ri;
        this.f7208ik = queue;
        this.f7209ka = str;
    }

    /* JADX INFO: renamed from: lr */
    public synchronized boolean m9462lr(int i, int i2) {
        int size = this.f7210lr.size();
        int iM9298ri = this.f7211ri.m9298ri();
        if (i != 2 && i != 1) {
            return size >= iM9298ri;
        }
        if (C2548ri.m9251ik()) {
            return size > 0;
        }
        return size >= iM9298ri;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized List<InterfaceC2552ri> m9463ri(int i, int i2) {
        if (!m9462lr(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f7211ri.m9298ri());
        do {
            T tPoll = this.f7210lr.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.f7211ri.m9297lr());
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized void m9464ri(int i, List<T> list) {
        try {
            if (i == -1 || i == 200 || i == 509) {
                this.f7210lr.size();
            } else {
                this.f7210lr.addAll(list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9465ri(T t) {
        Queue<T> queue = this.f7210lr;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }
}
