package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcfq implements zzhbf {
    final /* synthetic */ zzcfo zza;
    final /* synthetic */ zzcfm zzb;

    zzcfq(zzcfr zzcfrVar, zzcfo zzcfoVar, zzcfm zzcfmVar) {
        this.zza = zzcfoVar;
        this.zzb = zzcfmVar;
        Objects.requireNonNull(zzcfrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
