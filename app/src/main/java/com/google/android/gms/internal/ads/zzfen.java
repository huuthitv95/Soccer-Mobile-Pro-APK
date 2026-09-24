package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfen implements zzfby {
    private final zzcer zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzhbs zzd;
    private final int zze;

    zzfen(zzcer zzcerVar, boolean z, zzceh zzcehVar, zzhbs zzhbsVar, String str, ScheduledExecutorService scheduledExecutorService, int i) {
        this.zza = zzcerVar;
        this.zzb = z;
        this.zzd = zzhbsVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhX)).booleanValue() && this.zzb) {
            return zzhbi.zza(new zzfeo(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhZ)).split(",")).contains(String.valueOf(this.zze))) {
            return zzhbi.zza(new zzfeo(null));
        }
        ListenableFuture listenableFutureZza = zzhbi.zza(null);
        zzhbs zzhbsVar = this.zzd;
        return zzhbi.zzg(zzhbi.zzi(zzhbi.zzk(listenableFutureZza, zzfem.zza, zzhbsVar), ((Long) zzbkt.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzfel
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((Exception) obj);
            }
        }, zzhbsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 50;
    }

    final /* synthetic */ zzfeo zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzfeo(null);
    }
}
