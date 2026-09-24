package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefh implements zzimi {
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

    private zzefh(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10, zzimr zzimrVar11, zzimr zzimrVar12, zzimr zzimrVar13) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar6;
        this.zzf = zzimrVar7;
        this.zzg = zzimrVar8;
        this.zzh = zzimrVar11;
        this.zzi = zzimrVar12;
        this.zzj = zzimrVar13;
    }

    public static zzefh zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7, zzimr zzimrVar8, zzimr zzimrVar9, zzimr zzimrVar10, zzimr zzimrVar11, zzimr zzimrVar12, zzimr zzimrVar13) {
        return new zzefh(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7, zzimrVar8, zzimrVar9, zzimrVar10, zzimrVar11, zzimrVar12, zzimrVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefg zzb() {
        return new zzefg((zzcmx) this.zza.zzb(), ((zzcng) this.zzb).zza(), ((zzcnw) this.zzc).zza(), ((zzdbw) this.zzd).zza(), zzfno.zzc(), (String) this.zze.zzb(), (zzfps) this.zzf.zzb(), (zzdyu) this.zzg.zzb(), zzcog.zza(), zzcod.zza(), (ScheduledExecutorService) this.zzh.zzb(), (zzfro) this.zzi.zzb(), ((zzdfk) this.zzj).zzb());
    }
}
