package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzagy extends zzage {
    final /* synthetic */ zzags zza;
    final /* synthetic */ zzagz zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzagy(zzagz zzagzVar, zzags zzagsVar, zzags zzagsVar2) {
        super(zzagsVar);
        this.zza = zzagsVar2;
        Objects.requireNonNull(zzagzVar);
        this.zzb = zzagzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzage, com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        zzagq zzagqVarZzc = this.zza.zzc(j);
        zzagt zzagtVar = zzagqVarZzc.zza;
        long j2 = zzagtVar.zzb;
        zzagz zzagzVar = this.zzb;
        zzagt zzagtVar2 = new zzagt(j2, zzagtVar.zzc + zzagzVar.zza());
        zzagt zzagtVar3 = zzagqVarZzc.zzb;
        return new zzagq(zzagtVar2, new zzagt(zzagtVar3.zzb, zzagtVar3.zzc + zzagzVar.zza()));
    }
}
