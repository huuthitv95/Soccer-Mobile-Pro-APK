package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvw implements zzimi {
    private final zzimr zza;

    private zzcvw(zzcvg zzcvgVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcvw zza(zzcvg zzcvgVar, zzimr zzimrVar) {
        return new zzcvw(zzcvgVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzdfg zzdfgVarZza = ((zzcxc) this.zza).zza();
        return new zzdke(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzcve
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza() {
                zzdfgVarZza.zzc();
            }
        }, zzcff.zzh);
    }
}
