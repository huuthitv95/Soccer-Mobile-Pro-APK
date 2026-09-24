package com.bykv.p028vk.openvk.preload.p029a;

import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.p029a.p030a.C1881a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.g */
/* JADX INFO: compiled from: ParallelInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1889g<T> extends AbstractC1886d<List<T>, T> {
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5832a(final InterfaceC1882b interfaceC1882b, Object obj) throws Throwable {
        List list = (List) obj;
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        final CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        for (final Object obj2 : list) {
            C1910b.m5921t().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.a.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        try {
                            copyOnWriteArrayList.add(interfaceC1882b.mo5836a(obj2));
                        } catch (Throwable th) {
                            countDownLatch.countDown();
                            throw th;
                        }
                    } catch (C1891i.a e) {
                        Throwable cause = e.getCause();
                        copyOnWriteArrayList2.add(cause);
                        C1889g.this.m5854d(cause);
                    } catch (Throwable th2) {
                        copyOnWriteArrayList2.add(th2);
                        C1889g.this.m5854d(th2);
                    }
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        if (copyOnWriteArrayList2.isEmpty()) {
            return copyOnWriteArrayList;
        }
        throw new C1881a(copyOnWriteArrayList2);
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        super.mo5848a(objArr);
        if (objArr != null) {
            if (objArr.length != 1) {
                throw new IllegalArgumentException("ParallelInterceptor only need one param");
            }
            if (!(objArr[0] instanceof Executor)) {
                throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
            }
        }
    }
}
