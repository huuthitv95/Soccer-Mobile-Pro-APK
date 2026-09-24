package com.iab.omid.library.ironsrc.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11164c implements AbstractAsyncTaskC11163b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f23335a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f23336b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC11163b> f23337c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC11163b f23338d = null;

    public C11164c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23335a = linkedBlockingQueue;
        this.f23336b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m24430a() {
        AbstractAsyncTaskC11163b abstractAsyncTaskC11163bPoll = this.f23337c.poll();
        this.f23338d = abstractAsyncTaskC11163bPoll;
        if (abstractAsyncTaskC11163bPoll != null) {
            abstractAsyncTaskC11163bPoll.m24426a(this.f23336b);
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC11163b.a
    /* JADX INFO: renamed from: a */
    public void mo24427a(AbstractAsyncTaskC11163b abstractAsyncTaskC11163b) {
        this.f23338d = null;
        m24430a();
    }

    /* JADX INFO: renamed from: b */
    public void m24431b(AbstractAsyncTaskC11163b abstractAsyncTaskC11163b) {
        abstractAsyncTaskC11163b.m24424a(this);
        this.f23337c.add(abstractAsyncTaskC11163b);
        if (this.f23338d == null) {
            m24430a();
        }
    }
}
