package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbqz implements Runnable {
    final /* synthetic */ zzbrc zza;

    zzbqz(zzbrc zzbrcVar) {
        Objects.requireNonNull(zzbrcVar);
        this.zza = zzbrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
