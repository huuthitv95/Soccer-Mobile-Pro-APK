package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgiu implements zzimi {
    private final zzimr zza;

    private zzgiu(zzgit zzgitVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzgiu zza(zzgit zzgitVar, zzimr zzimrVar) {
        return new zzgiu(zzgitVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgfe zzgfeVarZza = ((zzgfv) this.zza.zzb()).zza().zza();
        zzimq.zzb(zzgfeVarZza);
        return zzgfeVarZza;
    }
}
