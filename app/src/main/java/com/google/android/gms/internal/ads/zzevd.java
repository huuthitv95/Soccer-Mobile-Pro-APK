package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevd implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzevd(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar2;
        this.zzb = zzimrVar3;
    }

    public static zzevd zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzevd(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevb(zzfno.zzc(), ((zzdbw) this.zza).zza(), ((zzcnz) this.zzb).zzb());
    }
}
