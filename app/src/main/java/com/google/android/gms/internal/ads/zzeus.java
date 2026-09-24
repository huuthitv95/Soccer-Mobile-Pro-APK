package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeus {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeur zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzeur zzeurVar) {
        this.zzb = zzeurVar;
    }

    final zzeur zzd() {
        return this.zzb;
    }
}
