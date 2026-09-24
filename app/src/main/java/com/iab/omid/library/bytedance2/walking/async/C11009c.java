package com.iab.omid.library.bytedance2.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11009c implements AbstractAsyncTaskC11008b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f22924a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f22925b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC11008b> f22926c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC11008b f22927d = null;

    public C11009c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f22924a = linkedBlockingQueue;
        this.f22925b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m23661a() {
        AbstractAsyncTaskC11008b abstractAsyncTaskC11008bPoll = this.f22926c.poll();
        this.f22927d = abstractAsyncTaskC11008bPoll;
        if (abstractAsyncTaskC11008bPoll != null) {
            abstractAsyncTaskC11008bPoll.m23657a(this.f22925b);
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC11008b.a
    /* JADX INFO: renamed from: a */
    public void mo23658a(AbstractAsyncTaskC11008b abstractAsyncTaskC11008b) {
        this.f22927d = null;
        m23661a();
    }

    /* JADX INFO: renamed from: b */
    public void m23662b(AbstractAsyncTaskC11008b abstractAsyncTaskC11008b) {
        abstractAsyncTaskC11008b.m23655a(this);
        this.f22926c.add(abstractAsyncTaskC11008b);
        if (this.f22927d == null) {
            m23661a();
        }
    }
}
