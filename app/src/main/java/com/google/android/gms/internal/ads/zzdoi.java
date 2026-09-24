package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdoi implements zzimi {
    private final zzdod zza;

    private zzdoi(zzdod zzdodVar) {
        this.zza = zzdodVar;
    }

    public static zzdoi zzc(zzdod zzdodVar) {
        return new zzdoi(zzdodVar);
    }

    public static zzdul zzd(zzdod zzdodVar) {
        zzdul zzdulVarZzd = zzdodVar.zzd();
        zzimq.zzb(zzdulVarZzd);
        return zzdulVarZzd;
    }

    public final zzdul zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
