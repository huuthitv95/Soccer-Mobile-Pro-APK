package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcga implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcgf zzc;

    zzcga(zzcgf zzcgfVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        Objects.requireNonNull(zzcgfVar);
        this.zzc = zzcgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgf zzcgfVar = this.zzc;
        if (zzcgfVar.zzt() != null) {
            zzcgfVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
