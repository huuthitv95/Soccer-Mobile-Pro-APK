package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxc implements zzimi {
    private final zzcwz zza;

    private zzcxc(zzcwz zzcwzVar) {
        this.zza = zzcwzVar;
    }

    public static zzcxc zzc(zzcwz zzcwzVar) {
        return new zzcxc(zzcwzVar);
    }

    public static zzdfg zzd(zzcwz zzcwzVar) {
        return zzcwzVar.zza();
    }

    public final zzdfg zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
