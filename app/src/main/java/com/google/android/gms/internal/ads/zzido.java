package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzido implements zzidf {
    final int zza;
    final zzigu zzb;
    final boolean zzc;
    final boolean zzd;

    zzido(zzidw zzidwVar, int i, zzigu zziguVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zziguVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzido) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final zzigu zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final zzigv zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final boolean zze() {
        return this.zzd;
    }
}
