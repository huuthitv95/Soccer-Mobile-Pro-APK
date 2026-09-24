package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdvi implements zzimi {
    private final zzimr zza;

    private zzdvi(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdvi zza(zzimr zzimrVar) {
        return new zzdvi(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbhj.zza.EnumC15492zza enumC15492zza = ((zzdbw) this.zza).zza().zzp.zza == 3 ? zzbhj.zza.EnumC15492zza.REWARDED_INTERSTITIAL : zzbhj.zza.EnumC15492zza.REWARD_BASED_VIDEO_AD;
        zzimq.zzb(enumC15492zza);
        return enumC15492zza;
    }
}
