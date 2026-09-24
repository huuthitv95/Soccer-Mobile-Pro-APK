package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zznh {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;
    public final zzxc zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;
    public final zzxc zzh;
    public final long zzi;
    public final long zzj;

    public zznh(long j, zzbf zzbfVar, int i, zzxc zzxcVar, long j2, zzbf zzbfVar2, int i2, zzxc zzxcVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbfVar;
        this.zzc = i;
        this.zzd = zzxcVar;
        this.zze = j2;
        this.zzf = zzbfVar2;
        this.zzg = i2;
        this.zzh = zzxcVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznh zznhVar = (zznh) obj;
            if (this.zza == zznhVar.zza && this.zzc == zznhVar.zzc && this.zze == zznhVar.zze && this.zzg == zznhVar.zzg && this.zzi == zznhVar.zzi && this.zzj == zznhVar.zzj && Objects.equals(this.zzb, zznhVar.zzb) && Objects.equals(this.zzd, zznhVar.zzd) && Objects.equals(this.zzf, zznhVar.zzf) && Objects.equals(this.zzh, zznhVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
