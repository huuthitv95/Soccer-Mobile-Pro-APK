package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpz implements zzimi {
    private final zzdps zza;

    private zzdpz(zzdps zzdpsVar) {
        this.zza = zzdpsVar;
    }

    public static zzdpz zzc(zzdps zzdpsVar) {
        return new zzdpz(zzdpsVar);
    }

    public static zzdph zzd(zzdps zzdpsVar) {
        zzdph zzdphVarZza = zzdpsVar.zza();
        zzimq.zzb(zzdphVarZza);
        return zzdphVarZza;
    }

    public final zzdph zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
