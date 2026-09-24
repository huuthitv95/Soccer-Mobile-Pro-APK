package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzftc implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zza;
    final /* synthetic */ zzftl zzb;

    zzftc(zzftl zzftlVar, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = zzdxVar;
        Objects.requireNonNull(zzftlVar);
        this.zzb = zzftlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzF(this.zza);
    }
}
