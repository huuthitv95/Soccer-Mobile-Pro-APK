package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzepx implements zzdnc {
    final /* synthetic */ zzelj zza;
    final /* synthetic */ zzfjt zzb;

    zzepx(zzepz zzepzVar, zzelj zzeljVar, zzfjt zzfjtVar) {
        this.zza = zzeljVar;
        this.zzb = zzfjtVar;
        Objects.requireNonNull(zzepzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) throws zzdnb {
        try {
            zzflk zzflkVar = (zzflk) this.zza.zzb;
            zzflkVar.zzs(z);
            zzflkVar.zzm();
        } catch (zzfkt e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot show rewarded video.", e);
            throw new zzdnb(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzb;
    }
}
