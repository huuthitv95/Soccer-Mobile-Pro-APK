package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgol implements zzgok {
    private final zzimc zza;
    private final zzgpu zzb;
    private final long zzc;

    zzgol(zzimc zzimcVar, zzgpu zzgpuVar, zzgbx zzgbxVar, long j) {
        this.zza = zzimcVar;
        this.zzb = zzgpuVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final boolean zza(zzgfd zzgfdVar) {
        if (zzgfdVar == null || zzgfdVar.equals(zzgfd.zzg())) {
            this.zzb.zzb(15104);
            return true;
        }
        if (zzgfdVar.zzc() != this.zza.zzb()) {
            this.zzb.zzb(15105);
            return true;
        }
        boolean z = (zzgfdVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
        if (z) {
            this.zzb.zzb(15106);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final boolean zzb(zzgfd zzgfdVar) {
        if (zzgfdVar == null || zzgfdVar.equals(zzgfd.zzg())) {
            this.zzb.zzb(15102);
            return false;
        }
        if (zzgfdVar.zzc() == this.zza.zzb()) {
            return true;
        }
        this.zzb.zzb(15103);
        return false;
    }
}
