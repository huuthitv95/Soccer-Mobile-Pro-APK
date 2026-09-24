package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpa implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzfpa(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar2;
        this.zzb = zzimrVar3;
    }

    public static zzfpa zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzfpa(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfoy(zzfno.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzfpb) this.zzb).zzb());
    }
}
