package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbso implements zzbpe {
    final /* synthetic */ zzbsd zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv zzb;
    final /* synthetic */ zzbti zzc;

    zzbso(zzbti zzbtiVar, zzbai zzbaiVar, zzbsd zzbsdVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.zza = zzbsdVar;
        this.zzb = zzbvVar;
        Objects.requireNonNull(zzbtiVar);
        this.zzc = zzbtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbti zzbtiVar = this.zzc;
        synchronized (zzbtiVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzo.zzh("JS Engine is requesting an update");
            if (zzbtiVar.zzk() == 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Starting reload.");
                zzbtiVar.zzl(2);
                zzbtiVar.zza(null);
            }
            this.zza.zzn("/requestReload", (zzbpe) this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
