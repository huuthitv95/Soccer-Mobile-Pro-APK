package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzxp extends zzaau {
    private final zzbg zza;

    public zzxp(zzaas zzaasVar, zzbg zzbgVar) {
        super(zzaasVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzxp)) {
            return this.zza.equals(((zzxp) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int hashCode() {
        return (super.hashCode() * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzaau, com.google.android.gms.internal.ads.zzaax
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaau, com.google.android.gms.internal.ads.zzaax
    public final zzv zzb(int i) {
        return this.zza.zza(zzd().zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzaau, com.google.android.gms.internal.ads.zzaas
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
