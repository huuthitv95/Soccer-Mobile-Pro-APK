package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfee implements zzimi {
    private final zzfed zza;

    private zzfee(zzfed zzfedVar) {
        this.zza = zzfedVar;
    }

    public static zzfee zzc(zzfed zzfedVar) {
        return new zzfee(zzfedVar);
    }

    public static String zzd(zzfed zzfedVar) {
        String strZza = zzfedVar.zza();
        zzimq.zzb(strZza);
        return strZza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
