package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpk implements zzehe {
    private final zzefk zza;
    private final zzcol zzb;

    zzcpk(zzcol zzcolVar, zzcpi zzcpiVar, zzefk zzefkVar) {
        this.zzb = zzcolVar;
        this.zza = zzefkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehe
    public final zzefl zza() {
        zzcol zzcolVar = this.zzb;
        return zzefm.zza(zzcng.zzd(zzcolVar.zzI()), zzcnw.zzd(zzcolVar.zzI()), this.zza, zzbzv.zza());
    }
}
