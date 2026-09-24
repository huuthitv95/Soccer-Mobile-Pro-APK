package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzftb implements Runnable {
    final /* synthetic */ zzftl zza;

    zzftb(zzftl zzftlVar) {
        Objects.requireNonNull(zzftlVar);
        this.zza = zzftlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzu();
    }
}
