package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzetq implements zzimi {
    private final zzimr zza;

    private zzetq(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzetq zzc(zzimr zzimrVar) {
        return new zzetq(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeto zzb() {
        return new zzeto(((zzcng) this.zza).zza());
    }
}
