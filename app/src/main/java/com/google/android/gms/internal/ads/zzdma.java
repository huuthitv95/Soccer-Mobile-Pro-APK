package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdma implements zzimi {
    private final zzimr zza;

    private zzdma(zzdlr zzdlrVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdma zza(zzdlr zzdlrVar, zzimr zzimrVar) {
        return new zzdma(zzdlrVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke((zzdlk) this.zza.zzb(), zzcff.zzf);
    }
}
