package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedm {
    zzbzo zza;
    zzbzo zzb;
    private final Context zzc;
    private final zzedj zzd;
    private final zzdyz zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;

    zzedm(zzedj zzedjVar, zzdyz zzdyzVar, Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzedjVar;
        this.zze = zzdyzVar;
        this.zzc = context;
        this.zzf = zzgVar;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            zzedj zzedjVar = this.zzd;
            zzedjVar.zza();
            zzedjVar.zzb(new zzedl(this));
        } catch (Exception e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfQ)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzbzm.zzc(this.zzc);
                }
                this.zzb.zzh(e, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzbzm.zza(this.zzc);
                }
                this.zza.zzh(e, "InstallReferrer.initializeAndReport");
            }
        }
    }

    final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    final /* synthetic */ zzedj zzc() {
        return this.zzd;
    }

    final /* synthetic */ zzdyz zzd() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.zzg zze() {
        return this.zzf;
    }
}
