package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.a */
/* JADX INFO: compiled from: DefaultExecutorSupplier.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12790a implements InterfaceC12799j {

    /* JADX INFO: renamed from: a */
    private final ThreadPoolExecutor f34094a;

    /* JADX INFO: renamed from: b */
    private final C12791b f34095b;

    C12790a(int i) {
        C12791b c12791b = new C12791b(i <= 0 ? 10 : i, new ThreadFactoryC12804o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.f34095b = c12791b;
        c12791b.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC12804o(10), new ThreadPoolExecutor.DiscardPolicy());
        this.f34094a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12799j
    public ExecutorService getDownloadResultTasks() {
        return this.f34094a;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.InterfaceC12799j
    public C12791b getDownloadTasks() {
        return this.f34095b;
    }
}
