package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdzs implements zzimi {
    private final zzdzo zza;
    private final zzimr zzb;

    private zzdzs(zzdzo zzdzoVar, zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzdzoVar;
        this.zzb = zzimrVar;
    }

    public static zzdzs zza(zzdzo zzdzoVar, zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdzs(zzdzoVar, zzimrVar, zzimrVar2);
    }

    public static Set zzc(zzdzo zzdzoVar, zzdzy zzdzyVar, Executor executor) {
        Set setZzd = zzdzo.zzd(zzdzyVar, executor);
        zzimq.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzdzy) this.zzb.zzb(), zzfno.zzc());
    }
}
