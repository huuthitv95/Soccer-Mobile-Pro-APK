package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbsr implements zzcfo {
    final /* synthetic */ zzbth zza;
    final /* synthetic */ zzfpi zzb;
    final /* synthetic */ zzbti zzc;

    zzbsr(zzbti zzbtiVar, zzbth zzbthVar, zzfpi zzfpiVar) {
        this.zza = zzbthVar;
        this.zzb = zzfpiVar;
        Objects.requireNonNull(zzbtiVar);
        this.zzc = zzbtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbti zzbtiVar = this.zzc;
        synchronized (zzbtiVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            zzbtiVar.zzl(0);
            if (zzbtiVar.zzi() != null && this.zza != zzbtiVar.zzi()) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                zzbtiVar.zzi().zzc();
            }
            zzbtiVar.zzj(this.zza);
            if (((Boolean) zzbjx.zzd.zze()).booleanValue() && zzbtiVar.zzh() != null) {
                zzfpv zzfpvVarZzh = zzbtiVar.zzh();
                zzfpi zzfpiVar = this.zzb;
                zzfpiVar.zzd(true);
                zzfpvVarZzh.zzb(zzfpiVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
