package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfum implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfun zzb;

    zzfum(zzfun zzfunVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfunVar);
        this.zzb = zzfunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
