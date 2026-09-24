package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdj implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzfdj(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar3;
        this.zzc = zzimrVar4;
    }

    public static zzfdj zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        return new zzfdj(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdh zzb() {
        return new zzfdh(((zzfee) this.zza).zza(), zzcqs.zza(), (zzcer) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfno.zzc());
    }
}
