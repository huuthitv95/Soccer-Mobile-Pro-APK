package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.util.a */
/* JADX INFO: compiled from: ApiCallResultLatch.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12768a<T> {

    /* JADX INFO: renamed from: a */
    private final CountDownLatch f34004a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b */
    private final AtomicReference<T> f34005b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f34006c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public T m35184a(long j) throws InterruptedException {
        if (this.f34004a.await(j, TimeUnit.MILLISECONDS)) {
            return this.f34005b.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m35185a(T t) {
        if (!this.f34006c.compareAndSet(false, true)) {
            return false;
        }
        this.f34005b.set(t);
        this.f34004a.countDown();
        return true;
    }
}
