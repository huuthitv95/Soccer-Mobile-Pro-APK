package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzddn implements zzimi {
    private final zzimr zza;

    private zzddn(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzddn zza(zzimr zzimrVar) {
        return new zzddn(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddm(((zzimu) this.zza).zzb());
    }
}
