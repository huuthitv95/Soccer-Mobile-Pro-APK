package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdce implements zzimi {
    private final zzimr zza;

    private zzdce(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdce zza(zzimr zzimrVar) {
        return new zzdce(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcd(((zzimu) this.zza).zzb());
    }
}
