package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnx implements zzimi {
    private final zzcmz zza;

    private zzcnx(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcnx zza(zzcmz zzcmzVar) {
        return new zzcnx(zzcmzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Long.valueOf(this.zza.zzi());
    }
}
