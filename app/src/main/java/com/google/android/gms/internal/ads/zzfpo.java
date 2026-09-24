package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfpo implements zzhbf {
    final /* synthetic */ zzfps zza;
    final /* synthetic */ zzfpi zzb;
    final /* synthetic */ boolean zzc;

    zzfpo(zzfps zzfpsVar, zzfpi zzfpiVar, boolean z) {
        this.zza = zzfpsVar;
        this.zzb = zzfpiVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfpi zzfpiVar = this.zzb;
        if (zzfpiVar.zzb()) {
            zzfps zzfpsVar = this.zza;
            zzfpiVar.zzj(th);
            zzfpiVar.zzd(false);
            zzfpsVar.zza(zzfpiVar);
            if (this.zzc) {
                zzfpsVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        zzfpi zzfpiVar = this.zzb;
        zzfpiVar.zzd(true);
        zzfps zzfpsVar = this.zza;
        zzfpsVar.zza(zzfpiVar);
        if (this.zzc) {
            zzfpsVar.zzh();
        }
    }
}
