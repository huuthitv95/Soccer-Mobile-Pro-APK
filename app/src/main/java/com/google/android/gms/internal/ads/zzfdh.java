package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdh implements zzfby {
    private final zzcer zza;
    private final ScheduledExecutorService zzb;
    private final zzhbs zzc;

    zzfdh(String str, zzbgg zzbggVar, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzhbs zzhbsVar) {
        this.zza = zzcerVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzhbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdP)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdU)).booleanValue()) {
                ListenableFuture listenableFutureZza = zzgcc.zza(Tasks.forResult(null), null);
                zzhbs zzhbsVar = this.zzc;
                ListenableFuture listenableFutureZzj = zzhbi.zzj(listenableFutureZza, zzfdg.zza, zzhbsVar);
                if (((Boolean) zzbjr.zza.zze()).booleanValue()) {
                    listenableFutureZzj = zzhbi.zzi(listenableFutureZzj, ((Long) zzbjr.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzhbi.zzg(listenableFutureZzj, Exception.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzfdf
                    @Override // com.google.android.gms.internal.ads.zzgsn
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzhbsVar);
            }
        }
        return zzhbi.zza(new zzfdi(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 43;
    }

    final /* synthetic */ zzfdi zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfdi(null, -1);
    }
}
