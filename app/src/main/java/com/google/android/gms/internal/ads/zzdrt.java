package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdrt implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzdrt(zzdrl zzdrlVar, zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzdrt zza(zzdrl zzdrlVar, zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdrt(zzdrlVar, zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke(((zzduw) this.zza).zzb(), (Executor) this.zzb.zzb());
    }
}
