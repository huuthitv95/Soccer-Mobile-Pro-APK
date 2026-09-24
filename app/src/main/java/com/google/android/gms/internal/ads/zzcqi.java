package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcqi implements zzimi {
    private final zzimr zza;

    private zzcqi(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcqi zzc(zzimr zzimrVar) {
        return new zzcqi(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcdg zzb() {
        return zzcdg.zza(((zzcng) this.zza).zza());
    }
}
