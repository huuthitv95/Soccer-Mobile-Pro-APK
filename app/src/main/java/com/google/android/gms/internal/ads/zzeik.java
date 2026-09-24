package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeik implements zzimi {
    private final zzimr zza;

    private zzeik(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzeik zzc(zzimr zzimrVar) {
        return new zzeik(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeij zzb() {
        return new zzeij(((zzcng) this.zza).zza());
    }
}
