package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwz {
    private final zzdfg zza;
    private final zzdhl zzb;

    public zzcwz(zzdfg zzdfgVar, zzdhl zzdhlVar) {
        this.zza = zzdfgVar;
        this.zzb = zzdhlVar;
    }

    public final zzdfg zza() {
        return this.zza;
    }

    final zzdke zzb() {
        zzdhl zzdhlVar = this.zzb;
        return zzdhlVar != null ? new zzdke(zzdhlVar, zzcff.zzh) : new zzdke(new zzcwy(this), zzcff.zzh);
    }

    final zzdhl zzc() {
        return this.zzb;
    }
}
