package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpn implements zzimi {
    private final zzimr zza;

    private zzdpn(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdpn zza(zzimr zzimrVar) {
        return new zzdpn(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpm(((zzcxy) this.zza).zza());
    }
}
