package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzaau implements zzaas {
    private final zzaas zza;

    public zzaau(zzaas zzaasVar) {
        this.zza = zzaasVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaau) {
            return this.zza.equals(((zzaau) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public zzbg zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public zzv zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public zzv zzc() {
        return this.zza.zzc();
    }

    public final zzaas zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final int zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final int zzg(int i) {
        return this.zza.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final int zzh() {
        return this.zza.zzh();
    }
}
