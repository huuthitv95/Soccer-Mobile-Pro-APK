package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfte implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    final /* synthetic */ zzftl zzb;

    zzfte(zzftl zzftlVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        Objects.requireNonNull(zzftlVar);
        this.zzb = zzftlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzE(this.zza);
    }
}
