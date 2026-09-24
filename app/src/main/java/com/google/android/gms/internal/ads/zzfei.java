package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfei implements zzimi {
    private final zzfed zza;

    private zzfei(zzfed zzfedVar) {
        this.zza = zzfedVar;
    }

    public static zzfei zzc(zzfed zzfedVar) {
        return new zzfei(zzfedVar);
    }

    public static String zzd(zzfed zzfedVar) {
        String strZze = zzfedVar.zze();
        zzimq.zzb(strZze);
        return strZze;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
