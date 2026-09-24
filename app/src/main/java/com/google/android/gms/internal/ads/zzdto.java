package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdto implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdto(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdto zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdto(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdtn((zzdpc) this.zza.zzb(), ((zzdpz) this.zzb).zza());
    }
}
