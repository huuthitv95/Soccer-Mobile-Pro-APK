package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqm {
    public static final zzqm zza = new zzql().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzqm(zzql zzqlVar, byte[] bArr) {
        this.zzb = zzqlVar.zze();
        this.zzc = zzqlVar.zzf();
        this.zzd = zzqlVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzqm zzqmVar = (zzqm) obj;
            if (this.zzb == zzqmVar.zzb && this.zzc == zzqmVar.zzc && this.zzd == zzqmVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
