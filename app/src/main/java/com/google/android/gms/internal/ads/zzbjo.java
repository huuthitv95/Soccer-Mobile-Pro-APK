package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzbjo {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbjo(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbjo zza(String str, boolean z) {
        return new zzbjo(str, Boolean.valueOf(z), 1);
    }

    public static zzbjo zzb(String str, long j) {
        return new zzbjo(str, Long.valueOf(j), 2);
    }

    public static zzbjo zzc(String str, double d) {
        return new zzbjo(str, Double.valueOf(d), 3);
    }

    public static zzbjo zzd(String str, String str2) {
        return new zzbjo("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbku zzbkuVarZza = zzbkw.zza();
        if (zzbkuVarZza == null) {
            if (zzbkw.zzb() != null) {
                zzbkw.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zzbkuVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? zzbkuVarZza.zzd(this.zza, (String) this.zzb) : zzbkuVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbkuVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
    }
}
