package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcns implements zzimi {
    private final zzimr zza;

    private zzcns(zzcmz zzcmzVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcns zzc(zzcmz zzcmzVar, zzimr zzimrVar) {
        return new zzcns(zzcmzVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcre zzb() {
        zzcmx zzcmxVar = (zzcmx) this.zza.zzb();
        zzimq.zzb(zzcmxVar);
        return zzcmxVar;
    }
}
