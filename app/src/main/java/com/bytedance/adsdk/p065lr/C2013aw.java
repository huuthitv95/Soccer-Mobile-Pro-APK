package com.bytedance.adsdk.p065lr;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2013aw<T> {

    /* JADX INFO: renamed from: ri */
    public static Executor f4667ri = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: fi */
    private volatile C2015co<T> f4668fi;

    /* JADX INFO: renamed from: ik */
    private final Set<InterfaceC2159sf<Throwable>> f4669ik;

    /* JADX INFO: renamed from: ka */
    private final Handler f4670ka;

    /* JADX INFO: renamed from: lr */
    private final Set<InterfaceC2159sf<T>> f4671lr;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.aw$ri */
    private class ri extends FutureTask<C2015co<T>> {
        ri(Callable<C2015co<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C2013aw.this.m6459ri((C2015co) get());
            } catch (InterruptedException | ExecutionException e) {
                C2013aw.this.m6459ri(new C2015co(e));
            }
        }
    }

    public C2013aw(Callable<C2015co<T>> callable) {
        this(callable, false);
    }

    C2013aw(Callable<C2015co<T>> callable, boolean z) {
        this.f4671lr = new LinkedHashSet(1);
        this.f4669ik = new LinkedHashSet(1);
        this.f4670ka = new Handler(Looper.getMainLooper());
        this.f4668fi = null;
        if (!z) {
            f4667ri.execute(new ri(callable));
            return;
        }
        try {
            m6459ri((C2015co) callable.call());
        } catch (Throwable th) {
            m6459ri((C2015co) new C2015co<>(th));
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6455ri() {
        this.f4670ka.post(new Runnable() { // from class: com.bytedance.adsdk.lr.aw.1
            @Override // java.lang.Runnable
            public void run() {
                C2015co c2015co = C2013aw.this.f4668fi;
                if (c2015co == null) {
                    return;
                }
                if (c2015co.m6474ri() != null) {
                    C2013aw.this.m6460ri(c2015co.m6474ri());
                } else {
                    C2013aw.this.m6461ri(c2015co.m6473lr());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m6459ri(C2015co<T> c2015co) {
        if (this.f4668fi != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f4668fi = c2015co;
        m6455ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public synchronized void m6460ri(T t) {
        Iterator it = new ArrayList(this.f4671lr).iterator();
        while (it.hasNext()) {
            ((InterfaceC2159sf) it.next()).mo6534ri(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public synchronized void m6461ri(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f4669ik);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC2159sf) it.next()).mo6534ri(th);
        }
    }

    /* JADX INFO: renamed from: ik */
    public synchronized C2013aw<T> m6462ik(InterfaceC2159sf<Throwable> interfaceC2159sf) {
        C2015co<T> c2015co = this.f4668fi;
        if (c2015co != null && c2015co.m6473lr() != null) {
            interfaceC2159sf.mo6534ri(c2015co.m6473lr());
        }
        this.f4669ik.add(interfaceC2159sf);
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public synchronized C2013aw<T> m6463ka(InterfaceC2159sf<Throwable> interfaceC2159sf) {
        this.f4669ik.remove(interfaceC2159sf);
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public synchronized C2013aw<T> m6464lr(InterfaceC2159sf<T> interfaceC2159sf) {
        this.f4671lr.remove(interfaceC2159sf);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized C2013aw<T> m6465ri(InterfaceC2159sf<T> interfaceC2159sf) {
        C2015co<T> c2015co = this.f4668fi;
        if (c2015co != null && c2015co.m6474ri() != null) {
            interfaceC2159sf.mo6534ri(c2015co.m6474ri());
        }
        this.f4671lr.add(interfaceC2159sf);
        return this;
    }
}
