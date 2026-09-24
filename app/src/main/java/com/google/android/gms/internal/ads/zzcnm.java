package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnm implements zzimi {
    private final zzimr zza;

    private zzcnm(zzcmz zzcmzVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcnm zzc(zzcmz zzcmzVar, zzimr zzimrVar) {
        return new zzcnm(zzcmzVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        return zzfli.zza(((zzcng) this.zza).zza()).zze();
    }
}
