package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdno implements zzimi {
    private final zzdnl zza;

    private zzdno(zzdnl zzdnlVar) {
        this.zza = zzdnlVar;
    }

    public static zzdno zzc(zzdnl zzdnlVar) {
        return new zzdno(zzdnlVar);
    }

    public static zzdpr zzd(zzdnl zzdnlVar) {
        zzdpr zzdprVarZza = zzdnlVar.zza();
        zzimq.zzb(zzdprVarZza);
        return zzdprVarZza;
    }

    public final zzdpr zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
