package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzasr extends Thread {
    private final BlockingQueue zza;
    private final zzasq zzb;
    private final zzash zzc;
    private volatile boolean zzd = false;
    private final zzaso zze;

    public zzasr(BlockingQueue blockingQueue, zzasq zzasqVar, zzash zzashVar, zzaso zzasoVar) {
        this.zza = blockingQueue;
        this.zzb = zzasqVar;
        this.zzc = zzashVar;
        this.zze = zzasoVar;
    }

    private void zzb() throws InterruptedException {
        zzasx zzasxVar = (zzasx) this.zza.take();
        SystemClock.elapsedRealtime();
        zzasxVar.zze(3);
        try {
            try {
                try {
                    zzasxVar.zzc("network-queue-take");
                    zzasxVar.zzl();
                    TrafficStats.setThreadStatsTag(zzasxVar.zzb());
                    zzast zzastVarZza = this.zzb.zza(zzasxVar);
                    zzasxVar.zzc("network-http-complete");
                    if (zzastVarZza.zze && zzasxVar.zzq()) {
                        zzasxVar.zzd("not-modified");
                        zzasxVar.zzw();
                    } else {
                        zzatd zzatdVarZzr = zzasxVar.zzr(zzastVarZza);
                        zzasxVar.zzc("network-parse-complete");
                        zzasg zzasgVar = zzatdVarZzr.zzb;
                        if (zzasgVar != null) {
                            this.zzc.zzb(zzasxVar.zzi(), zzasgVar);
                            zzasxVar.zzc("network-cache-written");
                        }
                        zzasxVar.zzp();
                        this.zze.zza(zzasxVar, zzatdVarZzr, null);
                        zzasxVar.zzv(zzatdVarZzr);
                    }
                } catch (Exception e) {
                    zzatj.zzd(e, "Unhandled exception %s", e.toString());
                    zzatg zzatgVar = new zzatg(e);
                    SystemClock.elapsedRealtime();
                    this.zze.zzb(zzasxVar, zzatgVar);
                    zzasxVar.zzw();
                }
            } catch (zzatg e2) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzasxVar, e2);
                zzasxVar.zzw();
            }
        } finally {
            zzasxVar.zze(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzatj.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
