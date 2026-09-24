package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzyj extends zzwq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzyj(zzym zzymVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzymVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwq, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i, zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwq, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        this.zzb.zzd(i, zzbdVar, z);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
