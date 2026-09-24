package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcgv {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzas)).longValue());
    private boolean zzc = true;

    zzcgv() {
    }

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, final zzcgg zzcggVar) {
        if (zzcggVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        zzfzw zzfzwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcggVar);
        zzfzwVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcggVar.zzi();
            }
        });
    }
}
