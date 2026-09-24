package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbbq implements Runnable {
    final /* synthetic */ zzbbs zza;

    zzbbq(zzbbs zzbbsVar) {
        Objects.requireNonNull(zzbbsVar);
        this.zza = zzbbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
