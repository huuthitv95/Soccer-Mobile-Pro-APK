package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdkc implements zzimi {
    private final zzimr zza;

    private zzdkc(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdkc zza(zzimr zzimrVar) {
        return new zzdkc(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkb(((zzimu) this.zza).zzb());
    }
}
