package com.iab.omid.library.mmadbridge.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11215c implements AbstractAsyncTaskC11214b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f23470a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f23471b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC11214b> f23472c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC11214b f23473d = null;

    public C11215c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23470a = linkedBlockingQueue;
        this.f23471b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m24683a() {
        AbstractAsyncTaskC11214b abstractAsyncTaskC11214bPoll = this.f23472c.poll();
        this.f23473d = abstractAsyncTaskC11214bPoll;
        if (abstractAsyncTaskC11214bPoll != null) {
            abstractAsyncTaskC11214bPoll.m24679a(this.f23471b);
        }
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC11214b.a
    /* JADX INFO: renamed from: a */
    public void mo24680a(AbstractAsyncTaskC11214b abstractAsyncTaskC11214b) {
        this.f23473d = null;
        m24683a();
    }

    /* JADX INFO: renamed from: b */
    public void m24684b(AbstractAsyncTaskC11214b abstractAsyncTaskC11214b) {
        abstractAsyncTaskC11214b.m24677a(this);
        this.f23472c.add(abstractAsyncTaskC11214b);
        if (this.f23473d == null) {
            m24683a();
        }
    }
}
