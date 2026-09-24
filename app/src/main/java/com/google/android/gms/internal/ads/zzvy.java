package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvy implements zzvb {
    private final MediaCodec zza;
    private final zzux zzb;

    /* synthetic */ zzvy(MediaCodec mediaCodec, zzux zzuxVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzuxVar;
        if (Build.VERSION.SDK_INT < 35 || zzuxVar == null) {
            return;
        }
        zzuxVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzb(int i, int i2, zzim zzimVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzimVar.zzb(), j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzc(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzd(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public /* synthetic */ void zzi(Runnable runnable) {
        runnable.run();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final ByteBuffer zzj(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzl() {
        zzux zzuxVar;
        try {
            if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                this.zza.stop();
            }
            if (Build.VERSION.SDK_INT >= 35 && this.zzb != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (zzuxVar = this.zzb) != null) {
                zzuxVar.zzc(this.zza);
            }
            this.zza.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public /* synthetic */ boolean zzm(zzva zzvaVar) {
        return zzvb.CC.$default$zzm(this, zzvaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }
}
