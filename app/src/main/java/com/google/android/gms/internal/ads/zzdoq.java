package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdoq implements zzimi {
    private final zzimr zza;

    private zzdoq(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdoq zzc(zzimr zzimrVar) {
        return new zzdoq(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdop zzb() {
        return new zzdop(((zzdpz) this.zza).zza());
    }
}
