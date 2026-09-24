package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeie {
    private final zzcak zza;

    zzeie(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    public final void zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziG)).booleanValue()) {
            zzcfi.zzb(listenableFutureZza, "persistFlags");
        } else {
            zzcfi.zza(listenableFutureZza, "persistFlags", zzcff.zzh);
        }
    }
}
