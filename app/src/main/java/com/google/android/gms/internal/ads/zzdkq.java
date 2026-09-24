package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdkq {
    private final List zza;
    private final zzfro zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzdkq(zzfjt zzfjtVar, zzfro zzfroVar) {
        this.zza = zzfjtVar.zzp;
        this.zzb = zzfroVar;
        this.zzc = zzfjtVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}
