package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzduq {
    private final zzdcd zza;
    private final zzddm zzb;
    private final zzddz zzc;
    private final zzdeq zzd;
    private final zzdhj zze;
    private final zzdkk zzf;
    private final zzdyz zzg;
    private final zzfro zzh;
    private final zzeju zzi;
    private final zzcsx zzj;

    zzduq(zzdcd zzdcdVar, zzddm zzddmVar, zzddz zzddzVar, zzdeq zzdeqVar, zzdhj zzdhjVar, zzdkk zzdkkVar, zzdyz zzdyzVar, zzfro zzfroVar, zzeju zzejuVar, zzcsx zzcsxVar) {
        this.zza = zzdcdVar;
        this.zzb = zzddmVar;
        this.zzc = zzddzVar;
        this.zzd = zzdeqVar;
        this.zze = zzdhjVar;
        this.zzf = zzdkkVar;
        this.zzg = zzdyzVar;
        this.zzh = zzfroVar;
        this.zzi = zzejuVar;
        this.zzj = zzcsxVar;
    }

    public final void zza(zzdur zzdurVar, zzcki zzckiVar) throws Throwable {
        zzduo zzduoVarZzb = zzdurVar.zzb();
        final zzddm zzddmVar = this.zzb;
        Objects.requireNonNull(zzddmVar);
        zzduoVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdup
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzddmVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlA)).booleanValue() || zzckiVar == null || zzckiVar.zzP() == null) {
            return;
        }
        zzcmg zzcmgVarZzP = zzckiVar.zzP();
        zzcsx zzcsxVar = this.zzj;
        zzeju zzejuVar = this.zzi;
        zzcmgVarZzP.zzd(zzcsxVar, zzejuVar, this.zzh);
        zzcmgVarZzP.zze(zzcsxVar, zzejuVar, this.zzg);
    }
}
