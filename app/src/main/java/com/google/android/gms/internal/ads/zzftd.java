package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzftd implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzb;
    final /* synthetic */ zzftl zzc;

    zzftd(zzftl zzftlVar, long j, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = j;
        this.zzb = zzdxVar;
        Objects.requireNonNull(zzftlVar);
        this.zzc = zzftlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzftl zzftlVar = this.zzc;
        if (zzftlVar.zzI() != null) {
            zzfsp zzfspVarZzI = zzftlVar.zzI();
            long j = this.zza;
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzb;
            zzfspVarZzI.zzi(j, zzftl.zzQ(zzdxVar), zzftlVar.zzK(), zzftlVar.zze.zzd, zzftlVar.zzp(), zzftlVar.zzH());
        }
    }
}
