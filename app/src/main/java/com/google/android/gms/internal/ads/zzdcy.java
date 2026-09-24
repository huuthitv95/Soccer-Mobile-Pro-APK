package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdcy implements zzimi {
    private final zzimr zza;

    private zzdcy(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdcy zza(zzimr zzimrVar) {
        return new zzdcy(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcx(((zzimu) this.zza).zzb());
    }
}
