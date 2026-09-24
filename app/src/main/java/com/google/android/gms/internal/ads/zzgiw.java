package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgiw implements zzimi {
    private final zzimr zza;

    private zzgiw(zzgiv zzgivVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzgiw zza(zzgiv zzgivVar, zzimr zzimrVar) {
        return new zzgiw(zzgivVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgfe zzgfeVarZza = ((zzgiz) this.zza.zzb()).zza().zza();
        zzimq.zzb(zzgfeVarZza);
        return zzgfeVarZza;
    }
}
