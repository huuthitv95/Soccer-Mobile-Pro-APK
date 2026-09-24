package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuf {
    public static final zzhuf zza = new zzhuf("NIST_P256", zzhkw.zza);
    public static final zzhuf zzb = new zzhuf("NIST_P384", zzhkw.zzb);
    public static final zzhuf zzc = new zzhuf("NIST_P521", zzhkw.zzc);
    private final String zzd;
    private final ECParameterSpec zze;

    private zzhuf(String str, ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final String toString() {
        return this.zzd;
    }

    public final ECParameterSpec zza() {
        return this.zze;
    }
}
