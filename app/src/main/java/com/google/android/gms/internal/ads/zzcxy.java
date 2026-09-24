package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxy implements zzimi {
    private final zzcxx zza;

    private zzcxy(zzcxx zzcxxVar) {
        this.zza = zzcxxVar;
    }

    public static zzcxy zzc(zzcxx zzcxxVar) {
        return new zzcxy(zzcxxVar);
    }

    public static zzfjt zzd(zzcxx zzcxxVar) {
        zzfjt zzfjtVarZzb = zzcxxVar.zzb();
        zzimq.zzb(zzfjtVarZzb);
        return zzfjtVarZzb;
    }

    public final zzfjt zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
