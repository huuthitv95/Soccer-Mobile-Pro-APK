package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwh implements zzimi {
    private final zzimr zza;

    private zzdwh(zzdwg zzdwgVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdwh zza(zzdwg zzdwgVar, zzimr zzimrVar) {
        return new zzdwh(zzdwgVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke(((zzdwf) this.zza).zzb(), zzcff.zzf);
    }
}
