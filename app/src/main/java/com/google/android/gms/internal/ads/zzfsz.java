package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfsz implements zzhbf {
    final /* synthetic */ zzftl zza;

    zzfsz(zzftl zzftlVar) {
        Objects.requireNonNull(zzftlVar);
        this.zza = zzftlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        this.zza.zzC(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        this.zza.zzB(obj);
    }
}
