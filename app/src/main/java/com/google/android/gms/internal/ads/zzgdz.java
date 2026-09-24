package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdz implements zzgdu {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    zzgdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zza(Runnable runnable, long j) {
        this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zzb() {
    }
}
