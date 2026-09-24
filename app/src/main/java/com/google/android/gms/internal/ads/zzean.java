package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzean implements zzimi {
    private final zzimr zza;

    private zzean(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzean zzc(zzimr zzimrVar) {
        return new zzean(zzimrVar);
    }

    public static zzeam zzd(zzbqe zzbqeVar) {
        return new zzeam(zzbqeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeam zzb() {
        return new zzeam((zzbqe) this.zza.zzb());
    }
}
