package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhol {
    public static final zzhol zza = new zzhol("SHA1");
    public static final zzhol zzb = new zzhol("SHA224");
    public static final zzhol zzc = new zzhol("SHA256");
    public static final zzhol zzd = new zzhol("SHA384");
    public static final zzhol zze = new zzhol("SHA512");
    private final String zzf;

    private zzhol(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
