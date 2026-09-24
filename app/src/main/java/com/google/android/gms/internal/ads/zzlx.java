package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlx {
    public final zzxc zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;

    zzlx(zzxc zzxcVar, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        zzgsw.zza(!z5 || z3);
        if (z4 && !z3) {
            z6 = false;
        }
        zzgsw.zza(z6);
        this.zza = zzxcVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = j5;
        this.zzg = false;
        this.zzh = false;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlx zzlxVar = (zzlx) obj;
            if (this.zzb == zzlxVar.zzb && this.zzd == zzlxVar.zzd && this.zze == zzlxVar.zze && this.zzf == zzlxVar.zzf && this.zzi == zzlxVar.zzi && this.zzj == zzlxVar.zzj && this.zzk == zzlxVar.zzk && Objects.equals(this.zza, zzlxVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zzf;
        long j2 = this.zze;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
    }

    public final zzlx zza(long j, long j2) {
        return (j == this.zzb && j2 == this.zzc) ? this : new zzlx(this.zza, j, j2, this.zzd, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }

    public final zzlx zzb(long j) {
        return j == this.zzd ? this : new zzlx(this.zza, this.zzb, this.zzc, j, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }
}
