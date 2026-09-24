package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.EnumC12811e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.f */
/* JADX INFO: compiled from: DownloadRequestQueue.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12795f<T> {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, C12793d<T>> f34140a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<C12793d<T>>> f34141b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f34142c;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.f$b */
    /* JADX INFO: compiled from: DownloadRequestQueue.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private static final C12795f f34143a = new C12795f();
    }

    /* JADX INFO: renamed from: a */
    public static C12795f m35401a() {
        return b.f34143a;
    }

    /* JADX INFO: renamed from: b */
    private int m35403b() {
        return this.f34142c.incrementAndGet();
    }

    /* JADX INFO: renamed from: c */
    public void m35407c() {
    }

    private C12795f() {
        this.f34140a = new ConcurrentHashMap<>();
        this.f34142c = new AtomicInteger();
        this.f34141b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m35404a(C12793d<T> c12793d) {
        String strM35386f = c12793d.m35386f();
        c12793d.m35370a(m35403b());
        if (this.f34140a.containsKey(strM35386f)) {
            EnumC12811e enumC12811eM35390j = c12793d.m35390j();
            EnumC12811e enumC12811e = EnumC12811e.RETRY;
            if (enumC12811eM35390j != enumC12811e) {
                enumC12811e = EnumC12811e.DELAY;
            }
            c12793d.m35375a(enumC12811e);
            if (this.f34141b.containsKey(strM35386f)) {
                CopyOnWriteArrayList<C12793d<T>> copyOnWriteArrayList = this.f34141b.get(strM35386f);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(c12793d);
                    this.f34141b.remove(strM35386f);
                    this.f34141b.put(strM35386f, copyOnWriteArrayList);
                }
            } else {
                CopyOnWriteArrayList<C12793d<T>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(c12793d);
                this.f34141b.put(strM35386f, copyOnWriteArrayList2);
            }
        } else {
            EnumC12811e enumC12811eM35390j2 = c12793d.m35390j();
            EnumC12811e enumC12811e2 = EnumC12811e.RETRY;
            if (enumC12811eM35390j2 != enumC12811e2) {
                enumC12811e2 = EnumC12811e.QUEUED;
            }
            c12793d.m35375a(enumC12811e2);
            this.f34140a.put(strM35386f, c12793d);
            c12793d.m35377a(C12798i.m35415b().m35416a().getDownloadTasks().submit(new RunnableC12797h(c12793d)));
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m35406b(C12793d c12793d) {
        CopyOnWriteArrayList<C12793d<T>> copyOnWriteArrayListRemove;
        String strM35386f = c12793d.m35386f();
        this.f34140a.remove(strM35386f);
        if (this.f34141b.containsKey(strM35386f) && (copyOnWriteArrayListRemove = this.f34141b.remove(strM35386f)) != null && copyOnWriteArrayListRemove.size() > 0) {
            C12793d<T> c12793dRemove = copyOnWriteArrayListRemove.remove(0);
            c12793dRemove.m35375a(EnumC12811e.QUEUED);
            this.f34140a.put(strM35386f, c12793dRemove);
            c12793dRemove.m35377a(C12798i.m35415b().m35416a().getDownloadTasks().submit(new RunnableC12797h(c12793dRemove)));
            if (copyOnWriteArrayListRemove.size() > 0) {
                this.f34141b.put(strM35386f, copyOnWriteArrayListRemove);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m35405a(String str) {
        CopyOnWriteArrayList<C12793d<T>> copyOnWriteArrayList;
        if (!TextUtils.isEmpty(str) && this.f34141b.containsKey(str) && (copyOnWriteArrayList = this.f34141b.get(str)) != null && copyOnWriteArrayList.size() > 0) {
            for (C12793d<T> c12793d : copyOnWriteArrayList) {
                copyOnWriteArrayList.remove(c12793d);
                c12793d.m35379b(c12793d.m35382d());
            }
            if (copyOnWriteArrayList.size() > 0) {
                this.f34141b.remove(str);
                this.f34141b.put(str, copyOnWriteArrayList);
            } else {
                this.f34141b.remove(str);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            m35402a(this.f34140a.get(str), str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35402a(C12793d c12793d, String str) {
        if (c12793d != null) {
            c12793d.m35372a(c12793d.m35382d());
            this.f34140a.remove(str);
        }
    }
}
