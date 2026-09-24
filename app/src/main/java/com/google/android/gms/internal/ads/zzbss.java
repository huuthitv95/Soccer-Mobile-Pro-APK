package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbss implements zzcfm {
    final /* synthetic */ zzbth zza;
    final /* synthetic */ zzfpi zzb;
    final /* synthetic */ zzbti zzc;

    zzbss(zzbti zzbtiVar, zzbth zzbthVar, zzfpi zzfpiVar) {
        this.zza = zzbthVar;
        this.zzb = zzfpiVar;
        Objects.requireNonNull(zzbtiVar);
        this.zzc = zzbtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbti zzbtiVar = this.zzc;
        synchronized (zzbtiVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            zzbtiVar.zzl(1);
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzc();
            if (((Boolean) zzbjx.zzd.zze()).booleanValue() && zzbtiVar.zzh() != null) {
                zzfpv zzfpvVarZzh = zzbtiVar.zzh();
                zzfpi zzfpiVar = this.zzb;
                zzfpiVar.zzk("Failed loading new engine");
                zzfpiVar.zzd(false);
                zzfpvVarZzh.zzb(zzfpiVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
