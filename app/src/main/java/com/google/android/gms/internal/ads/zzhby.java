package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhby extends zzhbu implements zzhbt {
    final ScheduledExecutorService zza;

    zzhby(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzhbr schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhch zzhchVarZze = zzhch.zze(runnable, null);
        return new zzhbw(zzhchVarZze, scheduledExecutorService.schedule(zzhchVarZze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhbr schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzhch zzhchVar = new zzhch(callable);
        return new zzhbw(zzhchVar, this.zza.schedule(zzhchVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzhbr scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhbx zzhbxVar = new zzhbx(runnable);
        return new zzhbw(zzhbxVar, this.zza.scheduleAtFixedRate(zzhbxVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhbr scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhbx zzhbxVar = new zzhbx(runnable);
        return new zzhbw(zzhbxVar, this.zza.scheduleWithFixedDelay(zzhbxVar, j, j2, timeUnit));
    }
}
