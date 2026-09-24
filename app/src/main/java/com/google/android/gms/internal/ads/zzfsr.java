package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfsr implements zzbey {
    final /* synthetic */ zzfst zza;

    zzfsr(zzfst zzfstVar) {
        Objects.requireNonNull(zzfstVar);
        this.zza = zzfstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzz)).booleanValue()) {
            this.zza.zzj(z);
        }
    }
}
