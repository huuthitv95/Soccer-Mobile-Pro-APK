package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcqq implements zzimi {
    private final zzimr zza;

    private zzcqq(zzcqh zzcqhVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcqq zzc(zzcqh zzcqhVar, zzimr zzimrVar) {
        return new zzcqq(zzcqhVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfli zzb() {
        zzfli zzfliVarZza = zzfli.zza(((zzcng) this.zza).zza());
        zzimq.zzb(zzfliVarZza);
        return zzfliVarZza;
    }
}
