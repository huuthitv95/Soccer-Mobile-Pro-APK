package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdak implements zzimi {
    private final zzimr zza;

    private zzdak(zzczu zzczuVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdak zza(zzczu zzczuVar, zzimr zzimrVar) {
        return new zzdak(zzczuVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke((zzdbd) this.zza.zzb(), zzcff.zzh);
    }
}
