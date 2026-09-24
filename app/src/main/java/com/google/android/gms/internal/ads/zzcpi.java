package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpi implements zzegx {
    final zzimr zza;
    final zzimr zzb;
    private final zzcol zzc;
    private final zzcpi zzd = this;

    zzcpi(zzcol zzcolVar, Context context) {
        this.zzc = zzcolVar;
        zzeif zzeifVarZzc = zzeif.zzc(zzcolVar.zzaG);
        this.zza = zzeifVarZzc;
        this.zzb = zzehx.zza(zzcolVar.zzf, zzfno.zza(), zzcof.zza, zzcolVar.zzaF, zzeifVarZzc, zzcolVar.zzaH, zzcoc.zza, zzcolVar.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzegx
    public final zzehb zza() {
        zzcol zzcolVar = this.zzc;
        zzimr zzimrVar = zzcolVar.zzp;
        zzcmz zzcmzVarZzI = zzcolVar.zzI();
        return zzehc.zza(zzcng.zzd(zzcolVar.zzI()), zzfnu.zzc(), zzfno.zzc(), zzimh.zzc(this.zzb), zzcnw.zzd(zzcmzVarZzI), this, (zzdyz) zzimrVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzegx
    public final zzehd zzb() {
        return new zzcpj(this.zzc, this.zzd, null);
    }
}
