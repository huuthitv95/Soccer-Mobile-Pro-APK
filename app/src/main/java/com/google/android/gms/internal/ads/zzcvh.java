package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvh implements zzimi {
    private final zzcvg zza;
    private final zzimr zzb;

    private zzcvh(zzcvg zzcvgVar, zzimr zzimrVar) {
        this.zza = zzcvgVar;
        this.zzb = zzimrVar;
    }

    public static zzcvh zza(zzcvg zzcvgVar, zzimr zzimrVar) {
        return new zzcvh(zzcvgVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zzimu) this.zzb).zzb());
    }
}
