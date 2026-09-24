package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnv implements zzimi {
    private final zzcmz zza;

    private zzcnv(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcnv zza(zzcmz zzcmzVar) {
        return new zzcnv(zzcmzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zzimq.zzb(strZze);
        return strZze;
    }
}
