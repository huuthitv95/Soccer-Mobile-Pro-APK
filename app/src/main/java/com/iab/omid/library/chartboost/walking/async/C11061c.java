package com.iab.omid.library.chartboost.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11061c implements AbstractAsyncTaskC11060b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f23065a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f23066b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC11060b> f23067c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC11060b f23068d = null;

    public C11061c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23065a = linkedBlockingQueue;
        this.f23066b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m23921a() {
        AbstractAsyncTaskC11060b abstractAsyncTaskC11060bPoll = this.f23067c.poll();
        this.f23068d = abstractAsyncTaskC11060bPoll;
        if (abstractAsyncTaskC11060bPoll != null) {
            abstractAsyncTaskC11060bPoll.m23917a(this.f23066b);
        }
    }

    @Override // com.iab.omid.library.chartboost.walking.async.AbstractAsyncTaskC11060b.a
    /* JADX INFO: renamed from: a */
    public void mo23918a(AbstractAsyncTaskC11060b abstractAsyncTaskC11060b) {
        this.f23068d = null;
        m23921a();
    }

    /* JADX INFO: renamed from: b */
    public void m23922b(AbstractAsyncTaskC11060b abstractAsyncTaskC11060b) {
        abstractAsyncTaskC11060b.m23915a(this);
        this.f23067c.add(abstractAsyncTaskC11060b);
        if (this.f23068d == null) {
            m23921a();
        }
    }
}
