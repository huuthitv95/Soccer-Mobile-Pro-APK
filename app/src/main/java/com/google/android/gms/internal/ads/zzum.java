package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzum implements zzvb {
    private final MediaCodec zza;
    private final zzur zzb;
    private final zzvc zzc;
    private final zzux zzd;
    private boolean zze;
    private int zzf = 0;

    /* synthetic */ zzum(MediaCodec mediaCodec, HandlerThread handlerThread, zzvc zzvcVar, zzux zzuxVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zzur(handlerThread);
        this.zzc = zzvcVar;
        this.zzd = zzuxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzw(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzb(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzb(int i, int i2, zzim zzimVar, long j, int i3) {
        this.zzc.zzc(i, 0, zzimVar, j, i3);
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
        this.zzc.zzg();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zze(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final MediaFormat zzg() {
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final ByteBuffer zzh(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzi(final Runnable runnable) {
        this.zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzui
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzs(runnable);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final ByteBuffer zzj(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzk() {
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzg();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzl() {
        zzux zzuxVar;
        zzux zzuxVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                        this.zza.stop();
                    }
                    if (Build.VERSION.SDK_INT >= 35 && (zzuxVar2 = this.zzd) != null) {
                        zzuxVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzuxVar = this.zzd) != null) {
                zzuxVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final boolean zzm(zzva zzvaVar) {
        this.zzb.zzh(zzvaVar);
        return true;
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
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }

    final /* synthetic */ void zzs(Runnable runnable) {
        this.zzc.zzg();
        this.zzb.zzc(runnable);
    }

    final /* synthetic */ void zzt(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzux zzuxVar;
        zzur zzurVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zzurVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzuxVar = this.zzd) != null) {
            zzuxVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
