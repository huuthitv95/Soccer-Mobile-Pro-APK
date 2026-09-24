package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgmw implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzgmw(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
    }

    public static zzgmw zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzgmw(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzimr zzimrVar = this.zzc;
        zzimr zzimrVar2 = this.zzb;
        zzimc zzimcVarZzc = zzimh.zzc(this.zza);
        zzimc zzimcVarZzc2 = zzimh.zzc(zzimrVar2);
        if (true == ((zzgco) zzimrVar.zzb()).zzu()) {
            zzimcVarZzc = zzimcVarZzc2;
        }
        zzgmj zzgmjVar = (zzgmj) zzimcVarZzc.zzb();
        zzimq.zzb(zzgmjVar);
        return zzgmjVar;
    }
}
