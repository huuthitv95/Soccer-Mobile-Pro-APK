package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcmr implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcmr(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcmr zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcmr(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcmq((zzcmh) this.zza.zzb(), (zzdyz) this.zzb.zzb());
    }
}
