package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzup implements zzvc {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdr zzg;
    private boolean zzh;

    public zzup(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdr zzdrVar = new zzdr(zzdo.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdrVar;
        this.zzf = new AtomicReference();
    }

    private static zzuo zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzuo();
            }
            return (zzuo) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzun(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        zzg();
        zzuo zzuoVarZzi = zzi();
        zzuoVarZzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        String str = zzfk.zza;
        handler.obtainMessage(1, zzuoVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzc(int i, int i2, zzim zzimVar, long j, int i3) {
        zzg();
        zzuo zzuoVarZzi = zzi();
        zzuoVarZzi.zza(i, 0, 0, j, i3);
        MediaCodec.CryptoInfo cryptoInfo = zzuoVarZzi.zzd;
        cryptoInfo.numSubSamples = zzimVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzimVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzimVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzimVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzimVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzimVar.zzc;
        if (Build.VERSION.SDK_INT >= 24) {
            FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m469m();
            cryptoInfo.setPattern(Util$$ExternalSyntheticApiModelOutline0.m320m(zzimVar.zzg, zzimVar.zzh));
        }
        Handler handler = this.zze;
        String str = zzfk.zza;
        handler.obtainMessage(2, zzuoVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfk.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdr zzdrVar = this.zzg;
                zzdrVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdrVar.zzc();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ void zzh(Message message) {
        zzuo zzuoVar;
        ArrayDeque arrayDeque;
        int i = message.what;
        zzuo zzuoVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzuoVar = (zzuo) message.obj;
                int i2 = zzuoVar.zza;
                int i3 = zzuoVar.zzb;
                MediaCodec.CryptoInfo cryptoInfo = zzuoVar.zzd;
                long j = zzuoVar.zze;
                int i4 = zzuoVar.zzf;
                try {
                    synchronized (zzb) {
                        try {
                            this.zzc.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i4);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RuntimeException e) {
                    LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.zzf, null, e);
                }
            } else if (i == 3) {
                this.zzg.zza();
            } else if (i != 4) {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    this.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.zzf, null, e2);
                }
            }
            if (zzuoVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzuoVar2);
                }
            }
        }
        zzuoVar = (zzuo) message.obj;
        int i5 = zzuoVar.zza;
        int i6 = zzuoVar.zzb;
        try {
            this.zzc.queueInputBuffer(i5, 0, zzuoVar.zzc, zzuoVar.zze, zzuoVar.zzf);
        } catch (RuntimeException e3) {
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.zzf, null, e3);
        }
        zzuoVar2 = zzuoVar;
        if (zzuoVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzuoVar2);
            }
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
