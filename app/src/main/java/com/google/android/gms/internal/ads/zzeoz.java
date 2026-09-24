package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeoz implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;
    private final zzimr zzf;
    private final zzimr zzg;
    private final zzimr zzh;
    private final zzimr zzi;
    private final zzimr zzj;
    private final zzimr zzk;
    private final zzimr zzl;

    private zzeoz(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10, zzimr zzimrVar11, zzimr zzimrVar12, zzimr zzimrVar13) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
        this.zzf = zzimrVar6;
        this.zzg = zzimrVar7;
        this.zzh = zzimrVar9;
        this.zzi = zzimrVar10;
        this.zzj = zzimrVar11;
        this.zzk = zzimrVar12;
        this.zzl = zzimrVar13;
    }

    public static zzeoz zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10, zzimr zzimrVar11, zzimr zzimrVar12, zzimr zzimrVar13) {
        return new zzeoz(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7, zzimrVar8, zzimrVar9, zzimrVar10, zzimrVar11, zzimrVar12, zzimrVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeoy zzb() {
        return new zzeoy(((zzcng) this.zza).zza(), (zzfoy) this.zzb.zzb(), (zzeor) this.zzc.zzb(), (zzdch) this.zzd.zzb(), (zzfrk) this.zze.zzb(), (zzfro) this.zzf.zzb(), (zzcxk) this.zzg.zzb(), zzfno.zzc(), (ScheduledExecutorService) this.zzh.zzb(), (zzell) this.zzi.zzb(), (zzfps) this.zzj.zzb(), ((zzeod) this.zzk).zzb(), (zzdyu) this.zzl.zzb());
    }
}
