package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgx {
    public static final zzhgx zza = new zzhgx("ASSUME_AES_GCM");
    public static final zzhgx zzb = new zzhgx("ASSUME_XCHACHA20POLY1305");
    public static final zzhgx zzc = new zzhgx("ASSUME_CHACHA20POLY1305");
    public static final zzhgx zzd = new zzhgx("ASSUME_AES_CTR_HMAC");
    public static final zzhgx zze = new zzhgx("ASSUME_AES_EAX");
    public static final zzhgx zzf = new zzhgx("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzhgx(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
