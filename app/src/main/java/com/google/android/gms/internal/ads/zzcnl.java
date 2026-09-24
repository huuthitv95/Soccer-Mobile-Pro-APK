package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnl implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcnl(zzcmz zzcmzVar, zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
    }

    public static zzcnl zza(zzcmz zzcmzVar, zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzcnl(zzcmzVar, zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdI)).booleanValue() ? new zzbai((zzbad) this.zzb.zzb()) : new zzbai((zzbad) this.zza.zzb());
    }
}
