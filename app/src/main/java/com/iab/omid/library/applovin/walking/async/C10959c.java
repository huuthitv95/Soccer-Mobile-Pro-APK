package com.iab.omid.library.applovin.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C10959c implements AbstractAsyncTaskC10958b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f22795a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f22796b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC10958b> f22797c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC10958b f22798d = null;

    public C10959c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f22795a = linkedBlockingQueue;
        this.f22796b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m23420a() {
        AbstractAsyncTaskC10958b abstractAsyncTaskC10958bPoll = this.f22797c.poll();
        this.f22798d = abstractAsyncTaskC10958bPoll;
        if (abstractAsyncTaskC10958bPoll != null) {
            abstractAsyncTaskC10958bPoll.m23416a(this.f22796b);
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC10958b.a
    /* JADX INFO: renamed from: a */
    public void mo23417a(AbstractAsyncTaskC10958b abstractAsyncTaskC10958b) {
        this.f22798d = null;
        m23420a();
    }

    /* JADX INFO: renamed from: b */
    public void m23421b(AbstractAsyncTaskC10958b abstractAsyncTaskC10958b) {
        abstractAsyncTaskC10958b.m23414a(this);
        this.f22797c.add(abstractAsyncTaskC10958b);
        if (this.f22798d == null) {
            m23420a();
        }
    }
}
