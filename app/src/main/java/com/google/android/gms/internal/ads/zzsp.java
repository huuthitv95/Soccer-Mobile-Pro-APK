package com.google.android.gms.internal.ads;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzsp {
    final /* synthetic */ zzsq zza;
    private final Handler zzb;
    private final AudioTrack$StreamEventCallback zzc;

    /* synthetic */ zzsp(zzsq zzsqVar, byte[] bArr) {
        Objects.requireNonNull(zzsqVar);
        this.zza = zzsqVar;
        final Handler handlerZzd = zzfk.zzd(null);
        this.zzb = handlerZzd;
        zzsn zzsnVar = new zzsn(this);
        this.zzc = zzsnVar;
        Objects.requireNonNull(handlerZzd);
        zzsqVar.zzt().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzso
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handlerZzd.post(runnable);
            }
        }, zzsnVar);
    }

    final /* synthetic */ void zza() {
        this.zza.zzt().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
