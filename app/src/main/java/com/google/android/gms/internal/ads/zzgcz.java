package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgcz implements zzimr {
    final /* synthetic */ zzgda zza;

    zzgcz(zzgda zzgdaVar) {
        Objects.requireNonNull(zzgdaVar);
        this.zza = zzgdaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgda zzgdaVar = this.zza;
        return new zzgdd(zzgdaVar.zzb(), zzgdaVar.zzc(), null);
    }
}
