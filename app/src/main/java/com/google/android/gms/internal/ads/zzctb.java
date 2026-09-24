package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzctb implements zzdci {
    private final zzfjw zza;
    private final zzfke zzb;
    private final zzfrk zzc;
    private final zzfro zzd;

    public zzctb(zzfke zzfkeVar, zzfro zzfroVar, zzfrk zzfrkVar) {
        this.zzb = zzfkeVar;
        this.zzd = zzfroVar;
        this.zzc = zzfrkVar;
        this.zza = zzfkeVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}
