package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeob {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcxk zzc;
    private final zzeor zzd;
    private final zzfrk zze;
    private final zzhcb zzf = zzhcb.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzeoc zzh;
    private zzfke zzi;

    zzeob(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcxk zzcxkVar, zzeor zzeorVar, zzfrk zzfrkVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcxkVar;
        this.zzd = zzeorVar;
        this.zze = zzfrkVar;
    }

    private final synchronized ListenableFuture zzd(zzfjt zzfjtVar) {
        Iterator it = zzfjtVar.zza.iterator();
        while (it.hasNext()) {
            zzelg zzelgVarZza = this.zzc.zza(zzfjtVar.zzb, (String) it.next());
            if (zzelgVarZza != null && zzelgVarZza.zza(this.zzi, zzfjtVar)) {
                return zzhbi.zzi(zzelgVarZza.zzb(this.zzi, zzfjtVar), zzfjtVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzhbi.zzc(new zzedr(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfjt zzfjtVar) {
        ListenableFuture listenableFutureZzd = zzd(zzfjtVar);
        this.zzd.zze(this.zzi, zzfjtVar, listenableFutureZzd, this.zze);
        zzhbi.zzr(listenableFutureZzd, new zzeoa(this, zzfjtVar), this.zza);
    }

    public final synchronized ListenableFuture zza(zzfke zzfkeVar) {
        if (!this.zzg.getAndSet(true)) {
            List list = zzfkeVar.zzb.zza;
            if (list.isEmpty()) {
                this.zzf.zzb(new zzeov(3, zzeoy.zzb(zzfkeVar)));
            } else {
                this.zzi = zzfkeVar;
                zzeor zzeorVar = this.zzd;
                this.zzh = new zzeoc(zzfkeVar, zzeorVar, this.zzf);
                zzeorVar.zzc(list);
                zzfjt zzfjtVarZza = this.zzh.zza();
                while (zzfjtVarZza != null) {
                    zzb(zzfjtVarZza);
                    zzfjtVarZza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }

    final /* synthetic */ zzeoc zzc() {
        return this.zzh;
    }
}
