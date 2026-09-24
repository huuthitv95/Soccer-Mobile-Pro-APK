package com.iab.omid.library.fyber.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11113c implements AbstractAsyncTaskC11112b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f23200a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f23201b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC11112b> f23202c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC11112b f23203d = null;

    public C11113c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23200a = linkedBlockingQueue;
        this.f23201b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m24177a() {
        AbstractAsyncTaskC11112b abstractAsyncTaskC11112bPoll = this.f23202c.poll();
        this.f23203d = abstractAsyncTaskC11112bPoll;
        if (abstractAsyncTaskC11112bPoll != null) {
            abstractAsyncTaskC11112bPoll.m24173a(this.f23201b);
        }
    }

    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC11112b.a
    /* JADX INFO: renamed from: a */
    public void mo24174a(AbstractAsyncTaskC11112b abstractAsyncTaskC11112b) {
        this.f23203d = null;
        m24177a();
    }

    /* JADX INFO: renamed from: b */
    public void m24178b(AbstractAsyncTaskC11112b abstractAsyncTaskC11112b) {
        abstractAsyncTaskC11112b.m24171a(this);
        this.f23202c.add(abstractAsyncTaskC11112b);
        if (this.f23203d == null) {
            m24177a();
        }
    }
}
