package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzekz {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfjt zzc;
    private final zzcki zzd;
    private final zzdyz zze;
    private zzfug zzf;

    zzekz(Context context, VersionInfoParcel versionInfoParcel, zzfjt zzfjtVar, zzcki zzckiVar, zzdyz zzdyzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfjtVar;
        this.zzd = zzckiVar;
        this.zze = zzdyzVar;
    }

    public final synchronized boolean zza(boolean z) {
        zzcki zzckiVar;
        zzfjt zzfjtVar = this.zzc;
        if (zzfjtVar.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && (zzckiVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfjtVar.zzV.zzb()) {
                        zzfug zzfugVarZzi = com.google.android.gms.ads.internal.zzt.zzu().zzi(this.zzb, zzckiVar.zzD(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgo)).booleanValue()) {
                            zzdyz zzdyzVar = this.zze;
                            String str = zzfugVarZzi != null ? "1" : "0";
                            zzdyy zzdyyVarZza = zzdyzVar.zza();
                            zzdyyVarZza.zzc("omid_js_session_success", str);
                            zzdyyVarZza.zzd();
                        }
                        if (zzfugVarZzi == null) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Created omid javascript session service.");
                        this.zzf = zzfugVarZzi;
                        zzckiVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzcki zzckiVar;
        zzfug zzfugVar = this.zzf;
        if (zzfugVar == null || (zzckiVar = this.zzd) == null) {
            return;
        }
        Iterator it = zzckiVar.zzF().iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfugVar, (View) it.next());
        }
        zzckiVar.zze("onSdkLoaded", zzgwc.zza());
    }

    public final synchronized void zzd() {
        zzcki zzckiVar;
        if (this.zzf == null || (zzckiVar = this.zzd) == null) {
            return;
        }
        zzckiVar.zze("onSdkImpression", zzgwc.zza());
    }

    public final synchronized void zze(zzfuf zzfufVar) {
        zzcki zzckiVar;
        zzfug zzfugVar = this.zzf;
        if (zzfugVar == null || (zzckiVar = this.zzd) == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzj(zzfugVar, zzfufVar);
        this.zzf = null;
        zzckiVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzfug zzfugVar = this.zzf;
        if (zzfugVar != null) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfugVar, view);
        }
    }
}
