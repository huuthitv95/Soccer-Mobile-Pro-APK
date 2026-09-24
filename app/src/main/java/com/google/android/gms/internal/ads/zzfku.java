package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfku implements zzhbf {
    final /* synthetic */ zzcki zza;
    final /* synthetic */ zzcsx zzb;
    final /* synthetic */ zzfro zzc;
    final /* synthetic */ zzeju zzd;

    zzfku(zzcki zzckiVar, zzcsx zzcsxVar, zzfro zzfroVar, zzeju zzejuVar) {
        this.zza = zzckiVar;
        this.zzb = zzcsxVar;
        this.zzc = zzfroVar;
        this.zzd = zzejuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsx zzcsxVar;
        String str = (String) obj;
        zzcki zzckiVar = this.zza;
        zzfjt zzfjtVarZzC = zzckiVar.zzC();
        if (zzfjtVarZzC != null && !zzfjtVarZzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfjtVarZzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlu)).booleanValue() && (zzcsxVar = this.zzb) != null && zzcsx.zzc(str)) {
                zzcsxVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zzh(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzfjw zzfjwVarZzaC = zzckiVar.zzaC();
        if (zzfjwVarZzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzckiVar.getContext());
        boolean z = false;
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhj)).booleanValue() && zzfjtVarZzC != null && zzfjtVarZzC.zzS;
        if (zzfjtVarZzC != null && zzfjtVarZzC.zzad != null) {
            z = true;
        }
        this.zzd.zze(new zzejw(jCurrentTimeMillis, zzfjwVarZzaC.zzb, str, (zZzs || z2 || z) ? 2 : 1));
    }
}
