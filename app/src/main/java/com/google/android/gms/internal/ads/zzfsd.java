package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfsd implements zzbey {
    final /* synthetic */ zzfse zza;

    zzfsd(zzfse zzfseVar) {
        Objects.requireNonNull(zzfseVar);
        this.zza = zzfseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzz)).booleanValue()) {
            this.zza.zzl(z);
        }
    }
}
