package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvm implements zzimi {
    private final zzcvg zza;
    private final zzimr zzb;

    private zzcvm(zzcvg zzcvgVar, zzimr zzimrVar) {
        this.zza = zzcvgVar;
        this.zzb = zzimrVar;
    }

    public static zzcvm zzc(zzcvg zzcvgVar, zzimr zzimrVar) {
        return new zzcvm(zzcvgVar, zzimrVar);
    }

    public static zzcuz zzd(zzcvg zzcvgVar, Object obj) {
        return (zzcvc) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcuz zzb() {
        return ((zzcvd) this.zzb).zzb();
    }
}
