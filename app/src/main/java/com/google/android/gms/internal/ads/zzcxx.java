package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxx {
    private final zzfke zza;
    private final zzfjt zzb;
    private final String zzc;

    public zzcxx(zzfke zzfkeVar, zzfjt zzfjtVar, String str) {
        this.zza = zzfkeVar;
        this.zzb = zzfjtVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfke zza() {
        return this.zza;
    }

    public final zzfjt zzb() {
        return this.zzb;
    }

    public final zzfjw zzc() {
        return this.zza.zzb.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
