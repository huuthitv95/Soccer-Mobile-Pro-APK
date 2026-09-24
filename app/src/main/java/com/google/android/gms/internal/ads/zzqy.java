package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqy {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    /* synthetic */ zzqy(zzqx zzqxVar, byte[] bArr) {
        this.zza = zzqxVar.zzi();
        this.zzb = zzqxVar.zzj();
        this.zzc = zzqxVar.zzk();
        this.zze = zzqxVar.zzl();
        this.zzf = zzqxVar.zzm();
        this.zzg = zzqxVar.zzn();
        this.zzh = zzqxVar.zzo();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzqy zzqyVar = (zzqy) obj;
            if (this.zza == zzqyVar.zza && this.zzb == zzqyVar.zzb && this.zzc == zzqyVar.zzc && this.zze == zzqyVar.zze && this.zzg == zzqyVar.zzg && this.zzh == zzqyVar.zzh && this.zzf.equals(zzqyVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), false, false, Integer.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), false, false);
    }
}
