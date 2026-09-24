package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhex {
    public static final zzhex zza = new zzhex("SHA1");
    public static final zzhex zzb = new zzhex("SHA224");
    public static final zzhex zzc = new zzhex("SHA256");
    public static final zzhex zzd = new zzhex("SHA384");
    public static final zzhex zze = new zzhex("SHA512");
    private final String zzf;

    private zzhex(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
