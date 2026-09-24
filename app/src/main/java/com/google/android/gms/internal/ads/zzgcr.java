package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgcr implements zzimr {
    final /* synthetic */ zzgcu zza;

    zzgcr(zzgcu zzgcuVar) {
        Objects.requireNonNull(zzgcuVar);
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgcy(this.zza.zza(), null);
    }
}
