package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfok implements zzhbf {
    final /* synthetic */ zzfof zza;
    final /* synthetic */ zzfop zzb;

    zzfok(zzfop zzfopVar, zzfof zzfofVar) {
        this.zza = zzfofVar;
        Objects.requireNonNull(zzfopVar);
        this.zzb = zzfopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
