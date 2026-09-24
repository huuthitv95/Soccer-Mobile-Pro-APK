package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzduc implements zzhbf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbpe zzb;

    zzduc(zzdul zzdulVar, String str, zzbpe zzbpeVar) {
        this.zza = str;
        this.zzb = zzbpeVar;
        Objects.requireNonNull(zzdulVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcki) obj).zzac(this.zza, this.zzb);
    }
}
