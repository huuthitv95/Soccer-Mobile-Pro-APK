package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgir {
    private final Context zza;
    private final zzgpu zzb;
    private final zzggn zzc;
    private final String zzd;

    zzgir(Context context, zzgpu zzgpuVar, zzggn zzggnVar, zzgco zzgcoVar) {
        this.zza = context;
        this.zzb = zzgpuVar;
        this.zzc = zzggnVar;
        this.zzd = zzgcoVar.zzd();
    }

    public final String zza(boolean z, long j) {
        zzgps zzgpsVarZza = this.zzb.zza(55);
        try {
            zzgpsVarZza.zza();
            zzayq zzayqVarZza = zzayr.zza();
            zzayqVarZza.zzb(this.zzd);
            zzayqVarZza.zza("0.869425873");
            Context context = this.zza;
            zzayqVarZza.zzd(context.getPackageName());
            zzayqVarZza.zzc(System.currentTimeMillis() / 1000);
            zzayqVarZza.zzf((System.currentTimeMillis() - j) / 1000);
            try {
                zzayqVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzayqVarZza.zze(-1L);
            }
            zzggn zzggnVar = this.zzc;
            if (!zzggnVar.zzc()) {
                zzggnVar.zza();
            }
            zzayx zzayxVarZzf = zzggnVar.zzf(((zzayr) zzayqVarZza.zzbu()).zzaN(), null);
            zzayxVarZzf.zzc(5);
            zzayxVarZzf.zzd(2);
            String strZza = zzgdj.zza(((zzayy) zzayxVarZzf.zzbu()).zzaN(), true);
            zzgpsVarZza.zzc();
            return strZza;
        } catch (Throwable th) {
            try {
                zzgpsVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgpsVarZza.zzc();
                throw th2;
            }
        }
    }
}
