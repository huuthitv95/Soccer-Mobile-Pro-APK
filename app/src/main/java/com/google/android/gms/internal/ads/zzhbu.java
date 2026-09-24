package com.google.android.gms.internal.ads;

import com.ironsource.C11744X3;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzhbu extends zzhae {
    private final ExecutorService zza;

    zzhbu(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.zza.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zza.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.zza;
        String string = super.toString();
        String strValueOf = String.valueOf(executorService);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(strValueOf).length() + 1);
        sb.append(string);
        sb.append(C11744X3.j.f26438d);
        sb.append(strValueOf);
        sb.append(C11744X3.j.f26440e);
        return sb.toString();
    }
}
