package com.iab.omid.library.vungle.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11325c implements AbstractAsyncTaskC11324b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f23763a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f23764b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC11324b> f23765c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC11324b f23766d = null;

    public C11325c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23763a = linkedBlockingQueue;
        this.f23764b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m25222a() {
        AbstractAsyncTaskC11324b abstractAsyncTaskC11324bPoll = this.f23765c.poll();
        this.f23766d = abstractAsyncTaskC11324bPoll;
        if (abstractAsyncTaskC11324bPoll != null) {
            abstractAsyncTaskC11324bPoll.m25218a(this.f23764b);
        }
    }

    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC11324b.a
    /* JADX INFO: renamed from: a */
    public void mo25219a(AbstractAsyncTaskC11324b abstractAsyncTaskC11324b) {
        this.f23766d = null;
        m25222a();
    }

    /* JADX INFO: renamed from: b */
    public void m25223b(AbstractAsyncTaskC11324b abstractAsyncTaskC11324b) {
        abstractAsyncTaskC11324b.m25216a(this);
        this.f23765c.add(abstractAsyncTaskC11324b);
        if (this.f23766d == null) {
            m25222a();
        }
    }
}
