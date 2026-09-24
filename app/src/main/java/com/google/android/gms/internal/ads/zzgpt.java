package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpt implements zzhbf {
    final /* synthetic */ zzgps zza;

    zzgpt(zzgpu zzgpuVar, zzgps zzgpsVar) {
        this.zza = zzgpsVar;
        Objects.requireNonNull(zzgpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzgps zzgpsVar = this.zza;
        zzgpsVar.zzb(th);
        zzgpsVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
