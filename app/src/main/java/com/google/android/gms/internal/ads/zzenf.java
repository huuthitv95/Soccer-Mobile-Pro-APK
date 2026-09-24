package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzenf implements zzdnc {
    final /* synthetic */ zzelj zza;
    final /* synthetic */ zzfjt zzb;
    final /* synthetic */ zzeng zzc;

    zzenf(zzeng zzengVar, zzelj zzeljVar, zzfjt zzfjtVar) {
        this.zza = zzeljVar;
        this.zzb = zzfjtVar;
        Objects.requireNonNull(zzengVar);
        this.zzc = zzengVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) throws zzdnb {
        try {
            zzflk zzflkVar = (zzflk) this.zza.zzb;
            zzflkVar.zzs(z);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbt)).intValue()) {
                zzflkVar.zzd();
            } else {
                zzflkVar.zze(context);
            }
        } catch (zzfkt e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdnb(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzb;
    }
}
