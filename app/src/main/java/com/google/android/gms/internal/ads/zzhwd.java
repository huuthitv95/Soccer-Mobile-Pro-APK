package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwd {
    public static final zzhwd zza = new zzhwd("SHA256");
    public static final zzhwd zzb = new zzhwd("SHA384");
    public static final zzhwd zzc = new zzhwd("SHA512");
    private final String zzd;

    private zzhwd(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
