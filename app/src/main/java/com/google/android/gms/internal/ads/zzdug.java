package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdug {
    private final zzdcd zza;
    private final zzddm zzb;
    private final zzddz zzc;
    private final zzdeq zzd;
    private final zzdhj zze;
    private final zzfjt zzf;
    private final zzfjw zzg;
    private final zzcsx zzh;

    public zzdug(zzdcd zzdcdVar, zzddm zzddmVar, zzddz zzddzVar, zzdeq zzdeqVar, zzdhj zzdhjVar, zzfjt zzfjtVar, zzfjw zzfjwVar, zzcsx zzcsxVar) {
        this.zza = zzdcdVar;
        this.zzb = zzddmVar;
        this.zzc = zzddzVar;
        this.zzd = zzdeqVar;
        this.zze = zzdhjVar;
        this.zzf = zzfjtVar;
        this.zzg = zzfjwVar;
        this.zzh = zzcsxVar;
    }

    public final void zza(zzdul zzdulVar) {
        final zzddm zzddmVar = this.zzb;
        zzdtz zzdtzVarZzk = zzdulVar.zzk();
        Objects.requireNonNull(zzddmVar);
        zzdtzVarZzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzddmVar.zzb();
            }
        });
        zzdulVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
