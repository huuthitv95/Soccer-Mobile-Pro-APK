package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyy {
    final /* synthetic */ zzdyz zza;
    private final Map zzb;

    zzdyy(zzdyz zzdyzVar) {
        Objects.requireNonNull(zzdyzVar);
        this.zza = zzdyzVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdyy zza(zzfjw zzfjwVar) {
        zzc("gqi", zzfjwVar.zzb);
        return this;
    }

    public final zzdyy zzb(zzfjt zzfjtVar) {
        zzc("aai", zzfjtVar.zzw);
        zzc(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, zzfjtVar.zzan);
        zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfjt.zza(zzfjtVar.zzb));
        return this;
    }

    public final zzdyy zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpH)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzdyz zzdyzVar = this.zza;
        return zzdyzVar.zzc().zze(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    final /* synthetic */ void zzh() {
        this.zza.zzc().zzb(this.zzb);
    }

    final /* synthetic */ void zzi() {
        this.zza.zzc().zzf(this.zzb);
    }

    final /* synthetic */ zzdyy zzj() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
