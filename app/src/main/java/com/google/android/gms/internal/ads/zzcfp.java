package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcfp implements zzhbf {
    final /* synthetic */ zzcfr zza;

    zzcfp(zzcfr zzcfrVar) {
        Objects.requireNonNull(zzcfrVar);
        this.zza = zzcfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}
