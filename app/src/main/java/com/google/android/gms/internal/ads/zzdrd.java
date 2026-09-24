package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdrd implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdrd(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdrd zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdrd(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdrc((zzdvw) this.zza.zzb(), ((zzdoi) this.zzb).zza());
    }
}
