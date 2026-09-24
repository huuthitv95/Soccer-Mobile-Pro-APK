package com.bykv.p028vk.openvk.preload.geckox.p047f;

import android.os.Process;
import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.bykv.p028vk.openvk.preload.geckox.utils.ExecutorC1966c;
import com.bykv.p028vk.openvk.preload.geckox.utils.FileLock;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.f.c */
/* JADX INFO: compiled from: UsingLock.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1955c {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Pair<FileLock, AtomicLong>> f4423a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m6028a(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f4423a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair == null) {
                Pair<FileLock, AtomicLong> pair2 = new Pair<>(FileLock.m6061a(str, Process.myPid()), new AtomicLong(0L));
                map.put(str, pair2);
                pair = pair2;
            }
            ((AtomicLong) pair.second).incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6029b(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f4423a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair == null) {
                throw new RuntimeException("using.lock illegal state");
            }
            long jDecrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
            if (jDecrementAndGet < 0) {
                throw new RuntimeException("using.lock count illegal");
            }
            if (jDecrementAndGet == 0) {
                ((FileLock) pair.first).m6065a();
                map.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6030c(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f4423a;
        synchronized (map) {
            FileLock fileLockM6062b = FileLock.m6062b(str);
            if (fileLockM6062b == null) {
                return;
            }
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null && ((AtomicLong) pair.second).get() != 0) {
                fileLockM6062b.m6065a();
                FileLock.m6061a(str, Process.myPid());
                return;
            }
            File parentFile = new File(str).getParentFile();
            final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
            if (parentFile.renameTo(file)) {
                fileLockM6062b.m6065a();
                fileLockM6062b.m6066b();
                ExecutorC1966c.m6079a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.f.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1965b.m6075a(file);
                    }
                });
            }
        }
    }
}
