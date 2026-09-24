package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcmv implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcmv(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcmv zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcmv(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcmu((zzcmh) this.zza.zzb(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
