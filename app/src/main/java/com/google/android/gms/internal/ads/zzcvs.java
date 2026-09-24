package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvs implements zzimi {
    private final zzcvg zza;
    private final zzimr zzb;

    private zzcvs(zzcvg zzcvgVar, zzimr zzimrVar) {
        this.zza = zzcvgVar;
        this.zzb = zzimrVar;
    }

    public static zzcvs zza(zzcvg zzcvgVar, zzimr zzimrVar) {
        return new zzcvs(zzcvgVar, zzimrVar);
    }

    public static zzdke zzc(zzcvg zzcvgVar, zzcwu zzcwuVar) {
        return new zzdke(zzcwuVar, zzcff.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcwu) this.zzb.zzb());
    }
}
