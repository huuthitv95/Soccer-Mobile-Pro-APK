package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeue implements zzfby {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzeue(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zza;
        zzeud zzeudVar = zzeud.zza;
        Executor executor = this.zzb;
        ListenableFuture listenableFutureZzj = zzhbi.zzj(listenableFuture, zzeudVar, executor);
        zzbhv zzbhvVar = zzbie.zznU;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue() > 0) {
            listenableFutureZzj = zzhbi.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzhbi.zzh(listenableFutureZzj, Throwable.class, zzeuc.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 6;
    }
}
