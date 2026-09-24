package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgjl implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;
    private final zzimr zzf;

    private zzgjl(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
        this.zzf = zzimrVar6;
    }

    public static zzgjl zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6) {
        return new zzgjl(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgok zzgokVar = (zzgok) this.zza.zzb();
        zzglr zzglrVar = (zzglr) this.zzb.zzb();
        zzgmi zzgmiVar = (zzgmi) this.zzc.zzb();
        zzgpu zzgpuVar = (zzgpu) this.zzd.zzb();
        zzgdu zzgduVar = (zzgdu) this.zze.zzb();
        zzgco zzgcoVar = (zzgco) this.zzf.zzb();
        return new zzgkb(zzgokVar, zzglrVar, zzgmiVar, zzgpuVar, zzgduVar, zzgcoVar.zzk().zze(), zzgcoVar.zzk().zzg(), zzgcoVar.zzk().zzh());
    }
}
