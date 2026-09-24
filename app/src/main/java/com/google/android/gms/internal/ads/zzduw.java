package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzduw implements zzimi {
    private final zzimr zza;

    private zzduw(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzduw zzc(zzimr zzimrVar) {
        return new zzduw(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzduv zzb() {
        return new zzduv(((zzdpz) this.zza).zza());
    }
}
