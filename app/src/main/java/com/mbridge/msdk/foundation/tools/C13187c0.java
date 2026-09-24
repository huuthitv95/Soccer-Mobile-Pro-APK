package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c0 */
/* JADX INFO: compiled from: FastKVConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C13187c0 {

    /* JADX INFO: renamed from: a */
    static volatile Executor f36258a;

    /* JADX INFO: renamed from: b */
    static FastKV.InterfaceC13171c f36259b = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c0$b */
    /* JADX INFO: compiled from: FastKVConfig.java */
    class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "mb-sp-handler");
        }
    }

    private C13187c0() {
    }

    /* JADX INFO: renamed from: a */
    static Executor m37643a() {
        if (f36258a == null) {
            synchronized (C13187c0.class) {
                if (f36258a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b(), new ThreadPoolExecutor.DiscardPolicy());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f36258a = threadPoolExecutor;
                }
            }
        }
        return f36258a;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c0$a */
    /* JADX INFO: compiled from: FastKVConfig.java */
    class a implements FastKV.InterfaceC13171c {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC13171c
        /* JADX INFO: renamed from: a */
        public void mo37554a(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37818c("FastKVConfig", str + " " + str2);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC13171c
        /* JADX INFO: renamed from: b */
        public void mo37555b(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC13171c
        /* JADX INFO: renamed from: a */
        public void mo37553a(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37819c("FastKVConfig", str, exc);
            }
        }
    }
}
