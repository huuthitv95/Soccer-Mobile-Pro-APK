package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzelu implements zzdnc {
    final /* synthetic */ zzelj zza;
    final /* synthetic */ zzfjt zzb;

    zzelu(zzelv zzelvVar, zzelj zzeljVar, zzfjt zzfjtVar) {
        this.zza = zzeljVar;
        this.zzb = zzfjtVar;
        Objects.requireNonNull(zzelvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) throws zzdnb {
        try {
            zzflk zzflkVar = (zzflk) this.zza.zzb;
            zzflkVar.zzs(z);
            zzflkVar.zzz(context);
        } catch (zzfkt e) {
            throw new zzdnb(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzb;
    }
}
