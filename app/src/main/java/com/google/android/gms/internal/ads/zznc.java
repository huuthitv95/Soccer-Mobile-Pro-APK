package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zznc {
    public static final zznc zza;
    public static final zznc zzb;
    public static final zznc zzc;
    public final long zzd;
    public final long zze;

    static {
        zznc zzncVar = new zznc(0L, 0L);
        zza = zzncVar;
        new zznc(Long.MAX_VALUE, Long.MAX_VALUE);
        zzb = new zznc(Long.MAX_VALUE, 0L);
        new zznc(0L, Long.MAX_VALUE);
        zzc = zzncVar;
    }

    public zznc(long j, long j2) {
        zzgsw.zza(j >= 0);
        zzgsw.zza(j2 >= 0);
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznc zzncVar = (zznc) obj;
            if (this.zzd == zzncVar.zzd && this.zze == zzncVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzd) * 31) + ((int) this.zze);
    }
}
