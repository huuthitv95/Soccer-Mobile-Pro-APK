package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzelh implements zzelg {
    public final zzelg zza;
    private final zzgsn zzb;

    public zzelh(zzelg zzelgVar, zzgsn zzgsnVar) {
        this.zza = zzelgVar;
        this.zzb = zzgsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        return this.zza.zza(zzfkeVar, zzfjtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(zzfke zzfkeVar, zzfjt zzfjtVar) {
        return zzhbi.zzk(this.zza.zzb(zzfkeVar, zzfjtVar), this.zzb, zzcff.zza);
    }
}
