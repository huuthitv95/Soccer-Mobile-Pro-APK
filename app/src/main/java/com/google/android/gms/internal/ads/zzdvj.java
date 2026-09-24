package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdvj implements zzimi {
    private final zzimr zza;

    private zzdvj(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdvj zza(zzimr zzimrVar) {
        return new zzdvj(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdbw) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : "rewarded";
    }
}
