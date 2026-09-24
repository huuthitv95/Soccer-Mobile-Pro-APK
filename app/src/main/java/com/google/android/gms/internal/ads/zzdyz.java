package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyz {
    private final zzdze zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdyz(zzdze zzdzeVar, Executor executor) {
        this.zza = zzdzeVar;
        this.zzc = zzdzeVar.zza();
        this.zzb = executor;
    }

    public final zzdyy zza() {
        zzdyy zzdyyVar = new zzdyy(this);
        zzdyyVar.zzj();
        return zzdyyVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzna)).booleanValue()) {
            zzdyy zzdyyVarZza = zza();
            zzdyyVarZza.zzc("action", "pecr");
            zzdyyVarZza.zzd();
        }
    }

    final /* synthetic */ zzdze zzc() {
        return this.zza;
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
