package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgda implements zzgfw {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    private final zzgcu zzf;
    private final zzgda zzg = this;

    zzgda(zzgcu zzgcuVar) {
        this.zzf = zzgcuVar;
        zzimr zzimrVarZza = zzimh.zza(zzgfz.zza());
        this.zza = zzimrVarZza;
        zzimr zzimrVarZza2 = zzimh.zza(zzghj.zza(zzgcuVar.zza, zzgcuVar.zzc, zzgcuVar.zzG, zzimrVarZza, zzgcuVar.zzJ, zzgcuVar.zzu, zzgcuVar.zzj, zzghm.zza()));
        this.zzb = zzimrVarZza2;
        zzimr zzimrVarZza3 = zzimh.zza(zzgge.zza());
        this.zzc = zzimrVarZza3;
        zzgcz zzgczVar = new zzgcz(this);
        this.zzd = zzgczVar;
        this.zze = zzimh.zza(zzgfx.zza(zzgcuVar.zzc, zzimrVarZza2, zzgcuVar.zzG, zzgcuVar.zzF, zzimrVarZza3, zzgczVar, zzgcuVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfe zza() {
        return (zzgfe) this.zze.zzb();
    }

    final /* synthetic */ zzgcu zzb() {
        return this.zzf;
    }

    final /* synthetic */ zzgda zzc() {
        return this.zzg;
    }
}
