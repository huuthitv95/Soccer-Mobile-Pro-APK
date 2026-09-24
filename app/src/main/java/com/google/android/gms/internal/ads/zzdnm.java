package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdnm implements zzimi {
    private final zzdnl zza;

    private zzdnm(zzdnl zzdnlVar) {
        this.zza = zzdnlVar;
    }

    public static zzdnm zzc(zzdnl zzdnlVar) {
        return new zzdnm(zzdnlVar);
    }

    public final com.google.android.gms.ads.internal.client.zzbh zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
