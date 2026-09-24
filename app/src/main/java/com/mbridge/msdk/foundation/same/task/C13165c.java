package com.mbridge.msdk.foundation.same.task;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.c */
/* JADX INFO: compiled from: CommonTaskLoaderThreadPool.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C13165c {

    /* JADX INFO: renamed from: a */
    private static volatile ThreadPoolExecutor f36202a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.c$a */
    /* JADX INFO: compiled from: CommonTaskLoaderThreadPool.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("mb-task-loader-thread");
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    private static ThreadFactory m37538a() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m37539b() {
        m37540c();
        if (f36202a == null) {
            int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f36202a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), m37538a(), new ThreadPoolExecutor.DiscardPolicy());
            f36202a.allowCoreThreadTimeOut(true);
        }
        return f36202a;
    }

    /* JADX INFO: renamed from: c */
    private static void m37540c() {
        if (f36202a != null) {
            return;
        }
        int iM37537a = m37537a(10, "c_t_l_t_p_c");
        int iM37537a2 = m37537a(50, "c_t_l_t_p_m");
        int iM37537a3 = m37537a(5, "c_t_l_t_p_t");
        int i = iM37537a2 < iM37537a ? iM37537a : iM37537a2;
        try {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + iM37537a + " max " + i + " timeout " + iM37537a3);
            }
            long j = iM37537a3;
            if (j <= 0) {
                j = 1;
            }
            f36202a = new ThreadPoolExecutor(iM37537a, i, j, TimeUnit.SECONDS, new LinkedBlockingDeque(), m37538a(), new ThreadPoolExecutor.DiscardPolicy());
            f36202a.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m37537a(int i, String str) {
        try {
            int iM37843b = C13223s0.m37831a().m37843b(str, i);
            return iM37843b <= 0 ? i : iM37843b;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("CommonTaskLoaderThreadPool", e.getMessage());
            }
        }
    }
}
