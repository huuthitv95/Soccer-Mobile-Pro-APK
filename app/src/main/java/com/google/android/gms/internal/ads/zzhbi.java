package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhbi extends zzhbk {
    public static ListenableFuture zza(Object obj) {
        return obj == null ? zzhbm.zza : new zzhbm(obj);
    }

    public static ListenableFuture zzb() {
        return zzhbm.zza;
    }

    public static ListenableFuture zzd(Callable callable, Executor executor) {
        zzhch zzhchVar = new zzhch(callable);
        executor.execute(zzhchVar);
        return zzhchVar;
    }

    public static ListenableFuture zze(Runnable runnable, Executor executor) {
        zzhch zzhchVarZze = zzhch.zze(runnable, null);
        executor.execute(zzhchVarZze);
        return zzhchVarZze;
    }

    public static ListenableFuture zzf(zzhap zzhapVar, Executor executor) {
        zzhch zzhchVar = new zzhch(zzhapVar);
        executor.execute(zzhchVar);
        return zzhchVar;
    }

    public static ListenableFuture zzg(ListenableFuture listenableFuture, Class cls, zzgsn zzgsnVar, Executor executor) {
        int i = zzhaa.zzd;
        zzgzz zzgzzVar = new zzgzz(listenableFuture, cls, zzgsnVar);
        listenableFuture.addListener(zzgzzVar, zzhbz.zzd(executor, zzgzzVar));
        return zzgzzVar;
    }

    public static ListenableFuture zzh(ListenableFuture listenableFuture, Class cls, zzhaq zzhaqVar, Executor executor) {
        int i = zzhaa.zzd;
        zzgzy zzgzyVar = new zzgzy(listenableFuture, cls, zzhaqVar);
        listenableFuture.addListener(zzgzyVar, zzhbz.zzd(executor, zzgzyVar));
        return zzgzyVar;
    }

    public static ListenableFuture zzi(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzhce.zze(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static ListenableFuture zzj(ListenableFuture listenableFuture, zzhaq zzhaqVar, Executor executor) {
        int i = zzhah.zzc;
        zzhaf zzhafVar = new zzhaf(listenableFuture, zzhaqVar);
        listenableFuture.addListener(zzhafVar, zzhbz.zzd(executor, zzhafVar));
        return zzhafVar;
    }

    public static ListenableFuture zzk(ListenableFuture listenableFuture, zzgsn zzgsnVar, Executor executor) {
        int i = zzhah.zzc;
        zzhag zzhagVar = new zzhag(listenableFuture, zzgsnVar);
        listenableFuture.addListener(zzhagVar, zzhbz.zzd(executor, zzhagVar));
        return zzhagVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzhar(zzgvz.zzr(listenableFutureArr), true);
    }

    public static ListenableFuture zzm(Iterable iterable) {
        return new zzhar(zzgvz.zzp(iterable), true);
    }

    public static zzhbh zzn(Iterable iterable) {
        return new zzhbh(false, zzgvz.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzhbh zzo(ListenableFuture... listenableFutureArr) {
        return new zzhbh(true, zzgvz.zzr(listenableFutureArr), null);
    }

    public static zzhbh zzp(Iterable iterable) {
        return new zzhbh(true, zzgvz.zzp(iterable), null);
    }

    @SafeVarargs
    public static ListenableFuture zzq(ListenableFuture... listenableFutureArr) {
        return new zzhar(zzgvz.zzr(listenableFutureArr), false);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhcj.zza(future);
        }
        throw new IllegalStateException(zzgtn.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhcj.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzhay((Error) e.getCause());
            }
            throw new zzhci(e.getCause());
        }
    }

    public static ListenableFuture zzc(Throwable th) {
        th.getClass();
        return new zzhbl(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzhbf zzhbfVar, Executor executor) {
        zzhbfVar.getClass();
        listenableFuture.addListener(new zzhbg(listenableFuture, zzhbfVar), executor);
    }
}
