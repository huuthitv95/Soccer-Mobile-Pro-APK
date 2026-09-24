package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzsn extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzsp zza;

    zzsn(zzsp zzspVar) {
        Objects.requireNonNull(zzspVar);
        this.zza = zzspVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzee zzeeVarZzu = this.zza.zza.zzu();
        zzeeVarZzu.zze(-1, zzsm.zza);
        zzeeVarZzu.zzf();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzee zzeeVarZzu = this.zza.zza.zzu();
        zzeeVarZzu.zze(-1, zzsk.zza);
        zzeeVarZzu.zzf();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzee zzeeVarZzu = this.zza.zza.zzu();
        zzeeVarZzu.zze(-1, zzsl.zza);
        zzeeVarZzu.zzf();
    }
}
