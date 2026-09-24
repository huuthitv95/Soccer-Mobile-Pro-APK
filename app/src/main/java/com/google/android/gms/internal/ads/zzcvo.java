package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvo implements zzimi {
    private final zzimr zza;

    private zzcvo(zzcvg zzcvgVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcvo zza(zzcvg zzcvgVar, zzimr zzimrVar) {
        return new zzcvo(zzcvgVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgwj zzgwjVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoa)).booleanValue() ? zzgwj.zzi(new zzdke(((zzcws) this.zza).zzb(), zzcff.zza)) : zzgwj.zzh();
        zzimq.zzb(zzgwjVarZzi);
        return zzgwjVarZzi;
    }
}
