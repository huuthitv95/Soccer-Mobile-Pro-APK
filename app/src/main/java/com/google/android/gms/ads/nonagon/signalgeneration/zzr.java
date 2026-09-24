package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdky;
import com.google.android.gms.internal.ads.zzdyu;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr implements zzdky {
    private final zzdyu zza;
    private final zzq zzb;
    private final String zzc;

    public zzr(zzdyu zzdyuVar, zzq zzqVar, String str) {
        this.zza = zzdyuVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzd(zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zze(String str) {
    }
}
