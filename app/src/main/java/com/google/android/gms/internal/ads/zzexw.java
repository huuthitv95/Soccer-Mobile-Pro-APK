package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexw implements zzimi {
    private final zzimr zza;

    private zzexw(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzexw zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzexw(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgwj zzgwjVarZzh;
        zzewo zzewoVarZzc = zzewq.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeY)).booleanValue()) {
            zzgwjVarZzh = zzgwj.zzi(new zzfak(zzewoVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeZ)).intValue(), scheduledExecutorService));
        } else {
            zzgwjVarZzh = zzgwj.zzh();
        }
        zzimq.zzb(zzgwjVarZzh);
        return zzgwjVarZzh;
    }
}
