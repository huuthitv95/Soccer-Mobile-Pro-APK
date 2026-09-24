package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdog implements zzimi {
    private final zzimr zza;

    private zzdog(zzdod zzdodVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdog zzc(zzdod zzdodVar, zzimr zzimrVar) {
        return new zzdog(zzdodVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpm zzb() {
        zzdpl zzdplVar = (zzdpl) this.zza.zzb();
        zzimq.zzb(zzdplVar);
        return zzdplVar;
    }
}
