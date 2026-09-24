package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfsp {
    private final zzdyz zza;

    zzfsp(zzdyz zzdyzVar, Context context) {
        this.zza = zzdyzVar;
    }

    private final void zzt(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", str);
        zzdyyVarZza.zzc("pat", Long.toString(j));
        zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdyyVarZza.zzc("max_ads", Integer.toString(i));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdyyVarZza.zzc("pas", Integer.toString(i3));
        zzdyyVarZza.zzc("pv", "2");
        zzdyyVarZza.zzc("ad_unit_id", str3);
        zzdyyVarZza.zzc("pid", str2);
        zzdyyVarZza.zzd();
    }

    private final void zzu(String str, String str2, long j, int i, int i2, String str3, zzfsw zzfswVar, String str4) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc(str2, Long.toString(j));
        if (zzfswVar != null) {
            zzdyyVarZza.zzc("ad_unit_id", zzfswVar.zza());
            zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfswVar.zzb());
            zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        }
        zzdyyVarZza.zzc("action", str);
        if (str3 != null) {
            zzdyyVarZza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zzdyyVarZza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zzdyyVarZza.zzc("cache_size", Integer.toString(i2));
        }
        zzdyyVarZza.zzc("pv", str4);
        zzdyyVarZza.zzd();
    }

    private final void zzv(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", str);
        zzdyyVarZza.zzc("pat", Long.toString(j));
        zzdyyVarZza.zzc("pid", str2);
        zzdyyVarZza.zzc("ad_unit_id", str3);
        zzdyyVarZza.zzc("max_ads", Integer.toString(i));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdyyVarZza.zzc("tpcnt", Integer.toString(i4));
        zzdyyVarZza.zzc("mpl", Integer.toString(i5));
        if (adFormat != null) {
            zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            zzdyyVarZza.zzc("nptr", Integer.toString(i3));
        }
        zzdyyVarZza.zzd();
    }

    public final void zza(int i, long j, zzfsw zzfswVar, String str) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "start_preload");
        zzdyyVarZza.zzc("sp_ts", Long.toString(j));
        zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfswVar.zzb());
        zzdyyVarZza.zzc("ad_unit_id", zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("max_ads", Integer.toString(i));
        zzdyyVarZza.zzc("pv", str);
        zzdyyVarZza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "start_preload");
        zzdyyVarZza.zzc("sp_ts", Long.toString(j));
        zzdyyVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String lowerCase = adFormat.name().toLowerCase(Locale.ENGLISH);
            String.valueOf(lowerCase);
            String strValueOf = String.valueOf(lowerCase);
            zzdyyVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdyyVarZza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzfsw zzfswVar) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "cache_resize");
        zzdyyVarZza.zzc("cs_ts", Long.toString(j));
        zzdyyVarZza.zzc("orig_ma", Integer.toString(i));
        zzdyyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfswVar.zzb());
        zzdyyVarZza.zzc("ad_unit_id", zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("pv", "1");
        zzdyyVarZza.zzd();
    }

    public final void zzd(int i, int i2, long j, Long l, String str, zzfsw zzfswVar, String str2) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("plaac_ts", Long.toString(j));
        zzdyyVarZza.zzc("max_ads", Integer.toString(i));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdyyVarZza.zzc("action", "is_ad_available");
        if (zzfswVar != null) {
            zzdyyVarZza.zzc("ad_unit_id", zzfswVar.zza());
            zzdyyVarZza.zzc("pid", zzfswVar.zzc());
            zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfswVar.zzb());
        }
        if (l != null) {
            zzdyyVarZza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zzdyyVarZza.zzc("gqi", str);
        }
        zzdyyVarZza.zzc("pv", str2);
        zzdyyVarZza.zzd();
    }

    public final void zze(long j, String str) {
        zzu("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfsw zzfswVar, int i, int i2, String str) {
        zzu("poll_ad", "ppac_ts", j, i, i2, null, zzfswVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzfsw zzfswVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j, i, i2, str, zzfswVar, str2);
    }

    public final void zzh(long j, int i, int i2, String str, zzfsw zzfswVar, String str2) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("ppla_ts", Long.toString(j));
        zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfswVar.zzb());
        zzdyyVarZza.zzc("ad_unit_id", zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("max_ads", Integer.toString(i));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdyyVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdyyVarZza.zzc("gqi", str);
        }
        zzdyyVarZza.zzc("pv", str2);
        zzdyyVarZza.zzd();
    }

    public final void zzi(long j, String str, zzfsw zzfswVar, int i, int i2, String str2) {
        zzu("paa", "pano_ts", j, i, i2, str, zzfswVar, str2);
    }

    public final void zzj(long j, zzfsw zzfswVar, int i, String str) {
        zzu("pae", "paeo_ts", j, i, 0, null, zzfswVar, str);
    }

    public final void zzk(long j, zzfsw zzfswVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, String str) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "pftla");
        zzdyyVarZza.zzc("pftlat_ts", Long.toString(j));
        zzdyyVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdyyVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfswVar.zzb());
        zzdyyVarZza.zzc("max_ads", Integer.toString(i));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdyyVarZza.zzc("ad_unit_id", zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("pv", str);
        zzdyyVarZza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i) {
        zzt("pda", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzt("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j, int i) {
        zzt("pgcs", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzo(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzt("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, String str, String str2, AdFormat adFormat, int i2) {
        zzt("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }

    public final void zzq(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4) {
        zzv("acmpa", j, str, str2, adFormat, i, i2, 0, i3, i4);
    }

    public final void zzr(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzv("acmpr", j, str, str2, adFormat, i, i2, i3, i4, i5);
    }

    public final void zzs(long j, int i, int i2) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "acmlr");
        zzdyyVarZza.zzc("pat", Long.toString(j));
        zzdyyVarZza.zzc("mpl", Integer.toString(i));
        zzdyyVarZza.zzc("pas", Integer.toString(i2));
        zzdyyVarZza.zzd();
    }
}
