package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgjk implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;

    private zzgjk(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
    }

    public static zzgjk zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzgjk(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzimr zzimrVar = this.zzd;
        zzimr zzimrVar2 = this.zzc;
        zzimr zzimrVar3 = this.zzb;
        zzimc zzimcVarZzc = zzimh.zzc(this.zza);
        zzimc zzimcVarZzc2 = zzimh.zzc(zzimrVar3);
        zzimc zzimcVarZzc3 = zzimh.zzc(zzimrVar2);
        zzgco zzgcoVar = (zzgco) zzimrVar.zzb();
        return new zzgjj(zzimcVarZzc, zzimcVarZzc2, zzimcVarZzc3, zzgcoVar.zzk().zza(), zzgcoVar.zzk().zzd());
    }
}
