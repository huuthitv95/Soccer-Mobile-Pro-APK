package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.o */
/* JADX INFO: compiled from: PriorityThreadFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class ThreadFactoryC12804o implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final int f34179a;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.o$a */
    /* JADX INFO: compiled from: PriorityThreadFactory.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f34180a;

        a(Runnable runnable) {
            this.f34180a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(ThreadFactoryC12804o.this.f34179a);
            } catch (Throwable unused) {
            }
            try {
                this.f34180a.run();
            } catch (Exception unused2) {
            }
        }
    }

    ThreadFactoryC12804o(int i) {
        this.f34179a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
