package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdue implements zzhbf {
    final /* synthetic */ zzfjt zza;
    final /* synthetic */ zzfjw zzb;
    final /* synthetic */ zzcsx zzc;
    final /* synthetic */ zzdul zzd;

    zzdue(zzdul zzdulVar, zzfjt zzfjtVar, zzfjw zzfjwVar, zzcsx zzcsxVar) {
        this.zza = zzfjtVar;
        this.zzb = zzfjwVar;
        this.zzc = zzcsxVar;
        Objects.requireNonNull(zzdulVar);
        this.zzd = zzdulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcki zzckiVar = (zzcki) obj;
        zzfjt zzfjtVar = this.zza;
        zzckiVar.zzaD(zzfjtVar, this.zzb);
        zzcmg zzcmgVarZzP = zzckiVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzly)).booleanValue() && zzcmgVarZzP != null) {
            zzcsx zzcsxVar = this.zzc;
            zzdul zzdulVar = this.zzd;
            zzcmgVarZzP.zzd(zzcsxVar, zzdulVar.zzm(), zzdulVar.zzn());
            zzcmgVarZzP.zze(zzcsxVar, zzdulVar.zzm(), zzdulVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzox)).booleanValue() || zzcmgVarZzP == null) {
            return;
        }
        zzcmgVarZzP.zzb(zzfjtVar);
    }
}
