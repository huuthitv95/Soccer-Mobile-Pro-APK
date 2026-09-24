package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfob {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfoc zzd;

    zzfob(zzfoc zzfocVar, Runnable runnable, long j) {
        Objects.requireNonNull(zzfocVar);
        this.zzd = zzfocVar;
        this.zza = runnable;
        this.zzb = j;
    }
}
