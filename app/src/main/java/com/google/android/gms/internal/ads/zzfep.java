package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfep implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;

    private zzfep(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar5;
        this.zzd = zzimrVar6;
        this.zze = zzimrVar7;
    }

    public static zzfep zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5, zzimr zzimrVar6, zzimr zzimrVar7) {
        return new zzfep(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5, zzimrVar6, zzimrVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfen zzb() {
        return new zzfen((zzcer) this.zza.zzb(), ((zzfeh) this.zzb).zzb().booleanValue(), zzcrc.zza(), zzfno.zzc(), ((zzfee) this.zzc).zza(), (ScheduledExecutorService) this.zzd.zzb(), ((zzfej) this.zze).zzb().intValue());
    }
}
