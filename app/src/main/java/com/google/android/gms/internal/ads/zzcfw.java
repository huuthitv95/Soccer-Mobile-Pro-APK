package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcfw implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcgf zzb;

    zzcfw(zzcgf zzcgfVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcgfVar);
        this.zzb = zzcgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgf zzcgfVar = this.zzb;
        zzcgfVar.zzs(this.zza);
        if (zzcgfVar.zzt() != null) {
            zzcgfVar.zzt().zzb();
        }
    }
}
