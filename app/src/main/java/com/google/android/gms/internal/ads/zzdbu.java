package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbu implements zzimi {
    private final zzimr zza;

    private zzdbu(zzdbp zzdbpVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdbu zzc(zzdbp zzdbpVar, zzimr zzimrVar) {
        return new zzdbu(zzdbpVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzcyx) this.zza.zzb()).zzp();
        zzimq.zzb(strZzp);
        return strZzp;
    }
}
