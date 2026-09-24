package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzcem;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzdyy;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.internal.ads.zzhaq;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.common.util.concurrent.ListenableFuture;
import com.hbisoft.hbrecorder.Constants;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdyz zzdyzVar, zzfpi zzfpiVar, zzfpv zzfpvVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdyzVar, "cld_s", zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        String strOptString = jSONObject.optString(Constants.ERROR_REASON_KEY, "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfpiVar.zzk(strOptString);
        }
        zzfpiVar.zzd(zOptBoolean);
        zzfpvVar.zzb(zzfpiVar.zzm());
        return zzhbi.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdyz zzdyzVar, String str, long j) {
        if (zzdyzVar != null) {
            if (((Boolean) zzba.zzc().zzd(zzbie.zzod)).booleanValue()) {
                zzdyy zzdyyVarZza = zzdyzVar.zza();
                zzdyyVarZza.zzc("action", "lat_init");
                zzdyyVarZza.zzc(str, Long.toString(j));
                zzdyyVarZza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfpv zzfpvVar, zzdyz zzdyzVar, Long l, boolean z) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfpvVar, zzdyzVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcem zzcemVar, zzfpv zzfpvVar, boolean z) {
        zzc(context, versionInfoParcel, false, zzcemVar, zzcemVar != null ? zzcemVar.zze() : null, str, null, zzfpvVar, null, null, z);
    }

    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcem zzcemVar, String str, String str2, Runnable runnable, final zzfpv zzfpvVar, final zzdyz zzdyzVar, final Long l, boolean z2) {
        zzfpi zzfpiVar;
        Exception exc;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzcemVar != null && !TextUtils.isEmpty(zzcemVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzcemVar.zzb() <= ((Long) zzba.zzc().zzd(zzbie.zzfb)).longValue() && zzcemVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfpi zzfpiVarZzn = zzfpi.CC.zzn(context, 4);
        zzfpiVarZzn.zza();
        zzbtw zzbtwVarZzb = zzt.zzr().zzb(this.zza, versionInfoParcel, zzfpvVar);
        zzbtq zzbtqVar = zzbtt.zza;
        zzbtm zzbtmVarZza = zzbtwVarZzb.zza("google.afma.config.fetchAppSettings", zzbtqVar, zzbtqVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbhv zzbhvVar = zzbie.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzba.zzc().zzd(zzbie.zzkS)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                ListenableFuture listenableFutureZzb = zzbtmVarZza.zzb(jSONObject);
                try {
                    zzhaq zzhaqVar = new zzhaq(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzf.zzd(l, zzdyzVar, zzfpiVarZzn, zzfpvVar, (JSONObject) obj);
                        }
                    };
                    zzfpiVar = zzfpiVarZzn;
                    try {
                        zzhbs zzhbsVar = zzcff.zzh;
                        ListenableFuture listenableFutureZzj = zzhbi.zzj(listenableFutureZzb, zzhaqVar, zzhbsVar);
                        if (runnable != null) {
                            listenableFutureZzb.addListener(runnable, zzhbsVar);
                        }
                        if (l != null) {
                            listenableFutureZzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzf.zzf(zzdyzVar, "cld_r", zzt.zzk().elapsedRealtime() - l.longValue());
                                }
                            }, zzhbsVar);
                        }
                        if (((Boolean) zzba.zzc().zzd(zzbie.zziG)).booleanValue()) {
                            zzcfi.zzb(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            zzcfi.zza(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings", zzhbsVar);
                        }
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                        zzfpiVar.zzj(exc);
                        zzfpiVar.zzd(false);
                        zzfpvVar.zzb(zzfpiVar.zzm());
                    }
                } catch (Exception e2) {
                    e = e2;
                    zzfpiVar = zzfpiVarZzn;
                }
            } catch (Exception e3) {
                exc = e3;
                zzfpiVar = zzfpiVarZzn;
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzfpiVar.zzj(exc);
                zzfpiVar.zzd(false);
                zzfpvVar.zzb(zzfpiVar.zzm());
            }
        } catch (Exception e4) {
            e = e4;
            zzfpiVar = zzfpiVarZzn;
        }
    }
}
