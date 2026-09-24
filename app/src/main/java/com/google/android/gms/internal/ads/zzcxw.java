package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxw {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcxw(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public final void zza(zzhbf zzhbfVar) {
        zzhbi.zzr(this.zzc, new zzcxq(this, zzhbfVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final /* synthetic */ ListenableFuture zzc(zzhbf zzhbfVar, ListenableFuture listenableFuture, zzcxh zzcxhVar) {
        if (zzcxhVar != null) {
            zzhbfVar.zzb(zzcxhVar);
        }
        return zzhbi.zzi(listenableFuture, ((Long) zzbks.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    final /* synthetic */ void zze(List list, final zzhbf zzhbfVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhbfVar.zza(new zzedr(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureZza = zzhbi.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcxs
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    zzhbfVar.zza((Throwable) obj);
                    return zzhbi.zza(null);
                }
            };
            Executor executor = this.zza;
            listenableFutureZza = zzhbi.zzj(zzhbi.zzh(listenableFutureZza, Throwable.class, zzhaqVar, executor), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcxt
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzc(zzhbfVar, listenableFuture, (zzcxh) obj);
                }
            }, executor);
        }
        zzhbi.zzr(listenableFutureZza, new zzcxr(this, zzhbfVar), this.zza);
    }

    final /* synthetic */ void zzf() {
        zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
