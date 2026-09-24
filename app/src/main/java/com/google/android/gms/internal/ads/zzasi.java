package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzasi implements Runnable {
    final /* synthetic */ zzasx zza;
    final /* synthetic */ zzasj zzb;

    zzasi(zzasj zzasjVar, zzasx zzasxVar) {
        this.zza = zzasxVar;
        Objects.requireNonNull(zzasjVar);
        this.zzb = zzasjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
