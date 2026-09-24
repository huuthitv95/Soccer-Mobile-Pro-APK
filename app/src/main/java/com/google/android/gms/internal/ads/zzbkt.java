package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkt {
    public static final zzbjo zza = zzbjo.zza("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbjo zzb;

    static {
        zzbjo.zza("gads:invalidate_token_at_refresh_start", true);
        zzbjo.zza("gms:expose_token_for_gma:enabled", true);
        zzbjo.zza("gads:referesh_rate_limit", false);
        zzb = zzbjo.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbjo.zza("gads:token_anonymization:enabled", true);
        zzbjo.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
