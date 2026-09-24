package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcxq implements zzhbf {
    final /* synthetic */ zzhbf zza;
    final /* synthetic */ zzcxw zzb;

    zzcxq(zzcxw zzcxwVar, zzhbf zzhbfVar) {
        this.zza = zzhbfVar;
        Objects.requireNonNull(zzcxwVar);
        this.zzb = zzcxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        this.zza.zza(th);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcxp) obj).zza, this.zza);
    }
}
