package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbtx implements zzcfo {
    final /* synthetic */ zzbtc zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcfk zzc;
    final /* synthetic */ zzbua zzd;

    zzbtx(zzbua zzbuaVar, zzbtc zzbtcVar, Object obj, zzcfk zzcfkVar) {
        this.zza = zzbtcVar;
        this.zzb = obj;
        this.zzc = zzcfkVar;
        Objects.requireNonNull(zzbuaVar);
        this.zzd = zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcfk zzcfkVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbtj) obj, obj2, zzcfkVar);
    }
}
