package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnw implements zzimi {
    private final zzcmz zza;

    private zzcnw(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcnw zzc(zzcmz zzcmzVar) {
        return new zzcnw(zzcmzVar);
    }

    public static VersionInfoParcel zzd(zzcmz zzcmzVar) {
        VersionInfoParcel versionInfoParcelZzd = zzcmzVar.zzd();
        zzimq.zzb(versionInfoParcelZzd);
        return versionInfoParcelZzd;
    }

    public final VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
