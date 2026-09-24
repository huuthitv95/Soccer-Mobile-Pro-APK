package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkc {
    public static final zzbjo zza = zzbjo.zza("gads:init:init_on_bg_thread", true);
    public static final zzbjo zzb = zzbjo.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbjo zzc = zzbjo.zza("gads:adloader_load_bg_thread", true);
    public static final zzbjo zzd = zzbjo.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbjo zze = zzbjo.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbjo zzf = zzbjo.zza("gads:banner_load_bg_thread", true);
    public static final zzbjo zzg = zzbjo.zza("gads:banner_pause_bg_thread", false);
    public static final zzbjo zzh = zzbjo.zza("gads:banner_resume_bg_thread", false);
    public static final zzbjo zzi = zzbjo.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbjo zzj;
    public static final zzbjo zzk;

    static {
        zzbjo.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbjo.zza("gads:query_info_bg_thread", true);
        zzk = zzbjo.zza("gads:rewarded_load_bg_thread", true);
    }
}
