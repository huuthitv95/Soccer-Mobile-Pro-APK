package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcyq implements zzimi {
    private final zzimr zza;

    private zzcyq(zzcyn zzcynVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcyq zza(zzcyn zzcynVar, zzimr zzimrVar) {
        return new zzcyq(zzcynVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke((zzcyx) this.zza.zzb(), zzcff.zzh);
    }
}
