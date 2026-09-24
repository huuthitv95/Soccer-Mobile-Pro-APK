package com.bykv.p028vk.openvk.preload.geckox.p047f;

import com.bykv.p028vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.f.b */
/* JADX INFO: compiled from: SelectChannelVersionLock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1954b {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Lock> f4419a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static ReentrantLock f4420b = new ReentrantLock();

    /* JADX INFO: renamed from: c */
    private String f4421c;

    /* JADX INFO: renamed from: d */
    private FileLock f4422d;

    private C1954b(String str, FileLock fileLock) {
        this.f4421c = str;
        this.f4422d = fileLock;
    }

    /* JADX INFO: renamed from: a */
    public static C1954b m6026a(String str) throws Exception {
        f4420b.lock();
        try {
            FileLock fileLockM6060a = FileLock.m6060a(str);
            Map<String, Lock> map = f4419a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new C1954b(str, fileLockM6060a);
        } catch (Exception e) {
            f4420b.unlock();
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6027a() {
        try {
            this.f4422d.m6065a();
            this.f4422d.m6066b();
            Lock lock = f4419a.get(this.f4421c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f4420b.unlock();
        }
    }
}
