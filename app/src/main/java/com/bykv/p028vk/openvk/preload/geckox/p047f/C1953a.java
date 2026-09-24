package com.bykv.p028vk.openvk.preload.geckox.p047f;

import com.bykv.p028vk.openvk.preload.geckox.utils.C1964a;
import com.bykv.p028vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.f.a */
/* JADX INFO: compiled from: ChannelUpdateLock.java */
/* JADX INFO: loaded from: classes9.dex */
public final class C1953a {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Lock> f4416a = new HashMap();

    /* JADX INFO: renamed from: b */
    private FileLock f4417b;

    /* JADX INFO: renamed from: c */
    private String f4418c;

    private C1953a(String str, FileLock fileLock) {
        this.f4418c = str;
        this.f4417b = fileLock;
    }

    /* JADX INFO: renamed from: a */
    public static C1953a m6024a(String str) throws Exception {
        Map<String, Lock> map = f4416a;
        synchronized (map) {
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            if (!reentrantLock.tryLock()) {
                return null;
            }
            try {
                FileLock fileLockM6063c = FileLock.m6063c(str);
                if (fileLockM6063c == null) {
                    reentrantLock.unlock();
                    return null;
                }
                return new C1953a(str, fileLockM6063c);
            } catch (Exception e) {
                reentrantLock.lock();
                C1964a.m6069a(new RuntimeException(e));
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6025a() {
        Map<String, Lock> map = f4416a;
        synchronized (map) {
            try {
                this.f4417b.m6065a();
                this.f4417b.m6066b();
                map.get(this.f4418c).unlock();
            } catch (Throwable th) {
                f4416a.get(this.f4418c).unlock();
                throw th;
            }
        }
    }
}
