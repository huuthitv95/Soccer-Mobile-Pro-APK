package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzczj implements zzdia, zzddt {
    private final Clock zza;
    private final zzczl zzb;
    private final zzfkm zzc;
    private final String zzd;

    zzczj(Clock clock, zzczl zzczlVar, zzfkm zzfkmVar, String str) {
        this.zza = clock;
        this.zzb = zzczlVar;
        this.zzc = zzfkmVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdia
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
