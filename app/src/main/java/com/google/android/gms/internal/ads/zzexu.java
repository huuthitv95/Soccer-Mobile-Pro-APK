package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexu implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzexu(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzexu zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzexu(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfak((zzewm) this.zza.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznK)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
