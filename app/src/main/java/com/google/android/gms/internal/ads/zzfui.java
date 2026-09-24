package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfui {
    private final String zza;
    private final String zzb;

    private zzfui(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfui zza(String str, String str2) {
        zzfvs.zzc(str, "Name is null or empty");
        zzfvs.zzc(str2, "Version is null or empty");
        return new zzfui(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
