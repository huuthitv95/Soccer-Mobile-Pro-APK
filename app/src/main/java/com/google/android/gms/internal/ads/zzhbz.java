package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhbz {
    public static Executor zza() {
        return zzhax.INSTANCE;
    }

    public static zzhbs zzb(ExecutorService executorService) {
        if (executorService instanceof zzhbs) {
            return (zzhbs) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzhby((ScheduledExecutorService) executorService) : new zzhbu(executorService);
    }

    public static zzhbt zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzhby(scheduledExecutorService);
    }

    static Executor zzd(final Executor executor, final zzhab zzhabVar) {
        executor.getClass();
        return executor == zzhax.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzhbv
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzhbz.zzf(executor, zzhabVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzhab zzhabVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            zzhabVar.zzb(e);
        }
    }
}
