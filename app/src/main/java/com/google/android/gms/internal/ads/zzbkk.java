package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkk {
    public static final zzbjo zza = zzbjo.zza("gads:adapter_initialization:red_button", false);
    public static final zzbjo zzb = zzbjo.zza("gads:adapter_settings:red_button", false);
    public static final zzbjo zzc;
    public static final zzbjo zzd;
    public static final zzbjo zze;
    public static final zzbjo zzf;
    public static final zzbjo zzg;

    static {
        zzbjo.zza("gads:ads_service_force_stop:red_button", true);
        zzc = zzbjo.zza("gads:mediation_serving_domain:red_button", false);
        zzd = zzbjo.zza("gads:banner_refresh_sequential_caching:red_button", false);
        zzbjo.zza("gads:ad_serving:enabled", true);
        zzbjo.zza("gads:ad_preloading:enabled", true);
        zze = zzbjo.zza("gads:adaptive_banner:fail_invalid_ad_size", true);
        zzbjo.zza("gads:return_null_ads_preloader_from_remote_creator", false);
        zzbjo.zza("gads:sdk_use_dynamic_module", true);
        zzf = zzbjo.zza("gads:signal_adapters:red_button", false);
        zzg = zzbjo.zza("gads:use_non_templated_client_sdkcore:enabled", false);
        zzbjo.zza("gads:use_non_templated_mediation_client_sdkcore:enabled", false);
    }
}
