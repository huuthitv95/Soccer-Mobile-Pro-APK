package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwp {
    public static final zzhwp zza = new zzhwp("SHA256");
    public static final zzhwp zzb = new zzhwp("SHA384");
    public static final zzhwp zzc = new zzhwp("SHA512");
    private final String zzd;

    private zzhwp(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
