package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdac implements zzimi {
    private final zzimr zza;

    private zzdac(zzczu zzczuVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdac zza(zzczu zzczuVar, zzimr zzimrVar) {
        return new zzdac(zzczuVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke((zzcyc) this.zza.zzb(), zzcff.zzh);
    }
}
