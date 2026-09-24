package com.iab.omid.library.unity3d.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11261c implements AbstractAsyncTaskC11260b.a {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<Runnable> f23598a;

    /* JADX INFO: renamed from: b */
    private final ThreadPoolExecutor f23599b;

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC11260b> f23600c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private AbstractAsyncTaskC11260b f23601d = null;

    public C11261c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23598a = linkedBlockingQueue;
        this.f23599b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    private void m24917a() {
        AbstractAsyncTaskC11260b abstractAsyncTaskC11260bPoll = this.f23600c.poll();
        this.f23601d = abstractAsyncTaskC11260bPoll;
        if (abstractAsyncTaskC11260bPoll != null) {
            abstractAsyncTaskC11260bPoll.m24913a(this.f23599b);
        }
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC11260b.a
    /* JADX INFO: renamed from: a */
    public void mo24914a(AbstractAsyncTaskC11260b abstractAsyncTaskC11260b) {
        this.f23601d = null;
        m24917a();
    }

    /* JADX INFO: renamed from: b */
    public void m24918b(AbstractAsyncTaskC11260b abstractAsyncTaskC11260b) {
        abstractAsyncTaskC11260b.m24911a(this);
        this.f23600c.add(abstractAsyncTaskC11260b);
        if (this.f23601d == null) {
            m24917a();
        }
    }
}
