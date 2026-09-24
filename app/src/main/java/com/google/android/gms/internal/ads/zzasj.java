package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzasj extends Thread {
    private static final boolean zza = zzatj.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzash zzd;
    private volatile boolean zze = false;
    private final zzatk zzf;
    private final zzaso zzg;

    public zzasj(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzash zzashVar, zzaso zzasoVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzashVar;
        this.zzg = zzasoVar;
        this.zzf = new zzatk(this, blockingQueue2, zzasoVar);
    }

    private void zzc() throws InterruptedException {
        zzasx zzasxVar = (zzasx) this.zzb.take();
        zzasxVar.zzc("cache-queue-take");
        zzasxVar.zze(1);
        try {
            zzasxVar.zzl();
            zzash zzashVar = this.zzd;
            zzasg zzasgVarZza = zzashVar.zza(zzasxVar.zzi());
            if (zzasgVarZza == null) {
                zzasxVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzasxVar)) {
                    this.zzc.put(zzasxVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzasgVarZza.zza(jCurrentTimeMillis)) {
                    zzasxVar.zzc("cache-hit-expired");
                    zzasxVar.zzj(zzasgVarZza);
                    if (!this.zzf.zzc(zzasxVar)) {
                        this.zzc.put(zzasxVar);
                    }
                } else {
                    zzasxVar.zzc("cache-hit");
                    zzatd zzatdVarZzr = zzasxVar.zzr(new zzast(zzasgVarZza.zza, zzasgVarZza.zzg));
                    zzasxVar.zzc("cache-hit-parsed");
                    if (!zzatdVarZzr.zzc()) {
                        zzasxVar.zzc("cache-parsing-failed");
                        zzashVar.zzd(zzasxVar.zzi(), true);
                        zzasxVar.zzj(null);
                        if (!this.zzf.zzc(zzasxVar)) {
                            this.zzc.put(zzasxVar);
                        }
                    } else if (zzasgVarZza.zzf < jCurrentTimeMillis) {
                        zzasxVar.zzc("cache-hit-refresh-needed");
                        zzasxVar.zzj(zzasgVarZza);
                        zzatdVarZzr.zzd = true;
                        if (this.zzf.zzc(zzasxVar)) {
                            this.zzg.zza(zzasxVar, zzatdVarZzr, null);
                        } else {
                            this.zzg.zza(zzasxVar, zzatdVarZzr, new zzasi(this, zzasxVar));
                        }
                    } else {
                        this.zzg.zza(zzasxVar, zzatdVarZzr, null);
                    }
                }
            }
        } finally {
            zzasxVar.zze(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzatj.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzatj.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
