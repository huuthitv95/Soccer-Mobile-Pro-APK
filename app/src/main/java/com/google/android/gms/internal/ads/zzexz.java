package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexz implements zzimi {
    private final zzimr zza;

    private zzexz(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar2;
    }

    public static zzexz zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzexz(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfak(zzeyw.zzc(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznH)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
