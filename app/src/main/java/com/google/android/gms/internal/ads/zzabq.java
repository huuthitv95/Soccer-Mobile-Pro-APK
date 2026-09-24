package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzabq extends Handler implements Runnable {
    final /* synthetic */ zzabv zza;
    private final zzabr zzb;
    private final long zzc;
    private zzabn zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzabq(zzabv zzabvVar, Looper looper, zzabr zzabrVar, zzabn zzabnVar, int i, long j) {
        super(looper);
        Objects.requireNonNull(zzabvVar);
        this.zza = zzabvVar;
        this.zzb = zzabrVar;
        this.zzd = zzabnVar;
        this.zzc = j;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzabn zzabnVar = this.zzd;
        zzabnVar.getClass();
        zzabnVar.zzC(this.zzb, jElapsedRealtime, j, this.zzf);
        this.zze = null;
        zzabv zzabvVar = this.zza;
        zzabq zzabqVarZzj = zzabvVar.zzj();
        zzabqVarZzj.getClass();
        zzabvVar.zzi().execute(zzabqVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 1) {
            zzd();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        zzabv zzabvVar = this.zza;
        zzabvVar.zzk(null);
        long j = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        zzabn zzabnVar = this.zzd;
        zzabnVar.getClass();
        if (this.zzh) {
            zzabnVar.zzA(this.zzb, jElapsedRealtime, j2, false);
            return;
        }
        int i = message.what;
        if (i == 2) {
            try {
                zzabnVar.zzB(this.zzb, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                zzef.zzf("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzl(new zzabu(e));
                return;
            }
        }
        if (i != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i2 = this.zzf + 1;
        this.zzf = i2;
        zzabp zzabpVarZzz = zzabnVar.zzz(this.zzb, jElapsedRealtime, j2, iOException, i2);
        if (zzabpVarZzz.zzb() == 3) {
            zzabvVar.zzl(this.zze);
        } else if (zzabpVarZzz.zzb() != 2) {
            if (zzabpVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzabpVarZzz.zzc() != -9223372036854775807L ? zzabpVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z) {
                zzabr zzabrVar = this.zzb;
                String simpleName = zzabrVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    zzabrVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.zzi) {
                return;
            }
            zzef.zzf("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new zzabu(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.zzi) {
                return;
            }
            zzef.zzf("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new zzabu(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.zzi) {
                zzef.zzf("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void zza(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        zzabv zzabvVar = this.zza;
        zzgsw.zzi(zzabvVar.zzj() == null);
        zzabvVar.zzk(this);
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzb();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzabn zzabnVar = this.zzd;
            zzabnVar.getClass();
            zzabnVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
